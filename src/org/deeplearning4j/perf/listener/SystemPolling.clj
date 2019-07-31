(ns org.deeplearning4j.perf.listener.SystemPolling
  "Poll a system for its local statistics with a specified time.
 The polling process will output a yaml file
 in the specified output directory
 with all the related system diagnostics."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.perf.listener SystemPolling]))

(defn run
  "Run the polling in the background as a thread pool
  running every pollEveryMillis milliseconds"
  ([^SystemPolling this]
    (-> this (.run))))

(defn stop-polling
  "Shut down the background polling"
  ([^SystemPolling this]
    (-> this (.stopPolling))))

