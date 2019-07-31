(ns org.deeplearning4j.spark.impl.graph.dataset.PairDataSetToMultiDataSetFn
  "Simple conversion function to convert from a JavaPairRDD<K,DataSet> to a JavaPairRDD<K,MultiDataSet>"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.impl.graph.dataset PairDataSetToMultiDataSetFn]))

(defn ->pair-data-set-to-multi-data-set-fn
  "Constructor."
  (^PairDataSetToMultiDataSetFn []
    (new PairDataSetToMultiDataSetFn )))

(defn call
  "in - `scala.Tuple2`

  returns: `scala.Tuple2<K,org.nd4j.linalg.dataset.api.MultiDataSet>`

  throws: java.lang.Exception"
  (^scala.Tuple2 [^PairDataSetToMultiDataSetFn this ^scala.Tuple2 in]
    (-> this (.call in))))

