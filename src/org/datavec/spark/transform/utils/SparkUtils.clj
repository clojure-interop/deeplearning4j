(ns org.datavec.spark.transform.utils.SparkUtils
  "Created by Alex on 7/03/2016."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.utils SparkUtils]))

(defn ->spark-utils
  "Constructor."
  (^SparkUtils []
    (new SparkUtils )))

(defn *write-object-to-file
  "Write an object to HDFS (or local) using default Java object serialization

  path - Path to write the object to - `java.lang.String`
  to-write - Object to write - `java.lang.Object`
  sc - Spark context - `org.apache.spark.api.java.JavaSparkContext`

  throws: java.io.IOException"
  ([^java.lang.String path ^java.lang.Object to-write ^org.apache.spark.api.java.JavaSparkContext sc]
    (SparkUtils/writeObjectToFile path to-write sc)))

(defn *register-kryo-classes
  "Register the DataVec writable classes for Kryo

  conf - `org.apache.spark.SparkConf`"
  ([^org.apache.spark.SparkConf conf]
    (SparkUtils/registerKryoClasses conf)))

(defn *read-object-from-file
  "Read an object from HDFS (or local) using default Java object serialization

  path - File to read - `java.lang.String`
  type - Class of the object to read - `java.lang.Class`
  sc - Spark context - `org.apache.spark.api.java.JavaSparkContext`

  returns: `<T> T`

  throws: java.io.IOException"
  ([^java.lang.String path ^java.lang.Class type ^org.apache.spark.api.java.JavaSparkContext sc]
    (SparkUtils/readObjectFromFile path type sc)))

(defn *write-writables-to-file
  "Wlite a set of writables (or, sequence) to HDFS (or, locally).

  output-path - Path to write the outptu - `java.lang.String`
  delim - Delimiter - `java.lang.String`
  writables - data to write - `java.util.List`
  sc - Spark context - `org.apache.spark.api.java.JavaSparkContext`

  throws: java.io.IOException"
  ([^java.lang.String output-path ^java.lang.String delim ^java.util.List writables ^org.apache.spark.api.java.JavaSparkContext sc]
    (SparkUtils/writeWritablesToFile output-path delim writables sc)))

(defn *split-data
  "split-strategy - `org.datavec.api.transform.split.SplitStrategy`
  data - `org.apache.spark.api.java.JavaRDD`
  seed - `long`

  returns: `<T> java.util.List<org.apache.spark.api.java.JavaRDD<T>>`"
  ([^org.datavec.api.transform.split.SplitStrategy split-strategy ^org.apache.spark.api.java.JavaRDD data ^Long seed]
    (SparkUtils/splitData split-strategy data seed)))

(defn *read-string-from-file
  "Read a UTF-8 format String from HDFS (or local)

  path - Path to write the string - `java.lang.String`
  sc - Spark context - `org.apache.spark.api.java.JavaSparkContext`

  returns: `java.lang.String`

  throws: java.io.IOException"
  (^java.lang.String [^java.lang.String path ^org.apache.spark.api.java.JavaSparkContext sc]
    (SparkUtils/readStringFromFile path sc)))

(defn *write-string-to-file
  "Write a String to a file (on HDFS or local) in UTF-8 format

  path - Path to write to - `java.lang.String`
  to-write - String to write - `java.lang.String`
  sc - Spark context - `org.apache.spark.api.java.JavaSparkContext`

  throws: java.io.IOException"
  ([^java.lang.String path ^java.lang.String to-write ^org.apache.spark.api.java.JavaSparkContext sc]
    (SparkUtils/writeStringToFile path to-write sc)))

(defn *get-compression-code-class
  "compression-codec-class - `java.lang.String`

  returns: `java.lang.Class<? extends org.apache.hadoop.io.compress.CompressionCodec>`"
  ([^java.lang.String compression-codec-class]
    (SparkUtils/getCompressionCodeClass compression-codec-class)))

(defn *write-schema
  "Write a schema to a HDFS (or, local) file in a human-readable format

  output-path - Output path to write to - `java.lang.String`
  schema - Schema to write - `org.datavec.api.transform.schema.Schema`
  sc - Spark context - `org.apache.spark.api.java.JavaSparkContext`

  throws: java.io.IOException"
  ([^java.lang.String output-path ^org.datavec.api.transform.schema.Schema schema ^org.apache.spark.api.java.JavaSparkContext sc]
    (SparkUtils/writeSchema output-path schema sc)))

(defn *write-analysis-html-to-file
  "Write a DataAnalysis to HDFS (or locally) as a HTML file

  output-path - Output path - `java.lang.String`
  data-analysis - Analysis to generate HTML file for - `org.datavec.api.transform.analysis.DataAnalysis`
  sc - Spark context - `org.apache.spark.api.java.JavaSparkContext`"
  ([^java.lang.String output-path ^org.datavec.api.transform.analysis.DataAnalysis data-analysis ^org.apache.spark.api.java.JavaSparkContext sc]
    (SparkUtils/writeAnalysisHTMLToFile output-path data-analysis sc)))

