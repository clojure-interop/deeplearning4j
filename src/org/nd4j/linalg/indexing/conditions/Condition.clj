(ns org.nd4j.linalg.indexing.conditions.Condition
  "Condition for boolean indexing"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.indexing.conditions Condition]))

(defn condtion-num
  "Returns condition ID for native side

  returns: `int`"
  (^Integer [^Condition this]
    (-> this (.condtionNum))))

(defn get-value
  "returns: `double`"
  (^Double [^Condition this]
    (-> this (.getValue))))

(defn eps-threshold
  "returns: `double`"
  (^Double [^Condition this]
    (-> this (.epsThreshold))))

(defn apply
  "input - `java.lang.Number`

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^Condition this ^java.lang.Number input]
    (-> this (.apply input))))

