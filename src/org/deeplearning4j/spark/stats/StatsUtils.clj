(ns org.deeplearning4j.spark.stats.StatsUtils
  "Utility methods for Spark training stats"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.stats StatsUtils]))

(def *-default-max-timeline-size-ms
  "Static Constant.

  type: long"
  StatsUtils/DEFAULT_MAX_TIMELINE_SIZE_MS)

(defn *export-stats
  "list - `java.util.List`
  output-directory - `java.lang.String`
  filename - `java.lang.String`
  delimiter - `java.lang.String`
  sc - `org.apache.spark.SparkContext`

  throws: java.io.IOException"
  ([^java.util.List list ^java.lang.String output-directory ^java.lang.String filename ^java.lang.String delimiter ^org.apache.spark.SparkContext sc]
    (StatsUtils/exportStats list output-directory filename delimiter sc))
  ([^java.util.List list ^java.lang.String output-path ^java.lang.String delimiter ^org.apache.spark.SparkContext sc]
    (StatsUtils/exportStats list output-path delimiter sc)))

(defn *get-duration-as-string
  "list - `java.util.List`
  delim - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.util.List list ^java.lang.String delim]
    (StatsUtils/getDurationAsString list delim)))

(defn *export-stats-as-html
  "Generate and export a HTML representation (including charts, etc) of the Spark training statistics
  Note: exporting is done via Spark, so the path here can be a local file, HDFS, etc.

  spark-training-stats - Stats to generate HTML page for - `org.deeplearning4j.spark.api.stats.SparkTrainingStats`
  max-timeline-size-ms - maximum amount of activity to show in a single timeline plot (multiple plots will be used if training exceeds this amount of time) - `long`
  path - Path to export. May be local or HDFS - `java.lang.String`
  sc - Spark context - `org.apache.spark.SparkContext`

  throws: java.lang.Exception - IO errors or error generating HTML file"
  ([^org.deeplearning4j.spark.api.stats.SparkTrainingStats spark-training-stats ^Long max-timeline-size-ms ^java.lang.String path ^org.apache.spark.SparkContext sc]
    (StatsUtils/exportStatsAsHtml spark-training-stats max-timeline-size-ms path sc))
  ([^org.deeplearning4j.spark.api.stats.SparkTrainingStats spark-training-stats ^java.lang.String path ^org.apache.spark.SparkContext sc]
    (StatsUtils/exportStatsAsHtml spark-training-stats path sc)))

(defn *export-stats-as-html
  "Generate and export a HTML representation (including charts, etc) of the Spark training statistics
  This overload is for writing to an output stream

  spark-training-stats - Stats to generate HTML page for - `org.deeplearning4j.spark.api.stats.SparkTrainingStats`
  max-timeline-size-ms - maximum amount of activity to show in a single timeline plot (multiple plots will be used if training exceeds this amount of time) - `long`
  output-stream - `java.io.OutputStream`

  throws: java.lang.Exception - IO errors or error generating HTML file"
  ([^org.deeplearning4j.spark.api.stats.SparkTrainingStats spark-training-stats ^Long max-timeline-size-ms ^java.io.OutputStream output-stream]
    (StatsUtils/exportStatsAsHTML spark-training-stats max-timeline-size-ms output-stream))
  ([^org.deeplearning4j.spark.api.stats.SparkTrainingStats spark-training-stats ^java.io.OutputStream output-stream]
    (StatsUtils/exportStatsAsHTML spark-training-stats output-stream)))

