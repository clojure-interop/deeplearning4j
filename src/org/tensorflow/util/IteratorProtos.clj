(ns org.tensorflow.util.IteratorProtos
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.util IteratorProtos]))

(defn *register-all-extensions
  "registry - `com.github.os72.protobuf351.ExtensionRegistryLite`"
  ([^com.github.os72.protobuf351.ExtensionRegistryLite registry]
    (IteratorProtos/registerAllExtensions registry)))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.FileDescriptor`"
  (^com.github.os72.protobuf351.Descriptors.FileDescriptor []
    (IteratorProtos/getDescriptor )))

