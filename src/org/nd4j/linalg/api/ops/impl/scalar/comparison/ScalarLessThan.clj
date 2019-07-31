(ns org.nd4j.linalg.api.ops.impl.scalar.comparison.ScalarLessThan
  "Return a binary (0 or 1) when less than a number"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.scalar.comparison ScalarLessThan]))

(defn ->scalar-less-than
  "Constructor.

  x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`
  z - `org.nd4j.linalg.api.ndarray.INDArray`
  n - `long`
  num - `java.lang.Number`"
  (^ScalarLessThan [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Long n ^java.lang.Number num]
    (new ScalarLessThan x y z n num))
  (^ScalarLessThan [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v ^java.lang.Number scalar ^Boolean in-place]
    (new ScalarLessThan same-diff i-v scalar in-place))
  (^ScalarLessThan [^org.nd4j.linalg.api.ndarray.INDArray x ^java.lang.Number num]
    (new ScalarLessThan x num))
  (^ScalarLessThan []
    (new ScalarLessThan )))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^ScalarLessThan this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^ScalarLessThan this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^ScalarLessThan this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^ScalarLessThan this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^ScalarLessThan this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

