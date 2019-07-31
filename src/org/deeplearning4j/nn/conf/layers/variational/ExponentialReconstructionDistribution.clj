(ns org.deeplearning4j.nn.conf.layers.variational.ExponentialReconstructionDistribution
  "Exponential reconstruction distribution.
 Supports data in range [0,infinity)

 Parameterization used here: network models distribution parameter gamma, where gamma = log(lambda), with gamma \\in (-inf, inf)

 This means that an input from the decoder of gamma = 0 gives lambda = 1
 which corresponds to a mean value for the expontial distribution of 1/lambda = 1

 Regarding the choice of activation function: the parameterization above supports gamma in the range (-infinity,infinity)
 therefore a symmetric activation function such as \"identity\" or perhaps \"tanh\" is preferred."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers.variational ExponentialReconstructionDistribution]))

(defn ->exponential-reconstruction-distribution
  "Constructor.

  activation - `org.nd4j.linalg.activations.Activation`"
  (^ExponentialReconstructionDistribution [^org.nd4j.linalg.activations.Activation activation]
    (new ExponentialReconstructionDistribution activation))
  (^ExponentialReconstructionDistribution []
    (new ExponentialReconstructionDistribution )))

(defn has-loss-function?
  "Description copied from interface: ReconstructionDistribution

  returns: true if the reconstruction distribution has a loss function only (and no probabilistic reconstruction distribution) - `boolean`"
  (^Boolean [^ExponentialReconstructionDistribution this]
    (-> this (.hasLossFunction))))

(defn distribution-input-size
  "Description copied from interface: ReconstructionDistribution

  data-size - Size of the data. i.e., nIn value - `int`

  returns: Number of distribution parameters for the given reconstruction distribution - `int`"
  (^Integer [^ExponentialReconstructionDistribution this ^Integer data-size]
    (-> this (.distributionInputSize data-size))))

(defn neg-log-probability
  "Description copied from interface: ReconstructionDistribution

  x - Data to be modelled (reconstructions) - `org.nd4j.linalg.api.ndarray.INDArray`
  pre-out-distribution-params - Distribution parameters used by this reconstruction distribution (for example,mean and log variance values for Gaussian) - `org.nd4j.linalg.api.ndarray.INDArray`
  average - Whether the log probability should be averaged over the minibatch, or simply summed. - `boolean`

  returns: Average or sum of negative log probability of the reconstruction given the distribution parameters - `double`"
  (^Double [^ExponentialReconstructionDistribution this ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray pre-out-distribution-params ^Boolean average]
    (-> this (.negLogProbability x pre-out-distribution-params average))))

(defn example-neg-log-probability
  "Description copied from interface: ReconstructionDistribution

  x - Data to be modelled (reconstructions) - `org.nd4j.linalg.api.ndarray.INDArray`
  pre-out-distribution-params - Distribution parameters used by this reconstruction distribution (for example,mean and log variance values for Gaussian) - before applying activation function - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: Negative log probability of the reconstruction given the distribution parameters, for each example individually.
  Column vector, shape [numExamples, 1] - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^ExponentialReconstructionDistribution this ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray pre-out-distribution-params]
    (-> this (.exampleNegLogProbability x pre-out-distribution-params))))

(defn gradient
  "Description copied from interface: ReconstructionDistribution

  x - Data - `org.nd4j.linalg.api.ndarray.INDArray`
  pre-out-distribution-params - Distribution parameters used by this reconstruction distribution (for example,mean and log variance values for Gaussian) - before applying activation function - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: Gradient with respect to the preOutDistributionParams - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^ExponentialReconstructionDistribution this ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray pre-out-distribution-params]
    (-> this (.gradient x pre-out-distribution-params))))

(defn generate-random
  "Description copied from interface: ReconstructionDistribution

  pre-out-distribution-params - Distribution parameters used by this reconstruction distribution (for example,mean and log variance values for Gaussian) - before applying activation function - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: A random sample of x given the distribution parameters - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^ExponentialReconstructionDistribution this ^org.nd4j.linalg.api.ndarray.INDArray pre-out-distribution-params]
    (-> this (.generateRandom pre-out-distribution-params))))

(defn generate-at-mean
  "Description copied from interface: ReconstructionDistribution

  pre-out-distribution-params - Distribution parameters used by this reconstruction distribution (for example,mean and log variance values for Gaussian) - before applying activation function - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: A deterministic sample of x (mean/expected value) given the distribution parameters - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^ExponentialReconstructionDistribution this ^org.nd4j.linalg.api.ndarray.INDArray pre-out-distribution-params]
    (-> this (.generateAtMean pre-out-distribution-params))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ExponentialReconstructionDistribution this]
    (-> this (.toString))))

