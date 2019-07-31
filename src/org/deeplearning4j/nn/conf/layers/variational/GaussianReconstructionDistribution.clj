(ns org.deeplearning4j.nn.conf.layers.variational.GaussianReconstructionDistribution
  "Gaussian reconstruction distribution for variational autoencoder.
 Outputs are modelled by a Gaussian distribution, with the mean and variances (diagonal covariance matrix) for each
 output determined by the network forward pass.

 Specifically, the GaussianReconstructionDistribution models mean and log(stdev^2). This parameterization gives log(1) = 0,
 and inputs can be in range (-infinity,infinity). Other parameterizations for variance are of course possible but may be
 problematic with respect to the average pre-activation function values and activation function ranges.
 For activation functions, identity and perhaps tanh are typical - though tanh (unlike identity) implies a minimum/maximum
 possible value for mean and log variance. Asymmetric activation functions such as sigmoid or relu should be avoided."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers.variational GaussianReconstructionDistribution]))

(defn ->gaussian-reconstruction-distribution
  "Constructor.

  Create a GaussianReconstructionDistribution with the default identity activation function."
  (^GaussianReconstructionDistribution []
    (new GaussianReconstructionDistribution ))
  (^GaussianReconstructionDistribution [^org.nd4j.linalg.activations.Activation activation-fn]
    (new GaussianReconstructionDistribution activation-fn)))

(defn has-loss-function?
  "Description copied from interface: ReconstructionDistribution

  returns: true if the reconstruction distribution has a loss function only (and no probabilistic reconstruction distribution) - `boolean`"
  (^Boolean [^GaussianReconstructionDistribution this]
    (-> this (.hasLossFunction))))

(defn distribution-input-size
  "Description copied from interface: ReconstructionDistribution

  data-size - Size of the data. i.e., nIn value - `int`

  returns: Number of distribution parameters for the given reconstruction distribution - `int`"
  (^Integer [^GaussianReconstructionDistribution this ^Integer data-size]
    (-> this (.distributionInputSize data-size))))

(defn neg-log-probability
  "Description copied from interface: ReconstructionDistribution

  x - Data to be modelled (reconstructions) - `org.nd4j.linalg.api.ndarray.INDArray`
  pre-out-distribution-params - Distribution parameters used by this reconstruction distribution (for example,mean and log variance values for Gaussian) - `org.nd4j.linalg.api.ndarray.INDArray`
  average - Whether the log probability should be averaged over the minibatch, or simply summed. - `boolean`

  returns: Average or sum of negative log probability of the reconstruction given the distribution parameters - `double`"
  (^Double [^GaussianReconstructionDistribution this ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray pre-out-distribution-params ^Boolean average]
    (-> this (.negLogProbability x pre-out-distribution-params average))))

(defn example-neg-log-probability
  "Description copied from interface: ReconstructionDistribution

  x - Data to be modelled (reconstructions) - `org.nd4j.linalg.api.ndarray.INDArray`
  pre-out-distribution-params - Distribution parameters used by this reconstruction distribution (for example,mean and log variance values for Gaussian) - before applying activation function - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: Negative log probability of the reconstruction given the distribution parameters, for each example individually.
  Column vector, shape [numExamples, 1] - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^GaussianReconstructionDistribution this ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray pre-out-distribution-params]
    (-> this (.exampleNegLogProbability x pre-out-distribution-params))))

(defn gradient
  "Description copied from interface: ReconstructionDistribution

  x - Data - `org.nd4j.linalg.api.ndarray.INDArray`
  pre-out-distribution-params - Distribution parameters used by this reconstruction distribution (for example,mean and log variance values for Gaussian) - before applying activation function - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: Gradient with respect to the preOutDistributionParams - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^GaussianReconstructionDistribution this ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray pre-out-distribution-params]
    (-> this (.gradient x pre-out-distribution-params))))

(defn generate-random
  "Description copied from interface: ReconstructionDistribution

  pre-out-distribution-params - Distribution parameters used by this reconstruction distribution (for example,mean and log variance values for Gaussian) - before applying activation function - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: A random sample of x given the distribution parameters - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^GaussianReconstructionDistribution this ^org.nd4j.linalg.api.ndarray.INDArray pre-out-distribution-params]
    (-> this (.generateRandom pre-out-distribution-params))))

(defn generate-at-mean
  "Description copied from interface: ReconstructionDistribution

  pre-out-distribution-params - Distribution parameters used by this reconstruction distribution (for example,mean and log variance values for Gaussian) - before applying activation function - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: A deterministic sample of x (mean/expected value) given the distribution parameters - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^GaussianReconstructionDistribution this ^org.nd4j.linalg.api.ndarray.INDArray pre-out-distribution-params]
    (-> this (.generateAtMean pre-out-distribution-params))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^GaussianReconstructionDistribution this]
    (-> this (.toString))))

