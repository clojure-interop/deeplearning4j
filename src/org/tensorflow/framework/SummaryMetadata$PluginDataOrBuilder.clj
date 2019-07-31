(ns org.tensorflow.framework.SummaryMetadata$PluginDataOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework SummaryMetadata$PluginDataOrBuilder]))

(defn get-plugin-name
  "The name of the plugin this data pertains to.
  string plugin_name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^SummaryMetadata$PluginDataOrBuilder this]
    (-> this (.getPluginName))))

(defn get-plugin-name-bytes
  "The name of the plugin this data pertains to.
  string plugin_name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^SummaryMetadata$PluginDataOrBuilder this]
    (-> this (.getPluginNameBytes))))

(defn get-content
  "The content to store for the plugin. The best practice is for this to be
   a binary serialized protocol buffer.
  bytes content = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^SummaryMetadata$PluginDataOrBuilder this]
    (-> this (.getContent))))

