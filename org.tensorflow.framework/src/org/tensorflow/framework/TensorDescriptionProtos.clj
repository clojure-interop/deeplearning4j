(ns org.tensorflow.framework.TensorDescriptionProtos
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework TensorDescriptionProtos]))

(defn *register-all-extensions
  "registry - `com.github.os72.protobuf351.ExtensionRegistryLite`"
  ([^com.github.os72.protobuf351.ExtensionRegistryLite registry]
    (TensorDescriptionProtos/registerAllExtensions registry)))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.FileDescriptor`"
  (^com.github.os72.protobuf351.Descriptors.FileDescriptor []
    (TensorDescriptionProtos/getDescriptor )))

