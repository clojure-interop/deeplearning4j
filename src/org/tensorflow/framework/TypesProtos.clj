(ns org.tensorflow.framework.TypesProtos
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework TypesProtos]))

(defn *register-all-extensions
  "registry - `com.github.os72.protobuf351.ExtensionRegistryLite`"
  ([^com.github.os72.protobuf351.ExtensionRegistryLite registry]
    (TypesProtos/registerAllExtensions registry)))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.FileDescriptor`"
  (^com.github.os72.protobuf351.Descriptors.FileDescriptor []
    (TypesProtos/getDescriptor )))

