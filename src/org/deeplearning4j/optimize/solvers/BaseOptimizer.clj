(ns org.deeplearning4j.optimize.solvers.BaseOptimizer
  "Base optimizer"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.optimize.solvers BaseOptimizer]))

(defn ->base-optimizer
  "Constructor.

  conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`
  step-function - `org.deeplearning4j.optimize.api.StepFunction`
  training-listeners - `java.util.Collection`
  model - `org.deeplearning4j.nn.api.Model`"
  (^BaseOptimizer [^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^org.deeplearning4j.optimize.api.StepFunction step-function ^java.util.Collection training-listeners ^org.deeplearning4j.nn.api.Model model]
    (new BaseOptimizer conf step-function training-listeners model)))

(def *-gradient-key
  "Static Constant.

  type: java.lang.String"
  BaseOptimizer/GRADIENT_KEY)

(def *-score-key
  "Static Constant.

  type: java.lang.String"
  BaseOptimizer/SCORE_KEY)

(def *-params-key
  "Static Constant.

  type: java.lang.String"
  BaseOptimizer/PARAMS_KEY)

(def *-search-dir
  "Static Constant.

  type: java.lang.String"
  BaseOptimizer/SEARCH_DIR)

(defn *get-default-step-function-for-optimizer
  "optimizer-class - `java.lang.Class`

  returns: `org.deeplearning4j.optimize.api.StepFunction`"
  (^org.deeplearning4j.optimize.api.StepFunction [^java.lang.Class optimizer-class]
    (BaseOptimizer/getDefaultStepFunctionForOptimizer optimizer-class)))

(defn *get-iteration-count
  "model - `org.deeplearning4j.nn.api.Model`

  returns: `int`"
  (^Integer [^org.deeplearning4j.nn.api.Model model]
    (BaseOptimizer/getIterationCount model)))

(defn *increment-iteration-count
  "model - `org.deeplearning4j.nn.api.Model`
  increment-by - `int`"
  ([^org.deeplearning4j.nn.api.Model model ^Integer increment-by]
    (BaseOptimizer/incrementIterationCount model increment-by)))

(defn *get-epoch-count
  "model - `org.deeplearning4j.nn.api.Model`

  returns: `int`"
  (^Integer [^org.deeplearning4j.nn.api.Model model]
    (BaseOptimizer/getEpochCount model)))

(defn *apply-constraints
  "model - `org.deeplearning4j.nn.api.Model`"
  ([^org.deeplearning4j.nn.api.Model model]
    (BaseOptimizer/applyConstraints model)))

(defn score
  "Description copied from interface: ConvexOptimizer

  returns: the score for this optimizer so far - `double`"
  (^Double [^BaseOptimizer this]
    (-> this (.score))))

(defn set-updater-computation-graph
  "updater - `org.deeplearning4j.nn.updater.graph.ComputationGraphUpdater`"
  ([^BaseOptimizer this ^org.deeplearning4j.nn.updater.graph.ComputationGraphUpdater updater]
    (-> this (.setUpdaterComputationGraph updater))))

(defn post-step
  "Post step to update searchDirection with new gradient and parameter information

  gradient - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BaseOptimizer this ^org.nd4j.linalg.api.ndarray.INDArray gradient]
    (-> this (.postStep gradient))))

(defn get-conf
  "returns: `org.deeplearning4j.nn.conf.NeuralNetConfiguration`"
  (^org.deeplearning4j.nn.conf.NeuralNetConfiguration [^BaseOptimizer this]
    (-> this (.getConf))))

(defn batch-size
  "Description copied from interface: ConvexOptimizer

  returns: `int`"
  (^Integer [^BaseOptimizer this]
    (-> this (.batchSize))))

(defn get-gradients-accumulator
  "Description copied from interface: ConvexOptimizer

  returns: `org.deeplearning4j.optimize.solvers.accumulation.GradientsAccumulator`"
  (^org.deeplearning4j.optimize.solvers.accumulation.GradientsAccumulator [^BaseOptimizer this]
    (-> this (.getGradientsAccumulator))))

(defn update-gradient-according-to-params
  "Description copied from interface: ConvexOptimizer

  gradient - the gradient to modify - `org.deeplearning4j.nn.gradient.Gradient`
  model - the model with the parameters to update - `org.deeplearning4j.nn.api.Model`
  batch-size - batchSize for update - `int`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`"
  ([^BaseOptimizer this ^org.deeplearning4j.nn.gradient.Gradient gradient ^org.deeplearning4j.nn.api.Model model ^Integer batch-size ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.updateGradientAccordingToParams gradient model batch-size workspace-mgr))))

(defn get-computation-graph-updater
  "returns: `org.deeplearning4j.nn.updater.graph.ComputationGraphUpdater`"
  (^org.deeplearning4j.nn.updater.graph.ComputationGraphUpdater [^BaseOptimizer this]
    (-> this (.getComputationGraphUpdater))))

(defn optimize
  "Optimize call. This runs the optimizer.

  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: whether it converged or not - `boolean`"
  (^Boolean [^BaseOptimizer this ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.optimize workspace-mgr))))

(defn get-updater
  "returns: `org.deeplearning4j.nn.api.Updater`"
  (^org.deeplearning4j.nn.api.Updater [^BaseOptimizer this]
    (-> this (.getUpdater))))

(defn set-updater
  "updater - `org.deeplearning4j.nn.api.Updater`"
  ([^BaseOptimizer this ^org.deeplearning4j.nn.api.Updater updater]
    (-> this (.setUpdater updater))))

(defn set-listeners
  "listeners - `java.util.Collection`"
  ([^BaseOptimizer this ^java.util.Collection listeners]
    (-> this (.setListeners listeners))))

(defn setup-search-state
  "Setup the initial search state

  pair - `org.nd4j.linalg.primitives.Pair`"
  ([^BaseOptimizer this ^org.nd4j.linalg.primitives.Pair pair]
    (-> this (.setupSearchState pair))))

(defn pre-process-line
  "Pre preProcess to setup initial searchDirection approximation"
  ([^BaseOptimizer this]
    (-> this (.preProcessLine))))

(defn set-batch-size
  "Description copied from interface: ConvexOptimizer

  batch-size - `int`"
  ([^BaseOptimizer this ^Integer batch-size]
    (-> this (.setBatchSize batch-size))))

(defn set-gradients-accumulator
  "Description copied from interface: ConvexOptimizer

  accumulator - `org.deeplearning4j.optimize.solvers.accumulation.GradientsAccumulator`"
  ([^BaseOptimizer this ^org.deeplearning4j.optimize.solvers.accumulation.GradientsAccumulator accumulator]
    (-> this (.setGradientsAccumulator accumulator))))

(defn gradient-and-score
  "Description copied from interface: ConvexOptimizer

  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: the gradient and score for this optimizer - `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.gradient.Gradient,java.lang.Double>`"
  (^org.nd4j.linalg.primitives.Pair [^BaseOptimizer this ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.gradientAndScore workspace-mgr))))

