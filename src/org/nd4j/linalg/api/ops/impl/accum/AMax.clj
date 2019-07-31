(ns org.nd4j.linalg.api.ops.impl.accum.AMax
  "Calculate the absolute max over a vector"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.accum AMax]))

(defn ->a-max
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  i-v - `org.nd4j.autodiff.samediff.SDVariable`
  i-v-2 - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - `int[]`"
  (^AMax [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v ^org.nd4j.autodiff.samediff.SDVariable i-v-2 dimensions]
    (new AMax same-diff i-v i-v-2 dimensions))
  (^AMax [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v dimensions]
    (new AMax same-diff i-v dimensions))
  (^AMax [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (new AMax x y))
  (^AMax [^org.nd4j.linalg.api.ndarray.INDArray x]
    (new AMax x))
  (^AMax []
    (new AMax )))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^AMax this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^AMax this]
    (-> this (.opName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^AMax this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^AMax this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^AMax this]
    (-> this (.tensorflowName))))

(defn get-op-type
  "returns: `org.nd4j.linalg.api.ops.Op$Type`"
  (^org.nd4j.linalg.api.ops.Op$Type [^AMax this]
    (-> this (.getOpType))))

