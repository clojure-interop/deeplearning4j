(ns org.nd4j.linalg.api.ops.impl.accum.Dot
  "Dot product"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.accum Dot]))

(defn ->dot
  "Constructor.

  x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`
  z - `org.nd4j.linalg.api.ndarray.INDArray`
  new-format - `boolean`
  keep-dims - `boolean`
  dimensions - `int`"
  (^Dot [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Boolean new-format ^Boolean keep-dims ^Integer dimensions]
    (new Dot x y z new-format keep-dims dimensions))
  (^Dot [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v ^org.nd4j.autodiff.samediff.SDVariable i-v-2 ^Integer dimensions]
    (new Dot same-diff i-v i-v-2 dimensions))
  (^Dot [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^Long n]
    (new Dot x y n))
  (^Dot [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (new Dot x y))
  (^Dot [^org.nd4j.linalg.api.ndarray.INDArray x]
    (new Dot x))
  (^Dot []
    (new Dot )))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^Dot this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^Dot this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Dot this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Dot this]
    (-> this (.tensorflowName))))

(defn get-op-type
  "returns: `org.nd4j.linalg.api.ops.Op$Type`"
  (^org.nd4j.linalg.api.ops.Op$Type [^Dot this]
    (-> this (.getOpType))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^Dot this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

