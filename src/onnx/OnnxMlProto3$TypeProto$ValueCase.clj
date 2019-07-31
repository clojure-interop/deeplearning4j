(ns onnx.OnnxMlProto3$TypeProto$ValueCase
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxMlProto3$TypeProto$ValueCase]))

(def TENSOR_TYPE
  "Enum Constant.

  type: onnx.OnnxMlProto3$TypeProto$ValueCase"
  OnnxMlProto3$TypeProto$ValueCase/TENSOR_TYPE)

(def SEQUENCE_TYPE
  "Enum Constant.

  type: onnx.OnnxMlProto3$TypeProto$ValueCase"
  OnnxMlProto3$TypeProto$ValueCase/SEQUENCE_TYPE)

(def MAP_TYPE
  "Enum Constant.

  type: onnx.OnnxMlProto3$TypeProto$ValueCase"
  OnnxMlProto3$TypeProto$ValueCase/MAP_TYPE)

(def VALUE_NOT_SET
  "Enum Constant.

  type: onnx.OnnxMlProto3$TypeProto$ValueCase"
  OnnxMlProto3$TypeProto$ValueCase/VALUE_NOT_SET)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (OnnxMlProto3.TypeProto.ValueCase c : OnnxMlProto3.TypeProto.ValueCase.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `onnx.OnnxMlProto3$TypeProto$ValueCase[]`"
  ([]
    (OnnxMlProto3$TypeProto$ValueCase/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `onnx.OnnxMlProto3$TypeProto$ValueCase`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^onnx.OnnxMlProto3$TypeProto$ValueCase [^java.lang.String name]
    (OnnxMlProto3$TypeProto$ValueCase/valueOf name)))

(defn *for-number
  "value - `int`

  returns: `onnx.OnnxMlProto3$TypeProto$ValueCase`"
  (^onnx.OnnxMlProto3$TypeProto$ValueCase [^Integer value]
    (OnnxMlProto3$TypeProto$ValueCase/forNumber value)))

(defn get-number
  "returns: `int`"
  (^Integer [^OnnxMlProto3$TypeProto$ValueCase this]
    (-> this (.getNumber))))

