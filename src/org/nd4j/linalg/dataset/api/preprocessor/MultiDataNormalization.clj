(ns org.nd4j.linalg.dataset.api.preprocessor.MultiDataNormalization
  "An interface for multi dataset normalizers.
 Data normalizers compute some sort of statistics
 over a MultiDataSet and scale the data in some way."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset.api.preprocessor MultiDataNormalization]))

(defn fit
  "Iterates over a dataset
  accumulating statistics for normalization

  iterator - the iterator to use forcollecting statistics. - `org.nd4j.linalg.dataset.api.iterator.MultiDataSetIterator`"
  ([^MultiDataNormalization this ^org.nd4j.linalg.dataset.api.iterator.MultiDataSetIterator iterator]
    (-> this (.fit iterator))))

(defn pre-process
  "Description copied from interface: MultiDataSetPreProcessor

  multi-data-set - `org.nd4j.linalg.dataset.api.MultiDataSet`"
  ([^MultiDataNormalization this ^org.nd4j.linalg.dataset.api.MultiDataSet multi-data-set]
    (-> this (.preProcess multi-data-set))))

(defn revert-features
  "Undo (revert) the normalization applied by this DataNormalization instance to the specified features array

  features - Features to revert the normalization on - `org.nd4j.linalg.api.ndarray.INDArray[]`
  features-mask - `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^MultiDataNormalization this features features-mask]
    (-> this (.revertFeatures features features-mask)))
  ([^MultiDataNormalization this features]
    (-> this (.revertFeatures features))))

(defn revert-labels
  "Undo (revert) the normalization applied by this DataNormalization instance to the specified labels array.
  If labels normalization is disabled (i.e., #isFitLabel() == false) then this is a no-op.
  Can also be used to undo normalization for network output arrays, in the case of regression.

  labels - Labels array to revert the normalization on - `org.nd4j.linalg.api.ndarray.INDArray[]`
  labels-mask - Labels mask array (may be null) - `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^MultiDataNormalization this labels labels-mask]
    (-> this (.revertLabels labels labels-mask)))
  ([^MultiDataNormalization this labels]
    (-> this (.revertLabels labels))))

