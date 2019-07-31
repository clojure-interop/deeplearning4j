(ns org.nd4j.linalg.api.ops.impl.accum.Max
  "Calculate the max over an array"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.accum Max]))

(defn ->max
  "Constructor.

  Initialize with the given
  input, pairwise transform, result, and number
  of elements

  x - the input - `org.nd4j.linalg.api.ndarray.INDArray`
  y - the pairwise transform - `org.nd4j.linalg.api.ndarray.INDArray`
  z - the result - `org.nd4j.linalg.api.ndarray.INDArray`
  n - the number of elements - `long`"
  (^Max [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Long n]
    (new Max x y z n))
  (^Max [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Boolean new-format ^Boolean keep-dims dimensions]
    (new Max x y z new-format keep-dims dimensions))
  (^Max [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^Long n]
    (new Max x y n))
  (^Max [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (new Max x y))
  (^Max [^org.nd4j.linalg.api.ndarray.INDArray x]
    (new Max x))
  (^Max []
    (new Max )))

(defn zero-double
  "Description copied from interface: Accumulation

  returns: the initial value - `double`"
  (^Double [^Max this]
    (-> this (.zeroDouble))))

(defn get-op-type
  "returns: `org.nd4j.linalg.api.ops.Op$Type`"
  (^org.nd4j.linalg.api.ops.Op$Type [^Max this]
    (-> this (.getOpType))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^Max this]
    (-> this (.opName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  grad - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^Max this ^java.util.List grad]
    (-> this (.doDiff grad))))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^Max this]
    (-> this (.opNum))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Max this]
    (-> this (.tensorflowName))))

(defn zero-float
  "Description copied from interface: Accumulation

  returns: `float`"
  (^Float [^Max this]
    (-> this (.zeroFloat))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Max this]
    (-> this (.onnxName))))

(defn zero-half
  "Description copied from interface: Accumulation

  returns: `float`"
  (^Float [^Max this]
    (-> this (.zeroHalf))))

