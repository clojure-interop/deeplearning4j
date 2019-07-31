(ns org.nd4j.linalg.indexing.conditions.IsNaN
  "Condition for whether an element is NaN"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.indexing.conditions IsNaN]))

(defn ->is-na-n
  "Constructor."
  (^IsNaN []
    (new IsNaN )))

(defn condtion-num
  "Returns condition ID for native side

  returns: `int`"
  (^Integer [^IsNaN this]
    (-> this (.condtionNum))))

(defn apply
  "input - `java.lang.Number`

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^IsNaN this ^java.lang.Number input]
    (-> this (.apply input))))

