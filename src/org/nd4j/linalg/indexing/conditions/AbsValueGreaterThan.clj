(ns org.nd4j.linalg.indexing.conditions.AbsValueGreaterThan
  "Boolean condition on absolute value: abs(x) > value"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.indexing.conditions AbsValueGreaterThan]))

(defn ->abs-value-greater-than
  "Constructor.

  Special constructor for pairwise boolean operations."
  (^AbsValueGreaterThan []
    (new AbsValueGreaterThan ))
  (^AbsValueGreaterThan [^java.lang.Number value]
    (new AbsValueGreaterThan value)))

(defn condtion-num
  "Returns condition ID for native side

  returns: `int`"
  (^Integer [^AbsValueGreaterThan this]
    (-> this (.condtionNum))))

(defn apply
  "input - `java.lang.Number`

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^AbsValueGreaterThan this ^java.lang.Number input]
    (-> this (.apply input))))

