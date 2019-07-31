(ns org.nd4j.linalg.collection.IntArrayKeyMap$IntArray
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.collection IntArrayKeyMap$IntArray]))

(defn ->int-array
  "Constructor.

  backing-array - `int[]`"
  (^IntArrayKeyMap$IntArray [backing-array]
    (new IntArrayKeyMap$IntArray backing-array)))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^IntArrayKeyMap$IntArray this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^IntArrayKeyMap$IntArray this]
    (-> this (.hashCode))))

(defn compare-to
  "int-array - `org.nd4j.linalg.collection.IntArrayKeyMap$IntArray`

  returns: `int`"
  (^Integer [^IntArrayKeyMap$IntArray this ^org.nd4j.linalg.collection.IntArrayKeyMap$IntArray int-array]
    (-> this (.compareTo int-array))))

