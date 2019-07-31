(ns org.nd4j.api.loader.LocalFileSourceFactory
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.api.loader LocalFileSourceFactory]))

(defn ->local-file-source-factory
  "Constructor."
  (^LocalFileSourceFactory []
    (new LocalFileSourceFactory )))

(defn get-source
  "path - `java.lang.String`

  returns: `org.nd4j.api.loader.Source`"
  (^org.nd4j.api.loader.Source [^LocalFileSourceFactory this ^java.lang.String path]
    (-> this (.getSource path))))

