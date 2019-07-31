(ns org.deeplearning4j.nearestneighbor.model.CSVRecord
  "Created by agibsonccc on 12/24/16."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nearestneighbor.model CSVRecord]))

(defn ->csv-record
  "Constructor."
  (^CSVRecord []
    (new CSVRecord )))

(defn *from-row
  "Instantiate a csv record from a vector
  given either an input dataset and a
  one hot matrix, the index will be appended to
  the end of the record, or for regression
  it will append all values in the labels

  row - the input vectors - `org.nd4j.linalg.dataset.DataSet`

  returns: the record from this DataSet - `org.deeplearning4j.nearestneighbor.model.CSVRecord`"
  (^org.deeplearning4j.nearestneighbor.model.CSVRecord [^org.nd4j.linalg.dataset.DataSet row]
    (CSVRecord/fromRow row)))

