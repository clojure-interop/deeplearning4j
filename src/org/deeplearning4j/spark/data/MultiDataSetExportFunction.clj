(ns org.deeplearning4j.spark.data.MultiDataSetExportFunction
  "A function (used in forEachPartition) to save MultiDataSet objects to disk/HDFS. Each MultiDataSet object is given a random and
 (probably) unique name, starting with \"mds_\" and ending with \".bin\".
 Use with JavaRDD<MultiDataSet>.foreachPartition()"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.data MultiDataSetExportFunction]))

(defn ->multi-data-set-export-function
  "Constructor.

  output-dir - `java.net.URI`"
  (^MultiDataSetExportFunction [^java.net.URI output-dir]
    (new MultiDataSetExportFunction output-dir)))

(defn call
  "iter - `java.util.Iterator`

  throws: java.lang.Exception"
  ([^MultiDataSetExportFunction this ^java.util.Iterator iter]
    (-> this (.call iter))))

