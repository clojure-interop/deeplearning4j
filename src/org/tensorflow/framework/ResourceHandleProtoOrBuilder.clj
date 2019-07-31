(ns org.tensorflow.framework.ResourceHandleProtoOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework ResourceHandleProtoOrBuilder]))

(defn get-maybe-type-name
  "For debug-only, the name of the type pointed to by this handle, if
   available.
  string maybe_type_name = 5;

  returns: `java.lang.String`"
  (^java.lang.String [^ResourceHandleProtoOrBuilder this]
    (-> this (.getMaybeTypeName))))

(defn get-maybe-type-name-bytes
  "For debug-only, the name of the type pointed to by this handle, if
   available.
  string maybe_type_name = 5;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^ResourceHandleProtoOrBuilder this]
    (-> this (.getMaybeTypeNameBytes))))

(defn get-name-bytes
  "Unique name of this resource.
  string name = 3;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^ResourceHandleProtoOrBuilder this]
    (-> this (.getNameBytes))))

(defn get-name
  "Unique name of this resource.
  string name = 3;

  returns: `java.lang.String`"
  (^java.lang.String [^ResourceHandleProtoOrBuilder this]
    (-> this (.getName))))

(defn get-container-bytes
  "Container in which this resource is placed.
  string container = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^ResourceHandleProtoOrBuilder this]
    (-> this (.getContainerBytes))))

(defn get-container
  "Container in which this resource is placed.
  string container = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^ResourceHandleProtoOrBuilder this]
    (-> this (.getContainer))))

(defn get-device-bytes
  "Unique name for the device containing the resource.
  string device = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^ResourceHandleProtoOrBuilder this]
    (-> this (.getDeviceBytes))))

(defn get-device
  "Unique name for the device containing the resource.
  string device = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^ResourceHandleProtoOrBuilder this]
    (-> this (.getDevice))))

(defn get-hash-code
  "Hash code for the type of the resource. Is only valid in the same device
   and in the same execution.
  uint64 hash_code = 4;

  returns: `long`"
  (^Long [^ResourceHandleProtoOrBuilder this]
    (-> this (.getHashCode))))

