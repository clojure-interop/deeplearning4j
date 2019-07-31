(ns org.nd4j.list.IntNDArrayList
  "An BaseNDArrayList for integers"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.list IntNDArrayList]))

(defn ->int-nd-array-list
  "Constructor.

  container - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^IntNDArrayList [^org.nd4j.linalg.api.ndarray.INDArray container]
    (new IntNDArrayList container))
  (^IntNDArrayList []
    (new IntNDArrayList )))

(defn get
  "i - `int`

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^IntNDArrayList this ^Integer i]
    (-> this (.get i))))

