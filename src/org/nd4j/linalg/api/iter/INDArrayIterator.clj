(ns org.nd4j.linalg.api.iter.INDArrayIterator
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.iter INDArrayIterator]))

(defn ->ind-array-iterator
  "Constructor.

  iterate-over - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^INDArrayIterator [^org.nd4j.linalg.api.ndarray.INDArray iterate-over]
    (new INDArrayIterator iterate-over)))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^INDArrayIterator this]
    (-> this (.hasNext))))

(defn remove
  ""
  ([^INDArrayIterator this]
    (-> this (.remove))))

(defn next
  "returns: `java.lang.Double`"
  (^java.lang.Double [^INDArrayIterator this]
    (-> this (.next))))

