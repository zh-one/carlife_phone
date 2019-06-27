// Generated by the protocol buffer compiler.  DO NOT EDIT!

package com.baidu.carlife.protobuf;

public final class CarlifeVideoEncoderInfoProto {
  private CarlifeVideoEncoderInfoProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class CarlifeVideoEncoderInfo extends
      com.google.protobuf.GeneratedMessage {
    // Use CarlifeVideoEncoderInfo.newBuilder() to construct.
    private CarlifeVideoEncoderInfo() {}
    
    private static final CarlifeVideoEncoderInfo defaultInstance = new CarlifeVideoEncoderInfo();
    public static CarlifeVideoEncoderInfo getDefaultInstance() {
      return defaultInstance;
    }
    
    public CarlifeVideoEncoderInfo getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.baidu.carlife.protobuf.CarlifeVideoEncoderInfoProto.internal_static_com_baidu_carlife_protobuf_CarlifeVideoEncoderInfo_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.baidu.carlife.protobuf.CarlifeVideoEncoderInfoProto.internal_static_com_baidu_carlife_protobuf_CarlifeVideoEncoderInfo_fieldAccessorTable;
    }
    
    // required int32 width = 1;
    public static final int WIDTH_FIELD_NUMBER = 1;
    private boolean hasWidth;
    private int width_ = 0;
    public boolean hasWidth() { return hasWidth; }
    public int getWidth() { return width_; }
    
    // required int32 height = 2;
    public static final int HEIGHT_FIELD_NUMBER = 2;
    private boolean hasHeight;
    private int height_ = 0;
    public boolean hasHeight() { return hasHeight; }
    public int getHeight() { return height_; }
    
    // required int32 frameRate = 3;
    public static final int FRAMERATE_FIELD_NUMBER = 3;
    private boolean hasFrameRate;
    private int frameRate_ = 0;
    public boolean hasFrameRate() { return hasFrameRate; }
    public int getFrameRate() { return frameRate_; }
    
    public final boolean isInitialized() {
      if (!hasWidth) return false;
      if (!hasHeight) return false;
      if (!hasFrameRate) return false;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (hasWidth()) {
        output.writeInt32(1, getWidth());
      }
      if (hasHeight()) {
        output.writeInt32(2, getHeight());
      }
      if (hasFrameRate()) {
        output.writeInt32(3, getFrameRate());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasWidth()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, getWidth());
      }
      if (hasHeight()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, getHeight());
      }
      if (hasFrameRate()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, getFrameRate());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static com.baidu.carlife.protobuf.CarlifeVideoEncoderInfoProto.CarlifeVideoEncoderInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.baidu.carlife.protobuf.CarlifeVideoEncoderInfoProto.CarlifeVideoEncoderInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.baidu.carlife.protobuf.CarlifeVideoEncoderInfoProto.CarlifeVideoEncoderInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.baidu.carlife.protobuf.CarlifeVideoEncoderInfoProto.CarlifeVideoEncoderInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.baidu.carlife.protobuf.CarlifeVideoEncoderInfoProto.CarlifeVideoEncoderInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.baidu.carlife.protobuf.CarlifeVideoEncoderInfoProto.CarlifeVideoEncoderInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.baidu.carlife.protobuf.CarlifeVideoEncoderInfoProto.CarlifeVideoEncoderInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeDelimitedFrom(input).buildParsed();
    }
    public static com.baidu.carlife.protobuf.CarlifeVideoEncoderInfoProto.CarlifeVideoEncoderInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeDelimitedFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.baidu.carlife.protobuf.CarlifeVideoEncoderInfoProto.CarlifeVideoEncoderInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.baidu.carlife.protobuf.CarlifeVideoEncoderInfoProto.CarlifeVideoEncoderInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.baidu.carlife.protobuf.CarlifeVideoEncoderInfoProto.CarlifeVideoEncoderInfo prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.baidu.carlife.protobuf.CarlifeVideoEncoderInfoProto.CarlifeVideoEncoderInfo result;
      
      // Construct using com.baidu.carlife.protobuf.CarlifeVideoEncoderInfoProto.CarlifeVideoEncoderInfo.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.baidu.carlife.protobuf.CarlifeVideoEncoderInfoProto.CarlifeVideoEncoderInfo();
        return builder;
      }
      
      protected com.baidu.carlife.protobuf.CarlifeVideoEncoderInfoProto.CarlifeVideoEncoderInfo internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.baidu.carlife.protobuf.CarlifeVideoEncoderInfoProto.CarlifeVideoEncoderInfo();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.baidu.carlife.protobuf.CarlifeVideoEncoderInfoProto.CarlifeVideoEncoderInfo.getDescriptor();
      }
      
      public com.baidu.carlife.protobuf.CarlifeVideoEncoderInfoProto.CarlifeVideoEncoderInfo getDefaultInstanceForType() {
        return com.baidu.carlife.protobuf.CarlifeVideoEncoderInfoProto.CarlifeVideoEncoderInfo.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.baidu.carlife.protobuf.CarlifeVideoEncoderInfoProto.CarlifeVideoEncoderInfo build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private com.baidu.carlife.protobuf.CarlifeVideoEncoderInfoProto.CarlifeVideoEncoderInfo buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public com.baidu.carlife.protobuf.CarlifeVideoEncoderInfoProto.CarlifeVideoEncoderInfo buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        com.baidu.carlife.protobuf.CarlifeVideoEncoderInfoProto.CarlifeVideoEncoderInfo returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.baidu.carlife.protobuf.CarlifeVideoEncoderInfoProto.CarlifeVideoEncoderInfo) {
          return mergeFrom((com.baidu.carlife.protobuf.CarlifeVideoEncoderInfoProto.CarlifeVideoEncoderInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.baidu.carlife.protobuf.CarlifeVideoEncoderInfoProto.CarlifeVideoEncoderInfo other) {
        if (other == com.baidu.carlife.protobuf.CarlifeVideoEncoderInfoProto.CarlifeVideoEncoderInfo.getDefaultInstance()) return this;
        if (other.hasWidth()) {
          setWidth(other.getWidth());
        }
        if (other.hasHeight()) {
          setHeight(other.getHeight());
        }
        if (other.hasFrameRate()) {
          setFrameRate(other.getFrameRate());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                return this;
              }
              break;
            }
            case 8: {
              setWidth(input.readInt32());
              break;
            }
            case 16: {
              setHeight(input.readInt32());
              break;
            }
            case 24: {
              setFrameRate(input.readInt32());
              break;
            }
          }
        }
      }
      
      
      // required int32 width = 1;
      public boolean hasWidth() {
        return result.hasWidth();
      }
      public int getWidth() {
        return result.getWidth();
      }
      public Builder setWidth(int value) {
        result.hasWidth = true;
        result.width_ = value;
        return this;
      }
      public Builder clearWidth() {
        result.hasWidth = false;
        result.width_ = 0;
        return this;
      }
      
      // required int32 height = 2;
      public boolean hasHeight() {
        return result.hasHeight();
      }
      public int getHeight() {
        return result.getHeight();
      }
      public Builder setHeight(int value) {
        result.hasHeight = true;
        result.height_ = value;
        return this;
      }
      public Builder clearHeight() {
        result.hasHeight = false;
        result.height_ = 0;
        return this;
      }
      
      // required int32 frameRate = 3;
      public boolean hasFrameRate() {
        return result.hasFrameRate();
      }
      public int getFrameRate() {
        return result.getFrameRate();
      }
      public Builder setFrameRate(int value) {
        result.hasFrameRate = true;
        result.frameRate_ = value;
        return this;
      }
      public Builder clearFrameRate() {
        result.hasFrameRate = false;
        result.frameRate_ = 0;
        return this;
      }
    }
    
    static {
      com.baidu.carlife.protobuf.CarlifeVideoEncoderInfoProto.getDescriptor();
    }
    
    static {
      com.baidu.carlife.protobuf.CarlifeVideoEncoderInfoProto.internalForceInit();
    }
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_baidu_carlife_protobuf_CarlifeVideoEncoderInfo_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_baidu_carlife_protobuf_CarlifeVideoEncoderInfo_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"CarlifeVideoEncoderInfoProto.proto\022\032co" +
      "m.baidu.carlife.protobuf\"K\n\027CarlifeVideo" +
      "EncoderInfo\022\r\n\005width\030\001 \002(\005\022\016\n\006height\030\002 \002" +
      "(\005\022\021\n\tframeRate\030\003 \002(\005"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_baidu_carlife_protobuf_CarlifeVideoEncoderInfo_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_baidu_carlife_protobuf_CarlifeVideoEncoderInfo_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_baidu_carlife_protobuf_CarlifeVideoEncoderInfo_descriptor,
              new java.lang.String[] { "Width", "Height", "FrameRate", },
              com.baidu.carlife.protobuf.CarlifeVideoEncoderInfoProto.CarlifeVideoEncoderInfo.class,
              com.baidu.carlife.protobuf.CarlifeVideoEncoderInfoProto.CarlifeVideoEncoderInfo.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  public static void internalForceInit() {}
}