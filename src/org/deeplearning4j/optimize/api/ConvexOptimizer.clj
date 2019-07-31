(ns org.deeplearning4j.optimize.api.ConvexOptimizer
  "Convex optimizer."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.optimize.api ConvexOptimizer]))

(defn score
  "The score for the optimizer so far

  returns: the score for this optimizer so far - `double`"
  (^Double [^ConvexOptimizer this]
    (-> this (.score))))

(defn set-updater-computation-graph
  "updater - `org.deeplearning4j.nn.updater.graph.ComputationGraphUpdater`"
  ([^ConvexOptimizer this ^org.deeplearning4j.nn.updater.graph.ComputationGraphUpdater updater]
    (-> this (.setUpdaterComputationGraph updater))))

(defn post-step
  "After the step has been made, do an action

  line - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^ConvexOptimizer this ^org.nd4j.linalg.api.ndarray.INDArray line]
    (-> this (.postStep line))))

(defn get-conf
  "returns: `org.deeplearning4j.nn.conf.NeuralNetConfiguration`"
  (^org.deeplearning4j.nn.conf.NeuralNetConfiguration [^ConvexOptimizer this]
    (-> this (.getConf))))

(defn batch-size
  "The batch size for the optimizer

  returns: `int`"
  (^Integer [^ConvexOptimizer this]
    (-> this (.batchSize))))

(defn get-gradients-accumulator
  "This method returns GradientsAccumulator instance used in this optimizer.
  This method can return null.

  returns: `org.deeplearning4j.optimize.solvers.accumulation.GradientsAccumulator`"
  (^org.deeplearning4j.optimize.solvers.accumulation.GradientsAccumulator [^ConvexOptimizer this]
    (-> this (.getGradientsAccumulator))))

(defn update-gradient-according-to-params
  "Update the gradient according to the configuration such as adagrad, momentum, and sparsity

  gradient - the gradient to modify - `org.deeplearning4j.nn.gradient.Gradient`
  model - the model with the parameters to update - `org.deeplearning4j.nn.api.Model`
  batch-size - batchSize for update - `int`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`"
  ([^ConvexOptimizer this ^org.deeplearning4j.nn.gradient.Gradient gradient ^org.deeplearning4j.nn.api.Model model ^Integer batch-size ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.updateGradientAccordingToParams gradient model batch-size workspace-mgr))))

(defn get-computation-graph-updater
  "returns: `org.deeplearning4j.nn.updater.graph.ComputationGraphUpdater`"
  (^org.deeplearning4j.nn.updater.graph.ComputationGraphUpdater [^ConvexOptimizer this]
    (-> this (.getComputationGraphUpdater))))

(defn optimize
  "Calls optimize

  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: whether the convex optimizer
  converted or not - `boolean`"
  (^Boolean [^ConvexOptimizer this ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.optimize workspace-mgr))))

(defn get-updater
  "returns: `org.deeplearning4j.nn.api.Updater`"
  (^org.deeplearning4j.nn.api.Updater [^ConvexOptimizer this]
    (-> this (.getUpdater))))

(defn set-updater
  "updater - `org.deeplearning4j.nn.api.Updater`"
  ([^ConvexOptimizer this ^org.deeplearning4j.nn.api.Updater updater]
    (-> this (.setUpdater updater))))

(defn set-listeners
  "listeners - `java.util.Collection`"
  ([^ConvexOptimizer this ^java.util.Collection listeners]
    (-> this (.setListeners listeners))))

(defn setup-search-state
  "Based on the gradient and score
  setup a search state

  pair - the gradient and score - `org.nd4j.linalg.primitives.Pair`"
  ([^ConvexOptimizer this ^org.nd4j.linalg.primitives.Pair pair]
    (-> this (.setupSearchState pair))))

(defn pre-process-line
  "Pre preProcess a line before an iteration"
  ([^ConvexOptimizer this]
    (-> this (.preProcessLine))))

(defn set-batch-size
  "Set the batch size for the optimizer

  batch-size - `int`"
  ([^ConvexOptimizer this ^Integer batch-size]
    (-> this (.setBatchSize batch-size))))

(defn set-gradients-accumulator
  "This method specifies GradientsAccumulator instance to be used for updates sharing across multiple models

  accumulator - `org.deeplearning4j.optimize.solvers.accumulation.GradientsAccumulator`"
  ([^ConvexOptimizer this ^org.deeplearning4j.optimize.solvers.accumulation.GradientsAccumulator accumulator]
    (-> this (.setGradientsAccumulator accumulator))))

(defn gradient-and-score
  "The gradient and score for this optimizer

  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: the gradient and score for this optimizer - `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.gradient.Gradient,java.lang.Double>`"
  (^org.nd4j.linalg.primitives.Pair [^ConvexOptimizer this ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.gradientAndScore workspace-mgr))))

(defn get-step-function
  "This method returns StepFunction defined within this Optimizer instance

  returns: `org.deeplearning4j.optimize.api.StepFunction`"
  (^org.deeplearning4j.optimize.api.StepFunction [^ConvexOptimizer this]
    (-> this (.getStepFunction))))

