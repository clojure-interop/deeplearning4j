(ns onnx.OnnxOperatorsProto3$OperatorProto$OperatorStatus
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxOperatorsProto3$OperatorProto$OperatorStatus]))

(def EXPERIMENTAL
  "Enum Constant.

  EXPERIMENTAL = 0;

  type: onnx.OnnxOperatorsProto3$OperatorProto$OperatorStatus"
  OnnxOperatorsProto3$OperatorProto$OperatorStatus/EXPERIMENTAL)

(def STABLE
  "Enum Constant.

  STABLE = 1;

  type: onnx.OnnxOperatorsProto3$OperatorProto$OperatorStatus"
  OnnxOperatorsProto3$OperatorProto$OperatorStatus/STABLE)

(def UNRECOGNIZED
  "Enum Constant.

  type: onnx.OnnxOperatorsProto3$OperatorProto$OperatorStatus"
  OnnxOperatorsProto3$OperatorProto$OperatorStatus/UNRECOGNIZED)

(def *-experimental-value
  "Static Constant.

  EXPERIMENTAL = 0;

  type: int"
  OnnxOperatorsProto3$OperatorProto$OperatorStatus/EXPERIMENTAL_VALUE)

(def *-stable-value
  "Static Constant.

  STABLE = 1;

  type: int"
  OnnxOperatorsProto3$OperatorProto$OperatorStatus/STABLE_VALUE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (OnnxOperatorsProto3.OperatorProto.OperatorStatus c : OnnxOperatorsProto3.OperatorProto.OperatorStatus.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `onnx.OnnxOperatorsProto3$OperatorProto$OperatorStatus[]`"
  ([]
    (OnnxOperatorsProto3$OperatorProto$OperatorStatus/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `onnx.OnnxOperatorsProto3$OperatorProto$OperatorStatus`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^onnx.OnnxOperatorsProto3$OperatorProto$OperatorStatus [^java.lang.String name]
    (OnnxOperatorsProto3$OperatorProto$OperatorStatus/valueOf name)))

(defn *for-number
  "value - `int`

  returns: `onnx.OnnxOperatorsProto3$OperatorProto$OperatorStatus`"
  (^onnx.OnnxOperatorsProto3$OperatorProto$OperatorStatus [^Integer value]
    (OnnxOperatorsProto3$OperatorProto$OperatorStatus/forNumber value)))

(defn *internal-get-value-map
  "returns: `com.github.os72.protobuf351.Internal.EnumLiteMap<onnx.OnnxOperatorsProto3$OperatorProto$OperatorStatus>`"
  (^com.github.os72.protobuf351.Internal.EnumLiteMap []
    (OnnxOperatorsProto3$OperatorProto$OperatorStatus/internalGetValueMap )))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.EnumDescriptor`"
  (^com.github.os72.protobuf351.Descriptors.EnumDescriptor []
    (OnnxOperatorsProto3$OperatorProto$OperatorStatus/getDescriptor )))

(defn get-number
  "returns: `int`"
  (^Integer [^OnnxOperatorsProto3$OperatorProto$OperatorStatus this]
    (-> this (.getNumber))))

(defn get-value-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.EnumValueDescriptor`"
  (^com.github.os72.protobuf351.Descriptors.EnumValueDescriptor [^OnnxOperatorsProto3$OperatorProto$OperatorStatus this]
    (-> this (.getValueDescriptor))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.EnumDescriptor`"
  (^com.github.os72.protobuf351.Descriptors.EnumDescriptor [^OnnxOperatorsProto3$OperatorProto$OperatorStatus this]
    (-> this (.getDescriptorForType))))

