(ns org.nd4j.linalg.dataset.api.preprocessor.AbstractDataSetNormalizer
  "Abstract base class for normalizers
 that act upon DataSet instances
 or iterators"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset.api.preprocessor AbstractDataSetNormalizer]))

(defn fit-label?
  "Whether normalization for the labels is also enabled. Most commonly used for regression, not classification.

  returns: True if labels will be - `boolean`"
  (^Boolean [^AbstractDataSetNormalizer this]
    (-> this (.isFitLabel))))

(defn fit-label
  "Flag to specify if the labels/outputs in the dataset should be also normalized
  default value is false

  fit-labels - `boolean`"
  ([^AbstractDataSetNormalizer this ^Boolean fit-labels]
    (-> this (.fitLabel fit-labels))))

(defn revert
  "Revert the data to what it was before transform

  data - the dataset to revert back - `org.nd4j.linalg.dataset.api.DataSet`"
  ([^AbstractDataSetNormalizer this ^org.nd4j.linalg.dataset.api.DataSet data]
    (-> this (.revert data))))

(defn fit
  "Fit a dataset (only compute based on the statistics from this dataset)

  data-set - the dataset to compute on - `org.nd4j.linalg.dataset.api.DataSet`"
  ([^AbstractDataSetNormalizer this ^org.nd4j.linalg.dataset.api.DataSet data-set]
    (-> this (.fit data-set))))

(defn transform
  "Description copied from interface: DataNormalization

  features - the features to pre process - `org.nd4j.linalg.api.ndarray.INDArray`
  features-mask - the mask array to pre process - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^AbstractDataSetNormalizer this ^org.nd4j.linalg.api.ndarray.INDArray features ^org.nd4j.linalg.api.ndarray.INDArray features-mask]
    (-> this (.transform features features-mask)))
  ([^AbstractDataSetNormalizer this ^org.nd4j.linalg.dataset.api.DataSet to-pre-process]
    (-> this (.transform to-pre-process))))

(defn pre-process
  "Pre process a dataset

  to-pre-process - the data set to pre process - `org.nd4j.linalg.dataset.api.DataSet`"
  ([^AbstractDataSetNormalizer this ^org.nd4j.linalg.dataset.api.DataSet to-pre-process]
    (-> this (.preProcess to-pre-process))))

(defn revert-features
  "Description copied from interface: DataNormalization

  features - Features to revert the normalization on - `org.nd4j.linalg.api.ndarray.INDArray`
  features-mask - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^AbstractDataSetNormalizer this ^org.nd4j.linalg.api.ndarray.INDArray features ^org.nd4j.linalg.api.ndarray.INDArray features-mask]
    (-> this (.revertFeatures features features-mask)))
  ([^AbstractDataSetNormalizer this ^org.nd4j.linalg.api.ndarray.INDArray features]
    (-> this (.revertFeatures features))))

(defn transform-label
  "Description copied from interface: DataNormalization

  label - `org.nd4j.linalg.api.ndarray.INDArray`
  labels-mask - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^AbstractDataSetNormalizer this ^org.nd4j.linalg.api.ndarray.INDArray label ^org.nd4j.linalg.api.ndarray.INDArray labels-mask]
    (-> this (.transformLabel label labels-mask)))
  ([^AbstractDataSetNormalizer this ^org.nd4j.linalg.api.ndarray.INDArray label]
    (-> this (.transformLabel label))))

(defn revert-labels
  "Description copied from interface: DataNormalization

  labels - Labels array to revert the normalization on - `org.nd4j.linalg.api.ndarray.INDArray`
  labels-mask - Labels mask array (may be null) - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^AbstractDataSetNormalizer this ^org.nd4j.linalg.api.ndarray.INDArray labels ^org.nd4j.linalg.api.ndarray.INDArray labels-mask]
    (-> this (.revertLabels labels labels-mask)))
  ([^AbstractDataSetNormalizer this ^org.nd4j.linalg.api.ndarray.INDArray labels]
    (-> this (.revertLabels labels))))

