(ns onnx.OnnxMlProto3$TensorShapeProtoOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxMlProto3$TensorShapeProtoOrBuilder]))

(defn get-dim-list
  "repeated .onnx.TensorShapeProto.Dimension dim = 1;

  returns: `java.util.List<onnx.OnnxMlProto3$TensorShapeProto$Dimension>`"
  (^java.util.List [^OnnxMlProto3$TensorShapeProtoOrBuilder this]
    (-> this (.getDimList))))

(defn get-dim
  "repeated .onnx.TensorShapeProto.Dimension dim = 1;

  index - `int`

  returns: `onnx.OnnxMlProto3$TensorShapeProto$Dimension`"
  (^onnx.OnnxMlProto3$TensorShapeProto$Dimension [^OnnxMlProto3$TensorShapeProtoOrBuilder this ^Integer index]
    (-> this (.getDim index))))

(defn get-dim-count
  "repeated .onnx.TensorShapeProto.Dimension dim = 1;

  returns: `int`"
  (^Integer [^OnnxMlProto3$TensorShapeProtoOrBuilder this]
    (-> this (.getDimCount))))

(defn get-dim-or-builder-list
  "repeated .onnx.TensorShapeProto.Dimension dim = 1;

  returns: `java.util.List<? extends onnx.OnnxMlProto3$TensorShapeProto$DimensionOrBuilder>`"
  ([^OnnxMlProto3$TensorShapeProtoOrBuilder this]
    (-> this (.getDimOrBuilderList))))

(defn get-dim-or-builder
  "repeated .onnx.TensorShapeProto.Dimension dim = 1;

  index - `int`

  returns: `onnx.OnnxMlProto3$TensorShapeProto$DimensionOrBuilder`"
  (^onnx.OnnxMlProto3$TensorShapeProto$DimensionOrBuilder [^OnnxMlProto3$TensorShapeProtoOrBuilder this ^Integer index]
    (-> this (.getDimOrBuilder index))))

