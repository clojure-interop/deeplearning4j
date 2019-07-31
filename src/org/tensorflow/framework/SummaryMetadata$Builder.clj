(ns org.tensorflow.framework.SummaryMetadata$Builder
  " A SummaryMetadata encapsulates information on which plugins are able to make
  use of a certain summary value.
 Protobuf type tensorflow.SummaryMetadata"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework SummaryMetadata$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (SummaryMetadata$Builder/getDescriptor )))

(defn clear-display-name
  "Display name for viewing in TensorBoard.
  string display_name = 2;

  returns: `org.tensorflow.framework.SummaryMetadata$Builder`"
  (^org.tensorflow.framework.SummaryMetadata$Builder [^SummaryMetadata$Builder this]
    (-> this (.clearDisplayName))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.SummaryMetadata$Builder`"
  (^org.tensorflow.framework.SummaryMetadata$Builder [^SummaryMetadata$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn set-display-name-bytes
  "Display name for viewing in TensorBoard.
  string display_name = 2;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.SummaryMetadata$Builder`"
  (^org.tensorflow.framework.SummaryMetadata$Builder [^SummaryMetadata$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setDisplayNameBytes value))))

(defn build-partial
  "returns: `org.tensorflow.framework.SummaryMetadata`"
  (^org.tensorflow.framework.SummaryMetadata [^SummaryMetadata$Builder this]
    (-> this (.buildPartial))))

(defn set-display-name
  "Display name for viewing in TensorBoard.
  string display_name = 2;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.SummaryMetadata$Builder`"
  (^org.tensorflow.framework.SummaryMetadata$Builder [^SummaryMetadata$Builder this ^java.lang.String value]
    (-> this (.setDisplayName value))))

(defn get-summary-description-bytes
  "Longform readable description of the summary sequence. Markdown supported.
  string summary_description = 3;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^SummaryMetadata$Builder this]
    (-> this (.getSummaryDescriptionBytes))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^SummaryMetadata$Builder this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.SummaryMetadata`"
  (^org.tensorflow.framework.SummaryMetadata [^SummaryMetadata$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.SummaryMetadata$Builder`"
  (^org.tensorflow.framework.SummaryMetadata$Builder [^SummaryMetadata$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn has-plugin-data?
  "Data that associates a summary with a certain plugin.
  .tensorflow.SummaryMetadata.PluginData plugin_data = 1;

  returns: `boolean`"
  (^Boolean [^SummaryMetadata$Builder this]
    (-> this (.hasPluginData))))

(defn clear-summary-description
  "Longform readable description of the summary sequence. Markdown supported.
  string summary_description = 3;

  returns: `org.tensorflow.framework.SummaryMetadata$Builder`"
  (^org.tensorflow.framework.SummaryMetadata$Builder [^SummaryMetadata$Builder this]
    (-> this (.clearSummaryDescription))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.SummaryMetadata$Builder`"
  (^org.tensorflow.framework.SummaryMetadata$Builder [^SummaryMetadata$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn get-display-name
  "Display name for viewing in TensorBoard.
  string display_name = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^SummaryMetadata$Builder this]
    (-> this (.getDisplayName))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.SummaryMetadata$Builder`"
  (^org.tensorflow.framework.SummaryMetadata$Builder [^SummaryMetadata$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn get-plugin-data-builder
  "Data that associates a summary with a certain plugin.
  .tensorflow.SummaryMetadata.PluginData plugin_data = 1;

  returns: `org.tensorflow.framework.SummaryMetadata$PluginData$Builder`"
  (^org.tensorflow.framework.SummaryMetadata$PluginData$Builder [^SummaryMetadata$Builder this]
    (-> this (.getPluginDataBuilder))))

(defn set-summary-description
  "Longform readable description of the summary sequence. Markdown supported.
  string summary_description = 3;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.SummaryMetadata$Builder`"
  (^org.tensorflow.framework.SummaryMetadata$Builder [^SummaryMetadata$Builder this ^java.lang.String value]
    (-> this (.setSummaryDescription value))))

(defn set-summary-description-bytes
  "Longform readable description of the summary sequence. Markdown supported.
  string summary_description = 3;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.SummaryMetadata$Builder`"
  (^org.tensorflow.framework.SummaryMetadata$Builder [^SummaryMetadata$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setSummaryDescriptionBytes value))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.SummaryMetadata$Builder`"
  (^org.tensorflow.framework.SummaryMetadata$Builder [^SummaryMetadata$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn build
  "returns: `org.tensorflow.framework.SummaryMetadata`"
  (^org.tensorflow.framework.SummaryMetadata [^SummaryMetadata$Builder this]
    (-> this (.build))))

(defn get-display-name-bytes
  "Display name for viewing in TensorBoard.
  string display_name = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^SummaryMetadata$Builder this]
    (-> this (.getDisplayNameBytes))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.SummaryMetadata$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.SummaryMetadata$Builder [^SummaryMetadata$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.SummaryMetadata$Builder [^SummaryMetadata$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn get-plugin-data-or-builder
  "Data that associates a summary with a certain plugin.
  .tensorflow.SummaryMetadata.PluginData plugin_data = 1;

  returns: `org.tensorflow.framework.SummaryMetadata$PluginDataOrBuilder`"
  (^org.tensorflow.framework.SummaryMetadata$PluginDataOrBuilder [^SummaryMetadata$Builder this]
    (-> this (.getPluginDataOrBuilder))))

(defn get-plugin-data
  "Data that associates a summary with a certain plugin.
  .tensorflow.SummaryMetadata.PluginData plugin_data = 1;

  returns: `org.tensorflow.framework.SummaryMetadata$PluginData`"
  (^org.tensorflow.framework.SummaryMetadata$PluginData [^SummaryMetadata$Builder this]
    (-> this (.getPluginData))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.SummaryMetadata$Builder`"
  (^org.tensorflow.framework.SummaryMetadata$Builder [^SummaryMetadata$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn clear-plugin-data
  "Data that associates a summary with a certain plugin.
  .tensorflow.SummaryMetadata.PluginData plugin_data = 1;

  returns: `org.tensorflow.framework.SummaryMetadata$Builder`"
  (^org.tensorflow.framework.SummaryMetadata$Builder [^SummaryMetadata$Builder this]
    (-> this (.clearPluginData))))

(defn clone
  "returns: `org.tensorflow.framework.SummaryMetadata$Builder`"
  (^org.tensorflow.framework.SummaryMetadata$Builder [^SummaryMetadata$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^SummaryMetadata$Builder this]
    (-> this (.getDescriptorForType))))

(defn clear
  "returns: `org.tensorflow.framework.SummaryMetadata$Builder`"
  (^org.tensorflow.framework.SummaryMetadata$Builder [^SummaryMetadata$Builder this]
    (-> this (.clear))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.SummaryMetadata$Builder`"
  (^org.tensorflow.framework.SummaryMetadata$Builder [^SummaryMetadata$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn set-plugin-data
  "Data that associates a summary with a certain plugin.
  .tensorflow.SummaryMetadata.PluginData plugin_data = 1;

  value - `org.tensorflow.framework.SummaryMetadata$PluginData`

  returns: `org.tensorflow.framework.SummaryMetadata$Builder`"
  (^org.tensorflow.framework.SummaryMetadata$Builder [^SummaryMetadata$Builder this ^org.tensorflow.framework.SummaryMetadata$PluginData value]
    (-> this (.setPluginData value))))

(defn get-summary-description
  "Longform readable description of the summary sequence. Markdown supported.
  string summary_description = 3;

  returns: `java.lang.String`"
  (^java.lang.String [^SummaryMetadata$Builder this]
    (-> this (.getSummaryDescription))))

(defn merge-plugin-data
  "Data that associates a summary with a certain plugin.
  .tensorflow.SummaryMetadata.PluginData plugin_data = 1;

  value - `org.tensorflow.framework.SummaryMetadata$PluginData`

  returns: `org.tensorflow.framework.SummaryMetadata$Builder`"
  (^org.tensorflow.framework.SummaryMetadata$Builder [^SummaryMetadata$Builder this ^org.tensorflow.framework.SummaryMetadata$PluginData value]
    (-> this (.mergePluginData value))))

