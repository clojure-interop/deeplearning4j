(ns org.nd4j.linalg.api.ops.impl.transforms.gradient.RationalTanhDerivative
  "Rational Tanh Derivative, as described at https://github.com/deeplearning4j/libnd4j/issues/351
 Calculates dOut/dIn given input, not dL/dIn given dL/dOut and input"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms.gradient RationalTanhDerivative]))

(defn ->rational-tanh-derivative
  "Constructor.

  x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`
  z - `org.nd4j.linalg.api.ndarray.INDArray`
  n - `long`"
  (^RationalTanhDerivative [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Long n]
    (new RationalTanhDerivative x y z n))
  (^RationalTanhDerivative [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable in ^Boolean in-place]
    (new RationalTanhDerivative same-diff in in-place))
  (^RationalTanhDerivative [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray z]
    (new RationalTanhDerivative x z))
  (^RationalTanhDerivative [^org.nd4j.linalg.api.ndarray.INDArray x]
    (new RationalTanhDerivative x))
  (^RationalTanhDerivative []
    (new RationalTanhDerivative )))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^RationalTanhDerivative this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^RationalTanhDerivative this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^RationalTanhDerivative this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^RationalTanhDerivative this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^RationalTanhDerivative this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

