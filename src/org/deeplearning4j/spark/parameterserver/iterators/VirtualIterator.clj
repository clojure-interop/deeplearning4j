(ns org.deeplearning4j.spark.parameterserver.iterators.VirtualIterator
  "This class is thin wrapper, to provide block-until-depleted functionality in multi-threaded environment"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.parameterserver.iterators VirtualIterator]))

(defn ->virtual-iterator
  "Constructor.

  iterator - `java.util.Iterator`"
  (^VirtualIterator [^java.util.Iterator iterator]
    (new VirtualIterator iterator)))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^VirtualIterator this]
    (-> this (.hasNext))))

(defn next
  "returns: `E`"
  ([^VirtualIterator this]
    (-> this (.next))))

(defn remove
  ""
  ([^VirtualIterator this]
    (-> this (.remove))))

(defn for-each-remaining
  "action - `java.util.function.Consumer`"
  ([^VirtualIterator this ^java.util.function.Consumer action]
    (-> this (.forEachRemaining action))))

(defn block-until-depleted
  "This method blocks until underlying Iterator is depleted"
  ([^VirtualIterator this]
    (-> this (.blockUntilDepleted))))

