(ns org.nd4j.linalg.api.ops.impl.scalar.ScalarMultiplication
  "Scalar multiplication"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.scalar ScalarMultiplication]))

(defn ->scalar-multiplication
  "Constructor.

  x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`
  z - `org.nd4j.linalg.api.ndarray.INDArray`
  n - `long`
  num - `java.lang.Number`"
  (^ScalarMultiplication [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Long n ^java.lang.Number num]
    (new ScalarMultiplication x y z n num))
  (^ScalarMultiplication [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v ^java.lang.Number scalar ^Boolean in-place]
    (new ScalarMultiplication same-diff i-v scalar in-place))
  (^ScalarMultiplication [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v ^java.lang.Number scalar]
    (new ScalarMultiplication same-diff i-v scalar))
  (^ScalarMultiplication [^org.nd4j.linalg.api.ndarray.INDArray x ^java.lang.Number num]
    (new ScalarMultiplication x num))
  (^ScalarMultiplication [^org.nd4j.linalg.api.ndarray.INDArray x]
    (new ScalarMultiplication x))
  (^ScalarMultiplication []
    (new ScalarMultiplication )))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^ScalarMultiplication this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^ScalarMultiplication this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^ScalarMultiplication this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^ScalarMultiplication this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  i-v-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^ScalarMultiplication this ^java.util.List i-v-1]
    (-> this (.doDiff i-v-1))))

