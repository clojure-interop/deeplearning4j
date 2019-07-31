(ns org.nd4j.linalg.api.ops.random.custom.DistributionUniform
  "Uniform distribution wrapper"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.random.custom DistributionUniform]))

(defn ->distribution-uniform
  "Constructor.

  sd - `org.nd4j.autodiff.samediff.SameDiff`
  shape - `org.nd4j.autodiff.samediff.SDVariable`
  min - `double`
  max - `double`"
  (^DistributionUniform [^org.nd4j.autodiff.samediff.SameDiff sd ^org.nd4j.autodiff.samediff.SDVariable shape ^Double min ^Double max]
    (new DistributionUniform sd shape min max))
  (^DistributionUniform []
    (new DistributionUniform )))

(defn init-from-tensor-flow
  "Description copied from class: DifferentialFunction

  node-def - `org.tensorflow.framework.NodeDef`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `org.tensorflow.framework.GraphDef`"
  ([^DistributionUniform this ^org.tensorflow.framework.NodeDef node-def ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^org.tensorflow.framework.GraphDef graph]
    (-> this (.initFromTensorFlow node-def init-with attributes-for-node graph))))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^DistributionUniform this]
    (-> this (.opName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^DistributionUniform this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  gradients - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^DistributionUniform this ^java.util.List gradients]
    (-> this (.doDiff gradients))))

