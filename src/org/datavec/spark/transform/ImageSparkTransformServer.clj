(ns org.datavec.spark.transform.ImageSparkTransformServer
  "Created by kepricon on 17. 6. 19."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform ImageSparkTransformServer]))

(defn ->image-spark-transform-server
  "Constructor."
  (^ImageSparkTransformServer []
    (new ImageSparkTransformServer )))

(defn *main
  "args - `java.lang.String[]`

  throws: java.lang.Exception"
  ([args]
    (ImageSparkTransformServer/main args)))

(defn transform-array-incremental
  "single-csv-record - `org.datavec.spark.transform.model.SingleCSVRecord`

  returns: `org.datavec.spark.transform.model.Base64NDArrayBody`"
  (^org.datavec.spark.transform.model.Base64NDArrayBody [^ImageSparkTransformServer this ^org.datavec.spark.transform.model.SingleCSVRecord single-csv-record]
    (-> this (.transformArrayIncremental single-csv-record))))

(defn get-csv-transform-process
  "returns: `org.datavec.api.transform.TransformProcess`"
  (^org.datavec.api.transform.TransformProcess [^ImageSparkTransformServer this]
    (-> this (.getCSVTransformProcess))))

(defn transform-sequence
  "batch-csv-record - `org.datavec.spark.transform.model.SequenceBatchCSVRecord`

  returns: `org.datavec.spark.transform.model.SequenceBatchCSVRecord`"
  (^org.datavec.spark.transform.model.SequenceBatchCSVRecord [^ImageSparkTransformServer this ^org.datavec.spark.transform.model.SequenceBatchCSVRecord batch-csv-record]
    (-> this (.transformSequence batch-csv-record))))

(defn set-csv-transform-process
  "transform-process - `org.datavec.api.transform.TransformProcess`"
  ([^ImageSparkTransformServer this ^org.datavec.api.transform.TransformProcess transform-process]
    (-> this (.setCSVTransformProcess transform-process))))

(defn transform-sequence-array-incremental
  "single-csv-record - `org.datavec.spark.transform.model.BatchCSVRecord`

  returns: `org.datavec.spark.transform.model.Base64NDArrayBody`"
  (^org.datavec.spark.transform.model.Base64NDArrayBody [^ImageSparkTransformServer this ^org.datavec.spark.transform.model.BatchCSVRecord single-csv-record]
    (-> this (.transformSequenceArrayIncremental single-csv-record))))

(defn transform
  "batch-csv-record - `org.datavec.spark.transform.model.SequenceBatchCSVRecord`

  returns: `org.datavec.spark.transform.model.SequenceBatchCSVRecord`"
  (^org.datavec.spark.transform.model.SequenceBatchCSVRecord [^ImageSparkTransformServer this ^org.datavec.spark.transform.model.SequenceBatchCSVRecord batch-csv-record]
    (-> this (.transform batch-csv-record))))

(defn transform-incremental
  "single-csv-record - `org.datavec.spark.transform.model.SingleCSVRecord`

  returns: `org.datavec.spark.transform.model.SingleCSVRecord`"
  (^org.datavec.spark.transform.model.SingleCSVRecord [^ImageSparkTransformServer this ^org.datavec.spark.transform.model.SingleCSVRecord single-csv-record]
    (-> this (.transformIncremental single-csv-record))))

(defn transform-sequence-array
  "batch-csv-record - `org.datavec.spark.transform.model.SequenceBatchCSVRecord`

  returns: `org.datavec.spark.transform.model.Base64NDArrayBody`"
  (^org.datavec.spark.transform.model.Base64NDArrayBody [^ImageSparkTransformServer this ^org.datavec.spark.transform.model.SequenceBatchCSVRecord batch-csv-record]
    (-> this (.transformSequenceArray batch-csv-record))))

(defn set-image-transform-process
  "image-transform-process - `org.datavec.image.transform.ImageTransformProcess`"
  ([^ImageSparkTransformServer this ^org.datavec.image.transform.ImageTransformProcess image-transform-process]
    (-> this (.setImageTransformProcess image-transform-process))))

(defn transform-array
  "batch-csv-record - `org.datavec.spark.transform.model.BatchCSVRecord`

  returns: `org.datavec.spark.transform.model.Base64NDArrayBody`"
  (^org.datavec.spark.transform.model.Base64NDArrayBody [^ImageSparkTransformServer this ^org.datavec.spark.transform.model.BatchCSVRecord batch-csv-record]
    (-> this (.transformArray batch-csv-record))))

(defn get-image-transform-process
  "returns: `org.datavec.image.transform.ImageTransformProcess`"
  (^org.datavec.image.transform.ImageTransformProcess [^ImageSparkTransformServer this]
    (-> this (.getImageTransformProcess))))

(defn run-main
  "args - `java.lang.String[]`

  throws: java.lang.Exception"
  ([^ImageSparkTransformServer this args]
    (-> this (.runMain args))))

(defn transform-incremental-array
  "record - `org.datavec.spark.transform.model.SingleImageRecord`

  returns: `org.datavec.spark.transform.model.Base64NDArrayBody`

  throws: java.io.IOException"
  (^org.datavec.spark.transform.model.Base64NDArrayBody [^ImageSparkTransformServer this ^org.datavec.spark.transform.model.SingleImageRecord record]
    (-> this (.transformIncrementalArray record))))

(defn transform-sequence-incremental
  "transform - `org.datavec.spark.transform.model.BatchCSVRecord`

  returns: `org.datavec.spark.transform.model.SequenceBatchCSVRecord`"
  (^org.datavec.spark.transform.model.SequenceBatchCSVRecord [^ImageSparkTransformServer this ^org.datavec.spark.transform.model.BatchCSVRecord transform]
    (-> this (.transformSequenceIncremental transform))))

