(ns org.deeplearning4j.models.sequencevectors.serialization.AbstractElementFactory
  "This is universal serialization/deserialization factor for SequenceVectors serialization.
 It will work for any <T extends SequenceElement> that doesn't breaks simple POJO rules."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.sequencevectors.serialization AbstractElementFactory]))

(defn ->abstract-element-factory
  "Constructor.

  This is the only constructor available for AbstractElementFactory

  cls - class that going to be serialized/deserialized using this instance. I.e.: VocabWord.class - `java.lang.Class`"
  (^AbstractElementFactory [^java.lang.Class cls]
    (new AbstractElementFactory cls)))

(defn deserialize
  "This method builds object from provided JSON

  json - JSON for restored object - `java.lang.String`

  returns: restored object - `T`"
  ([^AbstractElementFactory this ^java.lang.String json]
    (-> this (.deserialize json))))

(defn serialize
  "This method serializaes object into JSON string

  element - `T`

  returns: `java.lang.String`"
  (^java.lang.String [^AbstractElementFactory this element]
    (-> this (.serialize element))))

