// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CarlifeTouchActionProto.proto

#define INTERNAL_SUPPRESS_PROTOBUF_FIELD_DEPRECATION
#include "CarlifeTouchActionProto.pb.h"

#include <algorithm>

#include <google/protobuf/stubs/common.h>
#include <google/protobuf/stubs/once.h>
#include <google/protobuf/io/coded_stream.h>
#include <google/protobuf/wire_format_lite_inl.h>
#include <google/protobuf/descriptor.h>
#include <google/protobuf/generated_message_reflection.h>
#include <google/protobuf/reflection_ops.h>
#include <google/protobuf/wire_format.h>
// @@protoc_insertion_point(includes)

namespace com {
namespace baidu {
namespace carlife {
namespace protobuf {

namespace {

const ::google::protobuf::Descriptor* CarlifeTouchAction_descriptor_ = NULL;
const ::google::protobuf::internal::GeneratedMessageReflection*
  CarlifeTouchAction_reflection_ = NULL;

}  // namespace


void protobuf_AssignDesc_CarlifeTouchActionProto_2eproto() {
  protobuf_AddDesc_CarlifeTouchActionProto_2eproto();
  const ::google::protobuf::FileDescriptor* file =
    ::google::protobuf::DescriptorPool::generated_pool()->FindFileByName(
      "CarlifeTouchActionProto.proto");
  GOOGLE_CHECK(file != NULL);
  CarlifeTouchAction_descriptor_ = file->message_type(0);
  static const int CarlifeTouchAction_offsets_[3] = {
    GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(CarlifeTouchAction, action_),
    GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(CarlifeTouchAction, x_),
    GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(CarlifeTouchAction, y_),
  };
  CarlifeTouchAction_reflection_ =
    new ::google::protobuf::internal::GeneratedMessageReflection(
      CarlifeTouchAction_descriptor_,
      CarlifeTouchAction::default_instance_,
      CarlifeTouchAction_offsets_,
      GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(CarlifeTouchAction, _has_bits_[0]),
      GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(CarlifeTouchAction, _unknown_fields_),
      -1,
      ::google::protobuf::DescriptorPool::generated_pool(),
      ::google::protobuf::MessageFactory::generated_factory(),
      sizeof(CarlifeTouchAction));
}

namespace {

GOOGLE_PROTOBUF_DECLARE_ONCE(protobuf_AssignDescriptors_once_);
inline void protobuf_AssignDescriptorsOnce() {
  ::google::protobuf::GoogleOnceInit(&protobuf_AssignDescriptors_once_,
                 &protobuf_AssignDesc_CarlifeTouchActionProto_2eproto);
}

void protobuf_RegisterTypes(const ::std::string&) {
  protobuf_AssignDescriptorsOnce();
  ::google::protobuf::MessageFactory::InternalRegisterGeneratedMessage(
    CarlifeTouchAction_descriptor_, &CarlifeTouchAction::default_instance());
}

}  // namespace

void protobuf_ShutdownFile_CarlifeTouchActionProto_2eproto() {
  delete CarlifeTouchAction::default_instance_;
  delete CarlifeTouchAction_reflection_;
}

void protobuf_AddDesc_CarlifeTouchActionProto_2eproto() {
  static bool already_here = false;
  if (already_here) return;
  already_here = true;
  GOOGLE_PROTOBUF_VERIFY_VERSION;

  ::google::protobuf::DescriptorPool::InternalAddGeneratedFile(
    "\n\035CarlifeTouchActionProto.proto\022\032com.bai"
    "du.carlife.protobuf\":\n\022CarlifeTouchActio"
    "n\022\016\n\006action\030\001 \002(\005\022\t\n\001x\030\002 \002(\005\022\t\n\001y\030\003 \002(\005", 119);
  ::google::protobuf::MessageFactory::InternalRegisterGeneratedFile(
    "CarlifeTouchActionProto.proto", &protobuf_RegisterTypes);
  CarlifeTouchAction::default_instance_ = new CarlifeTouchAction();
  CarlifeTouchAction::default_instance_->InitAsDefaultInstance();
  ::google::protobuf::internal::OnShutdown(&protobuf_ShutdownFile_CarlifeTouchActionProto_2eproto);
}

// Force AddDescriptors() to be called at static initialization time.
struct StaticDescriptorInitializer_CarlifeTouchActionProto_2eproto {
  StaticDescriptorInitializer_CarlifeTouchActionProto_2eproto() {
    protobuf_AddDesc_CarlifeTouchActionProto_2eproto();
  }
} static_descriptor_initializer_CarlifeTouchActionProto_2eproto_;

// ===================================================================

#ifndef _MSC_VER
const int CarlifeTouchAction::kActionFieldNumber;
const int CarlifeTouchAction::kXFieldNumber;
const int CarlifeTouchAction::kYFieldNumber;
#endif  // !_MSC_VER

CarlifeTouchAction::CarlifeTouchAction()
  : ::google::protobuf::Message() {
  SharedCtor();
}

void CarlifeTouchAction::InitAsDefaultInstance() {
}

CarlifeTouchAction::CarlifeTouchAction(const CarlifeTouchAction& from)
  : ::google::protobuf::Message() {
  SharedCtor();
  MergeFrom(from);
}

void CarlifeTouchAction::SharedCtor() {
  _cached_size_ = 0;
  action_ = 0;
  x_ = 0;
  y_ = 0;
  ::memset(_has_bits_, 0, sizeof(_has_bits_));
}

CarlifeTouchAction::~CarlifeTouchAction() {
  SharedDtor();
}

void CarlifeTouchAction::SharedDtor() {
  if (this != default_instance_) {
  }
}

void CarlifeTouchAction::SetCachedSize(int size) const {
  GOOGLE_SAFE_CONCURRENT_WRITES_BEGIN();
  _cached_size_ = size;
  GOOGLE_SAFE_CONCURRENT_WRITES_END();
}
const ::google::protobuf::Descriptor* CarlifeTouchAction::descriptor() {
  protobuf_AssignDescriptorsOnce();
  return CarlifeTouchAction_descriptor_;
}

const CarlifeTouchAction& CarlifeTouchAction::default_instance() {
  if (default_instance_ == NULL) protobuf_AddDesc_CarlifeTouchActionProto_2eproto();
  return *default_instance_;
}

CarlifeTouchAction* CarlifeTouchAction::default_instance_ = NULL;

CarlifeTouchAction* CarlifeTouchAction::New() const {
  return new CarlifeTouchAction;
}

void CarlifeTouchAction::Clear() {
  if (_has_bits_[0 / 32] & (0xffu << (0 % 32))) {
    action_ = 0;
    x_ = 0;
    y_ = 0;
  }
  ::memset(_has_bits_, 0, sizeof(_has_bits_));
  mutable_unknown_fields()->Clear();
}

bool CarlifeTouchAction::MergePartialFromCodedStream(
    ::google::protobuf::io::CodedInputStream* input) {
#define DO_(EXPRESSION) if (!(EXPRESSION)) return false
  ::google::protobuf::uint32 tag;
  while ((tag = input->ReadTag()) != 0) {
    switch (::google::protobuf::internal::WireFormatLite::GetTagFieldNumber(tag)) {
      // required int32 action = 1;
      case 1: {
        if (::google::protobuf::internal::WireFormatLite::GetTagWireType(tag) ==
            ::google::protobuf::internal::WireFormatLite::WIRETYPE_VARINT) {
          DO_((::google::protobuf::internal::WireFormatLite::ReadPrimitive<
                   ::google::protobuf::int32, ::google::protobuf::internal::WireFormatLite::TYPE_INT32>(
                 input, &action_)));
          set_has_action();
        } else {
          goto handle_uninterpreted;
        }
        if (input->ExpectTag(16)) goto parse_x;
        break;
      }

      // required int32 x = 2;
      case 2: {
        if (::google::protobuf::internal::WireFormatLite::GetTagWireType(tag) ==
            ::google::protobuf::internal::WireFormatLite::WIRETYPE_VARINT) {
         parse_x:
          DO_((::google::protobuf::internal::WireFormatLite::ReadPrimitive<
                   ::google::protobuf::int32, ::google::protobuf::internal::WireFormatLite::TYPE_INT32>(
                 input, &x_)));
          set_has_x();
        } else {
          goto handle_uninterpreted;
        }
        if (input->ExpectTag(24)) goto parse_y;
        break;
      }

      // required int32 y = 3;
      case 3: {
        if (::google::protobuf::internal::WireFormatLite::GetTagWireType(tag) ==
            ::google::protobuf::internal::WireFormatLite::WIRETYPE_VARINT) {
         parse_y:
          DO_((::google::protobuf::internal::WireFormatLite::ReadPrimitive<
                   ::google::protobuf::int32, ::google::protobuf::internal::WireFormatLite::TYPE_INT32>(
                 input, &y_)));
          set_has_y();
        } else {
          goto handle_uninterpreted;
        }
        if (input->ExpectAtEnd()) return true;
        break;
      }

      default: {
      handle_uninterpreted:
        if (::google::protobuf::internal::WireFormatLite::GetTagWireType(tag) ==
            ::google::protobuf::internal::WireFormatLite::WIRETYPE_END_GROUP) {
          return true;
        }
        DO_(::google::protobuf::internal::WireFormat::SkipField(
              input, tag, mutable_unknown_fields()));
        break;
      }
    }
  }
  return true;
#undef DO_
}

void CarlifeTouchAction::SerializeWithCachedSizes(
    ::google::protobuf::io::CodedOutputStream* output) const {
  // required int32 action = 1;
  if (has_action()) {
    ::google::protobuf::internal::WireFormatLite::WriteInt32(1, this->action(), output);
  }

  // required int32 x = 2;
  if (has_x()) {
    ::google::protobuf::internal::WireFormatLite::WriteInt32(2, this->x(), output);
  }

  // required int32 y = 3;
  if (has_y()) {
    ::google::protobuf::internal::WireFormatLite::WriteInt32(3, this->y(), output);
  }

  if (!unknown_fields().empty()) {
    ::google::protobuf::internal::WireFormat::SerializeUnknownFields(
        unknown_fields(), output);
  }
}

::google::protobuf::uint8* CarlifeTouchAction::SerializeWithCachedSizesToArray(
    ::google::protobuf::uint8* target) const {
  // required int32 action = 1;
  if (has_action()) {
    target = ::google::protobuf::internal::WireFormatLite::WriteInt32ToArray(1, this->action(), target);
  }

  // required int32 x = 2;
  if (has_x()) {
    target = ::google::protobuf::internal::WireFormatLite::WriteInt32ToArray(2, this->x(), target);
  }

  // required int32 y = 3;
  if (has_y()) {
    target = ::google::protobuf::internal::WireFormatLite::WriteInt32ToArray(3, this->y(), target);
  }

  if (!unknown_fields().empty()) {
    target = ::google::protobuf::internal::WireFormat::SerializeUnknownFieldsToArray(
        unknown_fields(), target);
  }
  return target;
}

int CarlifeTouchAction::ByteSize() const {
  int total_size = 0;

  if (_has_bits_[0 / 32] & (0xffu << (0 % 32))) {
    // required int32 action = 1;
    if (has_action()) {
      total_size += 1 +
        ::google::protobuf::internal::WireFormatLite::Int32Size(
          this->action());
    }

    // required int32 x = 2;
    if (has_x()) {
      total_size += 1 +
        ::google::protobuf::internal::WireFormatLite::Int32Size(
          this->x());
    }

    // required int32 y = 3;
    if (has_y()) {
      total_size += 1 +
        ::google::protobuf::internal::WireFormatLite::Int32Size(
          this->y());
    }

  }
  if (!unknown_fields().empty()) {
    total_size +=
      ::google::protobuf::internal::WireFormat::ComputeUnknownFieldsSize(
        unknown_fields());
  }
  GOOGLE_SAFE_CONCURRENT_WRITES_BEGIN();
  _cached_size_ = total_size;
  GOOGLE_SAFE_CONCURRENT_WRITES_END();
  return total_size;
}

void CarlifeTouchAction::MergeFrom(const ::google::protobuf::Message& from) {
  GOOGLE_CHECK_NE(&from, this);
  const CarlifeTouchAction* source =
    ::google::protobuf::internal::dynamic_cast_if_available<const CarlifeTouchAction*>(
      &from);
  if (source == NULL) {
    ::google::protobuf::internal::ReflectionOps::Merge(from, this);
  } else {
    MergeFrom(*source);
  }
}

void CarlifeTouchAction::MergeFrom(const CarlifeTouchAction& from) {
  GOOGLE_CHECK_NE(&from, this);
  if (from._has_bits_[0 / 32] & (0xffu << (0 % 32))) {
    if (from.has_action()) {
      set_action(from.action());
    }
    if (from.has_x()) {
      set_x(from.x());
    }
    if (from.has_y()) {
      set_y(from.y());
    }
  }
  mutable_unknown_fields()->MergeFrom(from.unknown_fields());
}

void CarlifeTouchAction::CopyFrom(const ::google::protobuf::Message& from) {
  if (&from == this) return;
  Clear();
  MergeFrom(from);
}

void CarlifeTouchAction::CopyFrom(const CarlifeTouchAction& from) {
  if (&from == this) return;
  Clear();
  MergeFrom(from);
}

bool CarlifeTouchAction::IsInitialized() const {
  if ((_has_bits_[0] & 0x00000007) != 0x00000007) return false;

  return true;
}

void CarlifeTouchAction::Swap(CarlifeTouchAction* other) {
  if (other != this) {
    std::swap(action_, other->action_);
    std::swap(x_, other->x_);
    std::swap(y_, other->y_);
    std::swap(_has_bits_[0], other->_has_bits_[0]);
    _unknown_fields_.Swap(&other->_unknown_fields_);
    std::swap(_cached_size_, other->_cached_size_);
  }
}

::google::protobuf::Metadata CarlifeTouchAction::GetMetadata() const {
  protobuf_AssignDescriptorsOnce();
  ::google::protobuf::Metadata metadata;
  metadata.descriptor = CarlifeTouchAction_descriptor_;
  metadata.reflection = CarlifeTouchAction_reflection_;
  return metadata;
}


// @@protoc_insertion_point(namespace_scope)

}  // namespace protobuf
}  // namespace carlife
}  // namespace baidu
}  // namespace com

// @@protoc_insertion_point(global_scope)
