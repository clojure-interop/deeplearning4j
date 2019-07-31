(ns org.nd4j.linalg.env.impl.DebugAction
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.env.impl DebugAction]))

(defn ->debug-action
  "Constructor."
  (^DebugAction []
    (new DebugAction )))

(defn target-variable
  "Description copied from interface: EnvironmentalAction

  returns: `java.lang.String`"
  (^java.lang.String [^DebugAction this]
    (-> this (.targetVariable))))

(defn process
  "Description copied from interface: EnvironmentalAction

  value - `java.lang.String`"
  ([^DebugAction this ^java.lang.String value]
    (-> this (.process value))))

