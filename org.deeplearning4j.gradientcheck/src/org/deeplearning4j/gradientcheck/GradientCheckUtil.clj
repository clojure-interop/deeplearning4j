(ns org.deeplearning4j.gradientcheck.GradientCheckUtil
  "A utility for numerically checking gradients.
 Basic idea: compare calculated gradients with those calculated numerically,
 to check implementation of backpropagation gradient calculation.
 See:
 - http://cs231n.github.io/neural-networks-3/#gradcheck
 - http://ufldl.stanford.edu/wiki/index.php/Gradient_checking_and_advanced_optimization
 - https://code.google.com/p/cuda-convnet/wiki/CheckingGradients
 Is C is cost function, then dC/dW ~= (C(w+epsilon)-C(w-epsilon)) / (2*epsilon).
 Method checks gradient calculation for every parameter separately by doing 2 forward pass
 calculations for each parameter, so can be very time consuming for large networks."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.gradientcheck GradientCheckUtil]))

(defn *check-gradients
  "Check backprop gradients for a MultiLayerNetwork.

  mln - MultiLayerNetwork to test. This must be initialized. - `org.deeplearning4j.nn.multilayer.MultiLayerNetwork`
  epsilon - Usually on the order/ of 1e-4 or so. - `double`
  max-rel-error - Maximum relative error. Usually < 1e-5 or so, though maybe more for deep networks or those with nonlinear activation - `double`
  min-absolute-error - Minimum absolute error to cause a failure. Numerical gradients can be non-zero due to precision issues.For example, 0.0 vs. 1e-18: relative error is 1.0, but not really a failure - `double`
  print - Whether to print full pass/failure details for each parameter gradient - `boolean`
  exit-on-first-error - If true: return upon first failure. If false: continue checking even ifone parameter gradient has failed. Typically use false for debugging, true for unit tests. - `boolean`
  input - Input array to use for forward pass. May be mini-batch data. - `org.nd4j.linalg.api.ndarray.INDArray`
  labels - Labels/targets to use to calculate backprop gradient. May be mini-batch data. - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: true if gradients are passed, false otherwise. - `boolean`"
  (^Boolean [^org.deeplearning4j.nn.multilayer.MultiLayerNetwork mln ^Double epsilon ^Double max-rel-error ^Double min-absolute-error ^Boolean print ^Boolean exit-on-first-error ^org.nd4j.linalg.api.ndarray.INDArray input ^org.nd4j.linalg.api.ndarray.INDArray labels]
    (GradientCheckUtil/checkGradients mln epsilon max-rel-error min-absolute-error print exit-on-first-error input labels))
  (^Boolean [^org.deeplearning4j.nn.multilayer.MultiLayerNetwork mln ^Double epsilon ^Double max-rel-error ^Double min-absolute-error ^Boolean print ^Boolean exit-on-first-error ^org.nd4j.linalg.api.ndarray.INDArray input ^org.nd4j.linalg.api.ndarray.INDArray labels ^org.nd4j.linalg.api.ndarray.INDArray input-mask ^org.nd4j.linalg.api.ndarray.INDArray label-mask ^Boolean subset ^Integer max-per-param ^java.util.Set exclude-params ^java.lang.Integer rng-seed-reset-each-iter]
    (GradientCheckUtil/checkGradients mln epsilon max-rel-error min-absolute-error print exit-on-first-error input labels input-mask label-mask subset max-per-param exclude-params rng-seed-reset-each-iter))
  (^Boolean [^org.deeplearning4j.nn.multilayer.MultiLayerNetwork mln ^Double epsilon ^Double max-rel-error ^Double min-absolute-error ^Boolean print ^Boolean exit-on-first-error ^org.nd4j.linalg.api.ndarray.INDArray input ^org.nd4j.linalg.api.ndarray.INDArray labels ^org.nd4j.linalg.api.ndarray.INDArray input-mask ^org.nd4j.linalg.api.ndarray.INDArray label-mask ^Boolean subset ^Integer max-per-param ^java.util.Set exclude-params]
    (GradientCheckUtil/checkGradients mln epsilon max-rel-error min-absolute-error print exit-on-first-error input labels input-mask label-mask subset max-per-param exclude-params))
  (^Boolean [^org.deeplearning4j.nn.multilayer.MultiLayerNetwork mln ^Double epsilon ^Double max-rel-error ^Double min-absolute-error ^Boolean print ^Boolean exit-on-first-error ^org.nd4j.linalg.api.ndarray.INDArray input ^org.nd4j.linalg.api.ndarray.INDArray labels ^org.nd4j.linalg.api.ndarray.INDArray input-mask ^org.nd4j.linalg.api.ndarray.INDArray label-mask ^Boolean subset ^Integer max-per-param]
    (GradientCheckUtil/checkGradients mln epsilon max-rel-error min-absolute-error print exit-on-first-error input labels input-mask label-mask subset max-per-param))
  (^Boolean [^org.deeplearning4j.nn.graph.ComputationGraph graph ^Double epsilon ^Double max-rel-error ^Double min-absolute-error ^Boolean print ^Boolean exit-on-first-error inputs labels f-mask l-mask ^java.util.Set exclude-params]
    (GradientCheckUtil/checkGradients graph epsilon max-rel-error min-absolute-error print exit-on-first-error inputs labels f-mask l-mask exclude-params))
  (^Boolean [^org.deeplearning4j.nn.multilayer.MultiLayerNetwork mln ^Double epsilon ^Double max-rel-error ^Double min-absolute-error ^Boolean print ^Boolean exit-on-first-error ^org.nd4j.linalg.api.ndarray.INDArray input ^org.nd4j.linalg.api.ndarray.INDArray labels ^org.nd4j.linalg.api.ndarray.INDArray input-mask ^org.nd4j.linalg.api.ndarray.INDArray label-mask]
    (GradientCheckUtil/checkGradients mln epsilon max-rel-error min-absolute-error print exit-on-first-error input labels input-mask label-mask)))

(defn *check-gradients-pretrain-layer
  "Check backprop gradients for a pretrain layer
  NOTE: gradient checking pretrain layers can be difficult...

  layer - `org.deeplearning4j.nn.api.Layer`
  epsilon - `double`
  max-rel-error - `double`
  min-absolute-error - `double`
  print - `boolean`
  exit-on-first-error - `boolean`
  input - `org.nd4j.linalg.api.ndarray.INDArray`
  rng-seed - `int`

  returns: `boolean`"
  (^Boolean [^org.deeplearning4j.nn.api.Layer layer ^Double epsilon ^Double max-rel-error ^Double min-absolute-error ^Boolean print ^Boolean exit-on-first-error ^org.nd4j.linalg.api.ndarray.INDArray input ^Integer rng-seed]
    (GradientCheckUtil/checkGradientsPretrainLayer layer epsilon max-rel-error min-absolute-error print exit-on-first-error input rng-seed)))

