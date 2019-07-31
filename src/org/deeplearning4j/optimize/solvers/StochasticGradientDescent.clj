(ns org.deeplearning4j.optimize.solvers.StochasticGradientDescent
  "Stochastic Gradient Descent
 Standard fix step size
 No line search"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.optimize.solvers StochasticGradientDescent]))

(defn ->stochastic-gradient-descent
  "Constructor.

  conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`
  step-function - `org.deeplearning4j.optimize.api.StepFunction`
  training-listeners - `java.util.Collection`
  model - `org.deeplearning4j.nn.api.Model`"
  (^StochasticGradientDescent [^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^org.deeplearning4j.optimize.api.StepFunction step-function ^java.util.Collection training-listeners ^org.deeplearning4j.nn.api.Model model]
    (new StochasticGradientDescent conf step-function training-listeners model)))

(defn optimize
  "Description copied from class: BaseOptimizer

  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: whether it converged or not - `boolean`"
  (^Boolean [^StochasticGradientDescent this ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.optimize workspace-mgr))))

(defn pre-process-line
  "Description copied from class: BaseOptimizer"
  ([^StochasticGradientDescent this]
    (-> this (.preProcessLine))))

(defn post-step
  "Description copied from class: BaseOptimizer

  gradient - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^StochasticGradientDescent this ^org.nd4j.linalg.api.ndarray.INDArray gradient]
    (-> this (.postStep gradient))))

