(ns org.deeplearning4j.ui.stats.api.StatsReport
  "StatsReport: An interface for storing and serializing update information (such as scores, parameter histograms etc) for
 use in the StatsListener"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats.api StatsReport]))

(defn has-memory-use?
  "Return whether memory use has been reported

  returns: `boolean`"
  (^Boolean [^StatsReport this]
    (-> this (.hasMemoryUse))))

(defn has-histograms?
  "Return whether histograms have been reported, for the given stats type (Parameters, Updates, Activations)

  stats-type - Stats type - `org.deeplearning4j.ui.stats.api.StatsType`

  returns: `boolean`"
  (^Boolean [^StatsReport this ^org.deeplearning4j.ui.stats.api.StatsType stats-type]
    (-> this (.hasHistograms stats-type))))

(defn get-examples-per-second
  "Get examples per second since the last report

  returns: `double`"
  (^Double [^StatsReport this]
    (-> this (.getExamplesPerSecond))))

(defn get-data-set-meta-data
  "Get the DataSet metadata, if any (null otherwise).
  Note: due to serialization issues, this may in principle throw an unchecked exception related
  to class availability, serialization etc.

  returns: List of DataSet metadata, if any. - `java.util.List<java.io.Serializable>`"
  (^java.util.List [^StatsReport this]
    (-> this (.getDataSetMetaData))))

(defn get-iteration-count
  "Get the current iteration number

  returns: `int`"
  (^Integer [^StatsReport this]
    (-> this (.getIterationCount))))

(defn report-data-set-meta-data
  "Report any metadata for the DataSet

  data-set-meta-data - MetaData for the DataSet - `java.util.List`
  meta-data-class - Class of the metadata. Can be later retieved using getDataSetMetaDataClassName() - `java.lang.Class`"
  ([^StatsReport this ^java.util.List data-set-meta-data ^java.lang.Class meta-data-class]
    (-> this (.reportDataSetMetaData data-set-meta-data meta-data-class))))

(defn report-memory-use
  "Report the memory stats at this iteration

  jvm-current-bytes - Current bytes used by the JVM - `long`
  jvm-max-bytes - Max bytes usable by the JVM (heap) - `long`
  off-heap-current-bytes - Current off-heap bytes used - `long`
  off-heap-max-bytes - Maximum off-heap bytes - `long`
  device-current-bytes - Current bytes used by each device (GPU, etc). May be null if no devices are present - `long[]`
  device-max-bytes - Maximum bytes for each device (GPU, etc). May be null if no devices are present - `long[]`"
  ([^StatsReport this ^Long jvm-current-bytes ^Long jvm-max-bytes ^Long off-heap-current-bytes ^Long off-heap-max-bytes device-current-bytes device-max-bytes]
    (-> this (.reportMemoryUse jvm-current-bytes jvm-max-bytes off-heap-current-bytes off-heap-max-bytes device-current-bytes device-max-bytes))))

(defn get-off-heap-max-bytes
  "Get off-heap memory - max available bytes

  returns: `long`"
  (^Long [^StatsReport this]
    (-> this (.getOffHeapMaxBytes))))

(defn get-off-heap-current-bytes
  "Get off-heap memory - current bytes used

  returns: `long`"
  (^Long [^StatsReport this]
    (-> this (.getOffHeapCurrentBytes))))

(defn report-histograms
  "Report histograms for all parameters, for a given StatsType

  stats-type - StatsType: Parameters, Updates, Activations - `org.deeplearning4j.ui.stats.api.StatsType`
  histogram - Histogram values for all parameters - `java.util.Map`"
  ([^StatsReport this ^org.deeplearning4j.ui.stats.api.StatsType stats-type ^java.util.Map histogram]
    (-> this (.reportHistograms stats-type histogram))))

(defn report-learning-rates
  "Report the learning rates by parameter

  learning-rates-by-param - `java.util.Map`"
  ([^StatsReport this ^java.util.Map learning-rates-by-param]
    (-> this (.reportLearningRates learning-rates-by-param))))

(defn get-total-examples
  "Get total number of examples that have been processed since initialization

  returns: `long`"
  (^Long [^StatsReport this]
    (-> this (.getTotalExamples))))

(defn has-summary-stats?
  "Return whether the summary stats (mean, standard deviation, mean magnitudes) have been reported for the
  given stats type (Parameters, Updates, Activations)

  stats-type - stats type (Parameters, Updates, Activations) - `org.deeplearning4j.ui.stats.api.StatsType`
  summary-type - Summary statistic type (mean, stdev, mean magnitude) - `org.deeplearning4j.ui.stats.api.SummaryType`

  returns: `boolean`"
  (^Boolean [^StatsReport this ^org.deeplearning4j.ui.stats.api.StatsType stats-type ^org.deeplearning4j.ui.stats.api.SummaryType summary-type]
    (-> this (.hasSummaryStats stats-type summary-type))))

(defn get-stdev
  "Get the standard deviation values for each parameter for the given StatsType (Parameters/Updates/Activations)

  stats-type - Stats type to get std dev values for - `org.deeplearning4j.ui.stats.api.StatsType`

  returns: Map of stdev values by parameter - `java.util.Map<java.lang.String,java.lang.Double>`"
  (^java.util.Map [^StatsReport this ^org.deeplearning4j.ui.stats.api.StatsType stats-type]
    (-> this (.getStdev stats-type))))

(defn has-performance?
  "Return whether performance stats (total time, total examples etc) have been reported

  returns: `boolean`"
  (^Boolean [^StatsReport this]
    (-> this (.hasPerformance))))

(defn get-minibatches-per-second
  "Get the number of minibatches per second, since the last report

  returns: `double`"
  (^Double [^StatsReport this]
    (-> this (.getMinibatchesPerSecond))))

(defn report-i-ds
  "session-id - `java.lang.String`
  type-id - `java.lang.String`
  worker-id - `java.lang.String`
  timestamp - `long`"
  ([^StatsReport this ^java.lang.String session-id ^java.lang.String type-id ^java.lang.String worker-id ^Long timestamp]
    (-> this (.reportIDs session-id type-id worker-id timestamp))))

(defn get-jvm-max-bytes
  "Get JVM memory - max available bytes

  returns: `long`"
  (^Long [^StatsReport this]
    (-> this (.getJvmMaxBytes))))

(defn get-mean
  "Get the mean values for each parameter for the given StatsType (Parameters/Updates/Activations)

  stats-type - Stats type to get mean values for - `org.deeplearning4j.ui.stats.api.StatsType`

  returns: Map of mean values by parameter - `java.util.Map<java.lang.String,java.lang.Double>`"
  (^java.util.Map [^StatsReport this ^org.deeplearning4j.ui.stats.api.StatsType stats-type]
    (-> this (.getMean stats-type))))

(defn has-data-set-meta-data?
  "Return whether any DataSet metadata is present or not

  returns: True if DataSet metadata is present - `boolean`"
  (^Boolean [^StatsReport this]
    (-> this (.hasDataSetMetaData))))

(defn get-device-current-bytes
  "Get device (GPU, etc) current bytes - may be null if no compute devices are present in the system

  returns: `long[]`"
  ([^StatsReport this]
    (-> this (.getDeviceCurrentBytes))))

(defn report-stats-collection-duration-ms
  "Report the number of milliseconds required to calculate all of the stats. This is effectively the
  amount of listener overhead

  stats-collection-duration-ms - `int`"
  ([^StatsReport this ^Integer stats-collection-duration-ms]
    (-> this (.reportStatsCollectionDurationMS stats-collection-duration-ms))))

(defn report-garbage-collection
  "Report Garbage collection stats

  gc-name - Garbage collector name - `java.lang.String`
  delta-gc-count - Change in the total number of garbage collections, since last report - `int`
  delta-gc-time - Change in the amount of time (milliseconds) for garbage collection, since last report - `int`"
  ([^StatsReport this ^java.lang.String gc-name ^Integer delta-gc-count ^Integer delta-gc-time]
    (-> this (.reportGarbageCollection gc-name delta-gc-count delta-gc-time))))

(defn get-data-set-meta-data-class-name
  "Get the class

  returns: `java.lang.String`"
  (^java.lang.String [^StatsReport this]
    (-> this (.getDataSetMetaDataClassName))))

(defn get-total-runtime-ms
  "Get the total runtime since listener/model initialization

  returns: `long`"
  (^Long [^StatsReport this]
    (-> this (.getTotalRuntimeMs))))

(defn get-jvm-current-bytes
  "Get JVM memory - current bytes used

  returns: `long`"
  (^Long [^StatsReport this]
    (-> this (.getJvmCurrentBytes))))

(defn has-garbage-collection?
  "Return whether garbage collection information has been reported

  returns: `boolean`"
  (^Boolean [^StatsReport this]
    (-> this (.hasGarbageCollection))))

(defn report-score
  "Report model score at the current iteration

  current-score - `double`"
  ([^StatsReport this ^Double current-score]
    (-> this (.reportScore current-score))))

(defn get-score
  "Get the score at the current iteration

  returns: `double`"
  (^Double [^StatsReport this]
    (-> this (.getScore))))

(defn report-iteration-count
  "Report the current iteration number

  iteration-count - `int`"
  ([^StatsReport this ^Integer iteration-count]
    (-> this (.reportIterationCount iteration-count))))

(defn get-garbage-collection-stats
  "Get the garbage collection stats: Pair contains GC name and the delta count/time values

  returns: `java.util.List<org.nd4j.linalg.primitives.Pair<java.lang.String,int[]>>`"
  ([^StatsReport this]
    (-> this (.getGarbageCollectionStats))))

(defn report-performance
  "Report the performance stats (since the last report)

  total-runtime-ms - Overall runtime since initialization - `long`
  total-examples - Total examples processed since initialization - `long`
  total-minibatches - Total number of minibatches (iterations) since initialization - `long`
  examples-per-second - Examples per second since last report - `double`
  minibatches-per-second - Minibatches per second since last report - `double`"
  ([^StatsReport this ^Long total-runtime-ms ^Long total-examples ^Long total-minibatches ^Double examples-per-second ^Double minibatches-per-second]
    (-> this (.reportPerformance total-runtime-ms total-examples total-minibatches examples-per-second minibatches-per-second))))

(defn has-learning-rates?
  "Return whether the learning rates are present (have been reported)

  returns: `boolean`"
  (^Boolean [^StatsReport this]
    (-> this (.hasLearningRates))))

(defn report-stdev
  "Report the standard deviation values for each parameter for the given StatsType (Parameters/Updates/Activations)

  stats-type - Stats type to report std. dev values for - `org.deeplearning4j.ui.stats.api.StatsType`
  stdev - Map of std dev values by parameter - `java.util.Map`"
  ([^StatsReport this ^org.deeplearning4j.ui.stats.api.StatsType stats-type ^java.util.Map stdev]
    (-> this (.reportStdev stats-type stdev))))

(defn get-total-minibatches
  "Get the total number of minibatches that have been processed since initialization

  returns: `long`"
  (^Long [^StatsReport this]
    (-> this (.getTotalMinibatches))))

(defn has-score?
  "Return whether the score is present (has been reported)

  returns: `boolean`"
  (^Boolean [^StatsReport this]
    (-> this (.hasScore))))

(defn get-learning-rates
  "Get the learning rates by parameter

  returns: `java.util.Map<java.lang.String,java.lang.Double>`"
  (^java.util.Map [^StatsReport this]
    (-> this (.getLearningRates))))

(defn report-mean
  "Report the mean values for each parameter, the given StatsType (Parameters/Updates/Activations)

  stats-type - Stats type to report - `org.deeplearning4j.ui.stats.api.StatsType`
  mean - Map of mean values, by parameter - `java.util.Map`"
  ([^StatsReport this ^org.deeplearning4j.ui.stats.api.StatsType stats-type ^java.util.Map mean]
    (-> this (.reportMean stats-type mean))))

(defn get-histograms
  "Get the histograms for all parameters, for a given StatsType (Parameters/Updates/Activations)

  stats-type - Stats type (Params/updatse/activations) to get histograms for - `org.deeplearning4j.ui.stats.api.StatsType`

  returns: Histograms by parameter name, or null if not available - `java.util.Map<java.lang.String,org.deeplearning4j.ui.stats.api.Histogram>`"
  (^java.util.Map [^StatsReport this ^org.deeplearning4j.ui.stats.api.StatsType stats-type]
    (-> this (.getHistograms stats-type))))

(defn get-stats-collection-duration-ms
  "Get the number of millisecons required to calculate al of the stats. This is effectively the amount of
  listener overhead.

  returns: `int`"
  (^Integer [^StatsReport this]
    (-> this (.getStatsCollectionDurationMs))))

(defn report-mean-magnitudes
  "Report the mean magnitude values for each parameter for the given StatsType (Parameters/Updates/Activations)

  stats-type - Stats type to report mean magnitude values for - `org.deeplearning4j.ui.stats.api.StatsType`
  mean-magnitudes - Map of mean magnitude values by parameter - `java.util.Map`"
  ([^StatsReport this ^org.deeplearning4j.ui.stats.api.StatsType stats-type ^java.util.Map mean-magnitudes]
    (-> this (.reportMeanMagnitudes stats-type mean-magnitudes))))

(defn get-device-max-bytes
  "Get device (GPU, etc) maximum bytes - may be null if no compute devices are present in the system

  returns: `long[]`"
  ([^StatsReport this]
    (-> this (.getDeviceMaxBytes))))

(defn get-mean-magnitudes
  "Get the mean magnitude values for each parameter for the given StatsType (Parameters/Updates/Activations)

  stats-type - Stats type to get mean magnitude values for - `org.deeplearning4j.ui.stats.api.StatsType`

  returns: Map of mean magnitude values by parameter - `java.util.Map<java.lang.String,java.lang.Double>`"
  (^java.util.Map [^StatsReport this ^org.deeplearning4j.ui.stats.api.StatsType stats-type]
    (-> this (.getMeanMagnitudes stats-type))))

