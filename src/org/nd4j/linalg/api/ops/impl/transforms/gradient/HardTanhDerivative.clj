(ns org.nd4j.linalg.api.ops.impl.transforms.gradient.HardTanhDerivative
  "Hard tanh elementwise derivative function"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms.gradient HardTanhDerivative]))

(defn ->hard-tanh-derivative
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  i-v - `org.nd4j.autodiff.samediff.SDVariable`
  shape - `int[]`
  in-place - `boolean`
  extra-args - `java.lang.Object[]`"
  (^HardTanhDerivative [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v shape ^Boolean in-place extra-args]
    (new HardTanhDerivative same-diff i-v shape in-place extra-args))
  (^HardTanhDerivative [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Long n]
    (new HardTanhDerivative x y z n))
  (^HardTanhDerivative [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v ^Boolean in-place]
    (new HardTanhDerivative same-diff i-v in-place))
  (^HardTanhDerivative [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray z]
    (new HardTanhDerivative x z))
  (^HardTanhDerivative [^org.nd4j.linalg.api.ndarray.INDArray x]
    (new HardTanhDerivative x))
  (^HardTanhDerivative []
    (new HardTanhDerivative )))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^HardTanhDerivative this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^HardTanhDerivative this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^HardTanhDerivative this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^HardTanhDerivative this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  i-v - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^HardTanhDerivative this ^java.util.List i-v]
    (-> this (.doDiff i-v))))

