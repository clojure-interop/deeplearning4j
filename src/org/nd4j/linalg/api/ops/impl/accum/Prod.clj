(ns org.nd4j.linalg.api.ops.impl.accum.Prod
  "Prod the components"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.accum Prod]))

(defn ->prod
  "Constructor.

  x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`
  z - `org.nd4j.linalg.api.ndarray.INDArray`
  new-format - `boolean`
  keep-dims - `boolean`
  dimensions - `int[]`"
  (^Prod [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Boolean new-format ^Boolean keep-dims dimensions]
    (new Prod x y z new-format keep-dims dimensions))
  (^Prod [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v ^Boolean keep-dims dimensions]
    (new Prod same-diff i-v keep-dims dimensions))
  (^Prod [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^Long n]
    (new Prod x y n))
  (^Prod [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (new Prod x y))
  (^Prod [^org.nd4j.linalg.api.ndarray.INDArray x]
    (new Prod x))
  (^Prod []
    (new Prod )))

(defn zero-double
  "Description copied from interface: Accumulation

  returns: the initial value - `double`"
  (^Double [^Prod this]
    (-> this (.zeroDouble))))

(defn get-op-type
  "returns: `org.nd4j.linalg.api.ops.Op$Type`"
  (^org.nd4j.linalg.api.ops.Op$Type [^Prod this]
    (-> this (.getOpType))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^Prod this]
    (-> this (.opName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  grad - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^Prod this ^java.util.List grad]
    (-> this (.doDiff grad))))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^Prod this]
    (-> this (.opNum))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Prod this]
    (-> this (.tensorflowName))))

(defn zero-float
  "Description copied from interface: Accumulation

  returns: `float`"
  (^Float [^Prod this]
    (-> this (.zeroFloat))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Prod this]
    (-> this (.onnxName))))

(defn zero-half
  "Description copied from interface: Accumulation

  returns: `float`"
  (^Float [^Prod this]
    (-> this (.zeroHalf))))

