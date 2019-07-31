(ns org.nd4j.linalg.util.LongUtils
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.util LongUtils]))

(defn ->long-utils
  "Constructor."
  (^LongUtils []
    (new LongUtils )))

(defn *to-ints
  "array - `long[]`

  returns: `int[]`"
  ([array]
    (LongUtils/toInts array)))

(defn *to-longs
  "array - `int[]`

  returns: `long[]`"
  ([array]
    (LongUtils/toLongs array)))

