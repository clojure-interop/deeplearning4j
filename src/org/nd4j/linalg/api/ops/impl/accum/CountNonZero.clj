(ns org.nd4j.linalg.api.ops.impl.accum.CountNonZero
  "Count the number of non-zero elements"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.accum CountNonZero]))

(defn ->count-non-zero
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  input - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - `int`"
  (^CountNonZero [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable input ^Integer dimensions]
    (new CountNonZero same-diff input dimensions))
  (^CountNonZero [^org.nd4j.linalg.api.ndarray.INDArray x]
    (new CountNonZero x)))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^CountNonZero this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^CountNonZero this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^CountNonZero this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^CountNonZero this]
    (-> this (.tensorflowName))))

(defn get-op-type
  "returns: `org.nd4j.linalg.api.ops.Op$Type`"
  (^org.nd4j.linalg.api.ops.Op$Type [^CountNonZero this]
    (-> this (.getOpType))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^CountNonZero this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

