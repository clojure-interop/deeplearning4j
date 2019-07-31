(ns org.datavec.api.util.jackson.DateTimeFieldTypeSerializer
  "JsonSerializer for serializing Jodatime DateTimeFieldType instances"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.util.jackson DateTimeFieldTypeSerializer]))

(defn ->date-time-field-type-serializer
  "Constructor."
  (^DateTimeFieldTypeSerializer []
    (new DateTimeFieldTypeSerializer )))

(defn serialize
  "date-time-field-type - `org.joda.time.DateTimeFieldType`
  json-generator - `org.nd4j.shade.jackson.core.JsonGenerator`
  serializer-provider - `org.nd4j.shade.jackson.databind.SerializerProvider`

  throws: java.io.IOException"
  ([^DateTimeFieldTypeSerializer this ^org.joda.time.DateTimeFieldType date-time-field-type ^org.nd4j.shade.jackson.core.JsonGenerator json-generator ^org.nd4j.shade.jackson.databind.SerializerProvider serializer-provider]
    (-> this (.serialize date-time-field-type json-generator serializer-provider))))

