(ns org.nd4j.linalg.api.ops.impl.transforms.ReluLayer
  "Composed op: relu((X, W)  b)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms ReluLayer]))

(defn ->relu-layer
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  input - `org.nd4j.autodiff.samediff.SDVariable`
  weights - `org.nd4j.autodiff.samediff.SDVariable`
  bias - `org.nd4j.autodiff.samediff.SDVariable`"
  (^ReluLayer [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable input ^org.nd4j.autodiff.samediff.SDVariable weights ^org.nd4j.autodiff.samediff.SDVariable bias]
    (new ReluLayer same-diff input weights bias)))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^ReluLayer this]
    (-> this (.opName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^ReluLayer this]
    (-> this (.tensorflowName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^ReluLayer this]
    (-> this (.onnxName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  gradient - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^ReluLayer this ^java.util.List gradient]
    (-> this (.doDiff gradient))))

