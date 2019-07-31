(ns org.nd4j.linalg.dataset.api.preprocessor.VGG16ImagePreProcessor
  "This is a preprocessor specifically for VGG16.
 It subtracts the mean RGB value, computed on the training set, from each pixel as reported in:
 https://arxiv.org/pdf/1409.1556.pdf"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset.api.preprocessor VGG16ImagePreProcessor]))

(defn ->vgg-16-image-pre-processor
  "Constructor."
  (^VGG16ImagePreProcessor []
    (new VGG16ImagePreProcessor )))

(def *-vgg-mean-offset-bgr
  "Static Constant.

  type: org.nd4j.linalg.api.ndarray.INDArray"
  VGG16ImagePreProcessor/VGG_MEAN_OFFSET_BGR)

(defn fit-label?
  "Description copied from interface: DataNormalization

  returns: True if labels will be - `boolean`"
  (^Boolean [^VGG16ImagePreProcessor this]
    (-> this (.isFitLabel))))

(defn fit-label
  "Description copied from interface: DataNormalization

  fit-labels - `boolean`"
  ([^VGG16ImagePreProcessor this ^Boolean fit-labels]
    (-> this (.fitLabel fit-labels))))

(defn revert
  "Description copied from interface: Normalizer

  to-revert - DataSet to revert the normalization on - `org.nd4j.linalg.dataset.api.DataSet`"
  ([^VGG16ImagePreProcessor this ^org.nd4j.linalg.dataset.api.DataSet to-revert]
    (-> this (.revert to-revert))))

(defn fit
  "Fit a dataset (only compute
  based on the statistics from this dataset0

  data-set - the dataset to compute on - `org.nd4j.linalg.dataset.api.DataSet`"
  ([^VGG16ImagePreProcessor this ^org.nd4j.linalg.dataset.api.DataSet data-set]
    (-> this (.fit data-set))))

(defn get-type
  "Description copied from interface: Normalizer

  returns: the opType - `org.nd4j.linalg.dataset.api.preprocessor.serializer.NormalizerType`"
  (^org.nd4j.linalg.dataset.api.preprocessor.serializer.NormalizerType [^VGG16ImagePreProcessor this]
    (-> this (.getType))))

(defn transform
  "Description copied from interface: DataNormalization

  features - the features to pre process - `org.nd4j.linalg.api.ndarray.INDArray`
  features-mask - the mask array to pre process - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^VGG16ImagePreProcessor this ^org.nd4j.linalg.api.ndarray.INDArray features ^org.nd4j.linalg.api.ndarray.INDArray features-mask]
    (-> this (.transform features features-mask)))
  ([^VGG16ImagePreProcessor this ^org.nd4j.linalg.dataset.api.DataSet to-pre-process]
    (-> this (.transform to-pre-process))))

(defn pre-process
  "Description copied from interface: DataSetPreProcessor

  to-pre-process - the data set to pre process - `org.nd4j.linalg.dataset.api.DataSet`"
  ([^VGG16ImagePreProcessor this ^org.nd4j.linalg.dataset.api.DataSet to-pre-process]
    (-> this (.preProcess to-pre-process))))

(defn revert-features
  "Description copied from interface: DataNormalization

  features - Features to revert the normalization on - `org.nd4j.linalg.api.ndarray.INDArray`
  features-mask - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^VGG16ImagePreProcessor this ^org.nd4j.linalg.api.ndarray.INDArray features ^org.nd4j.linalg.api.ndarray.INDArray features-mask]
    (-> this (.revertFeatures features features-mask)))
  ([^VGG16ImagePreProcessor this ^org.nd4j.linalg.api.ndarray.INDArray features]
    (-> this (.revertFeatures features))))

(defn transform-label
  "Description copied from interface: DataNormalization

  labels - `org.nd4j.linalg.api.ndarray.INDArray`
  labels-mask - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^VGG16ImagePreProcessor this ^org.nd4j.linalg.api.ndarray.INDArray labels ^org.nd4j.linalg.api.ndarray.INDArray labels-mask]
    (-> this (.transformLabel labels labels-mask)))
  ([^VGG16ImagePreProcessor this ^org.nd4j.linalg.api.ndarray.INDArray label]
    (-> this (.transformLabel label))))

(defn revert-labels
  "Description copied from interface: DataNormalization

  labels - Labels array to revert the normalization on - `org.nd4j.linalg.api.ndarray.INDArray`
  labels-mask - Labels mask array (may be null) - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^VGG16ImagePreProcessor this ^org.nd4j.linalg.api.ndarray.INDArray labels ^org.nd4j.linalg.api.ndarray.INDArray labels-mask]
    (-> this (.revertLabels labels labels-mask)))
  ([^VGG16ImagePreProcessor this ^org.nd4j.linalg.api.ndarray.INDArray labels]
    (-> this (.revertLabels labels))))

