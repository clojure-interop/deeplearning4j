(ns org.tensorflow.framework.OpDeprecation$Builder
  " Information about version-dependent deprecation of an op
 Protobuf type tensorflow.OpDeprecation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework OpDeprecation$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (OpDeprecation$Builder/getDescriptor )))

(defn set-version
  "First GraphDef version at which the op is disallowed.
  int32 version = 1;

  value - `int`

  returns: `org.tensorflow.framework.OpDeprecation$Builder`"
  (^org.tensorflow.framework.OpDeprecation$Builder [^OpDeprecation$Builder this ^Integer value]
    (-> this (.setVersion value))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.OpDeprecation$Builder`"
  (^org.tensorflow.framework.OpDeprecation$Builder [^OpDeprecation$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn get-explanation
  "Explanation of why it was deprecated and what to use instead.
  string explanation = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^OpDeprecation$Builder this]
    (-> this (.getExplanation))))

(defn build-partial
  "returns: `org.tensorflow.framework.OpDeprecation`"
  (^org.tensorflow.framework.OpDeprecation [^OpDeprecation$Builder this]
    (-> this (.buildPartial))))

(defn set-explanation-bytes
  "Explanation of why it was deprecated and what to use instead.
  string explanation = 2;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.OpDeprecation$Builder`"
  (^org.tensorflow.framework.OpDeprecation$Builder [^OpDeprecation$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setExplanationBytes value))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^OpDeprecation$Builder this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.OpDeprecation`"
  (^org.tensorflow.framework.OpDeprecation [^OpDeprecation$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.OpDeprecation$Builder`"
  (^org.tensorflow.framework.OpDeprecation$Builder [^OpDeprecation$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn get-explanation-bytes
  "Explanation of why it was deprecated and what to use instead.
  string explanation = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OpDeprecation$Builder this]
    (-> this (.getExplanationBytes))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.OpDeprecation$Builder`"
  (^org.tensorflow.framework.OpDeprecation$Builder [^OpDeprecation$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.OpDeprecation$Builder`"
  (^org.tensorflow.framework.OpDeprecation$Builder [^OpDeprecation$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn clear-version
  "First GraphDef version at which the op is disallowed.
  int32 version = 1;

  returns: `org.tensorflow.framework.OpDeprecation$Builder`"
  (^org.tensorflow.framework.OpDeprecation$Builder [^OpDeprecation$Builder this]
    (-> this (.clearVersion))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.OpDeprecation$Builder`"
  (^org.tensorflow.framework.OpDeprecation$Builder [^OpDeprecation$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn get-version
  "First GraphDef version at which the op is disallowed.
  int32 version = 1;

  returns: `int`"
  (^Integer [^OpDeprecation$Builder this]
    (-> this (.getVersion))))

(defn build
  "returns: `org.tensorflow.framework.OpDeprecation`"
  (^org.tensorflow.framework.OpDeprecation [^OpDeprecation$Builder this]
    (-> this (.build))))

(defn clear-explanation
  "Explanation of why it was deprecated and what to use instead.
  string explanation = 2;

  returns: `org.tensorflow.framework.OpDeprecation$Builder`"
  (^org.tensorflow.framework.OpDeprecation$Builder [^OpDeprecation$Builder this]
    (-> this (.clearExplanation))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.OpDeprecation$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.OpDeprecation$Builder [^OpDeprecation$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.OpDeprecation$Builder [^OpDeprecation$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.OpDeprecation$Builder`"
  (^org.tensorflow.framework.OpDeprecation$Builder [^OpDeprecation$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn clone
  "returns: `org.tensorflow.framework.OpDeprecation$Builder`"
  (^org.tensorflow.framework.OpDeprecation$Builder [^OpDeprecation$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^OpDeprecation$Builder this]
    (-> this (.getDescriptorForType))))

(defn set-explanation
  "Explanation of why it was deprecated and what to use instead.
  string explanation = 2;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.OpDeprecation$Builder`"
  (^org.tensorflow.framework.OpDeprecation$Builder [^OpDeprecation$Builder this ^java.lang.String value]
    (-> this (.setExplanation value))))

(defn clear
  "returns: `org.tensorflow.framework.OpDeprecation$Builder`"
  (^org.tensorflow.framework.OpDeprecation$Builder [^OpDeprecation$Builder this]
    (-> this (.clear))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.OpDeprecation$Builder`"
  (^org.tensorflow.framework.OpDeprecation$Builder [^OpDeprecation$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

