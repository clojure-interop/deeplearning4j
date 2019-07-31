(ns org.deeplearning4j.spark.data.SplitDataSetsFunction
  "Take an existing DataSet object, and split it into multiple DataSet objects with one example in each
 Usage:


       RDD<DataSet> myBatchedExampleDataSets = ...;
       RDD<DataSet> singleExamlpeDataSets = myBatchedExampleDataSets.mapPartitions(new SplitDataSets(batchSize));"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.data SplitDataSetsFunction]))

(defn ->split-data-sets-function
  "Constructor."
  (^SplitDataSetsFunction []
    (new SplitDataSetsFunction )))

