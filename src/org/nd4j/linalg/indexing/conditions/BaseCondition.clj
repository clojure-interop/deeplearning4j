(ns org.nd4j.linalg.indexing.conditions.BaseCondition
  "Created by agibsonccc on 10/8/14."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.indexing.conditions BaseCondition]))

(defn ->base-condition
  "Constructor.

  value - `java.lang.Number`"
  (^BaseCondition [^java.lang.Number value]
    (new BaseCondition value)))

(defn eps-threshold
  "returns: `double`"
  (^Double [^BaseCondition this]
    (-> this (.epsThreshold))))

(defn get-value
  "returns: `double`"
  (^Double [^BaseCondition this]
    (-> this (.getValue))))

