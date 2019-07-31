(ns org.nd4j.linalg.api.ops.impl.accum.AMin
  "Calculate the absolute minimum over a vector"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.accum AMin]))

(defn ->a-min
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  i-v - `org.nd4j.autodiff.samediff.SDVariable`
  i-v-2 - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - `int[]`"
  (^AMin [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v ^org.nd4j.autodiff.samediff.SDVariable i-v-2 dimensions]
    (new AMin same-diff i-v i-v-2 dimensions))
  (^AMin [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v dimensions]
    (new AMin same-diff i-v dimensions))
  (^AMin [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (new AMin x y))
  (^AMin [^org.nd4j.linalg.api.ndarray.INDArray x]
    (new AMin x))
  (^AMin []
    (new AMin )))

(defn zero-double
  "Description copied from interface: Accumulation

  returns: the initial value - `double`"
  (^Double [^AMin this]
    (-> this (.zeroDouble))))

(defn get-final-result
  "Description copied from interface: Accumulation

  returns: `java.lang.Number`"
  (^java.lang.Number [^AMin this]
    (-> this (.getFinalResult))))

(defn get-op-type
  "returns: `org.nd4j.linalg.api.ops.Op$Type`"
  (^org.nd4j.linalg.api.ops.Op$Type [^AMin this]
    (-> this (.getOpType))))

(defn op-type
  "Description copied from class: DifferentialFunction

  returns: `org.nd4j.linalg.api.ops.Op$Type`"
  (^org.nd4j.linalg.api.ops.Op$Type [^AMin this]
    (-> this (.opType))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^AMin this]
    (-> this (.opName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^AMin this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^AMin this]
    (-> this (.opNum))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^AMin this]
    (-> this (.tensorflowName))))

(defn zero-float
  "Description copied from interface: Accumulation

  returns: `float`"
  (^Float [^AMin this]
    (-> this (.zeroFloat))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^AMin this]
    (-> this (.onnxName))))

(defn zero-half
  "Description copied from interface: Accumulation

  returns: `float`"
  (^Float [^AMin this]
    (-> this (.zeroHalf))))

