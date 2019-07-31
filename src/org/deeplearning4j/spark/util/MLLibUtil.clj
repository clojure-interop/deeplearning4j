(ns org.deeplearning4j.spark.util.MLLibUtil
  "Dl4j <----> MLLib"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.util MLLibUtil]))

(defn *to-classifier-prediction
  "This is for the edge case where
  you have a single output layer
  and need to convert the output layer to
  an index

  vector - the vector to get the classifier prediction for - `org.apache.spark.mllib.linalg.Vector`

  returns: the prediction for the given vector - `double`"
  (^Double [^org.apache.spark.mllib.linalg.Vector vector]
    (MLLibUtil/toClassifierPrediction vector)))

(defn *to-matrix
  "Convert an ndarray to a matrix.
  Note that the matrix will be con

  arr - the array - `org.apache.spark.mllib.linalg.Matrix`

  returns: an mllib vector - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.apache.spark.mllib.linalg.Matrix arr]
    (MLLibUtil/toMatrix arr)))

(defn *to-vector
  "Convert an ndarray to a vector

  arr - the array - `org.apache.spark.mllib.linalg.Vector`

  returns: an mllib vector - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.apache.spark.mllib.linalg.Vector arr]
    (MLLibUtil/toVector arr)))

(defn *from-binary
  "Convert a traditional sc.binaryFiles
  in to something usable for machine learning

  binary-files - the binary files to convert - `org.apache.spark.api.java.JavaPairRDD`
  reader - the reader to use - `org.datavec.api.records.reader.RecordReader`

  returns: the labeled points based on the given rdd - `org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.regression.LabeledPoint>`"
  (^org.apache.spark.api.java.JavaRDD [^org.apache.spark.api.java.JavaPairRDD binary-files ^org.datavec.api.records.reader.RecordReader reader]
    (MLLibUtil/fromBinary binary-files reader)))

(defn *point-of
  "Returns a labeled point of the writables
  where the final item is the point and the rest of the items are
  features

  writables - the writables - `java.util.Collection`

  returns: the labeled point - `org.apache.spark.mllib.regression.LabeledPoint`"
  (^org.apache.spark.mllib.regression.LabeledPoint [^java.util.Collection writables]
    (MLLibUtil/pointOf writables)))

(defn *from-labeled-point
  "Convert an rdd
  of labeled point
  based on the specified batch size
  in to data set

  data - the data to convert - `org.apache.spark.api.java.JavaRDD`
  num-possible-labels - the number of possible labels - `long`
  batch-size - the batch size - `long`

  returns: the new rdd - `org.apache.spark.api.java.JavaRDD<org.nd4j.linalg.dataset.DataSet>`"
  (^org.apache.spark.api.java.JavaRDD [^org.apache.spark.api.java.JavaRDD data ^Long num-possible-labels ^Long batch-size]
    (MLLibUtil/fromLabeledPoint data num-possible-labels batch-size))
  (^org.apache.spark.api.java.JavaRDD [^org.apache.spark.api.java.JavaRDD data ^Long num-possible-labels]
    (MLLibUtil/fromLabeledPoint data num-possible-labels)))

(defn *from-continuous-labeled-point
  "Converts a continuous JavaRDD LabeledPoint to a JavaRDD DataSet.

  data - JavaRdd LabeledPoint - `org.apache.spark.api.java.JavaRDD`
  pre-cache - boolean pre-cache rdd before operation - `boolean`

  returns: `org.apache.spark.api.java.JavaRDD<org.nd4j.linalg.dataset.DataSet>`"
  (^org.apache.spark.api.java.JavaRDD [^org.apache.spark.api.java.JavaRDD data ^Boolean pre-cache]
    (MLLibUtil/fromContinuousLabeledPoint data pre-cache))
  (^org.apache.spark.api.java.JavaRDD [^org.apache.spark.api.java.JavaRDD data]
    (MLLibUtil/fromContinuousLabeledPoint data)))

(defn *from-data-set
  "Convert an rdd of data set in to labeled point.

  data - the dataset to convert - `org.apache.spark.api.java.JavaRDD`
  pre-cache - boolean pre-cache rdd before operation - `boolean`

  returns: an rdd of labeled point - `org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.regression.LabeledPoint>`"
  (^org.apache.spark.api.java.JavaRDD [^org.apache.spark.api.java.JavaRDD data ^Boolean pre-cache]
    (MLLibUtil/fromDataSet data pre-cache))
  (^org.apache.spark.api.java.JavaRDD [^org.apache.spark.api.java.JavaRDD data]
    (MLLibUtil/fromDataSet data)))

