(ns org.nd4j.linalg.dataset.api.preprocessor.stats.NormalizerStats$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset.api.preprocessor.stats NormalizerStats$Builder]))

(defn add-features
  "data-set - `org.nd4j.linalg.dataset.api.DataSet`

  returns: `org.nd4j.linalg.dataset.api.preprocessor.stats.NormalizerStats$Builder<S>`"
  (^org.nd4j.linalg.dataset.api.preprocessor.stats.NormalizerStats$Builder [^NormalizerStats$Builder this ^org.nd4j.linalg.dataset.api.DataSet data-set]
    (-> this (.addFeatures data-set))))

(defn add-labels
  "Add the labels of a DataSet to the statistics

  data-set - `org.nd4j.linalg.dataset.api.DataSet`

  returns: `org.nd4j.linalg.dataset.api.preprocessor.stats.NormalizerStats$Builder<S>`"
  (^org.nd4j.linalg.dataset.api.preprocessor.stats.NormalizerStats$Builder [^NormalizerStats$Builder this ^org.nd4j.linalg.dataset.api.DataSet data-set]
    (-> this (.addLabels data-set))))

(defn add
  "Add rows of data to the statistics

  data - the matrix containing multiple rows of data to include - `org.nd4j.linalg.api.ndarray.INDArray`
  mask - (optionally) the mask of the data, useful for e.g. time series - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.dataset.api.preprocessor.stats.NormalizerStats$Builder<S>`"
  (^org.nd4j.linalg.dataset.api.preprocessor.stats.NormalizerStats$Builder [^NormalizerStats$Builder this ^org.nd4j.linalg.api.ndarray.INDArray data ^org.nd4j.linalg.api.ndarray.INDArray mask]
    (-> this (.add data mask))))

(defn build
  "DynamicCustomOpsBuilder pattern

  returns: `S`"
  ([^NormalizerStats$Builder this]
    (-> this (.build))))

