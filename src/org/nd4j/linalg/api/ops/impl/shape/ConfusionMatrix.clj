(ns org.nd4j.linalg.api.ops.impl.shape.ConfusionMatrix
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.shape ConfusionMatrix]))

(defn ->confusion-matrix
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  labels - `org.nd4j.autodiff.samediff.SDVariable`
  pred - `org.nd4j.autodiff.samediff.SDVariable`
  num-classes - `java.lang.Integer`
  weights - `org.nd4j.autodiff.samediff.SDVariable`"
  (^ConfusionMatrix [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable labels ^org.nd4j.autodiff.samediff.SDVariable pred ^java.lang.Integer num-classes ^org.nd4j.autodiff.samediff.SDVariable weights]
    (new ConfusionMatrix same-diff labels pred num-classes weights))
  (^ConfusionMatrix [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable labels ^org.nd4j.autodiff.samediff.SDVariable pred ^org.nd4j.autodiff.samediff.SDVariable weights]
    (new ConfusionMatrix same-diff labels pred weights))
  (^ConfusionMatrix [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable labels ^org.nd4j.autodiff.samediff.SDVariable pred]
    (new ConfusionMatrix same-diff labels pred))
  (^ConfusionMatrix []
    (new ConfusionMatrix )))

(defn init-from-tensor-flow
  "Description copied from class: DifferentialFunction

  node-def - `org.tensorflow.framework.NodeDef`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `org.tensorflow.framework.GraphDef`"
  ([^ConfusionMatrix this ^org.tensorflow.framework.NodeDef node-def ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^org.tensorflow.framework.GraphDef graph]
    (-> this (.initFromTensorFlow node-def init-with attributes-for-node graph))))

(defn resolve-properties-from-same-diff-before-execution
  "Description copied from class: DifferentialFunction"
  ([^ConfusionMatrix this]
    (-> this (.resolvePropertiesFromSameDiffBeforeExecution))))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^ConfusionMatrix this]
    (-> this (.opName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^ConfusionMatrix this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  i-v - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^ConfusionMatrix this ^java.util.List i-v]
    (-> this (.doDiff i-v))))

