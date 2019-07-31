(ns org.nd4j.linalg.dataset.api.preprocessor.AbstractMultiDataSetNormalizer
  "Abstract base class for normalizers that act upon MultiDataSet instances or iterators"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset.api.preprocessor AbstractMultiDataSetNormalizer]))

(defn fit-label?
  "Whether normalization for the labels is also enabled. Most commonly used for regression, not classification.

  returns: True if labels will be - `boolean`"
  (^Boolean [^AbstractMultiDataSetNormalizer this]
    (-> this (.isFitLabel))))

(defn fit-label
  "Flag to specify if the labels/outputs in the dataset should be also normalized
  default value is false

  fit-labels - `boolean`"
  ([^AbstractMultiDataSetNormalizer this ^Boolean fit-labels]
    (-> this (.fitLabel fit-labels))))

(defn revert
  "Revert the data to what it was before transform

  data - the dataset to revert back - `org.nd4j.linalg.dataset.api.MultiDataSet`"
  ([^AbstractMultiDataSetNormalizer this ^org.nd4j.linalg.dataset.api.MultiDataSet data]
    (-> this (.revert data))))

(defn fit
  "Fit a MultiDataSet (only compute based on the statistics from this MultiDataSet)

  data-set - the dataset to compute on - `org.nd4j.linalg.dataset.api.MultiDataSet`"
  ([^AbstractMultiDataSetNormalizer this ^org.nd4j.linalg.dataset.api.MultiDataSet data-set]
    (-> this (.fit data-set))))

(defn transform
  "Description copied from interface: Normalizer

  to-pre-process - the dataset to re process - `org.nd4j.linalg.dataset.api.MultiDataSet`"
  ([^AbstractMultiDataSetNormalizer this ^org.nd4j.linalg.dataset.api.MultiDataSet to-pre-process]
    (-> this (.transform to-pre-process))))

(defn pre-process
  "Pre process a MultiDataSet

  to-pre-process - the data set to pre process - `org.nd4j.linalg.dataset.api.MultiDataSet`"
  ([^AbstractMultiDataSetNormalizer this ^org.nd4j.linalg.dataset.api.MultiDataSet to-pre-process]
    (-> this (.preProcess to-pre-process))))

(defn num-outputs
  "Get the number of outputs

  returns: `int`"
  (^Integer [^AbstractMultiDataSetNormalizer this]
    (-> this (.numOutputs))))

(defn num-inputs
  "Get the number of inputs

  returns: `int`"
  (^Integer [^AbstractMultiDataSetNormalizer this]
    (-> this (.numInputs))))

(defn revert-features
  "Undo (revert) the normalization applied by this normalizer to a specific features array.
  If labels normalization is disabled (i.e., isFitLabel() == false) then this is a no-op.
  Can also be used to undo normalization for network output arrays, in the case of regression.

  features - features arrays to revert the normalization on - `org.nd4j.linalg.api.ndarray.INDArray`
  mask - `org.nd4j.linalg.api.ndarray.INDArray`
  input - the index of the array to revert - `int`"
  ([^AbstractMultiDataSetNormalizer this ^org.nd4j.linalg.api.ndarray.INDArray features ^org.nd4j.linalg.api.ndarray.INDArray mask ^Integer input]
    (-> this (.revertFeatures features mask input)))
  ([^AbstractMultiDataSetNormalizer this features mask-arrays]
    (-> this (.revertFeatures features mask-arrays)))
  ([^AbstractMultiDataSetNormalizer this features]
    (-> this (.revertFeatures features))))

(defn revert-labels
  "Undo (revert) the normalization applied by this normalizer to a specific labels array.
  If labels normalization is disabled (i.e., isFitLabel() == false) then this is a no-op.
  Can also be used to undo normalization for network output arrays, in the case of regression.

  labels - Labels arrays to revert the normalization on - `org.nd4j.linalg.api.ndarray.INDArray`
  mask - `org.nd4j.linalg.api.ndarray.INDArray`
  output - the index of the array to revert - `int`"
  ([^AbstractMultiDataSetNormalizer this ^org.nd4j.linalg.api.ndarray.INDArray labels ^org.nd4j.linalg.api.ndarray.INDArray mask ^Integer output]
    (-> this (.revertLabels labels mask output)))
  ([^AbstractMultiDataSetNormalizer this labels labels-mask]
    (-> this (.revertLabels labels labels-mask)))
  ([^AbstractMultiDataSetNormalizer this labels]
    (-> this (.revertLabels labels))))

