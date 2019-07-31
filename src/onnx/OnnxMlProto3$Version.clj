(ns onnx.OnnxMlProto3$Version
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxMlProto3$Version]))

(def _START_VERSION
  "Enum Constant.

  proto3 requires the first enum value to be zero.
   We add this just to appease the compiler.
  _START_VERSION = 0;

  type: onnx.OnnxMlProto3$Version"
  OnnxMlProto3$Version/_START_VERSION)

(def IR_VERSION_2017_10_10
  "Enum Constant.

  The version field is always serialized and we will use it to store the
   version that the  graph is generated from. This helps us set up version
   control. We should use version as
       xx(major) - xx(minor) - xxxx(bugfix)
   and we are starting with 0x00000001 (0.0.1), which was the
    version we published on Oct 10, 2017.
  IR_VERSION_2017_10_10 = 1;

  type: onnx.OnnxMlProto3$Version"
  OnnxMlProto3$Version/IR_VERSION_2017_10_10)

(def IR_VERSION_2017_10_30
  "Enum Constant.

  IR_VERSION 0.0.2 published on Oct 30, 2017
   - Added type discriminator to AttributeProto to support proto3 users
  IR_VERSION_2017_10_30 = 2;

  type: onnx.OnnxMlProto3$Version"
  OnnxMlProto3$Version/IR_VERSION_2017_10_30)

(def IR_VERSION
  "Enum Constant.

  IR VERSION 0.0.3 published on Nov 3, 2017
   - For operator versioning:
      - Added new message OperatorSetIdProto
      - Added opset_import in ModelProto
   - For vendor extensions, added domain in NodeProto
  IR_VERSION = 3;

  type: onnx.OnnxMlProto3$Version"
  OnnxMlProto3$Version/IR_VERSION)

(def UNRECOGNIZED
  "Enum Constant.

  type: onnx.OnnxMlProto3$Version"
  OnnxMlProto3$Version/UNRECOGNIZED)

(def *-start-version-value
  "Static Constant.

  proto3 requires the first enum value to be zero.
   We add this just to appease the compiler.
  _START_VERSION = 0;

  type: int"
  OnnxMlProto3$Version/_START_VERSION_VALUE)

(def *-ir-version-2017-10-10-value
  "Static Constant.

  The version field is always serialized and we will use it to store the
   version that the  graph is generated from. This helps us set up version
   control. We should use version as
       xx(major) - xx(minor) - xxxx(bugfix)
   and we are starting with 0x00000001 (0.0.1), which was the
    version we published on Oct 10, 2017.
  IR_VERSION_2017_10_10 = 1;

  type: int"
  OnnxMlProto3$Version/IR_VERSION_2017_10_10_VALUE)

(def *-ir-version-2017-10-30-value
  "Static Constant.

  IR_VERSION 0.0.2 published on Oct 30, 2017
   - Added type discriminator to AttributeProto to support proto3 users
  IR_VERSION_2017_10_30 = 2;

  type: int"
  OnnxMlProto3$Version/IR_VERSION_2017_10_30_VALUE)

(def *-ir-version-value
  "Static Constant.

  IR VERSION 0.0.3 published on Nov 3, 2017
   - For operator versioning:
      - Added new message OperatorSetIdProto
      - Added opset_import in ModelProto
   - For vendor extensions, added domain in NodeProto
  IR_VERSION = 3;

  type: int"
  OnnxMlProto3$Version/IR_VERSION_VALUE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (OnnxMlProto3.Version c : OnnxMlProto3.Version.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `onnx.OnnxMlProto3$Version[]`"
  ([]
    (OnnxMlProto3$Version/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `onnx.OnnxMlProto3$Version`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^onnx.OnnxMlProto3$Version [^java.lang.String name]
    (OnnxMlProto3$Version/valueOf name)))

(defn *for-number
  "value - `int`

  returns: `onnx.OnnxMlProto3$Version`"
  (^onnx.OnnxMlProto3$Version [^Integer value]
    (OnnxMlProto3$Version/forNumber value)))

(defn *internal-get-value-map
  "returns: `com.github.os72.protobuf351.Internal.EnumLiteMap<onnx.OnnxMlProto3$Version>`"
  (^com.github.os72.protobuf351.Internal.EnumLiteMap []
    (OnnxMlProto3$Version/internalGetValueMap )))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.EnumDescriptor`"
  (^com.github.os72.protobuf351.Descriptors.EnumDescriptor []
    (OnnxMlProto3$Version/getDescriptor )))

(defn get-number
  "returns: `int`"
  (^Integer [^OnnxMlProto3$Version this]
    (-> this (.getNumber))))

(defn get-value-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.EnumValueDescriptor`"
  (^com.github.os72.protobuf351.Descriptors.EnumValueDescriptor [^OnnxMlProto3$Version this]
    (-> this (.getValueDescriptor))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.EnumDescriptor`"
  (^com.github.os72.protobuf351.Descriptors.EnumDescriptor [^OnnxMlProto3$Version this]
    (-> this (.getDescriptorForType))))

