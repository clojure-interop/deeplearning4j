(ns org.nd4j.linalg.primitives.serde.JsonDeserializerAtomicBoolean
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.primitives.serde JsonDeserializerAtomicBoolean]))

(defn ->json-deserializer-atomic-boolean
  "Constructor."
  (^JsonDeserializerAtomicBoolean []
    (new JsonDeserializerAtomicBoolean )))

(defn deserialize
  "json-parser - `org.nd4j.shade.jackson.core.JsonParser`
  deserialization-context - `org.nd4j.shade.jackson.databind.DeserializationContext`

  returns: `org.nd4j.linalg.primitives.AtomicBoolean`

  throws: java.io.IOException"
  (^org.nd4j.linalg.primitives.AtomicBoolean [^JsonDeserializerAtomicBoolean this ^org.nd4j.shade.jackson.core.JsonParser json-parser ^org.nd4j.shade.jackson.databind.DeserializationContext deserialization-context]
    (-> this (.deserialize json-parser deserialization-context))))

