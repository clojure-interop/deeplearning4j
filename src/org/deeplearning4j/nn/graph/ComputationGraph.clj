(ns org.deeplearning4j.nn.graph.ComputationGraph
  "A ComputationGraph network is a neural network with arbitrary (directed acyclic graph) connection structure.
 A ComputationGraph may also have an arbitrary number of inputs and outputs."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.graph ComputationGraph]))

(defn ->computation-graph
  "Constructor.

  configuration - `org.deeplearning4j.nn.conf.ComputationGraphConfiguration`"
  (^ComputationGraph [^org.deeplearning4j.nn.conf.ComputationGraphConfiguration configuration]
    (new ComputationGraph configuration)))

(defn *load
  "Restore a ComputationGraph to a file, saved using save(File) or ModelSerializer

  f - File to load the network from - `java.io.File`
  load-updater - If true: load the updater if it is available (i.e., the state array for momentum/Adam/rmspropetc) - use false if no further training is required, or true if further trainingwill be undertaken - `boolean`

  returns: `org.deeplearning4j.nn.graph.ComputationGraph`

  throws: java.io.IOException"
  (^org.deeplearning4j.nn.graph.ComputationGraph [^java.io.File f ^Boolean load-updater]
    (ComputationGraph/load f load-updater)))

(defn set-labels
  "Set all labels for the ComputationGraph network

  labels - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^ComputationGraph this ^org.nd4j.linalg.api.ndarray.INDArray labels]
    (-> this (.setLabels labels))))

(defn get-output-layer
  "Get the specified output layer, by index. The index of the output
  layer may be 0 to getNumOutputArrays()-1

  output-layer-idx - `int`

  returns: `org.deeplearning4j.nn.api.Layer`"
  (^org.deeplearning4j.nn.api.Layer [^ComputationGraph this ^Integer output-layer-idx]
    (-> this (.getOutputLayer output-layer-idx))))

(defn rnn-set-previous-state
  "Set the state of the RNN layer, for use in rnnTimeStep(INDArray...)

  layer - The number/index of the layer. - `int`
  state - The state to set the specified layer to - `java.util.Map`"
  ([^ComputationGraph this ^Integer layer ^java.util.Map state]
    (-> this (.rnnSetPreviousState layer state))))

(defn set-input
  "Set the specified input for the ComputationGraph

  input-num - `int`
  input - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^ComputationGraph this ^Integer input-num ^org.nd4j.linalg.api.ndarray.INDArray input]
    (-> this (.setInput input-num input))))

(defn evaluate-roc-multi-class
  "Evaluate the network on the specified data, using the ROCMultiClass class

  iterator - Data to evaluate on - `org.nd4j.linalg.dataset.api.iterator.DataSetIterator`
  roc-threshold-steps - Number of threshold steps to use with ROCMultiClass - `int`

  returns: Multi-class ROC evaluation on the given dataset - `org.deeplearning4j.eval.ROCMultiClass`"
  (^org.deeplearning4j.eval.ROCMultiClass [^ComputationGraph this ^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iterator ^Integer roc-threshold-steps]
    (-> this (.evaluateROCMultiClass iterator roc-threshold-steps)))
  (^org.deeplearning4j.eval.ROCMultiClass [^ComputationGraph this ^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iterator]
    (-> this (.evaluateROCMultiClass iterator))))

(defn score
  "Sets the input and labels and returns a score for the prediction with respect to the true labels
  NOTE: this version of the score function can only be used with ComputationGraph networks that have
  a single input and a single output. Use score(MultiDataSet, boolean) for multiple input/output networks

  data-set - the data to score - `org.nd4j.linalg.dataset.api.DataSet`
  training - whether score is being calculated at training time (true) or test time (false) - `boolean`

  returns: the score for the given input,label pairs - `double`"
  (^Double [^ComputationGraph this ^org.nd4j.linalg.dataset.api.DataSet data-set ^Boolean training]
    (-> this (.score data-set training)))
  (^Double [^ComputationGraph this ^org.nd4j.linalg.dataset.api.DataSet data-set]
    (-> this (.score data-set)))
  (^Double [^ComputationGraph this]
    (-> this (.score))))

(defn save
  "Save the ComputationGraph to a file. Restore using load(File, boolean).

  f - File to save the network to - `java.io.File`
  save-updater - If true: save the updater (i.e., the state array for momentum/Adam/rmsprop etc), which shouldusually be saved if further training is required - `boolean`

  throws: java.io.IOException"
  ([^ComputationGraph this ^java.io.File f ^Boolean save-updater]
    (-> this (.save f save-updater)))
  ([^ComputationGraph this ^java.io.File f]
    (-> this (.save f))))

(defn param-table
  "Description copied from interface: Model

  backprop-params-only - If true, return backprop params only. If false: return all params (equivalent toparamsTable()) - `boolean`

  returns: `java.util.Map<java.lang.String,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^java.util.Map [^ComputationGraph this ^Boolean backprop-params-only]
    (-> this (.paramTable backprop-params-only)))
  (^java.util.Map [^ComputationGraph this]
    (-> this (.paramTable))))

(defn rnn-get-previous-state
  "Get the state of the RNN layer, as used in rnnTimeStep(INDArray...).

  layer - Number/index of the layer. - `int`

  returns: Hidden state, or null if layer is not an RNN layer - `java.util.Map<java.lang.String,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^java.util.Map [^ComputationGraph this ^Integer layer]
    (-> this (.rnnGetPreviousState layer))))

(defn fit
  "Fit the ComputationGraph using the specified inputs and labels (and mask arrays)

  inputs - The network inputs (features) - `org.nd4j.linalg.api.ndarray.INDArray[]`
  labels - The network labels - `org.nd4j.linalg.api.ndarray.INDArray[]`
  feature-mask-arrays - Mask arrays for inputs/features. Typically used for RNN training. May be null. - `org.nd4j.linalg.api.ndarray.INDArray[]`
  label-mask-arrays - Mas arrays for the labels/outputs. Typically used for RNN training. May be null. - `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^ComputationGraph this inputs labels feature-mask-arrays label-mask-arrays]
    (-> this (.fit inputs labels feature-mask-arrays label-mask-arrays)))
  ([^ComputationGraph this ^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iterator ^Integer num-epochs]
    (-> this (.fit iterator num-epochs)))
  ([^ComputationGraph this ^org.nd4j.linalg.dataset.api.DataSet data-set]
    (-> this (.fit data-set)))
  ([^ComputationGraph this]
    (-> this (.fit))))

(defn get-iteration-count
  "Returns the number of iterations (parameter updates) that the ComputationGraph has done

  returns: Number of iterations - `int`"
  (^Integer [^ComputationGraph this]
    (-> this (.getIterationCount))))

(defn init-gradients-view
  "This method: initializes the flattened gradients array (used in backprop) and sets the appropriate subset in all layers.
  As a general rule, this shouldn't ever need to be called manually when doing training via fit(DataSet), fit(DataSetIterator)
  or fit(MultiDataSet) methods"
  ([^ComputationGraph this]
    (-> this (.initGradientsView))))

(defn set-param
  "Description copied from interface: Model

  key - the key to se t - `java.lang.String`
  val - the new ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^ComputationGraph this ^java.lang.String key ^org.nd4j.linalg.api.ndarray.INDArray val]
    (-> this (.setParam key val))))

(defn rnn-get-previous-states
  "Get a map of states for ALL RNN layers, as used in rnnTimeStep(INDArray...).
  Layers that are not RNN layers will not have an entry in the returned map

  returns: Map of states (keyed by layer name) or null if layer is not an RNN layer - `java.util.Map<java.lang.String,java.util.Map<java.lang.String,org.nd4j.linalg.api.ndarray.INDArray>>`"
  (^java.util.Map [^ComputationGraph this]
    (-> this (.rnnGetPreviousStates))))

(defn get-epoch-count
  "Returns the number of epochs that the ComputationGraph has done.
  Note that the epoch count is incremented only when fit(DataSetIterator), fit(MultiDataSetIterator),
  fit(DataSetIterator, int) or fit(MultiDataSetIterator, int) are used.
  The epoch count can also be manually incremented using incrementEpochCount()

  returns: Number of epochs - `int`"
  (^Integer [^ComputationGraph this]
    (-> this (.getEpochCount))))

(defn set-cache-mode
  "This method sets specified CacheMode for all layers within network

  mode - `org.deeplearning4j.nn.conf.CacheMode`"
  ([^ComputationGraph this ^org.deeplearning4j.nn.conf.CacheMode mode]
    (-> this (.setCacheMode mode))))

(defn output
  "Return an array of network outputs (predictions), given the specified network inputs
  Network outputs are for output layers only.
  If no memory workspace is provided, the output will be detached (not in any workspace).
  If a memory workspace is provided, the output activation array (i.e., the INDArray returned by this method)
  will be placed in the specified workspace. This workspace must be opened by the user before calling this method -
  and the user is responsible for (a) closing this workspace, and (b) ensuring the output array is not used out
  of scope (i.e., not used after closing the workspace to which it belongs - as this is likely to cause either
  an exception when used, or a crash).

  train - If true: forward pass for training mode. False: test mode - `boolean`
  input - Input arrays to the netwonk - `org.nd4j.linalg.api.ndarray.INDArray[]`
  input-masks - Optional input mask arrays (may be null) - `org.nd4j.linalg.api.ndarray.INDArray[]`
  label-masks - Optional label mask arrays (may be null - `org.nd4j.linalg.api.ndarray.INDArray[]`
  output-workspace - May be null. If not null: the workspace MUST be opened before calling this method. - `org.nd4j.linalg.api.memory.MemoryWorkspace`

  returns: Network output activations - `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^ComputationGraph this ^Boolean train input input-masks label-masks ^org.nd4j.linalg.api.memory.MemoryWorkspace output-workspace]
    (-> this (.output train input input-masks label-masks output-workspace)))
  ([^ComputationGraph this ^Boolean train input input-masks label-masks]
    (-> this (.output train input input-masks label-masks)))
  ([^ComputationGraph this ^Boolean train ^org.nd4j.linalg.api.memory.MemoryWorkspace output-workspace ^org.nd4j.linalg.api.ndarray.INDArray input]
    (-> this (.output train output-workspace input)))
  ([^ComputationGraph this ^Boolean train ^org.nd4j.linalg.api.ndarray.INDArray input]
    (-> this (.output train input)))
  ([^ComputationGraph this ^org.nd4j.linalg.api.ndarray.INDArray input]
    (-> this (.output input))))

(defn gradient
  "Description copied from interface: Model

  returns: the gradient for this model, as calculated before - `org.deeplearning4j.nn.gradient.Gradient`"
  (^org.deeplearning4j.nn.gradient.Gradient [^ComputationGraph this]
    (-> this (.gradient))))

(defn set-conf
  "Description copied from interface: Model

  conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`"
  ([^ComputationGraph this ^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf]
    (-> this (.setConf conf))))

(defn get-vertex
  "Return a given GraphVertex by name, or null if no vertex with that name exists

  name - `java.lang.String`

  returns: `org.deeplearning4j.nn.graph.vertex.GraphVertex`"
  (^org.deeplearning4j.nn.graph.vertex.GraphVertex [^ComputationGraph this ^java.lang.String name]
    (-> this (.getVertex name))))

(defn params
  "Get the parameters for the ComputationGraph

  backward-only - If true: backprop parameters only (i.e., no visible layer biases used in layerwise pretraining layers) - `boolean`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^ComputationGraph this ^Boolean backward-only]
    (-> this (.params backward-only)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^ComputationGraph this]
    (-> this (.params))))

(defn get-learning-rate
  "Get the current learning rate, for the specified layer, from the network.
  Note: If the layer has no learning rate (no parameters, or an updater without a learning rate) then null is returned

  layer-name - `java.lang.String`

  returns: Learning rate for the specified layer, or null - `java.lang.Double`"
  (^java.lang.Double [^ComputationGraph this ^java.lang.String layer-name]
    (-> this (.getLearningRate layer-name))))

(defn compute-gradient-and-score
  "Description copied from interface: Model

  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`"
  ([^ComputationGraph this ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.computeGradientAndScore workspace-mgr)))
  ([^ComputationGraph this]
    (-> this (.computeGradientAndScore))))

(defn get-num-input-arrays
  "The number of inputs to this network

  returns: `int`"
  (^Integer [^ComputationGraph this]
    (-> this (.getNumInputArrays))))

(defn get-num-output-arrays
  "The number of output (arrays) for this network

  returns: `int`"
  (^Integer [^ComputationGraph this]
    (-> this (.getNumOutputArrays))))

(defn rnn-clear-previous-state
  "Clear the previous state of the RNN layers (if any), used in rnnTimeStep(INDArray...)"
  ([^ComputationGraph this]
    (-> this (.rnnClearPreviousState))))

(defn add-listeners
  "This method ADDS additional TrainingListener to existing listeners

  listeners - Listeners to add - `org.deeplearning4j.optimize.api.TrainingListener`"
  ([^ComputationGraph this ^org.deeplearning4j.optimize.api.TrainingListener listeners]
    (-> this (.addListeners listeners))))

(defn get-param
  "Description copied from interface: Model

  param-name - the key of the parameter - `java.lang.String`

  returns: the parameter vector/matrix with that particular key - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^ComputationGraph this ^java.lang.String param-name]
    (-> this (.getParam param-name))))

(defn get-inputs
  "Get the previously set inputs for the ComputationGraph

  returns: `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^ComputationGraph this]
    (-> this (.getInputs))))

(defn get-gradients-view-array
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^ComputationGraph this]
    (-> this (.getGradientsViewArray))))

(defn batch-size
  "Description copied from interface: Model

  returns: the current inputs batch size - `int`"
  (^Integer [^ComputationGraph this]
    (-> this (.batchSize))))

(defn evaluate-roc
  "Evaluate the network (must be a binary classifier) on the specified data, using the ROC class

  iterator - Data to evaluate on - `org.nd4j.linalg.dataset.api.iterator.DataSetIterator`
  roc-threshold-steps - Number of threshold steps to use with ROC - `int`

  returns: ROC evaluation on the given dataset - `org.deeplearning4j.eval.ROC`"
  (^org.deeplearning4j.eval.ROC [^ComputationGraph this ^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iterator ^Integer roc-threshold-steps]
    (-> this (.evaluateROC iterator roc-threshold-steps)))
  (^org.deeplearning4j.eval.ROC [^ComputationGraph this ^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iterator]
    (-> this (.evaluateROC iterator))))

(defn get-last-etl-time
  "This method returns ETL time field value

  returns: `long`"
  (^Long [^ComputationGraph this]
    (-> this (.getLastEtlTime))))

(defn clear-layer-mask-arrays
  "Remove the mask arrays from all layers.
  See setLayerMaskArrays(INDArray[], INDArray[]) for details on mask arrays."
  ([^ComputationGraph this]
    (-> this (.clearLayerMaskArrays))))

(defn pretrain
  "Pretrain network with a single input and single output. DataSetIterators can only be used if the number of input
  arrays for the ComputationGraph is 1.
  This method performs layerwise pretraining on all pre-trainable layers in the network (VAEs, Autoencoders, etc), for the specified
  number of epochs each. For example, if numEpochs=3, then layer 0 will be fit for 3 epochs, followed by layer 1
  for 3 epochs, and so on.
  For networks with more than one input use pretrain(MultiDataSetIterator)

  iter - `org.nd4j.linalg.dataset.api.iterator.DataSetIterator`
  num-epochs - `int`"
  ([^ComputationGraph this ^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iter ^Integer num-epochs]
    (-> this (.pretrain iter num-epochs)))
  ([^ComputationGraph this ^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iter]
    (-> this (.pretrain iter))))

(defn set-params-view-array
  "Description copied from interface: Model

  gradient - a 1 x nParams row vector that is a view of the larger (MLN/CG) parameters array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^ComputationGraph this ^org.nd4j.linalg.api.ndarray.INDArray gradient]
    (-> this (.setParamsViewArray gradient))))

(defn update
  "Description copied from interface: Model

  gradient - the gradient to apply - `org.nd4j.linalg.api.ndarray.INDArray`
  param-type - `java.lang.String`"
  ([^ComputationGraph this ^org.nd4j.linalg.api.ndarray.INDArray gradient ^java.lang.String param-type]
    (-> this (.update gradient param-type)))
  ([^ComputationGraph this ^org.deeplearning4j.nn.gradient.Gradient gradient]
    (-> this (.update gradient))))

(defn calculate-indices
  "Calculate the indices needed for the network:
  (a) topological sort order
  (b) Map: vertex index -> vertex name
  (c) Map: vertex name -> vertex index

  returns: Calculated indices - `org.deeplearning4j.nn.graph.util.GraphIndices`"
  (^org.deeplearning4j.nn.graph.util.GraphIndices [^ComputationGraph this]
    (-> this (.calculateIndices))))

(defn get-updater
  "Get the ComputationGraphUpdater for this network

  initialize-if-absent - If true: create the updater if one is absent. False: return null if absent. - `boolean`

  returns: Updater - `org.deeplearning4j.nn.updater.graph.ComputationGraphUpdater`"
  (^org.deeplearning4j.nn.updater.graph.ComputationGraphUpdater [^ComputationGraph this ^Boolean initialize-if-absent]
    (-> this (.getUpdater initialize-if-absent)))
  (^org.deeplearning4j.nn.updater.graph.ComputationGraphUpdater [^ComputationGraph this]
    (-> this (.getUpdater))))

(defn do-evaluation
  "Perform evaluation on the given data (DataSetIterator) with the given IEvaluation instance

  iterator - Test data to evaluate on - `org.nd4j.linalg.dataset.api.iterator.DataSetIterator`
  evaluations - IEvaluation instances - `T`

  returns: The input IEvaluation instance, after performing evaluation on the test data - `<T extends org.deeplearning4j.eval.IEvaluation> T[]`"
  ([^ComputationGraph this ^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iterator evaluations]
    (-> this (.doEvaluation iterator evaluations))))

(defn summary
  "String detailing the architecture of the computation graph.
  Will also display activation size when given an input type.
  Vertices are printed in a topological sort order.
  Columns are Vertex Names with layer/vertex type, nIn, nOut, Total number of parameters and the Shapes of the parameters
  And the inputs to the vertex
  Will also give information about frozen layers/vertices, if any.

  input-types - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: Summary as a string - `java.lang.String`"
  (^java.lang.String [^ComputationGraph this ^org.deeplearning4j.nn.conf.inputs.InputType input-types]
    (-> this (.summary input-types)))
  (^java.lang.String [^ComputationGraph this]
    (-> this (.summary))))

(defn set-updater
  "Set the computationGraphUpdater for the network

  updater - `org.deeplearning4j.nn.updater.graph.ComputationGraphUpdater`"
  ([^ComputationGraph this ^org.deeplearning4j.nn.updater.graph.ComputationGraphUpdater updater]
    (-> this (.setUpdater updater))))

(defn get-layer
  "Get the layer by the number of that layer, in range 0 to getNumLayers()-1
  NOTE: This is different from the internal GraphVertex index for the layer

  idx - `int`

  returns: `org.deeplearning4j.nn.api.Layer`"
  (^org.deeplearning4j.nn.api.Layer [^ComputationGraph this ^Integer idx]
    (-> this (.getLayer idx))))

(defn score-examples
  "Calculate the score for each example in a DataSet individually. Unlike score(DataSet) and score(DataSet, boolean)
  this method does not average/sum over examples. This method allows for examples to be scored individually (at test time only), which
  may be useful for example for autoencoder architectures and the like.
  Each row of the output (assuming addRegularizationTerms == true) is equivalent to calling score(DataSet) with a single example.

  data - The data to score - `org.nd4j.linalg.dataset.api.DataSet`
  add-regularization-terms - If true: add l1/l2 regularization terms (if any) to the score. If false: don't add regularization terms - `boolean`

  returns: An INDArray (column vector) of size input.numRows(); the ith entry is the score (loss value) of the ith example - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^ComputationGraph this ^org.nd4j.linalg.dataset.api.DataSet data ^Boolean add-regularization-terms]
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
  (^Integer [^ComputationGraph this ^Integer layer]
    (-> this (.layerInputSize layer))))

(defn increment-epoch-count
  "Increment the epoch count (in the underlying ComputationGraphConfiguration by 1).
  Note that this is done automatically when using iterator-based fitting methods, such as
  fit(DataSetIterator) or fit(MultiDataSet). However, when using non-iterator fit methods
  (DataSet, MultiDataSet, INDArrays etc), the network has no way to know when one epoch ends and another starts.
  In such situations, this method can be used to increment the epoch counter.
  Note that the epoch counter is used for situations such as some learning rate schedules, and the like.
  The current epoch count can be obtained using ComputationGraph.getConfiguration().getEpochCount()"
  ([^ComputationGraph this]
    (-> this (.incrementEpochCount))))

(defn set-learning-rate
  "Set the learning rate for a single layer in the network to the specified value. Note that if any learning rate
  schedules are currently present, these will be removed in favor of the new (fixed) learning rate.

  Note: This method not free from a performance point of view: a proper learning rate schedule
  should be used in preference to calling this method at every iteration. Note also that
  setLearningRate(double) should also be used in preference, when all layers need to be set to a new LR

  layer-name - Name of the layer to set the LR for - `java.lang.String`
  new-lr - New learning rate for a single layer - `double`"
  ([^ComputationGraph this ^java.lang.String layer-name ^Double new-lr]
    (-> this (.setLearningRate layer-name new-lr)))
  ([^ComputationGraph this ^Double new-lr]
    (-> this (.setLearningRate new-lr))))

(defn set-score
  "score - `double`"
  ([^ComputationGraph this ^Double score]
    (-> this (.setScore score))))

(defn feed-forward
  "Conduct forward pass using an array of inputs. This overload allows the forward pass to be conducted, optionally
  (not) clearing the layer input arrays.
  Note: when using clearInputs=false, there can be some performance and memory overhead: this is because the arrays are
  defined outside of workspaces (which are enabled by default) - otherwise, old/invalidated arrays could still be
  accessed after calling this method. Consequently: Don't use clearInputs=false unless you have a use case that
  requires them to remain after feed-forward has been completed

  input - An array of ComputationGraph inputs - `org.nd4j.linalg.api.ndarray.INDArray[]`
  layer-till-index - the index of the layer to feed forward to - `int`
  train - If true: do forward pass at training time; false: do forward pass at test time - `boolean`
  clear-inputs - If true (default for other methods): clear the inputs of all layers after doing forwardpass. False don't clear layer inputs. - `boolean`

  returns: A map of activations for each layer (not each GraphVertex). Keys = layer name, values = layer activations - `java.util.Map<java.lang.String,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^java.util.Map [^ComputationGraph this input ^Integer layer-till-index ^Boolean train ^Boolean clear-inputs]
    (-> this (.feedForward input layer-till-index train clear-inputs)))
  (^java.util.Map [^ComputationGraph this ^org.nd4j.linalg.api.ndarray.INDArray input ^Integer layer-till-index ^Boolean train]
    (-> this (.feedForward input layer-till-index train)))
  (^java.util.Map [^ComputationGraph this ^Boolean train ^Integer layer-till-index]
    (-> this (.feedForward train layer-till-index)))
  (^java.util.Map [^ComputationGraph this ^Boolean train]
    (-> this (.feedForward train)))
  (^java.util.Map [^ComputationGraph this]
    (-> this (.feedForward))))

(defn get-input-mask-arrays
  "Get the previously set feature/input mask arrays for the ComputationGraph

  returns: `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^ComputationGraph this]
    (-> this (.getInputMaskArrays))))

(defn get-input
  "Get the previously set input for the ComputationGraph

  input-num - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^ComputationGraph this ^Integer input-num]
    (-> this (.getInput input-num))))

(defn set-param-table
  "Description copied from interface: Model

  param-table - `java.util.Map`"
  ([^ComputationGraph this ^java.util.Map param-table]
    (-> this (.setParamTable param-table))))

(defn evaluate
  "Evaluate the network (for classification) on the provided data set, with top N accuracy in addition to standard accuracy.
  For 'standard' accuracy evaluation only, use topN = 1

  iterator - Iterator (data) to evaluate on - `org.nd4j.linalg.dataset.api.iterator.DataSetIterator`
  labels-list - List of labels. May be null. - `java.util.List`
  top-n - N value for top N accuracy evaluation - `int`

  returns: Evaluation object, summarizing the results of the evaluation on the provided DataSetIterator - `org.deeplearning4j.eval.Evaluation`"
  (^org.deeplearning4j.eval.Evaluation [^ComputationGraph this ^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iterator ^java.util.List labels-list ^Integer top-n]
    (-> this (.evaluate iterator labels-list top-n)))
  (^org.deeplearning4j.eval.Evaluation [^ComputationGraph this ^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iterator ^java.util.List labels-list]
    (-> this (.evaluate iterator labels-list)))
  (^org.deeplearning4j.eval.Evaluation [^ComputationGraph this ^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iterator]
    (-> this (.evaluate iterator))))

(defn set-last-etl-time
  "This method allows to set ETL field time, useful for performance tracking

  time - `long`"
  ([^ComputationGraph this ^Long time]
    (-> this (.setLastEtlTime time))))

(defn get-vertices
  "Returns an array of all GraphVertex objects.

  returns: `org.deeplearning4j.nn.graph.vertex.GraphVertex[]`"
  ([^ComputationGraph this]
    (-> this (.getVertices))))

(defn output-single
  "Identical to outputSingle(boolean, boolean, INDArray...) but has the option of not clearing the input
  arrays (useful when later backpropagating external errors). Most users should use outputSingle(boolean, INDArray...)
  in preference to this method.

  train - `boolean`
  clear-inputs - `boolean`
  input - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^ComputationGraph this ^Boolean train ^Boolean clear-inputs ^org.nd4j.linalg.api.ndarray.INDArray input]
    (-> this (.outputSingle train clear-inputs input)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^ComputationGraph this ^Boolean train ^org.nd4j.linalg.api.ndarray.INDArray input]
    (-> this (.outputSingle train input)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^ComputationGraph this ^org.nd4j.linalg.api.ndarray.INDArray input]
    (-> this (.outputSingle input))))

(defn set-params
  "Description copied from interface: Model

  params - the parameters for the model - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^ComputationGraph this ^org.nd4j.linalg.api.ndarray.INDArray params]
    (-> this (.setParams params))))

(defn pretrain-layer
  "Pretrain a specified layer with the given DataSetIterator

  layer-name - Layer name - `java.lang.String`
  data-set-iterator - Data - `org.nd4j.linalg.dataset.api.iterator.DataSetIterator`"
  ([^ComputationGraph this ^java.lang.String layer-name ^org.nd4j.linalg.dataset.api.iterator.DataSetIterator data-set-iterator]
    (-> this (.pretrainLayer layer-name data-set-iterator))))

(defn set-listeners
  "Set the trainingListeners for the ComputationGraph (and all layers in the network)

  listeners - `java.util.Collection`"
  ([^ComputationGraph this ^java.util.Collection listeners]
    (-> this (.setListeners listeners))))

(defn backprop-gradient
  "Calculate the gradient of the network with respect to some external errors.
  Note that this is typically used for things like reinforcement learning, not typical networks that include
  an OutputLayer or RnnOutputLayer

  epsilons - Epsilons (errors) at the output. Same order with which the output layers are defined in configuration setOutputs(String...) - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: Gradient for the network - `org.deeplearning4j.nn.gradient.Gradient`"
  (^org.deeplearning4j.nn.gradient.Gradient [^ComputationGraph this ^org.nd4j.linalg.api.ndarray.INDArray epsilons]
    (-> this (.backpropGradient epsilons))))

(defn conf
  "Description copied from interface: Model

  returns: the configuration for the neural network - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`"
  (^org.deeplearning4j.nn.conf.NeuralNetConfiguration [^ComputationGraph this]
    (-> this (.conf))))

(defn set-backprop-gradients-view-array
  "Description copied from interface: Model

  gradient - a 1 x nParams row vector that is a view of the larger (MLN/CG) gradients array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^ComputationGraph this ^org.nd4j.linalg.api.ndarray.INDArray gradient]
    (-> this (.setBackpropGradientsViewArray gradient))))

(defn num-params
  "Description copied from interface: Model

  backwards - `boolean`

  returns: the number of parameters for the model - `int`"
  (^Integer [^ComputationGraph this ^Boolean backwards]
    (-> this (.numParams backwards)))
  (^Integer [^ComputationGraph this]
    (-> this (.numParams))))

(defn updater-state
  "Description copied from interface: NeuralNetwork

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^ComputationGraph this]
    (-> this (.updaterState))))

(defn topological-sort-order
  "Calculate a topological sort order for the vertices in the graph.
  Note that this is used for
  (a) working out what order to do forward pass,
  (b) what order to do backprop (i.e., reverse of this)
  (c) order to flatten parameters (and gradients)

  Specifically, gradients/params/forward pass are executed on vertex[topologicalSortOrder[i]], for i=0..nVertices-1

  returns: `int[]`"
  ([^ComputationGraph this]
    (-> this (.topologicalSortOrder))))

(defn input
  "Description copied from interface: Model

  returns: the input/feature matrix for the model - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^ComputationGraph this]
    (-> this (.input))))

(defn get-configuration
  "This method returns configuration of this ComputationGraph

  returns: `org.deeplearning4j.nn.conf.ComputationGraphConfiguration`"
  (^org.deeplearning4j.nn.conf.ComputationGraphConfiguration [^ComputationGraph this]
    (-> this (.getConfiguration))))

(defn evaluate-regression
  "Evaluate the (single output layer only) network for regression performance

  iterator - Data to evaluate on - `org.nd4j.linalg.dataset.api.iterator.DataSetIterator`
  column-names - Column names for the regression evaluation. May be null. - `java.util.List`

  returns: Regression evaluation - `org.deeplearning4j.eval.RegressionEvaluation`"
  (^org.deeplearning4j.eval.RegressionEvaluation [^ComputationGraph this ^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iterator ^java.util.List column-names]
    (-> this (.evaluateRegression iterator column-names)))
  (^org.deeplearning4j.eval.RegressionEvaluation [^ComputationGraph this ^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iterator]
    (-> this (.evaluateRegression iterator))))

(defn get-layers
  "Get all layers in the ComputationGraph

  returns: `org.deeplearning4j.nn.api.Layer[]`"
  ([^ComputationGraph this]
    (-> this (.getLayers))))

(defn calc-l-1
  "Calculate the L1 regularization term for all layers in the entire network. This is the sum of the L1 terms
  for each layer individually

  returns: `double`"
  (^Double [^ComputationGraph this]
    (-> this (.calcL1))))

(defn calc-l-2
  "Calculate the L2 regularization term for all layers in the entire network. This is the sum of the L2 terms
  for each layer individually

  returns: `double`"
  (^Double [^ComputationGraph this]
    (-> this (.calcL2))))

(defn get-num-layers
  "Returns the number of layers in the ComputationGraph

  returns: `int`"
  (^Integer [^ComputationGraph this]
    (-> this (.getNumLayers))))

(defn init
  "Initialize the ComputationGraph, optionally with an existing parameters array.
  If an existing parameters array is specified, it will be used (and the values will not be modified) in the network;
  if no parameters array is specified, parameters will be initialized randomly according to the network configuration.

  parameters - Network parameter. May be null. If null: randomly initialize. - `org.nd4j.linalg.api.ndarray.INDArray`
  clone-parameters-array - Whether the parameter array (if any) should be cloned, or used directly - `boolean`"
  ([^ComputationGraph this ^org.nd4j.linalg.api.ndarray.INDArray parameters ^Boolean clone-parameters-array]
    (-> this (.init parameters clone-parameters-array)))
  ([^ComputationGraph this]
    (-> this (.init))))

(defn clone
  "returns: `org.deeplearning4j.nn.graph.ComputationGraph`"
  (^org.deeplearning4j.nn.graph.ComputationGraph [^ComputationGraph this]
    (-> this (.clone))))

(defn set-layer-mask-arrays
  "Set the mask arrays for features and labels. Mask arrays are typically used in situations such as one-to-many
  and many-to-one learning with recurrent neural networks, as well as for supporting time series of varying lengths
  within the same minibatch.
  For example, with RNN data sets with input of shape [miniBatchSize,nIn,timeSeriesLength] and outputs of shape
  [miniBatchSize,nOut,timeSeriesLength], the features and mask arrays will have shape [miniBatchSize,timeSeriesLength]
  and contain values 0 or 1 at each element (to specify whether a given input/example is present - or merely padding -
  at a given time step).
  NOTE: This method is not usually used directly. Instead, the various feedForward and fit methods handle setting
  of masking internally.

  feature-mask-arrays - Mask array for features (input) - `org.nd4j.linalg.api.ndarray.INDArray[]`
  label-mask-arrays - Mask array for labels (output) - `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^ComputationGraph this feature-mask-arrays label-mask-arrays]
    (-> this (.setLayerMaskArrays feature-mask-arrays label-mask-arrays))))

(defn get-listeners
  "Get the trainingListeners for the ComputationGraph

  returns: `java.util.Collection<org.deeplearning4j.optimize.api.TrainingListener>`"
  (^java.util.Collection [^ComputationGraph this]
    (-> this (.getListeners))))

(defn clear
  "Description copied from interface: Model"
  ([^ComputationGraph this]
    (-> this (.clear))))

(defn set-inputs
  "Set all inputs for the ComputationGraph network

  inputs - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^ComputationGraph this ^org.nd4j.linalg.api.ndarray.INDArray inputs]
    (-> this (.setInputs inputs))))

(defn rnn-time-step
  "If this ComputationGraph contains one or more RNN layers: conduct forward pass (prediction)
  but using previous stored state for any RNN layers. The activations for the final step are
  also stored in the RNN layers for use next time rnnTimeStep() is called.
  This method can be used to generate output one or more steps at a time instead of always having to do
  forward pass from t=0. Example uses are for streaming data, and for generating samples from network output
  one step at a time (where samples are then fed back into the network as input)
  If no previous state is present in RNN layers (i.e., initially or after calling rnnClearPreviousState()),
  the default initialization (usually 0) is used.
  Supports mini-batch (i.e., multiple predictions/forward pass in parallel) as well as for single examples.

  inputs - Input to network. May be for one or multiple time steps. For single time step:input has shape [miniBatchSize,inputSize] or [miniBatchSize,inputSize,1]. miniBatchSize=1 for single example.For multiple time steps: [miniBatchSize,inputSize,inputTimeSeriesLength] - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: Output activations. If output is RNN layer (such as RnnOutputLayer): if all inputs have shape [miniBatchSize,inputSize]
  i.e., is 2d, then outputs have shape [miniBatchSize,outputSize] (i.e., also 2d) instead of [miniBatchSize,outputSize,1].
  Otherwise output is 3d [miniBatchSize,outputSize,inputTimeSeriesLength] when using RnnOutputLayer (or unmodified otherwise). - `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^ComputationGraph this ^org.nd4j.linalg.api.ndarray.INDArray inputs]
    (-> this (.rnnTimeStep inputs))))

(defn rnn-activate-using-stored-state
  "Similar to rnnTimeStep and feedForward() methods. Difference here is that this method:
  (a) like rnnTimeStep does forward pass using stored state for RNN layers, and
  (b) unlike rnnTimeStep does not modify the RNN layer state
  Therefore multiple calls to this method with the same input should have the same output.
  Typically used during training only. Use rnnTimeStep for prediction/forward pass at test time.

  inputs - Input to network - `org.nd4j.linalg.api.ndarray.INDArray[]`
  training - Whether training or not - `boolean`
  store-last-for-tbptt - set to true if used as part of truncated BPTT training - `boolean`

  returns: Activations for each layer (including input, as per feedforward() etc) - `java.util.Map<java.lang.String,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^java.util.Map [^ComputationGraph this inputs ^Boolean training ^Boolean store-last-for-tbptt]
    (-> this (.rnnActivateUsingStoredState inputs training store-last-for-tbptt))))

(defn rnn-set-previous-states
  "Set the states for all RNN layers, for use in rnnTimeStep(INDArray...)

  previous-states - The previous time step states for all layers (key: layer name. Value: layer states) - `java.util.Map`"
  ([^ComputationGraph this ^java.util.Map previous-states]
    (-> this (.rnnSetPreviousStates previous-states))))

(defn memory-info
  "Generate information regarding memory use for the network, for the given input types and minibatch size.
  Note that when using workspaces or CuDNN, the network should be trained for some iterations so that the memory
  workspaces have time to initialize. Without this, the memory requirements during training may be underestimated.
  Note also that this is the same information that is generated during an OOM crash when training or performing
  inference.

  minibatch - Minibatch size to estimate memory for - `int`
  input-types - Input types to the network - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: A String with information about network memory use information - `java.lang.String`"
  (^java.lang.String [^ComputationGraph this ^Integer minibatch ^org.deeplearning4j.nn.conf.inputs.InputType input-types]
    (-> this (.memoryInfo minibatch input-types))))

(defn get-optimizer
  "Description copied from interface: Model

  returns: this models optimizer - `org.deeplearning4j.optimize.api.ConvexOptimizer`"
  (^org.deeplearning4j.optimize.api.ConvexOptimizer [^ComputationGraph this]
    (-> this (.getOptimizer))))

(defn set-gradients-accumulator
  "This method allows you to specificy GradientsAccumulator instance to be used with this model

  PLEASE NOTE: Do not use this method unless you understand how to use GradientsAccumulator & updates sharing.
  PLEASE NOTE: Do not use this method on standalone model

  accumulator - `org.deeplearning4j.optimize.solvers.accumulation.GradientsAccumulator`"
  ([^ComputationGraph this ^org.deeplearning4j.optimize.solvers.accumulation.GradientsAccumulator accumulator]
    (-> this (.setGradientsAccumulator accumulator))))

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
  (^Boolean [^ComputationGraph this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn layer-size
  "Return the layer size (number of units) for the specified layer.
  Note that the meaning of the \"layer size\" can depend on the type of layer. For example:
  - DenseLayer, OutputLayer, recurrent layers: number of units (nOut configuration option)
  - ConvolutionLayer: the channels (number of channels)
  - Subsampling layers, global pooling layers, etc: size of 0 is always returned

  layer - Index of the layer to get the size of. Must be in range 0 to nLayers-1 inclusive - `int`

  returns: Size of the layer - `int`"
  (^Integer [^ComputationGraph this ^Integer layer]
    (-> this (.layerSize layer))))

(defn get-label-mask-arrays
  "Get the previously set label/output mask arrays for the ComputationGraph

  returns: `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^ComputationGraph this]
    (-> this (.getLabelMaskArrays))))

(defn apply-constraints
  "Description copied from interface: Model

  iteration - `int`
  epoch - `int`"
  ([^ComputationGraph this ^Integer iteration ^Integer epoch]
    (-> this (.applyConstraints iteration epoch))))

(defn gradient-and-score
  "Description copied from interface: Model

  returns: the gradient and score - `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.gradient.Gradient,java.lang.Double>`"
  (^org.nd4j.linalg.primitives.Pair [^ComputationGraph this]
    (-> this (.gradientAndScore))))

(defn set-label
  "Set the specified label for the ComputationGraph

  label-num - `int`
  label - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^ComputationGraph this ^Integer label-num ^org.nd4j.linalg.api.ndarray.INDArray label]
    (-> this (.setLabel label-num label))))

