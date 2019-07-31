(ns org.nd4j.linalg.api.ops.impl.transforms.gradient.TanhDerivative
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms.gradient TanhDerivative]))

(defn ->tanh-derivative
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  i-v-1 - `org.nd4j.autodiff.samediff.SDVariable`
  i-v-2 - `org.nd4j.autodiff.samediff.SDVariable`
  in-place - `boolean`"
  (^TanhDerivative [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v-1 ^org.nd4j.autodiff.samediff.SDVariable i-v-2 ^Boolean in-place]
    (new TanhDerivative same-diff i-v-1 i-v-2 in-place))
  (^TanhDerivative [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v-1 ^org.nd4j.autodiff.samediff.SDVariable i-v-2]
    (new TanhDerivative same-diff i-v-1 i-v-2))
  (^TanhDerivative [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray z]
    (new TanhDerivative x z))
  (^TanhDerivative [^org.nd4j.linalg.api.ndarray.INDArray x]
    (new TanhDerivative x))
  (^TanhDerivative []
    (new TanhDerivative )))

(defn op-num
  "An op number

  returns: `int`"
  (^Integer [^TanhDerivative this]
    (-> this (.opNum))))

(defn op-name
  "The opName of this operation

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^TanhDerivative this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^TanhDerivative this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^TanhDerivative this]
    (-> this (.tensorflowName))))

(defn exec
  "Description copied from interface: Op

  dimensions - the dimensions to execute on - `int`"
  ([^TanhDerivative this ^Integer dimensions]
    (-> this (.exec dimensions)))
  ([^TanhDerivative this]
    (-> this (.exec))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  i-v - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^TanhDerivative this ^java.util.List i-v]
    (-> this (.doDiff i-v))))

