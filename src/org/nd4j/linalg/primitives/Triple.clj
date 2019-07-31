(ns org.nd4j.linalg.primitives.Triple
  "Simple triple elements holder implementation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.primitives Triple]))

(defn ->triple
  "Constructor."
  (^Triple []
    (new Triple )))

(defn *triple-of
  "first - `F`
  second - `S`
  third - `T`

  returns: `<F,S,T> org.nd4j.linalg.primitives.Triple<F,S,T>`"
  ([first second third]
    (Triple/tripleOf first second third)))

(defn *of
  "first - `F`
  second - `S`
  third - `T`

  returns: `<F,S,T> org.nd4j.linalg.primitives.Triple<F,S,T>`"
  ([first second third]
    (Triple/of first second third)))

(defn get-left
  "returns: `F`"
  ([^Triple this]
    (-> this (.getLeft))))

(defn get-middle
  "returns: `S`"
  ([^Triple this]
    (-> this (.getMiddle))))

(defn get-right
  "returns: `T`"
  ([^Triple this]
    (-> this (.getRight))))

