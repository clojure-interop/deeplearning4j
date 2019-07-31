(ns org.nd4j.linalg.api.ops.impl.controlflow.Select
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.controlflow Select]))

(defn ->select
  "Constructor.

  inputs - `org.nd4j.linalg.api.ndarray.INDArray[]`
  outputs - `org.nd4j.linalg.api.ndarray.INDArray[]`
  t-arguments - `java.util.List`
  i-arguments - `java.util.List`"
  (^Select [inputs outputs ^java.util.List t-arguments ^java.util.List i-arguments]
    (new Select inputs outputs t-arguments i-arguments))
  (^Select [^org.nd4j.autodiff.samediff.SameDiff same-diff args ^Boolean in-place]
    (new Select same-diff args in-place))
  (^Select [^org.nd4j.autodiff.samediff.SameDiff same-diff args]
    (new Select same-diff args)))

(defn init-from-tensor-flow
  "Description copied from class: DifferentialFunction

  node-def - `org.tensorflow.framework.NodeDef`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `org.tensorflow.framework.GraphDef`"
  ([^Select this ^org.tensorflow.framework.NodeDef node-def ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^org.tensorflow.framework.GraphDef graph]
    (-> this (.initFromTensorFlow node-def init-with attributes-for-node graph))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Select this]
    (-> this (.tensorflowName))))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^Select this]
    (-> this (.opName))))

