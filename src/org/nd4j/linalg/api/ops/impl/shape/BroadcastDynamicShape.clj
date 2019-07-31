(ns org.nd4j.linalg.api.ops.impl.shape.BroadcastDynamicShape
  "Broadcast dynamic shape function"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.shape BroadcastDynamicShape]))

(defn ->broadcast-dynamic-shape
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  in - `org.nd4j.autodiff.samediff.SDVariable`
  shape - `org.nd4j.autodiff.samediff.SDVariable`"
  (^BroadcastDynamicShape [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable in ^org.nd4j.autodiff.samediff.SDVariable shape]
    (new BroadcastDynamicShape same-diff in shape))
  (^BroadcastDynamicShape []
    (new BroadcastDynamicShape )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^BroadcastDynamicShape this]
    (-> this (.opName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  i-v - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^BroadcastDynamicShape this ^java.util.List i-v]
    (-> this (.doDiff i-v))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^BroadcastDynamicShape this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^BroadcastDynamicShape this]
    (-> this (.tensorflowName))))

