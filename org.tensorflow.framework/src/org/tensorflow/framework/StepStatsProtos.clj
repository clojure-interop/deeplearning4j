(ns org.tensorflow.framework.StepStatsProtos
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework StepStatsProtos]))

(defn *register-all-extensions
  "registry - `com.github.os72.protobuf351.ExtensionRegistryLite`"
  ([^com.github.os72.protobuf351.ExtensionRegistryLite registry]
    (StepStatsProtos/registerAllExtensions registry)))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.FileDescriptor`"
  (^com.github.os72.protobuf351.Descriptors.FileDescriptor []
    (StepStatsProtos/getDescriptor )))

