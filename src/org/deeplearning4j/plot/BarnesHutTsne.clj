(ns org.deeplearning4j.plot.BarnesHutTsne
  "Barnes hut algorithm for TSNE, uses a dual tree approximation approach.
 Work based on:
 http://lvdmaaten.github.io/tsne/
 For hight dimensions, it's recommended to reduce the dimension up to 50 using another method (PCA or other)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.plot BarnesHutTsne]))

(defn ->barnes-hut-tsne
  "Constructor.

  num-dimensions - `int`
  simiarlity-function - `java.lang.String`
  theta - `double`
  invert - `boolean`
  max-iter - `int`
  real-min - `double`
  initial-momentum - `double`
  final-momentum - `double`
  momentum - `double`
  switch-momentum-iteration - `int`
  normalize - `boolean`
  stop-lying-iteration - `int`
  tolerance - `double`
  learning-rate - `double`
  use-ada-grad - `boolean`
  perplexity - `double`
  training-listener - `org.deeplearning4j.optimize.api.TrainingListener`
  min-gain - `double`
  vp-tree-workers - `int`
  workspace-mode - `org.deeplearning4j.nn.conf.WorkspaceMode`"
  (^BarnesHutTsne [^Integer num-dimensions ^java.lang.String simiarlity-function ^Double theta ^Boolean invert ^Integer max-iter ^Double real-min ^Double initial-momentum ^Double final-momentum ^Double momentum ^Integer switch-momentum-iteration ^Boolean normalize ^Integer stop-lying-iteration ^Double tolerance ^Double learning-rate ^Boolean use-ada-grad ^Double perplexity ^org.deeplearning4j.optimize.api.TrainingListener training-listener ^Double min-gain ^Integer vp-tree-workers ^org.deeplearning4j.nn.conf.WorkspaceMode workspace-mode]
    (new BarnesHutTsne num-dimensions simiarlity-function theta invert max-iter real-min initial-momentum final-momentum momentum switch-momentum-iteration normalize stop-lying-iteration tolerance learning-rate use-ada-grad perplexity training-listener min-gain vp-tree-workers workspace-mode))
  (^BarnesHutTsne [^Integer num-dimensions ^java.lang.String simiarlity-function ^Double theta ^Boolean invert ^Integer max-iter ^Double real-min ^Double initial-momentum ^Double final-momentum ^Double momentum ^Integer switch-momentum-iteration ^Boolean normalize ^Integer stop-lying-iteration ^Double tolerance ^Double learning-rate ^Boolean use-ada-grad ^Double perplexity ^org.deeplearning4j.optimize.api.TrainingListener training-listener ^Double min-gain ^Integer vp-tree-workers]
    (new BarnesHutTsne num-dimensions simiarlity-function theta invert max-iter real-min initial-momentum final-momentum momentum switch-momentum-iteration normalize stop-lying-iteration tolerance learning-rate use-ada-grad perplexity training-listener min-gain vp-tree-workers)))

(def *-workspace-cache
  "Static Constant.

  type: java.lang.String"
  BarnesHutTsne/workspaceCache)

(def *-workspace-external
  "Static Constant.

  type: java.lang.String"
  BarnesHutTsne/workspaceExternal)

(def *-y-grad
  "Static Constant.

  type: java.lang.String"
  BarnesHutTsne/Y_GRAD)

(def *-workspace-configuration-cache
  "Static Constant.

  type: org.nd4j.linalg.api.memory.conf.WorkspaceConfiguration"
  BarnesHutTsne/workspaceConfigurationCache)

(defn score
  "Description copied from interface: Model

  returns: the score for the model - `double`"
  (^Double [^BarnesHutTsne this]
    (-> this (.score))))

(defn set-data
  "data - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BarnesHutTsne this ^org.nd4j.linalg.api.ndarray.INDArray data]
    (-> this (.setData data))))

(defn compute-gaussian-perplexity
  "Convert data to probability
  co-occurrences (aka calculating the kernel)

  d - the data to convert - `org.nd4j.linalg.api.ndarray.INDArray`
  u - the perplexity of the model - `double`

  returns: the probabilities of co-occurrence - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BarnesHutTsne this ^org.nd4j.linalg.api.ndarray.INDArray d ^Double u]
    (-> this (.computeGaussianPerplexity d u))))

(defn param-table
  "Description copied from interface: Model

  backprap-params-only - If true, return backprop params only. If false: return all params (equivalent toparamsTable()) - `boolean`

  returns: `java.util.Map<java.lang.String,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^java.util.Map [^BarnesHutTsne this ^Boolean backprap-params-only]
    (-> this (.paramTable backprap-params-only)))
  (^java.util.Map [^BarnesHutTsne this]
    (-> this (.paramTable))))

(defn fit
  "Description copied from interface: Model

  data - the data to fit the model to - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`"
  ([^BarnesHutTsne this ^org.nd4j.linalg.api.ndarray.INDArray data ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.fit data workspace-mgr)))
  ([^BarnesHutTsne this]
    (-> this (.fit)))
  ([^BarnesHutTsne this ^org.nd4j.linalg.api.ndarray.INDArray data]
    (-> this (.fit data))))

(defn set-param
  "Description copied from interface: Model

  key - the key to se t - `java.lang.String`
  val - the new ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BarnesHutTsne this ^java.lang.String key ^org.nd4j.linalg.api.ndarray.INDArray val]
    (-> this (.setParam key val))))

(defn get-data
  "Return the matrix reduce to the NDim.

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BarnesHutTsne this]
    (-> this (.getData))))

(defn gradient
  "Description copied from interface: Model

  returns: the gradient for this model, as calculated before - `org.deeplearning4j.nn.gradient.Gradient`"
  (^org.deeplearning4j.nn.gradient.Gradient [^BarnesHutTsne this]
    (-> this (.gradient))))

(defn set-conf
  "Description copied from interface: Model

  conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`"
  ([^BarnesHutTsne this ^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf]
    (-> this (.setConf conf))))

(defn get-num-dimensions
  "returns: `int`"
  (^Integer [^BarnesHutTsne this]
    (-> this (.getNumDimensions))))

(defn params
  "Description copied from interface: Model

  returns: the parameters of the model - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BarnesHutTsne this]
    (-> this (.params))))

(defn compute-gradient-and-score
  "Description copied from interface: Model

  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`"
  ([^BarnesHutTsne this ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.computeGradientAndScore workspace-mgr))))

(defn save-as-file
  "Save the model as a file with a csv format, adding the label as the last column.

  labels - `java.util.List`
  path - the path to write - `java.lang.String`

  throws: java.io.IOException"
  ([^BarnesHutTsne this ^java.util.List labels ^java.lang.String path]
    (-> this (.saveAsFile labels path))))

(defn add-listeners
  "Description copied from interface: Model

  listener - `org.deeplearning4j.optimize.api.TrainingListener`"
  ([^BarnesHutTsne this ^org.deeplearning4j.optimize.api.TrainingListener listener]
    (-> this (.addListeners listener))))

(defn get-param
  "Description copied from interface: Model

  param - the key of the parameter - `java.lang.String`

  returns: the parameter vector/matrix with that particular key - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BarnesHutTsne this ^java.lang.String param]
    (-> this (.getParam param))))

(defn set-invert
  "invert - `boolean`"
  ([^BarnesHutTsne this ^Boolean invert]
    (-> this (.setInvert invert))))

(defn get-gradients-view-array
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BarnesHutTsne this]
    (-> this (.getGradientsViewArray))))

(defn batch-size
  "Description copied from interface: Model

  returns: the current inputs batch size - `int`"
  (^Integer [^BarnesHutTsne this]
    (-> this (.batchSize))))

(defn get-perplexity
  "returns: `double`"
  (^Double [^BarnesHutTsne this]
    (-> this (.getPerplexity))))

(defn get-simiarlity-function
  "returns: `java.lang.String`"
  (^java.lang.String [^BarnesHutTsne this]
    (-> this (.getSimiarlityFunction))))

(defn set-params-view-array
  "Description copied from interface: Model

  params - a 1 x nParams row vector that is a view of the larger (MLN/CG) parameters array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BarnesHutTsne this ^org.nd4j.linalg.api.ndarray.INDArray params]
    (-> this (.setParamsViewArray params))))

(defn update
  "Description copied from interface: Model

  gradient - the gradient to apply - `org.nd4j.linalg.api.ndarray.INDArray`
  param-type - `java.lang.String`"
  ([^BarnesHutTsne this ^org.nd4j.linalg.api.ndarray.INDArray gradient ^java.lang.String param-type]
    (-> this (.update gradient param-type)))
  ([^BarnesHutTsne this ^org.deeplearning4j.nn.gradient.Gradient gradient]
    (-> this (.update gradient))))

(defn get-theta
  "returns: `double`"
  (^Double [^BarnesHutTsne this]
    (-> this (.getTheta))))

(defn set-param-table
  "Description copied from interface: Model

  param-table - `java.util.Map`"
  ([^BarnesHutTsne this ^java.util.Map param-table]
    (-> this (.setParamTable param-table))))

(defn compute-gaussian-kernel
  "Computes a gaussian kernel
  given a vector of squared distance distances

  distances - `org.nd4j.linalg.api.ndarray.INDArray`
  beta - `double`
  k - `int`

  returns: `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,java.lang.Double>`"
  (^org.nd4j.linalg.primitives.Pair [^BarnesHutTsne this ^org.nd4j.linalg.api.ndarray.INDArray distances ^Double beta ^Integer k]
    (-> this (.computeGaussianKernel distances beta k))))

(defn set-params
  "Description copied from interface: Model

  params - the parameters for the model - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BarnesHutTsne this ^org.nd4j.linalg.api.ndarray.INDArray params]
    (-> this (.setParams params))))

(defn set-listeners
  "Set the trainingListeners for the ComputationGraph (and all layers in the network)

  listeners - `java.util.Collection`"
  ([^BarnesHutTsne this ^java.util.Collection listeners]
    (-> this (.setListeners listeners))))

(defn conf
  "Description copied from interface: Model

  returns: the configuration for the neural network - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`"
  (^org.deeplearning4j.nn.conf.NeuralNetConfiguration [^BarnesHutTsne this]
    (-> this (.conf))))

(defn set-backprop-gradients-view-array
  "Description copied from interface: Model

  gradients - a 1 x nParams row vector that is a view of the larger (MLN/CG) gradients array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BarnesHutTsne this ^org.nd4j.linalg.api.ndarray.INDArray gradients]
    (-> this (.setBackpropGradientsViewArray gradients))))

(defn num-params
  "Description copied from interface: Model

  backwards - `boolean`

  returns: the number of parameters for the model - `int`"
  (^Integer [^BarnesHutTsne this ^Boolean backwards]
    (-> this (.numParams backwards)))
  (^Integer [^BarnesHutTsne this]
    (-> this (.numParams))))

(defn input
  "Description copied from interface: Model

  returns: the input/feature matrix for the model - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BarnesHutTsne this]
    (-> this (.input))))

(defn init
  "Init the model"
  ([^BarnesHutTsne this]
    (-> this (.init))))

(defn symmetrized
  "Symmetrize the value matrix

  row-p - `org.nd4j.linalg.api.ndarray.INDArray`
  col-p - `org.nd4j.linalg.api.ndarray.INDArray`
  val-p - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BarnesHutTsne this ^org.nd4j.linalg.api.ndarray.INDArray row-p ^org.nd4j.linalg.api.ndarray.INDArray col-p ^org.nd4j.linalg.api.ndarray.INDArray val-p]
    (-> this (.symmetrized row-p col-p val-p))))

(defn plot
  "Deprecated. use fit(INDArray) and saveAsFile(List, String) instead.

  matrix - the matrix to plot - `org.nd4j.linalg.api.ndarray.INDArray`
  n-dims - the number - `int`
  labels - `java.util.List`
  path - the path to write - `java.lang.String`

  throws: java.io.IOException"
  ([^BarnesHutTsne this ^org.nd4j.linalg.api.ndarray.INDArray matrix ^Integer n-dims ^java.util.List labels ^java.lang.String path]
    (-> this (.plot matrix n-dims labels path))))

(defn clear
  "Description copied from interface: Model"
  ([^BarnesHutTsne this]
    (-> this (.clear))))

(defn set-simiarlity-function
  "simiarlity-function - `java.lang.String`"
  ([^BarnesHutTsne this ^java.lang.String simiarlity-function]
    (-> this (.setSimiarlityFunction simiarlity-function))))

(defn get-optimizer
  "Description copied from interface: Model

  returns: this models optimizer - `org.deeplearning4j.optimize.api.ConvexOptimizer`"
  (^org.deeplearning4j.optimize.api.ConvexOptimizer [^BarnesHutTsne this]
    (-> this (.getOptimizer))))

(defn set-num-dimensions
  "num-dimensions - `int`"
  ([^BarnesHutTsne this ^Integer num-dimensions]
    (-> this (.setNumDimensions num-dimensions))))

(defn apply-constraints
  "Description copied from interface: Model

  iteration - `int`
  epoch - `int`"
  ([^BarnesHutTsne this ^Integer iteration ^Integer epoch]
    (-> this (.applyConstraints iteration epoch))))

(defn gradient-and-score
  "Description copied from interface: Model

  returns: the gradient and score - `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.gradient.Gradient,java.lang.Double>`"
  (^org.nd4j.linalg.primitives.Pair [^BarnesHutTsne this]
    (-> this (.gradientAndScore))))

(defn invert?
  "returns: `boolean`"
  (^Boolean [^BarnesHutTsne this]
    (-> this (.isInvert))))

(defn step
  "An individual iteration

  p - the probabilities that certain pointsare near each other - `org.nd4j.linalg.api.ndarray.INDArray`
  i - the iteration (primarily for debugging purposes) - `int`"
  ([^BarnesHutTsne this ^org.nd4j.linalg.api.ndarray.INDArray p ^Integer i]
    (-> this (.step p i))))

