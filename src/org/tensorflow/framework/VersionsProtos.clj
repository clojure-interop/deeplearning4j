(ns org.tensorflow.framework.VersionsProtos
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework VersionsProtos]))

(defn *register-all-extensions
  "registry - `com.github.os72.protobuf351.ExtensionRegistryLite`"
  ([^com.github.os72.protobuf351.ExtensionRegistryLite registry]
    (VersionsProtos/registerAllExtensions registry)))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.FileDescriptor`"
  (^com.github.os72.protobuf351.Descriptors.FileDescriptor []
    (VersionsProtos/getDescriptor )))

