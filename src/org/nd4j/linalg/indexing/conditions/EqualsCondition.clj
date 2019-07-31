(ns org.nd4j.linalg.indexing.conditions.EqualsCondition
  "Created by agibsonccc on 10/8/14."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.indexing.conditions EqualsCondition]))

(defn ->equals-condition
  "Constructor.

  Special constructor for pairwise boolean operations."
  (^EqualsCondition []
    (new EqualsCondition ))
  (^EqualsCondition [^java.lang.Number value]
    (new EqualsCondition value)))

(defn condtion-num
  "Returns condition ID for native side

  returns: `int`"
  (^Integer [^EqualsCondition this]
    (-> this (.condtionNum))))

(defn apply
  "input - `java.lang.Number`

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^EqualsCondition this ^java.lang.Number input]
    (-> this (.apply input))))

