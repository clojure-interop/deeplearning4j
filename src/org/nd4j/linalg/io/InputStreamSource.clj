(ns org.nd4j.linalg.io.InputStreamSource
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.io InputStreamSource]))

(defn get-input-stream
  "returns: `java.io.InputStream`

  throws: java.io.IOException"
  (^java.io.InputStream [^InputStreamSource this]
    (-> this (.getInputStream))))

