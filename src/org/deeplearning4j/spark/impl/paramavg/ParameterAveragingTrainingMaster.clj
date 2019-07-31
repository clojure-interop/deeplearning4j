(ns org.deeplearning4j.spark.impl.paramavg.ParameterAveragingTrainingMaster
  "ParameterAveragingTrainingMaster: A TrainingMaster
 implementation for training networks on Spark.
 This is standard parameter averaging with a
 configurable averaging period."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.impl.paramavg ParameterAveragingTrainingMaster]))

(defn ->parameter-averaging-training-master
  "Constructor.

  save-updater - `boolean`
  num-workers - `java.lang.Integer`
  rdd-data-set-num-examples - `int`
  batch-size-per-worker - `int`
  averaging-frequency - `int`
  aggregation-depth - `int`
  prefetch-num-batches - `int`
  repartition - `org.deeplearning4j.spark.api.Repartition`
  repartition-strategy - `org.deeplearning4j.spark.api.RepartitionStrategy`
  storage-level - `org.apache.spark.storage.StorageLevel`
  collect-training-stats - `boolean`"
  (^ParameterAveragingTrainingMaster [^Boolean save-updater ^java.lang.Integer num-workers ^Integer rdd-data-set-num-examples ^Integer batch-size-per-worker ^Integer averaging-frequency ^Integer aggregation-depth ^Integer prefetch-num-batches ^org.deeplearning4j.spark.api.Repartition repartition ^org.deeplearning4j.spark.api.RepartitionStrategy repartition-strategy ^org.apache.spark.storage.StorageLevel storage-level ^Boolean collect-training-stats]
    (new ParameterAveragingTrainingMaster save-updater num-workers rdd-data-set-num-examples batch-size-per-worker averaging-frequency aggregation-depth prefetch-num-batches repartition repartition-strategy storage-level collect-training-stats))
  (^ParameterAveragingTrainingMaster [^Boolean save-updater ^java.lang.Integer num-workers ^Integer rdd-data-set-num-examples ^Integer batch-size-per-worker ^Integer averaging-frequency ^Integer aggregation-depth ^Integer prefetch-num-batches ^org.deeplearning4j.spark.api.Repartition repartition ^org.deeplearning4j.spark.api.RepartitionStrategy repartition-strategy ^Boolean collect-training-stats]
    (new ParameterAveragingTrainingMaster save-updater num-workers rdd-data-set-num-examples batch-size-per-worker averaging-frequency aggregation-depth prefetch-num-batches repartition repartition-strategy collect-training-stats))
  (^ParameterAveragingTrainingMaster [^Boolean save-updater ^java.lang.Integer num-workers ^Integer rdd-data-set-num-examples ^Integer batch-size-per-worker ^Integer averaging-frequency ^Integer prefetch-num-batches]
    (new ParameterAveragingTrainingMaster save-updater num-workers rdd-data-set-num-examples batch-size-per-worker averaging-frequency prefetch-num-batches)))

(defn *from-json
  "Create a ParameterAveragingTrainingMaster instance by deserializing a JSON string that has been serialized with
  toJson()

  json-str - ParameterAveragingTrainingMaster configuration serialized as JSON - `java.lang.String`

  returns: `org.deeplearning4j.spark.impl.paramavg.ParameterAveragingTrainingMaster`"
  (^org.deeplearning4j.spark.impl.paramavg.ParameterAveragingTrainingMaster [^java.lang.String json-str]
    (ParameterAveragingTrainingMaster/fromJson json-str)))

(defn *from-yaml
  "Create a ParameterAveragingTrainingMaster instance by deserializing a YAML string that has been serialized with
  toYaml()

  yaml-str - ParameterAveragingTrainingMaster configuration serialized as YAML - `java.lang.String`

  returns: `org.deeplearning4j.spark.impl.paramavg.ParameterAveragingTrainingMaster`"
  (^org.deeplearning4j.spark.impl.paramavg.ParameterAveragingTrainingMaster [^java.lang.String yaml-str]
    (ParameterAveragingTrainingMaster/fromYaml yaml-str)))

(defn get-worker-instance
  "Description copied from interface: TrainingMaster

  network - Current SparkDl4jMultiLayer - `org.deeplearning4j.spark.impl.multilayer.SparkDl4jMultiLayer`

  returns: Worker instance - `org.deeplearning4j.spark.impl.paramavg.ParameterAveragingTrainingWorker`"
  (^org.deeplearning4j.spark.impl.paramavg.ParameterAveragingTrainingWorker [^ParameterAveragingTrainingMaster this ^org.deeplearning4j.spark.impl.multilayer.SparkDl4jMultiLayer network]
    (-> this (.getWorkerInstance network))))

(defn get-training-stats
  "Description copied from interface: TrainingMaster

  returns: Training statistics - `org.deeplearning4j.spark.api.stats.SparkTrainingStats`"
  (^org.deeplearning4j.spark.api.stats.SparkTrainingStats [^ParameterAveragingTrainingMaster this]
    (-> this (.getTrainingStats))))

(defn execute-training
  "Description copied from interface: TrainingMaster

  network - Current network state - `org.deeplearning4j.spark.impl.multilayer.SparkDl4jMultiLayer`
  training-data - Data to train on - `org.apache.spark.api.java.JavaRDD`"
  ([^ParameterAveragingTrainingMaster this ^org.deeplearning4j.spark.impl.multilayer.SparkDl4jMultiLayer network ^org.apache.spark.api.java.JavaRDD training-data]
    (-> this (.executeTraining network training-data))))

(defn remove-hook
  "Remove a training hook from the worker

  training-hook - the training hook to remove - `org.deeplearning4j.spark.api.TrainingHook`"
  ([^ParameterAveragingTrainingMaster this ^org.deeplearning4j.spark.api.TrainingHook training-hook]
    (-> this (.removeHook training-hook))))

(defn execute-training-mds
  "Description copied from interface: TrainingMaster

  graph - Current network state - `org.deeplearning4j.spark.impl.graph.SparkComputationGraph`
  training-data - Data to train on - `org.apache.spark.api.java.JavaRDD`"
  ([^ParameterAveragingTrainingMaster this ^org.deeplearning4j.spark.impl.graph.SparkComputationGraph graph ^org.apache.spark.api.java.JavaRDD training-data]
    (-> this (.executeTrainingMDS graph training-data))))

(defn add-hook
  "Add a hook for the master for pre and post training

  training-hook - the training hook to add - `org.deeplearning4j.spark.api.TrainingHook`"
  ([^ParameterAveragingTrainingMaster this ^org.deeplearning4j.spark.api.TrainingHook training-hook]
    (-> this (.addHook training-hook))))

(defn set-listeners
  "Description copied from interface: TrainingMaster

  stats-storage - StatsStorageRouter in which to place the results - `org.deeplearning4j.api.storage.StatsStorageRouter`
  listeners - Listeners - `java.util.Collection`"
  ([^ParameterAveragingTrainingMaster this ^org.deeplearning4j.api.storage.StatsStorageRouter stats-storage ^java.util.Collection listeners]
    (-> this (.setListeners stats-storage listeners)))
  ([^ParameterAveragingTrainingMaster this ^java.util.Collection listeners]
    (-> this (.setListeners listeners))))

(defn to-yaml
  "Description copied from interface: TrainingMaster

  returns: `java.lang.String`"
  (^java.lang.String [^ParameterAveragingTrainingMaster this]
    (-> this (.toYaml))))

(defn to-json
  "Description copied from interface: TrainingMaster

  returns: `java.lang.String`"
  (^java.lang.String [^ParameterAveragingTrainingMaster this]
    (-> this (.toJson))))

(defn set-collect-training-stats
  "Description copied from interface: TrainingMaster

  collect-training-stats - If true: collecting training statistics will be - `boolean`"
  ([^ParameterAveragingTrainingMaster this ^Boolean collect-training-stats]
    (-> this (.setCollectTrainingStats collect-training-stats))))

(defn execute-training-paths
  "Description copied from interface: TrainingMaster

  network - Current network state - `org.deeplearning4j.spark.impl.multilayer.SparkDl4jMultiLayer`
  graph - `org.deeplearning4j.spark.impl.graph.SparkComputationGraph`
  training-data-paths - Data to train on - `org.apache.spark.api.java.JavaRDD`
  ds-loader - `org.deeplearning4j.api.loader.DataSetLoader`
  mds-loader - `org.deeplearning4j.api.loader.MultiDataSetLoader`"
  ([^ParameterAveragingTrainingMaster this ^org.deeplearning4j.spark.impl.multilayer.SparkDl4jMultiLayer network ^org.deeplearning4j.spark.impl.graph.SparkComputationGraph graph ^org.apache.spark.api.java.JavaRDD training-data-paths ^org.deeplearning4j.api.loader.DataSetLoader ds-loader ^org.deeplearning4j.api.loader.MultiDataSetLoader mds-loader]
    (-> this (.executeTrainingPaths network graph training-data-paths ds-loader mds-loader))))

(defn get-is-collect-training-stats?
  "Description copied from interface: TrainingMaster

  returns: `boolean`"
  (^Boolean [^ParameterAveragingTrainingMaster this]
    (-> this (.getIsCollectTrainingStats))))

