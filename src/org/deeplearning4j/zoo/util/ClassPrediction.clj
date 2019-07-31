(ns org.deeplearning4j.zoo.util.ClassPrediction
  "ClassPrediction: a prediction for classification, used with a Labels class.
 Holds class number, label description, and the prediction probability."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.zoo.util ClassPrediction]))

(defn ->class-prediction
  "Constructor."
  (^ClassPrediction []
    (new ClassPrediction )))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ClassPrediction this]
    (-> this (.toString))))

