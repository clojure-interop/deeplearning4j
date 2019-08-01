(ns org.tensorflow.framework.SummaryProtos
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework SummaryProtos]))

(defn *register-all-extensions
  "registry - `com.github.os72.protobuf351.ExtensionRegistryLite`"
  ([^com.github.os72.protobuf351.ExtensionRegistryLite registry]
    (SummaryProtos/registerAllExtensions registry)))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.FileDescriptor`"
  (^com.github.os72.protobuf351.Descriptors.FileDescriptor []
    (SummaryProtos/getDescriptor )))

