(ns org.nd4j.linalg.api.ops.impl.transforms.comparison.IsNumericTensor
  "This op takes 1 n-dimensional array as input, and returns true if input is a numeric array."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms.comparison IsNumericTensor]))

(defn ->is-numeric-tensor
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  args - `org.nd4j.autodiff.samediff.SDVariable[]`
  in-place - `boolean`"
  (^IsNumericTensor [^org.nd4j.autodiff.samediff.SameDiff same-diff args ^Boolean in-place]
    (new IsNumericTensor same-diff args in-place))
  (^IsNumericTensor [inputs outputs]
    (new IsNumericTensor inputs outputs))
  (^IsNumericTensor []
    (new IsNumericTensor )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^IsNumericTensor this]
    (-> this (.opName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^IsNumericTensor this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^IsNumericTensor this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

