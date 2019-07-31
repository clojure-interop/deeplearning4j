(ns onnx.OnnxMlProto3$TypeProtoOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxMlProto3$TypeProtoOrBuilder]))

(defn get-sequence-type
  "The type of a sequence.
  .onnx.TypeProto.Sequence sequence_type = 4;

  returns: `onnx.OnnxMlProto3$TypeProto$Sequence`"
  (^onnx.OnnxMlProto3$TypeProto$Sequence [^OnnxMlProto3$TypeProtoOrBuilder this]
    (-> this (.getSequenceType))))

(defn get-map-type
  "The type of a map.
  .onnx.TypeProto.Map map_type = 5;

  returns: `onnx.OnnxMlProto3$TypeProto$Map`"
  (^onnx.OnnxMlProto3$TypeProto$Map [^OnnxMlProto3$TypeProtoOrBuilder this]
    (-> this (.getMapType))))

(defn get-map-type-or-builder
  "The type of a map.
  .onnx.TypeProto.Map map_type = 5;

  returns: `onnx.OnnxMlProto3$TypeProto$MapOrBuilder`"
  (^onnx.OnnxMlProto3$TypeProto$MapOrBuilder [^OnnxMlProto3$TypeProtoOrBuilder this]
    (-> this (.getMapTypeOrBuilder))))

(defn has-sequence-type?
  "The type of a sequence.
  .onnx.TypeProto.Sequence sequence_type = 4;

  returns: `boolean`"
  (^Boolean [^OnnxMlProto3$TypeProtoOrBuilder this]
    (-> this (.hasSequenceType))))

(defn has-map-type?
  "The type of a map.
  .onnx.TypeProto.Map map_type = 5;

  returns: `boolean`"
  (^Boolean [^OnnxMlProto3$TypeProtoOrBuilder this]
    (-> this (.hasMapType))))

(defn get-tensor-type
  "The type of a tensor.
  .onnx.TypeProto.Tensor tensor_type = 1;

  returns: `onnx.OnnxMlProto3$TypeProto$Tensor`"
  (^onnx.OnnxMlProto3$TypeProto$Tensor [^OnnxMlProto3$TypeProtoOrBuilder this]
    (-> this (.getTensorType))))

(defn get-sequence-type-or-builder
  "The type of a sequence.
  .onnx.TypeProto.Sequence sequence_type = 4;

  returns: `onnx.OnnxMlProto3$TypeProto$SequenceOrBuilder`"
  (^onnx.OnnxMlProto3$TypeProto$SequenceOrBuilder [^OnnxMlProto3$TypeProtoOrBuilder this]
    (-> this (.getSequenceTypeOrBuilder))))

(defn get-value-case
  "returns: `onnx.OnnxMlProto3$TypeProto$ValueCase`"
  (^onnx.OnnxMlProto3$TypeProto$ValueCase [^OnnxMlProto3$TypeProtoOrBuilder this]
    (-> this (.getValueCase))))

(defn get-tensor-type-or-builder
  "The type of a tensor.
  .onnx.TypeProto.Tensor tensor_type = 1;

  returns: `onnx.OnnxMlProto3$TypeProto$TensorOrBuilder`"
  (^onnx.OnnxMlProto3$TypeProto$TensorOrBuilder [^OnnxMlProto3$TypeProtoOrBuilder this]
    (-> this (.getTensorTypeOrBuilder))))

(defn has-tensor-type?
  "The type of a tensor.
  .onnx.TypeProto.Tensor tensor_type = 1;

  returns: `boolean`"
  (^Boolean [^OnnxMlProto3$TypeProtoOrBuilder this]
    (-> this (.hasTensorType))))

