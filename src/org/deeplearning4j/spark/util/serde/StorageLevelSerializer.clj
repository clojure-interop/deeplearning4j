(ns org.deeplearning4j.spark.util.serde.StorageLevelSerializer
  "By default: Spark storage levels don't serialize/deserialize cleanly with Jackson (i.e., we can get different results out).
 So we'll manually control the serialization/deserialization for StorageLevel objects"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.util.serde StorageLevelSerializer]))

(defn ->storage-level-serializer
  "Constructor."
  (^StorageLevelSerializer []
    (new StorageLevelSerializer )))

(defn serialize
  "storage-level - `org.apache.spark.storage.StorageLevel`
  json-generator - `org.nd4j.shade.jackson.core.JsonGenerator`
  serializer-provider - `org.nd4j.shade.jackson.databind.SerializerProvider`

  throws: java.io.IOException"
  ([^StorageLevelSerializer this ^org.apache.spark.storage.StorageLevel storage-level ^org.nd4j.shade.jackson.core.JsonGenerator json-generator ^org.nd4j.shade.jackson.databind.SerializerProvider serializer-provider]
    (-> this (.serialize storage-level json-generator serializer-provider))))

