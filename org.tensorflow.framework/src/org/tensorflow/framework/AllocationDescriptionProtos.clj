(ns org.tensorflow.framework.AllocationDescriptionProtos
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework AllocationDescriptionProtos]))

(defn *register-all-extensions
  "registry - `com.github.os72.protobuf351.ExtensionRegistryLite`"
  ([^com.github.os72.protobuf351.ExtensionRegistryLite registry]
    (AllocationDescriptionProtos/registerAllExtensions registry)))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.FileDescriptor`"
  (^com.github.os72.protobuf351.Descriptors.FileDescriptor []
    (AllocationDescriptionProtos/getDescriptor )))

