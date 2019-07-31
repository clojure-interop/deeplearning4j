(ns org.deeplearning4j.spark.impl.multilayer.SparkDl4jMultiLayer
  "Master class for spark"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.impl.multilayer SparkDl4jMultiLayer]))

(defn ->spark-dl-4j-multi-layer
  "Constructor.

  Instantiate a multi layer spark instance
  with the given context and network.
  This is the prediction constructor

  spark-context - the spark context to use - `org.apache.spark.SparkContext`
  network - the network to use - `org.deeplearning4j.nn.multilayer.MultiLayerNetwork`
  training-master - `org.deeplearning4j.spark.api.TrainingMaster`"
  (^SparkDl4jMultiLayer [^org.apache.spark.SparkContext spark-context ^org.deeplearning4j.nn.multilayer.MultiLayerNetwork network ^org.deeplearning4j.spark.api.TrainingMaster training-master]
    (new SparkDl4jMultiLayer spark-context network training-master)))

(def *-default-eval-score-batch-size
  "Static Constant.

  type: int"
  SparkDl4jMultiLayer/DEFAULT_EVAL_SCORE_BATCH_SIZE)

(def *-default-roc-threshold-steps
  "Static Constant.

  type: int"
  SparkDl4jMultiLayer/DEFAULT_ROC_THRESHOLD_STEPS)

(def *-default-eval-workers
  "Static Constant.

  type: int"
  SparkDl4jMultiLayer/DEFAULT_EVAL_WORKERS)

(defn evaluate-roc-multi-class
  "Perform ROC analysis/evaluation (for the multi-class case, using ROCMultiClass on the given DataSet in a distributed manner

  data - Test set data (to evaluate on) - `org.apache.spark.api.java.JavaRDD`
  threshold-steps - Number of threshold steps for ROC - see ROC - `int`
  evaluation-minibatch-size - Minibatch size to use when performing ROC evaluation - `int`

  returns: ROCMultiClass for the entire data set - `org.deeplearning4j.eval.ROCMultiClass`"
  (^org.deeplearning4j.eval.ROCMultiClass [^SparkDl4jMultiLayer this ^org.apache.spark.api.java.JavaRDD data ^Integer threshold-steps ^Integer evaluation-minibatch-size]
    (-> this (.evaluateROCMultiClass data threshold-steps evaluation-minibatch-size)))
  (^org.deeplearning4j.eval.ROCMultiClass [^SparkDl4jMultiLayer this ^org.apache.spark.api.java.JavaRDD data]
    (-> this (.evaluateROCMultiClass data))))

(defn fit
  "Fit the DataSet RDD. Equivalent to fit(trainingData.toJavaRDD())

  training-data - the training data RDD to fitDataSet - `org.apache.spark.rdd.RDD`

  returns: the MultiLayerNetwork after training - `org.deeplearning4j.nn.multilayer.MultiLayerNetwork`"
  (^org.deeplearning4j.nn.multilayer.MultiLayerNetwork [^SparkDl4jMultiLayer this ^org.apache.spark.rdd.RDD training-data]
    (-> this (.fit training-data)))
  (^org.deeplearning4j.nn.multilayer.MultiLayerNetwork [^SparkDl4jMultiLayer this ^java.lang.String path ^Integer min-partitions]
    (-> this (.fit path min-partitions))))

(defn predict
  "Predict the given feature matrix

  features - the given feature matrix - `org.apache.spark.mllib.linalg.Matrix`

  returns: the predictions - `org.apache.spark.mllib.linalg.Matrix`"
  (^org.apache.spark.mllib.linalg.Matrix [^SparkDl4jMultiLayer this ^org.apache.spark.mllib.linalg.Matrix features]
    (-> this (.predict features))))

(defn get-spark-training-stats
  "Get the training statistics, after collection of stats has been enabled using setCollectTrainingStats(boolean)

  returns: Training statistics - `org.deeplearning4j.spark.api.stats.SparkTrainingStats`"
  (^org.deeplearning4j.spark.api.stats.SparkTrainingStats [^SparkDl4jMultiLayer this]
    (-> this (.getSparkTrainingStats))))

(defn get-spark-context
  "returns: `org.apache.spark.api.java.JavaSparkContext`"
  (^org.apache.spark.api.java.JavaSparkContext [^SparkDl4jMultiLayer this]
    (-> this (.getSparkContext))))

(defn evaluate-roc
  "Perform ROC analysis/evaluation on the given DataSet in a distributed manner

  data - Test set data (to evaluate on) - `org.apache.spark.api.java.JavaRDD`
  threshold-steps - Number of threshold steps for ROC - see ROC - `int`
  evaluation-minibatch-size - Minibatch size to use when performing ROC evaluation - `int`

  returns: ROC for the entire data set - `org.deeplearning4j.eval.ROC`"
  (^org.deeplearning4j.eval.ROC [^SparkDl4jMultiLayer this ^org.apache.spark.api.java.JavaRDD data ^Integer threshold-steps ^Integer evaluation-minibatch-size]
    (-> this (.evaluateROC data threshold-steps evaluation-minibatch-size)))
  (^org.deeplearning4j.eval.ROC [^SparkDl4jMultiLayer this ^org.apache.spark.api.java.JavaRDD data]
    (-> this (.evaluateROC data))))

(defn set-network
  "Set the network that underlies this SparkDl4jMultiLayer instacne

  network - network to set - `org.deeplearning4j.nn.multilayer.MultiLayerNetwork`"
  ([^SparkDl4jMultiLayer this ^org.deeplearning4j.nn.multilayer.MultiLayerNetwork network]
    (-> this (.setNetwork network))))

(defn calculate-score
  "Calculate the score for all examples in the provided JavaRDD<DataSet>, either by summing
  or averaging over the entire data set. To calculate a score for each example individually, use scoreExamples(JavaPairRDD, boolean)
  or one of the similar methods

  data - Data to score - `org.apache.spark.api.java.JavaRDD`
  average - Whether to sum the scores, or average them - `boolean`
  minibatch-size - The number of examples to use in each minibatch when scoring. If more examples are in a partition thanthis, multiple scoring operations will be done (to avoid using too much memory by doing the whole partitionin one go) - `int`

  returns: `double`"
  (^Double [^SparkDl4jMultiLayer this ^org.apache.spark.api.java.JavaRDD data ^Boolean average ^Integer minibatch-size]
    (-> this (.calculateScore data average minibatch-size)))
  (^Double [^SparkDl4jMultiLayer this ^org.apache.spark.rdd.RDD data ^Boolean average]
    (-> this (.calculateScore data average))))

(defn feed-forward-with-key
  "Feed-forward the specified data, with the given keys. i.e., get the network output/predictions for the specified data

  features-data - Features data to feed through the network - `org.apache.spark.api.java.JavaPairRDD`
  batch-size - Batch size to use when doing feed forward operations - `int`

  returns: Network output given the input, by key - `<K> org.apache.spark.api.java.JavaPairRDD<K,org.nd4j.linalg.api.ndarray.INDArray>`"
  ([^SparkDl4jMultiLayer this ^org.apache.spark.api.java.JavaPairRDD features-data ^Integer batch-size]
    (-> this (.feedForwardWithKey features-data batch-size))))

(defn do-evaluation
  "Perform distributed evaluation of any type of IEvaluation. For example, Evaluation, RegressionEvaluation,
  ROC, ROCMultiClass etc.

  data - Data to evaluate on - `org.apache.spark.api.java.JavaRDD`
  empty-evaluation - Empty evaluation instance. This is the starting point (serialized/duplicated, then merged) - `T`
  eval-batch-size - Evaluation batch size - `int`

  returns: IEvaluation instance - `<T extends org.deeplearning4j.eval.IEvaluation> T`"
  ([^SparkDl4jMultiLayer this ^org.apache.spark.api.java.JavaRDD data empty-evaluation ^Integer eval-batch-size]
    (-> this (.doEvaluation data empty-evaluation eval-batch-size)))
  ([^SparkDl4jMultiLayer this ^org.apache.spark.api.java.JavaRDD data ^Integer eval-num-workers ^Integer eval-batch-size empty-evaluations]
    (-> this (.doEvaluation data eval-num-workers eval-batch-size empty-evaluations))))

(defn score-examples
  "RDD<DataSet>
  overload of scoreExamples(JavaRDD, boolean, int)

  data - `org.apache.spark.rdd.RDD`
  include-regularization-terms - `boolean`
  batch-size - `int`

  returns: `org.apache.spark.api.java.JavaDoubleRDD`"
  (^org.apache.spark.api.java.JavaDoubleRDD [^SparkDl4jMultiLayer this ^org.apache.spark.rdd.RDD data ^Boolean include-regularization-terms ^Integer batch-size]
    (-> this (.scoreExamples data include-regularization-terms batch-size)))
  (^org.apache.spark.api.java.JavaDoubleRDD [^SparkDl4jMultiLayer this ^org.apache.spark.rdd.RDD data ^Boolean include-regularization-terms]
    (-> this (.scoreExamples data include-regularization-terms))))

(defn set-score
  "last-score - `double`"
  ([^SparkDl4jMultiLayer this ^Double last-score]
    (-> this (.setScore last-score))))

(defn evaluate
  "Evaluate on a directory containing a set of DataSet objects to be loaded with a DataSetLoader.
  Uses default batch size of DEFAULT_EVAL_SCORE_BATCH_SIZE

  path - Path/URI to the directory containing the datasets to load - `java.lang.String`
  batch-size - `int`
  loader - `org.deeplearning4j.api.loader.DataSetLoader`

  returns: Evaluation - `org.deeplearning4j.eval.Evaluation`"
  (^org.deeplearning4j.eval.Evaluation [^SparkDl4jMultiLayer this ^java.lang.String path ^Integer batch-size ^org.deeplearning4j.api.loader.DataSetLoader loader]
    (-> this (.evaluate path batch-size loader)))
  (^org.deeplearning4j.eval.Evaluation [^SparkDl4jMultiLayer this ^java.lang.String path ^org.deeplearning4j.api.loader.DataSetLoader loader]
    (-> this (.evaluate path loader)))
  (^org.deeplearning4j.eval.Evaluation [^SparkDl4jMultiLayer this ^org.apache.spark.rdd.RDD data]
    (-> this (.evaluate data))))

(defn get-score
  "Gets the last (average) minibatch score from calling fit. This is the average score across all executors for the
  last minibatch executed in each worker

  returns: `double`"
  (^Double [^SparkDl4jMultiLayer this]
    (-> this (.getScore))))

(defn evaluate-regression
  "Evaluate the network (regression performance) in a distributed manner on the provided data

  data - Data to evaluate - `org.apache.spark.api.java.JavaRDD`
  minibatch-size - Minibatch size to use when doing performing evaluation - `int`

  returns: RegressionEvaluation instance with regression performance - `org.deeplearning4j.eval.RegressionEvaluation`"
  (^org.deeplearning4j.eval.RegressionEvaluation [^SparkDl4jMultiLayer this ^org.apache.spark.api.java.JavaRDD data ^Integer minibatch-size]
    (-> this (.evaluateRegression data minibatch-size)))
  (^org.deeplearning4j.eval.RegressionEvaluation [^SparkDl4jMultiLayer this ^org.apache.spark.api.java.JavaRDD data]
    (-> this (.evaluateRegression data))))

(defn get-training-master
  "returns: The TrainingMaster for this network - `org.deeplearning4j.spark.api.TrainingMaster`"
  (^org.deeplearning4j.spark.api.TrainingMaster [^SparkDl4jMultiLayer this]
    (-> this (.getTrainingMaster))))

(defn fit-paths
  "Fit the network using a list of paths for serialized DataSet objects.

  paths - List of paths - `org.apache.spark.api.java.JavaRDD`

  returns: trained network - `org.deeplearning4j.nn.multilayer.MultiLayerNetwork`"
  (^org.deeplearning4j.nn.multilayer.MultiLayerNetwork [^SparkDl4jMultiLayer this ^org.apache.spark.api.java.JavaRDD paths]
    (-> this (.fitPaths paths)))
  (^org.deeplearning4j.nn.multilayer.MultiLayerNetwork [^SparkDl4jMultiLayer this ^org.apache.spark.api.java.JavaRDD paths ^org.deeplearning4j.api.loader.DataSetLoader loader]
    (-> this (.fitPaths paths loader))))

(defn fit-labeled-point
  "Fit a MultiLayerNetwork using Spark MLLib LabeledPoint instances.
  This will convert the labeled points to the internal DL4J data format and train the model on that

  rdd - the rdd to fitDataSet - `org.apache.spark.api.java.JavaRDD`

  returns: the multi layer network that was fitDataSet - `org.deeplearning4j.nn.multilayer.MultiLayerNetwork`"
  (^org.deeplearning4j.nn.multilayer.MultiLayerNetwork [^SparkDl4jMultiLayer this ^org.apache.spark.api.java.JavaRDD rdd]
    (-> this (.fitLabeledPoint rdd))))

(defn get-network
  "returns: The MultiLayerNetwork underlying the SparkDl4jMultiLayer - `org.deeplearning4j.nn.multilayer.MultiLayerNetwork`"
  (^org.deeplearning4j.nn.multilayer.MultiLayerNetwork [^SparkDl4jMultiLayer this]
    (-> this (.getNetwork))))

(defn set-default-evaluation-workers
  "Set the default number of evaluation workers/threads.
  Note that when the number of workers is provided explicitly in an evaluation method, the default value
  is not used.
  In many cases, we may want this to be smaller than the number of Spark threads, to reduce memory requirements.
  For example, with 32 Spark threads and a large network, we don't want to spin up 32 instances of the network
  to perform evaluation. Better (for memory requirements, and reduced cache thrashing) to use say 4 workers.
  If it is not set explicitly, DEFAULT_EVAL_WORKERS will be used

  workers - `int`"
  ([^SparkDl4jMultiLayer this ^Integer workers]
    (-> this (.setDefaultEvaluationWorkers workers))))

(defn fit-continuous-labeled-point
  "Fits a MultiLayerNetwork using Spark MLLib LabeledPoint instances
  This will convert labeled points that have continuous labels used for regression to the internal
  DL4J data format and train the model on that

  rdd - the javaRDD containing the labeled points - `org.apache.spark.api.java.JavaRDD`

  returns: a MultiLayerNetwork - `org.deeplearning4j.nn.multilayer.MultiLayerNetwork`"
  (^org.deeplearning4j.nn.multilayer.MultiLayerNetwork [^SparkDl4jMultiLayer this ^org.apache.spark.api.java.JavaRDD rdd]
    (-> this (.fitContinuousLabeledPoint rdd))))

(defn set-collect-training-stats
  "Set whether training statistics should be collected for debugging purposes. Statistics collection is disabled by default

  collect-training-stats - If true: collect training statistics. If false: don't collect. - `boolean`"
  ([^SparkDl4jMultiLayer this ^Boolean collect-training-stats]
    (-> this (.setCollectTrainingStats collect-training-stats))))

(defn get-default-evaluation-workers
  "Returns the currently set default number of evaluation workers/threads.
  Note that when the number of workers is provided explicitly in an evaluation method, the default value
  is not used.
  In many cases, we may want this to be smaller than the number of Spark threads, to reduce memory requirements.
  For example, with 32 Spark threads and a large network, we don't want to spin up 32 instances of the network
  to perform evaluation. Better (for memory requirements, and reduced cache thrashing) to use say 4 workers.
  If it is not set explicitly, DEFAULT_EVAL_WORKERS will be used

  returns: Default number of evaluation workers (threads). - `int`"
  (^Integer [^SparkDl4jMultiLayer this]
    (-> this (.getDefaultEvaluationWorkers))))

(defn feed-forward-with-mask-and-key
  "Feed-forward the specified data (and optionally mask array), with the given keys. i.e., get the network
  output/predictions for the specified data

  features-data-and-mask - Features data to feed through the network. The Tuple2 is of the network input (features),and optionally the feature mask arrays - `org.apache.spark.api.java.JavaPairRDD`
  batch-size - Batch size to use when doing feed forward operations - `int`

  returns: Network output given the input (and optionally mask), by key - `<K> org.apache.spark.api.java.JavaPairRDD<K,org.nd4j.linalg.api.ndarray.INDArray>`"
  ([^SparkDl4jMultiLayer this ^org.apache.spark.api.java.JavaPairRDD features-data-and-mask ^Integer batch-size]
    (-> this (.feedForwardWithMaskAndKey features-data-and-mask batch-size))))

