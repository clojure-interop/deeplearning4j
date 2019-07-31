(ns org.deeplearning4j.spark.util.serde.StorageLevelDeserializer
  "By default: Spark storage levels don't serialize/deserialize cleanly with Jackson (i.e., we can get different results out).
 So we'll manually control the serialization/deserialization for StorageLevel objects"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.util.serde StorageLevelDeserializer]))

(defn ->storage-level-deserializer
  "Constructor."
  (^StorageLevelDeserializer []
    (new StorageLevelDeserializer )))

(defn deserialize
  "json-parser - `org.nd4j.shade.jackson.core.JsonParser`
  deserialization-context - `org.nd4j.shade.jackson.databind.DeserializationContext`

  returns: `org.apache.spark.storage.StorageLevel`

  throws: java.io.IOException"
  (^org.apache.spark.storage.StorageLevel [^StorageLevelDeserializer this ^org.nd4j.shade.jackson.core.JsonParser json-parser ^org.nd4j.shade.jackson.databind.DeserializationContext deserialization-context]
    (-> this (.deserialize json-parser deserialization-context))))

