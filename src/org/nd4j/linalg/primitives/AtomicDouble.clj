(ns org.nd4j.linalg.primitives.AtomicDouble
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.primitives AtomicDouble]))

(defn ->atomic-double
  "Constructor.

  value - `double`"
  (^AtomicDouble [^Double value]
    (new AtomicDouble value))
  (^AtomicDouble []
    (new AtomicDouble )))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AtomicDouble this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^AtomicDouble this]
    (-> this (.hashCode))))

