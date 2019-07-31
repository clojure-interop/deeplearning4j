(ns org.deeplearning4j.spark.parameterserver.training.SharedTrainingWorker
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.parameterserver.training SharedTrainingWorker]))

(defn ->shared-training-worker
  "Constructor.

  instance-id - `long`
  broadcast-model - `org.apache.spark.broadcast.Broadcast`
  broadcast-configuration - `org.apache.spark.broadcast.Broadcast`
  listeners - `java.util.List`
  router - `org.deeplearning4j.api.storage.StatsStorageRouter`"
  (^SharedTrainingWorker [^Long instance-id ^org.apache.spark.broadcast.Broadcast broadcast-model ^org.apache.spark.broadcast.Broadcast broadcast-configuration ^java.util.List listeners ^org.deeplearning4j.api.storage.StatsStorageRouter router]
    (new SharedTrainingWorker instance-id broadcast-model broadcast-configuration listeners router)))

(defn get-final-result
  "Description copied from interface: TrainingWorker

  network - Current state of the network - `org.deeplearning4j.nn.multilayer.MultiLayerNetwork`

  returns: Result to return to the driver - `org.deeplearning4j.spark.parameterserver.training.SharedTrainingResult`"
  (^org.deeplearning4j.spark.parameterserver.training.SharedTrainingResult [^SharedTrainingWorker this ^org.deeplearning4j.nn.multilayer.MultiLayerNetwork network]
    (-> this (.getFinalResult network))))

(defn process-minibatch-with-stats
  "Description copied from interface: TrainingWorker

  data-set - `org.nd4j.linalg.dataset.api.DataSet`
  network - `org.deeplearning4j.nn.multilayer.MultiLayerNetwork`
  is-last - `boolean`

  returns: `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.spark.parameterserver.training.SharedTrainingResult,org.deeplearning4j.spark.api.stats.SparkTrainingStats>`"
  (^org.nd4j.linalg.primitives.Pair [^SharedTrainingWorker this ^org.nd4j.linalg.dataset.api.DataSet data-set ^org.deeplearning4j.nn.multilayer.MultiLayerNetwork network ^Boolean is-last]
    (-> this (.processMinibatchWithStats data-set network is-last))))

(defn get-initial-model-graph
  "Description copied from interface: TrainingWorker

  returns: Initial model for this worker - `org.deeplearning4j.nn.graph.ComputationGraph`"
  (^org.deeplearning4j.nn.graph.ComputationGraph [^SharedTrainingWorker this]
    (-> this (.getInitialModelGraph))))

(defn process-minibatch
  "Description copied from interface: TrainingWorker

  data-set - Data set to train on - `org.nd4j.linalg.dataset.api.DataSet`
  network - Network to train - `org.deeplearning4j.nn.multilayer.MultiLayerNetwork`
  is-last - If true: last data set currently available. If false: more data sets will be processed for this executor - `boolean`

  returns: Null, or a training result if training should be terminated immediately. - `org.deeplearning4j.spark.parameterserver.training.SharedTrainingResult`"
  (^org.deeplearning4j.spark.parameterserver.training.SharedTrainingResult [^SharedTrainingWorker this ^org.nd4j.linalg.dataset.api.DataSet data-set ^org.deeplearning4j.nn.multilayer.MultiLayerNetwork network ^Boolean is-last]
    (-> this (.processMinibatch data-set network is-last))))

(defn remove-hook
  "Description copied from interface: TrainingWorker

  training-hook - the training hook to remove - `org.deeplearning4j.spark.api.TrainingHook`"
  ([^SharedTrainingWorker this ^org.deeplearning4j.spark.api.TrainingHook training-hook]
    (-> this (.removeHook training-hook))))

(defn add-hook
  "Description copied from interface: TrainingWorker

  training-hook - the training hook to add - `org.deeplearning4j.spark.api.TrainingHook`"
  ([^SharedTrainingWorker this ^org.deeplearning4j.spark.api.TrainingHook training-hook]
    (-> this (.addHook training-hook))))

(defn get-final-result-no-data-with-stats
  "Description copied from interface: TrainingWorker

  returns: `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.spark.parameterserver.training.SharedTrainingResult,org.deeplearning4j.spark.api.stats.SparkTrainingStats>`"
  (^org.nd4j.linalg.primitives.Pair [^SharedTrainingWorker this]
    (-> this (.getFinalResultNoDataWithStats))))

(defn get-data-configuration
  "Description copied from interface: TrainingWorker

  returns: Worker configuration - `org.deeplearning4j.spark.api.WorkerConfiguration`"
  (^org.deeplearning4j.spark.api.WorkerConfiguration [^SharedTrainingWorker this]
    (-> this (.getDataConfiguration))))

(defn get-final-result-with-stats
  "Description copied from interface: TrainingWorker

  network - `org.deeplearning4j.nn.multilayer.MultiLayerNetwork`

  returns: `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.spark.parameterserver.training.SharedTrainingResult,org.deeplearning4j.spark.api.stats.SparkTrainingStats>`"
  (^org.nd4j.linalg.primitives.Pair [^SharedTrainingWorker this ^org.deeplearning4j.nn.multilayer.MultiLayerNetwork network]
    (-> this (.getFinalResultWithStats network))))

(defn get-initial-model
  "Description copied from interface: TrainingWorker

  returns: Initial model for this worker - `org.deeplearning4j.nn.multilayer.MultiLayerNetwork`"
  (^org.deeplearning4j.nn.multilayer.MultiLayerNetwork [^SharedTrainingWorker this]
    (-> this (.getInitialModel))))

(defn get-final-result-no-data
  "Description copied from interface: TrainingWorker

  returns: Result to return to the driver - `org.deeplearning4j.spark.parameterserver.training.SharedTrainingResult`"
  (^org.deeplearning4j.spark.parameterserver.training.SharedTrainingResult [^SharedTrainingWorker this]
    (-> this (.getFinalResultNoData))))

