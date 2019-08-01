(ns org.tensorflow.framework.DeviceAttributes
  "Protobuf type tensorflow.DeviceAttributes"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework DeviceAttributes]))

(def *-name-field-number
  "Static Constant.

  type: int"
  DeviceAttributes/NAME_FIELD_NUMBER)

(def *-device-type-field-number
  "Static Constant.

  type: int"
  DeviceAttributes/DEVICE_TYPE_FIELD_NUMBER)

(def *-memory-limit-field-number
  "Static Constant.

  type: int"
  DeviceAttributes/MEMORY_LIMIT_FIELD_NUMBER)

(def *-locality-field-number
  "Static Constant.

  type: int"
  DeviceAttributes/LOCALITY_FIELD_NUMBER)

(def *-incarnation-field-number
  "Static Constant.

  type: int"
  DeviceAttributes/INCARNATION_FIELD_NUMBER)

(def *-physical-device-desc-field-number
  "Static Constant.

  type: int"
  DeviceAttributes/PHYSICAL_DEVICE_DESC_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (DeviceAttributes/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.DeviceAttributes`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.DeviceAttributes [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (DeviceAttributes/parseFrom data extension-registry))
  (^org.tensorflow.framework.DeviceAttributes [^java.nio.ByteBuffer data]
    (DeviceAttributes/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.DeviceAttributes`

  throws: java.io.IOException"
  (^org.tensorflow.framework.DeviceAttributes [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (DeviceAttributes/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.DeviceAttributes [^java.io.InputStream input]
    (DeviceAttributes/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.DeviceAttributes`

  returns: `org.tensorflow.framework.DeviceAttributes$Builder`"
  (^org.tensorflow.framework.DeviceAttributes$Builder [^org.tensorflow.framework.DeviceAttributes prototype]
    (DeviceAttributes/newBuilder prototype))
  (^org.tensorflow.framework.DeviceAttributes$Builder []
    (DeviceAttributes/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.DeviceAttributes`"
  (^org.tensorflow.framework.DeviceAttributes []
    (DeviceAttributes/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.DeviceAttributes>`"
  (^com.github.os72.protobuf351.Parser []
    (DeviceAttributes/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^DeviceAttributes this]
    (-> this (.getUnknownFields))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^DeviceAttributes this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.DeviceAttributes`"
  (^org.tensorflow.framework.DeviceAttributes [^DeviceAttributes this]
    (-> this (.getDefaultInstanceForType))))

(defn get-device-type
  "String representation of device_type.
  string device_type = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^DeviceAttributes this]
    (-> this (.getDeviceType))))

(defn get-name-bytes
  "Fully specified name of the device within a cluster.
  string name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^DeviceAttributes this]
    (-> this (.getNameBytes))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^DeviceAttributes this]
    (-> this (.getSerializedSize))))

(defn get-memory-limit
  "Memory capacity of device in bytes.
  int64 memory_limit = 4;

  returns: `long`"
  (^Long [^DeviceAttributes this]
    (-> this (.getMemoryLimit))))

(defn get-locality
  "Platform-specific data about device that may be useful
   for supporting efficient data transfers.
  .tensorflow.DeviceLocality locality = 5;

  returns: `org.tensorflow.framework.DeviceLocality`"
  (^org.tensorflow.framework.DeviceLocality [^DeviceAttributes this]
    (-> this (.getLocality))))

(defn get-physical-device-desc
  "String representation of the physical device that this device maps to.
  string physical_device_desc = 7;

  returns: `java.lang.String`"
  (^java.lang.String [^DeviceAttributes this]
    (-> this (.getPhysicalDeviceDesc))))

(defn get-incarnation
  "A device is assigned a global unique number each time it is
   initialized. \"incarnation\" should never be 0.
  fixed64 incarnation = 6;

  returns: `long`"
  (^Long [^DeviceAttributes this]
    (-> this (.getIncarnation))))

(defn get-name
  "Fully specified name of the device within a cluster.
  string name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^DeviceAttributes this]
    (-> this (.getName))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^DeviceAttributes this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn has-locality?
  "Platform-specific data about device that may be useful
   for supporting efficient data transfers.
  .tensorflow.DeviceLocality locality = 5;

  returns: `boolean`"
  (^Boolean [^DeviceAttributes this]
    (-> this (.hasLocality))))

(defn get-locality-or-builder
  "Platform-specific data about device that may be useful
   for supporting efficient data transfers.
  .tensorflow.DeviceLocality locality = 5;

  returns: `org.tensorflow.framework.DeviceLocalityOrBuilder`"
  (^org.tensorflow.framework.DeviceLocalityOrBuilder [^DeviceAttributes this]
    (-> this (.getLocalityOrBuilder))))

(defn get-device-type-bytes
  "String representation of device_type.
  string device_type = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^DeviceAttributes this]
    (-> this (.getDeviceTypeBytes))))

(defn hash-code
  "returns: `int`"
  (^Integer [^DeviceAttributes this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.DeviceAttributes>`"
  (^com.github.os72.protobuf351.Parser [^DeviceAttributes this]
    (-> this (.getParserForType))))

(defn get-physical-device-desc-bytes
  "String representation of the physical device that this device maps to.
  string physical_device_desc = 7;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^DeviceAttributes this]
    (-> this (.getPhysicalDeviceDescBytes))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^DeviceAttributes this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.DeviceAttributes$Builder`"
  (^org.tensorflow.framework.DeviceAttributes$Builder [^DeviceAttributes this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `org.tensorflow.framework.DeviceAttributes$Builder`"
  (^org.tensorflow.framework.DeviceAttributes$Builder [^DeviceAttributes this]
    (-> this (.toBuilder))))

