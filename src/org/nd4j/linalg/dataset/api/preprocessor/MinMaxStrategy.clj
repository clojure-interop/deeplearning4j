(ns org.nd4j.linalg.dataset.api.preprocessor.MinMaxStrategy
  "NormalizerStrategy implementation that will normalize and denormalize data arrays to a given range, based on
 statistics of the upper and lower bounds of the population"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset.api.preprocessor MinMaxStrategy]))

(defn ->min-max-strategy
  "Constructor.

  min-range - the target range lower bound - `double`
  max-range - the target range upper bound - `double`"
  (^MinMaxStrategy [^Double min-range ^Double max-range]
    (new MinMaxStrategy min-range max-range))
  (^MinMaxStrategy []
    (new MinMaxStrategy )))

(defn pre-process
  "Normalize a data array

  array - the data to normalize - `org.nd4j.linalg.api.ndarray.INDArray`
  mask-array - `org.nd4j.linalg.api.ndarray.INDArray`
  stats - statistics of the data population - `org.nd4j.linalg.dataset.api.preprocessor.stats.MinMaxStats`"
  ([^MinMaxStrategy this ^org.nd4j.linalg.api.ndarray.INDArray array ^org.nd4j.linalg.api.ndarray.INDArray mask-array ^org.nd4j.linalg.dataset.api.preprocessor.stats.MinMaxStats stats]
    (-> this (.preProcess array mask-array stats))))

(defn revert
  "Denormalize a data array

  array - the data to denormalize - `org.nd4j.linalg.api.ndarray.INDArray`
  mask-array - `org.nd4j.linalg.api.ndarray.INDArray`
  stats - statistics of the data population - `org.nd4j.linalg.dataset.api.preprocessor.stats.MinMaxStats`"
  ([^MinMaxStrategy this ^org.nd4j.linalg.api.ndarray.INDArray array ^org.nd4j.linalg.api.ndarray.INDArray mask-array ^org.nd4j.linalg.dataset.api.preprocessor.stats.MinMaxStats stats]
    (-> this (.revert array mask-array stats))))

(defn new-stats-builder
  "Create a new NormalizerStats.Builder instance that can be used to fit new data and of the opType that
  belongs to the current NormalizerStrategy implementation

  returns: the new builder - `org.nd4j.linalg.dataset.api.preprocessor.stats.NormalizerStats$Builder`"
  (^org.nd4j.linalg.dataset.api.preprocessor.stats.NormalizerStats$Builder [^MinMaxStrategy this]
    (-> this (.newStatsBuilder))))

