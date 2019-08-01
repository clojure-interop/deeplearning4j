(ns onnx.OnnxProto3$TensorShapeProtoOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxProto3$TensorShapeProtoOrBuilder]))

(defn get-dim-list
  "repeated .onnx.TensorShapeProto.Dimension dim = 1;

  returns: `java.util.List<onnx.OnnxProto3$TensorShapeProto$Dimension>`"
  (^java.util.List [^OnnxProto3$TensorShapeProtoOrBuilder this]
    (-> this (.getDimList))))

(defn get-dim
  "repeated .onnx.TensorShapeProto.Dimension dim = 1;

  index - `int`

  returns: `onnx.OnnxProto3$TensorShapeProto$Dimension`"
  (^onnx.OnnxProto3$TensorShapeProto$Dimension [^OnnxProto3$TensorShapeProtoOrBuilder this ^Integer index]
    (-> this (.getDim index))))

(defn get-dim-count
  "repeated .onnx.TensorShapeProto.Dimension dim = 1;

  returns: `int`"
  (^Integer [^OnnxProto3$TensorShapeProtoOrBuilder this]
    (-> this (.getDimCount))))

(defn get-dim-or-builder-list
  "repeated .onnx.TensorShapeProto.Dimension dim = 1;

  returns: `java.util.List<? extends onnx.OnnxProto3$TensorShapeProto$DimensionOrBuilder>`"
  ([^OnnxProto3$TensorShapeProtoOrBuilder this]
    (-> this (.getDimOrBuilderList))))

(defn get-dim-or-builder
  "repeated .onnx.TensorShapeProto.Dimension dim = 1;

  index - `int`

  returns: `onnx.OnnxProto3$TensorShapeProto$DimensionOrBuilder`"
  (^onnx.OnnxProto3$TensorShapeProto$DimensionOrBuilder [^OnnxProto3$TensorShapeProtoOrBuilder this ^Integer index]
    (-> this (.getDimOrBuilder index))))

