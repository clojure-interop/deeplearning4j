(ns org.nd4j.linalg.indexing.conditions.AbsValueLessThan
  "Boolean condition on absolute value: abs(x) < value"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.indexing.conditions AbsValueLessThan]))

(defn ->abs-value-less-than
  "Constructor.

  Special constructor for pairwise boolean operations."
  (^AbsValueLessThan []
    (new AbsValueLessThan ))
  (^AbsValueLessThan [^java.lang.Number value]
    (new AbsValueLessThan value)))

(defn condtion-num
  "Returns condition ID for native side

  returns: `int`"
  (^Integer [^AbsValueLessThan this]
    (-> this (.condtionNum))))

(defn apply
  "input - `java.lang.Number`

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^AbsValueLessThan this ^java.lang.Number input]
    (-> this (.apply input))))

