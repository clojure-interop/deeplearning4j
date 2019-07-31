(ns org.deeplearning4j.spark.parameterserver.util.CountingIterator
  "A simple iterator that adds 1 to the specified counter every time next() is called"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.parameterserver.util CountingIterator]))

(defn ->counting-iterator
  "Constructor."
  (^CountingIterator []
    (new CountingIterator )))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^CountingIterator this]
    (-> this (.hasNext))))

(defn next
  "returns: `T`"
  ([^CountingIterator this]
    (-> this (.next))))

