(ns onnx.OnnxProto3$TypeProtoOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxProto3$TypeProtoOrBuilder]))

(defn has-tensor-type?
  "The type of a tensor.
  .onnx.TypeProto.Tensor tensor_type = 1;

  returns: `boolean`"
  (^Boolean [^OnnxProto3$TypeProtoOrBuilder this]
    (-> this (.hasTensorType))))

(defn get-tensor-type
  "The type of a tensor.
  .onnx.TypeProto.Tensor tensor_type = 1;

  returns: `onnx.OnnxProto3$TypeProto$Tensor`"
  (^onnx.OnnxProto3$TypeProto$Tensor [^OnnxProto3$TypeProtoOrBuilder this]
    (-> this (.getTensorType))))

(defn get-tensor-type-or-builder
  "The type of a tensor.
  .onnx.TypeProto.Tensor tensor_type = 1;

  returns: `onnx.OnnxProto3$TypeProto$TensorOrBuilder`"
  (^onnx.OnnxProto3$TypeProto$TensorOrBuilder [^OnnxProto3$TypeProtoOrBuilder this]
    (-> this (.getTensorTypeOrBuilder))))

(defn get-value-case
  "returns: `onnx.OnnxProto3$TypeProto$ValueCase`"
  (^onnx.OnnxProto3$TypeProto$ValueCase [^OnnxProto3$TypeProtoOrBuilder this]
    (-> this (.getValueCase))))

