(ns org.deeplearning4j.parallelism.main.MultiDataSetProviderFactory
  "Creates an MultiDataSetIterator"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.parallelism.main MultiDataSetProviderFactory]))

(defn create
  "Create an MultiDataSetIterator

  returns: `org.nd4j.linalg.dataset.api.iterator.MultiDataSetIterator`"
  (^org.nd4j.linalg.dataset.api.iterator.MultiDataSetIterator [^MultiDataSetProviderFactory this]
    (-> this (.create))))

