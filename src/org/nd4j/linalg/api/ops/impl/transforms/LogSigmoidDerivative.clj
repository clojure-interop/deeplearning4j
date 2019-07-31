(ns org.nd4j.linalg.api.ops.impl.transforms.LogSigmoidDerivative
  "LogSigmoid derivative"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms LogSigmoidDerivative]))

(defn ->log-sigmoid-derivative
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  i-v-1 - `org.nd4j.autodiff.samediff.SDVariable`
  i-v-2 - `org.nd4j.autodiff.samediff.SDVariable`
  in-place - `boolean`"
  (^LogSigmoidDerivative [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v-1 ^org.nd4j.autodiff.samediff.SDVariable i-v-2 ^Boolean in-place]
    (new LogSigmoidDerivative same-diff i-v-1 i-v-2 in-place))
  (^LogSigmoidDerivative [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v-1 ^org.nd4j.autodiff.samediff.SDVariable i-v-2]
    (new LogSigmoidDerivative same-diff i-v-1 i-v-2))
  (^LogSigmoidDerivative [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray z]
    (new LogSigmoidDerivative x z))
  (^LogSigmoidDerivative [^org.nd4j.linalg.api.ndarray.INDArray x]
    (new LogSigmoidDerivative x))
  (^LogSigmoidDerivative []
    (new LogSigmoidDerivative )))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^LogSigmoidDerivative this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^LogSigmoidDerivative this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^LogSigmoidDerivative this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^LogSigmoidDerivative this]
    (-> this (.tensorflowName))))

(defn exec
  "Description copied from interface: Op"
  ([^LogSigmoidDerivative this]
    (-> this (.exec))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^LogSigmoidDerivative this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

