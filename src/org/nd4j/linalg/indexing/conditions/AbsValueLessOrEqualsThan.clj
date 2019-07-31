(ns org.nd4j.linalg.indexing.conditions.AbsValueLessOrEqualsThan
  "Boolean condition on absolute value: abs(x) <= value"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.indexing.conditions AbsValueLessOrEqualsThan]))

(defn ->abs-value-less-or-equals-than
  "Constructor.

  Special constructor for pairwise boolean operations."
  (^AbsValueLessOrEqualsThan []
    (new AbsValueLessOrEqualsThan ))
  (^AbsValueLessOrEqualsThan [^java.lang.Number value]
    (new AbsValueLessOrEqualsThan value)))

(defn condtion-num
  "Returns condition ID for native side

  returns: `int`"
  (^Integer [^AbsValueLessOrEqualsThan this]
    (-> this (.condtionNum))))

(defn apply
  "input - `java.lang.Number`

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^AbsValueLessOrEqualsThan this ^java.lang.Number input]
    (-> this (.apply input))))

