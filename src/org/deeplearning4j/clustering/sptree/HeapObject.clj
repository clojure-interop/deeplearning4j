(ns org.deeplearning4j.clustering.sptree.HeapObject
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.clustering.sptree HeapObject]))

(defn ->heap-object
  "Constructor.

  index - `int`
  point - `org.nd4j.linalg.api.ndarray.INDArray`
  distance - `double`"
  (^HeapObject [^Integer index ^org.nd4j.linalg.api.ndarray.INDArray point ^Double distance]
    (new HeapObject index point distance)))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^HeapObject this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^HeapObject this]
    (-> this (.hashCode))))

(defn compare-to
  "o - `org.deeplearning4j.clustering.sptree.HeapObject`

  returns: `int`"
  (^Integer [^HeapObject this ^org.deeplearning4j.clustering.sptree.HeapObject o]
    (-> this (.compareTo o))))

