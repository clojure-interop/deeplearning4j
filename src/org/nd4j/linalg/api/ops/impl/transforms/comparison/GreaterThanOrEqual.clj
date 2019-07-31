(ns org.nd4j.linalg.api.ops.impl.transforms.comparison.GreaterThanOrEqual
  "Bit mask over the ndarrays as to whether
 the components are greater than or equal or not"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms.comparison GreaterThanOrEqual]))

(defn ->greater-than-or-equal
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  args - `org.nd4j.autodiff.samediff.SDVariable[]`
  in-place - `boolean`"
  (^GreaterThanOrEqual [^org.nd4j.autodiff.samediff.SameDiff same-diff args ^Boolean in-place]
    (new GreaterThanOrEqual same-diff args in-place))
  (^GreaterThanOrEqual [inputs outputs]
    (new GreaterThanOrEqual inputs outputs))
  (^GreaterThanOrEqual []
    (new GreaterThanOrEqual )))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^GreaterThanOrEqual this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^GreaterThanOrEqual this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^GreaterThanOrEqual this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^GreaterThanOrEqual this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^GreaterThanOrEqual this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

