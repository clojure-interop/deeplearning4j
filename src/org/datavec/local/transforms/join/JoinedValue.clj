(ns org.datavec.local.transforms.join.JoinedValue
  "Simple helper class for executing joins"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.local.transforms.join JoinedValue]))

(defn ->joined-value
  "Constructor."
  (^JoinedValue []
    (new JoinedValue )))

