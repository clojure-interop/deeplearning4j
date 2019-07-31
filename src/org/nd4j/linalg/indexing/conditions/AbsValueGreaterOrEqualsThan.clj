(ns org.nd4j.linalg.indexing.conditions.AbsValueGreaterOrEqualsThan
  "Boolean condition on absolute value: abs(x) >= value"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.indexing.conditions AbsValueGreaterOrEqualsThan]))

(defn ->abs-value-greater-or-equals-than
  "Constructor.

  Special constructor for pairwise boolean operations."
  (^AbsValueGreaterOrEqualsThan []
    (new AbsValueGreaterOrEqualsThan ))
  (^AbsValueGreaterOrEqualsThan [^java.lang.Number value]
    (new AbsValueGreaterOrEqualsThan value)))

(defn condtion-num
  "Returns condition ID for native side

  returns: `int`"
  (^Integer [^AbsValueGreaterOrEqualsThan this]
    (-> this (.condtionNum))))

(defn apply
  "input - `java.lang.Number`

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^AbsValueGreaterOrEqualsThan this ^java.lang.Number input]
    (-> this (.apply input))))

