(ns org.datavec.spark.transform.CSVSparkTransformServer
  "A rest server for using an
 TransformProcess based on simple
 csv values and a schema via REST.

 The input values are an SingleCSVRecord
 which (based on the input schema) will automatically
 have their values transformed."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform CSVSparkTransformServer]))

(defn ->csv-spark-transform-server
  "Constructor."
  (^CSVSparkTransformServer []
    (new CSVSparkTransformServer )))

(defn *main
  "args - `java.lang.String[]`

  throws: java.lang.Exception"
  ([args]
    (CSVSparkTransformServer/main args)))

(defn transform-array-incremental
  "single-csv-record - `org.datavec.spark.transform.model.SingleCSVRecord`

  returns: `org.datavec.spark.transform.model.Base64NDArrayBody`"
  (^org.datavec.spark.transform.model.Base64NDArrayBody [^CSVSparkTransformServer this ^org.datavec.spark.transform.model.SingleCSVRecord single-csv-record]
    (-> this (.transformArrayIncremental single-csv-record))))

(defn get-csv-transform-process
  "returns: `org.datavec.api.transform.TransformProcess`"
  (^org.datavec.api.transform.TransformProcess [^CSVSparkTransformServer this]
    (-> this (.getCSVTransformProcess))))

(defn transform-sequence
  "batch-csv-record - `org.datavec.spark.transform.model.SequenceBatchCSVRecord`

  returns: `org.datavec.spark.transform.model.SequenceBatchCSVRecord`"
  (^org.datavec.spark.transform.model.SequenceBatchCSVRecord [^CSVSparkTransformServer this ^org.datavec.spark.transform.model.SequenceBatchCSVRecord batch-csv-record]
    (-> this (.transformSequence batch-csv-record))))

(defn set-csv-transform-process
  "transform-process - `org.datavec.api.transform.TransformProcess`"
  ([^CSVSparkTransformServer this ^org.datavec.api.transform.TransformProcess transform-process]
    (-> this (.setCSVTransformProcess transform-process))))

(defn transform-sequence-array-incremental
  "single-csv-record - `org.datavec.spark.transform.model.BatchCSVRecord`

  returns: `org.datavec.spark.transform.model.Base64NDArrayBody`"
  (^org.datavec.spark.transform.model.Base64NDArrayBody [^CSVSparkTransformServer this ^org.datavec.spark.transform.model.BatchCSVRecord single-csv-record]
    (-> this (.transformSequenceArrayIncremental single-csv-record))))

(defn transform
  "batch-csv-record - `org.datavec.spark.transform.model.SequenceBatchCSVRecord`

  returns: `org.datavec.spark.transform.model.SequenceBatchCSVRecord`"
  (^org.datavec.spark.transform.model.SequenceBatchCSVRecord [^CSVSparkTransformServer this ^org.datavec.spark.transform.model.SequenceBatchCSVRecord batch-csv-record]
    (-> this (.transform batch-csv-record))))

(defn transform-incremental
  "transform - `org.datavec.spark.transform.model.SingleCSVRecord`

  returns: `org.datavec.spark.transform.model.SingleCSVRecord`"
  (^org.datavec.spark.transform.model.SingleCSVRecord [^CSVSparkTransformServer this ^org.datavec.spark.transform.model.SingleCSVRecord transform]
    (-> this (.transformIncremental transform))))

(defn transform-sequence-array
  "batch-csv-record - `org.datavec.spark.transform.model.SequenceBatchCSVRecord`

  returns: `org.datavec.spark.transform.model.Base64NDArrayBody`"
  (^org.datavec.spark.transform.model.Base64NDArrayBody [^CSVSparkTransformServer this ^org.datavec.spark.transform.model.SequenceBatchCSVRecord batch-csv-record]
    (-> this (.transformSequenceArray batch-csv-record))))

(defn set-image-transform-process
  "image-transform-process - `org.datavec.image.transform.ImageTransformProcess`"
  ([^CSVSparkTransformServer this ^org.datavec.image.transform.ImageTransformProcess image-transform-process]
    (-> this (.setImageTransformProcess image-transform-process))))

(defn transform-array
  "batch-csv-record - `org.datavec.spark.transform.model.BatchCSVRecord`

  returns: `org.datavec.spark.transform.model.Base64NDArrayBody`"
  (^org.datavec.spark.transform.model.Base64NDArrayBody [^CSVSparkTransformServer this ^org.datavec.spark.transform.model.BatchCSVRecord batch-csv-record]
    (-> this (.transformArray batch-csv-record))))

(defn get-image-transform-process
  "returns: `org.datavec.image.transform.ImageTransformProcess`"
  (^org.datavec.image.transform.ImageTransformProcess [^CSVSparkTransformServer this]
    (-> this (.getImageTransformProcess))))

(defn run-main
  "args - `java.lang.String[]`

  throws: java.lang.Exception"
  ([^CSVSparkTransformServer this args]
    (-> this (.runMain args))))

(defn transform-incremental-array
  "single-image-record - `org.datavec.spark.transform.model.SingleImageRecord`

  returns: `org.datavec.spark.transform.model.Base64NDArrayBody`

  throws: java.io.IOException"
  (^org.datavec.spark.transform.model.Base64NDArrayBody [^CSVSparkTransformServer this ^org.datavec.spark.transform.model.SingleImageRecord single-image-record]
    (-> this (.transformIncrementalArray single-image-record))))

(defn transform-sequence-incremental
  "transform - `org.datavec.spark.transform.model.BatchCSVRecord`

  returns: `org.datavec.spark.transform.model.SequenceBatchCSVRecord`"
  (^org.datavec.spark.transform.model.SequenceBatchCSVRecord [^CSVSparkTransformServer this ^org.datavec.spark.transform.model.BatchCSVRecord transform]
    (-> this (.transformSequenceIncremental transform))))

