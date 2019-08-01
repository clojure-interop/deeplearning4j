(ns org.tensorflow.util.IteratorStateMetadata
  " Protocol buffer representing the metadata for an iterator's state stored
  as a Variant tensor.
 Protobuf type tensorflow.IteratorStateMetadata"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.util IteratorStateMetadata]))

(def *-version-field-number
  "Static Constant.

  type: int"
  IteratorStateMetadata/VERSION_FIELD_NUMBER)

(def *-keys-field-number
  "Static Constant.

  type: int"
  IteratorStateMetadata/KEYS_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (IteratorStateMetadata/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.util.IteratorStateMetadata`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.util.IteratorStateMetadata [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (IteratorStateMetadata/parseFrom data extension-registry))
  (^org.tensorflow.util.IteratorStateMetadata [^java.nio.ByteBuffer data]
    (IteratorStateMetadata/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.util.IteratorStateMetadata`

  throws: java.io.IOException"
  (^org.tensorflow.util.IteratorStateMetadata [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (IteratorStateMetadata/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.util.IteratorStateMetadata [^java.io.InputStream input]
    (IteratorStateMetadata/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.util.IteratorStateMetadata`

  returns: `org.tensorflow.util.IteratorStateMetadata$Builder`"
  (^org.tensorflow.util.IteratorStateMetadata$Builder [^org.tensorflow.util.IteratorStateMetadata prototype]
    (IteratorStateMetadata/newBuilder prototype))
  (^org.tensorflow.util.IteratorStateMetadata$Builder []
    (IteratorStateMetadata/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.util.IteratorStateMetadata`"
  (^org.tensorflow.util.IteratorStateMetadata []
    (IteratorStateMetadata/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.util.IteratorStateMetadata>`"
  (^com.github.os72.protobuf351.Parser []
    (IteratorStateMetadata/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^IteratorStateMetadata this]
    (-> this (.getUnknownFields))))

(defn get-keys-list
  "Keys for tensors in the VariantTensorDataProto.
  repeated string keys = 2;

  returns: `com.github.os72.protobuf351.ProtocolStringList`"
  (^com.github.os72.protobuf351.ProtocolStringList [^IteratorStateMetadata this]
    (-> this (.getKeysList))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^IteratorStateMetadata this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.util.IteratorStateMetadata`"
  (^org.tensorflow.util.IteratorStateMetadata [^IteratorStateMetadata this]
    (-> this (.getDefaultInstanceForType))))

(defn get-keys-count
  "Keys for tensors in the VariantTensorDataProto.
  repeated string keys = 2;

  returns: `int`"
  (^Integer [^IteratorStateMetadata this]
    (-> this (.getKeysCount))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^IteratorStateMetadata this]
    (-> this (.getSerializedSize))))

(defn get-version-bytes
  "A user-specified version string.
  string version = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^IteratorStateMetadata this]
    (-> this (.getVersionBytes))))

(defn get-keys
  "Keys for tensors in the VariantTensorDataProto.
  repeated string keys = 2;

  index - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^IteratorStateMetadata this ^Integer index]
    (-> this (.getKeys index))))

(defn get-version
  "A user-specified version string.
  string version = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^IteratorStateMetadata this]
    (-> this (.getVersion))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^IteratorStateMetadata this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-keys-bytes
  "Keys for tensors in the VariantTensorDataProto.
  repeated string keys = 2;

  index - `int`

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^IteratorStateMetadata this ^Integer index]
    (-> this (.getKeysBytes index))))

(defn hash-code
  "returns: `int`"
  (^Integer [^IteratorStateMetadata this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.util.IteratorStateMetadata>`"
  (^com.github.os72.protobuf351.Parser [^IteratorStateMetadata this]
    (-> this (.getParserForType))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^IteratorStateMetadata this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.util.IteratorStateMetadata$Builder`"
  (^org.tensorflow.util.IteratorStateMetadata$Builder [^IteratorStateMetadata this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `org.tensorflow.util.IteratorStateMetadata$Builder`"
  (^org.tensorflow.util.IteratorStateMetadata$Builder [^IteratorStateMetadata this]
    (-> this (.toBuilder))))

