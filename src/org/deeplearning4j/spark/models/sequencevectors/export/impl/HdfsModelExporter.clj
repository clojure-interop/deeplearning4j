(ns org.deeplearning4j.spark.models.sequencevectors.export.impl.HdfsModelExporter
  "Simple exporter, that will persist your SequenceVectors model into HDFS using TSV format"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.models.sequencevectors.export.impl HdfsModelExporter]))

(defn ->hdfs-model-exporter
  "Constructor.

  path - `java.lang.String`
  codec - `org.apache.hadoop.io.compress.CompressionCodec`"
  (^HdfsModelExporter [^java.lang.String path ^org.apache.hadoop.io.compress.CompressionCodec codec]
    (new HdfsModelExporter path codec))
  (^HdfsModelExporter [^java.lang.String path]
    (new HdfsModelExporter path)))

(defn export
  "Description copied from interface: SparkModelExporter

  rdd - `org.apache.spark.api.java.JavaRDD`"
  ([^HdfsModelExporter this ^org.apache.spark.api.java.JavaRDD rdd]
    (-> this (.export rdd))))

