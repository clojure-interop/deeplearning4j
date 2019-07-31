(ns org.deeplearning4j.datasets.vectorizer.Vectorizer
  "A Vectorizer at its essence takes an input source
 and converts it to a matrix for neural network consumption."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.vectorizer Vectorizer]))

(defn vectorize
  "Vectorizes the input source in to a dataset

  returns: Adam Gibson - `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^Vectorizer this]
    (-> this (.vectorize))))

