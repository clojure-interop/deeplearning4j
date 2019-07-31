(ns org.nd4j.linalg.api.ops.impl.controlflow.compat.Merge
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.controlflow.compat Merge]))

(defn ->merge
  "Constructor."
  (^Merge []
    (new Merge )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^Merge this]
    (-> this (.opName))))

(defn op-hash
  "Description copied from class: DynamicCustomOp

  returns: `long`"
  (^Long [^Merge this]
    (-> this (.opHash))))

(defn calculate-output-shape
  "Description copied from class: DifferentialFunction

  returns: `java.util.List<long[]>`"
  ([^Merge this]
    (-> this (.calculateOutputShape))))

(defn output-variables
  "Description copied from class: DifferentialFunction

  returns: `org.nd4j.autodiff.samediff.SDVariable[]`"
  ([^Merge this]
    (-> this (.outputVariables))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Merge this]
    (-> this (.tensorflowName))))

(defn op-type
  "Description copied from class: DifferentialFunction

  returns: `org.nd4j.linalg.api.ops.Op$Type`"
  (^org.nd4j.linalg.api.ops.Op$Type [^Merge this]
    (-> this (.opType))))

(defn init-from-tensor-flow
  "Description copied from class: DifferentialFunction

  node-def - `org.tensorflow.framework.NodeDef`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `org.tensorflow.framework.GraphDef`"
  ([^Merge this ^org.tensorflow.framework.NodeDef node-def ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^org.tensorflow.framework.GraphDef graph]
    (-> this (.initFromTensorFlow node-def init-with attributes-for-node graph))))

(defn get-num-outputs
  "returns: `int`"
  (^Integer [^Merge this]
    (-> this (.getNumOutputs))))

