(ns onnx.OnnxMlProto3$TensorShapeProto$DimensionOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxMlProto3$TensorShapeProto$DimensionOrBuilder]))

(defn get-dim-value
  "int64 dim_value = 1;

  returns: `long`"
  (^Long [^OnnxMlProto3$TensorShapeProto$DimensionOrBuilder this]
    (-> this (.getDimValue))))

(defn get-dim-param
  "namespace Shape
  string dim_param = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxMlProto3$TensorShapeProto$DimensionOrBuilder this]
    (-> this (.getDimParam))))

(defn get-dim-param-bytes
  "namespace Shape
  string dim_param = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxMlProto3$TensorShapeProto$DimensionOrBuilder this]
    (-> this (.getDimParamBytes))))

(defn get-value-case
  "returns: `onnx.OnnxMlProto3$TensorShapeProto$Dimension$ValueCase`"
  (^onnx.OnnxMlProto3$TensorShapeProto$Dimension$ValueCase [^OnnxMlProto3$TensorShapeProto$DimensionOrBuilder this]
    (-> this (.getValueCase))))

