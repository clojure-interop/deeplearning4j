(ns org.deeplearning4j.models.word2vec.wordstore.VocabularyWord
  "Simplified version of VocabWord.
 Used only for w2v vocab building routines"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.word2vec.wordstore VocabularyWord]))

(defn ->vocabulary-word
  "Constructor.

  word - `java.lang.String`"
  (^VocabularyWord [^java.lang.String word]
    (new VocabularyWord word))
  (^VocabularyWord []
    (new VocabularyWord )))

(defn *from-json
  "json - `java.lang.String`

  returns: `org.deeplearning4j.models.word2vec.wordstore.VocabularyWord`"
  (^org.deeplearning4j.models.word2vec.wordstore.VocabularyWord [^java.lang.String json]
    (VocabularyWord/fromJson json)))

(defn increment-count
  ""
  ([^VocabularyWord this]
    (-> this (.incrementCount))))

(defn increment-retention-step
  ""
  ([^VocabularyWord this]
    (-> this (.incrementRetentionStep))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^VocabularyWord this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^VocabularyWord this]
    (-> this (.hashCode))))

(defn to-json
  "returns: `java.lang.String`"
  (^java.lang.String [^VocabularyWord this]
    (-> this (.toJson))))

