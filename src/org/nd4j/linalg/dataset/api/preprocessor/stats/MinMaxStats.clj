(ns org.nd4j.linalg.dataset.api.preprocessor.stats.MinMaxStats
  "Statistics about the lower bounds and upper bounds of values in data.
 Can be constructed incrementally by using the DynamicCustomOpsBuilder,
 which is useful for obtaining these statistics from an
 iterator."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset.api.preprocessor.stats MinMaxStats]))

(defn ->min-max-stats
  "Constructor.

  lower - row vector of lower bounds - `org.nd4j.linalg.api.ndarray.INDArray`
  upper - row vector of upper bounds - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^MinMaxStats [^org.nd4j.linalg.api.ndarray.INDArray lower ^org.nd4j.linalg.api.ndarray.INDArray upper]
    (new MinMaxStats lower upper)))

(defn get-range
  "Get the feature wise
  range for the statistics.
  Note that this is a lazy getter.
  It is only computed when needed.

  returns: the feature wise range
  given the min and max - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^MinMaxStats this]
    (-> this (.getRange))))

