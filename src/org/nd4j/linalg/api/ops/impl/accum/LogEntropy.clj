(ns org.nd4j.linalg.api.ops.impl.accum.LogEntropy
  "Log Entropy Op - returns the log entropy (information gain, or uncertainty of a random variable).
 log(-sum( x * log(x)))"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.accum LogEntropy]))

(defn ->log-entropy
  "Constructor.

  x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`
  z - `org.nd4j.linalg.api.ndarray.INDArray`
  n - `long`"
  (^LogEntropy [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Long n]
    (new LogEntropy x y z n))
  (^LogEntropy [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v dimensions]
    (new LogEntropy same-diff i-v dimensions))
  (^LogEntropy [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (new LogEntropy x y))
  (^LogEntropy [^org.nd4j.linalg.api.ndarray.INDArray x]
    (new LogEntropy x))
  (^LogEntropy []
    (new LogEntropy )))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^LogEntropy this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^LogEntropy this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^LogEntropy this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^LogEntropy this]
    (-> this (.tensorflowName))))

(defn get-op-type
  "returns: `org.nd4j.linalg.api.ops.Op$Type`"
  (^org.nd4j.linalg.api.ops.Op$Type [^LogEntropy this]
    (-> this (.getOpType))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^LogEntropy this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

