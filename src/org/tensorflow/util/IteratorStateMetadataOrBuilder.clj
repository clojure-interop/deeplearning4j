(ns org.tensorflow.util.IteratorStateMetadataOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.util IteratorStateMetadataOrBuilder]))

(defn get-version
  "A user-specified version string.
  string version = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^IteratorStateMetadataOrBuilder this]
    (-> this (.getVersion))))

(defn get-version-bytes
  "A user-specified version string.
  string version = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^IteratorStateMetadataOrBuilder this]
    (-> this (.getVersionBytes))))

(defn get-keys-list
  "Keys for tensors in the VariantTensorDataProto.
  repeated string keys = 2;

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^IteratorStateMetadataOrBuilder this]
    (-> this (.getKeysList))))

(defn get-keys-count
  "Keys for tensors in the VariantTensorDataProto.
  repeated string keys = 2;

  returns: `int`"
  (^Integer [^IteratorStateMetadataOrBuilder this]
    (-> this (.getKeysCount))))

(defn get-keys
  "Keys for tensors in the VariantTensorDataProto.
  repeated string keys = 2;

  index - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^IteratorStateMetadataOrBuilder this ^Integer index]
    (-> this (.getKeys index))))

(defn get-keys-bytes
  "Keys for tensors in the VariantTensorDataProto.
  repeated string keys = 2;

  index - `int`

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^IteratorStateMetadataOrBuilder this ^Integer index]
    (-> this (.getKeysBytes index))))

