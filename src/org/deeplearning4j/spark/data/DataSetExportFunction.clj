(ns org.deeplearning4j.spark.data.DataSetExportFunction
  "A function (used in forEachPartition) to save DataSet objects to disk/HDFS. Each DataSet object is given a random and
 (probably) unique name, starting with \"dataset_\" and ending with \".bin\".
 Use with JavaRDD<DataSet>.foreachPartition()"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.data DataSetExportFunction]))

(defn ->data-set-export-function
  "Constructor.

  output-dir - `java.net.URI`"
  (^DataSetExportFunction [^java.net.URI output-dir]
    (new DataSetExportFunction output-dir)))

(defn call
  "iter - `java.util.Iterator`

  throws: java.lang.Exception"
  ([^DataSetExportFunction this ^java.util.Iterator iter]
    (-> this (.call iter))))

