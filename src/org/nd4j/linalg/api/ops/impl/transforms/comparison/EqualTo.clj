(ns org.nd4j.linalg.api.ops.impl.transforms.comparison.EqualTo
  "Bit mask over the ndarrays as to whether
 the components are equal or not"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms.comparison EqualTo]))

(defn ->equal-to
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  args - `org.nd4j.autodiff.samediff.SDVariable[]`
  in-place - `boolean`"
  (^EqualTo [^org.nd4j.autodiff.samediff.SameDiff same-diff args ^Boolean in-place]
    (new EqualTo same-diff args in-place))
  (^EqualTo [inputs outputs]
    (new EqualTo inputs outputs))
  (^EqualTo []
    (new EqualTo )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^EqualTo this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^EqualTo this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^EqualTo this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^EqualTo this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

