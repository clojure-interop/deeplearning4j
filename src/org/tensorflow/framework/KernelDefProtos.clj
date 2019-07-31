(ns org.tensorflow.framework.KernelDefProtos
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework KernelDefProtos]))

(defn *register-all-extensions
  "registry - `com.github.os72.protobuf351.ExtensionRegistryLite`"
  ([^com.github.os72.protobuf351.ExtensionRegistryLite registry]
    (KernelDefProtos/registerAllExtensions registry)))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.FileDescriptor`"
  (^com.github.os72.protobuf351.Descriptors.FileDescriptor []
    (KernelDefProtos/getDescriptor )))

