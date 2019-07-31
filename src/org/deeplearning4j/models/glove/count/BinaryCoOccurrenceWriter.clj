(ns org.deeplearning4j.models.glove.count.BinaryCoOccurrenceWriter
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.glove.count BinaryCoOccurrenceWriter]))

(defn ->binary-co-occurrence-writer
  "Constructor.

  file - `java.io.File`"
  (^BinaryCoOccurrenceWriter [^java.io.File file]
    (new BinaryCoOccurrenceWriter file)))

(defn write-object
  "Description copied from interface: CoOccurrenceWriter

  object - `org.deeplearning4j.models.glove.count.CoOccurrenceWeight`"
  ([^BinaryCoOccurrenceWriter this ^org.deeplearning4j.models.glove.count.CoOccurrenceWeight object]
    (-> this (.writeObject object))))

(defn queue-object
  "Description copied from interface: CoOccurrenceWriter

  object - `org.deeplearning4j.models.glove.count.CoOccurrenceWeight`"
  ([^BinaryCoOccurrenceWriter this ^org.deeplearning4j.models.glove.count.CoOccurrenceWeight object]
    (-> this (.queueObject object))))

(defn finish
  "Description copied from interface: CoOccurrenceWriter"
  ([^BinaryCoOccurrenceWriter this]
    (-> this (.finish))))

