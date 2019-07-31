(ns org.nd4j.linalg.api.ops.impl.accum.Entropy
  "Entropy Op - returns the entropy (information gain, or uncertainty of a random variable).
 -sum(x * log(x))"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.accum Entropy]))

(defn ->entropy
  "Constructor.

  x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`
  z - `org.nd4j.linalg.api.ndarray.INDArray`
  n - `long`"
  (^Entropy [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Long n]
    (new Entropy x y z n))
  (^Entropy [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v dimensions]
    (new Entropy same-diff i-v dimensions))
  (^Entropy [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (new Entropy x y))
  (^Entropy [^org.nd4j.linalg.api.ndarray.INDArray x]
    (new Entropy x))
  (^Entropy []
    (new Entropy )))

(defn *grad
  "f - `org.nd4j.autodiff.functions.DifferentialFunctionFactory`
  arg - `org.nd4j.autodiff.samediff.SDVariable`
  grad - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - `int[]`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^org.nd4j.autodiff.functions.DifferentialFunctionFactory f ^org.nd4j.autodiff.samediff.SDVariable arg ^org.nd4j.autodiff.samediff.SDVariable grad dimensions]
    (Entropy/grad f arg grad dimensions)))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^Entropy this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^Entropy this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Entropy this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Entropy this]
    (-> this (.tensorflowName))))

(defn get-op-type
  "returns: `org.nd4j.linalg.api.ops.Op$Type`"
  (^org.nd4j.linalg.api.ops.Op$Type [^Entropy this]
    (-> this (.getOpType))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^Entropy this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

