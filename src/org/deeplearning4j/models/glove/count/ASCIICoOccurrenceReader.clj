(ns org.deeplearning4j.models.glove.count.ASCIICoOccurrenceReader
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.glove.count ASCIICoOccurrenceReader]))

(defn ->ascii-co-occurrence-reader
  "Constructor.

  file - `java.io.File`
  vocab-cache - `org.deeplearning4j.models.word2vec.wordstore.VocabCache`"
  (^ASCIICoOccurrenceReader [^java.io.File file ^org.deeplearning4j.models.word2vec.wordstore.VocabCache vocab-cache]
    (new ASCIICoOccurrenceReader file vocab-cache)))

(defn has-more-objects?
  "returns: `boolean`"
  (^Boolean [^ASCIICoOccurrenceReader this]
    (-> this (.hasMoreObjects))))

(defn next-object
  "Returns next CoOccurrenceWeight object
  PLEASE NOTE: This method can return null value.

  returns: `org.deeplearning4j.models.glove.count.CoOccurrenceWeight<T>`"
  (^org.deeplearning4j.models.glove.count.CoOccurrenceWeight [^ASCIICoOccurrenceReader this]
    (-> this (.nextObject))))

(defn finish
  ""
  ([^ASCIICoOccurrenceReader this]
    (-> this (.finish))))

