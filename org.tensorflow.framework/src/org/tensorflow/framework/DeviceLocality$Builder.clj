(ns org.tensorflow.framework.DeviceLocality$Builder
  "Protobuf type tensorflow.DeviceLocality"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework DeviceLocality$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (DeviceLocality$Builder/getDescriptor )))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.DeviceLocality$Builder`"
  (^org.tensorflow.framework.DeviceLocality$Builder [^DeviceLocality$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn build-partial
  "returns: `org.tensorflow.framework.DeviceLocality`"
  (^org.tensorflow.framework.DeviceLocality [^DeviceLocality$Builder this]
    (-> this (.buildPartial))))

(defn clear-bus-id
  "Optional bus locality of device.  Default value of 0 means
   no specific locality.  Specific localities are indexed from 1.
  int32 bus_id = 1;

  returns: `org.tensorflow.framework.DeviceLocality$Builder`"
  (^org.tensorflow.framework.DeviceLocality$Builder [^DeviceLocality$Builder this]
    (-> this (.clearBusId))))

(defn set-bus-id
  "Optional bus locality of device.  Default value of 0 means
   no specific locality.  Specific localities are indexed from 1.
  int32 bus_id = 1;

  value - `int`

  returns: `org.tensorflow.framework.DeviceLocality$Builder`"
  (^org.tensorflow.framework.DeviceLocality$Builder [^DeviceLocality$Builder this ^Integer value]
    (-> this (.setBusId value))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^DeviceLocality$Builder this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.DeviceLocality`"
  (^org.tensorflow.framework.DeviceLocality [^DeviceLocality$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.DeviceLocality$Builder`"
  (^org.tensorflow.framework.DeviceLocality$Builder [^DeviceLocality$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.DeviceLocality$Builder`"
  (^org.tensorflow.framework.DeviceLocality$Builder [^DeviceLocality$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.DeviceLocality$Builder`"
  (^org.tensorflow.framework.DeviceLocality$Builder [^DeviceLocality$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.DeviceLocality$Builder`"
  (^org.tensorflow.framework.DeviceLocality$Builder [^DeviceLocality$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn build
  "returns: `org.tensorflow.framework.DeviceLocality`"
  (^org.tensorflow.framework.DeviceLocality [^DeviceLocality$Builder this]
    (-> this (.build))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.DeviceLocality$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.DeviceLocality$Builder [^DeviceLocality$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.DeviceLocality$Builder [^DeviceLocality$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.DeviceLocality$Builder`"
  (^org.tensorflow.framework.DeviceLocality$Builder [^DeviceLocality$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn clone
  "returns: `org.tensorflow.framework.DeviceLocality$Builder`"
  (^org.tensorflow.framework.DeviceLocality$Builder [^DeviceLocality$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^DeviceLocality$Builder this]
    (-> this (.getDescriptorForType))))

(defn clear
  "returns: `org.tensorflow.framework.DeviceLocality$Builder`"
  (^org.tensorflow.framework.DeviceLocality$Builder [^DeviceLocality$Builder this]
    (-> this (.clear))))

(defn get-bus-id
  "Optional bus locality of device.  Default value of 0 means
   no specific locality.  Specific localities are indexed from 1.
  int32 bus_id = 1;

  returns: `int`"
  (^Integer [^DeviceLocality$Builder this]
    (-> this (.getBusId))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.DeviceLocality$Builder`"
  (^org.tensorflow.framework.DeviceLocality$Builder [^DeviceLocality$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

