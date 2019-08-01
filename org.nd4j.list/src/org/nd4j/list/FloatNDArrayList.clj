(ns org.nd4j.list.FloatNDArrayList
  "An BaseNDArrayList for float"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.list FloatNDArrayList]))

(defn ->float-nd-array-list
  "Constructor.

  container - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^FloatNDArrayList [^org.nd4j.linalg.api.ndarray.INDArray container]
    (new FloatNDArrayList container))
  (^FloatNDArrayList []
    (new FloatNDArrayList )))

(defn get
  "i - `int`

  returns: `java.lang.Float`"
  (^java.lang.Float [^FloatNDArrayList this ^Integer i]
    (-> this (.get i))))

