(ns org.deeplearning4j.arbiter.ui.misc.JsonMapper
  "Simple class for serializing to / deserializing from JSON, using default ObjectMapper configuration"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.ui.misc JsonMapper]))

(defn *as-json
  "o - `java.lang.Object`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.Object o]
    (JsonMapper/asJson o)))

(defn *from-json
  "json - `java.lang.String`
  type - `java.lang.Class`

  returns: `<T> T`"
  ([^java.lang.String json ^java.lang.Class type]
    (JsonMapper/fromJson json type)))

(defn *get-instance
  "returns: `org.nd4j.shade.jackson.databind.ObjectMapper`"
  (^org.nd4j.shade.jackson.databind.ObjectMapper []
    (JsonMapper/getInstance )))

