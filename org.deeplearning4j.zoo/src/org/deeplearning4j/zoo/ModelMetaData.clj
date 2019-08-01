(ns org.deeplearning4j.zoo.ModelMetaData
  "Deprecated.
 As of May 10, 2018. Will be removed in v1.1. Getters are now available on the inputShape from the ZooModel implementation."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.zoo ModelMetaData]))

(defn ->model-meta-data
  "Constructor.

  Deprecated."
  (^ModelMetaData []
    (new ModelMetaData )))

(defn use-mds
  "Deprecated.

  returns: `boolean`"
  (^Boolean [^ModelMetaData this]
    (-> this (.useMDS))))

