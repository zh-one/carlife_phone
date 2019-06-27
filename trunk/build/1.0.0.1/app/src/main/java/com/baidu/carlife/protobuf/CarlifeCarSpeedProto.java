// Generated by the protocol buffer compiler.  DO NOT EDIT!

package com.baidu.carlife.protobuf;

public final class CarlifeCarSpeedProto {
  private CarlifeCarSpeedProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class CarlifeCarSpeed extends
      com.google.protobuf.GeneratedMessage {
    // Use CarlifeCarSpeed.newBuilder() to construct.
    private CarlifeCarSpeed() {}
    
    private static final CarlifeCarSpeed defaultInstance = new CarlifeCarSpeed();
    public static CarlifeCarSpeed getDefaultInstance() {
      return defaultInstance;
    }
    
    public CarlifeCarSpeed getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.baidu.carlife.protobuf.CarlifeCarSpeedProto.internal_static_com_baidu_carlife_protobuf_CarlifeCarSpeed_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.baidu.carlife.protobuf.CarlifeCarSpeedProto.internal_static_com_baidu_carlife_protobuf_CarlifeCarSpeed_fieldAccessorTable;
    }

    // required int32 speed = 1;
    public static final int SPEED_FIELD_NUMBER = 1;
    private boolean hasSpeed;
    private int speed_ = 0;
    public boolean hasSpeed() { return hasSpeed; }
    public int getSpeed() { return speed_; }

    // optional uint64 timeStamp = 2;
    public static final int TIMESTAMP_FIELD_NUMBER = 2;
    private boolean hasTimeStamp;
    private long timeStamp_ = 0L;
    public boolean hasTimeStamp() { return hasTimeStamp; }
    public long getTimeStamp() { return timeStamp_; }

    public final boolean isInitialized() {
      if (!hasSpeed) return false;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (hasSpeed()) {
        output.writeInt32(1, getSpeed());
      }
      if (hasTimeStamp()) {
        output.writeUInt64(2, getTimeStamp());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (hasSpeed()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, getSpeed());
      }
      if (hasTimeStamp()) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, getTimeStamp());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    public static com.baidu.carlife.protobuf.CarlifeCarSpeedProto.CarlifeCarSpeed parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.baidu.carlife.protobuf.CarlifeCarSpeedProto.CarlifeCarSpeed parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.baidu.carlife.protobuf.CarlifeCarSpeedProto.CarlifeCarSpeed parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.baidu.carlife.protobuf.CarlifeCarSpeedProto.CarlifeCarSpeed parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.baidu.carlife.protobuf.CarlifeCarSpeedProto.CarlifeCarSpeed parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.baidu.carlife.protobuf.CarlifeCarSpeedProto.CarlifeCarSpeed parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.baidu.carlife.protobuf.CarlifeCarSpeedProto.CarlifeCarSpeed parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeDelimitedFrom(input).buildParsed();
    }
    public static com.baidu.carlife.protobuf.CarlifeCarSpeedProto.CarlifeCarSpeed parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeDelimitedFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.baidu.carlife.protobuf.CarlifeCarSpeedProto.CarlifeCarSpeed parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.baidu.carlife.protobuf.CarlifeCarSpeedProto.CarlifeCarSpeed parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.baidu.carlife.protobuf.CarlifeCarSpeedProto.CarlifeCarSpeed prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.baidu.carlife.protobuf.CarlifeCarSpeedProto.CarlifeCarSpeed result;

      // Construct using com.baidu.carlife.protobuf.CarlifeCarSpeedProto.CarlifeCarSpeed.newBuilder()
      private Builder() {}

      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.baidu.carlife.protobuf.CarlifeCarSpeedProto.CarlifeCarSpeed();
        return builder;
      }

      protected com.baidu.carlife.protobuf.CarlifeCarSpeedProto.CarlifeCarSpeed internalGetResult() {
        return result;
      }

      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.baidu.carlife.protobuf.CarlifeCarSpeedProto.CarlifeCarSpeed();
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(result);
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.baidu.carlife.protobuf.CarlifeCarSpeedProto.CarlifeCarSpeed.getDescriptor();
      }

      public com.baidu.carlife.protobuf.CarlifeCarSpeedProto.CarlifeCarSpeed getDefaultInstanceForType() {
        return com.baidu.carlife.protobuf.CarlifeCarSpeedProto.CarlifeCarSpeed.getDefaultInstance();
      }

      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.baidu.carlife.protobuf.CarlifeCarSpeedProto.CarlifeCarSpeed build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }

      private com.baidu.carlife.protobuf.CarlifeCarSpeedProto.CarlifeCarSpeed buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }

      public com.baidu.carlife.protobuf.CarlifeCarSpeedProto.CarlifeCarSpeed buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        com.baidu.carlife.protobuf.CarlifeCarSpeedProto.CarlifeCarSpeed returnMe = result;
        result = null;
        return returnMe;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.baidu.carlife.protobuf.CarlifeCarSpeedProto.CarlifeCarSpeed) {
          return mergeFrom((com.baidu.carlife.protobuf.CarlifeCarSpeedProto.CarlifeCarSpeed)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.baidu.carlife.protobuf.CarlifeCarSpeedProto.CarlifeCarSpeed other) {
        if (other == com.baidu.carlife.protobuf.CarlifeCarSpeedProto.CarlifeCarSpeed.getDefaultInstance()) return this;
        if (other.hasSpeed()) {
          setSpeed(other.getSpeed());
        }
        if (other.hasTimeStamp()) {
          setTimeStamp(other.getTimeStamp());
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
              setSpeed(input.readInt32());
              break;
            }
            case 16: {
              setTimeStamp(input.readUInt64());
              break;
            }
          }
        }
      }


      // required int32 speed = 1;
      public boolean hasSpeed() {
        return result.hasSpeed();
      }
      public int getSpeed() {
        return result.getSpeed();
      }
      public Builder setSpeed(int value) {
        result.hasSpeed = true;
        result.speed_ = value;
        return this;
      }
      public Builder clearSpeed() {
        result.hasSpeed = false;
        result.speed_ = 0;
        return this;
      }

      // optional uint64 timeStamp = 2;
      public boolean hasTimeStamp() {
        return result.hasTimeStamp();
      }
      public long getTimeStamp() {
        return result.getTimeStamp();
      }
      public Builder setTimeStamp(long value) {
        result.hasTimeStamp = true;
        result.timeStamp_ = value;
        return this;
      }
      public Builder clearTimeStamp() {
        result.hasTimeStamp = false;
        result.timeStamp_ = 0L;
        return this;
      }
    }

    static {
      com.baidu.carlife.protobuf.CarlifeCarSpeedProto.getDescriptor();
    }

    static {
      com.baidu.carlife.protobuf.CarlifeCarSpeedProto.internalForceInit();
    }
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_baidu_carlife_protobuf_CarlifeCarSpeed_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_baidu_carlife_protobuf_CarlifeCarSpeed_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\032CarlifeCarSpeedProto.proto\022\032com.baidu." +
      "carlife.protobuf\"3\n\017CarlifeCarSpeed\022\r\n\005s" +
      "peed\030\001 \002(\005\022\021\n\ttimeStamp\030\002 \001(\004"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_baidu_carlife_protobuf_CarlifeCarSpeed_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_baidu_carlife_protobuf_CarlifeCarSpeed_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_baidu_carlife_protobuf_CarlifeCarSpeed_descriptor,
              new String[] { "Speed", "TimeStamp", },
              com.baidu.carlife.protobuf.CarlifeCarSpeedProto.CarlifeCarSpeed.class,
              com.baidu.carlife.protobuf.CarlifeCarSpeedProto.CarlifeCarSpeed.Builder.class);
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
