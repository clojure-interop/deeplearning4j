(ns org.nd4j.linalg.api.ops.impl.transforms.SoftMaxDerivative
  "Softmax derivative"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms SoftMaxDerivative]))

(defn ->soft-max-derivative
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  i-v-1 - `org.nd4j.autodiff.samediff.SDVariable`
  i-v-2 - `org.nd4j.autodiff.samediff.SDVariable`
  in-place - `boolean`"
  (^SoftMaxDerivative [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v-1 ^org.nd4j.autodiff.samediff.SDVariable i-v-2 ^Boolean in-place]
    (new SoftMaxDerivative same-diff i-v-1 i-v-2 in-place))
  (^SoftMaxDerivative [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v-1 ^org.nd4j.autodiff.samediff.SDVariable i-v-2]
    (new SoftMaxDerivative same-diff i-v-1 i-v-2))
  (^SoftMaxDerivative [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray z]
    (new SoftMaxDerivative x z))
  (^SoftMaxDerivative [^org.nd4j.linalg.api.ndarray.INDArray x]
    (new SoftMaxDerivative x))
  (^SoftMaxDerivative []
    (new SoftMaxDerivative )))

(defn exec-special?
  "Description copied from interface: Op

  returns: true if the executioner needs to do a special
  call or not false otherwise - `boolean`"
  (^Boolean [^SoftMaxDerivative this]
    (-> this (.isExecSpecial))))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^SoftMaxDerivative this]
    (-> this (.opNum))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^SoftMaxDerivative this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^SoftMaxDerivative this]
    (-> this (.tensorflowName))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^SoftMaxDerivative this]
    (-> this (.opName))))

(defn exec
  "Description copied from interface: Op

  dimensions - the dimensions to execute on - `int`"
  ([^SoftMaxDerivative this ^Integer dimensions]
    (-> this (.exec dimensions))))

