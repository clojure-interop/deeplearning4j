(ns org.deeplearning4j.spark.util.SparkUtils
  "Various utilities for Spark"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.util SparkUtils]))

(defn *write-object-to-file
  "Write an object to HDFS (or local) using default Java object serialization

  path - Path to write the object to - `java.lang.String`
  to-write - Object to write - `java.lang.Object`
  sc - Spark context - `org.apache.spark.api.java.JavaSparkContext`

  throws: java.io.IOException"
  ([^java.lang.String path ^java.lang.Object to-write ^org.apache.spark.api.java.JavaSparkContext sc]
    (SparkUtils/writeObjectToFile path to-write sc)))

(defn *read-object-from-file
  "Read an object from HDFS (or local) using default Java object serialization

  path - File to read - `java.lang.String`
  type - Class of the object to read - `java.lang.Class`
  sc - Spark context - `org.apache.spark.api.java.JavaSparkContext`

  returns: `<T> T`

  throws: java.io.IOException"
  ([^java.lang.String path ^java.lang.Class type ^org.apache.spark.api.java.JavaSparkContext sc]
    (SparkUtils/readObjectFromFile path type sc)))

(defn *list-paths
  "List of the files in the given directory (path), as a JavaRDD<String>

  sc - Spark context - `org.apache.spark.api.java.JavaSparkContext`
  path - Path to list files in - `java.lang.String`
  recursive - Whether to walk the directory tree recursively (i.e., include subdirectories) - `boolean`

  returns: Paths in the directory - `org.apache.spark.api.java.JavaRDD<java.lang.String>`

  throws: java.io.IOException - If error occurs getting directory contents"
  (^org.apache.spark.api.java.JavaRDD [^org.apache.spark.api.java.JavaSparkContext sc ^java.lang.String path ^Boolean recursive]
    (SparkUtils/listPaths sc path recursive))
  (^org.apache.spark.api.java.JavaRDD [^org.apache.spark.api.java.JavaSparkContext sc ^java.lang.String path]
    (SparkUtils/listPaths sc path)))

(defn *shuffle-examples
  "Randomly shuffle the examples in each DataSet object, and recombine them into new DataSet objects
  with the specified BatchSize

  rdd - DataSets to shuffle/recombine - `org.apache.spark.api.java.JavaRDD`
  new-batch-size - New batch size for the DataSet objects, after shuffling/recombining - `int`
  num-partitions - Number of partitions to use when splitting/recombining - `int`

  returns: A new JavaRDD, with the examples shuffled/combined in each - `org.apache.spark.api.java.JavaRDD<org.nd4j.linalg.dataset.DataSet>`"
  (^org.apache.spark.api.java.JavaRDD [^org.apache.spark.api.java.JavaRDD rdd ^Integer new-batch-size ^Integer num-partitions]
    (SparkUtils/shuffleExamples rdd new-batch-size num-partitions)))

(defn *read-string-from-file
  "Read a UTF-8 format String from HDFS (or local)

  path - Path to write the string - `java.lang.String`
  sc - Spark context - `org.apache.spark.api.java.JavaSparkContext`

  returns: `java.lang.String`

  throws: java.io.IOException"
  (^java.lang.String [^java.lang.String path ^org.apache.spark.api.java.JavaSparkContext sc]
    (SparkUtils/readStringFromFile path sc)))

(defn *balanced-random-split
  "Equivalent to balancedRandomSplit(int, int, JavaRDD) with control over the RNG seed

  total-object-count - `int`
  num-objects-per-split - `int`
  data - `org.apache.spark.api.java.JavaRDD`
  rng-seed - `long`

  returns: `<T> org.apache.spark.api.java.JavaRDD<T>[]`"
  ([^Integer total-object-count ^Integer num-objects-per-split ^org.apache.spark.api.java.JavaRDD data ^Long rng-seed]
    (SparkUtils/balancedRandomSplit total-object-count num-objects-per-split data rng-seed))
  ([^Integer total-object-count ^Integer num-objects-per-split ^org.apache.spark.api.java.JavaRDD data]
    (SparkUtils/balancedRandomSplit total-object-count num-objects-per-split data)))

(defn *check-kryo-configuration
  "Check the spark configuration for incorrect Kryo configuration, logging a warning message if necessary

  java-spark-context - Spark context - `org.apache.spark.api.java.JavaSparkContext`
  log - Logger to log messages to - `org.slf4j.Logger`

  returns: True if ok (no kryo, or correct kryo setup) - `boolean`"
  (^Boolean [^org.apache.spark.api.java.JavaSparkContext java-spark-context ^org.slf4j.Logger log]
    (SparkUtils/checkKryoConfiguration java-spark-context log)))

(defn *get-spark-executor-id
  "Get the Spark executor ID
  The ID is parsed from the JVM launch args. If that is not specified (or can't be obtained) then the value
  from UIDProvider.getJVMUID() is returned

  returns: `java.lang.String`"
  (^java.lang.String []
    (SparkUtils/getSparkExecutorId )))

(defn *indexed-rdd
  "rdd - `org.apache.spark.api.java.JavaRDD`

  returns: `<T> org.apache.spark.api.java.JavaPairRDD<java.lang.Integer,T>`"
  ([^org.apache.spark.api.java.JavaRDD rdd]
    (SparkUtils/indexedRDD rdd)))

(defn *write-string-to-file
  "Write a String to a file (on HDFS or local) in UTF-8 format

  path - Path to write to - `java.lang.String`
  to-write - String to write - `java.lang.String`
  sc - Spark context - `org.apache.spark.api.java.JavaSparkContext`

  throws: java.io.IOException"
  ([^java.lang.String path ^java.lang.String to-write ^org.apache.spark.api.java.JavaSparkContext sc]
    (SparkUtils/writeStringToFile path to-write sc)))

(defn *repartition-balance-if-required
  "Repartition a RDD (given the Repartition setting) such that we have approximately
  numPartitions partitions, each of which has objectsPerPartition objects.

  rdd - RDD to repartition - `org.apache.spark.api.java.JavaRDD`
  repartition - Repartitioning setting - `org.deeplearning4j.spark.api.Repartition`
  objects-per-partition - Number of objects we want in each partition - `int`
  num-partitions - Number of partitions to have - `int`

  returns: Repartitioned RDD, or the original RDD if no repartitioning was performed - `<T> org.apache.spark.api.java.JavaRDD<T>`"
  ([^org.apache.spark.api.java.JavaRDD rdd ^org.deeplearning4j.spark.api.Repartition repartition ^Integer objects-per-partition ^Integer num-partitions]
    (SparkUtils/repartitionBalanceIfRequired rdd repartition objects-per-partition num-partitions)))

(defn *repartition-equally
  "rdd - `org.apache.spark.api.java.JavaRDD`
  repartition - `org.deeplearning4j.spark.api.Repartition`
  num-partitions - `int`

  returns: `<T> org.apache.spark.api.java.JavaRDD<T>`"
  ([^org.apache.spark.api.java.JavaRDD rdd ^org.deeplearning4j.spark.api.Repartition repartition ^Integer num-partitions]
    (SparkUtils/repartitionEqually rdd repartition num-partitions)))

(defn *repartition
  "Repartition the specified RDD (or not) using the given Repartition and RepartitionStrategy settings

  rdd - RDD to repartition - `org.apache.spark.api.java.JavaRDD`
  repartition - Setting for when repartiting is to be conducted - `org.deeplearning4j.spark.api.Repartition`
  repartition-strategy - Setting for how repartitioning is to be conducted - `org.deeplearning4j.spark.api.RepartitionStrategy`
  objects-per-partition - Desired number of objects per partition - `int`
  num-partitions - Total number of partitions - `int`

  returns: Repartitioned RDD, or original RDD if no repartitioning was conducted - `<T> org.apache.spark.api.java.JavaRDD<T>`"
  ([^org.apache.spark.api.java.JavaRDD rdd ^org.deeplearning4j.spark.api.Repartition repartition ^org.deeplearning4j.spark.api.RepartitionStrategy repartition-strategy ^Integer objects-per-partition ^Integer num-partitions]
    (SparkUtils/repartition rdd repartition repartition-strategy objects-per-partition num-partitions)))

(defn *repartition-approximate-balance
  "rdd - `org.apache.spark.api.java.JavaRDD`
  repartition - `org.deeplearning4j.spark.api.Repartition`
  num-partitions - `int`

  returns: `<T> org.apache.spark.api.java.JavaRDD<T>`"
  ([^org.apache.spark.api.java.JavaRDD rdd ^org.deeplearning4j.spark.api.Repartition repartition ^Integer num-partitions]
    (SparkUtils/repartitionApproximateBalance rdd repartition num-partitions)))

