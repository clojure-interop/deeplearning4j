(ns org.nd4j.linalg.api.ops.impl.transforms.gradient.GradientBackwardsMarker
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms.gradient GradientBackwardsMarker]))

(defn ->gradient-backwards-marker
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  i-v-1 - `org.nd4j.autodiff.samediff.SDVariable`
  i-v-2 - `org.nd4j.autodiff.samediff.SDVariable`
  in-place - `boolean`"
  (^GradientBackwardsMarker [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v-1 ^org.nd4j.autodiff.samediff.SDVariable i-v-2 ^Boolean in-place]
    (new GradientBackwardsMarker same-diff i-v-1 i-v-2 in-place))
  (^GradientBackwardsMarker [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v-1 ^org.nd4j.autodiff.samediff.SDVariable i-v-2]
    (new GradientBackwardsMarker same-diff i-v-1 i-v-2))
  (^GradientBackwardsMarker [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray z]
    (new GradientBackwardsMarker x z))
  (^GradientBackwardsMarker [^org.nd4j.linalg.api.ndarray.INDArray x]
    (new GradientBackwardsMarker x))
  (^GradientBackwardsMarker []
    (new GradientBackwardsMarker )))

(def *-op-name
  "Static Constant.

  type: java.lang.String"
  GradientBackwardsMarker/OP_NAME)

(defn op-num
  "An op number

  returns: `int`"
  (^Integer [^GradientBackwardsMarker this]
    (-> this (.opNum))))

(defn op-name
  "The opName of this operation

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^GradientBackwardsMarker this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^GradientBackwardsMarker this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^GradientBackwardsMarker this]
    (-> this (.tensorflowName))))

(defn exec
  "Description copied from interface: Op

  dimensions - the dimensions to execute on - `int`"
  ([^GradientBackwardsMarker this ^Integer dimensions]
    (-> this (.exec dimensions)))
  ([^GradientBackwardsMarker this]
    (-> this (.exec))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  i-v - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^GradientBackwardsMarker this ^java.util.List i-v]
    (-> this (.doDiff i-v))))

