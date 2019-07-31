(ns org.nd4j.linalg.env.impl.VerboseAction
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.env.impl VerboseAction]))

(defn ->verbose-action
  "Constructor."
  (^VerboseAction []
    (new VerboseAction )))

(defn target-variable
  "Description copied from interface: EnvironmentalAction

  returns: `java.lang.String`"
  (^java.lang.String [^VerboseAction this]
    (-> this (.targetVariable))))

(defn process
  "Description copied from interface: EnvironmentalAction

  value - `java.lang.String`"
  ([^VerboseAction this ^java.lang.String value]
    (-> this (.process value))))

