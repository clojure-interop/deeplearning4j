(ns org.nd4j.linalg.profiler.data.primitives.ComparableAtomicLong
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.profiler.data.primitives ComparableAtomicLong]))

(defn ->comparable-atomic-long
  "Constructor.

  starting-value - `long`"
  (^ComparableAtomicLong [^Long starting-value]
    (new ComparableAtomicLong starting-value))
  (^ComparableAtomicLong []
    (new ComparableAtomicLong )))

(defn compare-to
  "o - `org.nd4j.linalg.profiler.data.primitives.ComparableAtomicLong`

  returns: `int`"
  (^Integer [^ComparableAtomicLong this ^org.nd4j.linalg.profiler.data.primitives.ComparableAtomicLong o]
    (-> this (.compareTo o))))

