(ns org.deeplearning4j.nn.conf.distribution.serde.LegacyDistributionDeserializer
  "Jackson Json deserializer to handle legacy format for distributions.
 Now, we use 'type' field which contains class information.
 Previously, we used wrapper objects for type information instead (see TestDistributionDeserializer for examples)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.distribution.serde LegacyDistributionDeserializer]))

(defn ->legacy-distribution-deserializer
  "Constructor."
  (^LegacyDistributionDeserializer []
    (new LegacyDistributionDeserializer )))

(defn deserialize
  "jp - `org.nd4j.shade.jackson.core.JsonParser`
  deserialization-context - `org.nd4j.shade.jackson.databind.DeserializationContext`

  returns: `org.deeplearning4j.nn.conf.distribution.Distribution`

  throws: java.io.IOException"
  (^org.deeplearning4j.nn.conf.distribution.Distribution [^LegacyDistributionDeserializer this ^org.nd4j.shade.jackson.core.JsonParser jp ^org.nd4j.shade.jackson.databind.DeserializationContext deserialization-context]
    (-> this (.deserialize jp deserialization-context))))

