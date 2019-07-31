(ns org.nd4j.linalg.api.ops.impl.accum.Norm1
  "Sum of absolute values"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.accum Norm1]))

(defn ->norm-1
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  i-v - `org.nd4j.autodiff.samediff.SDVariable`
  keep-dims - `boolean`
  dimensions - `int[]`"
  (^Norm1 [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v ^Boolean keep-dims dimensions]
    (new Norm1 same-diff i-v keep-dims dimensions))
  (^Norm1 [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^Long n]
    (new Norm1 x y n))
  (^Norm1 [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (new Norm1 x y))
  (^Norm1 [^org.nd4j.linalg.api.ndarray.INDArray x]
    (new Norm1 x))
  (^Norm1 []
    (new Norm1 )))

(defn no-op
  "Description copied from interface: Accumulation

  returns: the no op version of the input - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Norm1 this]
    (-> this (.noOp))))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^Norm1 this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^Norm1 this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Norm1 this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Norm1 this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  grad - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^Norm1 this ^java.util.List grad]
    (-> this (.doDiff grad))))

(defn get-op-type
  "returns: `org.nd4j.linalg.api.ops.Op$Type`"
  (^org.nd4j.linalg.api.ops.Op$Type [^Norm1 this]
    (-> this (.getOpType))))

