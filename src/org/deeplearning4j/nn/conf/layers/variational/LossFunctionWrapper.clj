(ns org.deeplearning4j.nn.conf.layers.variational.LossFunctionWrapper
  "LossFunctionWrapper allows training of a VAE model with a standard (possibly deterministic) neural network loss function
 for the reconstruction, instead of using a ReconstructionDistribution as would normally be done with a VAE model.

 Note: most functionality is supported, but clearly reconstruction log probability cannot be calculated when using
 LossFunctionWrapper, as ILossFunction instances do not have either (a) a probabilistic interpretation, or (b) a
 means of calculating the negative log probability."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers.variational LossFunctionWrapper]))

(defn ->loss-function-wrapper
  "Constructor.

  activation-fn - `org.nd4j.linalg.activations.IActivation`
  loss-function - `org.nd4j.linalg.lossfunctions.ILossFunction`"
  (^LossFunctionWrapper [^org.nd4j.linalg.activations.IActivation activation-fn ^org.nd4j.linalg.lossfunctions.ILossFunction loss-function]
    (new LossFunctionWrapper activation-fn loss-function)))

(defn has-loss-function?
  "Description copied from interface: ReconstructionDistribution

  returns: true if the reconstruction distribution has a loss function only (and no probabilistic reconstruction distribution) - `boolean`"
  (^Boolean [^LossFunctionWrapper this]
    (-> this (.hasLossFunction))))

(defn distribution-input-size
  "Description copied from interface: ReconstructionDistribution

  data-size - Size of the data. i.e., nIn value - `int`

  returns: Number of distribution parameters for the given reconstruction distribution - `int`"
  (^Integer [^LossFunctionWrapper this ^Integer data-size]
    (-> this (.distributionInputSize data-size))))

(defn neg-log-probability
  "Description copied from interface: ReconstructionDistribution

  x - Data to be modelled (reconstructions) - `org.nd4j.linalg.api.ndarray.INDArray`
  pre-out-distribution-params - Distribution parameters used by this reconstruction distribution (for example, mean and log variance values for Gaussian) - `org.nd4j.linalg.api.ndarray.INDArray`
  average - Whether the log probability should be averaged over the minibatch, or simply summed. - `boolean`

  returns: Average or sum of negative log probability of the reconstruction given the distribution parameters - `double`"
  (^Double [^LossFunctionWrapper this ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray pre-out-distribution-params ^Boolean average]
    (-> this (.negLogProbability x pre-out-distribution-params average))))

(defn example-neg-log-probability
  "Description copied from interface: ReconstructionDistribution

  x - Data to be modelled (reconstructions) - `org.nd4j.linalg.api.ndarray.INDArray`
  pre-out-distribution-params - Distribution parameters used by this reconstruction distribution (for example,mean and log variance values for Gaussian) - before applying activation function - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: Negative log probability of the reconstruction given the distribution parameters, for each example individually.
  Column vector, shape [numExamples, 1] - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^LossFunctionWrapper this ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray pre-out-distribution-params]
    (-> this (.exampleNegLogProbability x pre-out-distribution-params))))

(defn gradient
  "Description copied from interface: ReconstructionDistribution

  x - Data - `org.nd4j.linalg.api.ndarray.INDArray`
  pre-out-distribution-params - Distribution parameters used by this reconstruction distribution (for example,mean and log variance values for Gaussian) - before applying activation function - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: Gradient with respect to the preOutDistributionParams - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^LossFunctionWrapper this ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray pre-out-distribution-params]
    (-> this (.gradient x pre-out-distribution-params))))

(defn generate-random
  "Description copied from interface: ReconstructionDistribution

  pre-out-distribution-params - Distribution parameters used by this reconstruction distribution (for example,mean and log variance values for Gaussian) - before applying activation function - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: A random sample of x given the distribution parameters - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^LossFunctionWrapper this ^org.nd4j.linalg.api.ndarray.INDArray pre-out-distribution-params]
    (-> this (.generateRandom pre-out-distribution-params))))

(defn generate-at-mean
  "Description copied from interface: ReconstructionDistribution

  pre-out-distribution-params - Distribution parameters used by this reconstruction distribution (for example,mean and log variance values for Gaussian) - before applying activation function - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: A deterministic sample of x (mean/expected value) given the distribution parameters - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^LossFunctionWrapper this ^org.nd4j.linalg.api.ndarray.INDArray pre-out-distribution-params]
    (-> this (.generateAtMean pre-out-distribution-params))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^LossFunctionWrapper this]
    (-> this (.toString))))

