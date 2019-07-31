(ns org.nd4j.linalg.api.ndarray.NdArrayJSONReader
  "Deprecated."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ndarray NdArrayJSONReader]))

(defn ->nd-array-json-reader
  "Constructor.

  Deprecated."
  (^NdArrayJSONReader []
    (new NdArrayJSONReader )))

(defn read
  "Deprecated.

  json-file - `java.io.File`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^NdArrayJSONReader this ^java.io.File json-file]
    (-> this (.read json-file))))

