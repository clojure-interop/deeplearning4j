(ns org.nd4j.api.loader.Source
  "Used with Loader to represent the source of an object. The source is a path, usually a URI that can
 be used to generate an InputStream"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.api.loader Source]))

(defn get-input-stream
  "returns: `java.io.InputStream`

  throws: java.io.IOException"
  (^java.io.InputStream [^Source this]
    (-> this (.getInputStream))))

(defn get-path
  "returns: `java.lang.String`"
  (^java.lang.String [^Source this]
    (-> this (.getPath))))

