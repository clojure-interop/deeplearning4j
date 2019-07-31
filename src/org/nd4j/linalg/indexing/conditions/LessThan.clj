(ns org.nd4j.linalg.indexing.conditions.LessThan
  "Created by agibsonccc on 10/8/14."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.indexing.conditions LessThan]))

(defn ->less-than
  "Constructor.

  Special constructor for pairwise boolean operations."
  (^LessThan []
    (new LessThan ))
  (^LessThan [^java.lang.Number value]
    (new LessThan value)))

(defn condtion-num
  "Returns condition ID for native side

  returns: `int`"
  (^Integer [^LessThan this]
    (-> this (.condtionNum))))

(defn apply
  "input - `java.lang.Number`

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^LessThan this ^java.lang.Number input]
    (-> this (.apply input))))

