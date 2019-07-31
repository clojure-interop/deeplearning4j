(ns org.nd4j.linalg.api.ops.impl.transforms.comparison.LessThan
  "Bit mask over the ndarrays as to whether
 the components are less than or not"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms.comparison LessThan]))

(defn ->less-than
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  args - `org.nd4j.autodiff.samediff.SDVariable[]`
  in-place - `boolean`"
  (^LessThan [^org.nd4j.autodiff.samediff.SameDiff same-diff args ^Boolean in-place]
    (new LessThan same-diff args in-place))
  (^LessThan [inputs outputs]
    (new LessThan inputs outputs))
  (^LessThan []
    (new LessThan )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^LessThan this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^LessThan this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^LessThan this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^LessThan this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

