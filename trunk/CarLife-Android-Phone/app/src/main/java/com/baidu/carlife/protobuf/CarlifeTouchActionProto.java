// Generated by the protocol buffer compiler.  DO NOT EDIT!

package com.baidu.carlife.protobuf;

public final class CarlifeTouchActionProto {
  private CarlifeTouchActionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class CarlifeTouchAction extends
      com.google.protobuf.GeneratedMessage {
    // Use CarlifeTouchAction.newBuilder() to construct.
    private CarlifeTouchAction() {}
    
    private static final CarlifeTouchAction defaultInstance = new CarlifeTouchAction();
    public static CarlifeTouchAction getDefaultInstance() {
      return defaultInstance;
    }
    
    public CarlifeTouchAction getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.baidu.carlife.protobuf.CarlifeTouchActionProto.internal_static_com_baidu_carlife_protobuf_CarlifeTouchAction_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.baidu.carlife.protobuf.CarlifeTouchActionProto.internal_static_com_baidu_carlife_protobuf_CarlifeTouchAction_fieldAccessorTable;
    }

    // required int32 action = 1;
    public static final int ACTION_FIELD_NUMBER = 1;
    private boolean hasAction;
    private int action_ = 0;
    public boolean hasAction() { return hasAction; }
    public int getAction() { return action_; }

    // required int32 x = 2;
    public static final int X_FIELD_NUMBER = 2;
    private boolean hasX;
    private int x_ = 0;
    public boolean hasX() { return hasX; }
    public int getX() { return x_; }

    // required int32 y = 3;
    public static final int Y_FIELD_NUMBER = 3;
    private boolean hasY;
    private int y_ = 0;
    public boolean hasY() { return hasY; }
    public int getY() { return y_; }

    public final boolean isInitialized() {
      if (!hasAction) return false;
      if (!hasX) return false;
      if (!hasY) return false;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (hasAction()) {
        output.writeInt32(1, getAction());
      }
      if (hasX()) {
        output.writeInt32(2, getX());
      }
      if (hasY()) {
        output.writeInt32(3, getY());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (hasAction()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, getAction());
      }
      if (hasX()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, getX());
      }
      if (hasY()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, getY());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    public static com.baidu.carlife.protobuf.CarlifeTouchActionProto.CarlifeTouchAction parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.baidu.carlife.protobuf.CarlifeTouchActionProto.CarlifeTouchAction parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.baidu.carlife.protobuf.CarlifeTouchActionProto.CarlifeTouchAction parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.baidu.carlife.protobuf.CarlifeTouchActionProto.CarlifeTouchAction parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.baidu.carlife.protobuf.CarlifeTouchActionProto.CarlifeTouchAction parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.baidu.carlife.protobuf.CarlifeTouchActionProto.CarlifeTouchAction parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.baidu.carlife.protobuf.CarlifeTouchActionProto.CarlifeTouchAction parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeDelimitedFrom(input).buildParsed();
    }
    public static com.baidu.carlife.protobuf.CarlifeTouchActionProto.CarlifeTouchAction parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeDelimitedFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.baidu.carlife.protobuf.CarlifeTouchActionProto.CarlifeTouchAction parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.baidu.carlife.protobuf.CarlifeTouchActionProto.CarlifeTouchAction parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.baidu.carlife.protobuf.CarlifeTouchActionProto.CarlifeTouchAction prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.baidu.carlife.protobuf.CarlifeTouchActionProto.CarlifeTouchAction result;

      // Construct using com.baidu.carlife.protobuf.CarlifeTouchActionProto.CarlifeTouchAction.newBuilder()
      private Builder() {}

      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.baidu.carlife.protobuf.CarlifeTouchActionProto.CarlifeTouchAction();
        return builder;
      }

      protected com.baidu.carlife.protobuf.CarlifeTouchActionProto.CarlifeTouchAction internalGetResult() {
        return result;
      }

      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.baidu.carlife.protobuf.CarlifeTouchActionProto.CarlifeTouchAction();
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(result);
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.baidu.carlife.protobuf.CarlifeTouchActionProto.CarlifeTouchAction.getDescriptor();
      }

      public com.baidu.carlife.protobuf.CarlifeTouchActionProto.CarlifeTouchAction getDefaultInstanceForType() {
        return com.baidu.carlife.protobuf.CarlifeTouchActionProto.CarlifeTouchAction.getDefaultInstance();
      }

      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.baidu.carlife.protobuf.CarlifeTouchActionProto.CarlifeTouchAction build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }

      private com.baidu.carlife.protobuf.CarlifeTouchActionProto.CarlifeTouchAction buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }

      public com.baidu.carlife.protobuf.CarlifeTouchActionProto.CarlifeTouchAction buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        com.baidu.carlife.protobuf.CarlifeTouchActionProto.CarlifeTouchAction returnMe = result;
        result = null;
        return returnMe;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.baidu.carlife.protobuf.CarlifeTouchActionProto.CarlifeTouchAction) {
          return mergeFrom((com.baidu.carlife.protobuf.CarlifeTouchActionProto.CarlifeTouchAction)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.baidu.carlife.protobuf.CarlifeTouchActionProto.CarlifeTouchAction other) {
        if (other == com.baidu.carlife.protobuf.CarlifeTouchActionProto.CarlifeTouchAction.getDefaultInstance()) return this;
        if (other.hasAction()) {
          setAction(other.getAction());
        }
        if (other.hasX()) {
          setX(other.getX());
        }
        if (other.hasY()) {
          setY(other.getY());
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
              setAction(input.readInt32());
              break;
            }
            case 16: {
              setX(input.readInt32());
              break;
            }
            case 24: {
              setY(input.readInt32());
              break;
            }
          }
        }
      }


      // required int32 action = 1;
      public boolean hasAction() {
        return result.hasAction();
      }
      public int getAction() {
        return result.getAction();
      }
      public Builder setAction(int value) {
        result.hasAction = true;
        result.action_ = value;
        return this;
      }
      public Builder clearAction() {
        result.hasAction = false;
        result.action_ = 0;
        return this;
      }

      // required int32 x = 2;
      public boolean hasX() {
        return result.hasX();
      }
      public int getX() {
        return result.getX();
      }
      public Builder setX(int value) {
        result.hasX = true;
        result.x_ = value;
        return this;
      }
      public Builder clearX() {
        result.hasX = false;
        result.x_ = 0;
        return this;
      }

      // required int32 y = 3;
      public boolean hasY() {
        return result.hasY();
      }
      public int getY() {
        return result.getY();
      }
      public Builder setY(int value) {
        result.hasY = true;
        result.y_ = value;
        return this;
      }
      public Builder clearY() {
        result.hasY = false;
        result.y_ = 0;
        return this;
      }
    }

    static {
      com.baidu.carlife.protobuf.CarlifeTouchActionProto.getDescriptor();
    }

    static {
      com.baidu.carlife.protobuf.CarlifeTouchActionProto.internalForceInit();
    }
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_baidu_carlife_protobuf_CarlifeTouchAction_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_baidu_carlife_protobuf_CarlifeTouchAction_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\035CarlifeTouchActionProto.proto\022\032com.bai" +
      "du.carlife.protobuf\":\n\022CarlifeTouchActio" +
      "n\022\016\n\006action\030\001 \002(\005\022\t\n\001x\030\002 \002(\005\022\t\n\001y\030\003 \002(\005"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_baidu_carlife_protobuf_CarlifeTouchAction_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_baidu_carlife_protobuf_CarlifeTouchAction_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_baidu_carlife_protobuf_CarlifeTouchAction_descriptor,
              new String[] { "Action", "X", "Y", },
              com.baidu.carlife.protobuf.CarlifeTouchActionProto.CarlifeTouchAction.class,
              com.baidu.carlife.protobuf.CarlifeTouchActionProto.CarlifeTouchAction.Builder.class);
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
