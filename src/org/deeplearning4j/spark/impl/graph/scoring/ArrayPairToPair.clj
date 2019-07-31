(ns org.deeplearning4j.spark.impl.graph.scoring.ArrayPairToPair
  "Simple conversion function for SparkComputationGraph"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.impl.graph.scoring ArrayPairToPair]))

(defn ->array-pair-to-pair
  "Constructor."
  (^ArrayPairToPair []
    (new ArrayPairToPair )))

(defn call
  "v-1 - `scala.Tuple2`

  returns: `scala.Tuple2<K,org.nd4j.linalg.api.ndarray.INDArray>`

  throws: java.lang.Exception"
  (^scala.Tuple2 [^ArrayPairToPair this ^scala.Tuple2 v-1]
    (-> this (.call v-1))))

