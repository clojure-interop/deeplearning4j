(ns org.tensorflow.framework.ReaderBaseProtos
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework ReaderBaseProtos]))

(defn *register-all-extensions
  "registry - `com.github.os72.protobuf351.ExtensionRegistryLite`"
  ([^com.github.os72.protobuf351.ExtensionRegistryLite registry]
    (ReaderBaseProtos/registerAllExtensions registry)))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.FileDescriptor`"
  (^com.github.os72.protobuf351.Descriptors.FileDescriptor []
    (ReaderBaseProtos/getDescriptor )))

