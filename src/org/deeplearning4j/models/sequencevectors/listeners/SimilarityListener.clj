(ns org.deeplearning4j.models.sequencevectors.listeners.SimilarityListener
  "Simple listener, to monitor similarity between selected elements during training"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.sequencevectors.listeners SimilarityListener]))

(defn ->similarity-listener
  "Constructor.

  target-event - `org.deeplearning4j.models.sequencevectors.enums.ListenerEvent`
  frequency - `int`
  label-1 - `java.lang.String`
  label-2 - `java.lang.String`"
  (^SimilarityListener [^org.deeplearning4j.models.sequencevectors.enums.ListenerEvent target-event ^Integer frequency ^java.lang.String label-1 ^java.lang.String label-2]
    (new SimilarityListener target-event frequency label-1 label-2)))

(defn validate-event
  "Description copied from interface: VectorsListener

  event - `org.deeplearning4j.models.sequencevectors.enums.ListenerEvent`
  argument - `long`

  returns: TRUE, if this event can and should be processed with this listener, FALSE otherwise - `boolean`"
  (^Boolean [^SimilarityListener this ^org.deeplearning4j.models.sequencevectors.enums.ListenerEvent event ^Long argument]
    (-> this (.validateEvent event argument))))

(defn process-event
  "Description copied from interface: VectorsListener

  event - `org.deeplearning4j.models.sequencevectors.enums.ListenerEvent`
  sequence-vectors - `org.deeplearning4j.models.sequencevectors.SequenceVectors`
  argument - `long`"
  ([^SimilarityListener this ^org.deeplearning4j.models.sequencevectors.enums.ListenerEvent event ^org.deeplearning4j.models.sequencevectors.SequenceVectors sequence-vectors ^Long argument]
    (-> this (.processEvent event sequence-vectors argument))))

