(ns org.deeplearning4j.models.sequencevectors.listeners.SerializingListener
  "This is example VectorsListener implementation. It can be used to serialize models in the middle of training process"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.sequencevectors.listeners SerializingListener]))

(defn validate-event
  "This method is called prior each processEvent call, to check if this specific VectorsListener implementation is viable for specific event

  event - `org.deeplearning4j.models.sequencevectors.enums.ListenerEvent`
  argument - `long`

  returns: TRUE, if this event can and should be processed with this listener, FALSE otherwise - `boolean`"
  (^Boolean [^SerializingListener this ^org.deeplearning4j.models.sequencevectors.enums.ListenerEvent event ^Long argument]
    (-> this (.validateEvent event argument))))

(defn process-event
  "This method is called at each epoch end

  event - `org.deeplearning4j.models.sequencevectors.enums.ListenerEvent`
  sequence-vectors - `org.deeplearning4j.models.sequencevectors.SequenceVectors`
  argument - `long`"
  ([^SerializingListener this ^org.deeplearning4j.models.sequencevectors.enums.ListenerEvent event ^org.deeplearning4j.models.sequencevectors.SequenceVectors sequence-vectors ^Long argument]
    (-> this (.processEvent event sequence-vectors argument))))

