(ns org.nd4j.linalg.api.ops.impl.accum.Min
  "Calculate the min over an array"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.accum Min]))

(defn ->min
  "Constructor.

  x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`
  z - `org.nd4j.linalg.api.ndarray.INDArray`
  new-format - `boolean`
  keep-dims - `boolean`
  dimensions - `int[]`"
  (^Min [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Boolean new-format ^Boolean keep-dims dimensions]
    (new Min x y z new-format keep-dims dimensions))
  (^Min [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v ^Boolean keep-dims dimensions]
    (new Min same-diff i-v keep-dims dimensions))
  (^Min [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^Long n]
    (new Min x y n))
  (^Min [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (new Min x y))
  (^Min [^org.nd4j.linalg.api.ndarray.INDArray x]
    (new Min x))
  (^Min []
    (new Min )))

(defn zero-double
  "Description copied from interface: Accumulation

  returns: the initial value - `double`"
  (^Double [^Min this]
    (-> this (.zeroDouble))))

(defn get-op-type
  "returns: `org.nd4j.linalg.api.ops.Op$Type`"
  (^org.nd4j.linalg.api.ops.Op$Type [^Min this]
    (-> this (.getOpType))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^Min this]
    (-> this (.opName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  grad - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^Min this ^java.util.List grad]
    (-> this (.doDiff grad))))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^Min this]
    (-> this (.opNum))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Min this]
    (-> this (.tensorflowName))))

(defn zero-float
  "Description copied from interface: Accumulation

  returns: `float`"
  (^Float [^Min this]
    (-> this (.zeroFloat))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Min this]
    (-> this (.onnxName))))

(defn zero-half
  "Description copied from interface: Accumulation

  returns: `float`"
  (^Float [^Min this]
    (-> this (.zeroHalf))))

