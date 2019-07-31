(ns org.deeplearning4j.spark.data.BatchAndExportDataSetsFunction
  "Function used with RDD<DataSet>.mapPartitionsWithIndex.
 It does two things:
 1. Batch DataSets together, to the specified minibatch size. This may result in splitting or combining existing
 DataSet objects as required
 2. Export the DataSet objects to the specified directory.

 Naming convention for exported files:
 \"dataset_\"  partitionIdx  JVM_UID  \"_\"  idx  \".bin\"
 where 'idx' is the index of the DataSet objects in this partition"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.data BatchAndExportDataSetsFunction]))

(defn ->batch-and-export-data-sets-function
  "Constructor.

  minibatch-size - Minibatch size to combine examples to (if necessary) - `int`
  export-base-directory - Base directory for exporting - `java.lang.String`"
  (^BatchAndExportDataSetsFunction [^Integer minibatch-size ^java.lang.String export-base-directory]
    (new BatchAndExportDataSetsFunction minibatch-size export-base-directory)))

(defn call
  "partition-idx - `java.lang.Integer`
  iterator - `java.util.Iterator`

  returns: `java.util.Iterator<java.lang.String>`

  throws: java.lang.Exception"
  (^java.util.Iterator [^BatchAndExportDataSetsFunction this ^java.lang.Integer partition-idx ^java.util.Iterator iterator]
    (-> this (.call partition-idx iterator))))

