(ns org.datavec.api.transform.analysis.json.TDigestSerializer
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.analysis.json TDigestSerializer]))

(defn ->t-digest-serializer
  "Constructor."
  (^TDigestSerializer []
    (new TDigestSerializer )))

(defn serialize
  "td - `com.tdunning.math.stats.TDigest`
  j - `org.nd4j.shade.jackson.core.JsonGenerator`
  sp - `org.nd4j.shade.jackson.databind.SerializerProvider`

  throws: java.io.IOException"
  ([^TDigestSerializer this ^com.tdunning.math.stats.TDigest td ^org.nd4j.shade.jackson.core.JsonGenerator j ^org.nd4j.shade.jackson.databind.SerializerProvider sp]
    (-> this (.serialize td j sp))))

