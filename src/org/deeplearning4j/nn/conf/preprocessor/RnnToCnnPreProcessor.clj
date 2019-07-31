(ns org.deeplearning4j.nn.conf.preprocessor.RnnToCnnPreProcessor
  "A preprocessor to allow RNN and CNN layers to be used together
 For example, time series (video) input -> ConvolutionLayer, or conceivable GravesLSTM -> ConvolutionLayer
 Functionally equivalent to combining RnnToFeedForwardPreProcessor  FeedForwardToCnnPreProcessor
 Specifically, this does two things:
 (a) Reshape 3d activations out of RNN layer, with shape [miniBatchSize, numChannels*inputHeight*inputWidth, timeSeriesLength])
 into 4d (CNN) activations (with shape [numExamples*timeSeriesLength, numChannels, inputWidth, inputHeight])
 (b) Reshapes 4d epsilons (weights.*deltas) out of CNN layer (with shape
 [numExamples*timeSeriesLength, numChannels, inputHeight, inputWidth]) into 3d epsilons with shape
 [miniBatchSize, numChannels*inputHeight*inputWidth, timeSeriesLength] suitable to feed into CNN layers.
 Note: numChannels is equivalent to depth or featureMaps referenced in different literature"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.preprocessor RnnToCnnPreProcessor]))

(defn ->rnn-to-cnn-pre-processor
  "Constructor.

  input-height - `int`
  input-width - `int`
  num-channels - `int`"
  (^RnnToCnnPreProcessor [^Integer input-height ^Integer input-width ^Integer num-channels]
    (new RnnToCnnPreProcessor input-height input-width num-channels)))

(defn pre-process
  "Description copied from interface: InputPreProcessor

  input - the input to pre preProcess - `org.nd4j.linalg.api.ndarray.INDArray`
  mini-batch-size - Minibatch size - `int`
  workspace-mgr - Workspace manager - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: the processed input. Note that the returned array should be placed in the
  ArrayType.ACTIVATIONS workspace via the workspace manager - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^RnnToCnnPreProcessor this ^org.nd4j.linalg.api.ndarray.INDArray input ^Integer mini-batch-size ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.preProcess input mini-batch-size workspace-mgr))))

(defn backprop
  "Description copied from interface: InputPreProcessor

  output - which is a pair of the gradient and epsilon - `org.nd4j.linalg.api.ndarray.INDArray`
  mini-batch-size - Minibatch size - `int`
  workspace-mgr - Workspace manager - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: the reverse of the pre preProcess step (if any). Note that the returned array should be
  placed in ArrayType.ACTIVATION_GRAD workspace via the
  workspace manager - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^RnnToCnnPreProcessor this ^org.nd4j.linalg.api.ndarray.INDArray output ^Integer mini-batch-size ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.backprop output mini-batch-size workspace-mgr))))

(defn clone
  "returns: `org.deeplearning4j.nn.conf.preprocessor.RnnToCnnPreProcessor`"
  (^org.deeplearning4j.nn.conf.preprocessor.RnnToCnnPreProcessor [^RnnToCnnPreProcessor this]
    (-> this (.clone))))

(defn get-output-type
  "Description copied from interface: InputPreProcessor

  input-type - Type of input for the preprocessor - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: Type of input after applying the preprocessor - `org.deeplearning4j.nn.conf.inputs.InputType`"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^RnnToCnnPreProcessor this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType input-type))))

(defn feed-forward-mask-array
  "mask-array - `org.nd4j.linalg.api.ndarray.INDArray`
  current-mask-state - `org.deeplearning4j.nn.api.MaskState`
  minibatch-size - `int`

  returns: `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,org.deeplearning4j.nn.api.MaskState>`"
  (^org.nd4j.linalg.primitives.Pair [^RnnToCnnPreProcessor this ^org.nd4j.linalg.api.ndarray.INDArray mask-array ^org.deeplearning4j.nn.api.MaskState current-mask-state ^Integer minibatch-size]
    (-> this (.feedForwardMaskArray mask-array current-mask-state minibatch-size))))

