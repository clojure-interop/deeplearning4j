(ns org.nd4j.linalg.api.ops.impl.indexaccum.IMin
  "Calculate the index of min value over a vector"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.indexaccum IMin]))

(defn ->i-min
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  i-v - `org.nd4j.autodiff.samediff.SDVariable`
  keep-dims - `boolean`
  dimensions - `int[]`"
  (^IMin [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v ^Boolean keep-dims dimensions]
    (new IMin same-diff i-v keep-dims dimensions))
  (^IMin [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^Long n]
    (new IMin x y n))
  (^IMin [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (new IMin x y))
  (^IMin [^org.nd4j.linalg.api.ndarray.INDArray x]
    (new IMin x))
  (^IMin []
    (new IMin )))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^IMin this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^IMin this]
    (-> this (.opName))))

(defn zero-float
  "Description copied from interface: IndexAccumulation

  returns: the initial value - `float`"
  (^Float [^IMin this]
    (-> this (.zeroFloat))))

(defn zero-double
  "Description copied from interface: IndexAccumulation

  returns: the initial value - `double`"
  (^Double [^IMin this]
    (-> this (.zeroDouble))))

(defn zero-half
  "Description copied from interface: IndexAccumulation

  returns: the initial value - `float`"
  (^Float [^IMin this]
    (-> this (.zeroHalf))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^IMin this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^IMin this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^IMin this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

