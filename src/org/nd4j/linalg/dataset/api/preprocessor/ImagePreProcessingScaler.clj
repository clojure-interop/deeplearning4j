(ns org.nd4j.linalg.dataset.api.preprocessor.ImagePreProcessingScaler
  "Created by susaneraly on 6/23/16.
 A preprocessor specifically for images that applies min max scaling
 Can take a range, so pixel values can be scaled from 0->255 to minRange->maxRange
 default minRange = 0 and maxRange = 1;
 If pixel values are not 8 bits, you can specify the number of bits as the third argument in the constructor
 For values that are already floating point, specify the number of bits as 1"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset.api.preprocessor ImagePreProcessingScaler]))

(defn ->image-pre-processing-scaler
  "Constructor.

  Preprocessor can take a range as minRange and maxRange

  a - `double`
  b - `double`
  max-bits - in the image, default = 8 - `int`"
  (^ImagePreProcessingScaler [^Double a ^Double b ^Integer max-bits]
    (new ImagePreProcessingScaler a b max-bits))
  (^ImagePreProcessingScaler [^Double a ^Double b]
    (new ImagePreProcessingScaler a b))
  (^ImagePreProcessingScaler []
    (new ImagePreProcessingScaler )))

(defn fit-label?
  "Description copied from interface: DataNormalization

  returns: True if labels will be - `boolean`"
  (^Boolean [^ImagePreProcessingScaler this]
    (-> this (.isFitLabel))))

(defn fit-label
  "Description copied from interface: DataNormalization

  fit-labels - `boolean`"
  ([^ImagePreProcessingScaler this ^Boolean fit-labels]
    (-> this (.fitLabel fit-labels))))

(defn revert
  "Description copied from interface: Normalizer

  to-revert - DataSet to revert the normalization on - `org.nd4j.linalg.dataset.api.DataSet`"
  ([^ImagePreProcessingScaler this ^org.nd4j.linalg.dataset.api.DataSet to-revert]
    (-> this (.revert to-revert))))

(defn fit
  "Fit a dataset (only compute
  based on the statistics from this dataset0

  data-set - the dataset to compute on - `org.nd4j.linalg.dataset.api.DataSet`"
  ([^ImagePreProcessingScaler this ^org.nd4j.linalg.dataset.api.DataSet data-set]
    (-> this (.fit data-set))))

(defn get-type
  "Description copied from interface: Normalizer

  returns: the opType - `org.nd4j.linalg.dataset.api.preprocessor.serializer.NormalizerType`"
  (^org.nd4j.linalg.dataset.api.preprocessor.serializer.NormalizerType [^ImagePreProcessingScaler this]
    (-> this (.getType))))

(defn transform
  "Description copied from interface: DataNormalization

  features - the features to pre process - `org.nd4j.linalg.api.ndarray.INDArray`
  features-mask - the mask array to pre process - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^ImagePreProcessingScaler this ^org.nd4j.linalg.api.ndarray.INDArray features ^org.nd4j.linalg.api.ndarray.INDArray features-mask]
    (-> this (.transform features features-mask)))
  ([^ImagePreProcessingScaler this ^org.nd4j.linalg.dataset.api.DataSet to-pre-process]
    (-> this (.transform to-pre-process))))

(defn pre-process
  "Description copied from interface: DataSetPreProcessor

  to-pre-process - the data set to pre process - `org.nd4j.linalg.dataset.api.DataSet`"
  ([^ImagePreProcessingScaler this ^org.nd4j.linalg.dataset.api.DataSet to-pre-process]
    (-> this (.preProcess to-pre-process))))

(defn revert-features
  "Description copied from interface: DataNormalization

  features - Features to revert the normalization on - `org.nd4j.linalg.api.ndarray.INDArray`
  features-mask - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^ImagePreProcessingScaler this ^org.nd4j.linalg.api.ndarray.INDArray features ^org.nd4j.linalg.api.ndarray.INDArray features-mask]
    (-> this (.revertFeatures features features-mask)))
  ([^ImagePreProcessingScaler this ^org.nd4j.linalg.api.ndarray.INDArray features]
    (-> this (.revertFeatures features))))

(defn transform-label
  "Description copied from interface: DataNormalization

  labels - `org.nd4j.linalg.api.ndarray.INDArray`
  labels-mask - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^ImagePreProcessingScaler this ^org.nd4j.linalg.api.ndarray.INDArray labels ^org.nd4j.linalg.api.ndarray.INDArray labels-mask]
    (-> this (.transformLabel labels labels-mask)))
  ([^ImagePreProcessingScaler this ^org.nd4j.linalg.api.ndarray.INDArray label]
    (-> this (.transformLabel label))))

(defn revert-labels
  "Description copied from interface: DataNormalization

  labels - Labels array to revert the normalization on - `org.nd4j.linalg.api.ndarray.INDArray`
  labels-mask - Labels mask array (may be null) - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^ImagePreProcessingScaler this ^org.nd4j.linalg.api.ndarray.INDArray labels ^org.nd4j.linalg.api.ndarray.INDArray labels-mask]
    (-> this (.revertLabels labels labels-mask)))
  ([^ImagePreProcessingScaler this ^org.nd4j.linalg.api.ndarray.INDArray labels]
    (-> this (.revertLabels labels))))

