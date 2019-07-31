(ns org.nd4j.linalg.indexing.conditions.GreaterThanOrEqual
  "Created by agibsonccc on 10/8/14."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.indexing.conditions GreaterThanOrEqual]))

(defn ->greater-than-or-equal
  "Constructor.

  Special constructor for pairwise boolean operations."
  (^GreaterThanOrEqual []
    (new GreaterThanOrEqual ))
  (^GreaterThanOrEqual [^java.lang.Number value]
    (new GreaterThanOrEqual value)))

(defn condtion-num
  "Returns condition ID for native side

  returns: `int`"
  (^Integer [^GreaterThanOrEqual this]
    (-> this (.condtionNum))))

(defn apply
  "input - `java.lang.Number`

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^GreaterThanOrEqual this ^java.lang.Number input]
    (-> this (.apply input))))

