(ns onnx.OnnxMlProto3$TypeProto$TensorOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxMlProto3$TypeProto$TensorOrBuilder]))

(defn get-elem-type-value
  "This field MUST NOT have the value of UNDEFINED
   This field MUST be present for this version of the IR.
  .onnx.TensorProto.DataType elem_type = 1;

  returns: `int`"
  (^Integer [^OnnxMlProto3$TypeProto$TensorOrBuilder this]
    (-> this (.getElemTypeValue))))

(defn get-elem-type
  "This field MUST NOT have the value of UNDEFINED
   This field MUST be present for this version of the IR.
  .onnx.TensorProto.DataType elem_type = 1;

  returns: `onnx.OnnxMlProto3$TensorProto$DataType`"
  (^onnx.OnnxMlProto3$TensorProto$DataType [^OnnxMlProto3$TypeProto$TensorOrBuilder this]
    (-> this (.getElemType))))

(defn has-shape?
  ".onnx.TensorShapeProto shape = 2;

  returns: `boolean`"
  (^Boolean [^OnnxMlProto3$TypeProto$TensorOrBuilder this]
    (-> this (.hasShape))))

(defn get-shape
  ".onnx.TensorShapeProto shape = 2;

  returns: `onnx.OnnxMlProto3$TensorShapeProto`"
  (^onnx.OnnxMlProto3$TensorShapeProto [^OnnxMlProto3$TypeProto$TensorOrBuilder this]
    (-> this (.getShape))))

(defn get-shape-or-builder
  ".onnx.TensorShapeProto shape = 2;

  returns: `onnx.OnnxMlProto3$TensorShapeProtoOrBuilder`"
  (^onnx.OnnxMlProto3$TensorShapeProtoOrBuilder [^OnnxMlProto3$TypeProto$TensorOrBuilder this]
    (-> this (.getShapeOrBuilder))))

