(ns org.datavec.spark.storage.SparkStorageUtils
  "Utility methods for saving and restoring Writable objects from Spark RDD is to Hadoop formats"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.storage SparkStorageUtils]))

(def *-map-file-index-interval-key
  "Static Constant.

  Configuration key for the map file interval.
  This is defined in MapFile.Writer.INDEX_INTERVAL but unfortunately that field is private, hence cannot be
  referenced here.

  type: java.lang.String"
  SparkStorageUtils/MAP_FILE_INDEX_INTERVAL_KEY)

(def *-default-map-file-interval
  "Static Constant.

  By default, a map file's index stores only a fraction of the keys. This is good, in that it reduces memory
  requirements (all keys are loaded into memory); however, it has a cost in terms of time taken for look up.
  Instead of using the default interval of 128, Will use a default interval of 1: given that the keys are LongWritable
  objects, the marginal increase in space is more than outweighed by the increased performance for use cases such as
  MapFileRecordReader and MapFileSequenceRecordReader

  type: int"
  SparkStorageUtils/DEFAULT_MAP_FILE_INTERVAL)

(defn *save-sequence-file
  "Save a JavaRDD<List<Writable>> to a Hadoop SequenceFile. Each record is given
  a unique (but noncontiguous) LongWritable key, and values are stored as RecordWritable instances.

  Use restoreSequenceFile(String, JavaSparkContext) to restore values saved with this method.

  path - Path to save the sequence file - `java.lang.String`
  rdd - RDD to save - `org.apache.spark.api.java.JavaRDD`
  max-output-files - Nullable. If non-null: first coalesce the RDD to the specified size (number of partitions)to limit the maximum number of output sequence files - `java.lang.Integer`"
  ([^java.lang.String path ^org.apache.spark.api.java.JavaRDD rdd ^java.lang.Integer max-output-files]
    (SparkStorageUtils/saveSequenceFile path rdd max-output-files))
  ([^java.lang.String path ^org.apache.spark.api.java.JavaRDD rdd]
    (SparkStorageUtils/saveSequenceFile path rdd)))

(defn *restore-sequence-file
  "Restore a JavaRDD<List<Writable>> previously saved with saveSequenceFile(String, JavaRDD)

  path - Path of the sequence file - `java.lang.String`
  sc - Spark context - `org.apache.spark.api.java.JavaSparkContext`

  returns: The restored RDD - `org.apache.spark.api.java.JavaRDD<java.util.List<org.datavec.api.writable.Writable>>`"
  (^org.apache.spark.api.java.JavaRDD [^java.lang.String path ^org.apache.spark.api.java.JavaSparkContext sc]
    (SparkStorageUtils/restoreSequenceFile path sc)))

(defn *save-sequence-file-sequences
  "Save a JavaRDD<List<List<Writable>>> to a Hadoop SequenceFile. Each record
  is given a unique (but noncontiguous) LongWritable key, and values are stored as SequenceRecordWritable instances.

  Use restoreSequenceFileSequences(String, JavaSparkContext) to restore values saved with this method.

  path - Path to save the sequence file - `java.lang.String`
  rdd - RDD to save - `org.apache.spark.api.java.JavaRDD`
  max-output-files - Nullable. If non-null: first coalesce the RDD to the specified size (number of partitions)to limit the maximum number of output sequence files - `java.lang.Integer`"
  ([^java.lang.String path ^org.apache.spark.api.java.JavaRDD rdd ^java.lang.Integer max-output-files]
    (SparkStorageUtils/saveSequenceFileSequences path rdd max-output-files))
  ([^java.lang.String path ^org.apache.spark.api.java.JavaRDD rdd]
    (SparkStorageUtils/saveSequenceFileSequences path rdd)))

(defn *restore-sequence-file-sequences
  "Restore a JavaRDD<List<List<Writable>> previously saved with saveSequenceFileSequences(String, JavaRDD)

  path - Path of the sequence file - `java.lang.String`
  sc - Spark context - `org.apache.spark.api.java.JavaSparkContext`

  returns: The restored RDD - `org.apache.spark.api.java.JavaRDD<java.util.List<java.util.List<org.datavec.api.writable.Writable>>>`"
  (^org.apache.spark.api.java.JavaRDD [^java.lang.String path ^org.apache.spark.api.java.JavaSparkContext sc]
    (SparkStorageUtils/restoreSequenceFileSequences path sc)))

(defn *save-map-file
  "Save a JavaRDD<List<Writable>> to a Hadoop MapFile. Each record is
  given a unique and contiguous LongWritable key, and values are stored as
  RecordWritable instances.
  Note: If contiguous keys are not required, using a sequence file instead is preferable from a performance
  point of view. Contiguous keys are often only required for non-Spark use cases, such as with
  MapFileRecordReader

  Use restoreMapFileSequences(String, JavaSparkContext) to restore values saved with this method.

  path - Path to save the MapFile - `java.lang.String`
  rdd - RDD to save - `org.apache.spark.api.java.JavaRDD`
  interval - The map file index interval to use. Smaller values may result in the faster look up, at theexpense of more memory/disk use. However, usually the increase is relatively minor, due tokeys being stored as LongWritable objects - `int`
  max-output-files - Nullable. If non-null: first coalesce the RDD to the specified size (number of partitions)to limit the maximum number of output map files - `java.lang.Integer`"
  ([^java.lang.String path ^org.apache.spark.api.java.JavaRDD rdd ^Integer interval ^java.lang.Integer max-output-files]
    (SparkStorageUtils/saveMapFile path rdd interval max-output-files))
  ([^java.lang.String path ^org.apache.spark.api.java.JavaRDD rdd]
    (SparkStorageUtils/saveMapFile path rdd)))

(defn *restore-map-file
  "Restore a JavaPairRDD<Long,List<Writable>> previously saved with saveMapFile(String, JavaRDD)}
  Note that if the keys are not required, simply use restoreMapFile(...).values()

  path - Path of the MapFile - `java.lang.String`
  sc - Spark context - `org.apache.spark.api.java.JavaSparkContext`

  returns: The restored RDD, with their unique indices as the key - `org.apache.spark.api.java.JavaPairRDD<java.lang.Long,java.util.List<org.datavec.api.writable.Writable>>`"
  (^org.apache.spark.api.java.JavaPairRDD [^java.lang.String path ^org.apache.spark.api.java.JavaSparkContext sc]
    (SparkStorageUtils/restoreMapFile path sc)))

(defn *save-map-file-sequences
  "Save a JavaRDD<List<List<Writable>>> to a Hadoop MapFile. Each record is
  given a unique and contiguous LongWritable key, and values are stored as
  SequenceRecordWritable instances.
  Note: If contiguous keys are not required, using a sequence file instead is preferable from a performance
  point of view. Contiguous keys are often only required for non-Spark use cases, such as with
  MapFileSequenceRecordReader

  Use restoreMapFileSequences(String, JavaSparkContext) to restore values saved with this method.

  path - Path to save the MapFile - `java.lang.String`
  rdd - RDD to save - `org.apache.spark.api.java.JavaRDD`
  interval - The map file index interval to use. Smaller values may result in the faster look up, at theexpense of more memory/disk use. However, usually the increase is relatively minor, due tokeys being stored as LongWritable objects - `int`
  max-output-files - `java.lang.Integer`"
  ([^java.lang.String path ^org.apache.spark.api.java.JavaRDD rdd ^Integer interval ^java.lang.Integer max-output-files]
    (SparkStorageUtils/saveMapFileSequences path rdd interval max-output-files))
  ([^java.lang.String path ^org.apache.spark.api.java.JavaRDD rdd]
    (SparkStorageUtils/saveMapFileSequences path rdd)))

(defn *restore-map-file-sequences
  "Restore a JavaPairRDD<Long,List<List<Writable>>> previously saved with saveMapFile(String, JavaRDD)}
  Note that if the keys are not required, simply use restoreMapFileSequences(...).values()

  path - Path of the MapFile - `java.lang.String`
  sc - Spark context - `org.apache.spark.api.java.JavaSparkContext`

  returns: The restored RDD, with their unique indices as the key - `org.apache.spark.api.java.JavaPairRDD<java.lang.Long,java.util.List<java.util.List<org.datavec.api.writable.Writable>>>`"
  (^org.apache.spark.api.java.JavaPairRDD [^java.lang.String path ^org.apache.spark.api.java.JavaSparkContext sc]
    (SparkStorageUtils/restoreMapFileSequences path sc)))

