(ns org.nd4j.linalg.api.ops.impl.controlflow.WhileDerivative
  "While loop derivative"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.controlflow WhileDerivative]))

(defn ->while-derivative
  "Constructor.

  delegate - `org.nd4j.linalg.api.ops.impl.controlflow.While`"
  (^WhileDerivative [^org.nd4j.linalg.api.ops.impl.controlflow.While delegate]
    (new WhileDerivative delegate)))

(defn get-true-body
  "returns: `org.nd4j.autodiff.samediff.SameDiffFunctionDefinition`"
  (^org.nd4j.autodiff.samediff.SameDiffFunctionDefinition [^WhileDerivative this]
    (-> this (.getTrueBody))))

(defn get-input-vars
  "returns: `org.nd4j.autodiff.samediff.SDVariable[]`"
  ([^WhileDerivative this]
    (-> this (.getInputVars))))

(defn op-type
  "Description copied from class: DifferentialFunction

  returns: `org.nd4j.linalg.api.ops.Op$Type`"
  (^org.nd4j.linalg.api.ops.Op$Type [^WhileDerivative this]
    (-> this (.opType))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^WhileDerivative this]
    (-> this (.opName))))

(defn get-num-looped
  "returns: `int`"
  (^Integer [^WhileDerivative this]
    (-> this (.getNumLooped))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^WhileDerivative this]
    (-> this (.tensorflowName))))

(defn get-loop-body-execution
  "returns: `org.nd4j.autodiff.samediff.SameDiff`"
  (^org.nd4j.autodiff.samediff.SameDiff [^WhileDerivative this]
    (-> this (.getLoopBodyExecution))))

(defn get-true-body-name
  "returns: `java.lang.String`"
  (^java.lang.String [^WhileDerivative this]
    (-> this (.getTrueBodyName))))

(defn get-predicate-execution
  "returns: `org.nd4j.autodiff.samediff.SameDiff`"
  (^org.nd4j.autodiff.samediff.SameDiff [^WhileDerivative this]
    (-> this (.getPredicateExecution))))

(defn get-block-name
  "returns: `java.lang.String`"
  (^java.lang.String [^WhileDerivative this]
    (-> this (.getBlockName))))

(defn get-predicate
  "returns: `org.nd4j.autodiff.samediff.SameDiffConditional`"
  (^org.nd4j.autodiff.samediff.SameDiffConditional [^WhileDerivative this]
    (-> this (.getPredicate))))

