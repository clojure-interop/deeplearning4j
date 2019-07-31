(ns org.nd4j.linalg.dataset.api.preprocessor.Normalizer
  "Base interface for all normalizers"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset.api.preprocessor Normalizer]))

(defn fit
  "Fit a dataset (only compute based on the statistics from this dataset)

  data-set - the dataset to compute on - `T`"
  ([^Normalizer this data-set]
    (-> this (.fit data-set))))

(defn transform
  "Transform the dataset

  to-pre-process - the dataset to re process - `T`"
  ([^Normalizer this to-pre-process]
    (-> this (.transform to-pre-process))))

(defn revert
  "Undo (revert) the normalization applied by this DataNormalization instance (arrays are modified in-place)

  to-revert - DataSet to revert the normalization on - `T`"
  ([^Normalizer this to-revert]
    (-> this (.revert to-revert))))

(defn get-type
  "Get the enum opType of this normalizer

  returns: the opType - `org.nd4j.linalg.dataset.api.preprocessor.serializer.NormalizerType`"
  (^org.nd4j.linalg.dataset.api.preprocessor.serializer.NormalizerType [^Normalizer this]
    (-> this (.getType))))

