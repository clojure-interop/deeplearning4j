(ns org.tensorflow.framework.SummaryMetadata$PluginData
  "Protobuf type tensorflow.SummaryMetadata.PluginData"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework SummaryMetadata$PluginData]))

(def *-plugin-name-field-number
  "Static Constant.

  type: int"
  SummaryMetadata$PluginData/PLUGIN_NAME_FIELD_NUMBER)

(def *-content-field-number
  "Static Constant.

  type: int"
  SummaryMetadata$PluginData/CONTENT_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (SummaryMetadata$PluginData/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.SummaryMetadata$PluginData`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.SummaryMetadata$PluginData [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (SummaryMetadata$PluginData/parseFrom data extension-registry))
  (^org.tensorflow.framework.SummaryMetadata$PluginData [^java.nio.ByteBuffer data]
    (SummaryMetadata$PluginData/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.SummaryMetadata$PluginData`

  throws: java.io.IOException"
  (^org.tensorflow.framework.SummaryMetadata$PluginData [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (SummaryMetadata$PluginData/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.SummaryMetadata$PluginData [^java.io.InputStream input]
    (SummaryMetadata$PluginData/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.SummaryMetadata$PluginData`

  returns: `org.tensorflow.framework.SummaryMetadata$PluginData$Builder`"
  (^org.tensorflow.framework.SummaryMetadata$PluginData$Builder [^org.tensorflow.framework.SummaryMetadata$PluginData prototype]
    (SummaryMetadata$PluginData/newBuilder prototype))
  (^org.tensorflow.framework.SummaryMetadata$PluginData$Builder []
    (SummaryMetadata$PluginData/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.SummaryMetadata$PluginData`"
  (^org.tensorflow.framework.SummaryMetadata$PluginData []
    (SummaryMetadata$PluginData/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.SummaryMetadata$PluginData>`"
  (^com.github.os72.protobuf351.Parser []
    (SummaryMetadata$PluginData/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^SummaryMetadata$PluginData this]
    (-> this (.getUnknownFields))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^SummaryMetadata$PluginData this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.SummaryMetadata$PluginData`"
  (^org.tensorflow.framework.SummaryMetadata$PluginData [^SummaryMetadata$PluginData this]
    (-> this (.getDefaultInstanceForType))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^SummaryMetadata$PluginData this]
    (-> this (.getSerializedSize))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^SummaryMetadata$PluginData this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn hash-code
  "returns: `int`"
  (^Integer [^SummaryMetadata$PluginData this]
    (-> this (.hashCode))))

(defn get-plugin-name
  "The name of the plugin this data pertains to.
  string plugin_name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^SummaryMetadata$PluginData this]
    (-> this (.getPluginName))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.SummaryMetadata$PluginData>`"
  (^com.github.os72.protobuf351.Parser [^SummaryMetadata$PluginData this]
    (-> this (.getParserForType))))

(defn get-plugin-name-bytes
  "The name of the plugin this data pertains to.
  string plugin_name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^SummaryMetadata$PluginData this]
    (-> this (.getPluginNameBytes))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^SummaryMetadata$PluginData this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.SummaryMetadata$PluginData$Builder`"
  (^org.tensorflow.framework.SummaryMetadata$PluginData$Builder [^SummaryMetadata$PluginData this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `org.tensorflow.framework.SummaryMetadata$PluginData$Builder`"
  (^org.tensorflow.framework.SummaryMetadata$PluginData$Builder [^SummaryMetadata$PluginData this]
    (-> this (.toBuilder))))

(defn get-content
  "The content to store for the plugin. The best practice is for this to be
   a binary serialized protocol buffer.
  bytes content = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^SummaryMetadata$PluginData this]
    (-> this (.getContent))))

