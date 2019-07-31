(ns org.nd4j.linalg.primitives.ImmutableTriple
  "Simple triple elements holder implementation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.primitives ImmutableTriple]))

(defn *triple-of
  "first - `F`
  second - `S`
  third - `T`

  returns: `<F,S,T> org.nd4j.linalg.primitives.ImmutableTriple<F,S,T>`"
  ([first second third]
    (ImmutableTriple/tripleOf first second third)))

(defn *of
  "first - `F`
  second - `S`
  third - `T`

  returns: `<F,S,T> org.nd4j.linalg.primitives.ImmutableTriple<F,S,T>`"
  ([first second third]
    (ImmutableTriple/of first second third)))

(defn get-left
  "returns: `F`"
  ([^ImmutableTriple this]
    (-> this (.getLeft))))

(defn get-middle
  "returns: `S`"
  ([^ImmutableTriple this]
    (-> this (.getMiddle))))

(defn get-right
  "returns: `T`"
  ([^ImmutableTriple this]
    (-> this (.getRight))))

