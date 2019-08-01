(ns org.deeplearning4j.eval.ConfusionMatrix
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.eval ConfusionMatrix]))

(defn ->confusion-matrix
  "Constructor.

  Creates an empty confusion Matrix

  classes - `java.util.List`"
  (^ConfusionMatrix [^java.util.List classes]
    (new ConfusionMatrix classes))
  (^ConfusionMatrix []
    (new ConfusionMatrix )))

(defn get-count
  "Gives the count of the number of times the \"predicted\" class was predicted for the \"actual\"
  class.

  actual - `T`
  predicted - `T`

  returns: `int`"
  (^Integer [^ConfusionMatrix this actual predicted]
    (-> this (.getCount actual predicted))))

(defn to-csv
  "Outputs the ConfusionMatrix as comma-separated values for easy import into spreadsheets

  returns: `java.lang.String`"
  (^java.lang.String [^ConfusionMatrix this]
    (-> this (.toCSV))))

(defn to-html
  "Outputs Confusion Matrix in an HTML table. Cascading Style Sheets (CSS) can control the table's
  appearance by defining the empty-space, actual-count-header, predicted-class-header, and
  count-element classes. For example

  returns: html string - `java.lang.String`"
  (^java.lang.String [^ConfusionMatrix this]
    (-> this (.toHTML))))

(defn get-predicted-total
  "Computes the total number of times the class was predicted by the classifier.

  predicted - `T`

  returns: `int`"
  (^Integer [^ConfusionMatrix this predicted]
    (-> this (.getPredictedTotal predicted))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ConfusionMatrix this]
    (-> this (.toString))))

(defn get-classes
  "Gives the applyTransformToDestination of all classes in the confusion matrix.

  returns: `java.util.List<T>`"
  (^java.util.List [^ConfusionMatrix this]
    (-> this (.getClasses))))

(defn get-actual-total
  "Computes the total number of times the class actually appeared in the data.

  actual - `T`

  returns: `int`"
  (^Integer [^ConfusionMatrix this actual]
    (-> this (.getActualTotal actual))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ConfusionMatrix this]
    (-> this (.hashCode))))

(defn add
  "Increments the entry specified by actual and predicted by count.

  actual - `T`
  predicted - `T`
  count - `int`"
  ([^ConfusionMatrix this actual predicted ^Integer count]
    (-> this (.add actual predicted count)))
  ([^ConfusionMatrix this actual predicted]
    (-> this (.add actual predicted)))
  ([^ConfusionMatrix this ^org.deeplearning4j.eval.ConfusionMatrix other]
    (-> this (.add other))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ConfusionMatrix this ^java.lang.Object o]
    (-> this (.equals o))))

