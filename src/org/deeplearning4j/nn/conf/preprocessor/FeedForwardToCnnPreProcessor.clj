(ns org.deeplearning4j.nn.conf.preprocessor.FeedForwardToCnnPreProcessor
  "A preprocessor to allow CNN and standard feed-forward network layers to be used together.
 For example, DenseLayer -> CNN
 This does two things:
 (a) Reshapes activations out of FeedFoward layer (which is 2D or 3D with shape
 [numExamples, inputHeight*inputWidth*numChannels]) into 4d activations (with shape
 [numExamples, numChannels, inputHeight, inputWidth]) suitable to feed into CNN layers.
 (b) Reshapes 4d epsilons (weights*deltas) from CNN layer, with shape
 [numExamples, numChannels, inputHeight, inputWidth]) into 2d epsilons (with shape
 [numExamples, inputHeight*inputWidth*numChannels]) for use in feed forward layer
 Note: numChannels is equivalent to channels or featureMaps referenced in different literature"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.preprocessor FeedForwardToCnnPreProcessor]))

(defn ->feed-forward-to-cnn-pre-processor
  "Constructor.

  Reshape to a channels x rows x columns tensor

  input-height - the columns - `long`
  input-width - the rows - `long`
  num-channels - the channels - `long`"
  (^FeedForwardToCnnPreProcessor [^Long input-height ^Long input-width ^Long num-channels]
    (new FeedForwardToCnnPreProcessor input-height input-width num-channels))
  (^FeedForwardToCnnPreProcessor [^Long input-width ^Long input-height]
    (new FeedForwardToCnnPreProcessor input-width input-height)))

(defn pre-process
  "Description copied from interface: InputPreProcessor

  input - the input to pre preProcess - `org.nd4j.linalg.api.ndarray.INDArray`
  mini-batch-size - Minibatch size - `int`
  workspace-mgr - Workspace manager - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: the processed input. Note that the returned array should be placed in the
  ArrayType.ACTIVATIONS workspace via the workspace manager - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^FeedForwardToCnnPreProcessor this ^org.nd4j.linalg.api.ndarray.INDArray input ^Integer mini-batch-size ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.preProcess input mini-batch-size workspace-mgr))))

(defn backprop
  "Description copied from interface: InputPreProcessor

  epsilons - which is a pair of the gradient and epsilon - `org.nd4j.linalg.api.ndarray.INDArray`
  mini-batch-size - Minibatch size - `int`
  workspace-mgr - Workspace manager - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: the reverse of the pre preProcess step (if any). Note that the returned array should be
  placed in ArrayType.ACTIVATION_GRAD workspace via the
  workspace manager - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^FeedForwardToCnnPreProcessor this ^org.nd4j.linalg.api.ndarray.INDArray epsilons ^Integer mini-batch-size ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.backprop epsilons mini-batch-size workspace-mgr))))

(defn clone
  "returns: `org.deeplearning4j.nn.conf.preprocessor.FeedForwardToCnnPreProcessor`"
  (^org.deeplearning4j.nn.conf.preprocessor.FeedForwardToCnnPreProcessor [^FeedForwardToCnnPreProcessor this]
    (-> this (.clone))))

(defn get-output-type
  "Description copied from interface: InputPreProcessor

  input-type - Type of input for the preprocessor - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: Type of input after applying the preprocessor - `org.deeplearning4j.nn.conf.inputs.InputType`"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^FeedForwardToCnnPreProcessor this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType input-type))))

(defn feed-forward-mask-array
  "mask-array - `org.nd4j.linalg.api.ndarray.INDArray`
  current-mask-state - `org.deeplearning4j.nn.api.MaskState`
  minibatch-size - `int`

  returns: `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,org.deeplearning4j.nn.api.MaskState>`"
  (^org.nd4j.linalg.primitives.Pair [^FeedForwardToCnnPreProcessor this ^org.nd4j.linalg.api.ndarray.INDArray mask-array ^org.deeplearning4j.nn.api.MaskState current-mask-state ^Integer minibatch-size]
    (-> this (.feedForwardMaskArray mask-array current-mask-state minibatch-size))))

