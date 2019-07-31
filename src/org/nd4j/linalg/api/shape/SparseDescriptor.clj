(ns org.nd4j.linalg.api.shape.SparseDescriptor
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.shape SparseDescriptor]))

(defn ->sparse-descriptor
  "Constructor.

  flags - `int[]`
  sparse-offsets - `long[]`
  hidden-dimension - `int[]`
  underlying-rank - `int`"
  (^SparseDescriptor [flags sparse-offsets hidden-dimension ^Integer underlying-rank]
    (new SparseDescriptor flags sparse-offsets hidden-dimension underlying-rank)))

(defn hash-code
  "returns: `int`"
  (^Integer [^SparseDescriptor this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^SparseDescriptor this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^SparseDescriptor this]
    (-> this (.toString))))

