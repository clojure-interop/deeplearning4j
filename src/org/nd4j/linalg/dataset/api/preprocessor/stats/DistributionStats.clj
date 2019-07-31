(ns org.nd4j.linalg.dataset.api.preprocessor.stats.DistributionStats
  "Statistics about the normal distribution of values in data (means and standard deviations).
 Can be constructed incrementally by using the DynamicCustomOpsBuilder, which is useful for obtaining these statistics from an
 iterator. Can also load and save from files."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset.api.preprocessor.stats DistributionStats]))

(defn ->distribution-stats
  "Constructor.

  mean - row vector of means - `org.nd4j.linalg.api.ndarray.INDArray`
  std - row vector of standard deviations - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^DistributionStats [^org.nd4j.linalg.api.ndarray.INDArray mean ^org.nd4j.linalg.api.ndarray.INDArray std]
    (new DistributionStats mean std)))

(defn *load
  "Load distribution statistics from the file system

  mean-file - file containing the means - `java.io.File`
  std-file - file containing the standard deviations - `java.io.File`

  returns: `org.nd4j.linalg.dataset.api.preprocessor.stats.DistributionStats`

  throws: java.io.IOException"
  (^org.nd4j.linalg.dataset.api.preprocessor.stats.DistributionStats [^java.io.File mean-file ^java.io.File std-file]
    (DistributionStats/load mean-file std-file)))

(defn save
  "Save distribution statistics to the file system

  mean-file - file to contain the means - `java.io.File`
  std-file - file to contain the standard deviations - `java.io.File`

  throws: java.io.IOException"
  ([^DistributionStats this ^java.io.File mean-file ^java.io.File std-file]
    (-> this (.save mean-file std-file))))

