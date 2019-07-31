(ns org.deeplearning4j.models.word2vec.VocabWord
  "Intermediate layers of the neural network"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.word2vec VocabWord]))

(defn ->vocab-word
  "Constructor.

  word-frequency - `double`
  word - `java.lang.String`
  storage-id - `long`"
  (^VocabWord [^Double word-frequency ^java.lang.String word ^Long storage-id]
    (new VocabWord word-frequency word storage-id))
  (^VocabWord [^Double word-frequency ^java.lang.String word]
    (new VocabWord word-frequency word))
  (^VocabWord []
    (new VocabWord )))

(defn *none
  "returns: `org.deeplearning4j.models.word2vec.VocabWord`"
  (^org.deeplearning4j.models.word2vec.VocabWord []
    (VocabWord/none )))

(defn get-label
  "Description copied from class: SequenceElement

  returns: `java.lang.String`"
  (^java.lang.String [^VocabWord this]
    (-> this (.getLabel))))

(defn get-word
  "returns: `java.lang.String`"
  (^java.lang.String [^VocabWord this]
    (-> this (.getWord))))

(defn set-word
  "word - `java.lang.String`"
  ([^VocabWord this ^java.lang.String word]
    (-> this (.setWord word))))

(defn equals
  "Description copied from class: SequenceElement

  o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^VocabWord this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "Description copied from class: SequenceElement

  returns: hashCode for this SequenceElement - `int`"
  (^Integer [^VocabWord this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^VocabWord this]
    (-> this (.toString))))

(defn to-json
  "returns: `java.lang.String`"
  (^java.lang.String [^VocabWord this]
    (-> this (.toJSON))))

