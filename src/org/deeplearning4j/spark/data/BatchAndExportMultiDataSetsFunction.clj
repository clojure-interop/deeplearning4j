(ns org.deeplearning4j.spark.data.BatchAndExportMultiDataSetsFunction
  "Function used with RDD<MultiDataSet>.mapPartitionsWithIndex.
 It does two things:
 1. Batch MultiDataSets together, to the specified minibatch size. This may result in splitting or combining existing
 MultiDataSet objects as required
 2. Export the MultiDataSet objects to the specified directory.

 Naming convention for exported files:
 \"mds_\"  partitionIdx  JVM_UID  \"_\"  idx  \".bin\"
 where 'idx' is the index of the MultiDataSet objects in this partition"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.data BatchAndExportMultiDataSetsFunction]))

(defn ->batch-and-export-multi-data-sets-function
  "Constructor.

  minibatch-size - Minibatch size to combine examples to (if necessary) - `int`
  export-base-directory - Base directory for exporting - `java.lang.String`"
  (^BatchAndExportMultiDataSetsFunction [^Integer minibatch-size ^java.lang.String export-base-directory]
    (new BatchAndExportMultiDataSetsFunction minibatch-size export-base-directory)))

(defn call
  "partition-idx - `java.lang.Integer`
  iterator - `java.util.Iterator`

  returns: `java.util.Iterator<java.lang.String>`

  throws: java.lang.Exception"
  (^java.util.Iterator [^BatchAndExportMultiDataSetsFunction this ^java.lang.Integer partition-idx ^java.util.Iterator iterator]
    (-> this (.call partition-idx iterator))))

