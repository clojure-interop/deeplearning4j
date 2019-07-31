(ns org.tensorflow.util.IteratorStateMetadata$Builder
  " Protocol buffer representing the metadata for an iterator's state stored
  as a Variant tensor.
 Protobuf type tensorflow.IteratorStateMetadata"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.util IteratorStateMetadata$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (IteratorStateMetadata$Builder/getDescriptor )))

(defn get-keys-list
  "Keys for tensors in the VariantTensorDataProto.
  repeated string keys = 2;

  returns: `com.github.os72.protobuf351.ProtocolStringList`"
  (^com.github.os72.protobuf351.ProtocolStringList [^IteratorStateMetadata$Builder this]
    (-> this (.getKeysList))))

(defn set-version
  "A user-specified version string.
  string version = 1;

  value - `java.lang.String`

  returns: `org.tensorflow.util.IteratorStateMetadata$Builder`"
  (^org.tensorflow.util.IteratorStateMetadata$Builder [^IteratorStateMetadata$Builder this ^java.lang.String value]
    (-> this (.setVersion value))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.util.IteratorStateMetadata$Builder`"
  (^org.tensorflow.util.IteratorStateMetadata$Builder [^IteratorStateMetadata$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn build-partial
  "returns: `org.tensorflow.util.IteratorStateMetadata`"
  (^org.tensorflow.util.IteratorStateMetadata [^IteratorStateMetadata$Builder this]
    (-> this (.buildPartial))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^IteratorStateMetadata$Builder this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.util.IteratorStateMetadata`"
  (^org.tensorflow.util.IteratorStateMetadata [^IteratorStateMetadata$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.util.IteratorStateMetadata$Builder`"
  (^org.tensorflow.util.IteratorStateMetadata$Builder [^IteratorStateMetadata$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn get-keys-count
  "Keys for tensors in the VariantTensorDataProto.
  repeated string keys = 2;

  returns: `int`"
  (^Integer [^IteratorStateMetadata$Builder this]
    (-> this (.getKeysCount))))

(defn add-keys
  "Keys for tensors in the VariantTensorDataProto.
  repeated string keys = 2;

  value - `java.lang.String`

  returns: `org.tensorflow.util.IteratorStateMetadata$Builder`"
  (^org.tensorflow.util.IteratorStateMetadata$Builder [^IteratorStateMetadata$Builder this ^java.lang.String value]
    (-> this (.addKeys value))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.util.IteratorStateMetadata$Builder`"
  (^org.tensorflow.util.IteratorStateMetadata$Builder [^IteratorStateMetadata$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.util.IteratorStateMetadata$Builder`"
  (^org.tensorflow.util.IteratorStateMetadata$Builder [^IteratorStateMetadata$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn get-version-bytes
  "A user-specified version string.
  string version = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^IteratorStateMetadata$Builder this]
    (-> this (.getVersionBytes))))

(defn get-keys
  "Keys for tensors in the VariantTensorDataProto.
  repeated string keys = 2;

  index - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^IteratorStateMetadata$Builder this ^Integer index]
    (-> this (.getKeys index))))

(defn clear-version
  "A user-specified version string.
  string version = 1;

  returns: `org.tensorflow.util.IteratorStateMetadata$Builder`"
  (^org.tensorflow.util.IteratorStateMetadata$Builder [^IteratorStateMetadata$Builder this]
    (-> this (.clearVersion))))

(defn set-keys
  "Keys for tensors in the VariantTensorDataProto.
  repeated string keys = 2;

  index - `int`
  value - `java.lang.String`

  returns: `org.tensorflow.util.IteratorStateMetadata$Builder`"
  (^org.tensorflow.util.IteratorStateMetadata$Builder [^IteratorStateMetadata$Builder this ^Integer index ^java.lang.String value]
    (-> this (.setKeys index value))))

(defn add-keys-bytes
  "Keys for tensors in the VariantTensorDataProto.
  repeated string keys = 2;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.util.IteratorStateMetadata$Builder`"
  (^org.tensorflow.util.IteratorStateMetadata$Builder [^IteratorStateMetadata$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.addKeysBytes value))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.util.IteratorStateMetadata$Builder`"
  (^org.tensorflow.util.IteratorStateMetadata$Builder [^IteratorStateMetadata$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn get-version
  "A user-specified version string.
  string version = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^IteratorStateMetadata$Builder this]
    (-> this (.getVersion))))

(defn build
  "returns: `org.tensorflow.util.IteratorStateMetadata`"
  (^org.tensorflow.util.IteratorStateMetadata [^IteratorStateMetadata$Builder this]
    (-> this (.build))))

(defn get-keys-bytes
  "Keys for tensors in the VariantTensorDataProto.
  repeated string keys = 2;

  index - `int`

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^IteratorStateMetadata$Builder this ^Integer index]
    (-> this (.getKeysBytes index))))

(defn set-version-bytes
  "A user-specified version string.
  string version = 1;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.util.IteratorStateMetadata$Builder`"
  (^org.tensorflow.util.IteratorStateMetadata$Builder [^IteratorStateMetadata$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setVersionBytes value))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.util.IteratorStateMetadata$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.util.IteratorStateMetadata$Builder [^IteratorStateMetadata$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.util.IteratorStateMetadata$Builder [^IteratorStateMetadata$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn clear-keys
  "Keys for tensors in the VariantTensorDataProto.
  repeated string keys = 2;

  returns: `org.tensorflow.util.IteratorStateMetadata$Builder`"
  (^org.tensorflow.util.IteratorStateMetadata$Builder [^IteratorStateMetadata$Builder this]
    (-> this (.clearKeys))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.util.IteratorStateMetadata$Builder`"
  (^org.tensorflow.util.IteratorStateMetadata$Builder [^IteratorStateMetadata$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn clone
  "returns: `org.tensorflow.util.IteratorStateMetadata$Builder`"
  (^org.tensorflow.util.IteratorStateMetadata$Builder [^IteratorStateMetadata$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^IteratorStateMetadata$Builder this]
    (-> this (.getDescriptorForType))))

(defn clear
  "returns: `org.tensorflow.util.IteratorStateMetadata$Builder`"
  (^org.tensorflow.util.IteratorStateMetadata$Builder [^IteratorStateMetadata$Builder this]
    (-> this (.clear))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.util.IteratorStateMetadata$Builder`"
  (^org.tensorflow.util.IteratorStateMetadata$Builder [^IteratorStateMetadata$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn add-all-keys
  "Keys for tensors in the VariantTensorDataProto.
  repeated string keys = 2;

  values - `java.lang.Iterable`

  returns: `org.tensorflow.util.IteratorStateMetadata$Builder`"
  (^org.tensorflow.util.IteratorStateMetadata$Builder [^IteratorStateMetadata$Builder this ^java.lang.Iterable values]
    (-> this (.addAllKeys values))))

