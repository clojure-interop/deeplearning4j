(ns org.tensorflow.framework.DeviceAttributes$Builder
  "Protobuf type tensorflow.DeviceAttributes"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework DeviceAttributes$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (DeviceAttributes$Builder/getDescriptor )))

(defn clear-name
  "Fully specified name of the device within a cluster.
  string name = 1;

  returns: `org.tensorflow.framework.DeviceAttributes$Builder`"
  (^org.tensorflow.framework.DeviceAttributes$Builder [^DeviceAttributes$Builder this]
    (-> this (.clearName))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.DeviceAttributes$Builder`"
  (^org.tensorflow.framework.DeviceAttributes$Builder [^DeviceAttributes$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn set-device-type
  "String representation of device_type.
  string device_type = 2;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.DeviceAttributes$Builder`"
  (^org.tensorflow.framework.DeviceAttributes$Builder [^DeviceAttributes$Builder this ^java.lang.String value]
    (-> this (.setDeviceType value))))

(defn clear-locality
  "Platform-specific data about device that may be useful
   for supporting efficient data transfers.
  .tensorflow.DeviceLocality locality = 5;

  returns: `org.tensorflow.framework.DeviceAttributes$Builder`"
  (^org.tensorflow.framework.DeviceAttributes$Builder [^DeviceAttributes$Builder this]
    (-> this (.clearLocality))))

(defn build-partial
  "returns: `org.tensorflow.framework.DeviceAttributes`"
  (^org.tensorflow.framework.DeviceAttributes [^DeviceAttributes$Builder this]
    (-> this (.buildPartial))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^DeviceAttributes$Builder this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.DeviceAttributes`"
  (^org.tensorflow.framework.DeviceAttributes [^DeviceAttributes$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.DeviceAttributes$Builder`"
  (^org.tensorflow.framework.DeviceAttributes$Builder [^DeviceAttributes$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn get-device-type
  "String representation of device_type.
  string device_type = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^DeviceAttributes$Builder this]
    (-> this (.getDeviceType))))

(defn merge-locality
  "Platform-specific data about device that may be useful
   for supporting efficient data transfers.
  .tensorflow.DeviceLocality locality = 5;

  value - `org.tensorflow.framework.DeviceLocality`

  returns: `org.tensorflow.framework.DeviceAttributes$Builder`"
  (^org.tensorflow.framework.DeviceAttributes$Builder [^DeviceAttributes$Builder this ^org.tensorflow.framework.DeviceLocality value]
    (-> this (.mergeLocality value))))

(defn set-memory-limit
  "Memory capacity of device in bytes.
  int64 memory_limit = 4;

  value - `long`

  returns: `org.tensorflow.framework.DeviceAttributes$Builder`"
  (^org.tensorflow.framework.DeviceAttributes$Builder [^DeviceAttributes$Builder this ^Long value]
    (-> this (.setMemoryLimit value))))

(defn set-incarnation
  "A device is assigned a global unique number each time it is
   initialized. \"incarnation\" should never be 0.
  fixed64 incarnation = 6;

  value - `long`

  returns: `org.tensorflow.framework.DeviceAttributes$Builder`"
  (^org.tensorflow.framework.DeviceAttributes$Builder [^DeviceAttributes$Builder this ^Long value]
    (-> this (.setIncarnation value))))

(defn get-name-bytes
  "Fully specified name of the device within a cluster.
  string name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^DeviceAttributes$Builder this]
    (-> this (.getNameBytes))))

(defn get-locality-builder
  "Platform-specific data about device that may be useful
   for supporting efficient data transfers.
  .tensorflow.DeviceLocality locality = 5;

  returns: `org.tensorflow.framework.DeviceLocality$Builder`"
  (^org.tensorflow.framework.DeviceLocality$Builder [^DeviceAttributes$Builder this]
    (-> this (.getLocalityBuilder))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.DeviceAttributes$Builder`"
  (^org.tensorflow.framework.DeviceAttributes$Builder [^DeviceAttributes$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn get-memory-limit
  "Memory capacity of device in bytes.
  int64 memory_limit = 4;

  returns: `long`"
  (^Long [^DeviceAttributes$Builder this]
    (-> this (.getMemoryLimit))))

(defn set-name
  "Fully specified name of the device within a cluster.
  string name = 1;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.DeviceAttributes$Builder`"
  (^org.tensorflow.framework.DeviceAttributes$Builder [^DeviceAttributes$Builder this ^java.lang.String value]
    (-> this (.setName value))))

(defn get-locality
  "Platform-specific data about device that may be useful
   for supporting efficient data transfers.
  .tensorflow.DeviceLocality locality = 5;

  returns: `org.tensorflow.framework.DeviceLocality`"
  (^org.tensorflow.framework.DeviceLocality [^DeviceAttributes$Builder this]
    (-> this (.getLocality))))

(defn get-physical-device-desc
  "String representation of the physical device that this device maps to.
  string physical_device_desc = 7;

  returns: `java.lang.String`"
  (^java.lang.String [^DeviceAttributes$Builder this]
    (-> this (.getPhysicalDeviceDesc))))

(defn get-incarnation
  "A device is assigned a global unique number each time it is
   initialized. \"incarnation\" should never be 0.
  fixed64 incarnation = 6;

  returns: `long`"
  (^Long [^DeviceAttributes$Builder this]
    (-> this (.getIncarnation))))

(defn clear-device-type
  "String representation of device_type.
  string device_type = 2;

  returns: `org.tensorflow.framework.DeviceAttributes$Builder`"
  (^org.tensorflow.framework.DeviceAttributes$Builder [^DeviceAttributes$Builder this]
    (-> this (.clearDeviceType))))

(defn get-name
  "Fully specified name of the device within a cluster.
  string name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^DeviceAttributes$Builder this]
    (-> this (.getName))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.DeviceAttributes$Builder`"
  (^org.tensorflow.framework.DeviceAttributes$Builder [^DeviceAttributes$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn set-name-bytes
  "Fully specified name of the device within a cluster.
  string name = 1;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.DeviceAttributes$Builder`"
  (^org.tensorflow.framework.DeviceAttributes$Builder [^DeviceAttributes$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setNameBytes value))))

(defn clear-physical-device-desc
  "String representation of the physical device that this device maps to.
  string physical_device_desc = 7;

  returns: `org.tensorflow.framework.DeviceAttributes$Builder`"
  (^org.tensorflow.framework.DeviceAttributes$Builder [^DeviceAttributes$Builder this]
    (-> this (.clearPhysicalDeviceDesc))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.DeviceAttributes$Builder`"
  (^org.tensorflow.framework.DeviceAttributes$Builder [^DeviceAttributes$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn build
  "returns: `org.tensorflow.framework.DeviceAttributes`"
  (^org.tensorflow.framework.DeviceAttributes [^DeviceAttributes$Builder this]
    (-> this (.build))))

(defn has-locality?
  "Platform-specific data about device that may be useful
   for supporting efficient data transfers.
  .tensorflow.DeviceLocality locality = 5;

  returns: `boolean`"
  (^Boolean [^DeviceAttributes$Builder this]
    (-> this (.hasLocality))))

(defn get-locality-or-builder
  "Platform-specific data about device that may be useful
   for supporting efficient data transfers.
  .tensorflow.DeviceLocality locality = 5;

  returns: `org.tensorflow.framework.DeviceLocalityOrBuilder`"
  (^org.tensorflow.framework.DeviceLocalityOrBuilder [^DeviceAttributes$Builder this]
    (-> this (.getLocalityOrBuilder))))

(defn clear-memory-limit
  "Memory capacity of device in bytes.
  int64 memory_limit = 4;

  returns: `org.tensorflow.framework.DeviceAttributes$Builder`"
  (^org.tensorflow.framework.DeviceAttributes$Builder [^DeviceAttributes$Builder this]
    (-> this (.clearMemoryLimit))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.DeviceAttributes$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.DeviceAttributes$Builder [^DeviceAttributes$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.DeviceAttributes$Builder [^DeviceAttributes$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn get-device-type-bytes
  "String representation of device_type.
  string device_type = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^DeviceAttributes$Builder this]
    (-> this (.getDeviceTypeBytes))))

(defn set-locality
  "Platform-specific data about device that may be useful
   for supporting efficient data transfers.
  .tensorflow.DeviceLocality locality = 5;

  value - `org.tensorflow.framework.DeviceLocality`

  returns: `org.tensorflow.framework.DeviceAttributes$Builder`"
  (^org.tensorflow.framework.DeviceAttributes$Builder [^DeviceAttributes$Builder this ^org.tensorflow.framework.DeviceLocality value]
    (-> this (.setLocality value))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.DeviceAttributes$Builder`"
  (^org.tensorflow.framework.DeviceAttributes$Builder [^DeviceAttributes$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn clone
  "returns: `org.tensorflow.framework.DeviceAttributes$Builder`"
  (^org.tensorflow.framework.DeviceAttributes$Builder [^DeviceAttributes$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^DeviceAttributes$Builder this]
    (-> this (.getDescriptorForType))))

(defn clear-incarnation
  "A device is assigned a global unique number each time it is
   initialized. \"incarnation\" should never be 0.
  fixed64 incarnation = 6;

  returns: `org.tensorflow.framework.DeviceAttributes$Builder`"
  (^org.tensorflow.framework.DeviceAttributes$Builder [^DeviceAttributes$Builder this]
    (-> this (.clearIncarnation))))

(defn clear
  "returns: `org.tensorflow.framework.DeviceAttributes$Builder`"
  (^org.tensorflow.framework.DeviceAttributes$Builder [^DeviceAttributes$Builder this]
    (-> this (.clear))))

(defn get-physical-device-desc-bytes
  "String representation of the physical device that this device maps to.
  string physical_device_desc = 7;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^DeviceAttributes$Builder this]
    (-> this (.getPhysicalDeviceDescBytes))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.DeviceAttributes$Builder`"
  (^org.tensorflow.framework.DeviceAttributes$Builder [^DeviceAttributes$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn set-physical-device-desc
  "String representation of the physical device that this device maps to.
  string physical_device_desc = 7;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.DeviceAttributes$Builder`"
  (^org.tensorflow.framework.DeviceAttributes$Builder [^DeviceAttributes$Builder this ^java.lang.String value]
    (-> this (.setPhysicalDeviceDesc value))))

(defn set-physical-device-desc-bytes
  "String representation of the physical device that this device maps to.
  string physical_device_desc = 7;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.DeviceAttributes$Builder`"
  (^org.tensorflow.framework.DeviceAttributes$Builder [^DeviceAttributes$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setPhysicalDeviceDescBytes value))))

(defn set-device-type-bytes
  "String representation of device_type.
  string device_type = 2;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.DeviceAttributes$Builder`"
  (^org.tensorflow.framework.DeviceAttributes$Builder [^DeviceAttributes$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setDeviceTypeBytes value))))

