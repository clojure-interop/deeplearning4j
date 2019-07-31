(ns org.nd4j.linalg.primitives.serde.JsonSerializerAtomicDouble
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.primitives.serde JsonSerializerAtomicDouble]))

(defn ->json-serializer-atomic-double
  "Constructor."
  (^JsonSerializerAtomicDouble []
    (new JsonSerializerAtomicDouble )))

(defn serialize
  "atomic-double - `org.nd4j.linalg.primitives.AtomicDouble`
  json-generator - `org.nd4j.shade.jackson.core.JsonGenerator`
  serializer-provider - `org.nd4j.shade.jackson.databind.SerializerProvider`

  throws: java.io.IOException"
  ([^JsonSerializerAtomicDouble this ^org.nd4j.linalg.primitives.AtomicDouble atomic-double ^org.nd4j.shade.jackson.core.JsonGenerator json-generator ^org.nd4j.shade.jackson.databind.SerializerProvider serializer-provider]
    (-> this (.serialize atomic-double json-generator serializer-provider))))

