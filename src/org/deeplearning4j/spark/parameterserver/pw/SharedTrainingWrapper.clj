(ns org.deeplearning4j.spark.parameterserver.pw.SharedTrainingWrapper
  "This class maintains ParallelWrapper instance in Spark environment, and provides primitives for inter-executor
 communication during training over partitions."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.parameterserver.pw SharedTrainingWrapper]))

(defn *get-instance
  "id - `long`

  returns: `org.deeplearning4j.spark.parameterserver.pw.SharedTrainingWrapper`"
  (^org.deeplearning4j.spark.parameterserver.pw.SharedTrainingWrapper [^Long id]
    (SharedTrainingWrapper/getInstance id)))

(defn attach-ds
  "This method registers given Iterable in VirtualDataSetIterator

  iterator - `java.util.Iterator`"
  ([^SharedTrainingWrapper this ^java.util.Iterator iterator]
    (-> this (.attachDS iterator))))

(defn attach-mds
  "This method registers given Iterable in VirtualMultiDataSetIterator

  iterator - `java.util.Iterator`"
  ([^SharedTrainingWrapper this ^java.util.Iterator iterator]
    (-> this (.attachMDS iterator))))

(defn run
  "worker - `org.deeplearning4j.spark.parameterserver.training.SharedTrainingWorker`

  returns: `org.deeplearning4j.spark.parameterserver.training.SharedTrainingResult`"
  (^org.deeplearning4j.spark.parameterserver.training.SharedTrainingResult [^SharedTrainingWrapper this ^org.deeplearning4j.spark.parameterserver.training.SharedTrainingWorker worker]
    (-> this (.run worker))))

(defn pass-data-set
  "data-set - `org.nd4j.linalg.dataset.DataSet`"
  ([^SharedTrainingWrapper this ^org.nd4j.linalg.dataset.DataSet data-set]
    (-> this (.passDataSet data-set))))

(defn block-until-finished
  "throws: java.lang.InterruptedException"
  ([^SharedTrainingWrapper this]
    (-> this (.blockUntilFinished))))

