(ns org.deeplearning4j.spark.iterator.PathSparkDataSetIterator
  "A DataSetIterator that loads serialized DataSet objects (saved with DataSet.save(OutputStream)) from
 a String that represents the path (for example, on HDFS)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.iterator PathSparkDataSetIterator]))

(defn ->path-spark-data-set-iterator
  "Constructor.

  iter - `java.util.Iterator`
  data-set-loader - `org.deeplearning4j.api.loader.DataSetLoader`"
  (^PathSparkDataSetIterator [^java.util.Iterator iter ^org.deeplearning4j.api.loader.DataSetLoader data-set-loader]
    (new PathSparkDataSetIterator iter data-set-loader)))

(def *-buffer-size
  "Static Constant.

  type: int"
  PathSparkDataSetIterator/BUFFER_SIZE)

(defn next
  "returns: `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^PathSparkDataSetIterator this]
    (-> this (.next))))

