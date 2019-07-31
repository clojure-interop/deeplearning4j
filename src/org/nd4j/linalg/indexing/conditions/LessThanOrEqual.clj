(ns org.nd4j.linalg.indexing.conditions.LessThanOrEqual
  "Created by agibsonccc on 10/8/14."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.indexing.conditions LessThanOrEqual]))

(defn ->less-than-or-equal
  "Constructor.

  Special constructor for pairwise boolean operations."
  (^LessThanOrEqual []
    (new LessThanOrEqual ))
  (^LessThanOrEqual [^java.lang.Number value]
    (new LessThanOrEqual value)))

(defn condtion-num
  "Returns condition ID for native side

  returns: `int`"
  (^Integer [^LessThanOrEqual this]
    (-> this (.condtionNum))))

(defn apply
  "input - `java.lang.Number`

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^LessThanOrEqual this ^java.lang.Number input]
    (-> this (.apply input))))

