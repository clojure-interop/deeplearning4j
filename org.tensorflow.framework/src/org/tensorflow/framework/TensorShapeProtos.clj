(ns org.tensorflow.framework.TensorShapeProtos
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework TensorShapeProtos]))

(defn *register-all-extensions
  "registry - `com.github.os72.protobuf351.ExtensionRegistryLite`"
  ([^com.github.os72.protobuf351.ExtensionRegistryLite registry]
    (TensorShapeProtos/registerAllExtensions registry)))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.FileDescriptor`"
  (^com.github.os72.protobuf351.Descriptors.FileDescriptor []
    (TensorShapeProtos/getDescriptor )))

