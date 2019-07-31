(ns org.nd4j.parameterserver.distributed.logic.storage.BaseStorage
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.logic.storage BaseStorage]))

(defn ->base-storage
  "Constructor."
  (^BaseStorage []
    (new BaseStorage )))

(defn get-array
  "key - `java.lang.Integer`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseStorage this ^java.lang.Integer key]
    (-> this (.getArray key))))

(defn set-array
  "key - `java.lang.Integer`
  array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BaseStorage this ^java.lang.Integer key ^org.nd4j.linalg.api.ndarray.INDArray array]
    (-> this (.setArray key array))))

(defn array-exists
  "key - `java.lang.Integer`

  returns: `boolean`"
  (^Boolean [^BaseStorage this ^java.lang.Integer key]
    (-> this (.arrayExists key))))

(defn shutdown
  ""
  ([^BaseStorage this]
    (-> this (.shutdown))))

