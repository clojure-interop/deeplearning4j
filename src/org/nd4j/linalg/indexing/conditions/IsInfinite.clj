(ns org.nd4j.linalg.indexing.conditions.IsInfinite
  "Created by agibsonccc on 10/8/14."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.indexing.conditions IsInfinite]))

(defn ->is-infinite
  "Constructor."
  (^IsInfinite []
    (new IsInfinite )))

(defn condtion-num
  "Returns condition ID for native side

  returns: `int`"
  (^Integer [^IsInfinite this]
    (-> this (.condtionNum))))

(defn apply
  "input - `java.lang.Number`

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^IsInfinite this ^java.lang.Number input]
    (-> this (.apply input))))

