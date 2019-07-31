(ns org.deeplearning4j.spark.parameterserver.iterators.MultiPdsIterator
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.parameterserver.iterators MultiPdsIterator]))

(defn ->multi-pds-iterator
  "Constructor.

  pds - `java.util.Iterator`
  callback - `org.deeplearning4j.spark.parameterserver.callbacks.PortableDataStreamMDSCallback`"
  (^MultiPdsIterator [^java.util.Iterator pds ^org.deeplearning4j.spark.parameterserver.callbacks.PortableDataStreamMDSCallback callback]
    (new MultiPdsIterator pds callback)))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^MultiPdsIterator this]
    (-> this (.hasNext))))

(defn next
  "returns: `org.nd4j.linalg.dataset.api.MultiDataSet`"
  (^org.nd4j.linalg.dataset.api.MultiDataSet [^MultiPdsIterator this]
    (-> this (.next))))

(defn remove
  ""
  ([^MultiPdsIterator this]
    (-> this (.remove))))

(defn for-each-remaining
  "action - `java.util.function.Consumer`"
  ([^MultiPdsIterator this ^java.util.function.Consumer action]
    (-> this (.forEachRemaining action))))

