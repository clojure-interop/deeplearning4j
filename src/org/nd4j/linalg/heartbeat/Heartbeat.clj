(ns org.nd4j.linalg.heartbeat.Heartbeat
  "Heartbeat implementation for ND4j"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.heartbeat Heartbeat]))

(defn *get-instance
  "returns: `org.nd4j.linalg.heartbeat.Heartbeat`"
  (^org.nd4j.linalg.heartbeat.Heartbeat []
    (Heartbeat/getInstance )))

(defn disable-heartbeat
  ""
  ([^Heartbeat this]
    (-> this (.disableHeartbeat))))

(defn report-event
  "event - `org.nd4j.linalg.heartbeat.reports.Event`
  environment - `org.nd4j.linalg.heartbeat.reports.Environment`
  task - `org.nd4j.linalg.heartbeat.reports.Task`"
  ([^Heartbeat this ^org.nd4j.linalg.heartbeat.reports.Event event ^org.nd4j.linalg.heartbeat.reports.Environment environment ^org.nd4j.linalg.heartbeat.reports.Task task]
    (-> this (.reportEvent event environment task))))

(defn derived-id
  "id - `long`"
  ([^Heartbeat this ^Long id]
    (-> this (.derivedId id))))

