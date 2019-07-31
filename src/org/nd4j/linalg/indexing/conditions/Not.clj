(ns org.nd4j.linalg.indexing.conditions.Not
  "Created by agibsonccc on 10/9/14."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.indexing.conditions Not]))

(defn ->not
  "Constructor.

  condition - `org.nd4j.linalg.indexing.conditions.Condition`"
  (^Not [^org.nd4j.linalg.indexing.conditions.Condition condition]
    (new Not condition)))

(defn condtion-num
  "Returns condition ID for native side

  returns: `int`"
  (^Integer [^Not this]
    (-> this (.condtionNum))))

(defn get-value
  "returns: `double`"
  (^Double [^Not this]
    (-> this (.getValue))))

(defn apply
  "input - `java.lang.Number`

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^Not this ^java.lang.Number input]
    (-> this (.apply input))))

(defn eps-threshold
  "returns: `double`"
  (^Double [^Not this]
    (-> this (.epsThreshold))))

