(ns org.nd4j.linalg.api.ops.impl.accum.distances.EuclideanDistance
  "Euclidean distance"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.accum.distances EuclideanDistance]))

(defn ->euclidean-distance
  "Constructor.

  x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`
  z - `org.nd4j.linalg.api.ndarray.INDArray`
  new-format - `boolean`
  keep-dims - `boolean`
  dimensions - `int`"
  (^EuclideanDistance [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Boolean new-format ^Boolean keep-dims ^Integer dimensions]
    (new EuclideanDistance x y z new-format keep-dims dimensions))
  (^EuclideanDistance [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v ^org.nd4j.autodiff.samediff.SDVariable i-v-2 dimensions]
    (new EuclideanDistance same-diff i-v i-v-2 dimensions))
  (^EuclideanDistance [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v dimensions]
    (new EuclideanDistance same-diff i-v dimensions))
  (^EuclideanDistance [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (new EuclideanDistance x y))
  (^EuclideanDistance [^org.nd4j.linalg.api.ndarray.INDArray x]
    (new EuclideanDistance x))
  (^EuclideanDistance []
    (new EuclideanDistance )))

(def *-op-name
  "Static Constant.

  type: java.lang.String"
  EuclideanDistance/OP_NAME)

(defn op-type
  "Description copied from class: DifferentialFunction

  returns: `org.nd4j.linalg.api.ops.Op$Type`"
  (^org.nd4j.linalg.api.ops.Op$Type [^EuclideanDistance this]
    (-> this (.opType))))

(defn get-op-type
  "returns: `org.nd4j.linalg.api.ops.Op$Type`"
  (^org.nd4j.linalg.api.ops.Op$Type [^EuclideanDistance this]
    (-> this (.getOpType))))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^EuclideanDistance this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^EuclideanDistance this]
    (-> this (.opName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  i-v-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^EuclideanDistance this ^java.util.List i-v-1]
    (-> this (.doDiff i-v-1))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^EuclideanDistance this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^EuclideanDistance this]
    (-> this (.tensorflowName))))

