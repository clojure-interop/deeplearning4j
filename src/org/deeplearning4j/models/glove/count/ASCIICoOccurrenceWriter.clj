(ns org.deeplearning4j.models.glove.count.ASCIICoOccurrenceWriter
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.glove.count ASCIICoOccurrenceWriter]))

(defn ->ascii-co-occurrence-writer
  "Constructor.

  file - `java.io.File`"
  (^ASCIICoOccurrenceWriter [^java.io.File file]
    (new ASCIICoOccurrenceWriter file)))

(defn write-object
  "Description copied from interface: CoOccurrenceWriter

  object - `org.deeplearning4j.models.glove.count.CoOccurrenceWeight`"
  ([^ASCIICoOccurrenceWriter this ^org.deeplearning4j.models.glove.count.CoOccurrenceWeight object]
    (-> this (.writeObject object))))

(defn queue-object
  "Description copied from interface: CoOccurrenceWriter

  object - `org.deeplearning4j.models.glove.count.CoOccurrenceWeight`"
  ([^ASCIICoOccurrenceWriter this ^org.deeplearning4j.models.glove.count.CoOccurrenceWeight object]
    (-> this (.queueObject object))))

(defn finish
  "Description copied from interface: CoOccurrenceWriter"
  ([^ASCIICoOccurrenceWriter this]
    (-> this (.finish))))

