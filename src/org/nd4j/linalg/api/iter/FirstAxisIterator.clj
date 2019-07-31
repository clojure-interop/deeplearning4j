(ns org.nd4j.linalg.api.iter.FirstAxisIterator
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.iter FirstAxisIterator]))

(defn ->first-axis-iterator
  "Constructor.

  iterate-over - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^FirstAxisIterator [^org.nd4j.linalg.api.ndarray.INDArray iterate-over]
    (new FirstAxisIterator iterate-over)))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^FirstAxisIterator this]
    (-> this (.hasNext))))

(defn remove
  ""
  ([^FirstAxisIterator this]
    (-> this (.remove))))

(defn next
  "returns: `java.lang.Object`"
  (^java.lang.Object [^FirstAxisIterator this]
    (-> this (.next))))

