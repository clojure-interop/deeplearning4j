(ns org.deeplearning4j.eval.meta.Prediction
  "Prediction: a prediction for classification, used with the Evaluation class.
 Holds predicted and actual classes, along with an object for the example/record that produced this evaluation."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.eval.meta Prediction]))

(defn ->prediction
  "Constructor."
  (^Prediction []
    (new Prediction )))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Prediction this]
    (-> this (.toString))))

(defn get-record-meta-data
  "Convenience method for getting the record meta data as a particular class (as an alternative to casting it manually).
  NOTE: This uses an unchecked cast inernally.

  record-meta-data-class - Class of the record metadata - `java.lang.Class`

  returns: `<T> T`"
  ([^Prediction this ^java.lang.Class record-meta-data-class]
    (-> this (.getRecordMetaData record-meta-data-class))))

