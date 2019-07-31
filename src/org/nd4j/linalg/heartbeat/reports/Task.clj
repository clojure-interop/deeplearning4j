(ns org.nd4j.linalg.heartbeat.reports.Task
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.heartbeat.reports Task]))

(defn ->task
  "Constructor."
  (^Task []
    (new Task )))

(defn to-compact-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Task this]
    (-> this (.toCompactString))))

