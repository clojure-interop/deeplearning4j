(ns org.deeplearning4j.nn.conf.InputPreProcessor
  "Input pre processor used
 for pre processing input before passing it
 to the neural network."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf InputPreProcessor]))

(defn pre-process
  "Pre preProcess input/activations for a multi layer network

  input - the input to pre preProcess - `org.nd4j.linalg.api.ndarray.INDArray`
  mini-batch-size - Minibatch size - `int`
  workspace-mgr - Workspace manager - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: the processed input. Note that the returned array should be placed in the
  ArrayType.ACTIVATIONS workspace via the workspace manager - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^InputPreProcessor this ^org.nd4j.linalg.api.ndarray.INDArray input ^Integer mini-batch-size ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.preProcess input mini-batch-size workspace-mgr))))

(defn backprop
  "Reverse the preProcess during backprop. Process Gradient/epsilons before
  passing them to the layer below.

  output - which is a pair of the gradient and epsilon - `org.nd4j.linalg.api.ndarray.INDArray`
  mini-batch-size - Minibatch size - `int`
  workspace-mgr - Workspace manager - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: the reverse of the pre preProcess step (if any). Note that the returned array should be
  placed in ArrayType.ACTIVATION_GRAD workspace via the
  workspace manager - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^InputPreProcessor this ^org.nd4j.linalg.api.ndarray.INDArray output ^Integer mini-batch-size ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.backprop output mini-batch-size workspace-mgr))))

(defn clone
  "returns: `org.deeplearning4j.nn.conf.InputPreProcessor`"
  (^org.deeplearning4j.nn.conf.InputPreProcessor [^InputPreProcessor this]
    (-> this (.clone))))

(defn get-output-type
  "For a given type of input to this preprocessor, what is the type of the output?

  input-type - Type of input for the preprocessor - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: Type of input after applying the preprocessor - `org.deeplearning4j.nn.conf.inputs.InputType`"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^InputPreProcessor this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType input-type))))

(defn feed-forward-mask-array
  "mask-array - `org.nd4j.linalg.api.ndarray.INDArray`
  current-mask-state - `org.deeplearning4j.nn.api.MaskState`
  minibatch-size - `int`

  returns: `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,org.deeplearning4j.nn.api.MaskState>`"
  (^org.nd4j.linalg.primitives.Pair [^InputPreProcessor this ^org.nd4j.linalg.api.ndarray.INDArray mask-array ^org.deeplearning4j.nn.api.MaskState current-mask-state ^Integer minibatch-size]
    (-> this (.feedForwardMaskArray mask-array current-mask-state minibatch-size))))

