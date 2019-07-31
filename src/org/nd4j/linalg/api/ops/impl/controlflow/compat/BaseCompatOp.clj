(ns org.nd4j.linalg.api.ops.impl.controlflow.compat.BaseCompatOp
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.controlflow.compat BaseCompatOp]))

(defn ->base-compat-op
  "Constructor."
  (^BaseCompatOp []
    (new BaseCompatOp )))

(defn get-frame-name
  "returns: `java.lang.String`"
  (^java.lang.String [^BaseCompatOp this]
    (-> this (.getFrameName))))

(defn set-frame-name
  "frame-name - `java.lang.String`"
  ([^BaseCompatOp this ^java.lang.String frame-name]
    (-> this (.setFrameName frame-name))))

(defn init-from-tensor-flow
  "Description copied from class: DifferentialFunction

  node-def - `org.tensorflow.framework.NodeDef`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `org.tensorflow.framework.GraphDef`"
  ([^BaseCompatOp this ^org.tensorflow.framework.NodeDef node-def ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^org.tensorflow.framework.GraphDef graph]
    (-> this (.initFromTensorFlow node-def init-with attributes-for-node graph))))

(defn mappings-for-function
  "Description copied from class: DifferentialFunction

  returns: `java.util.Map<java.lang.String,java.util.Map<java.lang.String,org.nd4j.imports.descriptors.properties.PropertyMapping>>`"
  (^java.util.Map [^BaseCompatOp this]
    (-> this (.mappingsForFunction))))

(defn attribute-adapters-for-function
  "Description copied from class: DifferentialFunction

  returns: `java.util.Map<java.lang.String,java.util.Map<java.lang.String,org.nd4j.imports.descriptors.properties.AttributeAdapter>>`"
  (^java.util.Map [^BaseCompatOp this]
    (-> this (.attributeAdaptersForFunction))))

