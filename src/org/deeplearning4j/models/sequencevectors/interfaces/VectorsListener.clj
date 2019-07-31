(ns org.deeplearning4j.models.sequencevectors.interfaces.VectorsListener
  "This interface describes Listeners to SequenceVectors and its derivatives."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.sequencevectors.interfaces VectorsListener]))

(defn validate-event
  "This method is called prior each processEvent call, to check if this specific VectorsListener implementation is viable for specific event

  event - `org.deeplearning4j.models.sequencevectors.enums.ListenerEvent`
  argument - `long`

  returns: TRUE, if this event can and should be processed with this listener, FALSE otherwise - `boolean`"
  (^Boolean [^VectorsListener this ^org.deeplearning4j.models.sequencevectors.enums.ListenerEvent event ^Long argument]
    (-> this (.validateEvent event argument))))

(defn process-event
  "This method is called at each epoch end

  event - `org.deeplearning4j.models.sequencevectors.enums.ListenerEvent`
  sequence-vectors - `org.deeplearning4j.models.sequencevectors.SequenceVectors`
  argument - `long`"
  ([^VectorsListener this ^org.deeplearning4j.models.sequencevectors.enums.ListenerEvent event ^org.deeplearning4j.models.sequencevectors.SequenceVectors sequence-vectors ^Long argument]
    (-> this (.processEvent event sequence-vectors argument))))

