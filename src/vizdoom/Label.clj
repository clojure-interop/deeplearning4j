(ns vizdoom.Label
  (:refer-clojure :only [require comment defn ->])
  (:import [vizdoom Label]))

(defn object-id
  "Instance Field.

  type: int"
  (^Integer [^Label this]
    (-> this .-objectId)))

(defn object-name
  "Instance Field.

  type: java.lang.String"
  (^java.lang.String [^Label this]
    (-> this .-objectName)))

(defn value
  "Instance Field.

  type: byte"
  (^Byte [^Label this]
    (-> this .-value)))

(defn object-position-x
  "Instance Field.

  type: double"
  (^Double [^Label this]
    (-> this .-objectPositionX)))

(defn object-position-y
  "Instance Field.

  type: double"
  (^Double [^Label this]
    (-> this .-objectPositionY)))

(defn object-position-z
  "Instance Field.

  type: double"
  (^Double [^Label this]
    (-> this .-objectPositionZ)))

