(ns org.nd4j.linalg.lossfunctions.impl.LossMixtureDensity
  "This is a cost function associated with a mixture-density network.
 For background, this is inspired by Bishop's work pioneering the mixture
 density network. The essence of the idea is that the cost function attempts
 to model the output as if it were a mixture of gaussian probability
 densities. The network attempts to converge on a cost function which
 involves the negative log likelihood of the output fitting a set of data
 and estimates the \"alpha\" contribution to of each of the distributions
 the 'mu' (mean) and 'sigma' (standard deviation) of each of the
 distributions.
 For a full description of the technique, refer to Bishop's work.
 Bishop CM. Mixture density networks,
 Neural Computing Research Group Report:
 NCRG/94/004, Aston University, Birmingham, 1994
 https://www.microsoft.com/en-us/research/wp-content/uploads/2016/02/bishop-ncrg-94-004.pdf
 There is no public constructor, please use the builder to create an
 approriate mixture loss function for the number of outputs and number
 of mixtures you would like to fit.
 Note that this means that the output
 layer must provide (labelWidth+2)*mixtures output values in order to describe
 the distributions of vectors of width labelWidth.
 Please ensure that the size of the output layer matches the number of
 mixtures provided."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.lossfunctions.impl LossMixtureDensity]))

(defn ->loss-mixture-density
  "Constructor."
  (^LossMixtureDensity []
    (new LossMixtureDensity )))

(defn *builder
  "returns: `org.nd4j.linalg.lossfunctions.impl.LossMixtureDensity$Builder`"
  (^org.nd4j.linalg.lossfunctions.impl.LossMixtureDensity$Builder []
    (LossMixtureDensity/builder )))

(defn op-type
  "Description copied from class: DifferentialFunction

  returns: `org.nd4j.linalg.api.ops.Op$Type`"
  (^org.nd4j.linalg.api.ops.Op$Type [^LossMixtureDensity this]
    (-> this (.opType))))

(defn compute-gradient-and-score
  "Description copied from interface: ILossFunction

  labels - Label/expected output - `org.nd4j.linalg.api.ndarray.INDArray`
  pre-output - Output of the model (neural network) - `org.nd4j.linalg.api.ndarray.INDArray`
  activation-fn - Activation function that should be applied to preOutput - `org.nd4j.linalg.activations.IActivation`
  mask - Mask array; may be null - `org.nd4j.linalg.api.ndarray.INDArray`
  average - Whether the score should be averaged (divided by number of rows in labels/output) or not - `boolean`

  returns: The score (loss function value) and gradient - `org.nd4j.linalg.primitives.Pair<java.lang.Double,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^org.nd4j.linalg.primitives.Pair [^LossMixtureDensity this ^org.nd4j.linalg.api.ndarray.INDArray labels ^org.nd4j.linalg.api.ndarray.INDArray pre-output ^org.nd4j.linalg.activations.IActivation activation-fn ^org.nd4j.linalg.api.ndarray.INDArray mask ^Boolean average]
    (-> this (.computeGradientAndScore labels pre-output activation-fn mask average))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^LossMixtureDensity this]
    (-> this (.opName))))

(defn init-from-onnx
  "Description copied from class: DifferentialFunction

  node - `onnx.OnnxProto3$NodeProto`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `onnx.OnnxProto3$GraphProto`"
  ([^LossMixtureDensity this ^onnx.OnnxProto3$NodeProto node ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^onnx.OnnxProto3$GraphProto graph]
    (-> this (.initFromOnnx node init-with attributes-for-node graph))))

(defn compute-score
  "Computes the aggregate score as a sum of all of the individual scores of
  each of the labels against each of the outputs of the network. For
  the mixture density network, this is the negative log likelihood that
  the given labels fall within the probability distribution described by
  the mixture of gaussians of the network output.

  labels - Labels to score against the network. - `org.nd4j.linalg.api.ndarray.INDArray`
  pre-output - Output of the network (before activation function has been called). - `org.nd4j.linalg.api.ndarray.INDArray`
  activation-fn - Activation function for the network. - `org.nd4j.linalg.activations.IActivation`
  mask - Mask to be applied to labels (not used for MDN). - `org.nd4j.linalg.api.ndarray.INDArray`
  average - Whether or not to return an average instead of a total score (not used). - `boolean`

  returns: Returns a single double which corresponds to the total score of all label values. - `double`"
  (^Double [^LossMixtureDensity this ^org.nd4j.linalg.api.ndarray.INDArray labels ^org.nd4j.linalg.api.ndarray.INDArray pre-output ^org.nd4j.linalg.activations.IActivation activation-fn ^org.nd4j.linalg.api.ndarray.INDArray mask ^Boolean average]
    (-> this (.computeScore labels pre-output activation-fn mask average))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^LossMixtureDensity this]
    (-> this (.toString))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^LossMixtureDensity this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

(defn extract-components
  "output - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.lossfunctions.impl.LossMixtureDensity$MixtureDensityComponents`"
  (^org.nd4j.linalg.lossfunctions.impl.LossMixtureDensity$MixtureDensityComponents [^LossMixtureDensity this ^org.nd4j.linalg.api.ndarray.INDArray output]
    (-> this (.extractComponents output))))

(defn compute-gradient
  "This method returns the gradient of the cost function with respect to the
  output from the previous layer. For this cost function, the gradient
  is derived from Bishop's paper \"Mixture Density Networks\" (1994) which
  gives an elegant closed-form expression for the derivatives with respect
  to each of the output components.

  labels - Labels to train on. - `org.nd4j.linalg.api.ndarray.INDArray`
  pre-output - Output of neural network before applying the final activation function. - `org.nd4j.linalg.api.ndarray.INDArray`
  activation-fn - Activation function of output layer. - `org.nd4j.linalg.activations.IActivation`
  mask - Mask to apply to gradients. - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: Gradient of cost function with respect to preOutput parameters. - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^LossMixtureDensity this ^org.nd4j.linalg.api.ndarray.INDArray labels ^org.nd4j.linalg.api.ndarray.INDArray pre-output ^org.nd4j.linalg.activations.IActivation activation-fn ^org.nd4j.linalg.api.ndarray.INDArray mask]
    (-> this (.computeGradient labels pre-output activation-fn mask))))

(defn name
  "The opName of this function

  returns: `java.lang.String`"
  (^java.lang.String [^LossMixtureDensity this]
    (-> this (.name))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^LossMixtureDensity this]
    (-> this (.tensorflowName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^LossMixtureDensity this]
    (-> this (.onnxName))))

(defn output-variables
  "Description copied from class: DifferentialFunction

  base-name - `java.lang.String`

  returns: `org.nd4j.autodiff.samediff.SDVariable[]`"
  ([^LossMixtureDensity this ^java.lang.String base-name]
    (-> this (.outputVariables base-name)))
  ([^LossMixtureDensity this]
    (-> this (.outputVariables))))

(defn compute-score-array
  "This method returns the score for each of the given outputs against the
  given set of labels. For a mixture density network, this is done by
  extracting the \"alpha\", \"mu\", and \"sigma\" components of each gaussian
  and computing the negative log likelihood that the labels fall within
  a linear combination of these gaussian distributions. The smaller
  the negative log likelihood, the higher the probability that the given
  labels actually would fall within the distribution. Therefore by
  minimizing the negative log likelihood, we get to a position of highest
  probability that the gaussian mixture explains the phenomenon.

  labels - Labels give the sample output that the network shouldbe trying to converge on. - `org.nd4j.linalg.api.ndarray.INDArray`
  pre-output - The output of the last layer (before applying the activation function). - `org.nd4j.linalg.api.ndarray.INDArray`
  activation-fn - The activation function of the current layer. - `org.nd4j.linalg.activations.IActivation`
  mask - Mask to apply to score evaluation (not supported for this cost function). - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^LossMixtureDensity this ^org.nd4j.linalg.api.ndarray.INDArray labels ^org.nd4j.linalg.api.ndarray.INDArray pre-output ^org.nd4j.linalg.activations.IActivation activation-fn ^org.nd4j.linalg.api.ndarray.INDArray mask]
    (-> this (.computeScoreArray labels pre-output activation-fn mask))))

(defn init-from-tensor-flow
  "Description copied from class: DifferentialFunction

  node-def - `org.tensorflow.framework.NodeDef`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `org.tensorflow.framework.GraphDef`"
  ([^LossMixtureDensity this ^org.tensorflow.framework.NodeDef node-def ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^org.tensorflow.framework.GraphDef graph]
    (-> this (.initFromTensorFlow node-def init-with attributes-for-node graph))))

(defn get-n-mixtures
  "Returns the number of gaussians this loss function
  will attempt to find.

  returns: Number of gaussians to find. - `int`"
  (^Integer [^LossMixtureDensity this]
    (-> this (.getNMixtures))))

(defn get-label-width
  "Returns the width of each label vector.

  returns: Width of label vectors expected. - `int`"
  (^Integer [^LossMixtureDensity this]
    (-> this (.getLabelWidth))))

