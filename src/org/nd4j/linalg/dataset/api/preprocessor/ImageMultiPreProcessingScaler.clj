(ns org.nd4j.linalg.dataset.api.preprocessor.ImageMultiPreProcessingScaler
  "A preprocessor specifically for images that applies min max scaling to one or more of the feature arrays
 in a MultiDataSet.
 Can take a range, so pixel values can be scaled from 0->255 to minRange->maxRange
 default minRange = 0 and maxRange = 1;
 If pixel values are not 8 bits, you can specify the number of bits as the third argument in the constructor
 For values that are already floating point, specify the number of bits as 1"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset.api.preprocessor ImageMultiPreProcessingScaler]))

(defn ->image-multi-pre-processing-scaler
  "Constructor.

  Preprocessor can take a range as minRange and maxRange

  a - `double`
  b - `double`
  max-bits - in the image, default = 8 - `int`
  feature-indices - Indices of feature arrays to process. If only one feature array is present,this should always be 0 - `int[]`"
  (^ImageMultiPreProcessingScaler [^Double a ^Double b ^Integer max-bits feature-indices]
    (new ImageMultiPreProcessingScaler a b max-bits feature-indices))
  (^ImageMultiPreProcessingScaler [^Double a ^Double b feature-indices]
    (new ImageMultiPreProcessingScaler a b feature-indices))
  (^ImageMultiPreProcessingScaler [^Integer feature-indices]
    (new ImageMultiPreProcessingScaler feature-indices)))

(defn fit
  "Description copied from interface: MultiDataNormalization

  iterator - the iterator to use forcollecting statistics. - `org.nd4j.linalg.dataset.api.iterator.MultiDataSetIterator`"
  ([^ImageMultiPreProcessingScaler this ^org.nd4j.linalg.dataset.api.iterator.MultiDataSetIterator iterator]
    (-> this (.fit iterator))))

(defn pre-process
  "Description copied from interface: MultiDataSetPreProcessor

  multi-data-set - `org.nd4j.linalg.dataset.api.MultiDataSet`"
  ([^ImageMultiPreProcessingScaler this ^org.nd4j.linalg.dataset.api.MultiDataSet multi-data-set]
    (-> this (.preProcess multi-data-set))))

(defn revert-features
  "Description copied from interface: MultiDataNormalization

  features - Features to revert the normalization on - `org.nd4j.linalg.api.ndarray.INDArray[]`
  features-mask - `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^ImageMultiPreProcessingScaler this features features-mask]
    (-> this (.revertFeatures features features-mask)))
  ([^ImageMultiPreProcessingScaler this features]
    (-> this (.revertFeatures features))))

(defn revert-labels
  "Description copied from interface: MultiDataNormalization

  labels - Labels array to revert the normalization on - `org.nd4j.linalg.api.ndarray.INDArray[]`
  labels-mask - Labels mask array (may be null) - `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^ImageMultiPreProcessingScaler this labels labels-mask]
    (-> this (.revertLabels labels labels-mask)))
  ([^ImageMultiPreProcessingScaler this labels]
    (-> this (.revertLabels labels))))

(defn transform
  "Description copied from interface: Normalizer

  to-pre-process - the dataset to re process - `org.nd4j.linalg.dataset.api.MultiDataSet`"
  ([^ImageMultiPreProcessingScaler this ^org.nd4j.linalg.dataset.api.MultiDataSet to-pre-process]
    (-> this (.transform to-pre-process))))

(defn revert
  "Description copied from interface: Normalizer

  to-revert - DataSet to revert the normalization on - `org.nd4j.linalg.dataset.api.MultiDataSet`"
  ([^ImageMultiPreProcessingScaler this ^org.nd4j.linalg.dataset.api.MultiDataSet to-revert]
    (-> this (.revert to-revert))))

(defn get-type
  "Description copied from interface: Normalizer

  returns: the opType - `org.nd4j.linalg.dataset.api.preprocessor.serializer.NormalizerType`"
  (^org.nd4j.linalg.dataset.api.preprocessor.serializer.NormalizerType [^ImageMultiPreProcessingScaler this]
    (-> this (.getType))))

