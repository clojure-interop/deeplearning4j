(ns org.nd4j.linalg.api.ops.impl.transforms.gradient.Relu6Derivative
  "Derivative of Rectified linear unit 6, i.e. min(max(input, cutoff), 6), where cutoff can be chosen."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms.gradient Relu6Derivative]))

(defn ->relu-6-derivative
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  i-v-1 - `org.nd4j.autodiff.samediff.SDVariable`
  i-v-2 - `org.nd4j.autodiff.samediff.SDVariable`
  cutoff - `double`"
  (^Relu6Derivative [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v-1 ^org.nd4j.autodiff.samediff.SDVariable i-v-2 ^Double cutoff]
    (new Relu6Derivative same-diff i-v-1 i-v-2 cutoff))
  (^Relu6Derivative []
    (new Relu6Derivative )))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^Relu6Derivative this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^Relu6Derivative this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Relu6Derivative this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Relu6Derivative this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  i-v - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^Relu6Derivative this ^java.util.List i-v]
    (-> this (.doDiff i-v))))

