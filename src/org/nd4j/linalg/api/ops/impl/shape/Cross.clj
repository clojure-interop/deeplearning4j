(ns org.nd4j.linalg.api.ops.impl.shape.Cross
  "Pairwise cross-product of two tensors of the same shape.
 Base operation for two vectors is:
 a x b = (a_2 * b_3 - a_3 * b_2, a_3 * b_1 - a_1 * b_3, a_1 * b_2 - a_2 * b_1)
 For tensors of more complicated shape this op is computed pairwise. For this
 to work the outer dimension has to be 3."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.shape Cross]))

(defn ->cross
  "Constructor.

  a - `org.nd4j.linalg.api.ndarray.INDArray`
  b - `org.nd4j.linalg.api.ndarray.INDArray`
  out - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^Cross [^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray b ^org.nd4j.linalg.api.ndarray.INDArray out]
    (new Cross a b out))
  (^Cross [^org.nd4j.autodiff.samediff.SameDiff same-diff args]
    (new Cross same-diff args))
  (^Cross []
    (new Cross )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^Cross this]
    (-> this (.opName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Cross this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  gradients - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^Cross this ^java.util.List gradients]
    (-> this (.doDiff gradients))))

