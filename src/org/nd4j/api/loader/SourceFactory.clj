(ns org.nd4j.api.loader.SourceFactory
  "A factory interface for getting Source objects given a String path"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.api.loader SourceFactory]))

(defn get-source
  "path - `java.lang.String`

  returns: `org.nd4j.api.loader.Source`"
  (^org.nd4j.api.loader.Source [^SourceFactory this ^java.lang.String path]
    (-> this (.getSource path))))

