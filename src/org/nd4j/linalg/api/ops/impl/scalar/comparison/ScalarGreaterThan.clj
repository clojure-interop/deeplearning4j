(ns org.nd4j.linalg.api.ops.impl.scalar.comparison.ScalarGreaterThan
  "Return a binary (0 or 1) when greater than a number"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.scalar.comparison ScalarGreaterThan]))

(defn ->scalar-greater-than
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  i-v - `org.nd4j.autodiff.samediff.SDVariable`
  scalar - `java.lang.Number`
  in-place - `boolean`
  extra-args - `java.lang.Object[]`"
  (^ScalarGreaterThan [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v ^java.lang.Number scalar ^Boolean in-place extra-args]
    (new ScalarGreaterThan same-diff i-v scalar in-place extra-args))
  (^ScalarGreaterThan [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v ^java.lang.Number scalar ^Boolean in-place]
    (new ScalarGreaterThan same-diff i-v scalar in-place))
  (^ScalarGreaterThan [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v ^java.lang.Number scalar]
    (new ScalarGreaterThan same-diff i-v scalar))
  (^ScalarGreaterThan [^org.nd4j.linalg.api.ndarray.INDArray x ^java.lang.Number num]
    (new ScalarGreaterThan x num))
  (^ScalarGreaterThan []
    (new ScalarGreaterThan )))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^ScalarGreaterThan this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^ScalarGreaterThan this]
    (-> this (.opName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^ScalarGreaterThan this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^ScalarGreaterThan this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^ScalarGreaterThan this]
    (-> this (.tensorflowName))))

