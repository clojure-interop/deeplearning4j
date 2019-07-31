(ns org.nd4j.linalg.primitives.serde.JsonDeserializerAtomicDouble
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.primitives.serde JsonDeserializerAtomicDouble]))

(defn ->json-deserializer-atomic-double
  "Constructor."
  (^JsonDeserializerAtomicDouble []
    (new JsonDeserializerAtomicDouble )))

(defn deserialize
  "json-parser - `org.nd4j.shade.jackson.core.JsonParser`
  deserialization-context - `org.nd4j.shade.jackson.databind.DeserializationContext`

  returns: `org.nd4j.linalg.primitives.AtomicDouble`

  throws: java.io.IOException"
  (^org.nd4j.linalg.primitives.AtomicDouble [^JsonDeserializerAtomicDouble this ^org.nd4j.shade.jackson.core.JsonParser json-parser ^org.nd4j.shade.jackson.databind.DeserializationContext deserialization-context]
    (-> this (.deserialize json-parser deserialization-context))))

