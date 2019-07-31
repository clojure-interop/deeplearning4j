(ns org.nd4j.linalg.api.ops.impl.accum.distances.JaccardDistance
  "Jaccard distance (dissimilarity)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.accum.distances JaccardDistance]))

(defn ->jaccard-distance
  "Constructor.

  x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`
  z - `org.nd4j.linalg.api.ndarray.INDArray`
  new-format - `boolean`
  keep-dims - `boolean`
  dimensions - `int`"
  (^JaccardDistance [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Boolean new-format ^Boolean keep-dims ^Integer dimensions]
    (new JaccardDistance x y z new-format keep-dims dimensions))
  (^JaccardDistance [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v ^org.nd4j.autodiff.samediff.SDVariable i-v-2 ^Integer dimensions]
    (new JaccardDistance same-diff i-v i-v-2 dimensions))
  (^JaccardDistance [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^Long n]
    (new JaccardDistance x y n))
  (^JaccardDistance [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (new JaccardDistance x y))
  (^JaccardDistance [^org.nd4j.linalg.api.ndarray.INDArray x]
    (new JaccardDistance x))
  (^JaccardDistance []
    (new JaccardDistance )))

(defn op-type
  "Description copied from class: DifferentialFunction

  returns: `org.nd4j.linalg.api.ops.Op$Type`"
  (^org.nd4j.linalg.api.ops.Op$Type [^JaccardDistance this]
    (-> this (.opType))))

(defn get-op-type
  "returns: `org.nd4j.linalg.api.ops.Op$Type`"
  (^org.nd4j.linalg.api.ops.Op$Type [^JaccardDistance this]
    (-> this (.getOpType))))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^JaccardDistance this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^JaccardDistance this]
    (-> this (.opName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^JaccardDistance this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^JaccardDistance this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^JaccardDistance this]
    (-> this (.tensorflowName))))

