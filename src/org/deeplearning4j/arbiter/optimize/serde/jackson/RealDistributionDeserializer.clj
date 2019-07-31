(ns org.deeplearning4j.arbiter.optimize.serde.jackson.RealDistributionDeserializer
  "Created by Alex on 14/02/2017."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.optimize.serde.jackson RealDistributionDeserializer]))

(defn ->real-distribution-deserializer
  "Constructor."
  (^RealDistributionDeserializer []
    (new RealDistributionDeserializer )))

(defn deserialize
  "p - `org.nd4j.shade.jackson.core.JsonParser`
  ctxt - `org.nd4j.shade.jackson.databind.DeserializationContext`

  returns: `org.apache.commons.math3.distribution.RealDistribution`

  throws: java.io.IOException"
  (^org.apache.commons.math3.distribution.RealDistribution [^RealDistributionDeserializer this ^org.nd4j.shade.jackson.core.JsonParser p ^org.nd4j.shade.jackson.databind.DeserializationContext ctxt]
    (-> this (.deserialize p ctxt))))

