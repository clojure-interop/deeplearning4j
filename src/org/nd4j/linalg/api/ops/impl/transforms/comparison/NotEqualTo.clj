(ns org.nd4j.linalg.api.ops.impl.transforms.comparison.NotEqualTo
  "Not equal to function:
 Bit mask over whether 2 elements are not equal or not"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms.comparison NotEqualTo]))

(defn ->not-equal-to
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  args - `org.nd4j.autodiff.samediff.SDVariable[]`
  in-place - `boolean`"
  (^NotEqualTo [^org.nd4j.autodiff.samediff.SameDiff same-diff args ^Boolean in-place]
    (new NotEqualTo same-diff args in-place))
  (^NotEqualTo [inputs outputs]
    (new NotEqualTo inputs outputs))
  (^NotEqualTo []
    (new NotEqualTo )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^NotEqualTo this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^NotEqualTo this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^NotEqualTo this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  i-v - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^NotEqualTo this ^java.util.List i-v]
    (-> this (.doDiff i-v))))

