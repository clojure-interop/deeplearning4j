(ns org.deeplearning4j.spark.iterator.SparkADSI
  "Spark version of AsyncDataSetIterator, made separate to propagate Spark TaskContext to new background thread, for Spark block locks compatibility"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.iterator SparkADSI]))

(defn ->spark-adsi
  "Constructor.

  iterator - `org.nd4j.linalg.dataset.api.iterator.DataSetIterator`
  queue-size - `int`
  queue - `java.util.concurrent.BlockingQueue`
  use-workspace - `boolean`
  callback - `org.deeplearning4j.datasets.iterator.callbacks.DataSetCallback`
  device-id - `java.lang.Integer`"
  (^SparkADSI [^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iterator ^Integer queue-size ^java.util.concurrent.BlockingQueue queue ^Boolean use-workspace ^org.deeplearning4j.datasets.iterator.callbacks.DataSetCallback callback ^java.lang.Integer device-id]
    (new SparkADSI iterator queue-size queue use-workspace callback device-id))
  (^SparkADSI [^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iterator ^Integer queue-size ^java.util.concurrent.BlockingQueue queue ^Boolean use-workspace ^org.deeplearning4j.datasets.iterator.callbacks.DataSetCallback callback]
    (new SparkADSI iterator queue-size queue use-workspace callback))
  (^SparkADSI [^org.nd4j.linalg.dataset.api.iterator.DataSetIterator base-iterator ^Integer queue-size ^Boolean use-workspace ^java.lang.Integer device-id]
    (new SparkADSI base-iterator queue-size use-workspace device-id))
  (^SparkADSI [^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iterator ^Integer queue-size ^java.util.concurrent.BlockingQueue queue]
    (new SparkADSI iterator queue-size queue))
  (^SparkADSI [^org.nd4j.linalg.dataset.api.iterator.DataSetIterator base-iterator ^Integer queue-size]
    (new SparkADSI base-iterator queue-size))
  (^SparkADSI [^org.nd4j.linalg.dataset.api.iterator.DataSetIterator base-iterator]
    (new SparkADSI base-iterator)))

