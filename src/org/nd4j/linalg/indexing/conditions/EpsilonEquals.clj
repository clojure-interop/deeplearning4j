(ns org.nd4j.linalg.indexing.conditions.EpsilonEquals
  "Created by agibsonccc on 10/8/14."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.indexing.conditions EpsilonEquals]))

(defn ->epsilon-equals
  "Constructor.

  Special constructor for pairwise boolean operations."
  (^EpsilonEquals []
    (new EpsilonEquals ))
  (^EpsilonEquals [^java.lang.Number value ^java.lang.Number eps]
    (new EpsilonEquals value eps))
  (^EpsilonEquals [^java.lang.Number value]
    (new EpsilonEquals value)))

(defn eps-threshold
  "returns: `double`"
  (^Double [^EpsilonEquals this]
    (-> this (.epsThreshold))))

(defn condtion-num
  "Returns condition ID for native side

  returns: `int`"
  (^Integer [^EpsilonEquals this]
    (-> this (.condtionNum))))

(defn apply
  "input - `java.lang.Number`

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^EpsilonEquals this ^java.lang.Number input]
    (-> this (.apply input))))

