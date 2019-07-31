(ns org.deeplearning4j.spark.text.functions.ReduceSentenceCount
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.text.functions ReduceSentenceCount]))

(defn ->reduce-sentence-count
  "Constructor."
  (^ReduceSentenceCount []
    (new ReduceSentenceCount )))

(defn call
  "a - `java.util.concurrent.atomic.AtomicLong`
  b - `java.util.concurrent.atomic.AtomicLong`

  returns: `java.util.concurrent.atomic.AtomicLong`"
  (^java.util.concurrent.atomic.AtomicLong [^ReduceSentenceCount this ^java.util.concurrent.atomic.AtomicLong a ^java.util.concurrent.atomic.AtomicLong b]
    (-> this (.call a b))))

