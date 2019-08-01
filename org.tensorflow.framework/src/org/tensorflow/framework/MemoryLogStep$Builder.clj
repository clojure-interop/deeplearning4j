(ns org.tensorflow.framework.MemoryLogStep$Builder
  "Protobuf type tensorflow.MemoryLogStep"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework MemoryLogStep$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (MemoryLogStep$Builder/getDescriptor )))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.MemoryLogStep$Builder`"
  (^org.tensorflow.framework.MemoryLogStep$Builder [^MemoryLogStep$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn build-partial
  "returns: `org.tensorflow.framework.MemoryLogStep`"
  (^org.tensorflow.framework.MemoryLogStep [^MemoryLogStep$Builder this]
    (-> this (.buildPartial))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^MemoryLogStep$Builder this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.MemoryLogStep`"
  (^org.tensorflow.framework.MemoryLogStep [^MemoryLogStep$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.MemoryLogStep$Builder`"
  (^org.tensorflow.framework.MemoryLogStep$Builder [^MemoryLogStep$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn get-step-id
  "Process-unique step id.
  int64 step_id = 1;

  returns: `long`"
  (^Long [^MemoryLogStep$Builder this]
    (-> this (.getStepId))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.MemoryLogStep$Builder`"
  (^org.tensorflow.framework.MemoryLogStep$Builder [^MemoryLogStep$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn set-handle-bytes
  "Handle describing the feeds and fetches of the step.
  string handle = 2;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.MemoryLogStep$Builder`"
  (^org.tensorflow.framework.MemoryLogStep$Builder [^MemoryLogStep$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setHandleBytes value))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.MemoryLogStep$Builder`"
  (^org.tensorflow.framework.MemoryLogStep$Builder [^MemoryLogStep$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn set-handle
  "Handle describing the feeds and fetches of the step.
  string handle = 2;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.MemoryLogStep$Builder`"
  (^org.tensorflow.framework.MemoryLogStep$Builder [^MemoryLogStep$Builder this ^java.lang.String value]
    (-> this (.setHandle value))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.MemoryLogStep$Builder`"
  (^org.tensorflow.framework.MemoryLogStep$Builder [^MemoryLogStep$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn clear-handle
  "Handle describing the feeds and fetches of the step.
  string handle = 2;

  returns: `org.tensorflow.framework.MemoryLogStep$Builder`"
  (^org.tensorflow.framework.MemoryLogStep$Builder [^MemoryLogStep$Builder this]
    (-> this (.clearHandle))))

(defn build
  "returns: `org.tensorflow.framework.MemoryLogStep`"
  (^org.tensorflow.framework.MemoryLogStep [^MemoryLogStep$Builder this]
    (-> this (.build))))

(defn clear-step-id
  "Process-unique step id.
  int64 step_id = 1;

  returns: `org.tensorflow.framework.MemoryLogStep$Builder`"
  (^org.tensorflow.framework.MemoryLogStep$Builder [^MemoryLogStep$Builder this]
    (-> this (.clearStepId))))

(defn set-step-id
  "Process-unique step id.
  int64 step_id = 1;

  value - `long`

  returns: `org.tensorflow.framework.MemoryLogStep$Builder`"
  (^org.tensorflow.framework.MemoryLogStep$Builder [^MemoryLogStep$Builder this ^Long value]
    (-> this (.setStepId value))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.MemoryLogStep$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.MemoryLogStep$Builder [^MemoryLogStep$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.MemoryLogStep$Builder [^MemoryLogStep$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.MemoryLogStep$Builder`"
  (^org.tensorflow.framework.MemoryLogStep$Builder [^MemoryLogStep$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn clone
  "returns: `org.tensorflow.framework.MemoryLogStep$Builder`"
  (^org.tensorflow.framework.MemoryLogStep$Builder [^MemoryLogStep$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^MemoryLogStep$Builder this]
    (-> this (.getDescriptorForType))))

(defn get-handle
  "Handle describing the feeds and fetches of the step.
  string handle = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^MemoryLogStep$Builder this]
    (-> this (.getHandle))))

(defn clear
  "returns: `org.tensorflow.framework.MemoryLogStep$Builder`"
  (^org.tensorflow.framework.MemoryLogStep$Builder [^MemoryLogStep$Builder this]
    (-> this (.clear))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.MemoryLogStep$Builder`"
  (^org.tensorflow.framework.MemoryLogStep$Builder [^MemoryLogStep$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn get-handle-bytes
  "Handle describing the feeds and fetches of the step.
  string handle = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^MemoryLogStep$Builder this]
    (-> this (.getHandleBytes))))

