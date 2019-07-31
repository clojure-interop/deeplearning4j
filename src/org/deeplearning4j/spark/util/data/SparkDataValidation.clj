(ns org.deeplearning4j.spark.util.data.SparkDataValidation
  "Utilities for validating DataSets and MultiDataSets saved (usually) in a HDFS directory."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.util.data SparkDataValidation]))

(defn *validate-data-sets
  "Validate DataSet objects saved to the specified directory on HDFS by attempting to load them and checking their
  contents. Assumes DataSets were saved using DataSet.save(OutputStream).
  This method (optionally) additionally validates the arrays using the specified shapes for the features and labels.
  Note: this method will also consider all files in subdirectories (i.e., is recursive).

  sc - Spark context - `org.apache.spark.api.java.JavaSparkContext`
  path - HDFS path of the directory containing the saved DataSet objects - `java.lang.String`
  features-shape - May be null. If non-null: feature arrays must match the specified shape, for all values withshape > 0. For example, if featuresShape = {-1,10} then the features must be rank 2,can have any size for the first dimension, but must have size 10 for the second dimension. - `int[]`
  labels-shape - As per featuresShape, but for the labels instead - `int[]`

  returns: Results of the validation - `org.deeplearning4j.spark.util.data.ValidationResult`"
  (^org.deeplearning4j.spark.util.data.ValidationResult [^org.apache.spark.api.java.JavaSparkContext sc ^java.lang.String path features-shape labels-shape]
    (SparkDataValidation/validateDataSets sc path features-shape labels-shape))
  (^org.deeplearning4j.spark.util.data.ValidationResult [^org.apache.spark.api.java.JavaSparkContext sc ^java.lang.String path]
    (SparkDataValidation/validateDataSets sc path)))

(defn *delete-invalid-data-sets
  "Validate DataSet objects - and delete any invalid DataSets - that have been previously saved to the
  specified directory on HDFS by attempting to load them and checking their contents. Assumes DataSets were saved
  using DataSet.save(OutputStream).
  This method (optionally) additionally validates the arrays using the specified shapes for the features and labels.
  Note: this method will also consider all files in subdirectories (i.e., is recursive).

  sc - Spark context - `org.apache.spark.api.java.JavaSparkContext`
  path - HDFS path of the directory containing the saved DataSet objects - `java.lang.String`
  features-shape - May be null. If non-null: feature arrays must match the specified shape, for all values withshape > 0. For example, if featuresShape = {-1,10} then the features must be rank 2,can have any size for the first dimension, but must have size 10 for the second dimension. - `int[]`
  labels-shape - As per featuresShape, but for the labels instead - `int[]`

  returns: Results of the validation - `org.deeplearning4j.spark.util.data.ValidationResult`"
  (^org.deeplearning4j.spark.util.data.ValidationResult [^org.apache.spark.api.java.JavaSparkContext sc ^java.lang.String path features-shape labels-shape]
    (SparkDataValidation/deleteInvalidDataSets sc path features-shape labels-shape))
  (^org.deeplearning4j.spark.util.data.ValidationResult [^org.apache.spark.api.java.JavaSparkContext sc ^java.lang.String path]
    (SparkDataValidation/deleteInvalidDataSets sc path)))

(defn *validate-multi-data-sets
  "Validate MultiDataSet objects saved to the specified directory on HDFS by attempting to load them and checking their
  contents. Assumes MultiDataSets were saved using MultiDataSet.save(OutputStream).
  This method additionally validates that the expected number of feature/labels arrays are present in all MultiDataSet
  objects
  Note: this method will also consider all files in subdirectories (i.e., is recursive).

  sc - Spark context - `org.apache.spark.api.java.JavaSparkContext`
  path - HDFS path of the directory containing the saved DataSet objects - `java.lang.String`
  num-feature-arrays - Number of feature arrays that are expected for the MultiDataSet (set -1 to not check) - `int`
  num-label-arrays - Number of labels arrays that are expected for the MultiDataSet (set -1 to not check) - `int`

  returns: Results of the validation - `org.deeplearning4j.spark.util.data.ValidationResult`"
  (^org.deeplearning4j.spark.util.data.ValidationResult [^org.apache.spark.api.java.JavaSparkContext sc ^java.lang.String path ^Integer num-feature-arrays ^Integer num-label-arrays]
    (SparkDataValidation/validateMultiDataSets sc path num-feature-arrays num-label-arrays))
  (^org.deeplearning4j.spark.util.data.ValidationResult [^org.apache.spark.api.java.JavaSparkContext sc ^java.lang.String path]
    (SparkDataValidation/validateMultiDataSets sc path)))

(defn *delete-invalid-multi-data-sets
  "Validate MultiDataSet objects - and delete any invalid MultiDataSets - that have been previously saved
  to the specified directory on HDFS by attempting to load them and checking their contents. Assumes MultiDataSets
  were saved using MultiDataSet.save(OutputStream).
  This method (optionally) additionally validates the arrays using the specified shapes for the features and labels,
  Note: this method will also consider all files in subdirectories (i.e., is recursive).

  sc - Spark context - `org.apache.spark.api.java.JavaSparkContext`
  path - HDFS path of the directory containing the saved DataSet objects - `java.lang.String`
  features-shape - May be null. If non-null: feature arrays must match the specified shapes, for all values withshape > 0. For example, if featuresShape = {{-1,10}} then there must be 1 features array,features array 0 must be rank 2, can have any size for the first dimension, but must havesize 10 for the second dimension. - `java.util.List`
  labels-shape - As per featuresShape, but for the labels instead - `java.util.List`

  returns: Results of the validation - `org.deeplearning4j.spark.util.data.ValidationResult`"
  (^org.deeplearning4j.spark.util.data.ValidationResult [^org.apache.spark.api.java.JavaSparkContext sc ^java.lang.String path ^java.util.List features-shape ^java.util.List labels-shape]
    (SparkDataValidation/deleteInvalidMultiDataSets sc path features-shape labels-shape))
  (^org.deeplearning4j.spark.util.data.ValidationResult [^org.apache.spark.api.java.JavaSparkContext sc ^java.lang.String path]
    (SparkDataValidation/deleteInvalidMultiDataSets sc path)))

