(ns org.nd4j.linalg.indexing.conditions.ConditionEquals
  "Returns true when all of the conditions equal each other"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.indexing.conditions ConditionEquals]))

(defn ->condition-equals
  "Constructor.

  conditions - `org.nd4j.linalg.indexing.conditions.Condition`"
  (^ConditionEquals [^org.nd4j.linalg.indexing.conditions.Condition conditions]
    (new ConditionEquals conditions)))

(defn condtion-num
  "Returns condition ID for native side

  returns: `int`"
  (^Integer [^ConditionEquals this]
    (-> this (.condtionNum))))

(defn get-value
  "returns: `double`"
  (^Double [^ConditionEquals this]
    (-> this (.getValue))))

(defn eps-threshold
  "returns: `double`"
  (^Double [^ConditionEquals this]
    (-> this (.epsThreshold))))

(defn apply
  "input - `java.lang.Number`

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^ConditionEquals this ^java.lang.Number input]
    (-> this (.apply input))))

