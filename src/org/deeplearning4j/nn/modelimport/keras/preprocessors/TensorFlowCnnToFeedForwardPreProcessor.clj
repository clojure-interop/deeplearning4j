(ns org.deeplearning4j.nn.modelimport.keras.preprocessors.TensorFlowCnnToFeedForwardPreProcessor
  "Specialized CnnToFeedForwardInputPreProcessor for use with
 Convolutional layers imported from Keras using the TensorFlow
 backend."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras.preprocessors TensorFlowCnnToFeedForwardPreProcessor]))

(defn ->tensor-flow-cnn-to-feed-forward-pre-processor
  "Constructor.

  input-height - `long`
  input-width - `long`
  num-channels - `long`"
  (^TensorFlowCnnToFeedForwardPreProcessor [^Long input-height ^Long input-width ^Long num-channels]
    (new TensorFlowCnnToFeedForwardPreProcessor input-height input-width num-channels))
  (^TensorFlowCnnToFeedForwardPreProcessor [^Long input-height ^Long input-width]
    (new TensorFlowCnnToFeedForwardPreProcessor input-height input-width))
  (^TensorFlowCnnToFeedForwardPreProcessor []
    (new TensorFlowCnnToFeedForwardPreProcessor )))

(defn pre-process
  "Description copied from interface: InputPreProcessor

  input - the input to pre preProcess - `org.nd4j.linalg.api.ndarray.INDArray`
  mini-batch-size - Minibatch size - `int`
  workspace-mgr - Workspace manager - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: the processed input. Note that the returned array should be placed in the
  ArrayType.ACTIVATIONS workspace via the workspace manager - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^TensorFlowCnnToFeedForwardPreProcessor this ^org.nd4j.linalg.api.ndarray.INDArray input ^Integer mini-batch-size ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.preProcess input mini-batch-size workspace-mgr))))

(defn backprop
  "Description copied from interface: InputPreProcessor

  epsilons - which is a pair of the gradient and epsilon - `org.nd4j.linalg.api.ndarray.INDArray`
  mini-batch-size - Minibatch size - `int`
  workspace-mgr - Workspace manager - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: the reverse of the pre preProcess step (if any). Note that the returned array should be
  placed in ArrayType.ACTIVATION_GRAD workspace via the
  workspace manager - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^TensorFlowCnnToFeedForwardPreProcessor this ^org.nd4j.linalg.api.ndarray.INDArray epsilons ^Integer mini-batch-size ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.backprop epsilons mini-batch-size workspace-mgr))))

(defn clone
  "returns: `org.deeplearning4j.nn.modelimport.keras.preprocessors.TensorFlowCnnToFeedForwardPreProcessor`"
  (^org.deeplearning4j.nn.modelimport.keras.preprocessors.TensorFlowCnnToFeedForwardPreProcessor [^TensorFlowCnnToFeedForwardPreProcessor this]
    (-> this (.clone))))

