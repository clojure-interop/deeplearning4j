(ns org.deeplearning4j.optimize.solvers.LineGradientDescent
  "Stochastic Gradient Descent with Line Search"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.optimize.solvers LineGradientDescent]))

(defn ->line-gradient-descent
  "Constructor.

  conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`
  step-function - `org.deeplearning4j.optimize.api.StepFunction`
  training-listeners - `java.util.Collection`
  model - `org.deeplearning4j.nn.api.Model`"
  (^LineGradientDescent [^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^org.deeplearning4j.optimize.api.StepFunction step-function ^java.util.Collection training-listeners ^org.deeplearning4j.nn.api.Model model]
    (new LineGradientDescent conf step-function training-listeners model)))

(defn pre-process-line
  "Description copied from class: BaseOptimizer"
  ([^LineGradientDescent this]
    (-> this (.preProcessLine))))

(defn post-step
  "Description copied from class: BaseOptimizer

  gradient - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^LineGradientDescent this ^org.nd4j.linalg.api.ndarray.INDArray gradient]
    (-> this (.postStep gradient))))

