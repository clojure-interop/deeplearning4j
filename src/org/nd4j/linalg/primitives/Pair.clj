(ns org.nd4j.linalg.primitives.Pair
  "Simple pair implementation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.primitives Pair]))

(defn ->pair
  "Constructor."
  (^Pair []
    (new Pair )))

(defn *of
  "key - `T`
  value - `E`

  returns: `<T,E> org.nd4j.linalg.primitives.Pair<T,E>`"
  ([key value]
    (Pair/of key value)))

(defn *make-pair
  "key - `T`
  value - `E`

  returns: `<T,E> org.nd4j.linalg.primitives.Pair<T,E>`"
  ([key value]
    (Pair/makePair key value)))

(defn *create
  "key - `T`
  value - `E`

  returns: `<T,E> org.nd4j.linalg.primitives.Pair<T,E>`"
  ([key value]
    (Pair/create key value)))

(defn *pair-of
  "key - `T`
  value - `E`

  returns: `<T,E> org.nd4j.linalg.primitives.Pair<T,E>`"
  ([key value]
    (Pair/pairOf key value)))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Pair this]
    (-> this (.toString))))

(defn get-left
  "returns: `K`"
  ([^Pair this]
    (-> this (.getLeft))))

(defn get-right
  "returns: `V`"
  ([^Pair this]
    (-> this (.getRight))))

(defn get-first
  "returns: `K`"
  ([^Pair this]
    (-> this (.getFirst))))

(defn get-second
  "returns: `V`"
  ([^Pair this]
    (-> this (.getSecond))))

(defn set-first
  "first - `K`"
  ([^Pair this first]
    (-> this (.setFirst first))))

(defn set-second
  "second - `V`"
  ([^Pair this second]
    (-> this (.setSecond second))))

