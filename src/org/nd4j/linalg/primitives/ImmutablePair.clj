(ns org.nd4j.linalg.primitives.ImmutablePair
  "Simple pair implementation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.primitives ImmutablePair]))

(defn *of
  "key - `T`
  value - `E`

  returns: `<T,E> org.nd4j.linalg.primitives.ImmutablePair<T,E>`"
  ([key value]
    (ImmutablePair/of key value)))

(defn *make-pair
  "key - `T`
  value - `E`

  returns: `<T,E> org.nd4j.linalg.primitives.ImmutablePair<T,E>`"
  ([key value]
    (ImmutablePair/makePair key value)))

(defn *create
  "key - `T`
  value - `E`

  returns: `<T,E> org.nd4j.linalg.primitives.ImmutablePair<T,E>`"
  ([key value]
    (ImmutablePair/create key value)))

(defn *pair-of
  "key - `T`
  value - `E`

  returns: `<T,E> org.nd4j.linalg.primitives.ImmutablePair<T,E>`"
  ([key value]
    (ImmutablePair/pairOf key value)))

(defn get-left
  "returns: `K`"
  ([^ImmutablePair this]
    (-> this (.getLeft))))

(defn get-right
  "returns: `V`"
  ([^ImmutablePair this]
    (-> this (.getRight))))

(defn get-first
  "returns: `K`"
  ([^ImmutablePair this]
    (-> this (.getFirst))))

(defn get-second
  "returns: `V`"
  ([^ImmutablePair this]
    (-> this (.getSecond))))

