(ns org.deeplearning4j.malmo.MalmoConnectionError
  "Exception thrown when Malmo cannot connect to a client after multiple retries"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.malmo MalmoConnectionError]))

(defn ->malmo-connection-error
  "Constructor.

  string - `java.lang.String`"
  (^MalmoConnectionError [^java.lang.String string]
    (new MalmoConnectionError string)))

