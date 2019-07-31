(ns org.nd4j.linalg.collection.MultiDimensionalMap$Entry
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.collection MultiDimensionalMap$Entry]))

(defn ->entry
  "Constructor.

  first-key - `K`
  second-key - `T`
  value - `V`"
  (^MultiDimensionalMap$Entry [first-key second-key value]
    (new MultiDimensionalMap$Entry first-key second-key value)))

(defn get-first-key
  "returns: `K`"
  ([^MultiDimensionalMap$Entry this]
    (-> this (.getFirstKey))))

(defn set-first-key
  "first-key - `K`"
  ([^MultiDimensionalMap$Entry this first-key]
    (-> this (.setFirstKey first-key))))

(defn get-second-key
  "returns: `T`"
  ([^MultiDimensionalMap$Entry this]
    (-> this (.getSecondKey))))

(defn set-second-key
  "second-key - `T`"
  ([^MultiDimensionalMap$Entry this second-key]
    (-> this (.setSecondKey second-key))))

(defn get-value
  "returns: `V`"
  ([^MultiDimensionalMap$Entry this]
    (-> this (.getValue))))

(defn set-value
  "Replaces the value corresponding to this entry with the specified
  value (optional operation). (Writes through to the map.) The
  behavior of this call is undefined if the mapping has already been
  removed from the map (by the iterator's remove operation).

  value - new value to be stored in this entry - `V`

  returns: old value corresponding to the entry - `V`

  throws: java.lang.UnsupportedOperationException - if the put operationis not supported by the backing map"
  ([^MultiDimensionalMap$Entry this value]
    (-> this (.setValue value))))

(defn get-key
  "Returns the key corresponding to this entry.

  returns: the key corresponding to this entry - `org.nd4j.linalg.primitives.Pair<K,T>`

  throws: java.lang.IllegalStateException - implementations may, but are notrequired to, throw this exception if the entry has beenremoved from the backing map."
  (^org.nd4j.linalg.primitives.Pair [^MultiDimensionalMap$Entry this]
    (-> this (.getKey))))

