(ns org.deeplearning4j.spark.data.BatchDataSetsFunction
  "Function used to batch DataSet objects together. Typically used to combine singe-example DataSet objects out of
 something like DataVecDataSetFunction together into minibatches.
 Usage:


       RDD<DataSet> mySingleExampleDataSets = ...;
       RDD<DataSet> batchData = mySingleExampleDataSets.mapPartitions(new BatchDataSetsFunction(batchSize));"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.data BatchDataSetsFunction]))

(defn ->batch-data-sets-function
  "Constructor.

  minibatch-size - `int`"
  (^BatchDataSetsFunction [^Integer minibatch-size]
    (new BatchDataSetsFunction minibatch-size)))

