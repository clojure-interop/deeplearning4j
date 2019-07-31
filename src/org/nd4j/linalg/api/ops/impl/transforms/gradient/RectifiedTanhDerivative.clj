(ns org.nd4j.linalg.api.ops.impl.transforms.gradient.RectifiedTanhDerivative
  "Rectified Tanh Derivative"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms.gradient RectifiedTanhDerivative]))

(defn ->rectified-tanh-derivative
  "Constructor.

  x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`
  z - `org.nd4j.linalg.api.ndarray.INDArray`
  n - `long`"
  (^RectifiedTanhDerivative [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Long n]
    (new RectifiedTanhDerivative x y z n))
  (^RectifiedTanhDerivative [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable in ^Boolean in-place]
    (new RectifiedTanhDerivative same-diff in in-place))
  (^RectifiedTanhDerivative [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray z]
    (new RectifiedTanhDerivative x z))
  (^RectifiedTanhDerivative [^org.nd4j.linalg.api.ndarray.INDArray x]
    (new RectifiedTanhDerivative x))
  (^RectifiedTanhDerivative []
    (new RectifiedTanhDerivative )))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^RectifiedTanhDerivative this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^RectifiedTanhDerivative this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^RectifiedTanhDerivative this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^RectifiedTanhDerivative this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^RectifiedTanhDerivative this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

