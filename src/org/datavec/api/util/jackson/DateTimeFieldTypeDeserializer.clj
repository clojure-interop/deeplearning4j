(ns org.datavec.api.util.jackson.DateTimeFieldTypeDeserializer
  "JsonDeserializer for deserializing Jodatime DateTimeFieldType instances"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.util.jackson DateTimeFieldTypeDeserializer]))

(defn ->date-time-field-type-deserializer
  "Constructor."
  (^DateTimeFieldTypeDeserializer []
    (new DateTimeFieldTypeDeserializer )))

(defn deserialize
  "json-parser - `org.nd4j.shade.jackson.core.JsonParser`
  deserialization-context - `org.nd4j.shade.jackson.databind.DeserializationContext`

  returns: `org.joda.time.DateTimeFieldType`

  throws: java.io.IOException"
  (^org.joda.time.DateTimeFieldType [^DateTimeFieldTypeDeserializer this ^org.nd4j.shade.jackson.core.JsonParser json-parser ^org.nd4j.shade.jackson.databind.DeserializationContext deserialization-context]
    (-> this (.deserialize json-parser deserialization-context))))

