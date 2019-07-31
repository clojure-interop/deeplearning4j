(ns org.deeplearning4j.nn.conf.preprocessor.RnnToFeedForwardPreProcessor
  "A preprocessor to allow RNN and feed-forward network layers to be used together.
 For example, GravesLSTM -> OutputLayer or GravesLSTM -> DenseLayer
 This does two things:
 (a) Reshapes activations out of RNN layer (which is 3D with shape
 [miniBatchSize,layerSize,timeSeriesLength]) into 2d activations (with shape
 [miniBatchSize*timeSeriesLength,layerSize]) suitable for use in feed-forward layers.
 (b) Reshapes 2d epsilons (weights*deltas from feed forward layer, with shape
 [miniBatchSize*timeSeriesLength,layerSize]) into 3d epsilons (with shape
 [miniBatchSize,layerSize,timeSeriesLength]) for use in RNN layer"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.preprocessor RnnToFeedForwardPreProcessor]))

(defn ->rnn-to-feed-forward-pre-processor
  "Constructor."
  (^RnnToFeedForwardPreProcessor []
    (new RnnToFeedForwardPreProcessor )))

(defn pre-process
  "Description copied from interface: InputPreProcessor

  input - the input to pre preProcess - `org.nd4j.linalg.api.ndarray.INDArray`
  mini-batch-size - Minibatch size - `int`
  workspace-mgr - Workspace manager - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: the processed input. Note that the returned array should be placed in the
  ArrayType.ACTIVATIONS workspace via the workspace manager - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^RnnToFeedForwardPreProcessor this ^org.nd4j.linalg.api.ndarray.INDArray input ^Integer mini-batch-size ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.preProcess input mini-batch-size workspace-mgr))))

(defn backprop
  "Description copied from interface: InputPreProcessor

  output - which is a pair of the gradient and epsilon - `org.nd4j.linalg.api.ndarray.INDArray`
  mini-batch-size - Minibatch size - `int`
  workspace-mgr - Workspace manager - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: the reverse of the pre preProcess step (if any). Note that the returned array should be
  placed in ArrayType.ACTIVATION_GRAD workspace via the
  workspace manager - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^RnnToFeedForwardPreProcessor this ^org.nd4j.linalg.api.ndarray.INDArray output ^Integer mini-batch-size ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.backprop output mini-batch-size workspace-mgr))))

(defn clone
  "returns: `org.deeplearning4j.nn.conf.preprocessor.RnnToFeedForwardPreProcessor`"
  (^org.deeplearning4j.nn.conf.preprocessor.RnnToFeedForwardPreProcessor [^RnnToFeedForwardPreProcessor this]
    (-> this (.clone))))

(defn get-output-type
  "Description copied from interface: InputPreProcessor

  input-type - Type of input for the preprocessor - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: Type of input after applying the preprocessor - `org.deeplearning4j.nn.conf.inputs.InputType`"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^RnnToFeedForwardPreProcessor this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType input-type))))

(defn feed-forward-mask-array
  "mask-array - `org.nd4j.linalg.api.ndarray.INDArray`
  current-mask-state - `org.deeplearning4j.nn.api.MaskState`
  minibatch-size - `int`

  returns: `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,org.deeplearning4j.nn.api.MaskState>`"
  (^org.nd4j.linalg.primitives.Pair [^RnnToFeedForwardPreProcessor this ^org.nd4j.linalg.api.ndarray.INDArray mask-array ^org.deeplearning4j.nn.api.MaskState current-mask-state ^Integer minibatch-size]
    (-> this (.feedForwardMaskArray mask-array current-mask-state minibatch-size))))

