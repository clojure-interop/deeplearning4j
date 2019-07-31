(ns org.deeplearning4j.nn.conf.layers.variational.CompositeReconstructionDistribution
  "CompositeReconstructionDistribution is a reconstruction distribution built from multiple other ReconstructionDistribution
 instances.
 The typical use is to combine for example continuous and binary data in the same model, or to combine different
 distributions for continuous variables. In either case, this class allows users to model (for example) the first 10 values
 as continuous/Gaussian (with a GaussianReconstructionDistribution, the next 10 values as binary/Bernoulli (with
 a BernoulliReconstructionDistribution)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers.variational CompositeReconstructionDistribution]))

(defn ->composite-reconstruction-distribution
  "Constructor.

  distribution-sizes - `int[]`
  reconstruction-distributions - `org.deeplearning4j.nn.conf.layers.variational.ReconstructionDistribution[]`
  total-size - `int`"
  (^CompositeReconstructionDistribution [distribution-sizes reconstruction-distributions ^Integer total-size]
    (new CompositeReconstructionDistribution distribution-sizes reconstruction-distributions total-size)))

(defn compute-loss-function-score-array
  "data - `org.nd4j.linalg.api.ndarray.INDArray`
  reconstruction - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^CompositeReconstructionDistribution this ^org.nd4j.linalg.api.ndarray.INDArray data ^org.nd4j.linalg.api.ndarray.INDArray reconstruction]
    (-> this (.computeLossFunctionScoreArray data reconstruction))))

(defn has-loss-function?
  "Description copied from interface: ReconstructionDistribution

  returns: true if the reconstruction distribution has a loss function only (and no probabilistic reconstruction distribution) - `boolean`"
  (^Boolean [^CompositeReconstructionDistribution this]
    (-> this (.hasLossFunction))))

(defn distribution-input-size
  "Description copied from interface: ReconstructionDistribution

  data-size - Size of the data. i.e., nIn value - `int`

  returns: Number of distribution parameters for the given reconstruction distribution - `int`"
  (^Integer [^CompositeReconstructionDistribution this ^Integer data-size]
    (-> this (.distributionInputSize data-size))))

(defn neg-log-probability
  "Description copied from interface: ReconstructionDistribution

  x - Data to be modelled (reconstructions) - `org.nd4j.linalg.api.ndarray.INDArray`
  pre-out-distribution-params - Distribution parameters used by this reconstruction distribution (for example,mean and log variance values for Gaussian) - `org.nd4j.linalg.api.ndarray.INDArray`
  average - Whether the log probability should be averaged over the minibatch, or simply summed. - `boolean`

  returns: Average or sum of negative log probability of the reconstruction given the distribution parameters - `double`"
  (^Double [^CompositeReconstructionDistribution this ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray pre-out-distribution-params ^Boolean average]
    (-> this (.negLogProbability x pre-out-distribution-params average))))

(defn example-neg-log-probability
  "Description copied from interface: ReconstructionDistribution

  x - Data to be modelled (reconstructions) - `org.nd4j.linalg.api.ndarray.INDArray`
  pre-out-distribution-params - Distribution parameters used by this reconstruction distribution (for example,mean and log variance values for Gaussian) - before applying activation function - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: Negative log probability of the reconstruction given the distribution parameters, for each example individually.
  Column vector, shape [numExamples, 1] - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^CompositeReconstructionDistribution this ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray pre-out-distribution-params]
    (-> this (.exampleNegLogProbability x pre-out-distribution-params))))

(defn gradient
  "Description copied from interface: ReconstructionDistribution

  x - Data - `org.nd4j.linalg.api.ndarray.INDArray`
  pre-out-distribution-params - Distribution parameters used by this reconstruction distribution (for example,mean and log variance values for Gaussian) - before applying activation function - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: Gradient with respect to the preOutDistributionParams - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^CompositeReconstructionDistribution this ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray pre-out-distribution-params]
    (-> this (.gradient x pre-out-distribution-params))))

(defn generate-random
  "Description copied from interface: ReconstructionDistribution

  pre-out-distribution-params - Distribution parameters used by this reconstruction distribution (for example,mean and log variance values for Gaussian) - before applying activation function - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: A random sample of x given the distribution parameters - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^CompositeReconstructionDistribution this ^org.nd4j.linalg.api.ndarray.INDArray pre-out-distribution-params]
    (-> this (.generateRandom pre-out-distribution-params))))

(defn generate-at-mean
  "Description copied from interface: ReconstructionDistribution

  pre-out-distribution-params - Distribution parameters used by this reconstruction distribution (for example,mean and log variance values for Gaussian) - before applying activation function - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: A deterministic sample of x (mean/expected value) given the distribution parameters - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^CompositeReconstructionDistribution this ^org.nd4j.linalg.api.ndarray.INDArray pre-out-distribution-params]
    (-> this (.generateAtMean pre-out-distribution-params))))

