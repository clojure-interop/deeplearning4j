(ns onnx.OnnxProto3$TypeProto$TensorOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxProto3$TypeProto$TensorOrBuilder]))

(defn get-elem-type-value
  "This field MUST NOT have the value of UNDEFINED
   This field MUST be present for this version of the IR.
  .onnx.TensorProto.DataType elem_type = 1;

  returns: `int`"
  (^Integer [^OnnxProto3$TypeProto$TensorOrBuilder this]
    (-> this (.getElemTypeValue))))

(defn get-elem-type
  "This field MUST NOT have the value of UNDEFINED
   This field MUST be present for this version of the IR.
  .onnx.TensorProto.DataType elem_type = 1;

  returns: `onnx.OnnxProto3$TensorProto$DataType`"
  (^onnx.OnnxProto3$TensorProto$DataType [^OnnxProto3$TypeProto$TensorOrBuilder this]
    (-> this (.getElemType))))

(defn has-shape?
  ".onnx.TensorShapeProto shape = 2;

  returns: `boolean`"
  (^Boolean [^OnnxProto3$TypeProto$TensorOrBuilder this]
    (-> this (.hasShape))))

(defn get-shape
  ".onnx.TensorShapeProto shape = 2;

  returns: `onnx.OnnxProto3$TensorShapeProto`"
  (^onnx.OnnxProto3$TensorShapeProto [^OnnxProto3$TypeProto$TensorOrBuilder this]
    (-> this (.getShape))))

(defn get-shape-or-builder
  ".onnx.TensorShapeProto shape = 2;

  returns: `onnx.OnnxProto3$TensorShapeProtoOrBuilder`"
  (^onnx.OnnxProto3$TensorShapeProtoOrBuilder [^OnnxProto3$TypeProto$TensorOrBuilder this]
    (-> this (.getShapeOrBuilder))))

