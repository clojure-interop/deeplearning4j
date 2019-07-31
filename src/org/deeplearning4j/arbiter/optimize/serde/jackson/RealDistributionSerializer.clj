(ns org.deeplearning4j.arbiter.optimize.serde.jackson.RealDistributionSerializer
  "Custom JSON serializer for Apache commons RealDistribution instances.
 The custom serializer is set up to use the built-in c"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.optimize.serde.jackson RealDistributionSerializer]))

(defn ->real-distribution-serializer
  "Constructor."
  (^RealDistributionSerializer []
    (new RealDistributionSerializer )))

(defn serialize
  "d - `org.apache.commons.math3.distribution.RealDistribution`
  j - `org.nd4j.shade.jackson.core.JsonGenerator`
  serializer-provider - `org.nd4j.shade.jackson.databind.SerializerProvider`

  throws: java.io.IOException"
  ([^RealDistributionSerializer this ^org.apache.commons.math3.distribution.RealDistribution d ^org.nd4j.shade.jackson.core.JsonGenerator j ^org.nd4j.shade.jackson.databind.SerializerProvider serializer-provider]
    (-> this (.serialize d j serializer-provider))))

