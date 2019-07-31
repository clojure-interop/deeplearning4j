(ns org.nd4j.linalg.cache.ArrayDescriptor
  "This is utility class, made to compare java arrays for caching purposes."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.cache ArrayDescriptor]))

(defn ->array-descriptor
  "Constructor.

  array - `int[]`"
  (^ArrayDescriptor [array]
    (new ArrayDescriptor array)))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ArrayDescriptor this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ArrayDescriptor this]
    (-> this (.hashCode))))

