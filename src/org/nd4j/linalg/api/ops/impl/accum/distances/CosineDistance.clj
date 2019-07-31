(ns org.nd4j.linalg.api.ops.impl.accum.distances.CosineDistance
  "Cosine distance
 Note that you need to initialize
 a scaling constant equal to the norm2 of the
 vector"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.accum.distances CosineDistance]))

(defn ->cosine-distance
  "Constructor.

  x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`
  z - `org.nd4j.linalg.api.ndarray.INDArray`
  new-format - `boolean`
  keep-dims - `boolean`
  dimensions - `int`"
  (^CosineDistance [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Boolean new-format ^Boolean keep-dims ^Integer dimensions]
    (new CosineDistance x y z new-format keep-dims dimensions))
  (^CosineDistance [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v dimensions ^java.lang.Number constant-normalized-by-norm-2-x ^java.lang.Number constant-normalized-by-norm-2-y]
    (new CosineDistance same-diff i-v dimensions constant-normalized-by-norm-2-x constant-normalized-by-norm-2-y))
  (^CosineDistance [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v ^org.nd4j.autodiff.samediff.SDVariable i-v-2 ^Integer dimensions]
    (new CosineDistance same-diff i-v i-v-2 dimensions))
  (^CosineDistance [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^Long n]
    (new CosineDistance x y n))
  (^CosineDistance [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (new CosineDistance x y))
  (^CosineDistance [^org.nd4j.linalg.api.ndarray.INDArray x]
    (new CosineDistance x))
  (^CosineDistance []
    (new CosineDistance )))

(defn op-type
  "Description copied from class: DifferentialFunction

  returns: `org.nd4j.linalg.api.ops.Op$Type`"
  (^org.nd4j.linalg.api.ops.Op$Type [^CosineDistance this]
    (-> this (.opType))))

(defn get-op-type
  "returns: `org.nd4j.linalg.api.ops.Op$Type`"
  (^org.nd4j.linalg.api.ops.Op$Type [^CosineDistance this]
    (-> this (.getOpType))))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^CosineDistance this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^CosineDistance this]
    (-> this (.opName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  i-v-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^CosineDistance this ^java.util.List i-v-1]
    (-> this (.doDiff i-v-1))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^CosineDistance this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^CosineDistance this]
    (-> this (.tensorflowName))))

