(ns org.deeplearning4j.ui.stats.impl.SbeStatsReport
  "An implementation of StatsReport using Simple Binary Encoding (SBE)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats.impl SbeStatsReport]))

(defn ->sbe-stats-report
  "Constructor."
  (^SbeStatsReport []
    (new SbeStatsReport )))

(defn has-memory-use?
  "Description copied from interface: StatsReport

  returns: `boolean`"
  (^Boolean [^SbeStatsReport this]
    (-> this (.hasMemoryUse))))

(defn has-histograms?
  "Description copied from interface: StatsReport

  stats-type - Stats type - `org.deeplearning4j.ui.stats.api.StatsType`

  returns: `boolean`"
  (^Boolean [^SbeStatsReport this ^org.deeplearning4j.ui.stats.api.StatsType stats-type]
    (-> this (.hasHistograms stats-type))))

(defn get-worker-id
  "Description copied from interface: Persistable

  returns: `java.lang.String`"
  (^java.lang.String [^SbeStatsReport this]
    (-> this (.getWorkerID))))

(defn get-data-set-meta-data
  "Description copied from interface: StatsReport

  returns: List of DataSet metadata, if any. - `java.util.List<java.io.Serializable>`"
  (^java.util.List [^SbeStatsReport this]
    (-> this (.getDataSetMetaData))))

(defn report-data-set-meta-data
  "Description copied from interface: StatsReport

  data-set-meta-data - MetaData for the DataSet - `java.util.List`
  meta-data-class - Class of the metadata. Can be later retieved using StatsReport.getDataSetMetaDataClassName() - `java.lang.Class`"
  ([^SbeStatsReport this ^java.util.List data-set-meta-data ^java.lang.Class meta-data-class]
    (-> this (.reportDataSetMetaData data-set-meta-data meta-data-class))))

(defn report-memory-use
  "Description copied from interface: StatsReport

  jvm-current-bytes - Current bytes used by the JVM - `long`
  jvm-max-bytes - Max bytes usable by the JVM (heap) - `long`
  off-heap-current-bytes - Current off-heap bytes used - `long`
  off-heap-max-bytes - Maximum off-heap bytes - `long`
  device-current-bytes - Current bytes used by each device (GPU, etc). May be null if no devices are present - `long[]`
  device-max-bytes - Maximum bytes for each device (GPU, etc). May be null if no devices are present - `long[]`"
  ([^SbeStatsReport this ^Long jvm-current-bytes ^Long jvm-max-bytes ^Long off-heap-current-bytes ^Long off-heap-max-bytes device-current-bytes device-max-bytes]
    (-> this (.reportMemoryUse jvm-current-bytes jvm-max-bytes off-heap-current-bytes off-heap-max-bytes device-current-bytes device-max-bytes))))

(defn report-histograms
  "Description copied from interface: StatsReport

  stats-type - StatsType: Parameters, Updates, Activations - `org.deeplearning4j.ui.stats.api.StatsType`
  histogram - Histogram values for all parameters - `java.util.Map`"
  ([^SbeStatsReport this ^org.deeplearning4j.ui.stats.api.StatsType stats-type ^java.util.Map histogram]
    (-> this (.reportHistograms stats-type histogram))))

(defn report-learning-rates
  "Description copied from interface: StatsReport

  learning-rates-by-param - `java.util.Map`"
  ([^SbeStatsReport this ^java.util.Map learning-rates-by-param]
    (-> this (.reportLearningRates learning-rates-by-param))))

(defn has-summary-stats?
  "Description copied from interface: StatsReport

  stats-type - stats type (Parameters, Updates, Activations) - `org.deeplearning4j.ui.stats.api.StatsType`
  summary-type - Summary statistic type (mean, stdev, mean magnitude) - `org.deeplearning4j.ui.stats.api.SummaryType`

  returns: `boolean`"
  (^Boolean [^SbeStatsReport this ^org.deeplearning4j.ui.stats.api.StatsType stats-type ^org.deeplearning4j.ui.stats.api.SummaryType summary-type]
    (-> this (.hasSummaryStats stats-type summary-type))))

(defn get-stdev
  "Description copied from interface: StatsReport

  stats-type - Stats type to get std dev values for - `org.deeplearning4j.ui.stats.api.StatsType`

  returns: Map of stdev values by parameter - `java.util.Map<java.lang.String,java.lang.Double>`"
  (^java.util.Map [^SbeStatsReport this ^org.deeplearning4j.ui.stats.api.StatsType stats-type]
    (-> this (.getStdev stats-type))))

(defn encoding-length-bytes
  "Description copied from interface: Persistable

  returns: `int`"
  (^Integer [^SbeStatsReport this]
    (-> this (.encodingLengthBytes))))

(defn decode
  "Description copied from interface: Persistable

  decode - `byte[]`"
  ([^SbeStatsReport this decode]
    (-> this (.decode decode))))

(defn has-performance?
  "Description copied from interface: StatsReport

  returns: `boolean`"
  (^Boolean [^SbeStatsReport this]
    (-> this (.hasPerformance))))

(defn report-i-ds
  "session-id - `java.lang.String`
  type-id - `java.lang.String`
  worker-id - `java.lang.String`
  time-stamp - `long`"
  ([^SbeStatsReport this ^java.lang.String session-id ^java.lang.String type-id ^java.lang.String worker-id ^Long time-stamp]
    (-> this (.reportIDs session-id type-id worker-id time-stamp))))

(defn get-mean
  "Description copied from interface: StatsReport

  stats-type - Stats type to get mean values for - `org.deeplearning4j.ui.stats.api.StatsType`

  returns: Map of mean values by parameter - `java.util.Map<java.lang.String,java.lang.Double>`"
  (^java.util.Map [^SbeStatsReport this ^org.deeplearning4j.ui.stats.api.StatsType stats-type]
    (-> this (.getMean stats-type))))

(defn has-data-set-meta-data?
  "Description copied from interface: StatsReport

  returns: True if DataSet metadata is present - `boolean`"
  (^Boolean [^SbeStatsReport this]
    (-> this (.hasDataSetMetaData))))

(defn report-stats-collection-duration-ms
  "Description copied from interface: StatsReport

  stats-collection-duration-ms - `int`"
  ([^SbeStatsReport this ^Integer stats-collection-duration-ms]
    (-> this (.reportStatsCollectionDurationMS stats-collection-duration-ms))))

(defn report-garbage-collection
  "Description copied from interface: StatsReport

  gc-name - Garbage collector name - `java.lang.String`
  delta-gc-count - Change in the total number of garbage collections, since last report - `int`
  delta-gc-time - Change in the amount of time (milliseconds) for garbage collection, since last report - `int`"
  ([^SbeStatsReport this ^java.lang.String gc-name ^Integer delta-gc-count ^Integer delta-gc-time]
    (-> this (.reportGarbageCollection gc-name delta-gc-count delta-gc-time))))

(defn get-data-set-meta-data-class-name
  "Description copied from interface: StatsReport

  returns: `java.lang.String`"
  (^java.lang.String [^SbeStatsReport this]
    (-> this (.getDataSetMetaDataClassName))))

(defn has-garbage-collection?
  "Description copied from interface: StatsReport

  returns: `boolean`"
  (^Boolean [^SbeStatsReport this]
    (-> this (.hasGarbageCollection))))

(defn report-score
  "Description copied from interface: StatsReport

  current-score - `double`"
  ([^SbeStatsReport this ^Double current-score]
    (-> this (.reportScore current-score))))

(defn get-time-stamp
  "Description copied from interface: Persistable

  returns: `long`"
  (^Long [^SbeStatsReport this]
    (-> this (.getTimeStamp))))

(defn report-iteration-count
  "Description copied from interface: StatsReport

  iteration-count - `int`"
  ([^SbeStatsReport this ^Integer iteration-count]
    (-> this (.reportIterationCount iteration-count))))

(defn get-garbage-collection-stats
  "Description copied from interface: StatsReport

  returns: `java.util.List<org.nd4j.linalg.primitives.Pair<java.lang.String,int[]>>`"
  ([^SbeStatsReport this]
    (-> this (.getGarbageCollectionStats))))

(defn report-performance
  "Description copied from interface: StatsReport

  total-runtime-ms - Overall runtime since initialization - `long`
  total-examples - Total examples processed since initialization - `long`
  total-minibatches - Total number of minibatches (iterations) since initialization - `long`
  examples-per-second - Examples per second since last report - `double`
  minibatches-per-second - Minibatches per second since last report - `double`"
  ([^SbeStatsReport this ^Long total-runtime-ms ^Long total-examples ^Long total-minibatches ^Double examples-per-second ^Double minibatches-per-second]
    (-> this (.reportPerformance total-runtime-ms total-examples total-minibatches examples-per-second minibatches-per-second))))

(defn has-learning-rates?
  "Description copied from interface: StatsReport

  returns: `boolean`"
  (^Boolean [^SbeStatsReport this]
    (-> this (.hasLearningRates))))

(defn report-stdev
  "Description copied from interface: StatsReport

  stats-type - Stats type to report std. dev values for - `org.deeplearning4j.ui.stats.api.StatsType`
  stdev - Map of std dev values by parameter - `java.util.Map`"
  ([^SbeStatsReport this ^org.deeplearning4j.ui.stats.api.StatsType stats-type ^java.util.Map stdev]
    (-> this (.reportStdev stats-type stdev))))

(defn has-score?
  "Description copied from interface: StatsReport

  returns: `boolean`"
  (^Boolean [^SbeStatsReport this]
    (-> this (.hasScore))))

(defn get-learning-rates
  "Description copied from interface: StatsReport

  returns: `java.util.Map<java.lang.String,java.lang.Double>`"
  (^java.util.Map [^SbeStatsReport this]
    (-> this (.getLearningRates))))

(defn report-mean
  "Description copied from interface: StatsReport

  stats-type - Stats type to report - `org.deeplearning4j.ui.stats.api.StatsType`
  mean - Map of mean values, by parameter - `java.util.Map`"
  ([^SbeStatsReport this ^org.deeplearning4j.ui.stats.api.StatsType stats-type ^java.util.Map mean]
    (-> this (.reportMean stats-type mean))))

(defn get-type-id
  "Description copied from interface: Persistable

  returns: `java.lang.String`"
  (^java.lang.String [^SbeStatsReport this]
    (-> this (.getTypeID))))

(defn get-histograms
  "Description copied from interface: StatsReport

  stats-type - Stats type (Params/updatse/activations) to get histograms for - `org.deeplearning4j.ui.stats.api.StatsType`

  returns: Histograms by parameter name, or null if not available - `java.util.Map<java.lang.String,org.deeplearning4j.ui.stats.api.Histogram>`"
  (^java.util.Map [^SbeStatsReport this ^org.deeplearning4j.ui.stats.api.StatsType stats-type]
    (-> this (.getHistograms stats-type))))

(defn encode
  "Description copied from interface: Persistable

  buffer - `java.nio.ByteBuffer`"
  ([^SbeStatsReport this ^java.nio.ByteBuffer buffer]
    (-> this (.encode buffer)))
  ([^SbeStatsReport this]
    (-> this (.encode))))

(defn get-session-id
  "Description copied from interface: Persistable

  returns: `java.lang.String`"
  (^java.lang.String [^SbeStatsReport this]
    (-> this (.getSessionID))))

(defn report-mean-magnitudes
  "Description copied from interface: StatsReport

  stats-type - Stats type to report mean magnitude values for - `org.deeplearning4j.ui.stats.api.StatsType`
  mean-magnitudes - Map of mean magnitude values by parameter - `java.util.Map`"
  ([^SbeStatsReport this ^org.deeplearning4j.ui.stats.api.StatsType stats-type ^java.util.Map mean-magnitudes]
    (-> this (.reportMeanMagnitudes stats-type mean-magnitudes))))

(defn get-mean-magnitudes
  "Description copied from interface: StatsReport

  stats-type - Stats type to get mean magnitude values for - `org.deeplearning4j.ui.stats.api.StatsType`

  returns: Map of mean magnitude values by parameter - `java.util.Map<java.lang.String,java.lang.Double>`"
  (^java.util.Map [^SbeStatsReport this ^org.deeplearning4j.ui.stats.api.StatsType stats-type]
    (-> this (.getMeanMagnitudes stats-type))))

