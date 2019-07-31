(ns org.deeplearning4j.models.glove.count.CountMap
  "Drop-in replacement for CounterMap
 WORK IN PROGRESS, PLEASE DO NOT USE"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.glove.count CountMap]))

(defn ->count-map
  "Constructor."
  (^CountMap []
    (new CountMap )))

(defn increment-count
  "element-1 - `T`
  element-2 - `T`
  weight - `double`"
  ([^CountMap this element-1 element-2 ^Double weight]
    (-> this (.incrementCount element-1 element-2 weight))))

(defn remove-pair
  "element-1 - `T`
  element-2 - `T`"
  ([^CountMap this element-1 element-2]
    (-> this (.removePair element-1 element-2)))
  ([^CountMap this ^org.nd4j.linalg.primitives.Pair pair]
    (-> this (.removePair pair))))

(defn get-count
  "element-1 - `T`
  element-2 - `T`

  returns: `double`"
  (^Double [^CountMap this element-1 element-2]
    (-> this (.getCount element-1 element-2)))
  (^Double [^CountMap this ^org.nd4j.linalg.primitives.Pair pair]
    (-> this (.getCount pair))))

(defn get-pair-iterator
  "returns: `java.util.Iterator<org.nd4j.linalg.primitives.Pair<T,T>>`"
  (^java.util.Iterator [^CountMap this]
    (-> this (.getPairIterator))))

(defn size
  "returns: `int`"
  (^Integer [^CountMap this]
    (-> this (.size))))

