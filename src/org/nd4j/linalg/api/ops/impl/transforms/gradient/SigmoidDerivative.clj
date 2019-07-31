(ns org.nd4j.linalg.api.ops.impl.transforms.gradient.SigmoidDerivative
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms.gradient SigmoidDerivative]))

(defn ->sigmoid-derivative
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  i-v-1 - `org.nd4j.autodiff.samediff.SDVariable`
  i-v-2 - `org.nd4j.autodiff.samediff.SDVariable`
  in-place - `boolean`"
  (^SigmoidDerivative [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v-1 ^org.nd4j.autodiff.samediff.SDVariable i-v-2 ^Boolean in-place]
    (new SigmoidDerivative same-diff i-v-1 i-v-2 in-place))
  (^SigmoidDerivative [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v-1 ^org.nd4j.autodiff.samediff.SDVariable i-v-2]
    (new SigmoidDerivative same-diff i-v-1 i-v-2))
  (^SigmoidDerivative [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray z]
    (new SigmoidDerivative x z))
  (^SigmoidDerivative [^org.nd4j.linalg.api.ndarray.INDArray x]
    (new SigmoidDerivative x))
  (^SigmoidDerivative []
    (new SigmoidDerivative )))

(defn op-num
  "An op number

  returns: `int`"
  (^Integer [^SigmoidDerivative this]
    (-> this (.opNum))))

(defn op-name
  "The opName of this operation

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^SigmoidDerivative this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^SigmoidDerivative this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^SigmoidDerivative this]
    (-> this (.tensorflowName))))

(defn exec
  "Description copied from interface: Op

  dimensions - the dimensions to execute on - `int`"
  ([^SigmoidDerivative this ^Integer dimensions]
    (-> this (.exec dimensions)))
  ([^SigmoidDerivative this]
    (-> this (.exec))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  i-v - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^SigmoidDerivative this ^java.util.List i-v]
    (-> this (.doDiff i-v))))

