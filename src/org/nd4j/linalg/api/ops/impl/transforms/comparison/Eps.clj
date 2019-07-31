(ns org.nd4j.linalg.api.ops.impl.transforms.comparison.Eps
  "Bit mask over the ndarrays as to whether
 the components are equal or not"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms.comparison Eps]))

(defn ->eps
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  i-v - `org.nd4j.autodiff.samediff.SDVariable`
  shape - `int[]`
  in-place - `boolean`
  extra-args - `java.lang.Object[]`"
  (^Eps [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v shape ^Boolean in-place extra-args]
    (new Eps same-diff i-v shape in-place extra-args))
  (^Eps [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v-1 ^org.nd4j.autodiff.samediff.SDVariable i-v-2 ^Boolean in-place]
    (new Eps same-diff i-v-1 i-v-2 in-place))
  (^Eps [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v-1 ^org.nd4j.autodiff.samediff.SDVariable i-v-2]
    (new Eps same-diff i-v-1 i-v-2))
  (^Eps [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray z]
    (new Eps x z))
  (^Eps [^org.nd4j.autodiff.samediff.SameDiff same-diff]
    (new Eps same-diff))
  (^Eps []
    (new Eps )))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^Eps this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^Eps this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Eps this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Eps this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^Eps this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

