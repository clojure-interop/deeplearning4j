(ns org.nd4j.linalg.api.ops.impl.indexaccum.IAMin
  "Calculate the index of the max absolute value over a vector"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.indexaccum IAMin]))

(defn ->ia-min
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  i-v - `org.nd4j.autodiff.samediff.SDVariable`
  keep-dims - `boolean`
  dimensions - `int[]`"
  (^IAMin [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v ^Boolean keep-dims dimensions]
    (new IAMin same-diff i-v keep-dims dimensions))
  (^IAMin [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^Long n]
    (new IAMin x y n))
  (^IAMin [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (new IAMin x y))
  (^IAMin [^org.nd4j.linalg.api.ndarray.INDArray x]
    (new IAMin x))
  (^IAMin []
    (new IAMin )))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^IAMin this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^IAMin this]
    (-> this (.opName))))

(defn zero-double
  "Description copied from interface: IndexAccumulation

  returns: the initial value - `double`"
  (^Double [^IAMin this]
    (-> this (.zeroDouble))))

(defn zero-float
  "Description copied from interface: IndexAccumulation

  returns: the initial value - `float`"
  (^Float [^IAMin this]
    (-> this (.zeroFloat))))

(defn zero-half
  "Description copied from interface: IndexAccumulation

  returns: the initial value - `float`"
  (^Float [^IAMin this]
    (-> this (.zeroHalf))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^IAMin this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^IAMin this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  grad - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^IAMin this ^java.util.List grad]
    (-> this (.doDiff grad))))

