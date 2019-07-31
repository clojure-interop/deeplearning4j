(ns org.nd4j.linalg.dataset.api.preprocessor.stats.NormalizerStats
  "Interface for certain statistics about a population of data.
 Can be constructed incrementally by using the DynamicCustomOpsBuilder, which is useful for obtaining these statistics from an
 iterator."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset.api.preprocessor.stats NormalizerStats]))

