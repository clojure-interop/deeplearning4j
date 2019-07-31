(ns org.deeplearning4j.zoo.util.Labels
  "Interface to helper classes that return label descriptions."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.zoo.util Labels]))

(defn get-label
  "Returns the description of the nth class from the classes of a dataset.

  n - `int`

  returns: label description - `java.lang.String`"
  (^java.lang.String [^Labels this ^Integer n]
    (-> this (.getLabel n))))

(defn decode-predictions
  "Given predictions from the trained model this method will return a list
  of the top n matches and the respective probabilities.

  predictions - raw - `org.nd4j.linalg.api.ndarray.INDArray`
  n - `int`

  returns: decoded predictions - `java.util.List<java.util.List<org.deeplearning4j.zoo.util.ClassPrediction>>`"
  (^java.util.List [^Labels this ^org.nd4j.linalg.api.ndarray.INDArray predictions ^Integer n]
    (-> this (.decodePredictions predictions n))))

