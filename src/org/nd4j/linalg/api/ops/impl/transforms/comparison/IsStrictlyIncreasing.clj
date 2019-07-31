(ns org.nd4j.linalg.api.ops.impl.transforms.comparison.IsStrictlyIncreasing
  "This op takes 1 n-dimensional array as input,
 and returns true if for every adjacent pair we have x[i] < x[i+1]."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms.comparison IsStrictlyIncreasing]))

(defn ->is-strictly-increasing
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  args - `org.nd4j.autodiff.samediff.SDVariable[]`
  in-place - `boolean`"
  (^IsStrictlyIncreasing [^org.nd4j.autodiff.samediff.SameDiff same-diff args ^Boolean in-place]
    (new IsStrictlyIncreasing same-diff args in-place))
  (^IsStrictlyIncreasing [inputs outputs]
    (new IsStrictlyIncreasing inputs outputs))
  (^IsStrictlyIncreasing []
    (new IsStrictlyIncreasing )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^IsStrictlyIncreasing this]
    (-> this (.opName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^IsStrictlyIncreasing this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^IsStrictlyIncreasing this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

