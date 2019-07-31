(ns org.nd4j.linalg.api.ndarray.NdArrayJSONWriter
  "Deprecated."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ndarray NdArrayJSONWriter]))

(defn *write
  "Deprecated.

  thisn-d - `org.nd4j.linalg.api.ndarray.INDArray`
  file-path - `java.lang.String`"
  ([^org.nd4j.linalg.api.ndarray.INDArray thisn-d ^java.lang.String file-path]
    (NdArrayJSONWriter/write thisn-d file-path)))

