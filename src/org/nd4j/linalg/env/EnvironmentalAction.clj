(ns org.nd4j.linalg.env.EnvironmentalAction
  "This interface describes action applied to a given environment variable"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.env EnvironmentalAction]))

(defn target-variable
  "This method returns target environemt variable for this action

  returns: `java.lang.String`"
  (^java.lang.String [^EnvironmentalAction this]
    (-> this (.targetVariable))))

(defn process
  "This method will be executed with corresponding Env Var value

  value - `java.lang.String`"
  ([^EnvironmentalAction this ^java.lang.String value]
    (-> this (.process value))))

