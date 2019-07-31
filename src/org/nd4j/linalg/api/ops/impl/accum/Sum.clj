(ns org.nd4j.linalg.api.ops.impl.accum.Sum
  "Sum the components"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.accum Sum]))

(defn ->sum
  "Constructor.

  x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`
  z - `org.nd4j.linalg.api.ndarray.INDArray`
  new-format - `boolean`
  keep-dims - `boolean`
  dimensions - `int[]`"
  (^Sum [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Boolean new-format ^Boolean keep-dims dimensions]
    (new Sum x y z new-format keep-dims dimensions))
  (^Sum [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v ^Boolean keep-dims dimensions]
    (new Sum same-diff i-v keep-dims dimensions))
  (^Sum [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^Long n]
    (new Sum x y n))
  (^Sum [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (new Sum x y))
  (^Sum [^org.nd4j.linalg.api.ndarray.INDArray x]
    (new Sum x))
  (^Sum []
    (new Sum )))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^Sum this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^Sum this]
    (-> this (.opName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  i-v-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^Sum this ^java.util.List i-v-1]
    (-> this (.doDiff i-v-1))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Sum this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Sum this]
    (-> this (.tensorflowName))))

(defn get-op-type
  "returns: `org.nd4j.linalg.api.ops.Op$Type`"
  (^org.nd4j.linalg.api.ops.Op$Type [^Sum this]
    (-> this (.getOpType))))

