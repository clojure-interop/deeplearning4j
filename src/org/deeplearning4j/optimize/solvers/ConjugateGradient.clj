(ns org.deeplearning4j.optimize.solvers.ConjugateGradient
  "Originally based on cc.mallet.optimize.ConjugateGradient
 Rewritten based on Conjugate Gradient algorithm in Bengio et al.,
 Deep Learning (in preparation) Ch8.
 See also Nocedal & Wright, Numerical optimization, Ch5"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.optimize.solvers ConjugateGradient]))

(defn ->conjugate-gradient
  "Constructor.

  conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`
  step-function - `org.deeplearning4j.optimize.api.StepFunction`
  training-listeners - `java.util.Collection`
  model - `org.deeplearning4j.nn.api.Model`"
  (^ConjugateGradient [^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^org.deeplearning4j.optimize.api.StepFunction step-function ^java.util.Collection training-listeners ^org.deeplearning4j.nn.api.Model model]
    (new ConjugateGradient conf step-function training-listeners model)))

(defn pre-process-line
  "Description copied from class: BaseOptimizer"
  ([^ConjugateGradient this]
    (-> this (.preProcessLine))))

(defn post-step
  "Description copied from class: BaseOptimizer

  gradient - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^ConjugateGradient this ^org.nd4j.linalg.api.ndarray.INDArray gradient]
    (-> this (.postStep gradient))))

