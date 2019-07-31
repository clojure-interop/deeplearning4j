(ns org.nd4j.linalg.primitives.AtomicBoolean
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.primitives AtomicBoolean]))

(defn ->atomic-boolean
  "Constructor.

  initial-value - `boolean`"
  (^AtomicBoolean [^Boolean initial-value]
    (new AtomicBoolean initial-value))
  (^AtomicBoolean []
    (new AtomicBoolean )))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AtomicBoolean this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^AtomicBoolean this]
    (-> this (.hashCode))))

