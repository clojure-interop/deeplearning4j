(ns org.nd4j.linalg.dataset.api.preprocessor.DataNormalization
  "An interface for data normalizers.
 Data normalizers compute some sort of statistics
 over a dataset and scale the data in some way."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset.api.preprocessor DataNormalization]))

(defn fit
  "Iterates over a dataset
  accumulating statistics for normalization

  iterator - the iterator to use forcollecting statistics. - `org.nd4j.linalg.dataset.api.iterator.DataSetIterator`"
  ([^DataNormalization this ^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iterator]
    (-> this (.fit iterator))))

(defn pre-process
  "Description copied from interface: DataSetPreProcessor

  to-pre-process - the data set to pre process - `org.nd4j.linalg.dataset.api.DataSet`"
  ([^DataNormalization this ^org.nd4j.linalg.dataset.api.DataSet to-pre-process]
    (-> this (.preProcess to-pre-process))))

(defn transform
  "Transform the features, with an optional mask array

  features - the features to pre process - `org.nd4j.linalg.api.ndarray.INDArray`
  features-mask - the mask array to pre process - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^DataNormalization this ^org.nd4j.linalg.api.ndarray.INDArray features ^org.nd4j.linalg.api.ndarray.INDArray features-mask]
    (-> this (.transform features features-mask)))
  ([^DataNormalization this ^org.nd4j.linalg.api.ndarray.INDArray features]
    (-> this (.transform features))))

(defn transform-label
  "Transform the labels. If isFitLabel() == false, this is a no-op

  labels - `org.nd4j.linalg.api.ndarray.INDArray`
  labels-mask - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^DataNormalization this ^org.nd4j.linalg.api.ndarray.INDArray labels ^org.nd4j.linalg.api.ndarray.INDArray labels-mask]
    (-> this (.transformLabel labels labels-mask)))
  ([^DataNormalization this ^org.nd4j.linalg.api.ndarray.INDArray labels]
    (-> this (.transformLabel labels))))

(defn revert-features
  "Undo (revert) the normalization applied by this DataNormalization instance to the specified features array

  features - Features to revert the normalization on - `org.nd4j.linalg.api.ndarray.INDArray`
  features-mask - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^DataNormalization this ^org.nd4j.linalg.api.ndarray.INDArray features ^org.nd4j.linalg.api.ndarray.INDArray features-mask]
    (-> this (.revertFeatures features features-mask)))
  ([^DataNormalization this ^org.nd4j.linalg.api.ndarray.INDArray features]
    (-> this (.revertFeatures features))))

(defn revert-labels
  "Undo (revert) the normalization applied by this DataNormalization instance to the specified labels array.
  If labels normalization is disabled (i.e., #isFitLabels() == false) then this is a no-op.
  Can also be used to undo normalization for network output arrays, in the case of regression.

  labels - Labels array to revert the normalization on - `org.nd4j.linalg.api.ndarray.INDArray`
  labels-mask - Labels mask array (may be null) - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^DataNormalization this ^org.nd4j.linalg.api.ndarray.INDArray labels ^org.nd4j.linalg.api.ndarray.INDArray labels-mask]
    (-> this (.revertLabels labels labels-mask)))
  ([^DataNormalization this ^org.nd4j.linalg.api.ndarray.INDArray labels]
    (-> this (.revertLabels labels))))

(defn fit-label
  "Flag to specify if the labels/outputs in the dataset should be also normalized. Default value is usually false.

  fit-labels - `boolean`"
  ([^DataNormalization this ^Boolean fit-labels]
    (-> this (.fitLabel fit-labels))))

(defn fit-label?
  "Whether normalization for the labels is also enabled. Most commonly used for regression, not classification.

  returns: True if labels will be - `boolean`"
  (^Boolean [^DataNormalization this]
    (-> this (.isFitLabel))))

