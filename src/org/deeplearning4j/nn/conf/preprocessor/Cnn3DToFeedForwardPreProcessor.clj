(ns org.deeplearning4j.nn.conf.preprocessor.Cnn3DToFeedForwardPreProcessor
  "A preprocessor to allow CNN and standard feed-forward network layers to be used together.
 For example, CNN3D -> Denselayer
 This does two things:
 (b) Reshapes 5d activations out of CNN layer, with shape
 [numExamples, numChannels, inputDepth, inputHeight, inputWidth]) into 2d activations (with shape
 [numExamples, inputDepth*inputHeight*inputWidth*numChannels]) for use in feed forward layer
 (a) Reshapes epsilons (weights*deltas) out of FeedFoward layer (which is 2D or 3D with shape
 [numExamples, inputDepth* inputHeight*inputWidth*numChannels]) into 5d epsilons (with shape
 [numExamples, numChannels, inputDepth, inputHeight, inputWidth]) suitable to feed into CNN layers.
 Note: numChannels is equivalent to featureMaps referenced in different literature"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.preprocessor Cnn3DToFeedForwardPreProcessor]))

(defn ->cnn-3-d-to-feed-forward-pre-processor
  "Constructor.

  input-depth - input channels - `long`
  input-height - input height - `long`
  input-width - input width - `long`
  num-channels - input channels - `long`
  is-ncdhw - boolean to indicate data format, i.e. channels first (NCDHW) vs. channels last (NDHWC) - `boolean`"
  (^Cnn3DToFeedForwardPreProcessor [^Long input-depth ^Long input-height ^Long input-width ^Long num-channels ^Boolean is-ncdhw]
    (new Cnn3DToFeedForwardPreProcessor input-depth input-height input-width num-channels is-ncdhw))
  (^Cnn3DToFeedForwardPreProcessor [^Integer input-depth ^Integer input-height ^Integer input-width]
    (new Cnn3DToFeedForwardPreProcessor input-depth input-height input-width))
  (^Cnn3DToFeedForwardPreProcessor []
    (new Cnn3DToFeedForwardPreProcessor )))

(defn pre-process
  "Description copied from interface: InputPreProcessor

  input - the input to pre preProcess - `org.nd4j.linalg.api.ndarray.INDArray`
  mini-batch-size - Minibatch size - `int`
  workspace-mgr - Workspace manager - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: the processed input. Note that the returned array should be placed in the
  ArrayType.ACTIVATIONS workspace via the workspace manager - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Cnn3DToFeedForwardPreProcessor this ^org.nd4j.linalg.api.ndarray.INDArray input ^Integer mini-batch-size ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.preProcess input mini-batch-size workspace-mgr))))

(defn backprop
  "Description copied from interface: InputPreProcessor

  epsilons - which is a pair of the gradient and epsilon - `org.nd4j.linalg.api.ndarray.INDArray`
  mini-batch-size - Minibatch size - `int`
  workspace-mgr - Workspace manager - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: the reverse of the pre preProcess step (if any). Note that the returned array should be
  placed in ArrayType.ACTIVATION_GRAD workspace via the
  workspace manager - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Cnn3DToFeedForwardPreProcessor this ^org.nd4j.linalg.api.ndarray.INDArray epsilons ^Integer mini-batch-size ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.backprop epsilons mini-batch-size workspace-mgr))))

(defn clone
  "returns: `org.deeplearning4j.nn.conf.preprocessor.Cnn3DToFeedForwardPreProcessor`"
  (^org.deeplearning4j.nn.conf.preprocessor.Cnn3DToFeedForwardPreProcessor [^Cnn3DToFeedForwardPreProcessor this]
    (-> this (.clone))))

(defn get-output-type
  "Description copied from interface: InputPreProcessor

  input-type - Type of input for the preprocessor - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: Type of input after applying the preprocessor - `org.deeplearning4j.nn.conf.inputs.InputType`"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^Cnn3DToFeedForwardPreProcessor this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType input-type))))

(defn feed-forward-mask-array
  "mask-array - `org.nd4j.linalg.api.ndarray.INDArray`
  current-mask-state - `org.deeplearning4j.nn.api.MaskState`
  minibatch-size - `int`

  returns: `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,org.deeplearning4j.nn.api.MaskState>`"
  (^org.nd4j.linalg.primitives.Pair [^Cnn3DToFeedForwardPreProcessor this ^org.nd4j.linalg.api.ndarray.INDArray mask-array ^org.deeplearning4j.nn.api.MaskState current-mask-state ^Integer minibatch-size]
    (-> this (.feedForwardMaskArray mask-array current-mask-state minibatch-size))))

