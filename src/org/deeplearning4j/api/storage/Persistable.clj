(ns org.deeplearning4j.api.storage.Persistable
  "Created by Alex on 07/10/2016."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.api.storage Persistable]))

(defn get-session-id
  "Get the session id

  returns: `java.lang.String`"
  (^java.lang.String [^Persistable this]
    (-> this (.getSessionID))))

(defn get-type-id
  "Get the type id

  returns: `java.lang.String`"
  (^java.lang.String [^Persistable this]
    (-> this (.getTypeID))))

(defn get-worker-id
  "Get the worker id

  returns: `java.lang.String`"
  (^java.lang.String [^Persistable this]
    (-> this (.getWorkerID))))

(defn get-time-stamp
  "Get when this was created.

  returns: `long`"
  (^Long [^Persistable this]
    (-> this (.getTimeStamp))))

(defn encoding-length-bytes
  "Length of the encoding, in bytes, when using encode()
  Length may be different using encode(OutputStream), due to things like stream headers

  returns: `int`"
  (^Integer [^Persistable this]
    (-> this (.encodingLengthBytes))))

(defn encode
  "Encode this persistable in to a ByteBuffer

  buffer - `java.nio.ByteBuffer`"
  ([^Persistable this ^java.nio.ByteBuffer buffer]
    (-> this (.encode buffer)))
  ([^Persistable this]
    (-> this (.encode))))

(defn decode
  "Decode the content of the given
  byte array in to this persistable

  decode - `byte[]`"
  ([^Persistable this decode]
    (-> this (.decode decode))))

