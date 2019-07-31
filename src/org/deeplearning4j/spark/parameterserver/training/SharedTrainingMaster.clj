(ns org.deeplearning4j.spark.parameterserver.training.SharedTrainingMaster
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.parameterserver.training SharedTrainingMaster]))

(defn ->shared-training-master
  "Constructor.

  void-configuration - `org.nd4j.parameterserver.distributed.conf.VoidConfiguration`
  num-workers - `java.lang.Integer`
  rdd-training-approach - `org.deeplearning4j.spark.api.RDDTrainingApproach`
  storage-level - `org.apache.spark.storage.StorageLevel`
  collect-training-stats - `boolean`
  repartition-strategy - `org.deeplearning4j.spark.api.RepartitionStrategy`
  repartition - `org.deeplearning4j.spark.api.Repartition`
  threshold - `double`
  min-threshold - `double`
  threshold-step - `double`
  step-trigger - `double`
  step-delay - `int`
  shake-frequency - `int`
  batch-size-per-worker - `int`
  debug-longer-iterations - `long`
  num-workers-per-node - `int`
  worker-prefetch-batches - `int`
  repartitioner - `org.deeplearning4j.spark.api.Repartitioner`"
  (^SharedTrainingMaster [^org.nd4j.parameterserver.distributed.conf.VoidConfiguration void-configuration ^java.lang.Integer num-workers ^org.deeplearning4j.spark.api.RDDTrainingApproach rdd-training-approach ^org.apache.spark.storage.StorageLevel storage-level ^Boolean collect-training-stats ^org.deeplearning4j.spark.api.RepartitionStrategy repartition-strategy ^org.deeplearning4j.spark.api.Repartition repartition ^Double threshold ^Double min-threshold ^Double threshold-step ^Double step-trigger ^Integer step-delay ^Integer shake-frequency ^Integer batch-size-per-worker ^Long debug-longer-iterations ^Integer num-workers-per-node ^Integer worker-prefetch-batches ^org.deeplearning4j.spark.api.Repartitioner repartitioner]
    (new SharedTrainingMaster void-configuration num-workers rdd-training-approach storage-level collect-training-stats repartition-strategy repartition threshold min-threshold threshold-step step-trigger step-delay shake-frequency batch-size-per-worker debug-longer-iterations num-workers-per-node worker-prefetch-batches repartitioner)))

(defn *from-json
  "Create a SharedTrainingMaster instance by deserializing a JSON string that has been serialized with
  toJson()

  json-str - SharedTrainingMaster configuration serialized as JSON - `java.lang.String`

  returns: `org.deeplearning4j.spark.parameterserver.training.SharedTrainingMaster`"
  (^org.deeplearning4j.spark.parameterserver.training.SharedTrainingMaster [^java.lang.String json-str]
    (SharedTrainingMaster/fromJson json-str)))

(defn *from-yaml
  "Create a SharedTrainingMaster instance by deserializing a YAML string that has been serialized with
  toYaml()

  yaml-str - SharedTrainingMaster configuration serialized as YAML - `java.lang.String`

  returns: `org.deeplearning4j.spark.parameterserver.training.SharedTrainingMaster`"
  (^org.deeplearning4j.spark.parameterserver.training.SharedTrainingMaster [^java.lang.String yaml-str]
    (SharedTrainingMaster/fromYaml yaml-str)))

(defn get-worker-instance
  "Description copied from interface: TrainingMaster

  network - Current SparkDl4jMultiLayer - `org.deeplearning4j.spark.impl.multilayer.SparkDl4jMultiLayer`

  returns: Worker instance - `org.deeplearning4j.spark.parameterserver.training.SharedTrainingWorker`"
  (^org.deeplearning4j.spark.parameterserver.training.SharedTrainingWorker [^SharedTrainingMaster this ^org.deeplearning4j.spark.impl.multilayer.SparkDl4jMultiLayer network]
    (-> this (.getWorkerInstance network))))

(defn get-training-stats
  "Description copied from interface: TrainingMaster

  returns: Training statistics - `org.deeplearning4j.spark.api.stats.SparkTrainingStats`"
  (^org.deeplearning4j.spark.api.stats.SparkTrainingStats [^SharedTrainingMaster this]
    (-> this (.getTrainingStats))))

(defn execute-training
  "Description copied from interface: TrainingMaster

  network - Current network state - `org.deeplearning4j.spark.impl.multilayer.SparkDl4jMultiLayer`
  training-data - Data to train on - `org.apache.spark.api.java.JavaRDD`"
  ([^SharedTrainingMaster this ^org.deeplearning4j.spark.impl.multilayer.SparkDl4jMultiLayer network ^org.apache.spark.api.java.JavaRDD training-data]
    (-> this (.executeTraining network training-data))))

(defn remove-hook
  "Description copied from interface: TrainingMaster

  training-hook - the training hook to remove - `org.deeplearning4j.spark.api.TrainingHook`"
  ([^SharedTrainingMaster this ^org.deeplearning4j.spark.api.TrainingHook training-hook]
    (-> this (.removeHook training-hook))))

(defn execute-training-mds
  "Description copied from interface: TrainingMaster

  graph - Current network state - `org.deeplearning4j.spark.impl.graph.SparkComputationGraph`
  training-data - Data to train on - `org.apache.spark.api.java.JavaRDD`"
  ([^SharedTrainingMaster this ^org.deeplearning4j.spark.impl.graph.SparkComputationGraph graph ^org.apache.spark.api.java.JavaRDD training-data]
    (-> this (.executeTrainingMDS graph training-data))))

(defn add-hook
  "Description copied from interface: TrainingMaster

  training-hook - the training hook to add - `org.deeplearning4j.spark.api.TrainingHook`"
  ([^SharedTrainingMaster this ^org.deeplearning4j.spark.api.TrainingHook training-hook]
    (-> this (.addHook training-hook))))

(defn set-listeners
  "Description copied from interface: TrainingMaster

  router - StatsStorageRouter in which to place the results - `org.deeplearning4j.api.storage.StatsStorageRouter`
  listeners - Listeners - `java.util.Collection`"
  ([^SharedTrainingMaster this ^org.deeplearning4j.api.storage.StatsStorageRouter router ^java.util.Collection listeners]
    (-> this (.setListeners router listeners)))
  ([^SharedTrainingMaster this ^java.util.Collection listeners]
    (-> this (.setListeners listeners))))

(defn to-yaml
  "Description copied from interface: TrainingMaster

  returns: `java.lang.String`"
  (^java.lang.String [^SharedTrainingMaster this]
    (-> this (.toYaml))))

(defn to-json
  "Description copied from interface: TrainingMaster

  returns: `java.lang.String`"
  (^java.lang.String [^SharedTrainingMaster this]
    (-> this (.toJson))))

(defn set-collect-training-stats
  "Description copied from interface: TrainingMaster

  collect-training-stats - If true: collecting training statistics will be - `boolean`"
  ([^SharedTrainingMaster this ^Boolean collect-training-stats]
    (-> this (.setCollectTrainingStats collect-training-stats))))

(defn execute-training-paths
  "Description copied from interface: TrainingMaster

  network - Current network state - `org.deeplearning4j.spark.impl.multilayer.SparkDl4jMultiLayer`
  graph - `org.deeplearning4j.spark.impl.graph.SparkComputationGraph`
  training-data-paths - Data to train on - `org.apache.spark.api.java.JavaRDD`
  ds-loader - `org.deeplearning4j.api.loader.DataSetLoader`
  mds-loader - `org.deeplearning4j.api.loader.MultiDataSetLoader`"
  ([^SharedTrainingMaster this ^org.deeplearning4j.spark.impl.multilayer.SparkDl4jMultiLayer network ^org.deeplearning4j.spark.impl.graph.SparkComputationGraph graph ^org.apache.spark.api.java.JavaRDD training-data-paths ^org.deeplearning4j.api.loader.DataSetLoader ds-loader ^org.deeplearning4j.api.loader.MultiDataSetLoader mds-loader]
    (-> this (.executeTrainingPaths network graph training-data-paths ds-loader mds-loader))))

(defn get-is-collect-training-stats?
  "Description copied from interface: TrainingMaster

  returns: `boolean`"
  (^Boolean [^SharedTrainingMaster this]
    (-> this (.getIsCollectTrainingStats))))

