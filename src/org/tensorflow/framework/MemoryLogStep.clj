(ns org.tensorflow.framework.MemoryLogStep
  "Protobuf type tensorflow.MemoryLogStep"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework MemoryLogStep]))

(def *-step-id-field-number
  "Static Constant.

  type: int"
  MemoryLogStep/STEP_ID_FIELD_NUMBER)

(def *-handle-field-number
  "Static Constant.

  type: int"
  MemoryLogStep/HANDLE_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (MemoryLogStep/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.MemoryLogStep`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.MemoryLogStep [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (MemoryLogStep/parseFrom data extension-registry))
  (^org.tensorflow.framework.MemoryLogStep [^java.nio.ByteBuffer data]
    (MemoryLogStep/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.MemoryLogStep`

  throws: java.io.IOException"
  (^org.tensorflow.framework.MemoryLogStep [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (MemoryLogStep/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.MemoryLogStep [^java.io.InputStream input]
    (MemoryLogStep/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.MemoryLogStep`

  returns: `org.tensorflow.framework.MemoryLogStep$Builder`"
  (^org.tensorflow.framework.MemoryLogStep$Builder [^org.tensorflow.framework.MemoryLogStep prototype]
    (MemoryLogStep/newBuilder prototype))
  (^org.tensorflow.framework.MemoryLogStep$Builder []
    (MemoryLogStep/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.MemoryLogStep`"
  (^org.tensorflow.framework.MemoryLogStep []
    (MemoryLogStep/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.MemoryLogStep>`"
  (^com.github.os72.protobuf351.Parser []
    (MemoryLogStep/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^MemoryLogStep this]
    (-> this (.getUnknownFields))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^MemoryLogStep this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.MemoryLogStep`"
  (^org.tensorflow.framework.MemoryLogStep [^MemoryLogStep this]
    (-> this (.getDefaultInstanceForType))))

(defn get-step-id
  "Process-unique step id.
  int64 step_id = 1;

  returns: `long`"
  (^Long [^MemoryLogStep this]
    (-> this (.getStepId))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^MemoryLogStep this]
    (-> this (.getSerializedSize))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^MemoryLogStep this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn hash-code
  "returns: `int`"
  (^Integer [^MemoryLogStep this]
    (-> this (.hashCode))))

(defn get-handle
  "Handle describing the feeds and fetches of the step.
  string handle = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^MemoryLogStep this]
    (-> this (.getHandle))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.MemoryLogStep>`"
  (^com.github.os72.protobuf351.Parser [^MemoryLogStep this]
    (-> this (.getParserForType))))

(defn get-handle-bytes
  "Handle describing the feeds and fetches of the step.
  string handle = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^MemoryLogStep this]
    (-> this (.getHandleBytes))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^MemoryLogStep this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.MemoryLogStep$Builder`"
  (^org.tensorflow.framework.MemoryLogStep$Builder [^MemoryLogStep this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `org.tensorflow.framework.MemoryLogStep$Builder`"
  (^org.tensorflow.framework.MemoryLogStep$Builder [^MemoryLogStep this]
    (-> this (.toBuilder))))

