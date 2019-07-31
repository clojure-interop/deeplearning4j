(ns org.deeplearning4j.models.glove.count.BinaryCoOccurrenceReader
  "Binary implementation of CoOccurenceReader interface, used to provide off-memory storage for cooccurrence maps generated for GloVe"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.glove.count BinaryCoOccurrenceReader]))

(defn ->binary-co-occurrence-reader
  "Constructor.

  file - `java.io.File`
  vocab-cache - `org.deeplearning4j.models.word2vec.wordstore.VocabCache`
  map - `org.deeplearning4j.models.glove.count.CountMap`"
  (^BinaryCoOccurrenceReader [^java.io.File file ^org.deeplearning4j.models.word2vec.wordstore.VocabCache vocab-cache ^org.deeplearning4j.models.glove.count.CountMap map]
    (new BinaryCoOccurrenceReader file vocab-cache map)))

(defn has-more-objects?
  "returns: `boolean`"
  (^Boolean [^BinaryCoOccurrenceReader this]
    (-> this (.hasMoreObjects))))

(defn next-object
  "returns: `org.deeplearning4j.models.glove.count.CoOccurrenceWeight<T>`"
  (^org.deeplearning4j.models.glove.count.CoOccurrenceWeight [^BinaryCoOccurrenceReader this]
    (-> this (.nextObject))))

(defn finish
  ""
  ([^BinaryCoOccurrenceReader this]
    (-> this (.finish))))

