(ns org.deeplearning4j.models.sequencevectors.serialization.VocabWordFactory
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.sequencevectors.serialization VocabWordFactory]))

(defn ->vocab-word-factory
  "Constructor."
  (^VocabWordFactory []
    (new VocabWordFactory )))

(defn deserialize
  "This method builds object from provided JSON

  json - JSON for restored object - `java.lang.String`

  returns: restored object - `org.deeplearning4j.models.word2vec.VocabWord`"
  (^org.deeplearning4j.models.word2vec.VocabWord [^VocabWordFactory this ^java.lang.String json]
    (-> this (.deserialize json))))

(defn serialize
  "This method serializaes object into JSON string

  element - `org.deeplearning4j.models.word2vec.VocabWord`

  returns: `java.lang.String`"
  (^java.lang.String [^VocabWordFactory this ^org.deeplearning4j.models.word2vec.VocabWord element]
    (-> this (.serialize element))))

