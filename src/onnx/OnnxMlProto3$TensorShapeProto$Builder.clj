(ns onnx.OnnxMlProto3$TensorShapeProto$Builder
  " Defines a tensor shape. A dimension can be either an integer value
  or a symbolic variable. A symbolic variable represents an unknown
  dimension.
 Protobuf type onnx.TensorShapeProto"
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxMlProto3$TensorShapeProto$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (OnnxMlProto3$TensorShapeProto$Builder/getDescriptor )))

(defn set-dim
  "repeated .onnx.TensorShapeProto.Dimension dim = 1;

  index - `int`
  value - `onnx.OnnxMlProto3$TensorShapeProto$Dimension`

  returns: `onnx.OnnxMlProto3$TensorShapeProto$Builder`"
  (^onnx.OnnxMlProto3$TensorShapeProto$Builder [^OnnxMlProto3$TensorShapeProto$Builder this ^Integer index ^onnx.OnnxMlProto3$TensorShapeProto$Dimension value]
    (-> this (.setDim index value))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `onnx.OnnxMlProto3$TensorShapeProto$Builder`"
  (^onnx.OnnxMlProto3$TensorShapeProto$Builder [^OnnxMlProto3$TensorShapeProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn build-partial
  "returns: `onnx.OnnxMlProto3$TensorShapeProto`"
  (^onnx.OnnxMlProto3$TensorShapeProto [^OnnxMlProto3$TensorShapeProto$Builder this]
    (-> this (.buildPartial))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^OnnxMlProto3$TensorShapeProto$Builder this]
    (-> this (.isInitialized))))

(defn get-dim-builder
  "repeated .onnx.TensorShapeProto.Dimension dim = 1;

  index - `int`

  returns: `onnx.OnnxMlProto3$TensorShapeProto$Dimension$Builder`"
  (^onnx.OnnxMlProto3$TensorShapeProto$Dimension$Builder [^OnnxMlProto3$TensorShapeProto$Builder this ^Integer index]
    (-> this (.getDimBuilder index))))

(defn get-dim-builder-list
  "repeated .onnx.TensorShapeProto.Dimension dim = 1;

  returns: `java.util.List<onnx.OnnxMlProto3$TensorShapeProto$Dimension$Builder>`"
  (^java.util.List [^OnnxMlProto3$TensorShapeProto$Builder this]
    (-> this (.getDimBuilderList))))

(defn get-default-instance-for-type
  "returns: `onnx.OnnxMlProto3$TensorShapeProto`"
  (^onnx.OnnxMlProto3$TensorShapeProto [^OnnxMlProto3$TensorShapeProto$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `onnx.OnnxMlProto3$TensorShapeProto$Builder`"
  (^onnx.OnnxMlProto3$TensorShapeProto$Builder [^OnnxMlProto3$TensorShapeProto$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn get-dim
  "repeated .onnx.TensorShapeProto.Dimension dim = 1;

  index - `int`

  returns: `onnx.OnnxMlProto3$TensorShapeProto$Dimension`"
  (^onnx.OnnxMlProto3$TensorShapeProto$Dimension [^OnnxMlProto3$TensorShapeProto$Builder this ^Integer index]
    (-> this (.getDim index))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `onnx.OnnxMlProto3$TensorShapeProto$Builder`"
  (^onnx.OnnxMlProto3$TensorShapeProto$Builder [^OnnxMlProto3$TensorShapeProto$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn add-all-dim
  "repeated .onnx.TensorShapeProto.Dimension dim = 1;

  values - `java.lang.Iterable`

  returns: `onnx.OnnxMlProto3$TensorShapeProto$Builder`"
  (^onnx.OnnxMlProto3$TensorShapeProto$Builder [^OnnxMlProto3$TensorShapeProto$Builder this ^java.lang.Iterable values]
    (-> this (.addAllDim values))))

(defn get-dim-or-builder
  "repeated .onnx.TensorShapeProto.Dimension dim = 1;

  index - `int`

  returns: `onnx.OnnxMlProto3$TensorShapeProto$DimensionOrBuilder`"
  (^onnx.OnnxMlProto3$TensorShapeProto$DimensionOrBuilder [^OnnxMlProto3$TensorShapeProto$Builder this ^Integer index]
    (-> this (.getDimOrBuilder index))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `onnx.OnnxMlProto3$TensorShapeProto$Builder`"
  (^onnx.OnnxMlProto3$TensorShapeProto$Builder [^OnnxMlProto3$TensorShapeProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `onnx.OnnxMlProto3$TensorShapeProto$Builder`"
  (^onnx.OnnxMlProto3$TensorShapeProto$Builder [^OnnxMlProto3$TensorShapeProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn get-dim-list
  "repeated .onnx.TensorShapeProto.Dimension dim = 1;

  returns: `java.util.List<onnx.OnnxMlProto3$TensorShapeProto$Dimension>`"
  (^java.util.List [^OnnxMlProto3$TensorShapeProto$Builder this]
    (-> this (.getDimList))))

(defn build
  "returns: `onnx.OnnxMlProto3$TensorShapeProto`"
  (^onnx.OnnxMlProto3$TensorShapeProto [^OnnxMlProto3$TensorShapeProto$Builder this]
    (-> this (.build))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `onnx.OnnxMlProto3$TensorShapeProto$Builder`

  throws: java.io.IOException"
  (^onnx.OnnxMlProto3$TensorShapeProto$Builder [^OnnxMlProto3$TensorShapeProto$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^onnx.OnnxMlProto3$TensorShapeProto$Builder [^OnnxMlProto3$TensorShapeProto$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `onnx.OnnxMlProto3$TensorShapeProto$Builder`"
  (^onnx.OnnxMlProto3$TensorShapeProto$Builder [^OnnxMlProto3$TensorShapeProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn clone
  "returns: `onnx.OnnxMlProto3$TensorShapeProto$Builder`"
  (^onnx.OnnxMlProto3$TensorShapeProto$Builder [^OnnxMlProto3$TensorShapeProto$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^OnnxMlProto3$TensorShapeProto$Builder this]
    (-> this (.getDescriptorForType))))

(defn add-dim
  "repeated .onnx.TensorShapeProto.Dimension dim = 1;

  index - `int`
  value - `onnx.OnnxMlProto3$TensorShapeProto$Dimension`

  returns: `onnx.OnnxMlProto3$TensorShapeProto$Builder`"
  (^onnx.OnnxMlProto3$TensorShapeProto$Builder [^OnnxMlProto3$TensorShapeProto$Builder this ^Integer index ^onnx.OnnxMlProto3$TensorShapeProto$Dimension value]
    (-> this (.addDim index value)))
  (^onnx.OnnxMlProto3$TensorShapeProto$Builder [^OnnxMlProto3$TensorShapeProto$Builder this ^onnx.OnnxMlProto3$TensorShapeProto$Dimension value]
    (-> this (.addDim value))))

(defn clear
  "returns: `onnx.OnnxMlProto3$TensorShapeProto$Builder`"
  (^onnx.OnnxMlProto3$TensorShapeProto$Builder [^OnnxMlProto3$TensorShapeProto$Builder this]
    (-> this (.clear))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `onnx.OnnxMlProto3$TensorShapeProto$Builder`"
  (^onnx.OnnxMlProto3$TensorShapeProto$Builder [^OnnxMlProto3$TensorShapeProto$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn remove-dim
  "repeated .onnx.TensorShapeProto.Dimension dim = 1;

  index - `int`

  returns: `onnx.OnnxMlProto3$TensorShapeProto$Builder`"
  (^onnx.OnnxMlProto3$TensorShapeProto$Builder [^OnnxMlProto3$TensorShapeProto$Builder this ^Integer index]
    (-> this (.removeDim index))))

(defn clear-dim
  "repeated .onnx.TensorShapeProto.Dimension dim = 1;

  returns: `onnx.OnnxMlProto3$TensorShapeProto$Builder`"
  (^onnx.OnnxMlProto3$TensorShapeProto$Builder [^OnnxMlProto3$TensorShapeProto$Builder this]
    (-> this (.clearDim))))

(defn get-dim-or-builder-list
  "repeated .onnx.TensorShapeProto.Dimension dim = 1;

  returns: `java.util.List<? extends onnx.OnnxMlProto3$TensorShapeProto$DimensionOrBuilder>`"
  ([^OnnxMlProto3$TensorShapeProto$Builder this]
    (-> this (.getDimOrBuilderList))))

(defn get-dim-count
  "repeated .onnx.TensorShapeProto.Dimension dim = 1;

  returns: `int`"
  (^Integer [^OnnxMlProto3$TensorShapeProto$Builder this]
    (-> this (.getDimCount))))

(defn add-dim-builder
  "repeated .onnx.TensorShapeProto.Dimension dim = 1;

  index - `int`

  returns: `onnx.OnnxMlProto3$TensorShapeProto$Dimension$Builder`"
  (^onnx.OnnxMlProto3$TensorShapeProto$Dimension$Builder [^OnnxMlProto3$TensorShapeProto$Builder this ^Integer index]
    (-> this (.addDimBuilder index)))
  (^onnx.OnnxMlProto3$TensorShapeProto$Dimension$Builder [^OnnxMlProto3$TensorShapeProto$Builder this]
    (-> this (.addDimBuilder))))

