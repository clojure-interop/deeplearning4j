(ns org.deeplearning4j.clustering.sptree.HeapItem
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.clustering.sptree HeapItem]))

(defn ->heap-item
  "Constructor.

  index - `int`
  distance - `double`"
  (^HeapItem [^Integer index ^Double distance]
    (new HeapItem index distance)))

(defn get-index
  "returns: `int`"
  (^Integer [^HeapItem this]
    (-> this (.getIndex))))

(defn set-index
  "index - `int`"
  ([^HeapItem this ^Integer index]
    (-> this (.setIndex index))))

(defn get-distance
  "returns: `double`"
  (^Double [^HeapItem this]
    (-> this (.getDistance))))

(defn set-distance
  "distance - `double`"
  ([^HeapItem this ^Double distance]
    (-> this (.setDistance distance))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^HeapItem this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^HeapItem this]
    (-> this (.hashCode))))

(defn compare-to
  "o - `org.deeplearning4j.clustering.sptree.HeapItem`

  returns: `int`"
  (^Integer [^HeapItem this ^org.deeplearning4j.clustering.sptree.HeapItem o]
    (-> this (.compareTo o))))

