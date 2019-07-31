(ns org.nd4j.linalg.api.ops.impl.controlflow.compat.Exit
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.controlflow.compat Exit]))

(defn ->exit
  "Constructor."
  (^Exit []
    (new Exit )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^Exit this]
    (-> this (.opName))))

(defn calculate-output-shape
  "Description copied from class: DifferentialFunction

  returns: `java.util.List<long[]>`"
  ([^Exit this]
    (-> this (.calculateOutputShape))))

(defn output-variables
  "Description copied from class: DifferentialFunction

  returns: `org.nd4j.autodiff.samediff.SDVariable[]`"
  ([^Exit this]
    (-> this (.outputVariables))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Exit this]
    (-> this (.tensorflowName))))

(defn op-type
  "Description copied from class: DifferentialFunction

  returns: `org.nd4j.linalg.api.ops.Op$Type`"
  (^org.nd4j.linalg.api.ops.Op$Type [^Exit this]
    (-> this (.opType))))

(defn init-from-tensor-flow
  "Description copied from class: DifferentialFunction

  node-def - `org.tensorflow.framework.NodeDef`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `org.tensorflow.framework.GraphDef`"
  ([^Exit this ^org.tensorflow.framework.NodeDef node-def ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^org.tensorflow.framework.GraphDef graph]
    (-> this (.initFromTensorFlow node-def init-with attributes-for-node graph))))

(defn get-num-outputs
  "returns: `int`"
  (^Integer [^Exit this]
    (-> this (.getNumOutputs))))

