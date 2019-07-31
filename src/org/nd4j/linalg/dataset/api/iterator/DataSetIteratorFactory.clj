(ns org.nd4j.linalg.dataset.api.iterator.DataSetIteratorFactory
  "Creates DataSetIterator.
 Typically used in command line applications."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset.api.iterator DataSetIteratorFactory]))

(defn create
  "returns: `org.nd4j.linalg.dataset.api.iterator.DataSetIterator`"
  (^org.nd4j.linalg.dataset.api.iterator.DataSetIterator [^DataSetIteratorFactory this]
    (-> this (.create))))

