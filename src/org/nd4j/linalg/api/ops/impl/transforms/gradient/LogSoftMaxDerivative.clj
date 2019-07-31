(ns org.nd4j.linalg.api.ops.impl.transforms.gradient.LogSoftMaxDerivative
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms.gradient LogSoftMaxDerivative]))

(defn ->log-soft-max-derivative
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  i-v-1 - `org.nd4j.autodiff.samediff.SDVariable`
  i-v-2 - `org.nd4j.autodiff.samediff.SDVariable`
  in-place - `boolean`"
  (^LogSoftMaxDerivative [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v-1 ^org.nd4j.autodiff.samediff.SDVariable i-v-2 ^Boolean in-place]
    (new LogSoftMaxDerivative same-diff i-v-1 i-v-2 in-place))
  (^LogSoftMaxDerivative [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v-1 ^org.nd4j.autodiff.samediff.SDVariable i-v-2]
    (new LogSoftMaxDerivative same-diff i-v-1 i-v-2))
  (^LogSoftMaxDerivative [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray z]
    (new LogSoftMaxDerivative x z))
  (^LogSoftMaxDerivative [^org.nd4j.linalg.api.ndarray.INDArray x]
    (new LogSoftMaxDerivative x))
  (^LogSoftMaxDerivative []
    (new LogSoftMaxDerivative )))

(defn op-num
  "An op number

  returns: `int`"
  (^Integer [^LogSoftMaxDerivative this]
    (-> this (.opNum))))

(defn op-name
  "The opName of this operation

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^LogSoftMaxDerivative this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^LogSoftMaxDerivative this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^LogSoftMaxDerivative this]
    (-> this (.tensorflowName))))

(defn exec
  "Description copied from interface: Op

  dimensions - the dimensions to execute on - `int`"
  ([^LogSoftMaxDerivative this ^Integer dimensions]
    (-> this (.exec dimensions)))
  ([^LogSoftMaxDerivative this]
    (-> this (.exec))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  i-v - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^LogSoftMaxDerivative this ^java.util.List i-v]
    (-> this (.doDiff i-v))))

