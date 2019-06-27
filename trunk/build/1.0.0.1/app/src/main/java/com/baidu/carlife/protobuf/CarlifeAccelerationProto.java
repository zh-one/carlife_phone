// Generated by the protocol buffer compiler.  DO NOT EDIT!

package com.baidu.carlife.protobuf;

public final class CarlifeAccelerationProto {
  private CarlifeAccelerationProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class CarlifeAcceleration extends
      com.google.protobuf.GeneratedMessage {
    // Use CarlifeAcceleration.newBuilder() to construct.
    private CarlifeAcceleration() {}
    
    private static final CarlifeAcceleration defaultInstance = new CarlifeAcceleration();
    public static CarlifeAcceleration getDefaultInstance() {
      return defaultInstance;
    }
    
    public CarlifeAcceleration getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.baidu.carlife.protobuf.CarlifeAccelerationProto.internal_static_com_baidu_carlife_protobuf_CarlifeAcceleration_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.baidu.carlife.protobuf.CarlifeAccelerationProto.internal_static_com_baidu_carlife_protobuf_CarlifeAcceleration_fieldAccessorTable;
    }

    // required double accX = 1;
    public static final int ACCX_FIELD_NUMBER = 1;
    private boolean hasAccX;
    private double accX_ = 0D;
    public boolean hasAccX() { return hasAccX; }
    public double getAccX() { return accX_; }

    // required double accY = 2;
    public static final int ACCY_FIELD_NUMBER = 2;
    private boolean hasAccY;
    private double accY_ = 0D;
    public boolean hasAccY() { return hasAccY; }
    public double getAccY() { return accY_; }

    // required double accZ = 3;
    public static final int ACCZ_FIELD_NUMBER = 3;
    private boolean hasAccZ;
    private double accZ_ = 0D;
    public boolean hasAccZ() { return hasAccZ; }
    public double getAccZ() { return accZ_; }

    // optional uint64 timeStamp = 4;
    public static final int TIMESTAMP_FIELD_NUMBER = 4;
    private boolean hasTimeStamp;
    private long timeStamp_ = 0L;
    public boolean hasTimeStamp() { return hasTimeStamp; }
    public long getTimeStamp() { return timeStamp_; }

    public final boolean isInitialized() {
      if (!hasAccX) return false;
      if (!hasAccY) return false;
      if (!hasAccZ) return false;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (hasAccX()) {
        output.writeDouble(1, getAccX());
      }
      if (hasAccY()) {
        output.writeDouble(2, getAccY());
      }
      if (hasAccZ()) {
        output.writeDouble(3, getAccZ());
      }
      if (hasTimeStamp()) {
        output.writeUInt64(4, getTimeStamp());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (hasAccX()) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(1, getAccX());
      }
      if (hasAccY()) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(2, getAccY());
      }
      if (hasAccZ()) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(3, getAccZ());
      }
      if (hasTimeStamp()) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(4, getTimeStamp());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    public static com.baidu.carlife.protobuf.CarlifeAccelerationProto.CarlifeAcceleration parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.baidu.carlife.protobuf.CarlifeAccelerationProto.CarlifeAcceleration parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.baidu.carlife.protobuf.CarlifeAccelerationProto.CarlifeAcceleration parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.baidu.carlife.protobuf.CarlifeAccelerationProto.CarlifeAcceleration parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.baidu.carlife.protobuf.CarlifeAccelerationProto.CarlifeAcceleration parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.baidu.carlife.protobuf.CarlifeAccelerationProto.CarlifeAcceleration parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.baidu.carlife.protobuf.CarlifeAccelerationProto.CarlifeAcceleration parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeDelimitedFrom(input).buildParsed();
    }
    public static com.baidu.carlife.protobuf.CarlifeAccelerationProto.CarlifeAcceleration parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeDelimitedFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.baidu.carlife.protobuf.CarlifeAccelerationProto.CarlifeAcceleration parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.baidu.carlife.protobuf.CarlifeAccelerationProto.CarlifeAcceleration parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.baidu.carlife.protobuf.CarlifeAccelerationProto.CarlifeAcceleration prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.baidu.carlife.protobuf.CarlifeAccelerationProto.CarlifeAcceleration result;

      // Construct using com.baidu.carlife.protobuf.CarlifeAccelerationProto.CarlifeAcceleration.newBuilder()
      private Builder() {}

      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.baidu.carlife.protobuf.CarlifeAccelerationProto.CarlifeAcceleration();
        return builder;
      }

      protected com.baidu.carlife.protobuf.CarlifeAccelerationProto.CarlifeAcceleration internalGetResult() {
        return result;
      }

      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.baidu.carlife.protobuf.CarlifeAccelerationProto.CarlifeAcceleration();
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(result);
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.baidu.carlife.protobuf.CarlifeAccelerationProto.CarlifeAcceleration.getDescriptor();
      }

      public com.baidu.carlife.protobuf.CarlifeAccelerationProto.CarlifeAcceleration getDefaultInstanceForType() {
        return com.baidu.carlife.protobuf.CarlifeAccelerationProto.CarlifeAcceleration.getDefaultInstance();
      }

      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.baidu.carlife.protobuf.CarlifeAccelerationProto.CarlifeAcceleration build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }

      private com.baidu.carlife.protobuf.CarlifeAccelerationProto.CarlifeAcceleration buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }

      public com.baidu.carlife.protobuf.CarlifeAccelerationProto.CarlifeAcceleration buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        com.baidu.carlife.protobuf.CarlifeAccelerationProto.CarlifeAcceleration returnMe = result;
        result = null;
        return returnMe;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.baidu.carlife.protobuf.CarlifeAccelerationProto.CarlifeAcceleration) {
          return mergeFrom((com.baidu.carlife.protobuf.CarlifeAccelerationProto.CarlifeAcceleration)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.baidu.carlife.protobuf.CarlifeAccelerationProto.CarlifeAcceleration other) {
        if (other == com.baidu.carlife.protobuf.CarlifeAccelerationProto.CarlifeAcceleration.getDefaultInstance()) return this;
        if (other.hasAccX()) {
          setAccX(other.getAccX());
        }
        if (other.hasAccY()) {
          setAccY(other.getAccY());
        }
        if (other.hasAccZ()) {
          setAccZ(other.getAccZ());
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
            case 9: {
              setAccX(input.readDouble());
              break;
            }
            case 17: {
              setAccY(input.readDouble());
              break;
            }
            case 25: {
              setAccZ(input.readDouble());
              break;
            }
            case 32: {
              setTimeStamp(input.readUInt64());
              break;
            }
          }
        }
      }


      // required double accX = 1;
      public boolean hasAccX() {
        return result.hasAccX();
      }
      public double getAccX() {
        return result.getAccX();
      }
      public Builder setAccX(double value) {
        result.hasAccX = true;
        result.accX_ = value;
        return this;
      }
      public Builder clearAccX() {
        result.hasAccX = false;
        result.accX_ = 0D;
        return this;
      }

      // required double accY = 2;
      public boolean hasAccY() {
        return result.hasAccY();
      }
      public double getAccY() {
        return result.getAccY();
      }
      public Builder setAccY(double value) {
        result.hasAccY = true;
        result.accY_ = value;
        return this;
      }
      public Builder clearAccY() {
        result.hasAccY = false;
        result.accY_ = 0D;
        return this;
      }

      // required double accZ = 3;
      public boolean hasAccZ() {
        return result.hasAccZ();
      }
      public double getAccZ() {
        return result.getAccZ();
      }
      public Builder setAccZ(double value) {
        result.hasAccZ = true;
        result.accZ_ = value;
        return this;
      }
      public Builder clearAccZ() {
        result.hasAccZ = false;
        result.accZ_ = 0D;
        return this;
      }

      // optional uint64 timeStamp = 4;
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
      com.baidu.carlife.protobuf.CarlifeAccelerationProto.getDescriptor();
    }

    static {
      com.baidu.carlife.protobuf.CarlifeAccelerationProto.internalForceInit();
    }
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_baidu_carlife_protobuf_CarlifeAcceleration_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_baidu_carlife_protobuf_CarlifeAcceleration_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\036CarlifeAccelerationProto.proto\022\032com.ba" +
      "idu.carlife.protobuf\"R\n\023CarlifeAccelerat" +
      "ion\022\014\n\004accX\030\001 \002(\001\022\014\n\004accY\030\002 \002(\001\022\014\n\004accZ\030" +
      "\003 \002(\001\022\021\n\ttimeStamp\030\004 \001(\004"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_baidu_carlife_protobuf_CarlifeAcceleration_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_baidu_carlife_protobuf_CarlifeAcceleration_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_baidu_carlife_protobuf_CarlifeAcceleration_descriptor,
              new String[] { "AccX", "AccY", "AccZ", "TimeStamp", },
              com.baidu.carlife.protobuf.CarlifeAccelerationProto.CarlifeAcceleration.class,
              com.baidu.carlife.protobuf.CarlifeAccelerationProto.CarlifeAcceleration.Builder.class);
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
