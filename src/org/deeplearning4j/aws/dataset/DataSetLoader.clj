(ns org.deeplearning4j.aws.dataset.DataSetLoader
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.aws.dataset DataSetLoader]))

(defn ->data-set-loader
  "Constructor."
  (^DataSetLoader []
    (new DataSetLoader )))

(defn on-data
  "is - `java.io.InputStream`"
  ([^DataSetLoader this ^java.io.InputStream is]
    (-> this (.onData is))))

