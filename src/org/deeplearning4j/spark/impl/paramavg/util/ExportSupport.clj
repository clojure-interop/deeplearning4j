(ns org.deeplearning4j.spark.impl.paramavg.util.ExportSupport
  "Utility for checking if exporting data sets is supported"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.impl.paramavg.util ExportSupport]))

(defn ->export-support
  "Constructor."
  (^ExportSupport []
    (new ExportSupport )))

(defn *assert-export-supported
  "Verify that exporting data is supported, and throw an informative exception if not.

  sc - the Spark context - `org.apache.spark.api.java.JavaSparkContext`"
  ([^org.apache.spark.api.java.JavaSparkContext sc]
    (ExportSupport/assertExportSupported sc)))

(defn *export-supported
  "Check if exporting data is supported in the current environment. Exporting is possible in two cases:
  - The master is set to local. In this case any file system, including local FS, will work for exporting.
  - The file system is not local. Local file systems do not work in cluster modes.

  spark-master - the Spark master - `java.lang.String`
  fs - the Hadoop file system - `org.apache.hadoop.fs.FileSystem`

  returns: if export is supported - `boolean`"
  (^Boolean [^java.lang.String spark-master ^org.apache.hadoop.fs.FileSystem fs]
    (ExportSupport/exportSupported spark-master fs))
  (^Boolean [^org.apache.spark.api.java.JavaSparkContext sc]
    (ExportSupport/exportSupported sc)))

