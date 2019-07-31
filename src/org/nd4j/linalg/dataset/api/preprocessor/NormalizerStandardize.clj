(ns org.nd4j.linalg.dataset.api.preprocessor.NormalizerStandardize
  "Created by susaneraly, Ede Meijer
 variance and mean
 Pre processor for DataSet that normalizes feature values (and optionally label values) to have 0 mean and a standard
 deviation of 1"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset.api.preprocessor NormalizerStandardize]))

(defn ->normalizer-standardize
  "Constructor.

  feature-mean - `org.nd4j.linalg.api.ndarray.INDArray`
  feature-std - `org.nd4j.linalg.api.ndarray.INDArray`
  label-mean - `org.nd4j.linalg.api.ndarray.INDArray`
  label-std - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^NormalizerStandardize [^org.nd4j.linalg.api.ndarray.INDArray feature-mean ^org.nd4j.linalg.api.ndarray.INDArray feature-std ^org.nd4j.linalg.api.ndarray.INDArray label-mean ^org.nd4j.linalg.api.ndarray.INDArray label-std]
    (new NormalizerStandardize feature-mean feature-std label-mean label-std))
  (^NormalizerStandardize [^org.nd4j.linalg.api.ndarray.INDArray feature-mean ^org.nd4j.linalg.api.ndarray.INDArray feature-std]
    (new NormalizerStandardize feature-mean feature-std))
  (^NormalizerStandardize []
    (new NormalizerStandardize )))

(defn set-label-stats
  "label-mean - `org.nd4j.linalg.api.ndarray.INDArray`
  label-std - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^NormalizerStandardize this ^org.nd4j.linalg.api.ndarray.INDArray label-mean ^org.nd4j.linalg.api.ndarray.INDArray label-std]
    (-> this (.setLabelStats label-mean label-std))))

(defn get-mean
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^NormalizerStandardize this]
    (-> this (.getMean))))

(defn get-label-mean
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^NormalizerStandardize this]
    (-> this (.getLabelMean))))

(defn get-std
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^NormalizerStandardize this]
    (-> this (.getStd))))

(defn get-label-std
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^NormalizerStandardize this]
    (-> this (.getLabelStd))))

(defn load
  "Load the means and standard deviations from the file system

  files - the files to load from. Needs 4 files if normalizing labels, otherwise 2. - `java.io.File`

  throws: java.io.IOException"
  ([^NormalizerStandardize this ^java.io.File files]
    (-> this (.load files))))

(defn save
  "Deprecated. use NormalizerSerializer instead

  Save the current means and standard deviations to the file system

  files - the files to save to. Needs 4 files if normalizing labels, otherwise 2. - `java.io.File`

  throws: java.io.IOException"
  ([^NormalizerStandardize this ^java.io.File files]
    (-> this (.save files))))

(defn get-type
  "Description copied from interface: Normalizer

  returns: the opType - `org.nd4j.linalg.dataset.api.preprocessor.serializer.NormalizerType`"
  (^org.nd4j.linalg.dataset.api.preprocessor.serializer.NormalizerType [^NormalizerStandardize this]
    (-> this (.getType))))

