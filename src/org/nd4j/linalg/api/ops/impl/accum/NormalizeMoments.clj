(ns org.nd4j.linalg.api.ops.impl.accum.NormalizeMoments
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.accum NormalizeMoments]))

(defn ->normalize-moments
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  counts - `org.nd4j.autodiff.samediff.SDVariable`
  means - `org.nd4j.autodiff.samediff.SDVariable`
  variances - `org.nd4j.autodiff.samediff.SDVariable`
  shift - `double`"
  (^NormalizeMoments [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable counts ^org.nd4j.autodiff.samediff.SDVariable means ^org.nd4j.autodiff.samediff.SDVariable variances ^Double shift]
    (new NormalizeMoments same-diff counts means variances shift))
  (^NormalizeMoments [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable counts ^org.nd4j.autodiff.samediff.SDVariable means ^org.nd4j.autodiff.samediff.SDVariable variances]
    (new NormalizeMoments same-diff counts means variances)))

(defn init-from-tensor-flow
  "Description copied from class: DifferentialFunction

  node-def - `org.tensorflow.framework.NodeDef`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `org.tensorflow.framework.GraphDef`"
  ([^NormalizeMoments this ^org.tensorflow.framework.NodeDef node-def ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^org.tensorflow.framework.GraphDef graph]
    (-> this (.initFromTensorFlow node-def init-with attributes-for-node graph))))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^NormalizeMoments this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^NormalizeMoments this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^NormalizeMoments this]
    (-> this (.tensorflowName))))

