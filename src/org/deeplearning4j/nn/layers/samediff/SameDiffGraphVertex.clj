(ns org.deeplearning4j.nn.layers.samediff.SameDiffGraphVertex
  "Implementation of a SameDiff graph vertex.
 Note that users should not be extending this directly - instead, use SameDiffVertex"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.layers.samediff SameDiffGraphVertex]))

(defn ->same-diff-graph-vertex
  "Constructor.

  config - `org.deeplearning4j.nn.conf.layers.samediff.SameDiffVertex`
  graph - `org.deeplearning4j.nn.graph.ComputationGraph`
  name - `java.lang.String`
  vertex-index - `int`
  params-view - `org.nd4j.linalg.api.ndarray.INDArray`
  init-params - `boolean`"
  (^SameDiffGraphVertex [^org.deeplearning4j.nn.conf.layers.samediff.SameDiffVertex config ^org.deeplearning4j.nn.graph.ComputationGraph graph ^java.lang.String name ^Integer vertex-index ^org.nd4j.linalg.api.ndarray.INDArray params-view ^Boolean init-params]
    (new SameDiffGraphVertex config graph name vertex-index params-view init-params)))

(defn feed-forward-mask-arrays
  "mask-arrays - `org.nd4j.linalg.api.ndarray.INDArray[]`
  current-mask-state - `org.deeplearning4j.nn.api.MaskState`
  minibatch-size - `int`

  returns: `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,org.deeplearning4j.nn.api.MaskState>`"
  (^org.nd4j.linalg.primitives.Pair [^SameDiffGraphVertex this mask-arrays ^org.deeplearning4j.nn.api.MaskState current-mask-state ^Integer minibatch-size]
    (-> this (.feedForwardMaskArrays mask-arrays current-mask-state minibatch-size))))

(defn param-table
  "Description copied from interface: GraphVertex

  backprop-only - If true: exclude unsupervised training parameters - `boolean`

  returns: Parameter table - `java.util.Map<java.lang.String,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^java.util.Map [^SameDiffGraphVertex this ^Boolean backprop-only]
    (-> this (.paramTable backprop-only))))

(defn has-layer?
  "Description copied from interface: GraphVertex

  returns: `boolean`"
  (^Boolean [^SameDiffGraphVertex this]
    (-> this (.hasLayer))))

(defn params
  "returns: 1d parameter vector - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^SameDiffGraphVertex this]
    (-> this (.params))))

(defn do-backward
  "Description copied from interface: GraphVertex

  tbptt - If true: do backprop using truncated BPTT - `boolean`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: The gradients (may be null), and the errors/epsilons for all inputs to this GraphVertex - `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.gradient.Gradient,org.nd4j.linalg.api.ndarray.INDArray[]>`"
  ([^SameDiffGraphVertex this ^Boolean tbptt ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.doBackward tbptt workspace-mgr))))

(defn get-gradients-view-array
  "returns: 1D gradients view array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^SameDiffGraphVertex this]
    (-> this (.getGradientsViewArray))))

(defn clear-vertex
  "Description copied from interface: GraphVertex"
  ([^SameDiffGraphVertex this]
    (-> this (.clearVertex))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^SameDiffGraphVertex this]
    (-> this (.toString))))

(defn get-layer
  "Description copied from interface: GraphVertex

  returns: `org.deeplearning4j.nn.api.Layer`"
  (^org.deeplearning4j.nn.api.Layer [^SameDiffGraphVertex this]
    (-> this (.getLayer))))

(defn set-backprop-gradients-view-array
  "Description copied from interface: GraphVertex

  backprop-gradients-view-array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^SameDiffGraphVertex this ^org.nd4j.linalg.api.ndarray.INDArray backprop-gradients-view-array]
    (-> this (.setBackpropGradientsViewArray backprop-gradients-view-array))))

(defn do-forward
  "Description copied from interface: GraphVertex

  training - if true: forward pass at training time. If false: forward pass at test time - `boolean`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: The output (for example, activations) of the GraphVertex - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^SameDiffGraphVertex this ^Boolean training ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.doForward training workspace-mgr))))

(defn get-config
  "returns: Training configuration - `org.deeplearning4j.nn.api.TrainingConfig`"
  (^org.deeplearning4j.nn.api.TrainingConfig [^SameDiffGraphVertex this]
    (-> this (.getConfig))))

