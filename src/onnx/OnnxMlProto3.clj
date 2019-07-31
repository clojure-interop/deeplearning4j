(ns onnx.OnnxMlProto3
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxMlProto3]))

(defn *register-all-extensions
  "registry - `com.github.os72.protobuf351.ExtensionRegistryLite`"
  ([^com.github.os72.protobuf351.ExtensionRegistryLite registry]
    (OnnxMlProto3/registerAllExtensions registry)))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.FileDescriptor`"
  (^com.github.os72.protobuf351.Descriptors.FileDescriptor []
    (OnnxMlProto3/getDescriptor )))

