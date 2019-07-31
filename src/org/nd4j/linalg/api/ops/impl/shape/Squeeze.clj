(ns org.nd4j.linalg.api.ops.impl.shape.Squeeze
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.shape Squeeze]))

(defn ->squeeze
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  arg - `org.nd4j.autodiff.samediff.SDVariable`
  squeeze-dims - `int[]`"
  (^Squeeze [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable arg squeeze-dims]
    (new Squeeze same-diff arg squeeze-dims))
  (^Squeeze []
    (new Squeeze )))

(defn init-from-tensor-flow
  "Description copied from class: DifferentialFunction

  node-def - `org.tensorflow.framework.NodeDef`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `org.tensorflow.framework.GraphDef`"
  ([^Squeeze this ^org.tensorflow.framework.NodeDef node-def ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^org.tensorflow.framework.GraphDef graph]
    (-> this (.initFromTensorFlow node-def init-with attributes-for-node graph))))

(defn resolve-properties-from-same-diff-before-execution
  "Description copied from class: DifferentialFunction"
  ([^Squeeze this]
    (-> this (.resolvePropertiesFromSameDiffBeforeExecution))))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^Squeeze this]
    (-> this (.opName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Squeeze this]
    (-> this (.tensorflowName))))

(defn mappings-for-function
  "Description copied from class: DifferentialFunction

  returns: `java.util.Map<java.lang.String,java.util.Map<java.lang.String,org.nd4j.imports.descriptors.properties.PropertyMapping>>`"
  (^java.util.Map [^Squeeze this]
    (-> this (.mappingsForFunction))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  i-v - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^Squeeze this ^java.util.List i-v]
    (-> this (.doDiff i-v))))

