(ns org.nd4j.linalg.api.ops.impl.indexaccum.IMax
  "Calculate the index
 of max value over a vector"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.indexaccum IMax]))

(defn ->i-max
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  i-v - `org.nd4j.autodiff.samediff.SDVariable`
  keep-dims - `boolean`
  dimensions - `int[]`"
  (^IMax [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v ^Boolean keep-dims dimensions]
    (new IMax same-diff i-v keep-dims dimensions))
  (^IMax [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^Long n]
    (new IMax x y n))
  (^IMax [^org.nd4j.linalg.api.ndarray.INDArray x]
    (new IMax x))
  (^IMax []
    (new IMax )))

(defn zero-double
  "Description copied from interface: IndexAccumulation

  returns: the initial value - `double`"
  (^Double [^IMax this]
    (-> this (.zeroDouble))))

(defn op-type
  "Description copied from class: DifferentialFunction

  returns: `org.nd4j.linalg.api.ops.Op$Type`"
  (^org.nd4j.linalg.api.ops.Op$Type [^IMax this]
    (-> this (.opType))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^IMax this]
    (-> this (.opName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^IMax this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^IMax this]
    (-> this (.opNum))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^IMax this]
    (-> this (.tensorflowName))))

(defn zero-float
  "Description copied from interface: IndexAccumulation

  returns: the initial value - `float`"
  (^Float [^IMax this]
    (-> this (.zeroFloat))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^IMax this]
    (-> this (.onnxName))))

(defn zero-half
  "Description copied from interface: IndexAccumulation

  returns: the initial value - `float`"
  (^Float [^IMax this]
    (-> this (.zeroHalf))))

