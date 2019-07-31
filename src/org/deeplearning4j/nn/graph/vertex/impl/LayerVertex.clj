(ns org.deeplearning4j.nn.graph.vertex.impl.LayerVertex
  "LayerVertex is a GraphVertex with a neural network Layer (and, optionally an InputPreProcessor) in it"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.graph.vertex.impl LayerVertex]))

(defn ->layer-vertex
  "Constructor.

  Create a network input vertex:

  graph - `org.deeplearning4j.nn.graph.ComputationGraph`
  name - `java.lang.String`
  vertex-index - `int`
  layer - `org.deeplearning4j.nn.api.Layer`
  layer-pre-processor - `org.deeplearning4j.nn.conf.InputPreProcessor`
  output-vertex - `boolean`"
  (^LayerVertex [^org.deeplearning4j.nn.graph.ComputationGraph graph ^java.lang.String name ^Integer vertex-index ^org.deeplearning4j.nn.api.Layer layer ^org.deeplearning4j.nn.conf.InputPreProcessor layer-pre-processor ^Boolean output-vertex]
    (new LayerVertex graph name vertex-index layer layer-pre-processor output-vertex))
  (^LayerVertex [^org.deeplearning4j.nn.graph.ComputationGraph graph ^java.lang.String name ^Integer vertex-index input-vertices output-vertices ^org.deeplearning4j.nn.api.Layer layer ^org.deeplearning4j.nn.conf.InputPreProcessor layer-pre-processor ^Boolean output-vertex]
    (new LayerVertex graph name vertex-index input-vertices output-vertices layer layer-pre-processor output-vertex)))

(defn set-input
  "Description copied from interface: GraphVertex

  input-number - Must be in range 0 to GraphVertex.getNumInputArrays()-1 - `int`
  input - The input array - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`"
  ([^LayerVertex this ^Integer input-number ^org.nd4j.linalg.api.ndarray.INDArray input ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.setInput input-number input workspace-mgr))))

(defn feed-forward-mask-arrays
  "mask-arrays - `org.nd4j.linalg.api.ndarray.INDArray[]`
  current-mask-state - `org.deeplearning4j.nn.api.MaskState`
  minibatch-size - `int`

  returns: `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,org.deeplearning4j.nn.api.MaskState>`"
  (^org.nd4j.linalg.primitives.Pair [^LayerVertex this mask-arrays ^org.deeplearning4j.nn.api.MaskState current-mask-state ^Integer minibatch-size]
    (-> this (.feedForwardMaskArrays mask-arrays current-mask-state minibatch-size))))

(defn param-table
  "Description copied from interface: GraphVertex

  backprop-only - If true: exclude unsupervised training parameters - `boolean`

  returns: Parameter table - `java.util.Map<java.lang.String,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^java.util.Map [^LayerVertex this ^Boolean backprop-only]
    (-> this (.paramTable backprop-only))))

(defn has-layer?
  "Description copied from interface: GraphVertex

  returns: `boolean`"
  (^Boolean [^LayerVertex this]
    (-> this (.hasLayer))))

(defn params
  "returns: 1d parameter vector - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^LayerVertex this]
    (-> this (.params))))

(defn do-backward
  "Description copied from interface: GraphVertex

  tbptt - If true: do backprop using truncated BPTT - `boolean`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: The gradients (may be null), and the errors/epsilons for all inputs to this GraphVertex - `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.gradient.Gradient,org.nd4j.linalg.api.ndarray.INDArray[]>`"
  ([^LayerVertex this ^Boolean tbptt ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.doBackward tbptt workspace-mgr))))

(defn get-gradients-view-array
  "returns: 1D gradients view array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^LayerVertex this]
    (-> this (.getGradientsViewArray))))

(defn compute-score
  "l-1 - `double`
  l-2 - `double`
  training - `boolean`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: `double`"
  (^Double [^LayerVertex this ^Double l-1 ^Double l-2 ^Boolean training ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.computeScore l-1 l-2 training workspace-mgr))))

(defn output-vertex?
  "Description copied from interface: GraphVertex

  returns: `boolean`"
  (^Boolean [^LayerVertex this]
    (-> this (.isOutputVertex))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^LayerVertex this]
    (-> this (.toString))))

(defn can-do-backward?
  "Description copied from interface: GraphVertex

  returns: `boolean`"
  (^Boolean [^LayerVertex this]
    (-> this (.canDoBackward))))

(defn get-layer
  "Description copied from interface: GraphVertex

  returns: `org.deeplearning4j.nn.api.Layer`"
  (^org.deeplearning4j.nn.api.Layer [^LayerVertex this]
    (-> this (.getLayer))))

(defn set-backprop-gradients-view-array
  "Description copied from interface: GraphVertex

  backprop-gradients-view-array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^LayerVertex this ^org.nd4j.linalg.api.ndarray.INDArray backprop-gradients-view-array]
    (-> this (.setBackpropGradientsViewArray backprop-gradients-view-array))))

(defn set-layer-as-frozen
  "Description copied from interface: GraphVertex"
  ([^LayerVertex this]
    (-> this (.setLayerAsFrozen))))

(defn compute-score-for-examples
  "l-1 - `double`
  l-2 - `double`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^LayerVertex this ^Double l-1 ^Double l-2 ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.computeScoreForExamples l-1 l-2 workspace-mgr))))

(defn do-forward
  "Description copied from interface: GraphVertex

  training - if true: forward pass at training time. If false: forward pass at test time - `boolean`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: The output (for example, activations) of the GraphVertex - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^LayerVertex this ^Boolean training ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.doForward training workspace-mgr))))

(defn get-config
  "returns: Training configuration - `org.deeplearning4j.nn.api.TrainingConfig`"
  (^org.deeplearning4j.nn.api.TrainingConfig [^LayerVertex this]
    (-> this (.getConfig))))

