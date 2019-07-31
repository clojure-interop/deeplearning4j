(ns org.deeplearning4j.spark.util.data.validation.ValidateDataSetFn
  "Function used to validate DataSets on HDFS - see SparkDataValidation for
 further details"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.util.data.validation ValidateDataSetFn]))

(defn ->validate-data-set-fn
  "Constructor.

  delete-invalid - `boolean`
  features-shape - `int[]`
  labels-shape - `int[]`"
  (^ValidateDataSetFn [^Boolean delete-invalid features-shape labels-shape]
    (new ValidateDataSetFn delete-invalid features-shape labels-shape)))

(def *-buffer-size
  "Static Constant.

  type: int"
  ValidateDataSetFn/BUFFER_SIZE)

(defn call
  "path - `java.lang.String`

  returns: `org.deeplearning4j.spark.util.data.ValidationResult`

  throws: java.lang.Exception"
  (^org.deeplearning4j.spark.util.data.ValidationResult [^ValidateDataSetFn this ^java.lang.String path]
    (-> this (.call path))))

