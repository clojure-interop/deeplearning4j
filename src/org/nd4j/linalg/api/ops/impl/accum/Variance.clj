(ns org.nd4j.linalg.api.ops.impl.accum.Variance
  "Variance with bias correction.
 Bias can either be divided by n or adjusted with:
 (currentResult - (pow(bias, 2.0) / n())) / (n() - 1.0);"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.accum Variance]))

(defn ->variance
  "Constructor.

  x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`
  z - `org.nd4j.linalg.api.ndarray.INDArray`
  new-format - `boolean`
  keep-dims - `boolean`
  dimensions - `int[]`"
  (^Variance [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Boolean new-format ^Boolean keep-dims dimensions]
    (new Variance x y z new-format keep-dims dimensions))
  (^Variance [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v ^Boolean bias-corrected ^Boolean keep-dims dimensions]
    (new Variance same-diff i-v bias-corrected keep-dims dimensions))
  (^Variance [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Long n]
    (new Variance x y z n))
  (^Variance [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^Long n]
    (new Variance x y n))
  (^Variance [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (new Variance x y))
  (^Variance [^Boolean bias-corrected]
    (new Variance bias-corrected))
  (^Variance []
    (new Variance )))

(defn get-op-type
  "returns: `org.nd4j.linalg.api.ops.Op$Type`"
  (^org.nd4j.linalg.api.ops.Op$Type [^Variance this]
    (-> this (.getOpType))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^Variance this]
    (-> this (.opName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  grad - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^Variance this ^java.util.List grad]
    (-> this (.doDiff grad))))

(defn set-bias-corrected
  "bias-corrected - `boolean`"
  ([^Variance this ^Boolean bias-corrected]
    (-> this (.setBiasCorrected bias-corrected))))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^Variance this]
    (-> this (.opNum))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Variance this]
    (-> this (.tensorflowName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Variance this]
    (-> this (.onnxName))))

(defn pass-through?
  "Description copied from interface: Op

  returns: true if the op is pass through false otherwise - `boolean`"
  (^Boolean [^Variance this]
    (-> this (.isPassThrough))))

(defn no-op
  "Description copied from interface: Accumulation

  returns: the no op version of the input - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Variance this]
    (-> this (.noOp))))

(defn bias-corrected?
  "returns: `boolean`"
  (^Boolean [^Variance this]
    (-> this (.isBiasCorrected))))

(defn init
  "Description copied from interface: Op

  x - the input - `org.nd4j.linalg.api.ndarray.INDArray`
  y - the pairwise transform ndarray - `org.nd4j.linalg.api.ndarray.INDArray`
  z - the resulting ndarray - `org.nd4j.linalg.api.ndarray.INDArray`
  n - the number of elements - `long`"
  ([^Variance this ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Long n]
    (-> this (.init x y z n))))

