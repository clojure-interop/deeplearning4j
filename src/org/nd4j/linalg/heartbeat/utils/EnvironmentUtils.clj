(ns org.nd4j.linalg.heartbeat.utils.EnvironmentUtils
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.heartbeat.utils EnvironmentUtils]))

(defn ->environment-utils
  "Constructor."
  (^EnvironmentUtils []
    (new EnvironmentUtils )))

(defn *build-environment
  "This method build

  returns: `org.nd4j.linalg.heartbeat.reports.Environment`"
  (^org.nd4j.linalg.heartbeat.reports.Environment []
    (EnvironmentUtils/buildEnvironment )))

(defn *build-c-id
  "returns: `long`"
  (^Long []
    (EnvironmentUtils/buildCId )))

