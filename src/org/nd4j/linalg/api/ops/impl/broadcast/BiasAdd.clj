(ns org.nd4j.linalg.api.ops.impl.broadcast.BiasAdd
  "Bias addition gradient operation."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.broadcast BiasAdd]))

(defn ->bias-add
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  input - `org.nd4j.autodiff.samediff.SDVariable`
  bias - `org.nd4j.autodiff.samediff.SDVariable`"
  (^BiasAdd [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable input ^org.nd4j.autodiff.samediff.SDVariable bias]
    (new BiasAdd same-diff input bias)))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^BiasAdd this]
    (-> this (.opName))))

(defn init-from-tensor-flow
  "Description copied from class: DifferentialFunction

  node-def - `org.tensorflow.framework.NodeDef`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `org.tensorflow.framework.GraphDef`"
  ([^BiasAdd this ^org.tensorflow.framework.NodeDef node-def ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^org.tensorflow.framework.GraphDef graph]
    (-> this (.initFromTensorFlow node-def init-with attributes-for-node graph))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^BiasAdd this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^BiasAdd this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  gradient - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^BiasAdd this ^java.util.List gradient]
    (-> this (.doDiff gradient))))

