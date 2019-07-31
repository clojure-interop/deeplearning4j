(ns org.deeplearning4j.spark.util.data.validation.ValidateMultiDataSetFn
  "Function used to validate MultiDataSets on HDFS - see SparkDataValidation for
 further details"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.util.data.validation ValidateMultiDataSetFn]))

(defn ->validate-multi-data-set-fn
  "Constructor.

  delete-invalid - `boolean`
  num-features - `int`
  num-labels - `int`
  features-shape - `java.util.List`
  labels-shape - `java.util.List`"
  (^ValidateMultiDataSetFn [^Boolean delete-invalid ^Integer num-features ^Integer num-labels ^java.util.List features-shape ^java.util.List labels-shape]
    (new ValidateMultiDataSetFn delete-invalid num-features num-labels features-shape labels-shape)))

(def *-buffer-size
  "Static Constant.

  type: int"
  ValidateMultiDataSetFn/BUFFER_SIZE)

(defn call
  "path - `java.lang.String`

  returns: `org.deeplearning4j.spark.util.data.ValidationResult`

  throws: java.lang.Exception"
  (^org.deeplearning4j.spark.util.data.ValidationResult [^ValidateMultiDataSetFn this ^java.lang.String path]
    (-> this (.call path))))

