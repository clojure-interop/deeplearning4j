(ns org.datavec.spark.transform.SparkTransformExecutor
  "Execute a datavec
 transform process
 on spark rdds."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform SparkTransformExecutor]))

(defn ->spark-transform-executor
  "Constructor.

  Deprecated. Use static methods instead of instance methods on SparkTransformExecutor"
  (^SparkTransformExecutor []
    (new SparkTransformExecutor )))

(def *-log-error-property
  "Static Constant.

  type: java.lang.String"
  SparkTransformExecutor/LOG_ERROR_PROPERTY)

(defn *execute
  "Execute the specified TransformProcess with the given input data
  Note: this method can only be used if the TransformProcess returns non-sequence data. For TransformProcesses
  that return a sequence, use executeToSequence(JavaRDD, TransformProcess)

  input-writables - Input data to process - `org.apache.spark.api.java.JavaRDD`
  transform-process - TransformProcess to execute - `org.datavec.api.transform.TransformProcess`

  returns: Processed data - `org.apache.spark.api.java.JavaRDD<java.util.List<org.datavec.api.writable.Writable>>`"
  (^org.apache.spark.api.java.JavaRDD [^org.apache.spark.api.java.JavaRDD input-writables ^org.datavec.api.transform.TransformProcess transform-process]
    (SparkTransformExecutor/execute input-writables transform-process)))

(defn *execute-to-sequence
  "Execute the specified TransformProcess with the given input data
  Note: this method can only be used if the TransformProcess
  starts with non-sequential data,
  but returns sequence
  data (after grouping or converting to a sequence as one of the steps)

  input-writables - Input data to process - `org.apache.spark.api.java.JavaRDD`
  transform-process - TransformProcess to execute - `org.datavec.api.transform.TransformProcess`

  returns: Processed (sequence) data - `org.apache.spark.api.java.JavaRDD<java.util.List<java.util.List<org.datavec.api.writable.Writable>>>`"
  (^org.apache.spark.api.java.JavaRDD [^org.apache.spark.api.java.JavaRDD input-writables ^org.datavec.api.transform.TransformProcess transform-process]
    (SparkTransformExecutor/executeToSequence input-writables transform-process)))

(defn *execute-sequence-to-separate
  "Execute the specified TransformProcess with the given sequence input data
  Note: this method can only be used if the TransformProcess starts with sequence data, but returns non-sequential
  data (after reducing or converting sequential data to individual examples)

  input-sequence - Input sequence data to process - `org.apache.spark.api.java.JavaRDD`
  transform-process - TransformProcess to execute - `org.datavec.api.transform.TransformProcess`

  returns: Processed (non-sequential) data - `org.apache.spark.api.java.JavaRDD<java.util.List<org.datavec.api.writable.Writable>>`"
  (^org.apache.spark.api.java.JavaRDD [^org.apache.spark.api.java.JavaRDD input-sequence ^org.datavec.api.transform.TransformProcess transform-process]
    (SparkTransformExecutor/executeSequenceToSeparate input-sequence transform-process)))

(defn *execute-sequence-to-sequence
  "Execute the specified TransformProcess with the given sequence input data
  Note: this method can only be used if the TransformProcess starts with sequence data, and also returns sequence data

  input-sequence - Input sequence data to process - `org.apache.spark.api.java.JavaRDD`
  transform-process - TransformProcess to execute - `org.datavec.api.transform.TransformProcess`

  returns: Processed (non-sequential) data - `org.apache.spark.api.java.JavaRDD<java.util.List<java.util.List<org.datavec.api.writable.Writable>>>`"
  (^org.apache.spark.api.java.JavaRDD [^org.apache.spark.api.java.JavaRDD input-sequence ^org.datavec.api.transform.TransformProcess transform-process]
    (SparkTransformExecutor/executeSequenceToSequence input-sequence transform-process)))

(defn *try-catch?
  "Returns true if the executor
  is in try catch mode.

  returns: `boolean`"
  (^Boolean []
    (SparkTransformExecutor/isTryCatch )))

(defn *execute-join
  "Execute a join on the specified data

  join - Join to execute - `org.datavec.api.transform.join.Join`
  left - Left data for join - `org.apache.spark.api.java.JavaRDD`
  right - Right data for join - `org.apache.spark.api.java.JavaRDD`

  returns: Joined data - `org.apache.spark.api.java.JavaRDD<java.util.List<org.datavec.api.writable.Writable>>`"
  (^org.apache.spark.api.java.JavaRDD [^org.datavec.api.transform.join.Join join ^org.apache.spark.api.java.JavaRDD left ^org.apache.spark.api.java.JavaRDD right]
    (SparkTransformExecutor/executeJoin join left right)))

