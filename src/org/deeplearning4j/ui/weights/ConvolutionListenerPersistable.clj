(ns org.deeplearning4j.ui.weights.ConvolutionListenerPersistable
  "Created by Alex on 24/10/2016."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.weights ConvolutionListenerPersistable]))

(defn ->convolution-listener-persistable
  "Constructor."
  (^ConvolutionListenerPersistable []
    (new ConvolutionListenerPersistable )))

(defn get-session-id
  "Description copied from interface: Persistable

  returns: `java.lang.String`"
  (^java.lang.String [^ConvolutionListenerPersistable this]
    (-> this (.getSessionID))))

(defn get-type-id
  "Description copied from interface: Persistable

  returns: `java.lang.String`"
  (^java.lang.String [^ConvolutionListenerPersistable this]
    (-> this (.getTypeID))))

(defn get-worker-id
  "Description copied from interface: Persistable

  returns: `java.lang.String`"
  (^java.lang.String [^ConvolutionListenerPersistable this]
    (-> this (.getWorkerID))))

(defn get-time-stamp
  "Description copied from interface: Persistable

  returns: `long`"
  (^Long [^ConvolutionListenerPersistable this]
    (-> this (.getTimeStamp))))

(defn encoding-length-bytes
  "Description copied from interface: Persistable

  returns: `int`"
  (^Integer [^ConvolutionListenerPersistable this]
    (-> this (.encodingLengthBytes))))

(defn encode
  "Description copied from interface: Persistable

  buffer - `java.nio.ByteBuffer`"
  ([^ConvolutionListenerPersistable this ^java.nio.ByteBuffer buffer]
    (-> this (.encode buffer)))
  ([^ConvolutionListenerPersistable this]
    (-> this (.encode))))

(defn decode
  "Description copied from interface: Persistable

  decode - `byte[]`"
  ([^ConvolutionListenerPersistable this decode]
    (-> this (.decode decode))))

