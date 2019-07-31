(ns org.nd4j.linalg.api.ops.impl.controlflow.IfDerivative
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.controlflow IfDerivative]))

(defn ->if-derivative
  "Constructor.

  if-block - `org.nd4j.linalg.api.ops.impl.controlflow.If`"
  (^IfDerivative [^org.nd4j.linalg.api.ops.impl.controlflow.If if-block]
    (new IfDerivative if-block)))

(defn calculate-output-shape
  "Description copied from class: DifferentialFunction

  returns: `java.util.List<long[]>`"
  ([^IfDerivative this]
    (-> this (.calculateOutputShape))))

(defn get-false-body-execution
  "returns: `org.nd4j.autodiff.samediff.SameDiff`"
  (^org.nd4j.autodiff.samediff.SameDiff [^IfDerivative this]
    (-> this (.getFalseBodyExecution))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^IfDerivative this]
    (-> this (.opName))))

(defn get-false-body-name
  "returns: `java.lang.String`"
  (^java.lang.String [^IfDerivative this]
    (-> this (.getFalseBodyName))))

(defn diff
  "Description copied from class: DifferentialFunction

  i-v-1 - the input variables - `java.util.List`

  returns: the differentiated output
  wrt each input variable - `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^IfDerivative this ^java.util.List i-v-1]
    (-> this (.diff i-v-1))))

(defn get-false-body
  "returns: `org.nd4j.autodiff.samediff.SameDiffFunctionDefinition`"
  (^org.nd4j.autodiff.samediff.SameDiffFunctionDefinition [^IfDerivative this]
    (-> this (.getFalseBody))))

(defn get-loop-body-execution
  "returns: `org.nd4j.autodiff.samediff.SameDiff`"
  (^org.nd4j.autodiff.samediff.SameDiff [^IfDerivative this]
    (-> this (.getLoopBodyExecution))))

(defn get-predicate-execution
  "returns: `org.nd4j.autodiff.samediff.SameDiff`"
  (^org.nd4j.autodiff.samediff.SameDiff [^IfDerivative this]
    (-> this (.getPredicateExecution))))

(defn get-true-body-executed?
  "returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^IfDerivative this]
    (-> this (.getTrueBodyExecuted))))

(defn get-block-name
  "returns: `java.lang.String`"
  (^java.lang.String [^IfDerivative this]
    (-> this (.getBlockName))))

(defn get-predicate
  "returns: `org.nd4j.autodiff.samediff.SameDiffConditional`"
  (^org.nd4j.autodiff.samediff.SameDiffConditional [^IfDerivative this]
    (-> this (.getPredicate))))

