(ns org.datavec.spark.transform.join.JoinedValue
  "Simple helper class for executing joins"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.join JoinedValue]))

(defn ->joined-value
  "Constructor."
  (^JoinedValue []
    (new JoinedValue )))

