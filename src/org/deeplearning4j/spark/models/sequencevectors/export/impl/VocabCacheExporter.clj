(ns org.deeplearning4j.spark.models.sequencevectors.export.impl.VocabCacheExporter
  "This model exporter is suitable for debug/testing only.
 PLEASE NOTE: Never use this exporter in real environment if your model won't fit into memory of driver."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.models.sequencevectors.export.impl VocabCacheExporter]))

(defn ->vocab-cache-exporter
  "Constructor."
  (^VocabCacheExporter []
    (new VocabCacheExporter )))

(defn export
  "Description copied from interface: SparkModelExporter

  rdd - `org.apache.spark.api.java.JavaRDD`"
  ([^VocabCacheExporter this ^org.apache.spark.api.java.JavaRDD rdd]
    (-> this (.export rdd))))

