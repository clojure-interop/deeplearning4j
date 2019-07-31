(ns org.nd4j.linalg.dataset.api.preprocessor.AbstractNormalizer
  "Abstract base class for normalizers for both DataSet and MultiDataSet processing"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset.api.preprocessor AbstractNormalizer]))

(defn ->abstract-normalizer
  "Constructor."
  (^AbstractNormalizer []
    (new AbstractNormalizer )))

