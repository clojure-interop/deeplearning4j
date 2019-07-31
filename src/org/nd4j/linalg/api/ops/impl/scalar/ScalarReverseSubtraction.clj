(ns org.nd4j.linalg.api.ops.impl.scalar.ScalarReverseSubtraction
  "Scalar reverse subtraction"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.scalar ScalarReverseSubtraction]))

(defn ->scalar-reverse-subtraction
  "Constructor.

  x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`
  z - `org.nd4j.linalg.api.ndarray.INDArray`
  n - `long`
  num - `java.lang.Number`"
  (^ScalarReverseSubtraction [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Long n ^java.lang.Number num]
    (new ScalarReverseSubtraction x y z n num))
  (^ScalarReverseSubtraction [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v ^java.lang.Number scalar ^Boolean in-place]
    (new ScalarReverseSubtraction same-diff i-v scalar in-place))
  (^ScalarReverseSubtraction [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v ^java.lang.Number scalar]
    (new ScalarReverseSubtraction same-diff i-v scalar))
  (^ScalarReverseSubtraction [^org.nd4j.linalg.api.ndarray.INDArray x ^java.lang.Number num]
    (new ScalarReverseSubtraction x num))
  (^ScalarReverseSubtraction []
    (new ScalarReverseSubtraction )))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^ScalarReverseSubtraction this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^ScalarReverseSubtraction this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^ScalarReverseSubtraction this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^ScalarReverseSubtraction this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  i-v-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^ScalarReverseSubtraction this ^java.util.List i-v-1]
    (-> this (.doDiff i-v-1))))

