(ns org.deeplearning4j.spark.impl.paramavg.ParameterAveragingTrainingWorker
  "ParameterAveragingTrainingWorker
 implements standard parameter
 averaging every m iterations."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.impl.paramavg ParameterAveragingTrainingWorker]))

(defn ->parameter-averaging-training-worker
  "Constructor.

  broadcast - `org.apache.spark.broadcast.Broadcast`
  save-updater - `boolean`
  configuration - `org.deeplearning4j.spark.api.WorkerConfiguration`
  training-hooks - `java.util.Collection`
  listeners - `java.util.Collection`
  router-provider - `org.deeplearning4j.api.storage.StatsStorageRouterProvider`"
  (^ParameterAveragingTrainingWorker [^org.apache.spark.broadcast.Broadcast broadcast ^Boolean save-updater ^org.deeplearning4j.spark.api.WorkerConfiguration configuration ^java.util.Collection training-hooks ^java.util.Collection listeners ^org.deeplearning4j.api.storage.StatsStorageRouterProvider router-provider]
    (new ParameterAveragingTrainingWorker broadcast save-updater configuration training-hooks listeners router-provider)))

(defn get-final-result
  "Description copied from interface: TrainingWorker

  network - Current state of the network - `org.deeplearning4j.nn.multilayer.MultiLayerNetwork`

  returns: Result to return to the driver - `org.deeplearning4j.spark.impl.paramavg.ParameterAveragingTrainingResult`"
  (^org.deeplearning4j.spark.impl.paramavg.ParameterAveragingTrainingResult [^ParameterAveragingTrainingWorker this ^org.deeplearning4j.nn.multilayer.MultiLayerNetwork network]
    (-> this (.getFinalResult network))))

(defn process-minibatch-with-stats
  "Description copied from interface: TrainingWorker

  data-set - `org.nd4j.linalg.dataset.api.DataSet`
  network - `org.deeplearning4j.nn.multilayer.MultiLayerNetwork`
  is-last - `boolean`

  returns: `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.spark.impl.paramavg.ParameterAveragingTrainingResult,org.deeplearning4j.spark.api.stats.SparkTrainingStats>`"
  (^org.nd4j.linalg.primitives.Pair [^ParameterAveragingTrainingWorker this ^org.nd4j.linalg.dataset.api.DataSet data-set ^org.deeplearning4j.nn.multilayer.MultiLayerNetwork network ^Boolean is-last]
    (-> this (.processMinibatchWithStats data-set network is-last))))

(defn get-initial-model-graph
  "Description copied from interface: TrainingWorker

  returns: Initial model for this worker - `org.deeplearning4j.nn.graph.ComputationGraph`"
  (^org.deeplearning4j.nn.graph.ComputationGraph [^ParameterAveragingTrainingWorker this]
    (-> this (.getInitialModelGraph))))

(defn process-minibatch
  "Description copied from interface: TrainingWorker

  data-set - Data set to train on - `org.nd4j.linalg.dataset.api.DataSet`
  network - Network to train - `org.deeplearning4j.nn.multilayer.MultiLayerNetwork`
  is-last - If true: last data set currently available. If false: more data sets will be processed for this executor - `boolean`

  returns: Null, or a training result if training should be terminated immediately. - `org.deeplearning4j.spark.impl.paramavg.ParameterAveragingTrainingResult`"
  (^org.deeplearning4j.spark.impl.paramavg.ParameterAveragingTrainingResult [^ParameterAveragingTrainingWorker this ^org.nd4j.linalg.dataset.api.DataSet data-set ^org.deeplearning4j.nn.multilayer.MultiLayerNetwork network ^Boolean is-last]
    (-> this (.processMinibatch data-set network is-last))))

(defn remove-hook
  "Remove a training hook from the worker

  training-hook - the training hook to remove - `org.deeplearning4j.spark.api.TrainingHook`"
  ([^ParameterAveragingTrainingWorker this ^org.deeplearning4j.spark.api.TrainingHook training-hook]
    (-> this (.removeHook training-hook))))

(defn add-hook
  "Add a training hook to be used
  during training of the worker

  training-hook - the training hook to add - `org.deeplearning4j.spark.api.TrainingHook`"
  ([^ParameterAveragingTrainingWorker this ^org.deeplearning4j.spark.api.TrainingHook training-hook]
    (-> this (.addHook training-hook))))

(defn get-final-result-no-data-with-stats
  "Description copied from interface: TrainingWorker

  returns: `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.spark.impl.paramavg.ParameterAveragingTrainingResult,org.deeplearning4j.spark.api.stats.SparkTrainingStats>`"
  (^org.nd4j.linalg.primitives.Pair [^ParameterAveragingTrainingWorker this]
    (-> this (.getFinalResultNoDataWithStats))))

(defn get-data-configuration
  "Description copied from interface: TrainingWorker

  returns: Worker configuration - `org.deeplearning4j.spark.api.WorkerConfiguration`"
  (^org.deeplearning4j.spark.api.WorkerConfiguration [^ParameterAveragingTrainingWorker this]
    (-> this (.getDataConfiguration))))

(defn get-final-result-with-stats
  "Description copied from interface: TrainingWorker

  network - `org.deeplearning4j.nn.multilayer.MultiLayerNetwork`

  returns: `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.spark.impl.paramavg.ParameterAveragingTrainingResult,org.deeplearning4j.spark.api.stats.SparkTrainingStats>`"
  (^org.nd4j.linalg.primitives.Pair [^ParameterAveragingTrainingWorker this ^org.deeplearning4j.nn.multilayer.MultiLayerNetwork network]
    (-> this (.getFinalResultWithStats network))))

(defn get-initial-model
  "Description copied from interface: TrainingWorker

  returns: Initial model for this worker - `org.deeplearning4j.nn.multilayer.MultiLayerNetwork`"
  (^org.deeplearning4j.nn.multilayer.MultiLayerNetwork [^ParameterAveragingTrainingWorker this]
    (-> this (.getInitialModel))))

(defn get-final-result-no-data
  "Description copied from interface: TrainingWorker

  returns: Result to return to the driver - `org.deeplearning4j.spark.impl.paramavg.ParameterAveragingTrainingResult`"
  (^org.deeplearning4j.spark.impl.paramavg.ParameterAveragingTrainingResult [^ParameterAveragingTrainingWorker this]
    (-> this (.getFinalResultNoData))))

(defn get-instance-id
  "returns: `long`"
  (^Long [^ParameterAveragingTrainingWorker this]
    (-> this (.getInstanceId))))

