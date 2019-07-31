(ns org.tensorflow.framework.SummaryMetadataOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework SummaryMetadataOrBuilder]))

(defn has-plugin-data?
  "Data that associates a summary with a certain plugin.
  .tensorflow.SummaryMetadata.PluginData plugin_data = 1;

  returns: `boolean`"
  (^Boolean [^SummaryMetadataOrBuilder this]
    (-> this (.hasPluginData))))

(defn get-plugin-data
  "Data that associates a summary with a certain plugin.
  .tensorflow.SummaryMetadata.PluginData plugin_data = 1;

  returns: `org.tensorflow.framework.SummaryMetadata$PluginData`"
  (^org.tensorflow.framework.SummaryMetadata$PluginData [^SummaryMetadataOrBuilder this]
    (-> this (.getPluginData))))

(defn get-plugin-data-or-builder
  "Data that associates a summary with a certain plugin.
  .tensorflow.SummaryMetadata.PluginData plugin_data = 1;

  returns: `org.tensorflow.framework.SummaryMetadata$PluginDataOrBuilder`"
  (^org.tensorflow.framework.SummaryMetadata$PluginDataOrBuilder [^SummaryMetadataOrBuilder this]
    (-> this (.getPluginDataOrBuilder))))

(defn get-display-name
  "Display name for viewing in TensorBoard.
  string display_name = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^SummaryMetadataOrBuilder this]
    (-> this (.getDisplayName))))

(defn get-display-name-bytes
  "Display name for viewing in TensorBoard.
  string display_name = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^SummaryMetadataOrBuilder this]
    (-> this (.getDisplayNameBytes))))

(defn get-summary-description
  "Longform readable description of the summary sequence. Markdown supported.
  string summary_description = 3;

  returns: `java.lang.String`"
  (^java.lang.String [^SummaryMetadataOrBuilder this]
    (-> this (.getSummaryDescription))))

(defn get-summary-description-bytes
  "Longform readable description of the summary sequence. Markdown supported.
  string summary_description = 3;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^SummaryMetadataOrBuilder this]
    (-> this (.getSummaryDescriptionBytes))))

