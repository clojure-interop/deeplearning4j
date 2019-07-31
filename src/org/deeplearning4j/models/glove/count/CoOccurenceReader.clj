(ns org.deeplearning4j.models.glove.count.CoOccurenceReader
  "Created by raver on 24.12.2015."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.glove.count CoOccurenceReader]))

(defn has-more-objects?
  "returns: `boolean`"
  (^Boolean [^CoOccurenceReader this]
    (-> this (.hasMoreObjects))))

(defn next-object
  "returns: `org.deeplearning4j.models.glove.count.CoOccurrenceWeight<T>`"
  (^org.deeplearning4j.models.glove.count.CoOccurrenceWeight [^CoOccurenceReader this]
    (-> this (.nextObject))))

(defn finish
  ""
  ([^CoOccurenceReader this]
    (-> this (.finish))))

