(ns org.deeplearning4j.spark.util.data.ValidationResult
  "Result for validation of DataSet and MultiDataSets. See SparkDataValidation for more details"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.util.data ValidationResult]))

(defn ->validation-result
  "Constructor."
  (^ValidationResult []
    (new ValidationResult )))

(defn add
  "o - `org.deeplearning4j.spark.util.data.ValidationResult`

  returns: `org.deeplearning4j.spark.util.data.ValidationResult`"
  (^org.deeplearning4j.spark.util.data.ValidationResult [^ValidationResult this ^org.deeplearning4j.spark.util.data.ValidationResult o]
    (-> this (.add o))))

