(ns org.deeplearning4j.nn.conf.layers.BatchNormalization$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers BatchNormalization$Builder]))

(defn ->builder
  "Constructor.

  gamma - `double`
  beta - `double`
  lock-gamma-beta - `boolean`"
  (^BatchNormalization$Builder [^Double gamma ^Double beta ^Boolean lock-gamma-beta]
    (new BatchNormalization$Builder gamma beta lock-gamma-beta))
  (^BatchNormalization$Builder [^Double decay ^Boolean is-minibatch]
    (new BatchNormalization$Builder decay is-minibatch))
  (^BatchNormalization$Builder [^Boolean lock-gamma-beta]
    (new BatchNormalization$Builder lock-gamma-beta))
  (^BatchNormalization$Builder []
    (new BatchNormalization$Builder )))

(defn gamma
  "Used only when 'true' is passed to lockGammaBeta(boolean). Value is not used otherwise.
  Default: 1.0

  gamma - Gamma parameter for all activations, used only with locked gamma/beta configuration mode - `double`

  returns: `org.deeplearning4j.nn.conf.layers.BatchNormalization$Builder`"
  (^org.deeplearning4j.nn.conf.layers.BatchNormalization$Builder [^BatchNormalization$Builder this ^Double gamma]
    (-> this (.gamma gamma))))

(defn eps
  "Epsilon value for batch normalization; small floating point value added to variance
  (algorithm 1 in http://arxiv.org/pdf/1502.03167v3.pdf) to reduce/avoid underflow issues.
  Default: 1e-5

  eps - Epsilon values to use - `double`

  returns: `org.deeplearning4j.nn.conf.layers.BatchNormalization$Builder`"
  (^org.deeplearning4j.nn.conf.layers.BatchNormalization$Builder [^BatchNormalization$Builder this ^Double eps]
    (-> this (.eps eps))))

(defn constrain-gamma
  "Set constraints to be applied to the gamma parameter of this batch normalisation layer. Default: no constraints.
  Constraints can be used to enforce certain conditions (non-negativity of parameters, max-norm regularization,
  etc). These constraints are applied at each iteration, after the parameters have been updated.

  constraints - Constraints to apply to the gamma parameter of this layer - `org.deeplearning4j.nn.api.layers.LayerConstraint`

  returns: `org.deeplearning4j.nn.conf.layers.BatchNormalization$Builder`"
  (^org.deeplearning4j.nn.conf.layers.BatchNormalization$Builder [^BatchNormalization$Builder this ^org.deeplearning4j.nn.api.layers.LayerConstraint constraints]
    (-> this (.constrainGamma constraints))))

(defn build
  "returns: `org.deeplearning4j.nn.conf.layers.BatchNormalization`"
  (^org.deeplearning4j.nn.conf.layers.BatchNormalization [^BatchNormalization$Builder this]
    (-> this (.build))))

(defn lock-gamma-beta
  "If set to true: lock the gamma and beta parameters to the values for each activation, specified by
  gamma(double) and beta(double). Default: false -> learn gamma and beta parameter values
  during network training.

  lock-gamma-beta - If true: use fixed beta/gamma values. False: learn during - `boolean`

  returns: `org.deeplearning4j.nn.conf.layers.BatchNormalization$Builder`"
  (^org.deeplearning4j.nn.conf.layers.BatchNormalization$Builder [^BatchNormalization$Builder this ^Boolean lock-gamma-beta]
    (-> this (.lockGammaBeta lock-gamma-beta))))

(defn constrain-beta
  "Set constraints to be applied to the beta parameter of this batch normalisation layer. Default: no constraints.
  Constraints can be used to enforce certain conditions (non-negativity of parameters, max-norm regularization,
  etc). These constraints are applied at each iteration, after the parameters have been updated.

  constraints - Constraints to apply to the beta parameter of this layer - `org.deeplearning4j.nn.api.layers.LayerConstraint`

  returns: `org.deeplearning4j.nn.conf.layers.BatchNormalization$Builder`"
  (^org.deeplearning4j.nn.conf.layers.BatchNormalization$Builder [^BatchNormalization$Builder this ^org.deeplearning4j.nn.api.layers.LayerConstraint constraints]
    (-> this (.constrainBeta constraints))))

(defn decay
  "At test time: we can use a global estimate of the mean and variance, calculated using a moving average
  of the batch means/variances. This moving average is implemented as:
  globalMeanEstimate = decay * globalMeanEstimate  (1-decay) * batchMean
  globalVarianceEstimate = decay * globalVarianceEstimate  (1-decay) * batchVariance

  decay - Decay value to use for global stats calculation - `double`

  returns: `org.deeplearning4j.nn.conf.layers.BatchNormalization$Builder`"
  (^org.deeplearning4j.nn.conf.layers.BatchNormalization$Builder [^BatchNormalization$Builder this ^Double decay]
    (-> this (.decay decay))))

(defn minibatch
  "If doing minibatch training or not. Default: true.
  Under most circumstances, this should be set to true.
  If doing full batch training (i.e., all examples in a single DataSet object - very small data sets) then
  this should be set to false. Affects how global mean/variance estimates are calculated.

  minibatch - Minibatch parameter - `boolean`

  returns: `org.deeplearning4j.nn.conf.layers.BatchNormalization$Builder`"
  (^org.deeplearning4j.nn.conf.layers.BatchNormalization$Builder [^BatchNormalization$Builder this ^Boolean minibatch]
    (-> this (.minibatch minibatch))))

(defn beta
  "Used only when 'true' is passed to lockGammaBeta(boolean). Value is not used otherwise.
  Default: 0.0

  beta - Beta parameter for all activations, used only with locked gamma/beta configuration mode - `double`

  returns: `org.deeplearning4j.nn.conf.layers.BatchNormalization$Builder`"
  (^org.deeplearning4j.nn.conf.layers.BatchNormalization$Builder [^BatchNormalization$Builder this ^Double beta]
    (-> this (.beta beta))))

