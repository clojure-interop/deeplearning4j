(ns org.nd4j.linalg.api.ops.GradientOp
  "A gradient op represents
 a jacobian operation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops GradientOp]))

(defn wrt
  "The array
  to the gradient with respect to

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^GradientOp this]
    (-> this (.wrt))))

