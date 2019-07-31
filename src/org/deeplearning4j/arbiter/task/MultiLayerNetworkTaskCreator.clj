(ns org.deeplearning4j.arbiter.task.MultiLayerNetworkTaskCreator
  "Task creator for MultiLayerNetworks"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.task MultiLayerNetworkTaskCreator]))

(defn ->multi-layer-network-task-creator
  "Constructor.

  model-evaluator - `org.deeplearning4j.arbiter.optimize.api.evaluation.ModelEvaluator`"
  (^MultiLayerNetworkTaskCreator [^org.deeplearning4j.arbiter.optimize.api.evaluation.ModelEvaluator model-evaluator]
    (new MultiLayerNetworkTaskCreator model-evaluator)))

(defn create
  "Description copied from interface: TaskCreator

  candidate - Candidate (model) configuration to be trained - `org.deeplearning4j.arbiter.optimize.api.Candidate`
  data-source - Data source - `java.lang.Class`
  data-source-properties - Properties (may be null) for the data source - `java.util.Properties`
  score-function - Score function to be used to evaluate the model - `org.deeplearning4j.arbiter.optimize.api.score.ScoreFunction`
  status-listeners - Status listeners, that can be used for callbacks (to UI, for example) - `java.util.List`
  runner - `org.deeplearning4j.arbiter.optimize.runner.IOptimizationRunner`

  returns: A callable that returns an OptimizationResult, once optimization is complete - `java.util.concurrent.Callable<org.deeplearning4j.arbiter.optimize.api.OptimizationResult>`"
  (^java.util.concurrent.Callable [^MultiLayerNetworkTaskCreator this ^org.deeplearning4j.arbiter.optimize.api.Candidate candidate ^java.lang.Class data-source ^java.util.Properties data-source-properties ^org.deeplearning4j.arbiter.optimize.api.score.ScoreFunction score-function ^java.util.List status-listeners ^org.deeplearning4j.arbiter.optimize.runner.IOptimizationRunner runner]
    (-> this (.create candidate data-source data-source-properties score-function status-listeners runner)))
  (^java.util.concurrent.Callable [^MultiLayerNetworkTaskCreator this ^org.deeplearning4j.arbiter.optimize.api.Candidate candidate ^org.deeplearning4j.arbiter.optimize.api.data.DataProvider data-provider ^org.deeplearning4j.arbiter.optimize.api.score.ScoreFunction score-function ^java.util.List status-listeners ^org.deeplearning4j.arbiter.optimize.runner.IOptimizationRunner runner]
    (-> this (.create candidate data-provider score-function status-listeners runner))))

