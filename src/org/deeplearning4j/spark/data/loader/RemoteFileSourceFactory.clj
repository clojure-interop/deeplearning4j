(ns org.deeplearning4j.spark.data.loader.RemoteFileSourceFactory
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.data.loader RemoteFileSourceFactory]))

(defn ->remote-file-source-factory
  "Constructor."
  (^RemoteFileSourceFactory []
    (new RemoteFileSourceFactory )))

(defn get-source
  "path - `java.lang.String`

  returns: `org.nd4j.api.loader.Source`"
  (^org.nd4j.api.loader.Source [^RemoteFileSourceFactory this ^java.lang.String path]
    (-> this (.getSource path))))

