(ns org.tensorflow.framework.DeviceLocality
  "Protobuf type tensorflow.DeviceLocality"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework DeviceLocality]))

(def *-bus-id-field-number
  "Static Constant.

  type: int"
  DeviceLocality/BUS_ID_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (DeviceLocality/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.DeviceLocality`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.DeviceLocality [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (DeviceLocality/parseFrom data extension-registry))
  (^org.tensorflow.framework.DeviceLocality [^java.nio.ByteBuffer data]
    (DeviceLocality/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.DeviceLocality`

  throws: java.io.IOException"
  (^org.tensorflow.framework.DeviceLocality [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (DeviceLocality/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.DeviceLocality [^java.io.InputStream input]
    (DeviceLocality/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.DeviceLocality`

  returns: `org.tensorflow.framework.DeviceLocality$Builder`"
  (^org.tensorflow.framework.DeviceLocality$Builder [^org.tensorflow.framework.DeviceLocality prototype]
    (DeviceLocality/newBuilder prototype))
  (^org.tensorflow.framework.DeviceLocality$Builder []
    (DeviceLocality/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.DeviceLocality`"
  (^org.tensorflow.framework.DeviceLocality []
    (DeviceLocality/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.DeviceLocality>`"
  (^com.github.os72.protobuf351.Parser []
    (DeviceLocality/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^DeviceLocality this]
    (-> this (.getUnknownFields))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^DeviceLocality this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.DeviceLocality`"
  (^org.tensorflow.framework.DeviceLocality [^DeviceLocality this]
    (-> this (.getDefaultInstanceForType))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^DeviceLocality this]
    (-> this (.getSerializedSize))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^DeviceLocality this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn hash-code
  "returns: `int`"
  (^Integer [^DeviceLocality this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.DeviceLocality>`"
  (^com.github.os72.protobuf351.Parser [^DeviceLocality this]
    (-> this (.getParserForType))))

(defn get-bus-id
  "Optional bus locality of device.  Default value of 0 means
   no specific locality.  Specific localities are indexed from 1.
  int32 bus_id = 1;

  returns: `int`"
  (^Integer [^DeviceLocality this]
    (-> this (.getBusId))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^DeviceLocality this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.DeviceLocality$Builder`"
  (^org.tensorflow.framework.DeviceLocality$Builder [^DeviceLocality this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `org.tensorflow.framework.DeviceLocality$Builder`"
  (^org.tensorflow.framework.DeviceLocality$Builder [^DeviceLocality this]
    (-> this (.toBuilder))))

