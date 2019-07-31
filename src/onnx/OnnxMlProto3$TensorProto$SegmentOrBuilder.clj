(ns onnx.OnnxMlProto3$TensorProto$SegmentOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxMlProto3$TensorProto$SegmentOrBuilder]))

(defn get-begin
  "int64 begin = 1;

  returns: `long`"
  (^Long [^OnnxMlProto3$TensorProto$SegmentOrBuilder this]
    (-> this (.getBegin))))

(defn get-end
  "int64 end = 2;

  returns: `long`"
  (^Long [^OnnxMlProto3$TensorProto$SegmentOrBuilder this]
    (-> this (.getEnd))))

