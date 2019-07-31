(ns onnx.OnnxMlProto3$TypeProto$SequenceOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxMlProto3$TypeProto$SequenceOrBuilder]))

(defn has-elem-type?
  "The type and optional shape of each element of the sequence.
   This field MUST be present for this version of the IR.
  .onnx.TypeProto elem_type = 1;

  returns: `boolean`"
  (^Boolean [^OnnxMlProto3$TypeProto$SequenceOrBuilder this]
    (-> this (.hasElemType))))

(defn get-elem-type
  "The type and optional shape of each element of the sequence.
   This field MUST be present for this version of the IR.
  .onnx.TypeProto elem_type = 1;

  returns: `onnx.OnnxMlProto3$TypeProto`"
  (^onnx.OnnxMlProto3$TypeProto [^OnnxMlProto3$TypeProto$SequenceOrBuilder this]
    (-> this (.getElemType))))

(defn get-elem-type-or-builder
  "The type and optional shape of each element of the sequence.
   This field MUST be present for this version of the IR.
  .onnx.TypeProto elem_type = 1;

  returns: `onnx.OnnxMlProto3$TypeProtoOrBuilder`"
  (^onnx.OnnxMlProto3$TypeProtoOrBuilder [^OnnxMlProto3$TypeProto$SequenceOrBuilder this]
    (-> this (.getElemTypeOrBuilder))))

