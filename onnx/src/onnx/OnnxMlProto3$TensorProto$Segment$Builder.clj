(ns onnx.OnnxMlProto3$TensorProto$Segment$Builder
  " For very large tensors, we may want to store them in chunks, in which
  case the following fields will specify the segment that is stored in
  the current TensorProto.
 Protobuf type onnx.TensorProto.Segment"
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxMlProto3$TensorProto$Segment$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (OnnxMlProto3$TensorProto$Segment$Builder/getDescriptor )))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `onnx.OnnxMlProto3$TensorProto$Segment$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Segment$Builder [^OnnxMlProto3$TensorProto$Segment$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn build-partial
  "returns: `onnx.OnnxMlProto3$TensorProto$Segment`"
  (^onnx.OnnxMlProto3$TensorProto$Segment [^OnnxMlProto3$TensorProto$Segment$Builder this]
    (-> this (.buildPartial))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^OnnxMlProto3$TensorProto$Segment$Builder this]
    (-> this (.isInitialized))))

(defn get-begin
  "int64 begin = 1;

  returns: `long`"
  (^Long [^OnnxMlProto3$TensorProto$Segment$Builder this]
    (-> this (.getBegin))))

(defn get-default-instance-for-type
  "returns: `onnx.OnnxMlProto3$TensorProto$Segment`"
  (^onnx.OnnxMlProto3$TensorProto$Segment [^OnnxMlProto3$TensorProto$Segment$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `onnx.OnnxMlProto3$TensorProto$Segment$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Segment$Builder [^OnnxMlProto3$TensorProto$Segment$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `onnx.OnnxMlProto3$TensorProto$Segment$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Segment$Builder [^OnnxMlProto3$TensorProto$Segment$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn clear-begin
  "int64 begin = 1;

  returns: `onnx.OnnxMlProto3$TensorProto$Segment$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Segment$Builder [^OnnxMlProto3$TensorProto$Segment$Builder this]
    (-> this (.clearBegin))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `onnx.OnnxMlProto3$TensorProto$Segment$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Segment$Builder [^OnnxMlProto3$TensorProto$Segment$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn set-begin
  "int64 begin = 1;

  value - `long`

  returns: `onnx.OnnxMlProto3$TensorProto$Segment$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Segment$Builder [^OnnxMlProto3$TensorProto$Segment$Builder this ^Long value]
    (-> this (.setBegin value))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `onnx.OnnxMlProto3$TensorProto$Segment$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Segment$Builder [^OnnxMlProto3$TensorProto$Segment$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn build
  "returns: `onnx.OnnxMlProto3$TensorProto$Segment`"
  (^onnx.OnnxMlProto3$TensorProto$Segment [^OnnxMlProto3$TensorProto$Segment$Builder this]
    (-> this (.build))))

(defn get-end
  "int64 end = 2;

  returns: `long`"
  (^Long [^OnnxMlProto3$TensorProto$Segment$Builder this]
    (-> this (.getEnd))))

(defn set-end
  "int64 end = 2;

  value - `long`

  returns: `onnx.OnnxMlProto3$TensorProto$Segment$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Segment$Builder [^OnnxMlProto3$TensorProto$Segment$Builder this ^Long value]
    (-> this (.setEnd value))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `onnx.OnnxMlProto3$TensorProto$Segment$Builder`

  throws: java.io.IOException"
  (^onnx.OnnxMlProto3$TensorProto$Segment$Builder [^OnnxMlProto3$TensorProto$Segment$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^onnx.OnnxMlProto3$TensorProto$Segment$Builder [^OnnxMlProto3$TensorProto$Segment$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `onnx.OnnxMlProto3$TensorProto$Segment$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Segment$Builder [^OnnxMlProto3$TensorProto$Segment$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn clone
  "returns: `onnx.OnnxMlProto3$TensorProto$Segment$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Segment$Builder [^OnnxMlProto3$TensorProto$Segment$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^OnnxMlProto3$TensorProto$Segment$Builder this]
    (-> this (.getDescriptorForType))))

(defn clear
  "returns: `onnx.OnnxMlProto3$TensorProto$Segment$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Segment$Builder [^OnnxMlProto3$TensorProto$Segment$Builder this]
    (-> this (.clear))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `onnx.OnnxMlProto3$TensorProto$Segment$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Segment$Builder [^OnnxMlProto3$TensorProto$Segment$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn clear-end
  "int64 end = 2;

  returns: `onnx.OnnxMlProto3$TensorProto$Segment$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Segment$Builder [^OnnxMlProto3$TensorProto$Segment$Builder this]
    (-> this (.clearEnd))))

