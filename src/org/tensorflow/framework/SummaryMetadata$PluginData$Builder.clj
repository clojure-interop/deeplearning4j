(ns org.tensorflow.framework.SummaryMetadata$PluginData$Builder
  "Protobuf type tensorflow.SummaryMetadata.PluginData"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework SummaryMetadata$PluginData$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (SummaryMetadata$PluginData$Builder/getDescriptor )))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.SummaryMetadata$PluginData$Builder`"
  (^org.tensorflow.framework.SummaryMetadata$PluginData$Builder [^SummaryMetadata$PluginData$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn build-partial
  "returns: `org.tensorflow.framework.SummaryMetadata$PluginData`"
  (^org.tensorflow.framework.SummaryMetadata$PluginData [^SummaryMetadata$PluginData$Builder this]
    (-> this (.buildPartial))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^SummaryMetadata$PluginData$Builder this]
    (-> this (.isInitialized))))

(defn clear-plugin-name
  "The name of the plugin this data pertains to.
  string plugin_name = 1;

  returns: `org.tensorflow.framework.SummaryMetadata$PluginData$Builder`"
  (^org.tensorflow.framework.SummaryMetadata$PluginData$Builder [^SummaryMetadata$PluginData$Builder this]
    (-> this (.clearPluginName))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.SummaryMetadata$PluginData`"
  (^org.tensorflow.framework.SummaryMetadata$PluginData [^SummaryMetadata$PluginData$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.SummaryMetadata$PluginData$Builder`"
  (^org.tensorflow.framework.SummaryMetadata$PluginData$Builder [^SummaryMetadata$PluginData$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.SummaryMetadata$PluginData$Builder`"
  (^org.tensorflow.framework.SummaryMetadata$PluginData$Builder [^SummaryMetadata$PluginData$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn set-plugin-name-bytes
  "The name of the plugin this data pertains to.
  string plugin_name = 1;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.SummaryMetadata$PluginData$Builder`"
  (^org.tensorflow.framework.SummaryMetadata$PluginData$Builder [^SummaryMetadata$PluginData$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setPluginNameBytes value))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.SummaryMetadata$PluginData$Builder`"
  (^org.tensorflow.framework.SummaryMetadata$PluginData$Builder [^SummaryMetadata$PluginData$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn clear-content
  "The content to store for the plugin. The best practice is for this to be
   a binary serialized protocol buffer.
  bytes content = 2;

  returns: `org.tensorflow.framework.SummaryMetadata$PluginData$Builder`"
  (^org.tensorflow.framework.SummaryMetadata$PluginData$Builder [^SummaryMetadata$PluginData$Builder this]
    (-> this (.clearContent))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.SummaryMetadata$PluginData$Builder`"
  (^org.tensorflow.framework.SummaryMetadata$PluginData$Builder [^SummaryMetadata$PluginData$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn build
  "returns: `org.tensorflow.framework.SummaryMetadata$PluginData`"
  (^org.tensorflow.framework.SummaryMetadata$PluginData [^SummaryMetadata$PluginData$Builder this]
    (-> this (.build))))

(defn set-plugin-name
  "The name of the plugin this data pertains to.
  string plugin_name = 1;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.SummaryMetadata$PluginData$Builder`"
  (^org.tensorflow.framework.SummaryMetadata$PluginData$Builder [^SummaryMetadata$PluginData$Builder this ^java.lang.String value]
    (-> this (.setPluginName value))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.SummaryMetadata$PluginData$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.SummaryMetadata$PluginData$Builder [^SummaryMetadata$PluginData$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.SummaryMetadata$PluginData$Builder [^SummaryMetadata$PluginData$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.SummaryMetadata$PluginData$Builder`"
  (^org.tensorflow.framework.SummaryMetadata$PluginData$Builder [^SummaryMetadata$PluginData$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn clone
  "returns: `org.tensorflow.framework.SummaryMetadata$PluginData$Builder`"
  (^org.tensorflow.framework.SummaryMetadata$PluginData$Builder [^SummaryMetadata$PluginData$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^SummaryMetadata$PluginData$Builder this]
    (-> this (.getDescriptorForType))))

(defn get-plugin-name
  "The name of the plugin this data pertains to.
  string plugin_name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^SummaryMetadata$PluginData$Builder this]
    (-> this (.getPluginName))))

(defn clear
  "returns: `org.tensorflow.framework.SummaryMetadata$PluginData$Builder`"
  (^org.tensorflow.framework.SummaryMetadata$PluginData$Builder [^SummaryMetadata$PluginData$Builder this]
    (-> this (.clear))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.SummaryMetadata$PluginData$Builder`"
  (^org.tensorflow.framework.SummaryMetadata$PluginData$Builder [^SummaryMetadata$PluginData$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn get-plugin-name-bytes
  "The name of the plugin this data pertains to.
  string plugin_name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^SummaryMetadata$PluginData$Builder this]
    (-> this (.getPluginNameBytes))))

(defn set-content
  "The content to store for the plugin. The best practice is for this to be
   a binary serialized protocol buffer.
  bytes content = 2;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.SummaryMetadata$PluginData$Builder`"
  (^org.tensorflow.framework.SummaryMetadata$PluginData$Builder [^SummaryMetadata$PluginData$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setContent value))))

(defn get-content
  "The content to store for the plugin. The best practice is for this to be
   a binary serialized protocol buffer.
  bytes content = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^SummaryMetadata$PluginData$Builder this]
    (-> this (.getContent))))

