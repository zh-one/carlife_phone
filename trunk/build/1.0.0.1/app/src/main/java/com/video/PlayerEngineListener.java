package com.video;

/**
 * Create by zheng on 2019/1/17
 */
public interface PlayerEngineListener {
	
	public void onTrackPlay(DlnaMediaModel itemInfo);

	public void onTrackStop(DlnaMediaModel itemInfo);
	
	public void onTrackPause(DlnaMediaModel itemInfo);	

	public void onTrackPrepareSync(DlnaMediaModel itemInfo);
	
	public void onTrackPrepareComplete(DlnaMediaModel itemInfo);
	
	public void onTrackStreamError(DlnaMediaModel itemInfo);
	
	public void onTrackPlayComplete(DlnaMediaModel itemInfo);
}
