(ns org.deeplearning4j.spark.datavec.RDDMiniBatches
  "RDD mini batch partitioning"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.datavec RDDMiniBatches]))

(defn ->rdd-mini-batches
  "Constructor.

  mini-batches - `int`
  to-split - `org.apache.spark.api.java.JavaRDD`"
  (^RDDMiniBatches [^Integer mini-batches ^org.apache.spark.api.java.JavaRDD to-split]
    (new RDDMiniBatches mini-batches to-split)))

(defn mini-batches-java
  "returns: `org.apache.spark.api.java.JavaRDD<org.nd4j.linalg.dataset.DataSet>`"
  (^org.apache.spark.api.java.JavaRDD [^RDDMiniBatches this]
    (-> this (.miniBatchesJava))))

