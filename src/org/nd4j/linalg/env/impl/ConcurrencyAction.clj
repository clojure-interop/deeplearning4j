(ns org.nd4j.linalg.env.impl.ConcurrencyAction
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.env.impl ConcurrencyAction]))

(defn ->concurrency-action
  "Constructor."
  (^ConcurrencyAction []
    (new ConcurrencyAction )))

(defn target-variable
  "Description copied from interface: EnvironmentalAction

  returns: `java.lang.String`"
  (^java.lang.String [^ConcurrencyAction this]
    (-> this (.targetVariable))))

(defn process
  "Description copied from interface: EnvironmentalAction

  value - `java.lang.String`"
  ([^ConcurrencyAction this ^java.lang.String value]
    (-> this (.process value))))

