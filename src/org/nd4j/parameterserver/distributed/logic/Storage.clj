(ns org.nd4j.parameterserver.distributed.logic.Storage
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.logic Storage]))

(defn get-array
  "key - `java.lang.Integer`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Storage this ^java.lang.Integer key]
    (-> this (.getArray key))))

(defn set-array
  "key - `java.lang.Integer`
  array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^Storage this ^java.lang.Integer key ^org.nd4j.linalg.api.ndarray.INDArray array]
    (-> this (.setArray key array))))

(defn array-exists
  "key - `java.lang.Integer`

  returns: `boolean`"
  (^Boolean [^Storage this ^java.lang.Integer key]
    (-> this (.arrayExists key))))

(defn shutdown
  ""
  ([^Storage this]
    (-> this (.shutdown))))

