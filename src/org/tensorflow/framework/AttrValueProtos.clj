(ns org.tensorflow.framework.AttrValueProtos
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework AttrValueProtos]))

(defn *register-all-extensions
  "registry - `com.github.os72.protobuf351.ExtensionRegistryLite`"
  ([^com.github.os72.protobuf351.ExtensionRegistryLite registry]
    (AttrValueProtos/registerAllExtensions registry)))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.FileDescriptor`"
  (^com.github.os72.protobuf351.Descriptors.FileDescriptor []
    (AttrValueProtos/getDescriptor )))

