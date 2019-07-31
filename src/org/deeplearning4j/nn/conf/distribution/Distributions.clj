(ns org.deeplearning4j.nn.conf.distribution.Distributions
  "Static method for instantiating an nd4j distribution from a configuration object."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.distribution Distributions]))

(defn *create-distribution
  "dist - `org.deeplearning4j.nn.conf.distribution.Distribution`

  returns: `org.nd4j.linalg.api.rng.distribution.Distribution`"
  (^org.nd4j.linalg.api.rng.distribution.Distribution [^org.deeplearning4j.nn.conf.distribution.Distribution dist]
    (Distributions/createDistribution dist)))

