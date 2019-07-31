(ns org.deeplearning4j.models.glove.count.CoOccurrenceWriter
  "Created by fartovii on 25.12.15."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.glove.count CoOccurrenceWriter]))

(defn write-object
  "This method implementations should write out objects immediately

  object - `org.deeplearning4j.models.glove.count.CoOccurrenceWeight`"
  ([^CoOccurrenceWriter this ^org.deeplearning4j.models.glove.count.CoOccurrenceWeight object]
    (-> this (.writeObject object))))

(defn queue-object
  "This method implementations should queue objects for writing out.

  object - `org.deeplearning4j.models.glove.count.CoOccurrenceWeight`"
  ([^CoOccurrenceWriter this ^org.deeplearning4j.models.glove.count.CoOccurrenceWeight object]
    (-> this (.queueObject object))))

(defn finish
  "Implementations of this method should close everything they use, before eradication"
  ([^CoOccurrenceWriter this]
    (-> this (.finish))))

