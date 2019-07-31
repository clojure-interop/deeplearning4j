(ns org.datavec.spark.transform.CSVSparkTransform
  "CSVSpark Transform runs
 the actual TransformProcess"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform CSVSparkTransform]))

(defn ->csv-spark-transform
  "Constructor."
  (^CSVSparkTransform []
    (new CSVSparkTransform )))

(defn to-array
  "Convert a raw record via
  the TransformProcess
  to a base 64ed ndarray

  batch - the record to convert - `org.datavec.spark.transform.model.BatchCSVRecord`

  returns: teh base 64ed ndarray - `org.datavec.spark.transform.model.Base64NDArrayBody`

  throws: java.io.IOException"
  (^org.datavec.spark.transform.model.Base64NDArrayBody [^CSVSparkTransform this ^org.datavec.spark.transform.model.BatchCSVRecord batch]
    (-> this (.toArray batch))))

(defn transform
  "Runs the transform process

  batch - the record to transform - `org.datavec.spark.transform.model.BatchCSVRecord`

  returns: the transformed record - `org.datavec.spark.transform.model.BatchCSVRecord`"
  (^org.datavec.spark.transform.model.BatchCSVRecord [^CSVSparkTransform this ^org.datavec.spark.transform.model.BatchCSVRecord batch]
    (-> this (.transform batch))))

(defn transform-sequence-incremental
  "transform - `org.datavec.spark.transform.model.BatchCSVRecord`

  returns: `org.datavec.spark.transform.model.SequenceBatchCSVRecord`"
  (^org.datavec.spark.transform.model.SequenceBatchCSVRecord [^CSVSparkTransform this ^org.datavec.spark.transform.model.BatchCSVRecord transform]
    (-> this (.transformSequenceIncremental transform))))

(defn transform-sequence
  "batch-csv-record-sequence - `org.datavec.spark.transform.model.SequenceBatchCSVRecord`

  returns: `org.datavec.spark.transform.model.SequenceBatchCSVRecord`"
  (^org.datavec.spark.transform.model.SequenceBatchCSVRecord [^CSVSparkTransform this ^org.datavec.spark.transform.model.SequenceBatchCSVRecord batch-csv-record-sequence]
    (-> this (.transformSequence batch-csv-record-sequence))))

(defn transform-sequence-array
  "TODO: optimize

  batch-csv-record-sequence - `org.datavec.spark.transform.model.SequenceBatchCSVRecord`

  returns: `org.datavec.spark.transform.model.Base64NDArrayBody`"
  (^org.datavec.spark.transform.model.Base64NDArrayBody [^CSVSparkTransform this ^org.datavec.spark.transform.model.SequenceBatchCSVRecord batch-csv-record-sequence]
    (-> this (.transformSequenceArray batch-csv-record-sequence))))

(defn transform-sequence-array-incremental
  "single-csv-record - `org.datavec.spark.transform.model.BatchCSVRecord`

  returns: `org.datavec.spark.transform.model.Base64NDArrayBody`"
  (^org.datavec.spark.transform.model.Base64NDArrayBody [^CSVSparkTransform this ^org.datavec.spark.transform.model.BatchCSVRecord single-csv-record]
    (-> this (.transformSequenceArrayIncremental single-csv-record))))

