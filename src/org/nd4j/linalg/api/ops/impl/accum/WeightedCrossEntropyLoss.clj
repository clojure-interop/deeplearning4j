(ns org.nd4j.linalg.api.ops.impl.accum.WeightedCrossEntropyLoss
  "Weighted cross entropy loss with logits"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.accum WeightedCrossEntropyLoss]))

(defn ->weighted-cross-entropy-loss
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  targets - `org.nd4j.autodiff.samediff.SDVariable`
  inputs - `org.nd4j.autodiff.samediff.SDVariable`
  weights - `org.nd4j.autodiff.samediff.SDVariable`"
  (^WeightedCrossEntropyLoss [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable targets ^org.nd4j.autodiff.samediff.SDVariable inputs ^org.nd4j.autodiff.samediff.SDVariable weights]
    (new WeightedCrossEntropyLoss same-diff targets inputs weights)))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^WeightedCrossEntropyLoss this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^WeightedCrossEntropyLoss this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^WeightedCrossEntropyLoss this]
    (-> this (.tensorflowName))))

(defn op-type
  "Description copied from class: DifferentialFunction

  returns: `org.nd4j.linalg.api.ops.Op$Type`"
  (^org.nd4j.linalg.api.ops.Op$Type [^WeightedCrossEntropyLoss this]
    (-> this (.opType))))

