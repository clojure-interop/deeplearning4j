(ns org.deeplearning4j.arbiter.optimize.serde.jackson.IntegerDistributionSerializer
  "Custom Jackson serializer for integer distributions"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.optimize.serde.jackson IntegerDistributionSerializer]))

(defn ->integer-distribution-serializer
  "Constructor."
  (^IntegerDistributionSerializer []
    (new IntegerDistributionSerializer )))

(defn serialize
  "d - `org.apache.commons.math3.distribution.IntegerDistribution`
  j - `org.nd4j.shade.jackson.core.JsonGenerator`
  serializer-provider - `org.nd4j.shade.jackson.databind.SerializerProvider`

  throws: java.io.IOException"
  ([^IntegerDistributionSerializer this ^org.apache.commons.math3.distribution.IntegerDistribution d ^org.nd4j.shade.jackson.core.JsonGenerator j ^org.nd4j.shade.jackson.databind.SerializerProvider serializer-provider]
    (-> this (.serialize d j serializer-provider))))

