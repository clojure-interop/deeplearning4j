(ns org.tensorflow.framework.DeviceAttributesProtos
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework DeviceAttributesProtos]))

(defn *register-all-extensions
  "registry - `com.github.os72.protobuf351.ExtensionRegistryLite`"
  ([^com.github.os72.protobuf351.ExtensionRegistryLite registry]
    (DeviceAttributesProtos/registerAllExtensions registry)))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.FileDescriptor`"
  (^com.github.os72.protobuf351.Descriptors.FileDescriptor []
    (DeviceAttributesProtos/getDescriptor )))

