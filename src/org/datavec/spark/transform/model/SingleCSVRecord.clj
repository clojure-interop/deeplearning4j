(ns org.datavec.spark.transform.model.SingleCSVRecord
  "Created by agibsonccc on 12/24/16."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.model SingleCSVRecord]))

(defn ->single-csv-record
  "Constructor.

  Create from an array of values uses list internally)

  values - `java.lang.String`"
  (^SingleCSVRecord [^java.lang.String values]
    (new SingleCSVRecord values)))

(defn *from-row
  "Instantiate a csv record from a vector
  given either an input dataset and a
  one hot matrix, the index will be appended to
  the end of the record, or for regression
  it will append all values in the labels

  row - the input vectors - `org.nd4j.linalg.dataset.DataSet`

  returns: the record from this DataSet - `org.datavec.spark.transform.model.SingleCSVRecord`"
  (^org.datavec.spark.transform.model.SingleCSVRecord [^org.nd4j.linalg.dataset.DataSet row]
    (SingleCSVRecord/fromRow row)))

