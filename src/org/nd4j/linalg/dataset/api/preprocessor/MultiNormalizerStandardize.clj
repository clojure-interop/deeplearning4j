(ns org.nd4j.linalg.dataset.api.preprocessor.MultiNormalizerStandardize
  "Pre processor for MultiDataSet that normalizes feature values (and optionally label values) to have 0 mean and
 a standard deviation of 1"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset.api.preprocessor MultiNormalizerStandardize]))

(defn ->multi-normalizer-standardize
  "Constructor."
  (^MultiNormalizerStandardize []
    (new MultiNormalizerStandardize )))

(defn get-feature-mean
  "input - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^MultiNormalizerStandardize this ^Integer input]
    (-> this (.getFeatureMean input))))

(defn get-label-mean
  "output - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^MultiNormalizerStandardize this ^Integer output]
    (-> this (.getLabelMean output))))

(defn get-feature-std
  "input - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^MultiNormalizerStandardize this ^Integer input]
    (-> this (.getFeatureStd input))))

(defn get-label-std
  "output - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^MultiNormalizerStandardize this ^Integer output]
    (-> this (.getLabelStd output))))

(defn load
  "Load means and standard deviations from the file system

  feature-files - source files for features, requires 2 files per input, alternating mean and stddev files - `java.util.List`
  label-files - source files for labels, requires 2 files per output, alternating mean and stddev files - `java.util.List`

  throws: java.io.IOException"
  ([^MultiNormalizerStandardize this ^java.util.List feature-files ^java.util.List label-files]
    (-> this (.load feature-files label-files))))

(defn save
  "Deprecated. use MultiStandardizeSerializerStrategy instead

  Save the current means and standard deviations to the file system

  feature-files - target files for features, requires 2 files per input, alternating mean and stddev files - `java.util.List`
  label-files - target files for labels, requires 2 files per output, alternating mean and stddev files - `java.util.List`

  throws: java.io.IOException"
  ([^MultiNormalizerStandardize this ^java.util.List feature-files ^java.util.List label-files]
    (-> this (.save feature-files label-files))))

(defn get-type
  "Description copied from interface: Normalizer

  returns: the opType - `org.nd4j.linalg.dataset.api.preprocessor.serializer.NormalizerType`"
  (^org.nd4j.linalg.dataset.api.preprocessor.serializer.NormalizerType [^MultiNormalizerStandardize this]
    (-> this (.getType))))

