(ns org.deeplearning4j.parallelism.main.DataSetIteratorProviderFactory
  "Create a dataset iterator.
 This is for use with ParallelWrapperMain"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.parallelism.main DataSetIteratorProviderFactory]))

(defn create
  "Create an DataSetIterator

  returns: `org.nd4j.linalg.dataset.api.iterator.DataSetIterator`"
  (^org.nd4j.linalg.dataset.api.iterator.DataSetIterator [^DataSetIteratorProviderFactory this]
    (-> this (.create))))

