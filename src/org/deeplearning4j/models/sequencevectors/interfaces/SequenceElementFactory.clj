(ns org.deeplearning4j.models.sequencevectors.interfaces.SequenceElementFactory
  "This is interface for JSON -> SequenceElement serialization/deserialziation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.sequencevectors.interfaces SequenceElementFactory]))

(defn deserialize
  "This method builds object from provided JSON

  json - JSON for restored object - `java.lang.String`

  returns: restored object - `T`"
  ([^SequenceElementFactory this ^java.lang.String json]
    (-> this (.deserialize json))))

(defn serialize
  "This method serializaes object into JSON string

  element - `T`

  returns: `java.lang.String`"
  (^java.lang.String [^SequenceElementFactory this element]
    (-> this (.serialize element))))

