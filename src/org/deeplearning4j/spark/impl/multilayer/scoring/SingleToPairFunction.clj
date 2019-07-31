(ns org.deeplearning4j.spark.impl.multilayer.scoring.SingleToPairFunction
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.impl.multilayer.scoring SingleToPairFunction]))

(defn ->single-to-pair-function
  "Constructor."
  (^SingleToPairFunction []
    (new SingleToPairFunction )))

(defn call
  "t-2 - `scala.Tuple2`

  returns: `scala.Tuple2<T,scala.Tuple2<org.nd4j.linalg.api.ndarray.INDArray,org.nd4j.linalg.api.ndarray.INDArray>>`

  throws: java.lang.Exception"
  (^scala.Tuple2 [^SingleToPairFunction this ^scala.Tuple2 t-2]
    (-> this (.call t-2))))

