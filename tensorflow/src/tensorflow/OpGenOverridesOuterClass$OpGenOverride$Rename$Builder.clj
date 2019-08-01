(ns tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename$Builder
  " Change the name used to access attrs/inputs/outputs in the API
  from what is used in the GraphDef.  Note that these names in
  `backticks` will also be replaced in the docs.
 Protobuf type tensorflow.OpGenOverride.Rename"
  (:refer-clojure :only [require comment defn ->])
  (:import [tensorflow OpGenOverridesOuterClass$OpGenOverride$Rename$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (OpGenOverridesOuterClass$OpGenOverride$Rename$Builder/getDescriptor )))

(defn set-to
  "string to = 2;

  value - `java.lang.String`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename$Builder [^OpGenOverridesOuterClass$OpGenOverride$Rename$Builder this ^java.lang.String value]
    (-> this (.setTo value))))

(defn get-from-bytes
  "string from = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OpGenOverridesOuterClass$OpGenOverride$Rename$Builder this]
    (-> this (.getFromBytes))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename$Builder [^OpGenOverridesOuterClass$OpGenOverride$Rename$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn build-partial
  "returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename [^OpGenOverridesOuterClass$OpGenOverride$Rename$Builder this]
    (-> this (.buildPartial))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^OpGenOverridesOuterClass$OpGenOverride$Rename$Builder this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename [^OpGenOverridesOuterClass$OpGenOverride$Rename$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename$Builder [^OpGenOverridesOuterClass$OpGenOverride$Rename$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn clear-to
  "string to = 2;

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename$Builder [^OpGenOverridesOuterClass$OpGenOverride$Rename$Builder this]
    (-> this (.clearTo))))

(defn set-to-bytes
  "string to = 2;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename$Builder [^OpGenOverridesOuterClass$OpGenOverride$Rename$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setToBytes value))))

(defn get-to-bytes
  "string to = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OpGenOverridesOuterClass$OpGenOverride$Rename$Builder this]
    (-> this (.getToBytes))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename$Builder [^OpGenOverridesOuterClass$OpGenOverride$Rename$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn set-from
  "string from = 1;

  value - `java.lang.String`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename$Builder [^OpGenOverridesOuterClass$OpGenOverride$Rename$Builder this ^java.lang.String value]
    (-> this (.setFrom value))))

(defn get-to
  "string to = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^OpGenOverridesOuterClass$OpGenOverride$Rename$Builder this]
    (-> this (.getTo))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename$Builder [^OpGenOverridesOuterClass$OpGenOverride$Rename$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn clear-from
  "string from = 1;

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename$Builder [^OpGenOverridesOuterClass$OpGenOverride$Rename$Builder this]
    (-> this (.clearFrom))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename$Builder [^OpGenOverridesOuterClass$OpGenOverride$Rename$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn build
  "returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename [^OpGenOverridesOuterClass$OpGenOverride$Rename$Builder this]
    (-> this (.build))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename$Builder`

  throws: java.io.IOException"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename$Builder [^OpGenOverridesOuterClass$OpGenOverride$Rename$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename$Builder [^OpGenOverridesOuterClass$OpGenOverride$Rename$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename$Builder [^OpGenOverridesOuterClass$OpGenOverride$Rename$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn clone
  "returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename$Builder [^OpGenOverridesOuterClass$OpGenOverride$Rename$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^OpGenOverridesOuterClass$OpGenOverride$Rename$Builder this]
    (-> this (.getDescriptorForType))))

(defn get-from
  "string from = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^OpGenOverridesOuterClass$OpGenOverride$Rename$Builder this]
    (-> this (.getFrom))))

(defn clear
  "returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename$Builder [^OpGenOverridesOuterClass$OpGenOverride$Rename$Builder this]
    (-> this (.clear))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename$Builder [^OpGenOverridesOuterClass$OpGenOverride$Rename$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn set-from-bytes
  "string from = 1;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename$Builder [^OpGenOverridesOuterClass$OpGenOverride$Rename$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setFromBytes value))))

