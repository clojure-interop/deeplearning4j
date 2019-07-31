(ns org.nd4j.linalg.indexing.conditions.EpsilonNotEquals
  "Created by agibsonccc on 10/8/14."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.indexing.conditions EpsilonNotEquals]))

(defn ->epsilon-not-equals
  "Constructor.

  Special constructor for pairwise boolean operations."
  (^EpsilonNotEquals []
    (new EpsilonNotEquals ))
  (^EpsilonNotEquals [^java.lang.Number value ^java.lang.Number eps]
    (new EpsilonNotEquals value eps))
  (^EpsilonNotEquals [^java.lang.Number value]
    (new EpsilonNotEquals value)))

(defn condtion-num
  "Returns condition ID for native side

  returns: `int`"
  (^Integer [^EpsilonNotEquals this]
    (-> this (.condtionNum))))

(defn eps-threshold
  "returns: `double`"
  (^Double [^EpsilonNotEquals this]
    (-> this (.epsThreshold))))

(defn apply
  "input - `java.lang.Number`

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^EpsilonNotEquals this ^java.lang.Number input]
    (-> this (.apply input))))

