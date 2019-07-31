(ns org.nd4j.linalg.api.ops.impl.accum.SoftmaxCrossEntropyLossWithLogits
  "Softmax cross entropy loss with Logits"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.accum SoftmaxCrossEntropyLossWithLogits]))

(defn ->softmax-cross-entropy-loss-with-logits
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  logits - `org.nd4j.autodiff.samediff.SDVariable`
  weights - `org.nd4j.autodiff.samediff.SDVariable`
  labels - `org.nd4j.autodiff.samediff.SDVariable`
  reduction-mode - `int`
  label-smoothing - `double`"
  (^SoftmaxCrossEntropyLossWithLogits [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable logits ^org.nd4j.autodiff.samediff.SDVariable weights ^org.nd4j.autodiff.samediff.SDVariable labels ^Integer reduction-mode ^Double label-smoothing]
    (new SoftmaxCrossEntropyLossWithLogits same-diff logits weights labels reduction-mode label-smoothing))
  (^SoftmaxCrossEntropyLossWithLogits [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable logits ^org.nd4j.autodiff.samediff.SDVariable weights ^org.nd4j.autodiff.samediff.SDVariable labels ^Integer reduction-mode]
    (new SoftmaxCrossEntropyLossWithLogits same-diff logits weights labels reduction-mode)))

(defn add-args
  ""
  ([^SoftmaxCrossEntropyLossWithLogits this]
    (-> this (.addArgs))))

(defn init-from-tensor-flow
  "Description copied from class: DifferentialFunction

  node-def - `org.tensorflow.framework.NodeDef`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `org.tensorflow.framework.GraphDef`"
  ([^SoftmaxCrossEntropyLossWithLogits this ^org.tensorflow.framework.NodeDef node-def ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^org.tensorflow.framework.GraphDef graph]
    (-> this (.initFromTensorFlow node-def init-with attributes-for-node graph))))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^SoftmaxCrossEntropyLossWithLogits this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^SoftmaxCrossEntropyLossWithLogits this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^SoftmaxCrossEntropyLossWithLogits this]
    (-> this (.tensorflowName))))

(defn op-type
  "Description copied from class: DifferentialFunction

  returns: `org.nd4j.linalg.api.ops.Op$Type`"
  (^org.nd4j.linalg.api.ops.Op$Type [^SoftmaxCrossEntropyLossWithLogits this]
    (-> this (.opType))))

