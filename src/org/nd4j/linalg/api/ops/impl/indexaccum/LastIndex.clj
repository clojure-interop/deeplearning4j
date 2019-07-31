(ns org.nd4j.linalg.api.ops.impl.indexaccum.LastIndex
  "Calculate the index
 of max value over a vector"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.indexaccum LastIndex]))

(defn ->last-index
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  i-v - `org.nd4j.autodiff.samediff.SDVariable`
  condition - `org.nd4j.linalg.indexing.conditions.Condition`
  keep-dims - `boolean`
  dimensions - `int`"
  (^LastIndex [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v ^org.nd4j.linalg.indexing.conditions.Condition condition ^Boolean keep-dims ^Integer dimensions]
    (new LastIndex same-diff i-v condition keep-dims dimensions))
  (^LastIndex [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.indexing.conditions.Condition condition ^Double eps]
    (new LastIndex x condition eps))
  (^LastIndex [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.indexing.conditions.Condition condition]
    (new LastIndex x condition))
  (^LastIndex []
    (new LastIndex )))

(defn properties-for-function
  "Description copied from class: DifferentialFunction

  returns: `java.util.Map<java.lang.String,java.lang.Object>`"
  (^java.util.Map [^LastIndex this]
    (-> this (.propertiesForFunction))))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^LastIndex this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^LastIndex this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^LastIndex this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^LastIndex this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^LastIndex this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

(defn zero-half
  "Description copied from interface: IndexAccumulation

  returns: the initial value - `float`"
  (^Float [^LastIndex this]
    (-> this (.zeroHalf))))

