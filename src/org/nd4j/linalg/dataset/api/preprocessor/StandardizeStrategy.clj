(ns org.nd4j.linalg.dataset.api.preprocessor.StandardizeStrategy
  "NormalizerStrategy implementation that will standardize and de-standardize data arrays, based on statistics
 of the means and standard deviations of the population"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset.api.preprocessor StandardizeStrategy]))

(defn ->standardize-strategy
  "Constructor."
  (^StandardizeStrategy []
    (new StandardizeStrategy )))

(defn pre-process
  "Normalize a data array

  array - the data to normalize - `org.nd4j.linalg.api.ndarray.INDArray`
  mask-array - `org.nd4j.linalg.api.ndarray.INDArray`
  stats - statistics of the data population - `org.nd4j.linalg.dataset.api.preprocessor.stats.DistributionStats`"
  ([^StandardizeStrategy this ^org.nd4j.linalg.api.ndarray.INDArray array ^org.nd4j.linalg.api.ndarray.INDArray mask-array ^org.nd4j.linalg.dataset.api.preprocessor.stats.DistributionStats stats]
    (-> this (.preProcess array mask-array stats))))

(defn revert
  "Denormalize a data array

  array - the data to denormalize - `org.nd4j.linalg.api.ndarray.INDArray`
  mask-array - `org.nd4j.linalg.api.ndarray.INDArray`
  stats - statistics of the data population - `org.nd4j.linalg.dataset.api.preprocessor.stats.DistributionStats`"
  ([^StandardizeStrategy this ^org.nd4j.linalg.api.ndarray.INDArray array ^org.nd4j.linalg.api.ndarray.INDArray mask-array ^org.nd4j.linalg.dataset.api.preprocessor.stats.DistributionStats stats]
    (-> this (.revert array mask-array stats))))

(defn new-stats-builder
  "Create a new NormalizerStats.Builder instance that can be used to fit new data and of the opType that
  belongs to the current NormalizerStrategy implementation

  returns: the new builder - `org.nd4j.linalg.dataset.api.preprocessor.stats.NormalizerStats$Builder`"
  (^org.nd4j.linalg.dataset.api.preprocessor.stats.NormalizerStats$Builder [^StandardizeStrategy this]
    (-> this (.newStatsBuilder))))

