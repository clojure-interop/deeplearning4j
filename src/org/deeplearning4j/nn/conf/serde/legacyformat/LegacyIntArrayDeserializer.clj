(ns org.deeplearning4j.nn.conf.serde.legacyformat.LegacyIntArrayDeserializer
  "Deserialize either an int[] to an int[], or a single int x to int[]{x,x}
 Used when supporting a configuration format change from single int value to int[], as for Upsampling2D
 between 1.0.0-alpha and 1.0.0-beta"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.serde.legacyformat LegacyIntArrayDeserializer]))

(defn ->legacy-int-array-deserializer
  "Constructor."
  (^LegacyIntArrayDeserializer []
    (new LegacyIntArrayDeserializer )))

(defn deserialize
  "jp - `org.nd4j.shade.jackson.core.JsonParser`
  deserialization-context - `org.nd4j.shade.jackson.databind.DeserializationContext`

  returns: `int[]`

  throws: java.io.IOException"
  ([^LegacyIntArrayDeserializer this ^org.nd4j.shade.jackson.core.JsonParser jp ^org.nd4j.shade.jackson.databind.DeserializationContext deserialization-context]
    (-> this (.deserialize jp deserialization-context))))

