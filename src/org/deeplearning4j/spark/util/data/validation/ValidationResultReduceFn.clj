(ns org.deeplearning4j.spark.util.data.validation.ValidationResultReduceFn
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.util.data.validation ValidationResultReduceFn]))

(defn ->validation-result-reduce-fn
  "Constructor."
  (^ValidationResultReduceFn []
    (new ValidationResultReduceFn )))

(defn call
  "v-1 - `org.deeplearning4j.spark.util.data.ValidationResult`
  v-2 - `org.deeplearning4j.spark.util.data.ValidationResult`

  returns: `org.deeplearning4j.spark.util.data.ValidationResult`

  throws: java.lang.Exception"
  (^org.deeplearning4j.spark.util.data.ValidationResult [^ValidationResultReduceFn this ^org.deeplearning4j.spark.util.data.ValidationResult v-1 ^org.deeplearning4j.spark.util.data.ValidationResult v-2]
    (-> this (.call v-1 v-2))))

