(ns org.nd4j.linalg.api.ops.impl.transforms.comparison.LessThanOrEqual
  "Bit mask over the ndarrays as to whether
 the components are less than or equal or not"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms.comparison LessThanOrEqual]))

(defn ->less-than-or-equal
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  args - `org.nd4j.autodiff.samediff.SDVariable[]`
  in-place - `boolean`"
  (^LessThanOrEqual [^org.nd4j.autodiff.samediff.SameDiff same-diff args ^Boolean in-place]
    (new LessThanOrEqual same-diff args in-place))
  (^LessThanOrEqual [inputs outputs]
    (new LessThanOrEqual inputs outputs))
  (^LessThanOrEqual []
    (new LessThanOrEqual )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^LessThanOrEqual this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^LessThanOrEqual this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^LessThanOrEqual this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^LessThanOrEqual this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

