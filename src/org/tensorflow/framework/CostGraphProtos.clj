(ns org.tensorflow.framework.CostGraphProtos
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework CostGraphProtos]))

(defn *register-all-extensions
  "registry - `com.github.os72.protobuf351.ExtensionRegistryLite`"
  ([^com.github.os72.protobuf351.ExtensionRegistryLite registry]
    (CostGraphProtos/registerAllExtensions registry)))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.FileDescriptor`"
  (^com.github.os72.protobuf351.Descriptors.FileDescriptor []
    (CostGraphProtos/getDescriptor )))

