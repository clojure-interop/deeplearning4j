(ns org.deeplearning4j.spark.iterator.SparkAMDSI
  "Spark version of AsyncMultiDataSetIterator, made separate to propagate Spark TaskContext to new background thread, for Spark block locks compatibility"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.iterator SparkAMDSI]))

(defn ->spark-amdsi
  "Constructor.

  iterator - `org.nd4j.linalg.dataset.api.iterator.MultiDataSetIterator`
  queue-size - `int`
  queue - `java.util.concurrent.BlockingQueue`
  use-workspace - `boolean`
  callback - `org.deeplearning4j.datasets.iterator.callbacks.DataSetCallback`
  device-id - `java.lang.Integer`"
  (^SparkAMDSI [^org.nd4j.linalg.dataset.api.iterator.MultiDataSetIterator iterator ^Integer queue-size ^java.util.concurrent.BlockingQueue queue ^Boolean use-workspace ^org.deeplearning4j.datasets.iterator.callbacks.DataSetCallback callback ^java.lang.Integer device-id]
    (new SparkAMDSI iterator queue-size queue use-workspace callback device-id))
  (^SparkAMDSI [^org.nd4j.linalg.dataset.api.iterator.MultiDataSetIterator iterator ^Integer queue-size ^java.util.concurrent.BlockingQueue queue ^Boolean use-workspace ^org.deeplearning4j.datasets.iterator.callbacks.DataSetCallback callback]
    (new SparkAMDSI iterator queue-size queue use-workspace callback))
  (^SparkAMDSI [^org.nd4j.linalg.dataset.api.iterator.MultiDataSetIterator base-iterator ^Integer queue-size ^Boolean use-workspace ^java.lang.Integer device-id]
    (new SparkAMDSI base-iterator queue-size use-workspace device-id))
  (^SparkAMDSI [^org.nd4j.linalg.dataset.api.iterator.MultiDataSetIterator iterator ^Integer queue-size ^java.util.concurrent.BlockingQueue queue]
    (new SparkAMDSI iterator queue-size queue))
  (^SparkAMDSI [^org.nd4j.linalg.dataset.api.iterator.MultiDataSetIterator base-iterator ^Integer queue-size]
    (new SparkAMDSI base-iterator queue-size))
  (^SparkAMDSI [^org.nd4j.linalg.dataset.api.iterator.MultiDataSetIterator base-iterator]
    (new SparkAMDSI base-iterator)))

