(ns org.nd4j.linalg.api.ops.impl.transforms.comparison.IsNonDecreasing
  "This op takes 1 n-dimensional array as input,
 and returns true if for every adjacent pair we have x[i] <= x[i+1]."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms.comparison IsNonDecreasing]))

(defn ->is-non-decreasing
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  args - `org.nd4j.autodiff.samediff.SDVariable[]`
  in-place - `boolean`"
  (^IsNonDecreasing [^org.nd4j.autodiff.samediff.SameDiff same-diff args ^Boolean in-place]
    (new IsNonDecreasing same-diff args in-place))
  (^IsNonDecreasing [inputs outputs]
    (new IsNonDecreasing inputs outputs))
  (^IsNonDecreasing []
    (new IsNonDecreasing )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^IsNonDecreasing this]
    (-> this (.opName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^IsNonDecreasing this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^IsNonDecreasing this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

