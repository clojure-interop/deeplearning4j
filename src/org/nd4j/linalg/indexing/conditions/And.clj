(ns org.nd4j.linalg.indexing.conditions.And
  "Created by agibsonccc on 10/9/14."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.indexing.conditions And]))

(defn ->and
  "Constructor.

  conditions - `org.nd4j.linalg.indexing.conditions.Condition`"
  (^And [^org.nd4j.linalg.indexing.conditions.Condition conditions]
    (new And conditions)))

(defn condtion-num
  "Returns condition ID for native side

  returns: `int`"
  (^Integer [^And this]
    (-> this (.condtionNum))))

(defn get-value
  "returns: `double`"
  (^Double [^And this]
    (-> this (.getValue))))

(defn eps-threshold
  "returns: `double`"
  (^Double [^And this]
    (-> this (.epsThreshold))))

(defn apply
  "input - `java.lang.Number`

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^And this ^java.lang.Number input]
    (-> this (.apply input))))

