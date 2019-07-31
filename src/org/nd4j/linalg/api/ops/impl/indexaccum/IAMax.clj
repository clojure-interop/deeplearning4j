(ns org.nd4j.linalg.api.ops.impl.indexaccum.IAMax
  "Calculate the index of the max absolute value over a vector"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.indexaccum IAMax]))

(defn ->ia-max
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  i-v - `org.nd4j.autodiff.samediff.SDVariable`
  keep-dims - `boolean`
  dimensions - `int[]`"
  (^IAMax [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v ^Boolean keep-dims dimensions]
    (new IAMax same-diff i-v keep-dims dimensions))
  (^IAMax [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^Long n]
    (new IAMax x y n))
  (^IAMax [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (new IAMax x y))
  (^IAMax [^org.nd4j.linalg.api.ndarray.INDArray x]
    (new IAMax x))
  (^IAMax []
    (new IAMax )))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^IAMax this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^IAMax this]
    (-> this (.opName))))

(defn zero-double
  "Description copied from interface: IndexAccumulation

  returns: the initial value - `double`"
  (^Double [^IAMax this]
    (-> this (.zeroDouble))))

(defn zero-float
  "Description copied from interface: IndexAccumulation

  returns: the initial value - `float`"
  (^Float [^IAMax this]
    (-> this (.zeroFloat))))

(defn zero-half
  "Description copied from interface: IndexAccumulation

  returns: the initial value - `float`"
  (^Float [^IAMax this]
    (-> this (.zeroHalf))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^IAMax this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^IAMax this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  grad - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^IAMax this ^java.util.List grad]
    (-> this (.doDiff grad))))

