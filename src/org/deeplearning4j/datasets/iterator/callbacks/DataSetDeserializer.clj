(ns org.deeplearning4j.datasets.iterator.callbacks.DataSetDeserializer
  "This callback does DataSet deserialization of a given file."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.iterator.callbacks DataSetDeserializer]))

(defn ->data-set-deserializer
  "Constructor."
  (^DataSetDeserializer []
    (new DataSetDeserializer )))

(defn call
  "file - `java.io.File`

  returns: `<T> T`"
  ([^DataSetDeserializer this ^java.io.File file]
    (-> this (.call file))))

