(ns org.deeplearning4j.models.sequencevectors.listeners.ScoreListener
  "Deprecated."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.sequencevectors.listeners ScoreListener]))

(defn ->score-listener
  "Constructor.

  Deprecated.

  target-event - `org.deeplearning4j.models.sequencevectors.enums.ListenerEvent`
  frequency - `int`"
  (^ScoreListener [^org.deeplearning4j.models.sequencevectors.enums.ListenerEvent target-event ^Integer frequency]
    (new ScoreListener target-event frequency)))

(defn validate-event
  "Deprecated.

  event - `org.deeplearning4j.models.sequencevectors.enums.ListenerEvent`
  argument - `long`

  returns: TRUE, if this event can and should be processed with this listener, FALSE otherwise - `boolean`"
  (^Boolean [^ScoreListener this ^org.deeplearning4j.models.sequencevectors.enums.ListenerEvent event ^Long argument]
    (-> this (.validateEvent event argument))))

(defn process-event
  "Deprecated.

  event - `org.deeplearning4j.models.sequencevectors.enums.ListenerEvent`
  sequence-vectors - `org.deeplearning4j.models.sequencevectors.SequenceVectors`
  argument - `long`"
  ([^ScoreListener this ^org.deeplearning4j.models.sequencevectors.enums.ListenerEvent event ^org.deeplearning4j.models.sequencevectors.SequenceVectors sequence-vectors ^Long argument]
    (-> this (.processEvent event sequence-vectors argument))))

