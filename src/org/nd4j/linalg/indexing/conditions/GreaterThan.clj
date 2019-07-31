(ns org.nd4j.linalg.indexing.conditions.GreaterThan
  "Created by agibsonccc on 10/8/14."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.indexing.conditions GreaterThan]))

(defn ->greater-than
  "Constructor.

  Special constructor for pairwise boolean operations."
  (^GreaterThan []
    (new GreaterThan ))
  (^GreaterThan [^java.lang.Number value]
    (new GreaterThan value)))

(defn condtion-num
  "Returns condition ID for native side

  returns: `int`"
  (^Integer [^GreaterThan this]
    (-> this (.condtionNum))))

(defn apply
  "input - `java.lang.Number`

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^GreaterThan this ^java.lang.Number input]
    (-> this (.apply input))))

