(ns org.nd4j.linalg.api.ops.impl.accum.All
  "Boolean AND accumulation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.accum All]))

(defn ->all
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  i-v - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - `int[]`"
  (^All [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v dimensions]
    (new All same-diff i-v dimensions))
  (^All [^org.nd4j.linalg.api.ndarray.INDArray x]
    (new All x))
  (^All []
    (new All )))

(defn get-op-type
  "returns: `org.nd4j.linalg.api.ops.Op$Type`"
  (^org.nd4j.linalg.api.ops.Op$Type [^All this]
    (-> this (.getOpType))))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^All this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^All this]
    (-> this (.opName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^All this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^All this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^All this]
    (-> this (.tensorflowName))))

