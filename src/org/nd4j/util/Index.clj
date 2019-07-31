(ns org.nd4j.util.Index
  "An index is a transform of objects augmented with a list and a reverse lookup table
 for fast lookups.
 Indices are used for vocabulary in many of the natural language processing"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.util Index]))

(defn ->index
  "Constructor."
  (^Index []
    (new Index )))

(defn add
  "o - `java.lang.Object`
  idx - `int`

  returns: `boolean`"
  (^Boolean [^Index this ^java.lang.Object o ^Integer idx]
    (-> this (.add o idx)))
  (^Boolean [^Index this ^java.lang.Object o]
    (-> this (.add o))))

(defn index-of
  "o - `java.lang.Object`

  returns: `int`"
  (^Integer [^Index this ^java.lang.Object o]
    (-> this (.indexOf o))))

(defn get
  "i - `int`

  returns: `java.lang.Object`"
  (^java.lang.Object [^Index this ^Integer i]
    (-> this (.get i))))

(defn size
  "returns: `int`"
  (^Integer [^Index this]
    (-> this (.size))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Index this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Index this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Index this]
    (-> this (.hashCode))))

