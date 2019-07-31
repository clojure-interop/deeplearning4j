(ns org.deeplearning4j.optimize.solvers.BackTrackLineSearch
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.optimize.solvers BackTrackLineSearch]))

(defn ->back-track-line-search
  "Constructor.

  layer - `org.deeplearning4j.nn.api.Model`
  step-function - `org.deeplearning4j.optimize.api.StepFunction`
  optimizer - `org.deeplearning4j.optimize.api.ConvexOptimizer`"
  (^BackTrackLineSearch [^org.deeplearning4j.nn.api.Model layer ^org.deeplearning4j.optimize.api.StepFunction step-function ^org.deeplearning4j.optimize.api.ConvexOptimizer optimizer]
    (new BackTrackLineSearch layer step-function optimizer))
  (^BackTrackLineSearch [^org.deeplearning4j.nn.api.Model optimizable ^org.deeplearning4j.optimize.api.ConvexOptimizer optimizer]
    (new BackTrackLineSearch optimizable optimizer)))

(defn set-step-max
  "step-max - `double`"
  ([^BackTrackLineSearch this ^Double step-max]
    (-> this (.setStepMax step-max))))

(defn get-step-max
  "returns: `double`"
  (^Double [^BackTrackLineSearch this]
    (-> this (.getStepMax))))

(defn set-rel-tolx
  "Sets the tolerance of relative diff in function value.
  Line search converges if abs(delta x / x) < tolx
  for all coordinates.

  tolx - `double`"
  ([^BackTrackLineSearch this ^Double tolx]
    (-> this (.setRelTolx tolx))))

(defn set-abs-tolx
  "Sets the tolerance of absolute diff in function value.
  Line search converges if abs(delta x) < tolx
  for all coordinates.

  tolx - `double`"
  ([^BackTrackLineSearch this ^Double tolx]
    (-> this (.setAbsTolx tolx))))

(defn get-max-iterations
  "returns: `int`"
  (^Integer [^BackTrackLineSearch this]
    (-> this (.getMaxIterations))))

(defn set-max-iterations
  "max-iterations - `int`"
  ([^BackTrackLineSearch this ^Integer max-iterations]
    (-> this (.setMaxIterations max-iterations))))

(defn set-score-for
  "parameters - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: `double`"
  (^Double [^BackTrackLineSearch this ^org.nd4j.linalg.api.ndarray.INDArray parameters ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.setScoreFor parameters workspace-mgr))))

(defn optimize
  "Description copied from interface: LineOptimizer

  parameters - the parameters to optimize - `org.nd4j.linalg.api.ndarray.INDArray`
  gradients - the line/rate of change - `org.nd4j.linalg.api.ndarray.INDArray`
  search-direction - the point for the line search to go in - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: the next step size - `double`

  throws: org.deeplearning4j.exception.InvalidStepException"
  (^Double [^BackTrackLineSearch this ^org.nd4j.linalg.api.ndarray.INDArray parameters ^org.nd4j.linalg.api.ndarray.INDArray gradients ^org.nd4j.linalg.api.ndarray.INDArray search-direction ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.optimize parameters gradients search-direction workspace-mgr))))

