(ns org.deeplearning4j.spark.parameterserver.training.SharedTrainingMaster$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.parameterserver.training SharedTrainingMaster$Builder]))

(defn ->builder
  "Constructor.

  void-configuration - ParameterServer configuration POJO - `org.nd4j.parameterserver.distributed.conf.VoidConfiguration`
  num-workers - `java.lang.Integer`
  threshold - Update sharing threshold - `double`
  rdd-data-set-num-examples - `int`"
  (^SharedTrainingMaster$Builder [^org.nd4j.parameterserver.distributed.conf.VoidConfiguration void-configuration ^java.lang.Integer num-workers ^Double threshold ^Integer rdd-data-set-num-examples]
    (new SharedTrainingMaster$Builder void-configuration num-workers threshold rdd-data-set-num-examples))
  (^SharedTrainingMaster$Builder [^org.nd4j.parameterserver.distributed.conf.VoidConfiguration void-configuration ^Double threshold ^Integer rdd-data-set-num-examples]
    (new SharedTrainingMaster$Builder void-configuration threshold rdd-data-set-num-examples))
  (^SharedTrainingMaster$Builder [^org.nd4j.parameterserver.distributed.conf.VoidConfiguration void-configuration ^Integer rdd-data-set-num-examples]
    (new SharedTrainingMaster$Builder void-configuration rdd-data-set-num-examples))
  (^SharedTrainingMaster$Builder [^Integer rdd-data-set-num-examples]
    (new SharedTrainingMaster$Builder rdd-data-set-num-examples)))

(defn transport
  "Optional method: Transport implementation to be used as TransportType.CUSTOM for VoidParameterAveraging method

  transport - `org.nd4j.parameterserver.distributed.transport.Transport`

  returns: `org.deeplearning4j.spark.parameterserver.training.SharedTrainingMaster$Builder`"
  (^org.deeplearning4j.spark.parameterserver.training.SharedTrainingMaster$Builder [^SharedTrainingMaster$Builder this ^org.nd4j.parameterserver.distributed.transport.Transport transport]
    (-> this (.transport transport))))

(defn export-directory
  "When rddTrainingApproach(RDDTrainingApproach) is set to RDDTrainingApproach.Export (as it is by default)
  the data is exported to a temporary directory first.

  Default: null. -> use {hadoop.tmp.dir}/dl4j/. In this case, data is exported to {hadoop.tmp.dir}/dl4j/SOME_UNIQUE_ID/
  If you specify a directory, the directory {exportDirectory}/SOME_UNIQUE_ID/ will be used instead.

  export-directory - Base directory to export data - `java.lang.String`

  returns: `org.deeplearning4j.spark.parameterserver.training.SharedTrainingMaster$Builder`"
  (^org.deeplearning4j.spark.parameterserver.training.SharedTrainingMaster$Builder [^SharedTrainingMaster$Builder this ^java.lang.String export-directory]
    (-> this (.exportDirectory export-directory))))

(defn min-updates-threshold
  "Once update with given threshold become too sparse, threshold will be decreased by thresholdStep, but not below minimum threshold.
  This method is used to set that minimum threshold
  Default value: 1e-5

  threshold - `double`

  returns: `org.deeplearning4j.spark.parameterserver.training.SharedTrainingMaster$Builder`"
  (^org.deeplearning4j.spark.parameterserver.training.SharedTrainingMaster$Builder [^SharedTrainingMaster$Builder this ^Double threshold]
    (-> this (.minUpdatesThreshold threshold))))

(defn updates-threshold
  "Threshold for updates encoding. Lower values might improve convergence, but increase amount of network
  communication.
  Default value: 1e-3

  threshold - Threshold to use - `double`

  returns: `org.deeplearning4j.spark.parameterserver.training.SharedTrainingMaster$Builder`"
  (^org.deeplearning4j.spark.parameterserver.training.SharedTrainingMaster$Builder [^SharedTrainingMaster$Builder this ^Double threshold]
    (-> this (.updatesThreshold threshold))))

(defn rng-seed
  "Random number generator seed, used mainly for enforcing repeatable splitting on RDDs
  Default: no seed set (i.e., random seed)

  rng-seed - RNG seed - `long`

  returns: `org.deeplearning4j.spark.parameterserver.training.SharedTrainingMaster$Builder`"
  (^org.deeplearning4j.spark.parameterserver.training.SharedTrainingMaster$Builder [^SharedTrainingMaster$Builder this ^Long rng-seed]
    (-> this (.rngSeed rng-seed))))

(defn workers-per-node
  "This method allows to configure number of trainer threads per cluster node.
  Default value: -1, which defines automated number of workers selection, based on hardware present in system

  num-workers - `int`

  returns: `org.deeplearning4j.spark.parameterserver.training.SharedTrainingMaster$Builder`"
  (^org.deeplearning4j.spark.parameterserver.training.SharedTrainingMaster$Builder [^SharedTrainingMaster$Builder this ^Integer num-workers]
    (-> this (.workersPerNode num-workers))))

(defn rdd-training-approach
  "The approach to use when training on a RDD<DataSet> or RDD<MultiDataSet>.
  Default: RDDTrainingApproach.Export, which exports data to a temporary directory first

  rdd-training-approach - Training approach to use when training from a RDD<DataSet> or RDD<MultiDataSet> - `org.deeplearning4j.spark.api.RDDTrainingApproach`

  returns: `org.deeplearning4j.spark.parameterserver.training.SharedTrainingMaster$Builder`"
  (^org.deeplearning4j.spark.parameterserver.training.SharedTrainingMaster$Builder [^SharedTrainingMaster$Builder this ^org.deeplearning4j.spark.api.RDDTrainingApproach rdd-training-approach]
    (-> this (.rddTrainingApproach rdd-training-approach))))

(defn step-delay
  "Wait at least X iterations between applying threshold decay
  Default value: 50

  step - `int`

  returns: `org.deeplearning4j.spark.parameterserver.training.SharedTrainingMaster$Builder`"
  (^org.deeplearning4j.spark.parameterserver.training.SharedTrainingMaster$Builder [^SharedTrainingMaster$Builder this ^Integer step]
    (-> this (.stepDelay step))))

(defn collect-training-stats
  "Enable/disable collection of training statistics

  really-connect - `boolean`

  returns: `org.deeplearning4j.spark.parameterserver.training.SharedTrainingMaster$Builder`"
  (^org.deeplearning4j.spark.parameterserver.training.SharedTrainingMaster$Builder [^SharedTrainingMaster$Builder this ^Boolean really-connect]
    (-> this (.collectTrainingStats really-connect))))

(defn repartition-data
  "Deprecated. Use repartitioner(Repartitioner)

  repartition - Repartition setting - `org.deeplearning4j.spark.api.Repartition`

  returns: `org.deeplearning4j.spark.parameterserver.training.SharedTrainingMaster$Builder`"
  (^org.deeplearning4j.spark.parameterserver.training.SharedTrainingMaster$Builder [^SharedTrainingMaster$Builder this ^org.deeplearning4j.spark.api.Repartition repartition]
    (-> this (.repartitionData repartition))))

(defn threshold-step
  "Step size for threshold decay. When sparsity is less than
  Default value: 1e-5

  step - Step size - `double`

  returns: `org.deeplearning4j.spark.parameterserver.training.SharedTrainingMaster$Builder`"
  (^org.deeplearning4j.spark.parameterserver.training.SharedTrainingMaster$Builder [^SharedTrainingMaster$Builder this ^Double step]
    (-> this (.thresholdStep step))))

(defn worker-prefetch-num-batches
  "Number of minibatches to asynchronously prefetch when training. Default: 2

  prefetch-num-batches - Number of batches to prefetch - `int`

  returns: `org.deeplearning4j.spark.parameterserver.training.SharedTrainingMaster$Builder`"
  (^org.deeplearning4j.spark.parameterserver.training.SharedTrainingMaster$Builder [^SharedTrainingMaster$Builder this ^Integer prefetch-num-batches]
    (-> this (.workerPrefetchNumBatches prefetch-num-batches))))

(defn build
  "returns: `org.deeplearning4j.spark.parameterserver.training.SharedTrainingMaster`"
  (^org.deeplearning4j.spark.parameterserver.training.SharedTrainingMaster [^SharedTrainingMaster$Builder this]
    (-> this (.build))))

(defn repartition-strategy
  "Deprecated. Use repartitioner(Repartitioner)

  repartition-strategy - Repartitioning strategy to use - `org.deeplearning4j.spark.api.RepartitionStrategy`

  returns: `org.deeplearning4j.spark.parameterserver.training.SharedTrainingMaster$Builder`"
  (^org.deeplearning4j.spark.parameterserver.training.SharedTrainingMaster$Builder [^SharedTrainingMaster$Builder this ^org.deeplearning4j.spark.api.RepartitionStrategy repartition-strategy]
    (-> this (.repartitionStrategy repartition-strategy))))

(defn step-trigger
  "Target sparsity/dense level, when threshold step will happen. i.e. 5 value = 5% of original updates size.
  Default value: 0.05

  step - `double`

  returns: `org.deeplearning4j.spark.parameterserver.training.SharedTrainingMaster$Builder`"
  (^org.deeplearning4j.spark.parameterserver.training.SharedTrainingMaster$Builder [^SharedTrainingMaster$Builder this ^Double step]
    (-> this (.stepTrigger step))))

(defn batch-size-per-worker
  "Batch size value, used for repartition purposes

  batch-size - `int`

  returns: `org.deeplearning4j.spark.parameterserver.training.SharedTrainingMaster$Builder`"
  (^org.deeplearning4j.spark.parameterserver.training.SharedTrainingMaster$Builder [^SharedTrainingMaster$Builder this ^Integer batch-size]
    (-> this (.batchSizePerWorker batch-size))))

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

  returns: `org.deeplearning4j.spark.parameterserver.training.SharedTrainingMaster$Builder`"
  (^org.deeplearning4j.spark.parameterserver.training.SharedTrainingMaster$Builder [^SharedTrainingMaster$Builder this ^org.apache.spark.storage.StorageLevel storage-level]
    (-> this (.storageLevel storage-level))))

(defn debug-longer-iterations
  "Deprecated.

  time-ms - `long`

  returns: `org.deeplearning4j.spark.parameterserver.training.SharedTrainingMaster$Builder`"
  (^org.deeplearning4j.spark.parameterserver.training.SharedTrainingMaster$Builder [^SharedTrainingMaster$Builder this ^Long time-ms]
    (-> this (.debugLongerIterations time-ms))))

(defn repartitioner
  "Repartitioner to use to repartition data before fitting.
  DL4J performs a MapPartitions operation for training, hence how the data is partitioned can matter a lot for
  performance (specifically, too few partitions can result in poor cluster utilization).
  Default is DefaultRepartitioner

  repartitioner - Repartitioner to use - `org.deeplearning4j.spark.api.Repartitioner`

  returns: Repartitioner - `org.deeplearning4j.spark.parameterserver.training.SharedTrainingMaster$Builder`"
  (^org.deeplearning4j.spark.parameterserver.training.SharedTrainingMaster$Builder [^SharedTrainingMaster$Builder this ^org.deeplearning4j.spark.api.Repartitioner repartitioner]
    (-> this (.repartitioner repartitioner))))

(defn shake-frequency
  "During NN training, each X iterations, executors will send encoded dense updates with lower threshold.
  Please note: If you'll set this value too low (i.e. 1) - it might lead to worse training performance
  Default value: 0 (disabled)

  frequency - `int`

  returns: `org.deeplearning4j.spark.parameterserver.training.SharedTrainingMaster$Builder`"
  (^org.deeplearning4j.spark.parameterserver.training.SharedTrainingMaster$Builder [^SharedTrainingMaster$Builder this ^Integer frequency]
    (-> this (.shakeFrequency frequency))))

