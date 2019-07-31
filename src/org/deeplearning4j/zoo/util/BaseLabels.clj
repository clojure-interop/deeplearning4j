(ns org.deeplearning4j.zoo.util.BaseLabels
  "Base functionality for helper classes that return label descriptions."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.zoo.util BaseLabels]))

(defn get-label
  "Description copied from interface: Labels

  n - `int`

  returns: label description - `java.lang.String`"
  (^java.lang.String [^BaseLabels this ^Integer n]
    (-> this (.getLabel n))))

(defn decode-predictions
  "Description copied from interface: Labels

  predictions - raw - `org.nd4j.linalg.api.ndarray.INDArray`
  n - `int`

  returns: decoded predictions - `java.util.List<java.util.List<org.deeplearning4j.zoo.util.ClassPrediction>>`"
  (^java.util.List [^BaseLabels this ^org.nd4j.linalg.api.ndarray.INDArray predictions ^Integer n]
    (-> this (.decodePredictions predictions n))))

