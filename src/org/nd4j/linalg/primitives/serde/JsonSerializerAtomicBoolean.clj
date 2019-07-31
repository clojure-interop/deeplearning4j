(ns org.nd4j.linalg.primitives.serde.JsonSerializerAtomicBoolean
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.primitives.serde JsonSerializerAtomicBoolean]))

(defn ->json-serializer-atomic-boolean
  "Constructor."
  (^JsonSerializerAtomicBoolean []
    (new JsonSerializerAtomicBoolean )))

(defn serialize
  "atomic-double - `org.nd4j.linalg.primitives.AtomicBoolean`
  json-generator - `org.nd4j.shade.jackson.core.JsonGenerator`
  serializer-provider - `org.nd4j.shade.jackson.databind.SerializerProvider`

  throws: java.io.IOException"
  ([^JsonSerializerAtomicBoolean this ^org.nd4j.linalg.primitives.AtomicBoolean atomic-double ^org.nd4j.shade.jackson.core.JsonGenerator json-generator ^org.nd4j.shade.jackson.databind.SerializerProvider serializer-provider]
    (-> this (.serialize atomic-double json-generator serializer-provider))))

