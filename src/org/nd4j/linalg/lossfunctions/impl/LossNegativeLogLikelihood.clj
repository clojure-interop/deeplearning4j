(ns org.nd4j.linalg.lossfunctions.impl.LossNegativeLogLikelihood
  "Negative log likelihood loss function

 In practice, this is implemented as an alias for LossMCXENT due to the mathematical equivalence"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.lossfunctions.impl LossNegativeLogLikelihood]))

(defn ->loss-negative-log-likelihood
  "Constructor.

  weights - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^LossNegativeLogLikelihood [^org.nd4j.linalg.api.ndarray.INDArray weights]
    (new LossNegativeLogLikelihood weights))
  (^LossNegativeLogLikelihood []
    (new LossNegativeLogLikelihood )))

(defn name
  "The opName of this function

  returns: `java.lang.String`"
  (^java.lang.String [^LossNegativeLogLikelihood this]
    (-> this (.name))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^LossNegativeLogLikelihood this]
    (-> this (.opName))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^LossNegativeLogLikelihood this]
    (-> this (.toString))))

