package com.baidu.carlife.camera;

import android.content.Context;
import android.graphics.ImageFormat;
import android.hardware.Camera;
import android.util.Log;
import android.view.SurfaceHolder;
import com.baidu.carlife.util.LogUtil;
import java.util.concurrent.ArrayBlockingQueue;

public final class SurfaceViewCallback implements android.view.SurfaceHolder.Callback, android.hardware.Camera.PreviewCallback {

    Context context;
    static final String TAG = "Camera2";
    Camera2 camera2 = new Camera2();
    boolean previewing = camera2.getPreviewing();
    android.hardware.Camera mCamera;

    private int width = 1280;
    private int height = 720;

    private int framerate = 30;

    private int biterate = 1024 * 1024 * 4;

    private Camera.Parameters parameters;

    private static int yuvqueuesize = 100;

    public static ArrayBlockingQueue<byte[]> YUVQueue = new ArrayBlockingQueue<byte[]>(yuvqueuesize);

    private AvcEncoder avcCodec;

    public void setContext(Context context) {
        this.context = context;
    }

    public boolean startCamera() {
        if (mCamera != null) {
            mCamera.startPreview();
            return true;
        }
        return false;
    }

    public void stopCamera() {
        if (mCamera != null) {
            mCamera.stopPreview();
        }
    }

    public void surfaceChanged(SurfaceHolder holder, int arg1, int arg2, int arg3) {
        if (previewing) {
            mCamera.stopPreview();
            Log.i(TAG, "stopPreview");
        }
    }

    public void surfaceCreated(SurfaceHolder holder) {
        try {
            mCamera = camera2.initCamera();
            if (mCamera != null) {
                mCamera.setPreviewCallback(this);
                mCamera.setDisplayOrientation(90);
                if (parameters == null) {
                    parameters = mCamera.getParameters();
                }
                parameters = mCamera.getParameters();
                parameters.setPreviewFormat(ImageFormat.NV21);
                parameters.setPreviewSize(width, height);
                mCamera.setParameters(parameters);

                mCamera.setPreviewDisplay(holder);

//                mCamera.startPreview();
                Log.e(TAG, "startPreview");
                //setCameraDisplayOrientation(CarlifeActivity.this, mCurrentCamIndex, mCamera);

                Log.e(TAG, "context: " + context.toString());
                Log.e(TAG, "mCamera2: " + camera2.toString());
                Log.e(TAG, "mCamera: " + mCamera.toString());
                // Camera2.setCameraDisplayOrientation((Activity) context, camera2.getCurrentCamIndex(), mCamera);

                avcCodec = new AvcEncoder(width, height, framerate, biterate);
                avcCodec.StartEncoderThread();
            }
        } catch (Exception e) {
            Log.e(TAG, "Exception " + e.getMessage());
        }
    }

    public void surfaceDestroyed(SurfaceHolder holder) {
        if (mCamera != null) {
            camera2.StopCamera(mCamera);
            avcCodec.StopThread();
        }
    }

    public void putYUVData(byte[] buffer, int length) {
        LogUtil.e(TAG, "putYUVData " + length);
        if (YUVQueue.size() >= yuvqueuesize) {
            YUVQueue.poll();
        }
        YUVQueue.add(buffer);
    }

    @Override
    public void onPreviewFrame(byte[] data, android.hardware.Camera camera) {
        putYUVData(data, data.length);
    }
}