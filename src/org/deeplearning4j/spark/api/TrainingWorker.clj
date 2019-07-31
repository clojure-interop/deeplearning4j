(ns org.deeplearning4j.spark.api.TrainingWorker
  "TrainingWorker is a small serializable class that can be passed (in serialized form) to each Spark executor
 for actually conducting training. The results are then passed back to the TrainingMaster for processing.

 TrainingWorker implementations provide a layer of abstraction for network learning tha should allow for more flexibility/
 control over how learning is conducted (including for example asynchronous communication)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.api TrainingWorker]))

(defn get-final-result
  "Get the final result to be returned to the driver

  network - Current state of the network - `org.deeplearning4j.nn.multilayer.MultiLayerNetwork`

  returns: Result to return to the driver - `R`"
  ([^TrainingWorker this ^org.deeplearning4j.nn.multilayer.MultiLayerNetwork network]
    (-> this (.getFinalResult network))))

(defn process-minibatch-with-stats
  "As per processMinibatch(DataSet, MultiLayerNetwork, boolean) but used when SparkTrainingStats are being collecte

  data-set - `org.nd4j.linalg.dataset.api.DataSet`
  network - `org.deeplearning4j.nn.multilayer.MultiLayerNetwork`
  is-last - `boolean`

  returns: `org.nd4j.linalg.primitives.Pair<R,org.deeplearning4j.spark.api.stats.SparkTrainingStats>`"
  (^org.nd4j.linalg.primitives.Pair [^TrainingWorker this ^org.nd4j.linalg.dataset.api.DataSet data-set ^org.deeplearning4j.nn.multilayer.MultiLayerNetwork network ^Boolean is-last]
    (-> this (.processMinibatchWithStats data-set network is-last))))

(defn get-initial-model-graph
  "Get the initial model when training a ComputationGraph/SparkComputationGraph

  returns: Initial model for this worker - `org.deeplearning4j.nn.graph.ComputationGraph`"
  (^org.deeplearning4j.nn.graph.ComputationGraph [^TrainingWorker this]
    (-> this (.getInitialModelGraph))))

(defn process-minibatch
  "Process (fit) a minibatch for a MultiLayerNetwork

  data-set - Data set to train on - `org.nd4j.linalg.dataset.api.DataSet`
  network - Network to train - `org.deeplearning4j.nn.multilayer.MultiLayerNetwork`
  is-last - If true: last data set currently available. If false: more data sets will be processed for this executor - `boolean`

  returns: Null, or a training result if training should be terminated immediately. - `R`"
  ([^TrainingWorker this ^org.nd4j.linalg.dataset.api.DataSet data-set ^org.deeplearning4j.nn.multilayer.MultiLayerNetwork network ^Boolean is-last]
    (-> this (.processMinibatch data-set network is-last))))

(defn remove-hook
  "Remove a training hook from the worker

  training-hook - the training hook to remove - `org.deeplearning4j.spark.api.TrainingHook`"
  ([^TrainingWorker this ^org.deeplearning4j.spark.api.TrainingHook training-hook]
    (-> this (.removeHook training-hook))))

(defn add-hook
  "Add a training hook to be used
  during training of the worker

  training-hook - the training hook to add - `org.deeplearning4j.spark.api.TrainingHook`"
  ([^TrainingWorker this ^org.deeplearning4j.spark.api.TrainingHook training-hook]
    (-> this (.addHook training-hook))))

(defn get-final-result-no-data-with-stats
  "As per getFinalResultNoData() but used when SparkTrainingStats are being collected

  returns: `org.nd4j.linalg.primitives.Pair<R,org.deeplearning4j.spark.api.stats.SparkTrainingStats>`"
  (^org.nd4j.linalg.primitives.Pair [^TrainingWorker this]
    (-> this (.getFinalResultNoDataWithStats))))

(defn get-data-configuration
  "Get the WorkerConfiguration that contains information such as minibatch sizes, etc

  returns: Worker configuration - `org.deeplearning4j.spark.api.WorkerConfiguration`"
  (^org.deeplearning4j.spark.api.WorkerConfiguration [^TrainingWorker this]
    (-> this (.getDataConfiguration))))

(defn get-final-result-with-stats
  "As per getFinalResult(MultiLayerNetwork) but used when SparkTrainingStats are being collected

  network - `org.deeplearning4j.nn.multilayer.MultiLayerNetwork`

  returns: `org.nd4j.linalg.primitives.Pair<R,org.deeplearning4j.spark.api.stats.SparkTrainingStats>`"
  (^org.nd4j.linalg.primitives.Pair [^TrainingWorker this ^org.deeplearning4j.nn.multilayer.MultiLayerNetwork network]
    (-> this (.getFinalResultWithStats network))))

(defn get-initial-model
  "Get the initial model when training a MultiLayerNetwork/SparkDl4jMultiLayer

  returns: Initial model for this worker - `org.deeplearning4j.nn.multilayer.MultiLayerNetwork`"
  (^org.deeplearning4j.nn.multilayer.MultiLayerNetwork [^TrainingWorker this]
    (-> this (.getInitialModel))))

(defn get-final-result-no-data
  "Get the final result to be returned to the driver, if no data was available for this executor

  returns: Result to return to the driver - `R`"
  ([^TrainingWorker this]
    (-> this (.getFinalResultNoData))))

(defn get-instance-id
  "returns: `long`"
  (^Long [^TrainingWorker this]
    (-> this (.getInstanceId))))

