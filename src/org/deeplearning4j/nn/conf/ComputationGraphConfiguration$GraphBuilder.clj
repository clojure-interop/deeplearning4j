(ns org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf ComputationGraphConfiguration$GraphBuilder]))

(defn ->graph-builder
  "Constructor.

  new-conf - `org.deeplearning4j.nn.conf.ComputationGraphConfiguration`
  global-configuration - `org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder`"
  (^ComputationGraphConfiguration$GraphBuilder [^org.deeplearning4j.nn.conf.ComputationGraphConfiguration new-conf ^org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder global-configuration]
    (new ComputationGraphConfiguration$GraphBuilder new-conf global-configuration))
  (^ComputationGraphConfiguration$GraphBuilder [^org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder global-configuration]
    (new ComputationGraphConfiguration$GraphBuilder global-configuration)))

(defn set-input-types
  "Specify the types of inputs to the network, so that:
  (a) preprocessors can be automatically added, and
  (b) the nIns (input size) for each layer can be automatically calculated and set
  The order here is the same order as .addInputs(). Thus, if you do .addInputs(\"a\",\"b\") and .setInputTypes(InputType.feedForward(),
  InputType.convolutional(28,28,1)) then the input labelled \"a\" is a feed forward input, whereas the input labelled \"b\" in a CNN
  input, with 28x28x1 images as input.
  Note: Using setInputTypes is not always necessary, but can be especially helpful for example with CNNs such that
  the calculations on input/ouput sizes (width, height, channels, etc) don't need to be done manually.
  Note 2: If a preprocessor is manually added for a given layer, it will not be overridden by the automatic
  addition of preprocessors.
  Note 3: If a layer has an nIn set manually, this will not be overridden

  input-types - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: `org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder`"
  (^org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder [^ComputationGraphConfiguration$GraphBuilder this ^org.deeplearning4j.nn.conf.inputs.InputType input-types]
    (-> this (.setInputTypes input-types))))

(defn t-bptt-length
  "When doing truncated backpropagation through time (tBPTT): how many steps should we do?
  Only applicable when doing backpropType(BackpropType.TruncatedBPTT)
  See: http://www.cs.utoronto.ca/~ilya/pubs/ilya_sutskever_phd_thesis.pdf

  tbptt-length - length > 0 - `int`

  returns: `org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder`"
  (^org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder [^ComputationGraphConfiguration$GraphBuilder this ^Integer tbptt-length]
    (-> this (.tBPTTLength tbptt-length))))

(defn pretrain
  "Whether to do layerwise pre training or not

  pretrain - whether to do pre train or not - `boolean`

  returns: `org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder`"
  (^org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder [^ComputationGraphConfiguration$GraphBuilder this ^Boolean pretrain]
    (-> this (.pretrain pretrain))))

(defn remove-vertex
  "Intended for use with the transfer learning API. Users discouraged from employing it directly.
  Removes the specified vertex from the vertices list,
  Removes it's connections (associated preprocessor and if an output also removes it from list of outputs) if \"removeConnections\" is specified as true
  Specifying as false can leave the graph in an invalid state with references to vertices that donot exist unless a new vertex is added back in with the same name

  vertex-name - Name of the vertex to remove - `java.lang.String`
  remove-connections - Specify true to remove connections - `boolean`

  returns: `org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder`"
  (^org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder [^ComputationGraphConfiguration$GraphBuilder this ^java.lang.String vertex-name ^Boolean remove-connections]
    (-> this (.removeVertex vertex-name remove-connections)))
  (^org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder [^ComputationGraphConfiguration$GraphBuilder this ^java.lang.String vertex-name]
    (-> this (.removeVertex vertex-name))))

(defn backprop
  "Whether to do back prop (standard supervised learning) or not

  backprop - whether to do back prop or not - `boolean`

  returns: `org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder`"
  (^org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder [^ComputationGraphConfiguration$GraphBuilder this ^Boolean backprop]
    (-> this (.backprop backprop))))

(defn add-vertex
  "Add a GraphVertex to the network configuration. A GraphVertex defines forward and backward pass methods,
  and can contain a LayerVertex, a ElementWiseVertex to do element-wise
  addition/subtraction, a MergeVertex to combine/concatenate the activations out of multiple layers or vertices,
  a SubsetVertex to select a subset of the activations out of another layer/GraphVertex.
  Custom GraphVertex objects (that extend the abstract GraphVertex class) may also be used.

  vertex-name - The name of the GraphVertex to add - `java.lang.String`
  vertex - The GraphVertex to add - `org.deeplearning4j.nn.conf.graph.GraphVertex`
  vertex-inputs - The inputs/activations to this GraphVertex - `java.lang.String`

  returns: `org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder`"
  (^org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder [^ComputationGraphConfiguration$GraphBuilder this ^java.lang.String vertex-name ^org.deeplearning4j.nn.conf.graph.GraphVertex vertex ^java.lang.String vertex-inputs]
    (-> this (.addVertex vertex-name vertex vertex-inputs))))

(defn add-layer
  "Add a layer and an InputPreProcessor, with the specified name and specified inputs.

  layer-name - Name/label of the layer to add - `java.lang.String`
  layer - The layer configuration - `org.deeplearning4j.nn.conf.layers.Layer`
  pre-processor - The InputPreProcessor to use with this layer. - `org.deeplearning4j.nn.conf.InputPreProcessor`
  layer-inputs - Inputs to this layer (must be 1 or more). Inputs may be other layers, GraphVertex objects,on a combination of the two. - `java.lang.String`

  returns: `org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder`"
  (^org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder [^ComputationGraphConfiguration$GraphBuilder this ^java.lang.String layer-name ^org.deeplearning4j.nn.conf.layers.Layer layer ^org.deeplearning4j.nn.conf.InputPreProcessor pre-processor ^java.lang.String layer-inputs]
    (-> this (.addLayer layer-name layer pre-processor layer-inputs)))
  (^org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder [^ComputationGraphConfiguration$GraphBuilder this ^java.lang.String layer-name ^org.deeplearning4j.nn.conf.layers.Layer layer ^java.lang.String layer-inputs]
    (-> this (.addLayer layer-name layer layer-inputs))))

(defn input-pre-processor
  "Specify the processors for a given layer
  These are used at each layer for doing things like normalization and shaping of input.
  Note: preprocessors can also be defined using the addLayer(String, Layer, InputPreProcessor, String...) method.

  layer - the name of the layer that this preprocessor will be used with - `java.lang.String`
  processor - the preprocessor to use for the specified layer - `org.deeplearning4j.nn.conf.InputPreProcessor`

  returns: `org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder`"
  (^org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder [^ComputationGraphConfiguration$GraphBuilder this ^java.lang.String layer ^org.deeplearning4j.nn.conf.InputPreProcessor processor]
    (-> this (.inputPreProcessor layer processor))))

(defn t-bptt-forward-length
  "When doing truncated BPTT: how many steps of forward pass should we do
  before doing (truncated) backprop?
  Only applicable when doing backpropType(BackpropType.TruncatedBPTT)
  Typically tBPTTForwardLength parameter is same as the tBPTTBackwardLength parameter,
  but may be larger than it in some circumstances (but never smaller)
  Ideally your training data time series length should be divisible by this
  This is the k1 parameter on pg23 of
  http://www.cs.utoronto.ca/~ilya/pubs/ilya_sutskever_phd_thesis.pdf

  forward-length - Forward length > 0, >= backwardLength - `int`

  returns: `org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder`"
  (^org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder [^ComputationGraphConfiguration$GraphBuilder this ^Integer forward-length]
    (-> this (.tBPTTForwardLength forward-length))))

(defn t-bptt-backward-length
  "When doing truncated BPTT: how many steps of backward should we do?
  Only applicable when doing backpropType(BackpropType.TruncatedBPTT)
  This is the k2 parameter on pg23 of
  http://www.cs.utoronto.ca/~ilya/pubs/ilya_sutskever_phd_thesis.pdf

  backward-length - <= forwardLength - `int`

  returns: `org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder`"
  (^org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder [^ComputationGraphConfiguration$GraphBuilder this ^Integer backward-length]
    (-> this (.tBPTTBackwardLength backward-length))))

(defn allow-disconnected
  "Used only during validation after building.
  If true: don't throw an exception on configurations containing vertices that are 'disconnected'. A disconnected
  vertex is one that is not an output, and doesn't connect to any other vertices. i.e., it's output activations
  don't go anywhere. Most users can (and should) leave this as the default value of false.

  allow-disconnected - Whether to allow disconnected vertices, during validation - `boolean`

  returns: `org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder`"
  (^org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder [^ComputationGraphConfiguration$GraphBuilder this ^Boolean allow-disconnected]
    (-> this (.allowDisconnected allow-disconnected))))

(defn build
  "Create the ComputationGraphConfiguration from the Builder pattern

  returns: `org.deeplearning4j.nn.conf.ComputationGraphConfiguration`"
  (^org.deeplearning4j.nn.conf.ComputationGraphConfiguration [^ComputationGraphConfiguration$GraphBuilder this]
    (-> this (.build))))

(defn get-layer-activation-types
  "For the (perhaps partially constructed) network configuration, return a map of activation sizes for each
  layer and vertex in the graph.
  Note 1: The network configuration may be incomplete, but the inputs have been added to the layer already.
  Note 2: To use this method, the network input types must have been set using setInputTypes(InputType...)
  first

  returns: A map of activation types for the graph (key: vertex name. value: type of activations out of that vertex) - `java.util.Map<java.lang.String,org.deeplearning4j.nn.conf.inputs.InputType>`"
  (^java.util.Map [^ComputationGraphConfiguration$GraphBuilder this]
    (-> this (.getLayerActivationTypes))))

(defn add-inputs
  "Specify the inputs to the network, and their associated labels.

  input-names - The names of the inputs. This also defines their order - `java.lang.String`

  returns: `org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder`"
  (^org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder [^ComputationGraphConfiguration$GraphBuilder this ^java.lang.String input-names]
    (-> this (.addInputs input-names))))

(defn backprop-type
  "The type of backprop. Default setting is used for most networks (MLP, CNN etc),
  but optionally truncated BPTT can be used for training recurrent neural networks.
  If using TruncatedBPTT make sure you set both tBPTTForwardLength() and tBPTTBackwardLength()

  type - Type of backprop. Default: BackpropType.Standard - `org.deeplearning4j.nn.conf.BackpropType`

  returns: `org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder`"
  (^org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder [^ComputationGraphConfiguration$GraphBuilder this ^org.deeplearning4j.nn.conf.BackpropType type]
    (-> this (.backpropType type))))

(defn set-outputs
  "Set the network output labels. These should be the names of the OutputLayer instances in the network

  output-names - The names of the output layers. This also defines their order. - `java.lang.String`

  returns: `org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder`"
  (^org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder [^ComputationGraphConfiguration$GraphBuilder this ^java.lang.String output-names]
    (-> this (.setOutputs output-names))))

(defn layer
  "Add a layer and an InputPreProcessor, with the specified name and specified inputs.

  layer-name - Name/label of the layer to add - `java.lang.String`
  layer - The layer configuration - `org.deeplearning4j.nn.conf.layers.Layer`
  pre-processor - The InputPreProcessor to use with this layer. - `org.deeplearning4j.nn.conf.InputPreProcessor`
  layer-inputs - Inputs to this layer (must be 1 or more). Inputs may be other layers, GraphVertex objects,on a combination of the two. - `java.lang.String`

  returns: `org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder`"
  (^org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder [^ComputationGraphConfiguration$GraphBuilder this ^java.lang.String layer-name ^org.deeplearning4j.nn.conf.layers.Layer layer ^org.deeplearning4j.nn.conf.InputPreProcessor pre-processor ^java.lang.String layer-inputs]
    (-> this (.layer layer-name layer pre-processor layer-inputs)))
  (^org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder [^ComputationGraphConfiguration$GraphBuilder this ^Integer layer-name ^org.deeplearning4j.nn.conf.layers.Layer layer ^java.lang.String layer-inputs]
    (-> this (.layer layer-name layer layer-inputs))))

(defn allow-no-output
  "Used only during validation after building.
  If true: don't throw an exception on configurations without any outputs. This is enabled by default
  to avoid creating invalid graphs, but can be disabled if required.
  Most users can (and should) leave this as the default value of false.

  allow-no-output - Whether to allow no outputs, during validation - `boolean`

  returns: `org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder`"
  (^org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder [^ComputationGraphConfiguration$GraphBuilder this ^Boolean allow-no-output]
    (-> this (.allowNoOutput allow-no-output))))

