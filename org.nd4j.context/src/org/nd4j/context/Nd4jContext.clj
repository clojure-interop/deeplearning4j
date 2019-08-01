(ns org.nd4j.context.Nd4jContext
  "Holds properties for nd4j to be used across different modules"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.context Nd4jContext]))

(defn *get-instance
  "returns: `org.nd4j.context.Nd4jContext`"
  (^org.nd4j.context.Nd4jContext []
    (Nd4jContext/getInstance )))

(defn update-properties
  "Load the additional properties from an input stream and load all system properties

  input-stream - `java.io.InputStream`"
  ([^Nd4jContext this ^java.io.InputStream input-stream]
    (-> this (.updateProperties input-stream))))

(defn get-conf
  "Get the configuration for nd4j

  returns: `java.util.Properties`"
  (^java.util.Properties [^Nd4jContext this]
    (-> this (.getConf))))

