(ns org.nd4j.linalg.dataset.api.iterator.MultiDataSetIteratorFactory
  "Creates MultiDataSetIterator.
 Typically used in command line applications."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset.api.iterator MultiDataSetIteratorFactory]))

(defn create
  "Create a MultiDataSetIterator

  returns: `org.nd4j.linalg.dataset.api.iterator.MultiDataSetIterator`"
  (^org.nd4j.linalg.dataset.api.iterator.MultiDataSetIterator [^MultiDataSetIteratorFactory this]
    (-> this (.create))))

