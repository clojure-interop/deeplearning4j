(ns org.nd4j.linalg.dataset.api.preprocessor.stats.DistributionStats$Builder
  "DynamicCustomOpsBuilder class that can incrementally update a running mean and variance in order to create statistics for a
 large set of data"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset.api.preprocessor.stats DistributionStats$Builder]))

(defn ->builder
  "Constructor."
  (^DistributionStats$Builder []
    (new DistributionStats$Builder )))

(defn add-features
  "Add the features of a DataSet to the statistics

  data-set - `org.nd4j.linalg.dataset.api.DataSet`

  returns: `org.nd4j.linalg.dataset.api.preprocessor.stats.DistributionStats$Builder`"
  (^org.nd4j.linalg.dataset.api.preprocessor.stats.DistributionStats$Builder [^DistributionStats$Builder this ^org.nd4j.linalg.dataset.api.DataSet data-set]
    (-> this (.addFeatures data-set))))

(defn add-labels
  "Add the labels of a DataSet to the statistics

  data-set - `org.nd4j.linalg.dataset.api.DataSet`

  returns: `org.nd4j.linalg.dataset.api.preprocessor.stats.DistributionStats$Builder`"
  (^org.nd4j.linalg.dataset.api.preprocessor.stats.DistributionStats$Builder [^DistributionStats$Builder this ^org.nd4j.linalg.dataset.api.DataSet data-set]
    (-> this (.addLabels data-set))))

(defn add
  "Add rows of data to the statistics

  data - the matrix containing multiple rows of data to include - `org.nd4j.linalg.api.ndarray.INDArray`
  mask - (optionally) the mask of the data, useful for e.g. time series - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.dataset.api.preprocessor.stats.DistributionStats$Builder`"
  (^org.nd4j.linalg.dataset.api.preprocessor.stats.DistributionStats$Builder [^DistributionStats$Builder this ^org.nd4j.linalg.api.ndarray.INDArray data ^org.nd4j.linalg.api.ndarray.INDArray mask]
    (-> this (.add data mask))))

(defn build
  "Create a DistributionStats object from the data ingested so far. Can be used multiple times when updating
  online.

  returns: `org.nd4j.linalg.dataset.api.preprocessor.stats.DistributionStats`"
  (^org.nd4j.linalg.dataset.api.preprocessor.stats.DistributionStats [^DistributionStats$Builder this]
    (-> this (.build))))

