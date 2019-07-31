(ns org.nd4j.linalg.indexing.conditions.NotEqualsCondition
  "Created by agibsonccc on 10/8/14."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.indexing.conditions NotEqualsCondition]))

(defn ->not-equals-condition
  "Constructor.

  value - `java.lang.Number`"
  (^NotEqualsCondition [^java.lang.Number value]
    (new NotEqualsCondition value)))

(defn condtion-num
  "Returns condition ID for native side

  returns: `int`"
  (^Integer [^NotEqualsCondition this]
    (-> this (.condtionNum))))

(defn apply
  "input - `java.lang.Number`

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^NotEqualsCondition this ^java.lang.Number input]
    (-> this (.apply input))))

