(ns onnx.OnnxMlProto3$TensorShapeProto$Dimension$ValueCase
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxMlProto3$TensorShapeProto$Dimension$ValueCase]))

(def DIM_VALUE
  "Enum Constant.

  type: onnx.OnnxMlProto3$TensorShapeProto$Dimension$ValueCase"
  OnnxMlProto3$TensorShapeProto$Dimension$ValueCase/DIM_VALUE)

(def DIM_PARAM
  "Enum Constant.

  type: onnx.OnnxMlProto3$TensorShapeProto$Dimension$ValueCase"
  OnnxMlProto3$TensorShapeProto$Dimension$ValueCase/DIM_PARAM)

(def VALUE_NOT_SET
  "Enum Constant.

  type: onnx.OnnxMlProto3$TensorShapeProto$Dimension$ValueCase"
  OnnxMlProto3$TensorShapeProto$Dimension$ValueCase/VALUE_NOT_SET)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (OnnxMlProto3.TensorShapeProto.Dimension.ValueCase c : OnnxMlProto3.TensorShapeProto.Dimension.ValueCase.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `onnx.OnnxMlProto3$TensorShapeProto$Dimension$ValueCase[]`"
  ([]
    (OnnxMlProto3$TensorShapeProto$Dimension$ValueCase/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `onnx.OnnxMlProto3$TensorShapeProto$Dimension$ValueCase`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^onnx.OnnxMlProto3$TensorShapeProto$Dimension$ValueCase [^java.lang.String name]
    (OnnxMlProto3$TensorShapeProto$Dimension$ValueCase/valueOf name)))

(defn *for-number
  "value - `int`

  returns: `onnx.OnnxMlProto3$TensorShapeProto$Dimension$ValueCase`"
  (^onnx.OnnxMlProto3$TensorShapeProto$Dimension$ValueCase [^Integer value]
    (OnnxMlProto3$TensorShapeProto$Dimension$ValueCase/forNumber value)))

(defn get-number
  "returns: `int`"
  (^Integer [^OnnxMlProto3$TensorShapeProto$Dimension$ValueCase this]
    (-> this (.getNumber))))

