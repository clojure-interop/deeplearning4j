(ns onnx.OnnxProto3
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxProto3]))

(defn *register-all-extensions
  "registry - `com.github.os72.protobuf351.ExtensionRegistryLite`"
  ([^com.github.os72.protobuf351.ExtensionRegistryLite registry]
    (OnnxProto3/registerAllExtensions registry)))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.FileDescriptor`"
  (^com.github.os72.protobuf351.Descriptors.FileDescriptor []
    (OnnxProto3/getDescriptor )))

