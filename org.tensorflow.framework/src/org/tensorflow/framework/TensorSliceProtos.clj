(ns org.tensorflow.framework.TensorSliceProtos
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework TensorSliceProtos]))

(defn *register-all-extensions
  "registry - `com.github.os72.protobuf351.ExtensionRegistryLite`"
  ([^com.github.os72.protobuf351.ExtensionRegistryLite registry]
    (TensorSliceProtos/registerAllExtensions registry)))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.FileDescriptor`"
  (^com.github.os72.protobuf351.Descriptors.FileDescriptor []
    (TensorSliceProtos/getDescriptor )))

