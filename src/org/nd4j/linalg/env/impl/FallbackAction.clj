(ns org.nd4j.linalg.env.impl.FallbackAction
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.env.impl FallbackAction]))

(defn ->fallback-action
  "Constructor."
  (^FallbackAction []
    (new FallbackAction )))

(defn target-variable
  "Description copied from interface: EnvironmentalAction

  returns: `java.lang.String`"
  (^java.lang.String [^FallbackAction this]
    (-> this (.targetVariable))))

(defn process
  "Description copied from interface: EnvironmentalAction

  value - `java.lang.String`"
  ([^FallbackAction this ^java.lang.String value]
    (-> this (.process value))))

