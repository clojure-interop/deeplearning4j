(ns org.nd4j.linalg.api.ops.impl.controlflow.compat.Switch
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.controlflow.compat Switch]))

(defn ->switch
  "Constructor."
  (^Switch []
    (new Switch )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^Switch this]
    (-> this (.opName))))

(defn calculate-output-shape
  "Description copied from class: DifferentialFunction

  returns: `java.util.List<long[]>`"
  ([^Switch this]
    (-> this (.calculateOutputShape))))

(defn output-variables
  "Description copied from class: DifferentialFunction

  returns: `org.nd4j.autodiff.samediff.SDVariable[]`"
  ([^Switch this]
    (-> this (.outputVariables))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Switch this]
    (-> this (.tensorflowName))))

(defn op-type
  "Description copied from class: DifferentialFunction

  returns: `org.nd4j.linalg.api.ops.Op$Type`"
  (^org.nd4j.linalg.api.ops.Op$Type [^Switch this]
    (-> this (.opType))))

(defn init-from-tensor-flow
  "Description copied from class: DifferentialFunction

  node-def - `org.tensorflow.framework.NodeDef`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `org.tensorflow.framework.GraphDef`"
  ([^Switch this ^org.tensorflow.framework.NodeDef node-def ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^org.tensorflow.framework.GraphDef graph]
    (-> this (.initFromTensorFlow node-def init-with attributes-for-node graph))))

(defn get-num-outputs
  "returns: `int`"
  (^Integer [^Switch this]
    (-> this (.getNumOutputs))))

