(ns org.nd4j.linalg.api.ops.impl.scalar.comparison.ScalarSetValue
  "Scalar value set operation.
 Anything less than the scalar value will
 set the current element to be that value."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.scalar.comparison ScalarSetValue]))

(defn ->scalar-set-value
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  i-v - `org.nd4j.autodiff.samediff.SDVariable`
  scalar - `java.lang.Number`
  in-place - `boolean`
  extra-args - `java.lang.Object[]`"
  (^ScalarSetValue [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v ^java.lang.Number scalar ^Boolean in-place extra-args]
    (new ScalarSetValue same-diff i-v scalar in-place extra-args))
  (^ScalarSetValue [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v ^java.lang.Number scalar ^Boolean in-place]
    (new ScalarSetValue same-diff i-v scalar in-place))
  (^ScalarSetValue [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v ^java.lang.Number scalar]
    (new ScalarSetValue same-diff i-v scalar))
  (^ScalarSetValue [^org.nd4j.linalg.api.ndarray.INDArray x ^java.lang.Number num]
    (new ScalarSetValue x num))
  (^ScalarSetValue []
    (new ScalarSetValue )))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^ScalarSetValue this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^ScalarSetValue this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^ScalarSetValue this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^ScalarSetValue this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^ScalarSetValue this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

