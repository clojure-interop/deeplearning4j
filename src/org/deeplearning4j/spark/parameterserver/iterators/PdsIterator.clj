(ns org.deeplearning4j.spark.parameterserver.iterators.PdsIterator
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.parameterserver.iterators PdsIterator]))

(defn ->pds-iterator
  "Constructor.

  pds - `java.util.Iterator`
  callback - `org.deeplearning4j.spark.parameterserver.callbacks.PortableDataStreamCallback`"
  (^PdsIterator [^java.util.Iterator pds ^org.deeplearning4j.spark.parameterserver.callbacks.PortableDataStreamCallback callback]
    (new PdsIterator pds callback)))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^PdsIterator this]
    (-> this (.hasNext))))

(defn next
  "returns: `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^PdsIterator this]
    (-> this (.next))))

(defn remove
  ""
  ([^PdsIterator this]
    (-> this (.remove))))

(defn for-each-remaining
  "action - `java.util.function.Consumer`"
  ([^PdsIterator this ^java.util.function.Consumer action]
    (-> this (.forEachRemaining action))))

