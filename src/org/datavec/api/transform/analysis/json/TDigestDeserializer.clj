(ns org.datavec.api.transform.analysis.json.TDigestDeserializer
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.analysis.json TDigestDeserializer]))

(defn ->t-digest-deserializer
  "Constructor."
  (^TDigestDeserializer []
    (new TDigestDeserializer )))

(defn deserialize
  "jp - `org.nd4j.shade.jackson.core.JsonParser`
  d - `org.nd4j.shade.jackson.databind.DeserializationContext`

  returns: `com.tdunning.math.stats.TDigest`

  throws: java.io.IOException"
  (^com.tdunning.math.stats.TDigest [^TDigestDeserializer this ^org.nd4j.shade.jackson.core.JsonParser jp ^org.nd4j.shade.jackson.databind.DeserializationContext d]
    (-> this (.deserialize jp d))))

