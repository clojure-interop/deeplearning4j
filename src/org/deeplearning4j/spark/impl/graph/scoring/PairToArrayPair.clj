(ns org.deeplearning4j.spark.impl.graph.scoring.PairToArrayPair
  "Simple conversion function for SparkComputationGraph"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.impl.graph.scoring PairToArrayPair]))

(defn ->pair-to-array-pair
  "Constructor."
  (^PairToArrayPair []
    (new PairToArrayPair )))

(defn call
  "v-1 - `scala.Tuple2`

  returns: `scala.Tuple2<K,org.nd4j.linalg.api.ndarray.INDArray[]>`

  throws: java.lang.Exception"
  ([^PairToArrayPair this ^scala.Tuple2 v-1]
    (-> this (.call v-1))))

