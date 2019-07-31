(ns org.nd4j.linalg.api.ops.impl.scalar.comparison.ScalarLessThanOrEqual
  "Return a binary (0 or 1) when less than
 or equal to a number"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.scalar.comparison ScalarLessThanOrEqual]))

(defn ->scalar-less-than-or-equal
  "Constructor.

  x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`
  z - `org.nd4j.linalg.api.ndarray.INDArray`
  n - `long`
  num - `java.lang.Number`"
  (^ScalarLessThanOrEqual [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Long n ^java.lang.Number num]
    (new ScalarLessThanOrEqual x y z n num))
  (^ScalarLessThanOrEqual [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v ^java.lang.Number scalar ^Boolean in-place]
    (new ScalarLessThanOrEqual same-diff i-v scalar in-place))
  (^ScalarLessThanOrEqual [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v ^java.lang.Number scalar]
    (new ScalarLessThanOrEqual same-diff i-v scalar))
  (^ScalarLessThanOrEqual [^org.nd4j.linalg.api.ndarray.INDArray x ^java.lang.Number num]
    (new ScalarLessThanOrEqual x num))
  (^ScalarLessThanOrEqual []
    (new ScalarLessThanOrEqual )))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^ScalarLessThanOrEqual this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^ScalarLessThanOrEqual this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^ScalarLessThanOrEqual this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^ScalarLessThanOrEqual this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^ScalarLessThanOrEqual this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

