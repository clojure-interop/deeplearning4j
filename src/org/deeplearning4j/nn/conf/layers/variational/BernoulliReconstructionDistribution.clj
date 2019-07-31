(ns org.deeplearning4j.nn.conf.layers.variational.BernoulliReconstructionDistribution
  "Bernoulli reconstruction distribution for variational autoencoder.
 Outputs are modelled by a Bernoulli distribution - i.e., the Bernoulli distribution should be used for binary data (all
 values 0 or 1); the VAE models the probability of the output being 0 or 1.
 Consequently, the sigmoid activation function should be used to bound activations to the range of 0 to 1. Activation
 functions that do not produce outputs in the range of 0 to 1 (including relu, tanh, and many others) should be avoided."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers.variational BernoulliReconstructionDistribution]))

(defn ->bernoulli-reconstruction-distribution
  "Constructor.

  Create a BernoulliReconstructionDistribution with the default Sigmoid activation function"
  (^BernoulliReconstructionDistribution []
    (new BernoulliReconstructionDistribution ))
  (^BernoulliReconstructionDistribution [^org.nd4j.linalg.activations.Activation activation-fn]
    (new BernoulliReconstructionDistribution activation-fn)))

(defn has-loss-function?
  "Description copied from interface: ReconstructionDistribution

  returns: true if the reconstruction distribution has a loss function only (and no probabilistic reconstruction distribution) - `boolean`"
  (^Boolean [^BernoulliReconstructionDistribution this]
    (-> this (.hasLossFunction))))

(defn distribution-input-size
  "Description copied from interface: ReconstructionDistribution

  data-size - Size of the data. i.e., nIn value - `int`

  returns: Number of distribution parameters for the given reconstruction distribution - `int`"
  (^Integer [^BernoulliReconstructionDistribution this ^Integer data-size]
    (-> this (.distributionInputSize data-size))))

(defn neg-log-probability
  "Description copied from interface: ReconstructionDistribution

  x - Data to be modelled (reconstructions) - `org.nd4j.linalg.api.ndarray.INDArray`
  pre-out-distribution-params - Distribution parameters used by this reconstruction distribution (for example,mean and log variance values for Gaussian) - `org.nd4j.linalg.api.ndarray.INDArray`
  average - Whether the log probability should be averaged over the minibatch, or simply summed. - `boolean`

  returns: Average or sum of negative log probability of the reconstruction given the distribution parameters - `double`"
  (^Double [^BernoulliReconstructionDistribution this ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray pre-out-distribution-params ^Boolean average]
    (-> this (.negLogProbability x pre-out-distribution-params average))))

(defn example-neg-log-probability
  "Description copied from interface: ReconstructionDistribution

  x - Data to be modelled (reconstructions) - `org.nd4j.linalg.api.ndarray.INDArray`
  pre-out-distribution-params - Distribution parameters used by this reconstruction distribution (for example,mean and log variance values for Gaussian) - before applying activation function - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: Negative log probability of the reconstruction given the distribution parameters, for each example individually.
  Column vector, shape [numExamples, 1] - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BernoulliReconstructionDistribution this ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray pre-out-distribution-params]
    (-> this (.exampleNegLogProbability x pre-out-distribution-params))))

(defn gradient
  "Description copied from interface: ReconstructionDistribution

  x - Data - `org.nd4j.linalg.api.ndarray.INDArray`
  pre-out-distribution-params - Distribution parameters used by this reconstruction distribution (for example,mean and log variance values for Gaussian) - before applying activation function - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: Gradient with respect to the preOutDistributionParams - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BernoulliReconstructionDistribution this ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray pre-out-distribution-params]
    (-> this (.gradient x pre-out-distribution-params))))

(defn generate-random
  "Description copied from interface: ReconstructionDistribution

  pre-out-distribution-params - Distribution parameters used by this reconstruction distribution (for example,mean and log variance values for Gaussian) - before applying activation function - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: A random sample of x given the distribution parameters - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BernoulliReconstructionDistribution this ^org.nd4j.linalg.api.ndarray.INDArray pre-out-distribution-params]
    (-> this (.generateRandom pre-out-distribution-params))))

(defn generate-at-mean
  "Description copied from interface: ReconstructionDistribution

  pre-out-distribution-params - Distribution parameters used by this reconstruction distribution (for example,mean and log variance values for Gaussian) - before applying activation function - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: A deterministic sample of x (mean/expected value) given the distribution parameters - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BernoulliReconstructionDistribution this ^org.nd4j.linalg.api.ndarray.INDArray pre-out-distribution-params]
    (-> this (.generateAtMean pre-out-distribution-params))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BernoulliReconstructionDistribution this]
    (-> this (.toString))))

