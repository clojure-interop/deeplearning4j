(ns org.deeplearning4j.models.sequencevectors.listeners.SerializingListener$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.sequencevectors.listeners SerializingListener$Builder]))

(defn ->builder
  "Constructor.

  target-event - `org.deeplearning4j.models.sequencevectors.enums.ListenerEvent`
  frequency - `int`"
  (^SerializingListener$Builder [^org.deeplearning4j.models.sequencevectors.enums.ListenerEvent target-event ^Integer frequency]
    (new SerializingListener$Builder target-event frequency)))

(defn set-filename-prefix
  "This method allows you to define template for file names that will be created during serialization

  really-use - `boolean`

  returns: `org.deeplearning4j.models.sequencevectors.listeners.SerializingListener$Builder<T>`"
  (^org.deeplearning4j.models.sequencevectors.listeners.SerializingListener$Builder [^SerializingListener$Builder this ^Boolean really-use]
    (-> this (.setFilenamePrefix really-use))))

(defn set-target-folder
  "This method specifies target folder where models should be saved

  folder - `java.lang.String`

  returns: `org.deeplearning4j.models.sequencevectors.listeners.SerializingListener$Builder<T>`"
  (^org.deeplearning4j.models.sequencevectors.listeners.SerializingListener$Builder [^SerializingListener$Builder this ^java.lang.String folder]
    (-> this (.setTargetFolder folder))))

(defn build
  "This method returns new SerializingListener instance

  returns: `org.deeplearning4j.models.sequencevectors.listeners.SerializingListener<T>`"
  (^org.deeplearning4j.models.sequencevectors.listeners.SerializingListener [^SerializingListener$Builder this]
    (-> this (.build))))

