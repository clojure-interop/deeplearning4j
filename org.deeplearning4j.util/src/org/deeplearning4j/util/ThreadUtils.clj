(ns org.deeplearning4j.util.ThreadUtils
  "Utils for the basic use and flow of threads."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.util ThreadUtils]))

(defn ->thread-utils
  "Constructor."
  (^ThreadUtils []
    (new ThreadUtils )))

(defn *unchecked-sleep
  "millis - `long`"
  ([^Long millis]
    (ThreadUtils/uncheckedSleep millis)))

