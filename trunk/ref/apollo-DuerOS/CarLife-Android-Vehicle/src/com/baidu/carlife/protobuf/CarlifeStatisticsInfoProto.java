// Generated by the protocol buffer compiler.  DO NOT EDIT!

package com.baidu.carlife.protobuf;

public final class CarlifeStatisticsInfoProto {
  private CarlifeStatisticsInfoProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class CarlifeStatisticsInfo extends
      com.google.protobuf.GeneratedMessage {
    // Use CarlifeStatisticsInfo.newBuilder() to construct.
    private CarlifeStatisticsInfo() {}
    
    private static final CarlifeStatisticsInfo defaultInstance = new CarlifeStatisticsInfo();
    public static CarlifeStatisticsInfo getDefaultInstance() {
      return defaultInstance;
    }
    
    public CarlifeStatisticsInfo getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.internal_static_com_baidu_carlife_protobuf_CarlifeStatisticsInfo_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.internal_static_com_baidu_carlife_protobuf_CarlifeStatisticsInfo_fieldAccessorTable;
    }
    
    // required string cuid = 1;
    public static final int CUID_FIELD_NUMBER = 1;
    private boolean hasCuid;
    private java.lang.String cuid_ = "";
    public boolean hasCuid() { return hasCuid; }
    public java.lang.String getCuid() { return cuid_; }
    
    // required string versionName = 2;
    public static final int VERSIONNAME_FIELD_NUMBER = 2;
    private boolean hasVersionName;
    private java.lang.String versionName_ = "";
    public boolean hasVersionName() { return hasVersionName; }
    public java.lang.String getVersionName() { return versionName_; }
    
    // required int32 versionCode = 3;
    public static final int VERSIONCODE_FIELD_NUMBER = 3;
    private boolean hasVersionCode;
    private int versionCode_ = 0;
    public boolean hasVersionCode() { return hasVersionCode; }
    public int getVersionCode() { return versionCode_; }
    
    // required string channel = 4;
    public static final int CHANNEL_FIELD_NUMBER = 4;
    private boolean hasChannel;
    private java.lang.String channel_ = "";
    public boolean hasChannel() { return hasChannel; }
    public java.lang.String getChannel() { return channel_; }
    
    // required int32 connectCount = 5;
    public static final int CONNECTCOUNT_FIELD_NUMBER = 5;
    private boolean hasConnectCount;
    private int connectCount_ = 0;
    public boolean hasConnectCount() { return hasConnectCount; }
    public int getConnectCount() { return connectCount_; }
    
    // required int32 connectSuccessCount = 6;
    public static final int CONNECTSUCCESSCOUNT_FIELD_NUMBER = 6;
    private boolean hasConnectSuccessCount;
    private int connectSuccessCount_ = 0;
    public boolean hasConnectSuccessCount() { return hasConnectSuccessCount; }
    public int getConnectSuccessCount() { return connectSuccessCount_; }
    
    // required int32 connectTime = 7;
    public static final int CONNECTTIME_FIELD_NUMBER = 7;
    private boolean hasConnectTime;
    private int connectTime_ = 0;
    public boolean hasConnectTime() { return hasConnectTime; }
    public int getConnectTime() { return connectTime_; }
    
    // optional string crashLog = 8;
    public static final int CRASHLOG_FIELD_NUMBER = 8;
    private boolean hasCrashLog;
    private java.lang.String crashLog_ = "";
    public boolean hasCrashLog() { return hasCrashLog; }
    public java.lang.String getCrashLog() { return crashLog_; }
    
    public final boolean isInitialized() {
      if (!hasCuid) return false;
      if (!hasVersionName) return false;
      if (!hasVersionCode) return false;
      if (!hasChannel) return false;
      if (!hasConnectCount) return false;
      if (!hasConnectSuccessCount) return false;
      if (!hasConnectTime) return false;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (hasCuid()) {
        output.writeString(1, getCuid());
      }
      if (hasVersionName()) {
        output.writeString(2, getVersionName());
      }
      if (hasVersionCode()) {
        output.writeInt32(3, getVersionCode());
      }
      if (hasChannel()) {
        output.writeString(4, getChannel());
      }
      if (hasConnectCount()) {
        output.writeInt32(5, getConnectCount());
      }
      if (hasConnectSuccessCount()) {
        output.writeInt32(6, getConnectSuccessCount());
      }
      if (hasConnectTime()) {
        output.writeInt32(7, getConnectTime());
      }
      if (hasCrashLog()) {
        output.writeString(8, getCrashLog());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasCuid()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(1, getCuid());
      }
      if (hasVersionName()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(2, getVersionName());
      }
      if (hasVersionCode()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, getVersionCode());
      }
      if (hasChannel()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(4, getChannel());
      }
      if (hasConnectCount()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, getConnectCount());
      }
      if (hasConnectSuccessCount()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, getConnectSuccessCount());
      }
      if (hasConnectTime()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(7, getConnectTime());
      }
      if (hasCrashLog()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(8, getCrashLog());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeDelimitedFrom(input).buildParsed();
    }
    public static com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeDelimitedFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfo prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfo result;
      
      // Construct using com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfo.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfo();
        return builder;
      }
      
      protected com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfo internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfo();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfo.getDescriptor();
      }
      
      public com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfo getDefaultInstanceForType() {
        return com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfo.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfo build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfo buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfo buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfo returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfo) {
          return mergeFrom((com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfo other) {
        if (other == com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfo.getDefaultInstance()) return this;
        if (other.hasCuid()) {
          setCuid(other.getCuid());
        }
        if (other.hasVersionName()) {
          setVersionName(other.getVersionName());
        }
        if (other.hasVersionCode()) {
          setVersionCode(other.getVersionCode());
        }
        if (other.hasChannel()) {
          setChannel(other.getChannel());
        }
        if (other.hasConnectCount()) {
          setConnectCount(other.getConnectCount());
        }
        if (other.hasConnectSuccessCount()) {
          setConnectSuccessCount(other.getConnectSuccessCount());
        }
        if (other.hasConnectTime()) {
          setConnectTime(other.getConnectTime());
        }
        if (other.hasCrashLog()) {
          setCrashLog(other.getCrashLog());
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
            case 10: {
              setCuid(input.readString());
              break;
            }
            case 18: {
              setVersionName(input.readString());
              break;
            }
            case 24: {
              setVersionCode(input.readInt32());
              break;
            }
            case 34: {
              setChannel(input.readString());
              break;
            }
            case 40: {
              setConnectCount(input.readInt32());
              break;
            }
            case 48: {
              setConnectSuccessCount(input.readInt32());
              break;
            }
            case 56: {
              setConnectTime(input.readInt32());
              break;
            }
            case 66: {
              setCrashLog(input.readString());
              break;
            }
          }
        }
      }
      
      
      // required string cuid = 1;
      public boolean hasCuid() {
        return result.hasCuid();
      }
      public java.lang.String getCuid() {
        return result.getCuid();
      }
      public Builder setCuid(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasCuid = true;
        result.cuid_ = value;
        return this;
      }
      public Builder clearCuid() {
        result.hasCuid = false;
        result.cuid_ = getDefaultInstance().getCuid();
        return this;
      }
      
      // required string versionName = 2;
      public boolean hasVersionName() {
        return result.hasVersionName();
      }
      public java.lang.String getVersionName() {
        return result.getVersionName();
      }
      public Builder setVersionName(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasVersionName = true;
        result.versionName_ = value;
        return this;
      }
      public Builder clearVersionName() {
        result.hasVersionName = false;
        result.versionName_ = getDefaultInstance().getVersionName();
        return this;
      }
      
      // required int32 versionCode = 3;
      public boolean hasVersionCode() {
        return result.hasVersionCode();
      }
      public int getVersionCode() {
        return result.getVersionCode();
      }
      public Builder setVersionCode(int value) {
        result.hasVersionCode = true;
        result.versionCode_ = value;
        return this;
      }
      public Builder clearVersionCode() {
        result.hasVersionCode = false;
        result.versionCode_ = 0;
        return this;
      }
      
      // required string channel = 4;
      public boolean hasChannel() {
        return result.hasChannel();
      }
      public java.lang.String getChannel() {
        return result.getChannel();
      }
      public Builder setChannel(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasChannel = true;
        result.channel_ = value;
        return this;
      }
      public Builder clearChannel() {
        result.hasChannel = false;
        result.channel_ = getDefaultInstance().getChannel();
        return this;
      }
      
      // required int32 connectCount = 5;
      public boolean hasConnectCount() {
        return result.hasConnectCount();
      }
      public int getConnectCount() {
        return result.getConnectCount();
      }
      public Builder setConnectCount(int value) {
        result.hasConnectCount = true;
        result.connectCount_ = value;
        return this;
      }
      public Builder clearConnectCount() {
        result.hasConnectCount = false;
        result.connectCount_ = 0;
        return this;
      }
      
      // required int32 connectSuccessCount = 6;
      public boolean hasConnectSuccessCount() {
        return result.hasConnectSuccessCount();
      }
      public int getConnectSuccessCount() {
        return result.getConnectSuccessCount();
      }
      public Builder setConnectSuccessCount(int value) {
        result.hasConnectSuccessCount = true;
        result.connectSuccessCount_ = value;
        return this;
      }
      public Builder clearConnectSuccessCount() {
        result.hasConnectSuccessCount = false;
        result.connectSuccessCount_ = 0;
        return this;
      }
      
      // required int32 connectTime = 7;
      public boolean hasConnectTime() {
        return result.hasConnectTime();
      }
      public int getConnectTime() {
        return result.getConnectTime();
      }
      public Builder setConnectTime(int value) {
        result.hasConnectTime = true;
        result.connectTime_ = value;
        return this;
      }
      public Builder clearConnectTime() {
        result.hasConnectTime = false;
        result.connectTime_ = 0;
        return this;
      }
      
      // optional string crashLog = 8;
      public boolean hasCrashLog() {
        return result.hasCrashLog();
      }
      public java.lang.String getCrashLog() {
        return result.getCrashLog();
      }
      public Builder setCrashLog(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasCrashLog = true;
        result.crashLog_ = value;
        return this;
      }
      public Builder clearCrashLog() {
        result.hasCrashLog = false;
        result.crashLog_ = getDefaultInstance().getCrashLog();
        return this;
      }
    }
    
    static {
      com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.getDescriptor();
    }
    
    static {
      com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.internalForceInit();
    }
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_baidu_carlife_protobuf_CarlifeStatisticsInfo_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_baidu_carlife_protobuf_CarlifeStatisticsInfo_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n CarlifeStatisticsInfoProto.proto\022\032com." +
      "baidu.carlife.protobuf\"\272\001\n\025CarlifeStatis" +
      "ticsInfo\022\014\n\004cuid\030\001 \002(\t\022\023\n\013versionName\030\002 " +
      "\002(\t\022\023\n\013versionCode\030\003 \002(\005\022\017\n\007channel\030\004 \002(" +
      "\t\022\024\n\014connectCount\030\005 \002(\005\022\033\n\023connectSucces" +
      "sCount\030\006 \002(\005\022\023\n\013connectTime\030\007 \002(\005\022\020\n\010cra" +
      "shLog\030\010 \001(\t"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_baidu_carlife_protobuf_CarlifeStatisticsInfo_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_baidu_carlife_protobuf_CarlifeStatisticsInfo_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_baidu_carlife_protobuf_CarlifeStatisticsInfo_descriptor,
              new java.lang.String[] { "Cuid", "VersionName", "VersionCode", "Channel", "ConnectCount", "ConnectSuccessCount", "ConnectTime", "CrashLog", },
              com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfo.class,
              com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfo.Builder.class);
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
