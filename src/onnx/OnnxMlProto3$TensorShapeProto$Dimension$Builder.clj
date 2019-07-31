(ns onnx.OnnxMlProto3$TensorShapeProto$Dimension$Builder
  "Protobuf type onnx.TensorShapeProto.Dimension"
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxMlProto3$TensorShapeProto$Dimension$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (OnnxMlProto3$TensorShapeProto$Dimension$Builder/getDescriptor )))

(defn set-dim-param
  "namespace Shape
  string dim_param = 2;

  value - `java.lang.String`

  returns: `onnx.OnnxMlProto3$TensorShapeProto$Dimension$Builder`"
  (^onnx.OnnxMlProto3$TensorShapeProto$Dimension$Builder [^OnnxMlProto3$TensorShapeProto$Dimension$Builder this ^java.lang.String value]
    (-> this (.setDimParam value))))

(defn get-dim-value
  "int64 dim_value = 1;

  returns: `long`"
  (^Long [^OnnxMlProto3$TensorShapeProto$Dimension$Builder this]
    (-> this (.getDimValue))))

(defn get-dim-param-bytes
  "namespace Shape
  string dim_param = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxMlProto3$TensorShapeProto$Dimension$Builder this]
    (-> this (.getDimParamBytes))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `onnx.OnnxMlProto3$TensorShapeProto$Dimension$Builder`"
  (^onnx.OnnxMlProto3$TensorShapeProto$Dimension$Builder [^OnnxMlProto3$TensorShapeProto$Dimension$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn build-partial
  "returns: `onnx.OnnxMlProto3$TensorShapeProto$Dimension`"
  (^onnx.OnnxMlProto3$TensorShapeProto$Dimension [^OnnxMlProto3$TensorShapeProto$Dimension$Builder this]
    (-> this (.buildPartial))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^OnnxMlProto3$TensorShapeProto$Dimension$Builder this]
    (-> this (.isInitialized))))

(defn set-dim-value
  "int64 dim_value = 1;

  value - `long`

  returns: `onnx.OnnxMlProto3$TensorShapeProto$Dimension$Builder`"
  (^onnx.OnnxMlProto3$TensorShapeProto$Dimension$Builder [^OnnxMlProto3$TensorShapeProto$Dimension$Builder this ^Long value]
    (-> this (.setDimValue value))))

(defn get-default-instance-for-type
  "returns: `onnx.OnnxMlProto3$TensorShapeProto$Dimension`"
  (^onnx.OnnxMlProto3$TensorShapeProto$Dimension [^OnnxMlProto3$TensorShapeProto$Dimension$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `onnx.OnnxMlProto3$TensorShapeProto$Dimension$Builder`"
  (^onnx.OnnxMlProto3$TensorShapeProto$Dimension$Builder [^OnnxMlProto3$TensorShapeProto$Dimension$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `onnx.OnnxMlProto3$TensorShapeProto$Dimension$Builder`"
  (^onnx.OnnxMlProto3$TensorShapeProto$Dimension$Builder [^OnnxMlProto3$TensorShapeProto$Dimension$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn get-dim-param
  "namespace Shape
  string dim_param = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxMlProto3$TensorShapeProto$Dimension$Builder this]
    (-> this (.getDimParam))))

(defn clear-value
  "returns: `onnx.OnnxMlProto3$TensorShapeProto$Dimension$Builder`"
  (^onnx.OnnxMlProto3$TensorShapeProto$Dimension$Builder [^OnnxMlProto3$TensorShapeProto$Dimension$Builder this]
    (-> this (.clearValue))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `onnx.OnnxMlProto3$TensorShapeProto$Dimension$Builder`"
  (^onnx.OnnxMlProto3$TensorShapeProto$Dimension$Builder [^OnnxMlProto3$TensorShapeProto$Dimension$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `onnx.OnnxMlProto3$TensorShapeProto$Dimension$Builder`"
  (^onnx.OnnxMlProto3$TensorShapeProto$Dimension$Builder [^OnnxMlProto3$TensorShapeProto$Dimension$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn build
  "returns: `onnx.OnnxMlProto3$TensorShapeProto$Dimension`"
  (^onnx.OnnxMlProto3$TensorShapeProto$Dimension [^OnnxMlProto3$TensorShapeProto$Dimension$Builder this]
    (-> this (.build))))

(defn get-value-case
  "returns: `onnx.OnnxMlProto3$TensorShapeProto$Dimension$ValueCase`"
  (^onnx.OnnxMlProto3$TensorShapeProto$Dimension$ValueCase [^OnnxMlProto3$TensorShapeProto$Dimension$Builder this]
    (-> this (.getValueCase))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `onnx.OnnxMlProto3$TensorShapeProto$Dimension$Builder`

  throws: java.io.IOException"
  (^onnx.OnnxMlProto3$TensorShapeProto$Dimension$Builder [^OnnxMlProto3$TensorShapeProto$Dimension$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^onnx.OnnxMlProto3$TensorShapeProto$Dimension$Builder [^OnnxMlProto3$TensorShapeProto$Dimension$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn clear-dim-value
  "int64 dim_value = 1;

  returns: `onnx.OnnxMlProto3$TensorShapeProto$Dimension$Builder`"
  (^onnx.OnnxMlProto3$TensorShapeProto$Dimension$Builder [^OnnxMlProto3$TensorShapeProto$Dimension$Builder this]
    (-> this (.clearDimValue))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `onnx.OnnxMlProto3$TensorShapeProto$Dimension$Builder`"
  (^onnx.OnnxMlProto3$TensorShapeProto$Dimension$Builder [^OnnxMlProto3$TensorShapeProto$Dimension$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn clone
  "returns: `onnx.OnnxMlProto3$TensorShapeProto$Dimension$Builder`"
  (^onnx.OnnxMlProto3$TensorShapeProto$Dimension$Builder [^OnnxMlProto3$TensorShapeProto$Dimension$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^OnnxMlProto3$TensorShapeProto$Dimension$Builder this]
    (-> this (.getDescriptorForType))))

(defn set-dim-param-bytes
  "namespace Shape
  string dim_param = 2;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `onnx.OnnxMlProto3$TensorShapeProto$Dimension$Builder`"
  (^onnx.OnnxMlProto3$TensorShapeProto$Dimension$Builder [^OnnxMlProto3$TensorShapeProto$Dimension$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setDimParamBytes value))))

(defn clear
  "returns: `onnx.OnnxMlProto3$TensorShapeProto$Dimension$Builder`"
  (^onnx.OnnxMlProto3$TensorShapeProto$Dimension$Builder [^OnnxMlProto3$TensorShapeProto$Dimension$Builder this]
    (-> this (.clear))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `onnx.OnnxMlProto3$TensorShapeProto$Dimension$Builder`"
  (^onnx.OnnxMlProto3$TensorShapeProto$Dimension$Builder [^OnnxMlProto3$TensorShapeProto$Dimension$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn clear-dim-param
  "namespace Shape
  string dim_param = 2;

  returns: `onnx.OnnxMlProto3$TensorShapeProto$Dimension$Builder`"
  (^onnx.OnnxMlProto3$TensorShapeProto$Dimension$Builder [^OnnxMlProto3$TensorShapeProto$Dimension$Builder this]
    (-> this (.clearDimParam))))

