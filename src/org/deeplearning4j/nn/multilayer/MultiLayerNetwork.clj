(ns org.deeplearning4j.nn.multilayer.MultiLayerNetwork
  "MultiLayerNetwork is a neural network with multiple layers in a stack, and usually an output layer.
 For neural networks with a more complex connection architecture, use ComputationGraph
 which allows for an arbitrary directed acyclic graph connection structure between layers.
 MultiLayerNetwork is trainable via backprop, with optional pretraining, depending on the type of layers it contains."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.multilayer MultiLayerNetwork]))

(defn ->multi-layer-network
  "Constructor.

  Initialize the network based on the configuration

  conf - the configuration json - `java.lang.String`
  params - the parameters - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^MultiLayerNetwork [^java.lang.String conf ^org.nd4j.linalg.api.ndarray.INDArray params]
    (new MultiLayerNetwork conf params))
  (^MultiLayerNetwork [^org.deeplearning4j.nn.conf.MultiLayerConfiguration conf]
    (new MultiLayerNetwork conf)))

(defn *load
  "Restore a MultiLayerNetwork to a file, saved using save(File) or ModelSerializer

  f - File to load the network from - `java.io.File`
  load-updater - If true: load the updater if it is available (i.e., the state array for momentum/Adam/rmspropetc) - use false if no further training is required, or true if further trainingwill be undertaken - `boolean`

  returns: `org.deeplearning4j.nn.multilayer.MultiLayerNetwork`

  throws: java.io.IOException"
  (^org.deeplearning4j.nn.multilayer.MultiLayerNetwork [^java.io.File f ^Boolean load-updater]
    (MultiLayerNetwork/load f load-updater)))

(defn set-labels
  "labels - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^MultiLayerNetwork this ^org.nd4j.linalg.api.ndarray.INDArray labels]
    (-> this (.setLabels labels))))

(defn get-output-layer
  "Get the output layer

  returns: `org.deeplearning4j.nn.api.Layer`"
  (^org.deeplearning4j.nn.api.Layer [^MultiLayerNetwork this]
    (-> this (.getOutputLayer))))

(defn rnn-set-previous-state
  "Set the state of the RNN layer.

  layer - The number/index of the layer. - `int`
  state - The state to set the specified layer to - `java.util.Map`"
  ([^MultiLayerNetwork this ^Integer layer ^java.util.Map state]
    (-> this (.rnnSetPreviousState layer state))))

(defn set-input
  "Description copied from interface: Layer

  input - `org.nd4j.linalg.api.ndarray.INDArray`
  mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`"
  ([^MultiLayerNetwork this ^org.nd4j.linalg.api.ndarray.INDArray input ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr mgr]
    (-> this (.setInput input mgr)))
  ([^MultiLayerNetwork this ^org.nd4j.linalg.api.ndarray.INDArray input]
    (-> this (.setInput input))))

(defn evaluate-roc-multi-class
  "Evaluate the network on the specified data, using the ROCMultiClass class

  iterator - Data to evaluate on - `org.nd4j.linalg.dataset.api.iterator.DataSetIterator`
  roc-threshold-steps - Number of threshold steps to use with ROCMultiClass - `int`

  returns: Multi-class ROC evaluation on the given dataset - `org.deeplearning4j.eval.ROCMultiClass`"
  (^org.deeplearning4j.eval.ROCMultiClass [^MultiLayerNetwork this ^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iterator ^Integer roc-threshold-steps]
    (-> this (.evaluateROCMultiClass iterator roc-threshold-steps)))
  (^org.deeplearning4j.eval.ROCMultiClass [^MultiLayerNetwork this ^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iterator]
    (-> this (.evaluateROCMultiClass iterator))))

(defn update-rnn-state-with-tbptt-state
  ""
  ([^MultiLayerNetwork this]
    (-> this (.updateRnnStateWithTBPTTState))))

(defn do-evaluation-helper
  "iterator - `org.nd4j.linalg.dataset.api.iterator.DataSetIterator`
  evaluations - `T`

  returns: `<T extends org.deeplearning4j.eval.IEvaluation> T[]`"
  ([^MultiLayerNetwork this ^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iterator evaluations]
    (-> this (.doEvaluationHelper iterator evaluations))))

(defn score
  "Calculate the score (loss function) of the prediction with respect to the true labels

  data - data to calculate score for - `org.nd4j.linalg.dataset.DataSet`
  training - If true: score during training. If false: score at test time. This can affect the application ofcertain features, such as dropout and dropconnect (which are applied at training time only) - `boolean`

  returns: the score (value of the loss function) - `double`"
  (^Double [^MultiLayerNetwork this ^org.nd4j.linalg.dataset.DataSet data ^Boolean training]
    (-> this (.score data training)))
  (^Double [^MultiLayerNetwork this ^org.nd4j.linalg.dataset.DataSet data]
    (-> this (.score data)))
  (^Double [^MultiLayerNetwork this]
    (-> this (.score))))

(defn save
  "Save the MultiLayerNetwork to a file. Restore using load(File, boolean).

  f - File to save the network to - `java.io.File`
  save-updater - If true: save the updater (i.e., the state array for momentum/Adam/rmsprop etc), which shouldusually be saved if further training is required - `boolean`

  throws: java.io.IOException"
  ([^MultiLayerNetwork this ^java.io.File f ^Boolean save-updater]
    (-> this (.save f save-updater)))
  ([^MultiLayerNetwork this ^java.io.File f]
    (-> this (.save f))))

(defn set-layers
  "layers - `org.deeplearning4j.nn.api.Layer[]`"
  ([^MultiLayerNetwork this layers]
    (-> this (.setLayers layers))))

(defn param-table
  "Description copied from interface: Model

  backprop-params-only - If true, return backprop params only. If false: return all params (equivalent toparamsTable()) - `boolean`

  returns: Parameter table - `java.util.Map<java.lang.String,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^java.util.Map [^MultiLayerNetwork this ^Boolean backprop-params-only]
    (-> this (.paramTable backprop-params-only)))
  (^java.util.Map [^MultiLayerNetwork this]
    (-> this (.paramTable))))

(defn rnn-get-previous-state
  "Get the state of the RNN layer, as used in rnnTimeStep().

  layer - Number/index of the layer. - `int`

  returns: Hidden state, or null if layer is not an RNN layer - `java.util.Map<java.lang.String,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^java.util.Map [^MultiLayerNetwork this ^Integer layer]
    (-> this (.rnnGetPreviousState layer))))

(defn fit
  "Fit the model

  features - the examples to classify (one example in each row) - `org.nd4j.linalg.api.ndarray.INDArray`
  labels - the example labels(a binary outcome matrix) - `org.nd4j.linalg.api.ndarray.INDArray`
  features-mask - The mask array for the features (used for variable length time series, etc). May be null. - `org.nd4j.linalg.api.ndarray.INDArray`
  labels-mask - The mask array for the labels (used for variable length time series, etc). May be null. - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^MultiLayerNetwork this ^org.nd4j.linalg.api.ndarray.INDArray features ^org.nd4j.linalg.api.ndarray.INDArray labels ^org.nd4j.linalg.api.ndarray.INDArray features-mask ^org.nd4j.linalg.api.ndarray.INDArray labels-mask]
    (-> this (.fit features labels features-mask labels-mask)))
  ([^MultiLayerNetwork this ^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iterator ^Integer num-epochs]
    (-> this (.fit iterator num-epochs)))
  ([^MultiLayerNetwork this ^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iterator]
    (-> this (.fit iterator)))
  ([^MultiLayerNetwork this]
    (-> this (.fit))))

(defn get-iteration-count
  "returns: The current iteration count (number of parameter updates) for the layer/network - `int`"
  (^Integer [^MultiLayerNetwork this]
    (-> this (.getIterationCount))))

(defn init-gradients-view
  "This method: initializes the flattened gradients array (used in backprop) and sets the appropriate subset in all layers.
  As a general rule, this shouldn't ever need to be called manually when doing training via fit(DataSet) or fit(DataSetIterator)"
  ([^MultiLayerNetwork this]
    (-> this (.initGradientsView))))

(defn set-layer-wise-configurations
  "layer-wise-configurations - `org.deeplearning4j.nn.conf.MultiLayerConfiguration`"
  ([^MultiLayerNetwork this ^org.deeplearning4j.nn.conf.MultiLayerConfiguration layer-wise-configurations]
    (-> this (.setLayerWiseConfigurations layer-wise-configurations))))

(defn predict
  "Returns the predictions for each example in the dataset

  d - the matrix to predict - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the prediction for the dataset - `int[]`"
  ([^MultiLayerNetwork this ^org.nd4j.linalg.api.ndarray.INDArray d]
    (-> this (.predict d))))

(defn set-param
  "Description copied from interface: Model

  key - the key to se t - `java.lang.String`
  val - the new ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^MultiLayerNetwork this ^java.lang.String key ^org.nd4j.linalg.api.ndarray.INDArray val]
    (-> this (.setParam key val))))

(defn get-epoch-count
  "returns: The current epoch count (number of training epochs passed) for the layer/network - `int`"
  (^Integer [^MultiLayerNetwork this]
    (-> this (.getEpochCount))))

(defn set-cache-mode
  "This method sets specified CacheMode for all layers within network

  mode - `org.deeplearning4j.nn.conf.CacheMode`"
  ([^MultiLayerNetwork this ^org.deeplearning4j.nn.conf.CacheMode mode]
    (-> this (.setCacheMode mode))))

(defn output
  "Get the network output, which is optionally placed in the specified memory workspace.
  If no memory workspace is provided, the output will be detached (not in any workspace).
  If a memory workspace is provided, the output activation array (i.e., the INDArray returned by this method)
  will be placed in the specified workspace. This workspace must be opened by the user before calling this method -
  and the user is responsible for (a) closing this workspace, and (b) ensuring the output array is not used out
  of scope (i.e., not used after closing the workspace to which it belongs - as this is likely to cause either
  an exception when used, or a crash).

  input - Input to the network - `org.nd4j.linalg.api.ndarray.INDArray`
  train - True for train, false otherwise - `boolean`
  features-mask - `org.nd4j.linalg.api.ndarray.INDArray`
  labels-mask - `org.nd4j.linalg.api.ndarray.INDArray`
  output-workspace - May be null. If not null: the workspace MUST be opened before calling this method. - `org.nd4j.linalg.api.memory.MemoryWorkspace`

  returns: The output/activations from the network (either detached or in the specified workspace if provided) - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^MultiLayerNetwork this ^org.nd4j.linalg.api.ndarray.INDArray input ^Boolean train ^org.nd4j.linalg.api.ndarray.INDArray features-mask ^org.nd4j.linalg.api.ndarray.INDArray labels-mask ^org.nd4j.linalg.api.memory.MemoryWorkspace output-workspace]
    (-> this (.output input train features-mask labels-mask output-workspace)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^MultiLayerNetwork this ^org.nd4j.linalg.api.ndarray.INDArray input ^Boolean train ^org.nd4j.linalg.api.ndarray.INDArray features-mask ^org.nd4j.linalg.api.ndarray.INDArray labels-mask]
    (-> this (.output input train features-mask labels-mask)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^MultiLayerNetwork this ^org.nd4j.linalg.api.ndarray.INDArray input ^Boolean train ^org.nd4j.linalg.api.memory.MemoryWorkspace output-workspace]
    (-> this (.output input train output-workspace)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^MultiLayerNetwork this ^org.nd4j.linalg.api.ndarray.INDArray input ^org.deeplearning4j.nn.api.Layer$TrainingMode train]
    (-> this (.output input train)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^MultiLayerNetwork this ^org.nd4j.linalg.api.ndarray.INDArray input]
    (-> this (.output input))))

(defn init-called?
  "returns: `boolean`"
  (^Boolean [^MultiLayerNetwork this]
    (-> this (.isInitCalled))))

(defn gradient
  "Description copied from interface: Model

  returns: the gradient for this model, as calculated before - `org.deeplearning4j.nn.gradient.Gradient`"
  (^org.deeplearning4j.nn.gradient.Gradient [^MultiLayerNetwork this]
    (-> this (.gradient))))

(defn set-conf
  "Description copied from interface: Model

  conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`"
  ([^MultiLayerNetwork this ^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf]
    (-> this (.setConf conf))))

(defn activate-selected-layers
  "Calculate activation for few layers at once. Suitable for autoencoder partial activation.
  In example: in 10-layer deep autoencoder, layers 0 - 4 inclusive are used for encoding part, and layers 5-9 inclusive are used for decoding part.

  from - first layer to be activated, inclusive - `int`
  to - last layer to be activated, inclusive - `int`
  input - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the activation from the last layer - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^MultiLayerNetwork this ^Integer from ^Integer to ^org.nd4j.linalg.api.ndarray.INDArray input]
    (-> this (.activateSelectedLayers from to input))))

(defn get-mask
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^MultiLayerNetwork this]
    (-> this (.getMask))))

(defn get-helper
  "returns: Get the layer helper, if any - `org.deeplearning4j.nn.layers.LayerHelper`"
  (^org.deeplearning4j.nn.layers.LayerHelper [^MultiLayerNetwork this]
    (-> this (.getHelper))))

(defn params
  "Returns a 1 x m vector where the vector is composed of
  a flattened vector of all of the weights for the
  various neuralNets(w,hbias NOT VBIAS) and output layer

  backward-only - `boolean`

  returns: the params for this neural net - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^MultiLayerNetwork this ^Boolean backward-only]
    (-> this (.params backward-only)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^MultiLayerNetwork this]
    (-> this (.params))))

(defn get-learning-rate
  "Get the current learning rate, for the specified layer, from the network.
  Note: If the layer has no learning rate (no parameters, or an updater without a learning rate) then null is returned

  layer-number - Layer number to get the learning rate for - `int`

  returns: Learning rate for the specified layer, or null - `java.lang.Double`"
  (^java.lang.Double [^MultiLayerNetwork this ^Integer layer-number]
    (-> this (.getLearningRate layer-number))))

(defn compute-gradient-and-score
  "Description copied from interface: Model

  layer-workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`"
  ([^MultiLayerNetwork this ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr layer-workspace-mgr]
    (-> this (.computeGradientAndScore layer-workspace-mgr)))
  ([^MultiLayerNetwork this]
    (-> this (.computeGradientAndScore))))

(defn set-parameters
  "Sets parameters for the model.
  This is used to manipulate the weights and biases across
  all neuralNets (including the output layer)

  params - a parameter vector equal 1,numParameters - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^MultiLayerNetwork this ^org.nd4j.linalg.api.ndarray.INDArray params]
    (-> this (.setParameters params))))

(defn rnn-clear-previous-state
  "Clear the previous state of the RNN layers (if any)."
  ([^MultiLayerNetwork this]
    (-> this (.rnnClearPreviousState))))

(defn feed-forward-mask-array
  "Description copied from interface: Layer

  mask-array - Mask array to set - `org.nd4j.linalg.api.ndarray.INDArray`
  current-mask-state - Current state of the mask - see MaskState - `org.deeplearning4j.nn.api.MaskState`
  minibatch-size - Current minibatch size. Needs to be known as it cannot always be inferred from the activationsarray due to reshaping (such as a DenseLayer within a recurrent neural network) - `int`

  returns: New mask array after this layer, along with the new mask state. - `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,org.deeplearning4j.nn.api.MaskState>`"
  (^org.nd4j.linalg.primitives.Pair [^MultiLayerNetwork this ^org.nd4j.linalg.api.ndarray.INDArray mask-array ^org.deeplearning4j.nn.api.MaskState current-mask-state ^Integer minibatch-size]
    (-> this (.feedForwardMaskArray mask-array current-mask-state minibatch-size))))

(defn set-mask-array
  "Description copied from interface: Layer

  mask-array - Mask array to set - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^MultiLayerNetwork this ^org.nd4j.linalg.api.ndarray.INDArray mask-array]
    (-> this (.setMaskArray mask-array))))

(defn activate
  "Description copied from interface: Layer

  input - the input to use - `org.nd4j.linalg.api.ndarray.INDArray`
  training - train or test mode - `boolean`
  mgr - Workspace manager. - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: Activations array. Note that the returned array should be placed in the
  ArrayType.ACTIVATIONS workspace via the workspace manager - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^MultiLayerNetwork this ^org.nd4j.linalg.api.ndarray.INDArray input ^Boolean training ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr mgr]
    (-> this (.activate input training mgr)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^MultiLayerNetwork this ^Boolean training ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr mgr]
    (-> this (.activate training mgr)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^MultiLayerNetwork this ^org.deeplearning4j.nn.api.Layer$TrainingMode training]
    (-> this (.activate training))))

(defn get-index
  "Description copied from interface: Layer

  returns: `int`"
  (^Integer [^MultiLayerNetwork this]
    (-> this (.getIndex))))

(defn allow-input-modification
  "Description copied from interface: Layer

  allow - If true: the input array is safe to modify. If false: the input array should be copied before itis modified (i.e., in-place modifications are un-safe) - `boolean`"
  ([^MultiLayerNetwork this ^Boolean allow]
    (-> this (.allowInputModification allow))))

(defn add-listeners
  "This method ADDS additional TrainingListener to existing listeners

  listeners - `org.deeplearning4j.optimize.api.TrainingListener`"
  ([^MultiLayerNetwork this ^org.deeplearning4j.optimize.api.TrainingListener listeners]
    (-> this (.addListeners listeners))))

(defn get-param
  "Description copied from interface: Model

  param - the key of the parameter - `java.lang.String`

  returns: the parameter vector/matrix with that particular key - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^MultiLayerNetwork this ^java.lang.String param]
    (-> this (.getParam param))))

(defn get-gradients-view-array
  "returns: 1D gradients view array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^MultiLayerNetwork this]
    (-> this (.getGradientsViewArray))))

(defn batch-size
  "Description copied from interface: Model

  returns: the current inputs batch size - `int`"
  (^Integer [^MultiLayerNetwork this]
    (-> this (.batchSize))))

(defn evaluate-roc
  "Evaluate the network (must be a binary classifier) on the specified data, using the ROC class

  iterator - Data to evaluate on - `org.nd4j.linalg.dataset.api.iterator.DataSetIterator`
  roc-threshold-steps - Number of threshold steps to use with ROC - `int`

  returns: ROC evaluation on the given dataset - `org.deeplearning4j.eval.ROC`"
  (^org.deeplearning4j.eval.ROC [^MultiLayerNetwork this ^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iterator ^Integer roc-threshold-steps]
    (-> this (.evaluateROC iterator roc-threshold-steps)))
  (^org.deeplearning4j.eval.ROC [^MultiLayerNetwork this ^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iterator]
    (-> this (.evaluateROC iterator))))

(defn get-last-etl-time
  "returns: `long`"
  (^Long [^MultiLayerNetwork this]
    (-> this (.getLastEtlTime))))

(defn activation-from-prev-layer
  "curr - `int`
  input - `org.nd4j.linalg.api.ndarray.INDArray`
  training - `boolean`
  mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^MultiLayerNetwork this ^Integer curr ^org.nd4j.linalg.api.ndarray.INDArray input ^Boolean training ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr mgr]
    (-> this (.activationFromPrevLayer curr input training mgr))))

(defn get-layer-names
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^MultiLayerNetwork this]
    (-> this (.getLayerNames))))

(defn clear-layer-mask-arrays
  "Remove the mask arrays from all layers.
  See setLayerMaskArrays(INDArray, INDArray) for details on mask arrays."
  ([^MultiLayerNetwork this]
    (-> this (.clearLayerMaskArrays))))

(defn pretrain
  "Perform layerwise pretraining on all pre-trainable layers in the network (VAEs, Autoencoders, etc), for the specified
  number of epochs each. For example, if numEpochs=3, then layer 0 will be fit for 3 epochs, followed by layer 1
  for 3 epochs, and so on.
  Note that pretraining will be performed on one layer after the other, resetting the DataSetIterator between iterations.
  For multiple epochs per layer, appropriately wrap the iterator (for example, a MultipleEpochsIterator) or train
  each layer manually using pretrainLayer(int, DataSetIterator)

  iter - Training data - `org.nd4j.linalg.dataset.api.iterator.DataSetIterator`
  num-epochs - `int`"
  ([^MultiLayerNetwork this ^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iter ^Integer num-epochs]
    (-> this (.pretrain iter num-epochs)))
  ([^MultiLayerNetwork this ^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iter]
    (-> this (.pretrain iter))))

(defn set-mask
  "mask - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^MultiLayerNetwork this ^org.nd4j.linalg.api.ndarray.INDArray mask]
    (-> this (.setMask mask))))

(defn set-params-view-array
  "Description copied from interface: Model

  params - a 1 x nParams row vector that is a view of the larger (MLN/CG) parameters array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^MultiLayerNetwork this ^org.nd4j.linalg.api.ndarray.INDArray params]
    (-> this (.setParamsViewArray params))))

(defn update
  "Description copied from interface: Model

  gradient - the gradient to apply - `org.nd4j.linalg.api.ndarray.INDArray`
  param-type - `java.lang.String`"
  ([^MultiLayerNetwork this ^org.nd4j.linalg.api.ndarray.INDArray gradient ^java.lang.String param-type]
    (-> this (.update gradient param-type)))
  ([^MultiLayerNetwork this ^org.deeplearning4j.nn.gradient.Gradient gradient]
    (-> this (.update gradient))))

(defn get-updater
  "Get the updater for this MultiLayerNetwork

  returns: Updater for MultiLayerNetwork - `org.deeplearning4j.nn.api.Updater`"
  (^org.deeplearning4j.nn.api.Updater [^MultiLayerNetwork this]
    (-> this (.getUpdater)))
  (^org.deeplearning4j.nn.api.Updater [^MultiLayerNetwork this ^Boolean initialize-if-req]
    (-> this (.getUpdater initialize-if-req))))

(defn feed-forward-to-layer
  "Compute the activations from the input to the specified layer.
  To compute activations for all layers, use feedForward(...) methods
  Note: output list includes the original input. So list.get(0) is always the original input, and
  list.get(i+1) is the activations of the ith layer.

  layer-num - Index of the last layer to calculate activations for. Layers are zero-indexed.feedForwardToLayer(i,input) will return the activations for layers 0..i (inclusive) - `int`
  input - Input to the network - `org.nd4j.linalg.api.ndarray.INDArray`
  train - true for training, false for test (i.e., false if using network after training) - `boolean`

  returns: list of activations. - `java.util.List<org.nd4j.linalg.api.ndarray.INDArray>`"
  (^java.util.List [^MultiLayerNetwork this ^Integer layer-num ^org.nd4j.linalg.api.ndarray.INDArray input ^Boolean train]
    (-> this (.feedForwardToLayer layer-num input train)))
  (^java.util.List [^MultiLayerNetwork this ^Integer layer-num ^org.nd4j.linalg.api.ndarray.INDArray input]
    (-> this (.feedForwardToLayer layer-num input))))

(defn do-evaluation
  "Perform evaluation using an arbitrary IEvaluation instance.

  iterator - data to evaluate on - `org.nd4j.linalg.dataset.api.iterator.DataSetIterator`
  evaluations - `T`

  returns: `<T extends org.deeplearning4j.eval.IEvaluation> T[]`"
  ([^MultiLayerNetwork this ^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iterator evaluations]
    (-> this (.doEvaluation iterator evaluations))))

(defn summary
  "String detailing the architecture of the multilayernetwork.
  Will also display activation size when given an input type.
  Columns are LayerIndex with layer type, nIn, nOut, Total number of parameters, Shapes of the parameters, Input activation shape, Output activation shape
  Will also give information about frozen layers, if any.

  input-type - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: Summary as a string - `java.lang.String`"
  (^java.lang.String [^MultiLayerNetwork this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.summary input-type)))
  (^java.lang.String [^MultiLayerNetwork this]
    (-> this (.summary))))

(defn reconstruct
  "Reconstructs the input.
  This is equivalent functionality to a
  deep autoencoder.

  x - the input to transform - `org.nd4j.linalg.api.ndarray.INDArray`
  layer-num - the layer to output for encoding - `int`

  returns: a reconstructed matrix
  relative to the size of the last hidden layer.
  This is great for data compression and visualizing
  high dimensional data (or just doing dimensionality reduction).

  This is typically of the form:
  [0.5, 0.5] or some other probability distribution summing to one - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^MultiLayerNetwork this ^org.nd4j.linalg.api.ndarray.INDArray x ^Integer layer-num]
    (-> this (.reconstruct x layer-num))))

(defn set-updater
  "Set the updater for the MultiLayerNetwork

  updater - `org.deeplearning4j.nn.api.Updater`"
  ([^MultiLayerNetwork this ^org.deeplearning4j.nn.api.Updater updater]
    (-> this (.setUpdater updater))))

(defn get-layer
  "i - `int`

  returns: `org.deeplearning4j.nn.api.Layer`"
  (^org.deeplearning4j.nn.api.Layer [^MultiLayerNetwork this ^Integer i]
    (-> this (.getLayer i))))

(defn score-examples
  "Calculate the score for each example in a DataSet individually. Unlike score(DataSet) and score(DataSet, boolean)
  this method does not average/sum over examples. This method allows for examples to be scored individually (at test time only), which
  may be useful for example for autoencoder architectures and the like.
  Each row of the output (assuming addRegularizationTerms == true) is equivalent to calling score(DataSet) with a single example.

  data - The data to score - `org.nd4j.linalg.dataset.DataSet`
  add-regularization-terms - If true: add l1/l2 regularization terms (if any) to the score. If false: don't add regularization terms - `boolean`

  returns: An INDArray (column vector) of size input.numRows(); the ith entry is the score (loss value) of the ith example - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^MultiLayerNetwork this ^org.nd4j.linalg.dataset.DataSet data ^Boolean add-regularization-terms]
    (-> this (.scoreExamples data add-regularization-terms))))

(defn layer-input-size
  "Return the input size (number of inputs) for the specified layer.
  Note that the meaning of the \"input size\" can depend on the type of layer. For example:
  - DenseLayer, OutputLayer, etc: the feature vector size (nIn configuration option)
  - Recurrent layers: the feature vector size per time step (nIn configuration option)
  - ConvolutionLayer: the channels (number of channels)
  - Subsampling layers, global pooling layers, etc: size of 0 is always returned

  layer - Index of the layer to get the size of. Must be in range 0 to nLayers-1 inclusive - `int`

  returns: Size of the layer - `int`"
  (^Integer [^MultiLayerNetwork this ^Integer layer]
    (-> this (.layerInputSize layer))))

(defn increment-epoch-count
  "Increment the epoch count (in the underlying MultiLayerConfiguration by 1).
  Note that this is done automatically when using iterator-based fitting methods, such as
  fit(DataSetIterator). However, when using non-iterator fit methods (DataSet, INDArray/INDArray etc),
  the network has no way to know when one epoch ends and another starts. In such situations, this method
  can be used to increment the epoch counter.
  Note that the epoch counter is used for situations such as some learning rate schedules, and the like.
  The current epoch count can be obtained using MultiLayerConfiguration.getLayerwiseConfiguration().getEpochCount()"
  ([^MultiLayerNetwork this]
    (-> this (.incrementEpochCount))))

(defn set-learning-rate
  "Set the learning rate for a single layer in the network to the specified value. Note that if any learning rate
  schedules are currently present, these will be removed in favor of the new (fixed) learning rate.

  Note: This method not free from a performance point of view: a proper learning rate schedule
  should be used in preference to calling this method at every iteration. Note also that
  setLearningRate(double) should also be used in preference, when all layers need to be set to a new LR

  layer-number - Number of the layer to set the LR for - `int`
  new-lr - New learning rate for a single layer - `double`"
  ([^MultiLayerNetwork this ^Integer layer-number ^Double new-lr]
    (-> this (.setLearningRate layer-number new-lr)))
  ([^MultiLayerNetwork this ^Double new-lr]
    (-> this (.setLearningRate new-lr))))

(defn set-score
  "score - `double`"
  ([^MultiLayerNetwork this ^Double score]
    (-> this (.setScore score))))

(defn feed-forward
  "Compute the activations from the input to the output layer, given mask arrays (that may be null)
  The masking arrays are used in situations such an one-to-many and many-to-one rucerrent neural network (RNN)
  designs, as well as for supporting time series of varying lengths within the same minibatch for RNNs.

  input - `org.nd4j.linalg.api.ndarray.INDArray`
  features-mask - `org.nd4j.linalg.api.ndarray.INDArray`
  labels-mask - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `java.util.List<org.nd4j.linalg.api.ndarray.INDArray>`"
  (^java.util.List [^MultiLayerNetwork this ^org.nd4j.linalg.api.ndarray.INDArray input ^org.nd4j.linalg.api.ndarray.INDArray features-mask ^org.nd4j.linalg.api.ndarray.INDArray labels-mask]
    (-> this (.feedForward input features-mask labels-mask)))
  (^java.util.List [^MultiLayerNetwork this ^org.nd4j.linalg.api.ndarray.INDArray input ^Boolean train]
    (-> this (.feedForward input train)))
  (^java.util.List [^MultiLayerNetwork this ^Boolean train]
    (-> this (.feedForward train)))
  (^java.util.List [^MultiLayerNetwork this]
    (-> this (.feedForward))))

(defn get-input
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^MultiLayerNetwork this]
    (-> this (.getInput))))

(defn set-param-table
  "Description copied from interface: Model

  param-table - `java.util.Map`"
  ([^MultiLayerNetwork this ^java.util.Map param-table]
    (-> this (.setParamTable param-table))))

(defn evaluate
  "Evaluate the network (for classification) on the provided data set, with top N accuracy in addition to standard accuracy.
  For 'standard' accuracy evaluation only, use topN = 1

  iterator - Iterator (data) to evaluate on - `org.nd4j.linalg.dataset.api.iterator.DataSetIterator`
  labels-list - List of labels. May be null. - `java.util.List`
  top-n - N value for top N accuracy evaluation - `int`

  returns: Evaluation object, summarizing the results of the evaluation on the provided DataSetIterator - `org.deeplearning4j.eval.Evaluation`"
  (^org.deeplearning4j.eval.Evaluation [^MultiLayerNetwork this ^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iterator ^java.util.List labels-list ^Integer top-n]
    (-> this (.evaluate iterator labels-list top-n)))
  (^org.deeplearning4j.eval.Evaluation [^MultiLayerNetwork this ^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iterator ^java.util.List labels-list]
    (-> this (.evaluate iterator labels-list)))
  (^org.deeplearning4j.eval.Evaluation [^MultiLayerNetwork this ^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iterator]
    (-> this (.evaluate iterator))))

(defn set-input-mini-batch-size
  "Description copied from interface: Layer

  size - `int`"
  ([^MultiLayerNetwork this ^Integer size]
    (-> this (.setInputMiniBatchSize size))))

(defn set-last-etl-time
  "time - `long`"
  ([^MultiLayerNetwork this ^Long time]
    (-> this (.setLastEtlTime time))))

(defn pretrain-layer?
  "Description copied from interface: Layer

  returns: true if the layer can be pretrained (using fit(INDArray), false otherwise - `boolean`"
  (^Boolean [^MultiLayerNetwork this]
    (-> this (.isPretrainLayer))))

(defn clear-noise-weight-params
  ""
  ([^MultiLayerNetwork this]
    (-> this (.clearNoiseWeightParams))))

(defn set-params
  "Set the parameters for this model.
  This expects a linear ndarray
  which then be unpacked internally
  relative to the expected ordering of the model

  params - the parameters for the model - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^MultiLayerNetwork this ^org.nd4j.linalg.api.ndarray.INDArray params]
    (-> this (.setParams params))))

(defn pretrain-layer
  "Perform layerwise unsupervised training on a single pre-trainable layer in the network (VAEs, Autoencoders, etc)
  for the specified number of epochs
  If the specified layer index (0 to numLayers - 1) is not a pretrainable layer, this is a no-op.

  layer-idx - Index of the layer to train (0 to numLayers-1) - `int`
  iter - Training data - `org.nd4j.linalg.dataset.api.iterator.DataSetIterator`
  num-epochs - Number of epochs to fit the specified layer for - `int`"
  ([^MultiLayerNetwork this ^Integer layer-idx ^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iter ^Integer num-epochs]
    (-> this (.pretrainLayer layer-idx iter num-epochs)))
  ([^MultiLayerNetwork this ^Integer layer-idx ^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iter]
    (-> this (.pretrainLayer layer-idx iter))))

(defn set-listeners
  "Description copied from interface: Model

  listeners - `java.util.Collection`"
  ([^MultiLayerNetwork this ^java.util.Collection listeners]
    (-> this (.setListeners listeners))))

(defn get-labels
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^MultiLayerNetwork this]
    (-> this (.getLabels))))

(defn backprop-gradient
  "Description copied from interface: Layer

  epsilon - w^(L+1)*delta^(L+1). Or, equiv: dC/da, i.e., (dC/dz)*(dz/da) = dC/da, where Cis cost function a=sigma(z) is activation. - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - Workspace manager - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: Pair where Gradient is gradient for this layer, INDArray is epsilon (activation gradient)
  needed by next layer, but before element-wise multiply by sigmaPrime(z). So for standard feed-forward layer, if this layer is
  L, then return.getSecond() == dL/dIn = (w^(L)*(delta^(L))^T)^T. Note that the returned array should be placed in the
  ArrayType.ACTIVATION_GRAD workspace via the workspace manager - `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.gradient.Gradient,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^org.nd4j.linalg.primitives.Pair [^MultiLayerNetwork this ^org.nd4j.linalg.api.ndarray.INDArray epsilon ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.backpropGradient epsilon workspace-mgr))))

(defn conf
  "Description copied from interface: Model

  returns: the configuration for the neural network - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`"
  (^org.deeplearning4j.nn.conf.NeuralNetConfiguration [^MultiLayerNetwork this]
    (-> this (.conf))))

(defn set-backprop-gradients-view-array
  "Description copied from interface: Model

  gradients - a 1 x nParams row vector that is a view of the larger (MLN/CG) gradients array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^MultiLayerNetwork this ^org.nd4j.linalg.api.ndarray.INDArray gradients]
    (-> this (.setBackpropGradientsViewArray gradients))))

(defn num-params
  "Description copied from interface: Model

  backwards - `boolean`

  returns: the number of parameters for the model - `int`"
  (^Integer [^MultiLayerNetwork this ^Boolean backwards]
    (-> this (.numParams backwards)))
  (^Integer [^MultiLayerNetwork this]
    (-> this (.numParams))))

(defn updater-state
  "Description copied from interface: NeuralNetwork

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^MultiLayerNetwork this]
    (-> this (.updaterState))))

(defn set-index
  "Description copied from interface: Layer

  index - `int`"
  ([^MultiLayerNetwork this ^Integer index]
    (-> this (.setIndex index))))

(defn print-configuration
  "Prints the configuration"
  ([^MultiLayerNetwork this]
    (-> this (.printConfiguration))))

(defn set-iteration-count
  "Description copied from interface: Layer

  iteration-count - `int`"
  ([^MultiLayerNetwork this ^Integer iteration-count]
    (-> this (.setIterationCount iteration-count))))

(defn input
  "Description copied from interface: Model

  returns: the input/feature matrix for the model - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^MultiLayerNetwork this]
    (-> this (.input))))

(defn getn-layers
  "Get the number of layers in the network

  returns: the number of layers in the network - `int`"
  (^Integer [^MultiLayerNetwork this]
    (-> this (.getnLayers))))

(defn evaluate-regression
  "Evaluate the network for regression performance

  iterator - Data to evaluate on - `org.nd4j.linalg.dataset.api.iterator.DataSetIterator`

  returns: `org.deeplearning4j.eval.RegressionEvaluation`"
  (^org.deeplearning4j.eval.RegressionEvaluation [^MultiLayerNetwork this ^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iterator]
    (-> this (.evaluateRegression iterator))))

(defn f-1-score
  "Sets the input and labels and returns a score for the prediction
  wrt true labels

  input - the input to score - `org.nd4j.linalg.api.ndarray.INDArray`
  labels - the true labels - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the score for the given input,label pairs - `double`"
  (^Double [^MultiLayerNetwork this ^org.nd4j.linalg.api.ndarray.INDArray input ^org.nd4j.linalg.api.ndarray.INDArray labels]
    (-> this (.f1Score input labels)))
  (^Double [^MultiLayerNetwork this ^org.nd4j.linalg.dataset.api.DataSet data]
    (-> this (.f1Score data))))

(defn get-layers
  "returns: `org.deeplearning4j.nn.api.Layer[]`"
  ([^MultiLayerNetwork this]
    (-> this (.getLayers))))

(defn type
  "Description copied from interface: Layer

  returns: `org.deeplearning4j.nn.api.Layer$Type`"
  (^org.deeplearning4j.nn.api.Layer$Type [^MultiLayerNetwork this]
    (-> this (.type))))

(defn calc-l-1
  "Description copied from interface: Layer

  backprop-params-only - If true: calculate L1 based on backprop params only. If false: calculatebased on all params (including pretrain params, if any) - `boolean`

  returns: the l1 regularization term for this layer. - `double`"
  (^Double [^MultiLayerNetwork this ^Boolean backprop-params-only]
    (-> this (.calcL1 backprop-params-only))))

(defn label-probabilities
  "Returns the probabilities for each label
  for each example row wise

  examples - the examples to classify (one example in each row) - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the likelihoods of each example and each label - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^MultiLayerNetwork this ^org.nd4j.linalg.api.ndarray.INDArray examples]
    (-> this (.labelProbabilities examples))))

(defn calc-l-2
  "Description copied from interface: Layer

  backprop-params-only - If true: calculate L2 based on backprop params only. If false: calculatebased on all params (including pretrain params, if any) - `boolean`

  returns: the l2 regularization term for this layer. - `double`"
  (^Double [^MultiLayerNetwork this ^Boolean backprop-params-only]
    (-> this (.calcL2 backprop-params-only))))

(defn init
  "Initialize the MultiLayerNetwork, optionally with an existing parameters array.
  If an existing parameters array is specified, it will be used (and the values will not be modified) in the network;
  if no parameters array is specified, parameters will be initialized randomly according to the network configuration.

  parameters - Network parameter. May be null. If null: randomly initialize. - `org.nd4j.linalg.api.ndarray.INDArray`
  clone-parameters-array - Whether the parameter array (if any) should be cloned, or used directly - `boolean`"
  ([^MultiLayerNetwork this ^org.nd4j.linalg.api.ndarray.INDArray parameters ^Boolean clone-parameters-array]
    (-> this (.init parameters clone-parameters-array)))
  ([^MultiLayerNetwork this]
    (-> this (.init))))

(defn get-mask-array
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^MultiLayerNetwork this]
    (-> this (.getMaskArray))))

(defn get-layer-wise-configurations
  "returns: `org.deeplearning4j.nn.conf.MultiLayerConfiguration`"
  (^org.deeplearning4j.nn.conf.MultiLayerConfiguration [^MultiLayerNetwork this]
    (-> this (.getLayerWiseConfigurations))))

(defn clone
  "Clones the multilayernetwork

  returns: `org.deeplearning4j.nn.multilayer.MultiLayerNetwork`"
  (^org.deeplearning4j.nn.multilayer.MultiLayerNetwork [^MultiLayerNetwork this]
    (-> this (.clone))))

(defn set-layer-mask-arrays
  "Set the mask arrays for features and labels. Mask arrays are typically used in situations such as one-to-many
  and many-to-one learning with recurrent neural networks, as well as for supporting time series of varying lengths
  within the same minibatch.
  For example, with RNN data sets with input of shape [miniBatchSize,nIn,timeSeriesLength] and outputs of shape
  [miniBatchSize,nOut,timeSeriesLength], the features and mask arrays will have shape [miniBatchSize,timeSeriesLength]
  and contain values 0 or 1 at each element (to specify whether a given input/example is present - or merely padding -
  at a given time step).
  NOTE: This method is not usually used directly. Instead, methods such as feedForward(INDArray, INDArray, INDArray)
  and output(INDArray, boolean, INDArray, INDArray) handle setting of masking internally.

  features-mask-array - Mask array for features (input) - `org.nd4j.linalg.api.ndarray.INDArray`
  labels-mask-array - Mask array for labels (output) - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^MultiLayerNetwork this ^org.nd4j.linalg.api.ndarray.INDArray features-mask-array ^org.nd4j.linalg.api.ndarray.INDArray labels-mask-array]
    (-> this (.setLayerMaskArrays features-mask-array labels-mask-array))))

(defn get-default-configuration
  "returns: `org.deeplearning4j.nn.conf.NeuralNetConfiguration`"
  (^org.deeplearning4j.nn.conf.NeuralNetConfiguration [^MultiLayerNetwork this]
    (-> this (.getDefaultConfiguration))))

(defn num-labels
  "Returns the number of possible labels

  returns: the number of possible labels for this classifier - `int`"
  (^Integer [^MultiLayerNetwork this]
    (-> this (.numLabels))))

(defn get-listeners
  "Description copied from interface: Layer

  returns: listeners - `java.util.Collection<org.deeplearning4j.optimize.api.TrainingListener>`"
  (^java.util.Collection [^MultiLayerNetwork this]
    (-> this (.getListeners))))

(defn clear
  "Clear the inputs. Clears optimizer state."
  ([^MultiLayerNetwork this]
    (-> this (.clear))))

(defn calculate-gradients
  "Calculate parameter gradients and input activation gradients given the input and labels

  features - Features for gradient calculation - `org.nd4j.linalg.api.ndarray.INDArray`
  label - Labels for gradient - `org.nd4j.linalg.api.ndarray.INDArray`
  f-mask - Features mask array (may be null) - `org.nd4j.linalg.api.ndarray.INDArray`
  label-mask - Label mask array (may be null) - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: A pair of gradient arrays: parameter gradients (in Gradient object) and input activation gradients - `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.gradient.Gradient,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^org.nd4j.linalg.primitives.Pair [^MultiLayerNetwork this ^org.nd4j.linalg.api.ndarray.INDArray features ^org.nd4j.linalg.api.ndarray.INDArray label ^org.nd4j.linalg.api.ndarray.INDArray f-mask ^org.nd4j.linalg.api.ndarray.INDArray label-mask]
    (-> this (.calculateGradients features label f-mask label-mask))))

(defn rnn-time-step
  "If this MultiLayerNetwork contains one or more RNN layers: conduct forward pass (prediction)
  but using previous stored state for any RNN layers. The activations for the final step are
  also stored in the RNN layers for use next time rnnTimeStep() is called.
  This method can be used to generate output one or more steps at a time instead of always having to do
  forward pass from t=0. Example uses are for streaming data, and for generating samples from network output
  one step at a time (where samples are then fed back into the network as input)
  If no previous state is present in RNN layers (i.e., initially or after calling rnnClearPreviousState()),
  the default initialization (usually 0) is used.
  Supports mini-batch (i.e., multiple predictions/forward pass in parallel) as well as for single examples.

  input - Input to network. May be for one or multiple time steps. For single time step:input has shape [miniBatchSize,inputSize] or [miniBatchSize,inputSize,1]. miniBatchSize=1 for single example.For multiple time steps: [miniBatchSize,inputSize,inputTimeSeriesLength] - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: Output activations. If output is RNN layer (such as RnnOutputLayer): if input has shape [miniBatchSize,inputSize]
  i.e., is 2d, output has shape [miniBatchSize,outputSize] (i.e., also 2d).
  Otherwise output is 3d [miniBatchSize,outputSize,inputTimeSeriesLength] when using RnnOutputLayer. - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^MultiLayerNetwork this ^org.nd4j.linalg.api.ndarray.INDArray input]
    (-> this (.rnnTimeStep input))))

(defn rnn-activate-using-stored-state
  "Similar to rnnTimeStep and feedForward() methods. Difference here is that this method:
  (a) like rnnTimeStep does forward pass using stored state for RNN layers, and
  (b) unlike rnnTimeStep does not modify the RNN layer state
  Therefore multiple calls to this method with the same input should have the same output.
  Typically used during training only. Use rnnTimeStep for prediction/forward pass at test time.

  input - Input to network - `org.nd4j.linalg.api.ndarray.INDArray`
  training - Whether training or not - `boolean`
  store-last-for-tbptt - set to true if used as part of truncated BPTT training - `boolean`

  returns: Activations for each layer (including input, as per feedforward() etc) - `java.util.List<org.nd4j.linalg.api.ndarray.INDArray>`"
  (^java.util.List [^MultiLayerNetwork this ^org.nd4j.linalg.api.ndarray.INDArray input ^Boolean training ^Boolean store-last-for-tbptt]
    (-> this (.rnnActivateUsingStoredState input training store-last-for-tbptt))))

(defn get-config
  "returns: Training configuration - `org.deeplearning4j.nn.api.TrainingConfig`"
  (^org.deeplearning4j.nn.api.TrainingConfig [^MultiLayerNetwork this]
    (-> this (.getConfig))))

(defn memory-info
  "Generate information regarding memory use for the network, for the given input type and minibatch size.
  Note that when using workspaces or CuDNN, the network should be trained for some iterations so that the memory
  workspaces have time to initialize. Without this, the memory requirements during training may be underestimated.
  Note also that this is the same information that is generated during an OOM crash when training or performing
  inference.

  minibatch - Minibatch size to estimate memory for - `int`
  input-type - Input type to the network - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: A String with information about network memory use information - `java.lang.String`"
  (^java.lang.String [^MultiLayerNetwork this ^Integer minibatch ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.memoryInfo minibatch input-type))))

(defn get-optimizer
  "Description copied from interface: Model

  returns: this models optimizer - `org.deeplearning4j.optimize.api.ConvexOptimizer`"
  (^org.deeplearning4j.optimize.api.ConvexOptimizer [^MultiLayerNetwork this]
    (-> this (.getOptimizer))))

(defn get-training-listeners
  "returns: trainingListeners - `java.util.Collection<org.deeplearning4j.optimize.api.TrainingListener>`"
  (^java.util.Collection [^MultiLayerNetwork this]
    (-> this (.getTrainingListeners))))

(defn set-gradients-accumulator
  "This method allows you to specificy GradientsAccumulator instance to be used with this model
  PLEASE NOTE: Do not use this method unless you understand how to use GradientsAccumulator & updates sharing.
  PLEASE NOTE: Do not use this method on standalone model

  accumulator - `org.deeplearning4j.optimize.solvers.accumulation.GradientsAccumulator`"
  ([^MultiLayerNetwork this ^org.deeplearning4j.optimize.solvers.accumulation.GradientsAccumulator accumulator]
    (-> this (.setGradientsAccumulator accumulator))))

(defn get-input-mini-batch-size
  "Description copied from interface: Layer

  returns: `int`"
  (^Integer [^MultiLayerNetwork this]
    (-> this (.getInputMiniBatchSize))))

(defn equals
  "Indicates whether some other object is \"equal to\" this one.

  The equals method implements an equivalence relation
  on non-null object references:

  It is reflexive: for any non-null reference value
  x, x.equals(x) should return
  true.
  It is symmetric: for any non-null reference values
  x and y, x.equals(y)
  should return true if and only if
  y.equals(x) returns true.
  It is transitive: for any non-null reference values
  x, y, and z, if
  x.equals(y) returns true and
  y.equals(z) returns true, then
  x.equals(z) should return true.
  It is consistent: for any non-null reference values
  x and y, multiple invocations of
  x.equals(y) consistently return true
  or consistently return false, provided no
  information used in equals comparisons on the
  objects is modified.
  For any non-null reference value x,
  x.equals(null) should return false.


  The equals method for class Object implements
  the most discriminating possible equivalence relation on objects;
  that is, for any non-null reference values x and
  y, this method returns true if and only
  if x and y refer to the same object
  (x == y has the value true).

  Note that it is generally necessary to override the hashCode
  method whenever this method is overridden, so as to maintain the
  general contract for the hashCode method, which states
  that equal objects must have equal hash codes.

  obj - the reference object with which to compare. - `java.lang.Object`

  returns: true if this object is the same as the obj
  argument; false otherwise. - `boolean`"
  (^Boolean [^MultiLayerNetwork this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn layer-size
  "Return the layer size (number of units) for the specified layer.
  Note that the meaning of the \"layer size\" can depend on the type of layer. For example:
  - DenseLayer, OutputLayer, recurrent layers: number of units (nOut configuration option)
  - ConvolutionLayer: the channels (number of channels)
  - Subsampling layers, global pooling layers, etc: size of 0 is always returned

  layer - Index of the layer to get the size of. Must be in range 0 to nLayers-1 inclusive - `int`

  returns: Size of the layer - `int`"
  (^Integer [^MultiLayerNetwork this ^Integer layer]
    (-> this (.layerSize layer))))

(defn to-computation-graph
  "Convert this MultiLayerNetwork to a ComputationGraph

  returns: ComputationGraph equivalent to this network (including parameters and updater state) - `org.deeplearning4j.nn.graph.ComputationGraph`"
  (^org.deeplearning4j.nn.graph.ComputationGraph [^MultiLayerNetwork this]
    (-> this (.toComputationGraph))))

(defn apply-constraints
  "Description copied from interface: Model

  iteration - `int`
  epoch - `int`"
  ([^MultiLayerNetwork this ^Integer iteration ^Integer epoch]
    (-> this (.applyConstraints iteration epoch))))

(defn gradient-and-score
  "Description copied from interface: Model

  returns: the gradient and score - `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.gradient.Gradient,java.lang.Double>`"
  (^org.nd4j.linalg.primitives.Pair [^MultiLayerNetwork this]
    (-> this (.gradientAndScore))))

(defn set-epoch-count
  "Description copied from interface: Layer

  epoch-count - `int`"
  ([^MultiLayerNetwork this ^Integer epoch-count]
    (-> this (.setEpochCount epoch-count))))

