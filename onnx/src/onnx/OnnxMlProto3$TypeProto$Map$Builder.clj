(ns onnx.OnnxMlProto3$TypeProto$Map$Builder
  " map<K,V>
 Protobuf type onnx.TypeProto.Map"
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxMlProto3$TypeProto$Map$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (OnnxMlProto3$TypeProto$Map$Builder/getDescriptor )))

(defn set-key-type-value
  "This field MUST be present for this version of the IR.
   This field MUST refer to an integral type ([U]INT{8|16|32|64}) or STRING
  .onnx.TensorProto.DataType key_type = 1;

  value - `int`

  returns: `onnx.OnnxMlProto3$TypeProto$Map$Builder`"
  (^onnx.OnnxMlProto3$TypeProto$Map$Builder [^OnnxMlProto3$TypeProto$Map$Builder this ^Integer value]
    (-> this (.setKeyTypeValue value))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `onnx.OnnxMlProto3$TypeProto$Map$Builder`"
  (^onnx.OnnxMlProto3$TypeProto$Map$Builder [^OnnxMlProto3$TypeProto$Map$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn build-partial
  "returns: `onnx.OnnxMlProto3$TypeProto$Map`"
  (^onnx.OnnxMlProto3$TypeProto$Map [^OnnxMlProto3$TypeProto$Map$Builder this]
    (-> this (.buildPartial))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^OnnxMlProto3$TypeProto$Map$Builder this]
    (-> this (.isInitialized))))

(defn set-key-type
  "This field MUST be present for this version of the IR.
   This field MUST refer to an integral type ([U]INT{8|16|32|64}) or STRING
  .onnx.TensorProto.DataType key_type = 1;

  value - `onnx.OnnxMlProto3$TensorProto$DataType`

  returns: `onnx.OnnxMlProto3$TypeProto$Map$Builder`"
  (^onnx.OnnxMlProto3$TypeProto$Map$Builder [^OnnxMlProto3$TypeProto$Map$Builder this ^onnx.OnnxMlProto3$TensorProto$DataType value]
    (-> this (.setKeyType value))))

(defn set-value-type
  "This field MUST be present for this version of the IR.
  .onnx.TypeProto value_type = 2;

  value - `onnx.OnnxMlProto3$TypeProto`

  returns: `onnx.OnnxMlProto3$TypeProto$Map$Builder`"
  (^onnx.OnnxMlProto3$TypeProto$Map$Builder [^OnnxMlProto3$TypeProto$Map$Builder this ^onnx.OnnxMlProto3$TypeProto value]
    (-> this (.setValueType value))))

(defn get-default-instance-for-type
  "returns: `onnx.OnnxMlProto3$TypeProto$Map`"
  (^onnx.OnnxMlProto3$TypeProto$Map [^OnnxMlProto3$TypeProto$Map$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `onnx.OnnxMlProto3$TypeProto$Map$Builder`"
  (^onnx.OnnxMlProto3$TypeProto$Map$Builder [^OnnxMlProto3$TypeProto$Map$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn has-value-type?
  "This field MUST be present for this version of the IR.
  .onnx.TypeProto value_type = 2;

  returns: `boolean`"
  (^Boolean [^OnnxMlProto3$TypeProto$Map$Builder this]
    (-> this (.hasValueType))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `onnx.OnnxMlProto3$TypeProto$Map$Builder`"
  (^onnx.OnnxMlProto3$TypeProto$Map$Builder [^OnnxMlProto3$TypeProto$Map$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn get-key-type
  "This field MUST be present for this version of the IR.
   This field MUST refer to an integral type ([U]INT{8|16|32|64}) or STRING
  .onnx.TensorProto.DataType key_type = 1;

  returns: `onnx.OnnxMlProto3$TensorProto$DataType`"
  (^onnx.OnnxMlProto3$TensorProto$DataType [^OnnxMlProto3$TypeProto$Map$Builder this]
    (-> this (.getKeyType))))

(defn get-value-type-or-builder
  "This field MUST be present for this version of the IR.
  .onnx.TypeProto value_type = 2;

  returns: `onnx.OnnxMlProto3$TypeProtoOrBuilder`"
  (^onnx.OnnxMlProto3$TypeProtoOrBuilder [^OnnxMlProto3$TypeProto$Map$Builder this]
    (-> this (.getValueTypeOrBuilder))))

(defn get-value-type-builder
  "This field MUST be present for this version of the IR.
  .onnx.TypeProto value_type = 2;

  returns: `onnx.OnnxMlProto3$TypeProto$Builder`"
  (^onnx.OnnxMlProto3$TypeProto$Builder [^OnnxMlProto3$TypeProto$Map$Builder this]
    (-> this (.getValueTypeBuilder))))

(defn merge-value-type
  "This field MUST be present for this version of the IR.
  .onnx.TypeProto value_type = 2;

  value - `onnx.OnnxMlProto3$TypeProto`

  returns: `onnx.OnnxMlProto3$TypeProto$Map$Builder`"
  (^onnx.OnnxMlProto3$TypeProto$Map$Builder [^OnnxMlProto3$TypeProto$Map$Builder this ^onnx.OnnxMlProto3$TypeProto value]
    (-> this (.mergeValueType value))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `onnx.OnnxMlProto3$TypeProto$Map$Builder`"
  (^onnx.OnnxMlProto3$TypeProto$Map$Builder [^OnnxMlProto3$TypeProto$Map$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn get-value-type
  "This field MUST be present for this version of the IR.
  .onnx.TypeProto value_type = 2;

  returns: `onnx.OnnxMlProto3$TypeProto`"
  (^onnx.OnnxMlProto3$TypeProto [^OnnxMlProto3$TypeProto$Map$Builder this]
    (-> this (.getValueType))))

(defn clear-value-type
  "This field MUST be present for this version of the IR.
  .onnx.TypeProto value_type = 2;

  returns: `onnx.OnnxMlProto3$TypeProto$Map$Builder`"
  (^onnx.OnnxMlProto3$TypeProto$Map$Builder [^OnnxMlProto3$TypeProto$Map$Builder this]
    (-> this (.clearValueType))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `onnx.OnnxMlProto3$TypeProto$Map$Builder`"
  (^onnx.OnnxMlProto3$TypeProto$Map$Builder [^OnnxMlProto3$TypeProto$Map$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn build
  "returns: `onnx.OnnxMlProto3$TypeProto$Map`"
  (^onnx.OnnxMlProto3$TypeProto$Map [^OnnxMlProto3$TypeProto$Map$Builder this]
    (-> this (.build))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `onnx.OnnxMlProto3$TypeProto$Map$Builder`

  throws: java.io.IOException"
  (^onnx.OnnxMlProto3$TypeProto$Map$Builder [^OnnxMlProto3$TypeProto$Map$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^onnx.OnnxMlProto3$TypeProto$Map$Builder [^OnnxMlProto3$TypeProto$Map$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `onnx.OnnxMlProto3$TypeProto$Map$Builder`"
  (^onnx.OnnxMlProto3$TypeProto$Map$Builder [^OnnxMlProto3$TypeProto$Map$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn clear-key-type
  "This field MUST be present for this version of the IR.
   This field MUST refer to an integral type ([U]INT{8|16|32|64}) or STRING
  .onnx.TensorProto.DataType key_type = 1;

  returns: `onnx.OnnxMlProto3$TypeProto$Map$Builder`"
  (^onnx.OnnxMlProto3$TypeProto$Map$Builder [^OnnxMlProto3$TypeProto$Map$Builder this]
    (-> this (.clearKeyType))))

(defn clone
  "returns: `onnx.OnnxMlProto3$TypeProto$Map$Builder`"
  (^onnx.OnnxMlProto3$TypeProto$Map$Builder [^OnnxMlProto3$TypeProto$Map$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^OnnxMlProto3$TypeProto$Map$Builder this]
    (-> this (.getDescriptorForType))))

(defn clear
  "returns: `onnx.OnnxMlProto3$TypeProto$Map$Builder`"
  (^onnx.OnnxMlProto3$TypeProto$Map$Builder [^OnnxMlProto3$TypeProto$Map$Builder this]
    (-> this (.clear))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `onnx.OnnxMlProto3$TypeProto$Map$Builder`"
  (^onnx.OnnxMlProto3$TypeProto$Map$Builder [^OnnxMlProto3$TypeProto$Map$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn get-key-type-value
  "This field MUST be present for this version of the IR.
   This field MUST refer to an integral type ([U]INT{8|16|32|64}) or STRING
  .onnx.TensorProto.DataType key_type = 1;

  returns: `int`"
  (^Integer [^OnnxMlProto3$TypeProto$Map$Builder this]
    (-> this (.getKeyTypeValue))))

