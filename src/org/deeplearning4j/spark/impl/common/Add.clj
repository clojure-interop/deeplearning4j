(ns org.deeplearning4j.spark.impl.common.Add
  "Adds 2 ndarrays"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.impl.common Add]))

(defn ->add
  "Constructor."
  (^Add []
    (new Add )))

(defn call
  "v-1 - `org.nd4j.linalg.api.ndarray.INDArray`
  v-2 - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`

  throws: java.lang.Exception"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Add this ^org.nd4j.linalg.api.ndarray.INDArray v-1 ^org.nd4j.linalg.api.ndarray.INDArray v-2]
    (-> this (.call v-1 v-2))))

