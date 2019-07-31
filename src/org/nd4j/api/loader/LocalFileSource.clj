(ns org.nd4j.api.loader.LocalFileSource
  "A simple Source that returns a (buffered) FileInputStream for the specified file path"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.api.loader LocalFileSource]))

(defn ->local-file-source
  "Constructor."
  (^LocalFileSource []
    (new LocalFileSource )))

(defn get-input-stream
  "returns: `java.io.InputStream`

  throws: java.io.IOException"
  (^java.io.InputStream [^LocalFileSource this]
    (-> this (.getInputStream))))

