(ns org.deeplearning4j.nn.transferlearning.TransferLearning$GraphBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.transferlearning TransferLearning$GraphBuilder]))

(defn ->graph-builder
  "Constructor.

  Computation Graph to tweak for transfer learning

  orig-graph - `org.deeplearning4j.nn.graph.ComputationGraph`"
  (^TransferLearning$GraphBuilder [^org.deeplearning4j.nn.graph.ComputationGraph orig-graph]
    (new TransferLearning$GraphBuilder orig-graph)))

(defn set-input-types
  "Sets the input type of corresponding inputs.

  input-types - The type of input (such as convolutional). - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: GraphBuilder instance. - `org.deeplearning4j.nn.transferlearning.TransferLearning$GraphBuilder`"
  (^org.deeplearning4j.nn.transferlearning.TransferLearning$GraphBuilder [^TransferLearning$GraphBuilder this ^org.deeplearning4j.nn.conf.inputs.InputType input-types]
    (-> this (.setInputTypes input-types))))

(defn add-vertex
  "Add a vertex of the given configuration to the computation graph

  vertex-name - `java.lang.String`
  vertex - `org.deeplearning4j.nn.conf.graph.GraphVertex`
  vertex-inputs - `java.lang.String`

  returns: `org.deeplearning4j.nn.transferlearning.TransferLearning$GraphBuilder`"
  (^org.deeplearning4j.nn.transferlearning.TransferLearning$GraphBuilder [^TransferLearning$GraphBuilder this ^java.lang.String vertex-name ^org.deeplearning4j.nn.conf.graph.GraphVertex vertex ^java.lang.String vertex-inputs]
    (-> this (.addVertex vertex-name vertex vertex-inputs))))

(defn remove-vertex-keep-connections
  "Remove the specified vertex from the computation graph but keep it's connections.
  Note the expectation here is to then add back another vertex with the same name or else the graph will be left in an invalid state
  Possibly with references to vertices that no longer exist

  output-name - `java.lang.String`

  returns: `org.deeplearning4j.nn.transferlearning.TransferLearning$GraphBuilder`"
  (^org.deeplearning4j.nn.transferlearning.TransferLearning$GraphBuilder [^TransferLearning$GraphBuilder this ^java.lang.String output-name]
    (-> this (.removeVertexKeepConnections output-name))))

(defn add-layer
  "Add a layer with a specified preprocessor

  layer-name - `java.lang.String`
  layer - `org.deeplearning4j.nn.conf.layers.Layer`
  pre-processor - `org.deeplearning4j.nn.conf.InputPreProcessor`
  layer-inputs - `java.lang.String`

  returns: `org.deeplearning4j.nn.transferlearning.TransferLearning$GraphBuilder`"
  (^org.deeplearning4j.nn.transferlearning.TransferLearning$GraphBuilder [^TransferLearning$GraphBuilder this ^java.lang.String layer-name ^org.deeplearning4j.nn.conf.layers.Layer layer ^org.deeplearning4j.nn.conf.InputPreProcessor pre-processor ^java.lang.String layer-inputs]
    (-> this (.addLayer layer-name layer pre-processor layer-inputs)))
  (^org.deeplearning4j.nn.transferlearning.TransferLearning$GraphBuilder [^TransferLearning$GraphBuilder this ^java.lang.String layer-name ^org.deeplearning4j.nn.conf.layers.Layer layer ^java.lang.String layer-inputs]
    (-> this (.addLayer layer-name layer layer-inputs))))

(defn fine-tune-configuration
  "Set parameters to selectively override existing learning parameters
  Usage eg. specify a lower learning rate. This will get applied to all layers

  fine-tune-configuration - `org.deeplearning4j.nn.transferlearning.FineTuneConfiguration`

  returns: GraphBuilder - `org.deeplearning4j.nn.transferlearning.TransferLearning$GraphBuilder`"
  (^org.deeplearning4j.nn.transferlearning.TransferLearning$GraphBuilder [^TransferLearning$GraphBuilder this ^org.deeplearning4j.nn.transferlearning.FineTuneConfiguration fine-tune-configuration]
    (-> this (.fineTuneConfiguration fine-tune-configuration))))

(defn build
  "Returns a computation graph build to specifications.
  Init has been internally called. Can be fit directly.

  returns: Computation graph - `org.deeplearning4j.nn.graph.ComputationGraph`"
  (^org.deeplearning4j.nn.graph.ComputationGraph [^TransferLearning$GraphBuilder this]
    (-> this (.build))))

(defn remove-vertex-and-connections
  "Remove specified vertex and it's connections from the computation graph

  vertex-name - `java.lang.String`

  returns: `org.deeplearning4j.nn.transferlearning.TransferLearning$GraphBuilder`"
  (^org.deeplearning4j.nn.transferlearning.TransferLearning$GraphBuilder [^TransferLearning$GraphBuilder this ^java.lang.String vertex-name]
    (-> this (.removeVertexAndConnections vertex-name))))

(defn add-inputs
  "input-names - `java.lang.String`

  returns: `org.deeplearning4j.nn.transferlearning.TransferLearning$GraphBuilder`"
  (^org.deeplearning4j.nn.transferlearning.TransferLearning$GraphBuilder [^TransferLearning$GraphBuilder this ^java.lang.String input-names]
    (-> this (.addInputs input-names))))

(defn set-feature-extractor
  "Specify a layer vertex to set as a \"feature extractor\"
  The specified layer vertex and the layers on the path from an input vertex to it it will be \"frozen\" with parameters staying constant

  layer-name - `java.lang.String`

  returns: Builder - `org.deeplearning4j.nn.transferlearning.TransferLearning$GraphBuilder`"
  (^org.deeplearning4j.nn.transferlearning.TransferLearning$GraphBuilder [^TransferLearning$GraphBuilder this ^java.lang.String layer-name]
    (-> this (.setFeatureExtractor layer-name))))

(defn set-outputs
  "Set outputs to the computation graph, will add to ones that are existing
  Also determines the order, like in ComputationGraphConfiguration

  output-names - `java.lang.String`

  returns: `org.deeplearning4j.nn.transferlearning.TransferLearning$GraphBuilder`"
  (^org.deeplearning4j.nn.transferlearning.TransferLearning$GraphBuilder [^TransferLearning$GraphBuilder this ^java.lang.String output-names]
    (-> this (.setOutputs output-names))))

(defn set-inputs
  "Sets new inputs for the computation graph. This method will remove any
  pre-existing inputs.

  inputs - String names of each graph input. - `java.lang.String`

  returns: GraphBuilder instance. - `org.deeplearning4j.nn.transferlearning.TransferLearning$GraphBuilder`"
  (^org.deeplearning4j.nn.transferlearning.TransferLearning$GraphBuilder [^TransferLearning$GraphBuilder this ^java.lang.String inputs]
    (-> this (.setInputs inputs))))

(defn n-out-replace
  "Modified nOut of specified layer. Also affects layers following layerName unless they are output layers

  layer-name - The name of the layer to change nOut of - `java.lang.String`
  n-out - Value of nOut to change to - `int`
  dist - Weight distribution scheme to use for layerName - `org.deeplearning4j.nn.conf.distribution.Distribution`
  dist-next - Weight distribution scheme for layers following layerName - `org.deeplearning4j.nn.conf.distribution.Distribution`

  returns: GraphBuilder - `org.deeplearning4j.nn.transferlearning.TransferLearning$GraphBuilder`"
  (^org.deeplearning4j.nn.transferlearning.TransferLearning$GraphBuilder [^TransferLearning$GraphBuilder this ^java.lang.String layer-name ^Integer n-out ^org.deeplearning4j.nn.conf.distribution.Distribution dist ^org.deeplearning4j.nn.conf.distribution.Distribution dist-next]
    (-> this (.nOutReplace layer-name n-out dist dist-next)))
  (^org.deeplearning4j.nn.transferlearning.TransferLearning$GraphBuilder [^TransferLearning$GraphBuilder this ^java.lang.String layer-name ^Integer n-out ^org.deeplearning4j.nn.weights.WeightInit scheme]
    (-> this (.nOutReplace layer-name n-out scheme))))

(defn set-workspace-mode
  "workspace-mode - `org.deeplearning4j.nn.conf.WorkspaceMode`

  returns: `org.deeplearning4j.nn.transferlearning.TransferLearning$GraphBuilder`"
  (^org.deeplearning4j.nn.transferlearning.TransferLearning$GraphBuilder [^TransferLearning$GraphBuilder this ^org.deeplearning4j.nn.conf.WorkspaceMode workspace-mode]
    (-> this (.setWorkspaceMode workspace-mode))))

