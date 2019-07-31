(ns org.nd4j.linalg.indexing.conditions.Or
  "An or between 2 conditions."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.indexing.conditions Or]))

(defn ->or
  "Constructor.

  conditions - `org.nd4j.linalg.indexing.conditions.Condition`"
  (^Or [^org.nd4j.linalg.indexing.conditions.Condition conditions]
    (new Or conditions)))

(defn condtion-num
  "Returns condition ID for native side

  returns: `int`"
  (^Integer [^Or this]
    (-> this (.condtionNum))))

(defn get-value
  "returns: `double`"
  (^Double [^Or this]
    (-> this (.getValue))))

(defn apply
  "input - `java.lang.Number`

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^Or this ^java.lang.Number input]
    (-> this (.apply input))))

(defn eps-threshold
  "returns: `double`"
  (^Double [^Or this]
    (-> this (.epsThreshold))))

