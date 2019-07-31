(ns org.deeplearning4j.arbiter.ui.data.BaseJavaPersistable
  "Common implementation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.ui.data BaseJavaPersistable]))

(defn ->base-java-persistable
  "Constructor.

  builder - `org.deeplearning4j.arbiter.ui.data.BaseJavaPersistable$Builder`"
  (^BaseJavaPersistable [^org.deeplearning4j.arbiter.ui.data.BaseJavaPersistable$Builder builder]
    (new BaseJavaPersistable builder)))

(defn get-type-id
  "Description copied from interface: Persistable

  returns: `java.lang.String`"
  (^java.lang.String [^BaseJavaPersistable this]
    (-> this (.getTypeID))))

(defn get-time-stamp
  "Description copied from interface: Persistable

  returns: `long`"
  (^Long [^BaseJavaPersistable this]
    (-> this (.getTimeStamp))))

(defn get-session-id
  "Description copied from interface: Persistable

  returns: `java.lang.String`"
  (^java.lang.String [^BaseJavaPersistable this]
    (-> this (.getSessionID))))

(defn encoding-length-bytes
  "Description copied from interface: Persistable

  returns: `int`"
  (^Integer [^BaseJavaPersistable this]
    (-> this (.encodingLengthBytes))))

(defn encode
  "Description copied from interface: Persistable

  buffer - `java.nio.ByteBuffer`"
  ([^BaseJavaPersistable this ^java.nio.ByteBuffer buffer]
    (-> this (.encode buffer)))
  ([^BaseJavaPersistable this]
    (-> this (.encode))))

(defn decode
  "Description copied from interface: Persistable

  decode - `byte[]`"
  ([^BaseJavaPersistable this decode]
    (-> this (.decode decode))))

