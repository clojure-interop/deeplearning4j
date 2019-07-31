(ns org.nd4j.linalg.api.ops.impl.transforms.ATan2
  "Arc Tangent elementwise function"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms ATan2]))

(defn ->a-tan-2
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  y - `org.nd4j.autodiff.samediff.SDVariable`
  x - `org.nd4j.autodiff.samediff.SDVariable`"
  (^ATan2 [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable y ^org.nd4j.autodiff.samediff.SDVariable x]
    (new ATan2 same-diff y x))
  (^ATan2 []
    (new ATan2 )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^ATan2 this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^ATan2 this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^ATan2 this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  i-v - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^ATan2 this ^java.util.List i-v]
    (-> this (.doDiff i-v))))

