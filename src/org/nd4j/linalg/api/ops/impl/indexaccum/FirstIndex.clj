(ns org.nd4j.linalg.api.ops.impl.indexaccum.FirstIndex
  "Calculate the index
 of max value over a vector"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.indexaccum FirstIndex]))

(defn ->first-index
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  i-v - `org.nd4j.autodiff.samediff.SDVariable`
  condition - `org.nd4j.linalg.indexing.conditions.Condition`
  keep-dims - `boolean`
  dimensions - `int`"
  (^FirstIndex [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v ^org.nd4j.linalg.indexing.conditions.Condition condition ^Boolean keep-dims ^Integer dimensions]
    (new FirstIndex same-diff i-v condition keep-dims dimensions))
  (^FirstIndex [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.indexing.conditions.Condition condition ^Double eps]
    (new FirstIndex x condition eps))
  (^FirstIndex [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.indexing.conditions.Condition condition]
    (new FirstIndex x condition))
  (^FirstIndex []
    (new FirstIndex )))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^FirstIndex this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^FirstIndex this]
    (-> this (.opName))))

(defn zero-float
  "Description copied from interface: IndexAccumulation

  returns: the initial value - `float`"
  (^Float [^FirstIndex this]
    (-> this (.zeroFloat))))

(defn zero-half
  "Description copied from interface: IndexAccumulation

  returns: the initial value - `float`"
  (^Float [^FirstIndex this]
    (-> this (.zeroHalf))))

(defn zero-double
  "Description copied from interface: IndexAccumulation

  returns: the initial value - `double`"
  (^Double [^FirstIndex this]
    (-> this (.zeroDouble))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^FirstIndex this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^FirstIndex this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^FirstIndex this]
    (-> this (.tensorflowName))))

