(ns org.nd4j.linalg.heartbeat.reports.Environment
  "Bean/POJO that describes current jvm/node"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.heartbeat.reports Environment]))

(defn ->environment
  "Constructor."
  (^Environment []
    (new Environment )))

(defn to-compact-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Environment this]
    (-> this (.toCompactString))))

