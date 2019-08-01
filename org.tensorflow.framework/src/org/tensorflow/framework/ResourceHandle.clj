(ns org.tensorflow.framework.ResourceHandle
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework ResourceHandle]))

(defn *register-all-extensions
  "registry - `com.github.os72.protobuf351.ExtensionRegistryLite`"
  ([^com.github.os72.protobuf351.ExtensionRegistryLite registry]
    (ResourceHandle/registerAllExtensions registry)))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.FileDescriptor`"
  (^com.github.os72.protobuf351.Descriptors.FileDescriptor []
    (ResourceHandle/getDescriptor )))

