(ns org.tensorflow.framework.RemoteFusedGraphExecuteInfoProto
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework RemoteFusedGraphExecuteInfoProto]))

(defn *register-all-extensions
  "registry - `com.github.os72.protobuf351.ExtensionRegistryLite`"
  ([^com.github.os72.protobuf351.ExtensionRegistryLite registry]
    (RemoteFusedGraphExecuteInfoProto/registerAllExtensions registry)))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.FileDescriptor`"
  (^com.github.os72.protobuf351.Descriptors.FileDescriptor []
    (RemoteFusedGraphExecuteInfoProto/getDescriptor )))

