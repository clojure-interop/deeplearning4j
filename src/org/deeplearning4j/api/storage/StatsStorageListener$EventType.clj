(ns org.deeplearning4j.api.storage.StatsStorageListener$EventType
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.api.storage StatsStorageListener$EventType]))

(def NewSessionID
  "Enum Constant.

  type: org.deeplearning4j.api.storage.StatsStorageListener$EventType"
  StatsStorageListener$EventType/NewSessionID)

(def NewTypeID
  "Enum Constant.

  type: org.deeplearning4j.api.storage.StatsStorageListener$EventType"
  StatsStorageListener$EventType/NewTypeID)

(def NewWorkerID
  "Enum Constant.

  type: org.deeplearning4j.api.storage.StatsStorageListener$EventType"
  StatsStorageListener$EventType/NewWorkerID)

(def PostMetaData
  "Enum Constant.

  type: org.deeplearning4j.api.storage.StatsStorageListener$EventType"
  StatsStorageListener$EventType/PostMetaData)

(def PostStaticInfo
  "Enum Constant.

  type: org.deeplearning4j.api.storage.StatsStorageListener$EventType"
  StatsStorageListener$EventType/PostStaticInfo)

(def PostUpdate
  "Enum Constant.

  type: org.deeplearning4j.api.storage.StatsStorageListener$EventType"
  StatsStorageListener$EventType/PostUpdate)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (StatsStorageListener.EventType c : StatsStorageListener.EventType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.deeplearning4j.api.storage.StatsStorageListener$EventType[]`"
  ([]
    (StatsStorageListener$EventType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.deeplearning4j.api.storage.StatsStorageListener$EventType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.deeplearning4j.api.storage.StatsStorageListener$EventType [^java.lang.String name]
    (StatsStorageListener$EventType/valueOf name)))

