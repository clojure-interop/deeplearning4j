(ns org.deeplearning4j.nn.conf.constraint.NonNegativeConstraint
  "Constrain the weights to be non-negative"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.constraint NonNegativeConstraint]))

(defn ->non-negative-constraint
  "Constructor."
  (^NonNegativeConstraint []
    (new NonNegativeConstraint )))

(defn apply
  "param - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^NonNegativeConstraint this ^org.nd4j.linalg.api.ndarray.INDArray param]
    (-> this (.apply param))))

(defn clone
  "returns: `org.deeplearning4j.nn.conf.constraint.NonNegativeConstraint`"
  (^org.deeplearning4j.nn.conf.constraint.NonNegativeConstraint [^NonNegativeConstraint this]
    (-> this (.clone))))

