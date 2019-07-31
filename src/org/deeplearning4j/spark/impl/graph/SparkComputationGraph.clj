(ns org.deeplearning4j.spark.impl.graph.SparkComputationGraph
  "Main class for training ComputationGraph networks using Spark"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.impl.graph SparkComputationGraph]))

(defn ->spark-computation-graph
  "Constructor.

  Instantiate a ComputationGraph instance with the given context and network.

  spark-context - the spark context to use - `org.apache.spark.SparkContext`
  network - the network to use - `org.deeplearning4j.nn.graph.ComputationGraph`
  training-master - `org.deeplearning4j.spark.api.TrainingMaster`"
  (^SparkComputationGraph [^org.apache.spark.SparkContext spark-context ^org.deeplearning4j.nn.graph.ComputationGraph network ^org.deeplearning4j.spark.api.TrainingMaster training-master]
    (new SparkComputationGraph spark-context network training-master)))

(def *-default-roc-threshold-steps
  "Static Constant.

  type: int"
  SparkComputationGraph/DEFAULT_ROC_THRESHOLD_STEPS)

(def *-default-eval-score-batch-size
  "Static Constant.

  type: int"
  SparkComputationGraph/DEFAULT_EVAL_SCORE_BATCH_SIZE)

(def *-default-eval-workers
  "Static Constant.

  type: int"
  SparkComputationGraph/DEFAULT_EVAL_WORKERS)

(defn evaluate-mds
  "Evaluate the network (classification performance) in a distributed manner on the provided data

  data - `org.apache.spark.api.java.JavaRDD`
  minibatch-size - `int`

  returns: `org.deeplearning4j.eval.Evaluation`"
  (^org.deeplearning4j.eval.Evaluation [^SparkComputationGraph this ^org.apache.spark.api.java.JavaRDD data ^Integer minibatch-size]
    (-> this (.evaluateMDS data minibatch-size)))
  (^org.deeplearning4j.eval.Evaluation [^SparkComputationGraph this ^org.apache.spark.api.java.JavaRDD data]
    (-> this (.evaluateMDS data))))

(defn evaluate-roc-multi-class
  "Perform ROC analysis/evaluation (for the multi-class case, using ROCMultiClass on the given DataSet in a distributed manner

  data - Test set data (to evaluate on) - `org.apache.spark.api.java.JavaRDD`
  threshold-steps - Number of threshold steps for ROC - see ROC - `int`
  evaluation-minibatch-size - Minibatch size to use when performing ROC evaluation - `int`

  returns: ROCMultiClass for the entire data set - `org.deeplearning4j.eval.ROCMultiClass`"
  (^org.deeplearning4j.eval.ROCMultiClass [^SparkComputationGraph this ^org.apache.spark.api.java.JavaRDD data ^Integer threshold-steps ^Integer evaluation-minibatch-size]
    (-> this (.evaluateROCMultiClass data threshold-steps evaluation-minibatch-size)))
  (^org.deeplearning4j.eval.ROCMultiClass [^SparkComputationGraph this ^org.apache.spark.api.java.JavaRDD data]
    (-> this (.evaluateROCMultiClass data))))

(defn fit
  "Fit the ComputationGraph with the given data set

  rdd - Data to train on - `org.apache.spark.rdd.RDD`

  returns: Trained network - `org.deeplearning4j.nn.graph.ComputationGraph`"
  (^org.deeplearning4j.nn.graph.ComputationGraph [^SparkComputationGraph this ^org.apache.spark.rdd.RDD rdd]
    (-> this (.fit rdd)))
  (^org.deeplearning4j.nn.graph.ComputationGraph [^SparkComputationGraph this ^java.lang.String path ^Integer min-partitions]
    (-> this (.fit path min-partitions))))

(defn get-spark-training-stats
  "returns: `org.deeplearning4j.spark.api.stats.SparkTrainingStats`"
  (^org.deeplearning4j.spark.api.stats.SparkTrainingStats [^SparkComputationGraph this]
    (-> this (.getSparkTrainingStats))))

(defn get-spark-context
  "returns: `org.apache.spark.api.java.JavaSparkContext`"
  (^org.apache.spark.api.java.JavaSparkContext [^SparkComputationGraph this]
    (-> this (.getSparkContext))))

(defn score-examples-multi-data-set
  "Score the examples individually, using a specified batch size. Unlike calculateScore(JavaRDD, boolean),
  this method returns a score for each example separately. If scoring is needed for specific examples use either
  scoreExamples(JavaPairRDD, boolean) or scoreExamples(JavaPairRDD, boolean, int) which can have
  a key for each example.

  data - Data to score - `org.apache.spark.api.java.JavaRDD`
  include-regularization-terms - If true: include the l1/l2 regularization terms with the score (if any) - `boolean`
  batch-size - Batch size to use when doing scoring - `int`

  returns: A JavaDoubleRDD containing the scores of each example - `org.apache.spark.api.java.JavaDoubleRDD`"
  (^org.apache.spark.api.java.JavaDoubleRDD [^SparkComputationGraph this ^org.apache.spark.api.java.JavaRDD data ^Boolean include-regularization-terms ^Integer batch-size]
    (-> this (.scoreExamplesMultiDataSet data include-regularization-terms batch-size)))
  (^org.apache.spark.api.java.JavaDoubleRDD [^SparkComputationGraph this ^org.apache.spark.api.java.JavaRDD data ^Boolean include-regularization-terms]
    (-> this (.scoreExamplesMultiDataSet data include-regularization-terms))))

(defn fit-paths-multi-data-set
  "Fit the network using a list of paths for serialized MultiDataSet objects.

  paths - List of paths - `org.apache.spark.api.java.JavaRDD`

  returns: trained network - `org.deeplearning4j.nn.graph.ComputationGraph`"
  (^org.deeplearning4j.nn.graph.ComputationGraph [^SparkComputationGraph this ^org.apache.spark.api.java.JavaRDD paths]
    (-> this (.fitPathsMultiDataSet paths))))

(defn evaluate-roc
  "Perform ROC analysis/evaluation on the given DataSet in a distributed manner

  data - Test set data (to evaluate on) - `org.apache.spark.api.java.JavaRDD`
  threshold-steps - Number of threshold steps for ROC - see ROC - `int`
  evaluation-minibatch-size - Minibatch size to use when performing ROC evaluation - `int`

  returns: ROC for the entire data set - `org.deeplearning4j.eval.ROC`"
  (^org.deeplearning4j.eval.ROC [^SparkComputationGraph this ^org.apache.spark.api.java.JavaRDD data ^Integer threshold-steps ^Integer evaluation-minibatch-size]
    (-> this (.evaluateROC data threshold-steps evaluation-minibatch-size)))
  (^org.deeplearning4j.eval.ROC [^SparkComputationGraph this ^org.apache.spark.api.java.JavaRDD data]
    (-> this (.evaluateROC data))))

(defn set-network
  "network - `org.deeplearning4j.nn.graph.ComputationGraph`"
  ([^SparkComputationGraph this ^org.deeplearning4j.nn.graph.ComputationGraph network]
    (-> this (.setNetwork network))))

(defn feed-forward-with-key-single
  "Feed-forward the specified data, with the given keys. i.e., get the network output/predictions for the specified data

  features-data - Features data to feed through the network - `org.apache.spark.api.java.JavaPairRDD`
  batch-size - Batch size to use when doing feed forward operations - `int`

  returns: Network output given the input, by key - `<K> org.apache.spark.api.java.JavaPairRDD<K,org.nd4j.linalg.api.ndarray.INDArray>`"
  ([^SparkComputationGraph this ^org.apache.spark.api.java.JavaPairRDD features-data ^Integer batch-size]
    (-> this (.feedForwardWithKeySingle features-data batch-size))))

(defn evaluate-rocmds
  "Perform ROC analysis/evaluation on the given DataSet in a distributed manner, using the specified number of
  steps and minibatch size

  data - Test set data (to evaluate on) - `org.apache.spark.api.java.JavaRDD`
  roc-threshold-num-steps - See ROC for details - `int`
  minibatch-size - Minibatch size for evaluation - `int`

  returns: ROC for the entire data set - `org.deeplearning4j.eval.ROC`"
  (^org.deeplearning4j.eval.ROC [^SparkComputationGraph this ^org.apache.spark.api.java.JavaRDD data ^Integer roc-threshold-num-steps ^Integer minibatch-size]
    (-> this (.evaluateROCMDS data roc-threshold-num-steps minibatch-size)))
  (^org.deeplearning4j.eval.ROC [^SparkComputationGraph this ^org.apache.spark.api.java.JavaRDD data]
    (-> this (.evaluateROCMDS data))))

(defn calculate-score
  "Calculate the score for all examples in the provided JavaRDD<DataSet>, either by summing
  or averaging over the entire data set. To calculate a score for each example individually, use scoreExamples(JavaPairRDD, boolean)
  or one of the similar methods

  data - Data to score - `org.apache.spark.api.java.JavaRDD`
  average - Whether to sum the scores, or average them - `boolean`
  minibatch-size - The number of examples to use in each minibatch when scoring. If more examples are in a partition thanthis, multiple scoring operations will be done (to avoid using too much memory by doing the whole partitionin one go) - `int`

  returns: `double`"
  (^Double [^SparkComputationGraph this ^org.apache.spark.api.java.JavaRDD data ^Boolean average ^Integer minibatch-size]
    (-> this (.calculateScore data average minibatch-size)))
  (^Double [^SparkComputationGraph this ^org.apache.spark.api.java.JavaRDD data ^Boolean average]
    (-> this (.calculateScore data average))))

(defn feed-forward-with-key
  "Feed-forward the specified data, with the given keys. i.e., get the network output/predictions for the specified data

  features-data - Features data to feed through the network - `org.apache.spark.api.java.JavaPairRDD`
  batch-size - Batch size to use when doing feed forward operations - `int`

  returns: Network output given the input, by key - `<K> org.apache.spark.api.java.JavaPairRDD<K,org.nd4j.linalg.api.ndarray.INDArray[]>`"
  ([^SparkComputationGraph this ^org.apache.spark.api.java.JavaPairRDD features-data ^Integer batch-size]
    (-> this (.feedForwardWithKey features-data batch-size))))

(defn do-evaluation
  "Perform evaluation on serialized DataSet objects on disk, (potentially in any format), that are loaded using an DataSetLoader

  data - List of paths to the data (that can be loaded as / converted to DataSets) - `org.apache.spark.api.java.JavaRDD`
  eval-num-workers - Number of workers to perform evaluation with. To reduce memory requirements and cache thrashing,it is common to set this to a lower value than the number of spark threads per JVM/executor - `int`
  eval-batch-size - Batch size to use when performing evaluation - `int`
  loader - Used to load DataSets from their paths - `org.deeplearning4j.api.loader.DataSetLoader`
  empty-evaluations - Evaluations to perform - `org.deeplearning4j.eval.IEvaluation`

  returns: Evaluation - `org.deeplearning4j.eval.IEvaluation[]`"
  ([^SparkComputationGraph this ^org.apache.spark.api.java.JavaRDD data ^Integer eval-num-workers ^Integer eval-batch-size ^org.deeplearning4j.api.loader.DataSetLoader loader ^org.deeplearning4j.eval.IEvaluation empty-evaluations]
    (-> this (.doEvaluation data eval-num-workers eval-batch-size loader empty-evaluations)))
  ([^SparkComputationGraph this ^org.apache.spark.api.java.JavaRDD data ^Integer eval-num-workers ^Integer eval-batch-size empty-evaluations]
    (-> this (.doEvaluation data eval-num-workers eval-batch-size empty-evaluations)))
  ([^SparkComputationGraph this ^org.apache.spark.api.java.JavaRDD data empty-evaluation ^Integer eval-batch-size]
    (-> this (.doEvaluation data empty-evaluation eval-batch-size))))

(defn score-examples
  "DataSet version of scoreExamples(JavaPairRDD, boolean, int)

  data - `org.apache.spark.api.java.JavaRDD`
  include-regularization-terms - `boolean`
  batch-size - `int`

  returns: `org.apache.spark.api.java.JavaDoubleRDD`"
  (^org.apache.spark.api.java.JavaDoubleRDD [^SparkComputationGraph this ^org.apache.spark.api.java.JavaRDD data ^Boolean include-regularization-terms ^Integer batch-size]
    (-> this (.scoreExamples data include-regularization-terms batch-size)))
  (^org.apache.spark.api.java.JavaDoubleRDD [^SparkComputationGraph this ^org.apache.spark.api.java.JavaRDD data ^Boolean include-regularization-terms]
    (-> this (.scoreExamples data include-regularization-terms))))

(defn set-score
  "last-score - `double`"
  ([^SparkComputationGraph this ^Double last-score]
    (-> this (.setScore last-score))))

(defn evaluate
  "Evaluate the network (classification performance) in a distributed manner, using specified batch size and a provided
  list of labels

  data - Data to evaluate on - `org.apache.spark.api.java.JavaRDD`
  labels-list - List of labels used for evaluation - `java.util.List`
  eval-batch-size - Batch size to use when conducting evaluations - `int`

  returns: Evaluation object; results of evaluation on all examples in the data set - `org.deeplearning4j.eval.Evaluation`"
  (^org.deeplearning4j.eval.Evaluation [^SparkComputationGraph this ^org.apache.spark.api.java.JavaRDD data ^java.util.List labels-list ^Integer eval-batch-size]
    (-> this (.evaluate data labels-list eval-batch-size)))
  (^org.deeplearning4j.eval.Evaluation [^SparkComputationGraph this ^org.apache.spark.rdd.RDD data ^java.util.List labels-list]
    (-> this (.evaluate data labels-list)))
  (^org.deeplearning4j.eval.Evaluation [^SparkComputationGraph this ^org.apache.spark.rdd.RDD data]
    (-> this (.evaluate data))))

(defn get-score
  "Gets the last (average) minibatch score from calling fit. This is the average score across all executors for the
  last minibatch executed in each worker

  returns: `double`"
  (^Double [^SparkComputationGraph this]
    (-> this (.getScore))))

(defn calculate-score-multi-data-set
  "Calculate the score for all examples in the provided JavaRDD<MultiDataSet>, either by summing
  or averaging over the entire data set.
  *

  data - Data to score - `org.apache.spark.api.java.JavaRDD`
  average - Whether to sum the scores, or average them - `boolean`
  minibatch-size - The number of examples to use in each minibatch when scoring. If more examples are in a partition thanthis, multiple scoring operations will be done (to avoid using too much memory by doing the whole partitionin one go) - `int`

  returns: `double`"
  (^Double [^SparkComputationGraph this ^org.apache.spark.api.java.JavaRDD data ^Boolean average ^Integer minibatch-size]
    (-> this (.calculateScoreMultiDataSet data average minibatch-size)))
  (^Double [^SparkComputationGraph this ^org.apache.spark.api.java.JavaRDD data ^Boolean average]
    (-> this (.calculateScoreMultiDataSet data average))))

(defn fit-multi-data-set
  "Fit the ComputationGraph with the given data set

  rdd - Data to train on - `org.apache.spark.rdd.RDD`

  returns: Trained network - `org.deeplearning4j.nn.graph.ComputationGraph`"
  (^org.deeplearning4j.nn.graph.ComputationGraph [^SparkComputationGraph this ^org.apache.spark.rdd.RDD rdd]
    (-> this (.fitMultiDataSet rdd)))
  (^org.deeplearning4j.nn.graph.ComputationGraph [^SparkComputationGraph this ^java.lang.String path ^Integer min-partitions]
    (-> this (.fitMultiDataSet path min-partitions))))

(defn evaluate-regression
  "Evaluate the network (regression performance) in a distributed manner on the provided data

  data - Data to evaluate - `org.apache.spark.api.java.JavaRDD`
  minibatch-size - Minibatch size to use when doing performing evaluation - `int`

  returns: RegressionEvaluation instance with regression performance - `org.deeplearning4j.eval.RegressionEvaluation`"
  (^org.deeplearning4j.eval.RegressionEvaluation [^SparkComputationGraph this ^org.apache.spark.api.java.JavaRDD data ^Integer minibatch-size]
    (-> this (.evaluateRegression data minibatch-size)))
  (^org.deeplearning4j.eval.RegressionEvaluation [^SparkComputationGraph this ^org.apache.spark.api.java.JavaRDD data]
    (-> this (.evaluateRegression data))))

(defn get-training-master
  "returns: The TrainingMaster for this network - `org.deeplearning4j.spark.api.TrainingMaster`"
  (^org.deeplearning4j.spark.api.TrainingMaster [^SparkComputationGraph this]
    (-> this (.getTrainingMaster))))

(defn fit-paths
  "Fit the network using a list of paths for serialized DataSet objects.

  paths - List of paths - `org.apache.spark.api.java.JavaRDD`

  returns: trained network - `org.deeplearning4j.nn.graph.ComputationGraph`"
  (^org.deeplearning4j.nn.graph.ComputationGraph [^SparkComputationGraph this ^org.apache.spark.api.java.JavaRDD paths]
    (-> this (.fitPaths paths)))
  (^org.deeplearning4j.nn.graph.ComputationGraph [^SparkComputationGraph this ^org.apache.spark.api.java.JavaRDD paths ^org.deeplearning4j.api.loader.DataSetLoader loader]
    (-> this (.fitPaths paths loader))))

(defn get-network
  "returns: The trained ComputationGraph - `org.deeplearning4j.nn.graph.ComputationGraph`"
  (^org.deeplearning4j.nn.graph.ComputationGraph [^SparkComputationGraph this]
    (-> this (.getNetwork))))

(defn do-evaluation-mds
  "Perform distributed evaluation on a single output ComputationGraph form MultiDataSet objects using Spark.
  Can be used to perform multiple evaluations on this single output (for example, Evaluation and
  ROC) at the same time.

  data - Data to evaluatie - `org.apache.spark.api.java.JavaRDD`
  eval-batch-size - Minibatch size for evaluation - `int`
  empty-evaluations - Evaluations to perform - `T`

  returns: Evaluations - `<T extends org.deeplearning4j.eval.IEvaluation> T[]`"
  ([^SparkComputationGraph this ^org.apache.spark.api.java.JavaRDD data ^Integer eval-batch-size empty-evaluations]
    (-> this (.doEvaluationMDS data eval-batch-size empty-evaluations)))
  ([^SparkComputationGraph this ^org.apache.spark.api.java.JavaRDD data ^Integer eval-num-workers ^Integer eval-batch-size empty-evaluations]
    (-> this (.doEvaluationMDS data eval-num-workers eval-batch-size empty-evaluations))))

(defn evaluate-regression-mds
  "Evaluate the network (regression performance) in a distributed manner on the provided data

  data - Data to evaluate - `org.apache.spark.api.java.JavaRDD`
  minibatch-size - Minibatch size to use when doing performing evaluation - `int`

  returns: RegressionEvaluation instance with regression performance - `org.deeplearning4j.eval.RegressionEvaluation`"
  (^org.deeplearning4j.eval.RegressionEvaluation [^SparkComputationGraph this ^org.apache.spark.api.java.JavaRDD data ^Integer minibatch-size]
    (-> this (.evaluateRegressionMDS data minibatch-size)))
  (^org.deeplearning4j.eval.RegressionEvaluation [^SparkComputationGraph this ^org.apache.spark.api.java.JavaRDD data]
    (-> this (.evaluateRegressionMDS data))))

(defn set-default-evaluation-workers
  "Set the default number of evaluation workers/threads.
  Note that when the number of workers is provided explicitly in an evaluation method, the default value
  is not used.
  In many cases, we may want this to be smaller than the number of Spark threads, to reduce memory requirements.
  For example, with 32 Spark threads and a large network, we don't want to spin up 32 instances of the network
  to perform evaluation. Better (for memory requirements, and reduced cache thrashing) to use say 4 workers.
  If it is not set explicitly, DEFAULT_EVAL_WORKERS will be used

  workers - `int`"
  ([^SparkComputationGraph this ^Integer workers]
    (-> this (.setDefaultEvaluationWorkers workers))))

(defn set-collect-training-stats
  "collect-training-stats - `boolean`"
  ([^SparkComputationGraph this ^Boolean collect-training-stats]
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
  (^Integer [^SparkComputationGraph this]
    (-> this (.getDefaultEvaluationWorkers))))

