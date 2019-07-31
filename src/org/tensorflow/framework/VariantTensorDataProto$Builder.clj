(ns org.tensorflow.framework.VariantTensorDataProto$Builder
  " Protocol buffer representing the serialization format of DT_VARIANT tensors.
 Protobuf type tensorflow.VariantTensorDataProto"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework VariantTensorDataProto$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (VariantTensorDataProto$Builder/getDescriptor )))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.VariantTensorDataProto$Builder`"
  (^org.tensorflow.framework.VariantTensorDataProto$Builder [^VariantTensorDataProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn set-tensors
  "Tensors contained within objects being serialized.
  repeated .tensorflow.TensorProto tensors = 3;

  index - `int`
  value - `org.tensorflow.framework.TensorProto`

  returns: `org.tensorflow.framework.VariantTensorDataProto$Builder`"
  (^org.tensorflow.framework.VariantTensorDataProto$Builder [^VariantTensorDataProto$Builder this ^Integer index ^org.tensorflow.framework.TensorProto value]
    (-> this (.setTensors index value))))

(defn build-partial
  "returns: `org.tensorflow.framework.VariantTensorDataProto`"
  (^org.tensorflow.framework.VariantTensorDataProto [^VariantTensorDataProto$Builder this]
    (-> this (.buildPartial))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^VariantTensorDataProto$Builder this]
    (-> this (.isInitialized))))

(defn get-tensors-or-builder
  "Tensors contained within objects being serialized.
  repeated .tensorflow.TensorProto tensors = 3;

  index - `int`

  returns: `org.tensorflow.framework.TensorProtoOrBuilder`"
  (^org.tensorflow.framework.TensorProtoOrBuilder [^VariantTensorDataProto$Builder this ^Integer index]
    (-> this (.getTensorsOrBuilder index))))

(defn clear-metadata
  "Portions of the object that are not Tensors.
  bytes metadata = 2;

  returns: `org.tensorflow.framework.VariantTensorDataProto$Builder`"
  (^org.tensorflow.framework.VariantTensorDataProto$Builder [^VariantTensorDataProto$Builder this]
    (-> this (.clearMetadata))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.VariantTensorDataProto`"
  (^org.tensorflow.framework.VariantTensorDataProto [^VariantTensorDataProto$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.VariantTensorDataProto$Builder`"
  (^org.tensorflow.framework.VariantTensorDataProto$Builder [^VariantTensorDataProto$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.VariantTensorDataProto$Builder`"
  (^org.tensorflow.framework.VariantTensorDataProto$Builder [^VariantTensorDataProto$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn get-type-name-bytes
  "Name of the type of objects being serialized.
  string type_name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^VariantTensorDataProto$Builder this]
    (-> this (.getTypeNameBytes))))

(defn get-tensors-builder
  "Tensors contained within objects being serialized.
  repeated .tensorflow.TensorProto tensors = 3;

  index - `int`

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^VariantTensorDataProto$Builder this ^Integer index]
    (-> this (.getTensorsBuilder index))))

(defn add-tensors-builder
  "Tensors contained within objects being serialized.
  repeated .tensorflow.TensorProto tensors = 3;

  index - `int`

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^VariantTensorDataProto$Builder this ^Integer index]
    (-> this (.addTensorsBuilder index)))
  (^org.tensorflow.framework.TensorProto$Builder [^VariantTensorDataProto$Builder this]
    (-> this (.addTensorsBuilder))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.VariantTensorDataProto$Builder`"
  (^org.tensorflow.framework.VariantTensorDataProto$Builder [^VariantTensorDataProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn get-tensors-builder-list
  "Tensors contained within objects being serialized.
  repeated .tensorflow.TensorProto tensors = 3;

  returns: `java.util.List<org.tensorflow.framework.TensorProto$Builder>`"
  (^java.util.List [^VariantTensorDataProto$Builder this]
    (-> this (.getTensorsBuilderList))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.VariantTensorDataProto$Builder`"
  (^org.tensorflow.framework.VariantTensorDataProto$Builder [^VariantTensorDataProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn build
  "returns: `org.tensorflow.framework.VariantTensorDataProto`"
  (^org.tensorflow.framework.VariantTensorDataProto [^VariantTensorDataProto$Builder this]
    (-> this (.build))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.VariantTensorDataProto$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.VariantTensorDataProto$Builder [^VariantTensorDataProto$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.VariantTensorDataProto$Builder [^VariantTensorDataProto$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn get-tensors
  "Tensors contained within objects being serialized.
  repeated .tensorflow.TensorProto tensors = 3;

  index - `int`

  returns: `org.tensorflow.framework.TensorProto`"
  (^org.tensorflow.framework.TensorProto [^VariantTensorDataProto$Builder this ^Integer index]
    (-> this (.getTensors index))))

(defn set-type-name
  "Name of the type of objects being serialized.
  string type_name = 1;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.VariantTensorDataProto$Builder`"
  (^org.tensorflow.framework.VariantTensorDataProto$Builder [^VariantTensorDataProto$Builder this ^java.lang.String value]
    (-> this (.setTypeName value))))

(defn remove-tensors
  "Tensors contained within objects being serialized.
  repeated .tensorflow.TensorProto tensors = 3;

  index - `int`

  returns: `org.tensorflow.framework.VariantTensorDataProto$Builder`"
  (^org.tensorflow.framework.VariantTensorDataProto$Builder [^VariantTensorDataProto$Builder this ^Integer index]
    (-> this (.removeTensors index))))

(defn clear-type-name
  "Name of the type of objects being serialized.
  string type_name = 1;

  returns: `org.tensorflow.framework.VariantTensorDataProto$Builder`"
  (^org.tensorflow.framework.VariantTensorDataProto$Builder [^VariantTensorDataProto$Builder this]
    (-> this (.clearTypeName))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.VariantTensorDataProto$Builder`"
  (^org.tensorflow.framework.VariantTensorDataProto$Builder [^VariantTensorDataProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn get-tensors-or-builder-list
  "Tensors contained within objects being serialized.
  repeated .tensorflow.TensorProto tensors = 3;

  returns: `java.util.List<? extends org.tensorflow.framework.TensorProtoOrBuilder>`"
  ([^VariantTensorDataProto$Builder this]
    (-> this (.getTensorsOrBuilderList))))

(defn clone
  "returns: `org.tensorflow.framework.VariantTensorDataProto$Builder`"
  (^org.tensorflow.framework.VariantTensorDataProto$Builder [^VariantTensorDataProto$Builder this]
    (-> this (.clone))))

(defn get-tensors-list
  "Tensors contained within objects being serialized.
  repeated .tensorflow.TensorProto tensors = 3;

  returns: `java.util.List<org.tensorflow.framework.TensorProto>`"
  (^java.util.List [^VariantTensorDataProto$Builder this]
    (-> this (.getTensorsList))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^VariantTensorDataProto$Builder this]
    (-> this (.getDescriptorForType))))

(defn get-metadata
  "Portions of the object that are not Tensors.
  bytes metadata = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^VariantTensorDataProto$Builder this]
    (-> this (.getMetadata))))

(defn add-all-tensors
  "Tensors contained within objects being serialized.
  repeated .tensorflow.TensorProto tensors = 3;

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.VariantTensorDataProto$Builder`"
  (^org.tensorflow.framework.VariantTensorDataProto$Builder [^VariantTensorDataProto$Builder this ^java.lang.Iterable values]
    (-> this (.addAllTensors values))))

(defn clear
  "returns: `org.tensorflow.framework.VariantTensorDataProto$Builder`"
  (^org.tensorflow.framework.VariantTensorDataProto$Builder [^VariantTensorDataProto$Builder this]
    (-> this (.clear))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.VariantTensorDataProto$Builder`"
  (^org.tensorflow.framework.VariantTensorDataProto$Builder [^VariantTensorDataProto$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn clear-tensors
  "Tensors contained within objects being serialized.
  repeated .tensorflow.TensorProto tensors = 3;

  returns: `org.tensorflow.framework.VariantTensorDataProto$Builder`"
  (^org.tensorflow.framework.VariantTensorDataProto$Builder [^VariantTensorDataProto$Builder this]
    (-> this (.clearTensors))))

(defn get-type-name
  "Name of the type of objects being serialized.
  string type_name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^VariantTensorDataProto$Builder this]
    (-> this (.getTypeName))))

(defn set-metadata
  "Portions of the object that are not Tensors.
  bytes metadata = 2;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.VariantTensorDataProto$Builder`"
  (^org.tensorflow.framework.VariantTensorDataProto$Builder [^VariantTensorDataProto$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setMetadata value))))

(defn add-tensors
  "Tensors contained within objects being serialized.
  repeated .tensorflow.TensorProto tensors = 3;

  index - `int`
  value - `org.tensorflow.framework.TensorProto`

  returns: `org.tensorflow.framework.VariantTensorDataProto$Builder`"
  (^org.tensorflow.framework.VariantTensorDataProto$Builder [^VariantTensorDataProto$Builder this ^Integer index ^org.tensorflow.framework.TensorProto value]
    (-> this (.addTensors index value)))
  (^org.tensorflow.framework.VariantTensorDataProto$Builder [^VariantTensorDataProto$Builder this ^org.tensorflow.framework.TensorProto value]
    (-> this (.addTensors value))))

(defn get-tensors-count
  "Tensors contained within objects being serialized.
  repeated .tensorflow.TensorProto tensors = 3;

  returns: `int`"
  (^Integer [^VariantTensorDataProto$Builder this]
    (-> this (.getTensorsCount))))

(defn set-type-name-bytes
  "Name of the type of objects being serialized.
  string type_name = 1;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.VariantTensorDataProto$Builder`"
  (^org.tensorflow.framework.VariantTensorDataProto$Builder [^VariantTensorDataProto$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setTypeNameBytes value))))

