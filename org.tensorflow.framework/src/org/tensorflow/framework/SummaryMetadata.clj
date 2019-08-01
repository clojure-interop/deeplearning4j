(ns org.tensorflow.framework.SummaryMetadata
  " A SummaryMetadata encapsulates information on which plugins are able to make
  use of a certain summary value.
 Protobuf type tensorflow.SummaryMetadata"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework SummaryMetadata]))

(def *-plugin-data-field-number
  "Static Constant.

  type: int"
  SummaryMetadata/PLUGIN_DATA_FIELD_NUMBER)

(def *-display-name-field-number
  "Static Constant.

  type: int"
  SummaryMetadata/DISPLAY_NAME_FIELD_NUMBER)

(def *-summary-description-field-number
  "Static Constant.

  type: int"
  SummaryMetadata/SUMMARY_DESCRIPTION_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (SummaryMetadata/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.SummaryMetadata`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.SummaryMetadata [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (SummaryMetadata/parseFrom data extension-registry))
  (^org.tensorflow.framework.SummaryMetadata [^java.nio.ByteBuffer data]
    (SummaryMetadata/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.SummaryMetadata`

  throws: java.io.IOException"
  (^org.tensorflow.framework.SummaryMetadata [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (SummaryMetadata/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.SummaryMetadata [^java.io.InputStream input]
    (SummaryMetadata/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.SummaryMetadata`

  returns: `org.tensorflow.framework.SummaryMetadata$Builder`"
  (^org.tensorflow.framework.SummaryMetadata$Builder [^org.tensorflow.framework.SummaryMetadata prototype]
    (SummaryMetadata/newBuilder prototype))
  (^org.tensorflow.framework.SummaryMetadata$Builder []
    (SummaryMetadata/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.SummaryMetadata`"
  (^org.tensorflow.framework.SummaryMetadata []
    (SummaryMetadata/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.SummaryMetadata>`"
  (^com.github.os72.protobuf351.Parser []
    (SummaryMetadata/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^SummaryMetadata this]
    (-> this (.getUnknownFields))))

(defn get-summary-description-bytes
  "Longform readable description of the summary sequence. Markdown supported.
  string summary_description = 3;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^SummaryMetadata this]
    (-> this (.getSummaryDescriptionBytes))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^SummaryMetadata this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.SummaryMetadata`"
  (^org.tensorflow.framework.SummaryMetadata [^SummaryMetadata this]
    (-> this (.getDefaultInstanceForType))))

(defn has-plugin-data?
  "Data that associates a summary with a certain plugin.
  .tensorflow.SummaryMetadata.PluginData plugin_data = 1;

  returns: `boolean`"
  (^Boolean [^SummaryMetadata this]
    (-> this (.hasPluginData))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^SummaryMetadata this]
    (-> this (.getSerializedSize))))

(defn get-display-name
  "Display name for viewing in TensorBoard.
  string display_name = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^SummaryMetadata this]
    (-> this (.getDisplayName))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^SummaryMetadata this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-display-name-bytes
  "Display name for viewing in TensorBoard.
  string display_name = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^SummaryMetadata this]
    (-> this (.getDisplayNameBytes))))

(defn get-plugin-data-or-builder
  "Data that associates a summary with a certain plugin.
  .tensorflow.SummaryMetadata.PluginData plugin_data = 1;

  returns: `org.tensorflow.framework.SummaryMetadata$PluginDataOrBuilder`"
  (^org.tensorflow.framework.SummaryMetadata$PluginDataOrBuilder [^SummaryMetadata this]
    (-> this (.getPluginDataOrBuilder))))

(defn get-plugin-data
  "Data that associates a summary with a certain plugin.
  .tensorflow.SummaryMetadata.PluginData plugin_data = 1;

  returns: `org.tensorflow.framework.SummaryMetadata$PluginData`"
  (^org.tensorflow.framework.SummaryMetadata$PluginData [^SummaryMetadata this]
    (-> this (.getPluginData))))

(defn hash-code
  "returns: `int`"
  (^Integer [^SummaryMetadata this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.SummaryMetadata>`"
  (^com.github.os72.protobuf351.Parser [^SummaryMetadata this]
    (-> this (.getParserForType))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^SummaryMetadata this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.SummaryMetadata$Builder`"
  (^org.tensorflow.framework.SummaryMetadata$Builder [^SummaryMetadata this]
    (-> this (.newBuilderForType))))

(defn get-summary-description
  "Longform readable description of the summary sequence. Markdown supported.
  string summary_description = 3;

  returns: `java.lang.String`"
  (^java.lang.String [^SummaryMetadata this]
    (-> this (.getSummaryDescription))))

(defn to-builder
  "returns: `org.tensorflow.framework.SummaryMetadata$Builder`"
  (^org.tensorflow.framework.SummaryMetadata$Builder [^SummaryMetadata this]
    (-> this (.toBuilder))))

