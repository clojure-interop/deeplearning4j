(ns org.nd4j.linalg.api.ops.impl.transforms.comparison.GreaterThan
  "Bit mask over the ndarrays as to whether
 the components are greater than or not"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms.comparison GreaterThan]))

(defn ->greater-than
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  args - `org.nd4j.autodiff.samediff.SDVariable[]`
  in-place - `boolean`"
  (^GreaterThan [^org.nd4j.autodiff.samediff.SameDiff same-diff args ^Boolean in-place]
    (new GreaterThan same-diff args in-place))
  (^GreaterThan [inputs outputs]
    (new GreaterThan inputs outputs))
  (^GreaterThan []
    (new GreaterThan )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^GreaterThan this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^GreaterThan this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^GreaterThan this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^GreaterThan this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

