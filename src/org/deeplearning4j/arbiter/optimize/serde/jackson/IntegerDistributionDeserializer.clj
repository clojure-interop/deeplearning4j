(ns org.deeplearning4j.arbiter.optimize.serde.jackson.IntegerDistributionDeserializer
  "Custom Jackson deserializer for integer distributions"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.optimize.serde.jackson IntegerDistributionDeserializer]))

(defn ->integer-distribution-deserializer
  "Constructor."
  (^IntegerDistributionDeserializer []
    (new IntegerDistributionDeserializer )))

(defn deserialize
  "p - `org.nd4j.shade.jackson.core.JsonParser`
  ctxt - `org.nd4j.shade.jackson.databind.DeserializationContext`

  returns: `org.apache.commons.math3.distribution.IntegerDistribution`

  throws: java.io.IOException"
  (^org.apache.commons.math3.distribution.IntegerDistribution [^IntegerDistributionDeserializer this ^org.nd4j.shade.jackson.core.JsonParser p ^org.nd4j.shade.jackson.databind.DeserializationContext ctxt]
    (-> this (.deserialize p ctxt))))

