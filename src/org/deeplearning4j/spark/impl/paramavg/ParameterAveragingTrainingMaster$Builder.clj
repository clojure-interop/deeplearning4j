(ns org.deeplearning4j.spark.impl.paramavg.ParameterAveragingTrainingMaster$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.impl.paramavg ParameterAveragingTrainingMaster$Builder]))

(defn ->builder
  "Constructor.

  Create a builder, where the following number of workers (Spark executors * number of threads per executor) are
  being used.
  Note: this should match the configuration of the cluster.

  It is also necessary to specify how many examples are in each DataSet that appears in the RDD<DataSet>
  or JavaRDD<DataSet> used for training.
  Two most common cases here:
  (a) Preprocessed data pipelines will often load binary DataSet objects with N > 1 examples in each; in this case,
  rddDataSetNumExamples should be set to N
  (b) \"In line\" data pipelines (for example, CSV String -> record reader -> DataSet just before training) will
  typically have exactly 1 example in each DataSet object. In this case, rddDataSetNumExamples should be set to 1

  num-workers - Number of Spark execution threads in the cluster. May be null. If null: number of workers willbe obtained from JavaSparkContext.defaultParallelism(), which should provide the number of coresin the cluster. - `java.lang.Integer`
  rdd-data-set-num-examples - Number of examples in each DataSet object in the RDD<DataSet> - `int`"
  (^ParameterAveragingTrainingMaster$Builder [^java.lang.Integer num-workers ^Integer rdd-data-set-num-examples]
    (new ParameterAveragingTrainingMaster$Builder num-workers rdd-data-set-num-examples))
  (^ParameterAveragingTrainingMaster$Builder [^Integer rdd-data-set-num-examples]
    (new ParameterAveragingTrainingMaster$Builder rdd-data-set-num-examples)))

(defn export-directory
  "When rddTrainingApproach(RDDTrainingApproach) is set to RDDTrainingApproach.Export (as it is by default)
  the data is exported to a temporary directory first.

  Default: null. -> use {hadoop.tmp.dir}/dl4j/. In this case, data is exported to {hadoop.tmp.dir}/dl4j/SOME_UNIQUE_ID/
  If you specify a directory, the directory {exportDirectory}/SOME_UNIQUE_ID/ will be used instead.

  export-directory - Base directory to export data - `java.lang.String`

  returns: `org.deeplearning4j.spark.impl.paramavg.ParameterAveragingTrainingMaster$Builder`"
  (^org.deeplearning4j.spark.impl.paramavg.ParameterAveragingTrainingMaster$Builder [^ParameterAveragingTrainingMaster$Builder this ^java.lang.String export-directory]
    (-> this (.exportDirectory export-directory))))

(defn averaging-frequency
  "Frequency with which to average worker parameters.
  Note: Too high or too low can be bad for different reasons.
  - Too low (such as 1) can result in a lot of network traffic
  - Too high (>> 20 or so) can result in accuracy issues or problems with network convergence

  averaging-frequency - Frequency (in number of minibatches of size 'batchSizePerWorker') to average parameters - `int`

  returns: `org.deeplearning4j.spark.impl.paramavg.ParameterAveragingTrainingMaster$Builder`"
  (^org.deeplearning4j.spark.impl.paramavg.ParameterAveragingTrainingMaster$Builder [^ParameterAveragingTrainingMaster$Builder this ^Integer averaging-frequency]
    (-> this (.averagingFrequency averaging-frequency))))

(defn save-updater
  "Set whether the updater (i.e., historical state for momentum, adagrad, etc should be saved).
  NOTE: This can double (or more) the amount of network traffic in each direction, but might
  improve network training performance (and can be more stable for certain updaters such as adagrad).

  This is enabled by default.

  save-updater - If true: retain the updater state (default). If false, don't retain (updaters will bereinitalized in each worker after averaging). - `boolean`

  returns: `org.deeplearning4j.spark.impl.paramavg.ParameterAveragingTrainingMaster$Builder`"
  (^org.deeplearning4j.spark.impl.paramavg.ParameterAveragingTrainingMaster$Builder [^ParameterAveragingTrainingMaster$Builder this ^Boolean save-updater]
    (-> this (.saveUpdater save-updater))))

(defn rng-seed
  "Random number generator seed, used mainly for enforcing repeatable splitting on RDDs
  Default: no seed set (i.e., random seed)

  rng-seed - RNG seed - `long`

  returns: `org.deeplearning4j.spark.impl.paramavg.ParameterAveragingTrainingMaster$Builder`"
  (^org.deeplearning4j.spark.impl.paramavg.ParameterAveragingTrainingMaster$Builder [^ParameterAveragingTrainingMaster$Builder this ^Long rng-seed]
    (-> this (.rngSeed rng-seed))))

(defn rdd-training-approach
  "The approach to use when training on a RDD<DataSet> or RDD<MultiDataSet>.
  Default: RDDTrainingApproach.Export, which exports data to a temporary directory first

  rdd-training-approach - Training approach to use when training from a RDD<DataSet> or RDD<MultiDataSet> - `org.deeplearning4j.spark.api.RDDTrainingApproach`

  returns: `org.deeplearning4j.spark.impl.paramavg.ParameterAveragingTrainingMaster$Builder`"
  (^org.deeplearning4j.spark.impl.paramavg.ParameterAveragingTrainingMaster$Builder [^ParameterAveragingTrainingMaster$Builder this ^org.deeplearning4j.spark.api.RDDTrainingApproach rdd-training-approach]
    (-> this (.rddTrainingApproach rdd-training-approach))))

(defn collect-training-stats
  "Whether training stats collection should be enabled (disabled by default).

  collect-training-stats - `boolean`

  returns: `org.deeplearning4j.spark.impl.paramavg.ParameterAveragingTrainingMaster$Builder`"
  (^org.deeplearning4j.spark.impl.paramavg.ParameterAveragingTrainingMaster$Builder [^ParameterAveragingTrainingMaster$Builder this ^Boolean collect-training-stats]
    (-> this (.collectTrainingStats collect-training-stats))))

(defn repartion-data
  "Set if/when repartitioning should be conducted for the training data.
  Default value: always repartition (if required to guarantee correct number of partitions and correct number
  of examples in each partition).

  repartition - Setting for repartitioning - `org.deeplearning4j.spark.api.Repartition`

  returns: `org.deeplearning4j.spark.impl.paramavg.ParameterAveragingTrainingMaster$Builder`"
  (^org.deeplearning4j.spark.impl.paramavg.ParameterAveragingTrainingMaster$Builder [^ParameterAveragingTrainingMaster$Builder this ^org.deeplearning4j.spark.api.Repartition repartition]
    (-> this (.repartionData repartition))))

(defn worker-prefetch-num-batches
  "Set the number of minibatches to asynchronously prefetch in the worker.

  Default: 0 (no prefetching)

  prefetch-num-batches - Number of minibatches (DataSets of size batchSizePerWorker) to fetch - `int`

  returns: `org.deeplearning4j.spark.impl.paramavg.ParameterAveragingTrainingMaster$Builder`"
  (^org.deeplearning4j.spark.impl.paramavg.ParameterAveragingTrainingMaster$Builder [^ParameterAveragingTrainingMaster$Builder this ^Integer prefetch-num-batches]
    (-> this (.workerPrefetchNumBatches prefetch-num-batches))))

(defn build
  "returns: `org.deeplearning4j.spark.impl.paramavg.ParameterAveragingTrainingMaster`"
  (^org.deeplearning4j.spark.impl.paramavg.ParameterAveragingTrainingMaster [^ParameterAveragingTrainingMaster$Builder this]
    (-> this (.build))))

(defn repartition-strategy
  "Used in conjunction with repartionData(Repartition) (which defines when repartitioning should be
  conducted), repartitionStrategy defines how the repartitioning should be done. See RepartitionStrategy
  for details

  repartition-strategy - Repartitioning strategy to use - `org.deeplearning4j.spark.api.RepartitionStrategy`

  returns: `org.deeplearning4j.spark.impl.paramavg.ParameterAveragingTrainingMaster$Builder`"
  (^org.deeplearning4j.spark.impl.paramavg.ParameterAveragingTrainingMaster$Builder [^ParameterAveragingTrainingMaster$Builder this ^org.deeplearning4j.spark.api.RepartitionStrategy repartition-strategy]
    (-> this (.repartitionStrategy repartition-strategy))))

(defn batch-size-per-worker
  "Batch size (in number of examples) per worker, for each fit(DataSet) call.

  batch-size-per-worker - Size of each minibatch to use for each worker - `int`

  returns: `org.deeplearning4j.spark.impl.paramavg.ParameterAveragingTrainingMaster$Builder`"
  (^org.deeplearning4j.spark.impl.paramavg.ParameterAveragingTrainingMaster$Builder [^ParameterAveragingTrainingMaster$Builder this ^Integer batch-size-per-worker]
    (-> this (.batchSizePerWorker batch-size-per-worker))))

(defn storage-level
  "Set the storage level for RDD<DataSet>s.
  Default: StorageLevel.MEMORY_ONLY_SER() - i.e., store in memory, in serialized form
  To use no RDD persistence, use null

  Note: Spark's StorageLevel.MEMORY_ONLY() and StorageLevel.MEMORY_AND_DISK() can be problematic when
  it comes to off-heap data (which DL4J/ND4J uses extensively). Spark does not account for off-heap memory
  when deciding if/when to drop blocks to ensure enough free memory; consequently, for DataSet RDDs that are
  larger than the total amount of (off-heap) memory, this can lead to OOM issues. Put another way: Spark counts
  the on-heap size of DataSet and INDArray objects only (which is negligible) resulting in a significant
  underestimate of the true DataSet object sizes. More DataSets are thus kept in memory than we can really afford.

  storage-level - Storage level to use for DataSet RDDs - `org.apache.spark.storage.StorageLevel`

  returns: `org.deeplearning4j.spark.impl.paramavg.ParameterAveragingTrainingMaster$Builder`"
  (^org.deeplearning4j.spark.impl.paramavg.ParameterAveragingTrainingMaster$Builder [^ParameterAveragingTrainingMaster$Builder this ^org.apache.spark.storage.StorageLevel storage-level]
    (-> this (.storageLevel storage-level))))

(defn storage-level-streams
  "Set the storage level RDDs used when fitting data from Streams: either PortableDataStreams (sc.binaryFiles via
  SparkDl4jMultiLayer.fit(String) and SparkComputationGraph.fit(String)) or String paths
  (via SparkDl4jMultiLayer.fitPaths(JavaRDD), SparkComputationGraph.fitPaths(JavaRDD) and
  SparkComputationGraph.fitPathsMultiDataSet(JavaRDD)).

  Default storage level is StorageLevel.MEMORY_ONLY() which should be appropriate in most cases.

  storage-level-streams - Storage level to use - `org.apache.spark.storage.StorageLevel`

  returns: `org.deeplearning4j.spark.impl.paramavg.ParameterAveragingTrainingMaster$Builder`"
  (^org.deeplearning4j.spark.impl.paramavg.ParameterAveragingTrainingMaster$Builder [^ParameterAveragingTrainingMaster$Builder this ^org.apache.spark.storage.StorageLevel storage-level-streams]
    (-> this (.storageLevelStreams storage-level-streams))))

(defn training-hooks
  "Adds training hooks to the master.
  The training master will setup the workers
  with the desired hooks for training.
  This can allow for tings like parameter servers
  and async updates as well as collecting statistics.

  training-hooks - the training hooks to ad - `java.util.Collection`

  returns: `org.deeplearning4j.spark.impl.paramavg.ParameterAveragingTrainingMaster$Builder`"
  (^org.deeplearning4j.spark.impl.paramavg.ParameterAveragingTrainingMaster$Builder [^ParameterAveragingTrainingMaster$Builder this ^java.util.Collection training-hooks]
    (-> this (.trainingHooks training-hooks))))

(defn aggregation-depth
  "The number of levels in the aggregation tree for parameter synchronization. (default: 2)
  Note: For large models trained with many partitions, increasing this number
  will reduce the load on the driver and help prevent it from becoming a bottleneck.

  aggregation-depth - RDD tree aggregation channels when averaging parameter updates. - `int`

  returns: `org.deeplearning4j.spark.impl.paramavg.ParameterAveragingTrainingMaster$Builder`"
  (^org.deeplearning4j.spark.impl.paramavg.ParameterAveragingTrainingMaster$Builder [^ParameterAveragingTrainingMaster$Builder this ^Integer aggregation-depth]
    (-> this (.aggregationDepth aggregation-depth))))

