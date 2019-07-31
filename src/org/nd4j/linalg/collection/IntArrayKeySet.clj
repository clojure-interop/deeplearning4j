(ns org.nd4j.linalg.collection.IntArrayKeySet
  "Provides a wrapper for a TreeSet
 that uses IntArrayKeyMap.IntArray
 for proper comparison of int arrays
 as keys."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.collection IntArrayKeySet]))

(defn ->int-array-key-set
  "Constructor."
  (^IntArrayKeySet []
    (new IntArrayKeySet )))

(defn add-all
  "collection - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^IntArrayKeySet this ^java.util.Collection collection]
    (-> this (.addAll collection))))

(defn contains
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^IntArrayKeySet this ^java.lang.Object o]
    (-> this (.contains o))))

(defn iterator
  "returns: `java.util.Iterator<int[]>`"
  ([^IntArrayKeySet this]
    (-> this (.iterator))))

(defn remove
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^IntArrayKeySet this ^java.lang.Object o]
    (-> this (.remove o))))

(defn add
  "ints - `int[]`

  returns: `boolean`"
  (^Boolean [^IntArrayKeySet this ints]
    (-> this (.add ints))))

(defn empty?
  "returns: `boolean`"
  (^Boolean [^IntArrayKeySet this]
    (-> this (.isEmpty))))

(defn size
  "returns: `int`"
  (^Integer [^IntArrayKeySet this]
    (-> this (.size))))

(defn retain-all
  "collection - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^IntArrayKeySet this ^java.util.Collection collection]
    (-> this (.retainAll collection))))

(defn clear
  ""
  ([^IntArrayKeySet this]
    (-> this (.clear))))

(defn to-array
  "ts - `T[]`

  returns: `<T> T[]`"
  ([^IntArrayKeySet this ts]
    (-> this (.toArray ts)))
  ([^IntArrayKeySet this]
    (-> this (.toArray))))

(defn remove-all
  "collection - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^IntArrayKeySet this ^java.util.Collection collection]
    (-> this (.removeAll collection))))

(defn contains-all
  "collection - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^IntArrayKeySet this ^java.util.Collection collection]
    (-> this (.containsAll collection))))

