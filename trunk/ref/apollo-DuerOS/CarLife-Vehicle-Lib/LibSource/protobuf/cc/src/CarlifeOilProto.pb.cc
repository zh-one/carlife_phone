// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CarlifeOilProto.proto

#define INTERNAL_SUPPRESS_PROTOBUF_FIELD_DEPRECATION
#include "CarlifeOilProto.pb.h"

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

const ::google::protobuf::Descriptor* CarlifeOil_descriptor_ = NULL;
const ::google::protobuf::internal::GeneratedMessageReflection*
  CarlifeOil_reflection_ = NULL;

}  // namespace


void protobuf_AssignDesc_CarlifeOilProto_2eproto() {
  protobuf_AddDesc_CarlifeOilProto_2eproto();
  const ::google::protobuf::FileDescriptor* file =
    ::google::protobuf::DescriptorPool::generated_pool()->FindFileByName(
      "CarlifeOilProto.proto");
  GOOGLE_CHECK(file != NULL);
  CarlifeOil_descriptor_ = file->message_type(0);
  static const int CarlifeOil_offsets_[3] = {
    GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(CarlifeOil, level_),
    GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(CarlifeOil, range_),
    GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(CarlifeOil, lowfulewarning_),
  };
  CarlifeOil_reflection_ =
    new ::google::protobuf::internal::GeneratedMessageReflection(
      CarlifeOil_descriptor_,
      CarlifeOil::default_instance_,
      CarlifeOil_offsets_,
      GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(CarlifeOil, _has_bits_[0]),
      GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(CarlifeOil, _unknown_fields_),
      -1,
      ::google::protobuf::DescriptorPool::generated_pool(),
      ::google::protobuf::MessageFactory::generated_factory(),
      sizeof(CarlifeOil));
}

namespace {

GOOGLE_PROTOBUF_DECLARE_ONCE(protobuf_AssignDescriptors_once_);
inline void protobuf_AssignDescriptorsOnce() {
  ::google::protobuf::GoogleOnceInit(&protobuf_AssignDescriptors_once_,
                 &protobuf_AssignDesc_CarlifeOilProto_2eproto);
}

void protobuf_RegisterTypes(const ::std::string&) {
  protobuf_AssignDescriptorsOnce();
  ::google::protobuf::MessageFactory::InternalRegisterGeneratedMessage(
    CarlifeOil_descriptor_, &CarlifeOil::default_instance());
}

}  // namespace

void protobuf_ShutdownFile_CarlifeOilProto_2eproto() {
  delete CarlifeOil::default_instance_;
  delete CarlifeOil_reflection_;
}

void protobuf_AddDesc_CarlifeOilProto_2eproto() {
  static bool already_here = false;
  if (already_here) return;
  already_here = true;
  GOOGLE_PROTOBUF_VERIFY_VERSION;

  ::google::protobuf::DescriptorPool::InternalAddGeneratedFile(
    "\n\025CarlifeOilProto.proto\022\032com.baidu.carli"
    "fe.protobuf\"B\n\nCarlifeOil\022\r\n\005level\030\001 \002(\005"
    "\022\r\n\005range\030\002 \002(\005\022\026\n\016lowFuleWarning\030\003 \001(\010", 119);
  ::google::protobuf::MessageFactory::InternalRegisterGeneratedFile(
    "CarlifeOilProto.proto", &protobuf_RegisterTypes);
  CarlifeOil::default_instance_ = new CarlifeOil();
  CarlifeOil::default_instance_->InitAsDefaultInstance();
  ::google::protobuf::internal::OnShutdown(&protobuf_ShutdownFile_CarlifeOilProto_2eproto);
}

// Force AddDescriptors() to be called at static initialization time.
struct StaticDescriptorInitializer_CarlifeOilProto_2eproto {
  StaticDescriptorInitializer_CarlifeOilProto_2eproto() {
    protobuf_AddDesc_CarlifeOilProto_2eproto();
  }
} static_descriptor_initializer_CarlifeOilProto_2eproto_;

// ===================================================================

#ifndef _MSC_VER
const int CarlifeOil::kLevelFieldNumber;
const int CarlifeOil::kRangeFieldNumber;
const int CarlifeOil::kLowFuleWarningFieldNumber;
#endif  // !_MSC_VER

CarlifeOil::CarlifeOil()
  : ::google::protobuf::Message() {
  SharedCtor();
}

void CarlifeOil::InitAsDefaultInstance() {
}

CarlifeOil::CarlifeOil(const CarlifeOil& from)
  : ::google::protobuf::Message() {
  SharedCtor();
  MergeFrom(from);
}

void CarlifeOil::SharedCtor() {
  _cached_size_ = 0;
  level_ = 0;
  range_ = 0;
  lowfulewarning_ = false;
  ::memset(_has_bits_, 0, sizeof(_has_bits_));
}

CarlifeOil::~CarlifeOil() {
  SharedDtor();
}

void CarlifeOil::SharedDtor() {
  if (this != default_instance_) {
  }
}

void CarlifeOil::SetCachedSize(int size) const {
  GOOGLE_SAFE_CONCURRENT_WRITES_BEGIN();
  _cached_size_ = size;
  GOOGLE_SAFE_CONCURRENT_WRITES_END();
}
const ::google::protobuf::Descriptor* CarlifeOil::descriptor() {
  protobuf_AssignDescriptorsOnce();
  return CarlifeOil_descriptor_;
}

const CarlifeOil& CarlifeOil::default_instance() {
  if (default_instance_ == NULL) protobuf_AddDesc_CarlifeOilProto_2eproto();
  return *default_instance_;
}

CarlifeOil* CarlifeOil::default_instance_ = NULL;

CarlifeOil* CarlifeOil::New() const {
  return new CarlifeOil;
}

void CarlifeOil::Clear() {
  if (_has_bits_[0 / 32] & (0xffu << (0 % 32))) {
    level_ = 0;
    range_ = 0;
    lowfulewarning_ = false;
  }
  ::memset(_has_bits_, 0, sizeof(_has_bits_));
  mutable_unknown_fields()->Clear();
}

bool CarlifeOil::MergePartialFromCodedStream(
    ::google::protobuf::io::CodedInputStream* input) {
#define DO_(EXPRESSION) if (!(EXPRESSION)) return false
  ::google::protobuf::uint32 tag;
  while ((tag = input->ReadTag()) != 0) {
    switch (::google::protobuf::internal::WireFormatLite::GetTagFieldNumber(tag)) {
      // required int32 level = 1;
      case 1: {
        if (::google::protobuf::internal::WireFormatLite::GetTagWireType(tag) ==
            ::google::protobuf::internal::WireFormatLite::WIRETYPE_VARINT) {
          DO_((::google::protobuf::internal::WireFormatLite::ReadPrimitive<
                   ::google::protobuf::int32, ::google::protobuf::internal::WireFormatLite::TYPE_INT32>(
                 input, &level_)));
          set_has_level();
        } else {
          goto handle_uninterpreted;
        }
        if (input->ExpectTag(16)) goto parse_range;
        break;
      }

      // required int32 range = 2;
      case 2: {
        if (::google::protobuf::internal::WireFormatLite::GetTagWireType(tag) ==
            ::google::protobuf::internal::WireFormatLite::WIRETYPE_VARINT) {
         parse_range:
          DO_((::google::protobuf::internal::WireFormatLite::ReadPrimitive<
                   ::google::protobuf::int32, ::google::protobuf::internal::WireFormatLite::TYPE_INT32>(
                 input, &range_)));
          set_has_range();
        } else {
          goto handle_uninterpreted;
        }
        if (input->ExpectTag(24)) goto parse_lowFuleWarning;
        break;
      }

      // optional bool lowFuleWarning = 3;
      case 3: {
        if (::google::protobuf::internal::WireFormatLite::GetTagWireType(tag) ==
            ::google::protobuf::internal::WireFormatLite::WIRETYPE_VARINT) {
         parse_lowFuleWarning:
          DO_((::google::protobuf::internal::WireFormatLite::ReadPrimitive<
                   bool, ::google::protobuf::internal::WireFormatLite::TYPE_BOOL>(
                 input, &lowfulewarning_)));
          set_has_lowfulewarning();
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

void CarlifeOil::SerializeWithCachedSizes(
    ::google::protobuf::io::CodedOutputStream* output) const {
  // required int32 level = 1;
  if (has_level()) {
    ::google::protobuf::internal::WireFormatLite::WriteInt32(1, this->level(), output);
  }

  // required int32 range = 2;
  if (has_range()) {
    ::google::protobuf::internal::WireFormatLite::WriteInt32(2, this->range(), output);
  }

  // optional bool lowFuleWarning = 3;
  if (has_lowfulewarning()) {
    ::google::protobuf::internal::WireFormatLite::WriteBool(3, this->lowfulewarning(), output);
  }

  if (!unknown_fields().empty()) {
    ::google::protobuf::internal::WireFormat::SerializeUnknownFields(
        unknown_fields(), output);
  }
}

::google::protobuf::uint8* CarlifeOil::SerializeWithCachedSizesToArray(
    ::google::protobuf::uint8* target) const {
  // required int32 level = 1;
  if (has_level()) {
    target = ::google::protobuf::internal::WireFormatLite::WriteInt32ToArray(1, this->level(), target);
  }

  // required int32 range = 2;
  if (has_range()) {
    target = ::google::protobuf::internal::WireFormatLite::WriteInt32ToArray(2, this->range(), target);
  }

  // optional bool lowFuleWarning = 3;
  if (has_lowfulewarning()) {
    target = ::google::protobuf::internal::WireFormatLite::WriteBoolToArray(3, this->lowfulewarning(), target);
  }

  if (!unknown_fields().empty()) {
    target = ::google::protobuf::internal::WireFormat::SerializeUnknownFieldsToArray(
        unknown_fields(), target);
  }
  return target;
}

int CarlifeOil::ByteSize() const {
  int total_size = 0;

  if (_has_bits_[0 / 32] & (0xffu << (0 % 32))) {
    // required int32 level = 1;
    if (has_level()) {
      total_size += 1 +
        ::google::protobuf::internal::WireFormatLite::Int32Size(
          this->level());
    }

    // required int32 range = 2;
    if (has_range()) {
      total_size += 1 +
        ::google::protobuf::internal::WireFormatLite::Int32Size(
          this->range());
    }

    // optional bool lowFuleWarning = 3;
    if (has_lowfulewarning()) {
      total_size += 1 + 1;
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

void CarlifeOil::MergeFrom(const ::google::protobuf::Message& from) {
  GOOGLE_CHECK_NE(&from, this);
  const CarlifeOil* source =
    ::google::protobuf::internal::dynamic_cast_if_available<const CarlifeOil*>(
      &from);
  if (source == NULL) {
    ::google::protobuf::internal::ReflectionOps::Merge(from, this);
  } else {
    MergeFrom(*source);
  }
}

void CarlifeOil::MergeFrom(const CarlifeOil& from) {
  GOOGLE_CHECK_NE(&from, this);
  if (from._has_bits_[0 / 32] & (0xffu << (0 % 32))) {
    if (from.has_level()) {
      set_level(from.level());
    }
    if (from.has_range()) {
      set_range(from.range());
    }
    if (from.has_lowfulewarning()) {
      set_lowfulewarning(from.lowfulewarning());
    }
  }
  mutable_unknown_fields()->MergeFrom(from.unknown_fields());
}

void CarlifeOil::CopyFrom(const ::google::protobuf::Message& from) {
  if (&from == this) return;
  Clear();
  MergeFrom(from);
}

void CarlifeOil::CopyFrom(const CarlifeOil& from) {
  if (&from == this) return;
  Clear();
  MergeFrom(from);
}

bool CarlifeOil::IsInitialized() const {
  if ((_has_bits_[0] & 0x00000003) != 0x00000003) return false;

  return true;
}

void CarlifeOil::Swap(CarlifeOil* other) {
  if (other != this) {
    std::swap(level_, other->level_);
    std::swap(range_, other->range_);
    std::swap(lowfulewarning_, other->lowfulewarning_);
    std::swap(_has_bits_[0], other->_has_bits_[0]);
    _unknown_fields_.Swap(&other->_unknown_fields_);
    std::swap(_cached_size_, other->_cached_size_);
  }
}

::google::protobuf::Metadata CarlifeOil::GetMetadata() const {
  protobuf_AssignDescriptorsOnce();
  ::google::protobuf::Metadata metadata;
  metadata.descriptor = CarlifeOil_descriptor_;
  metadata.reflection = CarlifeOil_reflection_;
  return metadata;
}


// @@protoc_insertion_point(namespace_scope)

}  // namespace protobuf
}  // namespace carlife
}  // namespace baidu
}  // namespace com

// @@protoc_insertion_point(global_scope)
