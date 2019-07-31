(ns org.deeplearning4j.nn.conf.preprocessor.FeedForwardToCnn3DPreProcessor
  "A preprocessor to allow 3D CNN and standard feed-forward network layers to be used together.
 For example, DenseLayer -> Convolution3D
 This does two things:
 (a) Reshapes activations out of FeedFoward layer (which is 2D with shape
 [numExamples, inputDepth*inputHeight*inputWidth*numChannels]) into 5d activations (with shape
 [numExamples, numChannels, inputDepth, inputHeight, inputWidth]) suitable to feed into CNN layers.
 (b) Reshapes 5d epsilons from 3D CNN layer, with shape
 [numExamples, numChannels, inputDepth, inputHeight, inputWidth]) into 2d epsilons (with shape
 [numExamples, inputDepth*inputHeight*inputWidth*numChannels]) for use in feed forward layer"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.preprocessor FeedForwardToCnn3DPreProcessor]))

(defn ->feed-forward-to-cnn-3-d-pre-processor
  "Constructor.

  input-depth - input channels - `int`
  input-height - input height - `int`
  input-width - input width - `int`
  num-channels - input channels - `int`
  is-ncdhw - boolean to indicate data format, i.e. channels first (NCDHW) vs. channels last (NDHWC) - `boolean`"
  (^FeedForwardToCnn3DPreProcessor [^Integer input-depth ^Integer input-height ^Integer input-width ^Integer num-channels ^Boolean is-ncdhw]
    (new FeedForwardToCnn3DPreProcessor input-depth input-height input-width num-channels is-ncdhw))
  (^FeedForwardToCnn3DPreProcessor [^Integer input-depth ^Integer input-width ^Integer input-height]
    (new FeedForwardToCnn3DPreProcessor input-depth input-width input-height)))

(defn pre-process
  "Description copied from interface: InputPreProcessor

  input - the input to pre preProcess - `org.nd4j.linalg.api.ndarray.INDArray`
  mini-batch-size - Minibatch size - `int`
  workspace-mgr - Workspace manager - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: the processed input. Note that the returned array should be placed in the
  ArrayType.ACTIVATIONS workspace via the workspace manager - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^FeedForwardToCnn3DPreProcessor this ^org.nd4j.linalg.api.ndarray.INDArray input ^Integer mini-batch-size ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.preProcess input mini-batch-size workspace-mgr))))

(defn backprop
  "Description copied from interface: InputPreProcessor

  epsilons - which is a pair of the gradient and epsilon - `org.nd4j.linalg.api.ndarray.INDArray`
  mini-batch-size - Minibatch size - `int`
  workspace-mgr - Workspace manager - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: the reverse of the pre preProcess step (if any). Note that the returned array should be
  placed in ArrayType.ACTIVATION_GRAD workspace via the
  workspace manager - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^FeedForwardToCnn3DPreProcessor this ^org.nd4j.linalg.api.ndarray.INDArray epsilons ^Integer mini-batch-size ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.backprop epsilons mini-batch-size workspace-mgr))))

(defn clone
  "returns: `org.deeplearning4j.nn.conf.preprocessor.FeedForwardToCnn3DPreProcessor`"
  (^org.deeplearning4j.nn.conf.preprocessor.FeedForwardToCnn3DPreProcessor [^FeedForwardToCnn3DPreProcessor this]
    (-> this (.clone))))

(defn get-output-type
  "Description copied from interface: InputPreProcessor

  input-type - Type of input for the preprocessor - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: Type of input after applying the preprocessor - `org.deeplearning4j.nn.conf.inputs.InputType`"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^FeedForwardToCnn3DPreProcessor this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType input-type))))

(defn feed-forward-mask-array
  "mask-array - `org.nd4j.linalg.api.ndarray.INDArray`
  current-mask-state - `org.deeplearning4j.nn.api.MaskState`
  minibatch-size - `int`

  returns: `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,org.deeplearning4j.nn.api.MaskState>`"
  (^org.nd4j.linalg.primitives.Pair [^FeedForwardToCnn3DPreProcessor this ^org.nd4j.linalg.api.ndarray.INDArray mask-array ^org.deeplearning4j.nn.api.MaskState current-mask-state ^Integer minibatch-size]
    (-> this (.feedForwardMaskArray mask-array current-mask-state minibatch-size))))

