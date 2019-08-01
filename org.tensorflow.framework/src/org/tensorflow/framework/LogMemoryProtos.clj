(ns org.tensorflow.framework.LogMemoryProtos
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework LogMemoryProtos]))

(defn *register-all-extensions
  "registry - `com.github.os72.protobuf351.ExtensionRegistryLite`"
  ([^com.github.os72.protobuf351.ExtensionRegistryLite registry]
    (LogMemoryProtos/registerAllExtensions registry)))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.FileDescriptor`"
  (^com.github.os72.protobuf351.Descriptors.FileDescriptor []
    (LogMemoryProtos/getDescriptor )))

