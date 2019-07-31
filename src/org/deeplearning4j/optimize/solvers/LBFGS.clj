(ns org.deeplearning4j.optimize.solvers.LBFGS
  "LBFGS"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.optimize.solvers LBFGS]))

(defn ->lbfgs
  "Constructor.

  conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`
  step-function - `org.deeplearning4j.optimize.api.StepFunction`
  training-listeners - `java.util.Collection`
  model - `org.deeplearning4j.nn.api.Model`"
  (^LBFGS [^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^org.deeplearning4j.optimize.api.StepFunction step-function ^java.util.Collection training-listeners ^org.deeplearning4j.nn.api.Model model]
    (new LBFGS conf step-function training-listeners model)))

(defn setup-search-state
  "Description copied from class: BaseOptimizer

  pair - the gradient and score - `org.nd4j.linalg.primitives.Pair`"
  ([^LBFGS this ^org.nd4j.linalg.primitives.Pair pair]
    (-> this (.setupSearchState pair))))

(defn pre-process-line
  "Description copied from class: BaseOptimizer"
  ([^LBFGS this]
    (-> this (.preProcessLine))))

(defn post-step
  "Description copied from class: BaseOptimizer

  gradient - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^LBFGS this ^org.nd4j.linalg.api.ndarray.INDArray gradient]
    (-> this (.postStep gradient))))

