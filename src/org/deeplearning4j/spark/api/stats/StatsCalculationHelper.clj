(ns org.deeplearning4j.spark.api.stats.StatsCalculationHelper
  "A helper class for collecting stats in ExecuteWorkerFlatMap and ExecuteWorkerMultiDataSetFlatMap"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.api.stats StatsCalculationHelper]))

(defn ->stats-calculation-helper
  "Constructor."
  (^StatsCalculationHelper []
    (new StatsCalculationHelper )))

(defn log-next-data-set-after
  "num-examples - `int`"
  ([^StatsCalculationHelper this ^Integer num-examples]
    (-> this (.logNextDataSetAfter num-examples))))

(defn log-next-data-set-before
  ""
  ([^StatsCalculationHelper this]
    (-> this (.logNextDataSetBefore))))

(defn log-process-minibatch-before
  ""
  ([^StatsCalculationHelper this]
    (-> this (.logProcessMinibatchBefore))))

(defn log-method-start-time
  ""
  ([^StatsCalculationHelper this]
    (-> this (.logMethodStartTime))))

(defn build
  "master-specific-stats - `org.deeplearning4j.spark.api.stats.SparkTrainingStats`

  returns: `org.deeplearning4j.spark.api.stats.CommonSparkTrainingStats`"
  (^org.deeplearning4j.spark.api.stats.CommonSparkTrainingStats [^StatsCalculationHelper this ^org.deeplearning4j.spark.api.stats.SparkTrainingStats master-specific-stats]
    (-> this (.build master-specific-stats))))

(defn log-initial-model-after
  ""
  ([^StatsCalculationHelper this]
    (-> this (.logInitialModelAfter))))

(defn log-initial-model-before
  ""
  ([^StatsCalculationHelper this]
    (-> this (.logInitialModelBefore))))

(defn log-process-minibatch-after
  ""
  ([^StatsCalculationHelper this]
    (-> this (.logProcessMinibatchAfter))))

(defn log-return-time
  ""
  ([^StatsCalculationHelper this]
    (-> this (.logReturnTime))))

