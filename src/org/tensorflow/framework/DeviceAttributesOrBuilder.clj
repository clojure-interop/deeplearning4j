(ns org.tensorflow.framework.DeviceAttributesOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework DeviceAttributesOrBuilder]))

(defn get-device-type
  "String representation of device_type.
  string device_type = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^DeviceAttributesOrBuilder this]
    (-> this (.getDeviceType))))

(defn get-name-bytes
  "Fully specified name of the device within a cluster.
  string name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^DeviceAttributesOrBuilder this]
    (-> this (.getNameBytes))))

(defn get-memory-limit
  "Memory capacity of device in bytes.
  int64 memory_limit = 4;

  returns: `long`"
  (^Long [^DeviceAttributesOrBuilder this]
    (-> this (.getMemoryLimit))))

(defn get-locality
  "Platform-specific data about device that may be useful
   for supporting efficient data transfers.
  .tensorflow.DeviceLocality locality = 5;

  returns: `org.tensorflow.framework.DeviceLocality`"
  (^org.tensorflow.framework.DeviceLocality [^DeviceAttributesOrBuilder this]
    (-> this (.getLocality))))

(defn get-physical-device-desc
  "String representation of the physical device that this device maps to.
  string physical_device_desc = 7;

  returns: `java.lang.String`"
  (^java.lang.String [^DeviceAttributesOrBuilder this]
    (-> this (.getPhysicalDeviceDesc))))

(defn get-incarnation
  "A device is assigned a global unique number each time it is
   initialized. \"incarnation\" should never be 0.
  fixed64 incarnation = 6;

  returns: `long`"
  (^Long [^DeviceAttributesOrBuilder this]
    (-> this (.getIncarnation))))

(defn get-name
  "Fully specified name of the device within a cluster.
  string name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^DeviceAttributesOrBuilder this]
    (-> this (.getName))))

(defn has-locality?
  "Platform-specific data about device that may be useful
   for supporting efficient data transfers.
  .tensorflow.DeviceLocality locality = 5;

  returns: `boolean`"
  (^Boolean [^DeviceAttributesOrBuilder this]
    (-> this (.hasLocality))))

(defn get-locality-or-builder
  "Platform-specific data about device that may be useful
   for supporting efficient data transfers.
  .tensorflow.DeviceLocality locality = 5;

  returns: `org.tensorflow.framework.DeviceLocalityOrBuilder`"
  (^org.tensorflow.framework.DeviceLocalityOrBuilder [^DeviceAttributesOrBuilder this]
    (-> this (.getLocalityOrBuilder))))

(defn get-device-type-bytes
  "String representation of device_type.
  string device_type = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^DeviceAttributesOrBuilder this]
    (-> this (.getDeviceTypeBytes))))

(defn get-physical-device-desc-bytes
  "String representation of the physical device that this device maps to.
  string physical_device_desc = 7;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^DeviceAttributesOrBuilder this]
    (-> this (.getPhysicalDeviceDescBytes))))

