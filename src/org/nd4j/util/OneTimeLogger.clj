(ns org.nd4j.util.OneTimeLogger
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.util OneTimeLogger]))

(defn ->one-time-logger
  "Constructor."
  (^OneTimeLogger []
    (new OneTimeLogger )))

(defn *info
  "logger - `org.slf4j.Logger`
  format - `java.lang.String`
  arguments - `java.lang.Object`"
  ([^org.slf4j.Logger logger ^java.lang.String format ^java.lang.Object arguments]
    (OneTimeLogger/info logger format arguments)))

(defn *warn
  "logger - `org.slf4j.Logger`
  format - `java.lang.String`
  arguments - `java.lang.Object`"
  ([^org.slf4j.Logger logger ^java.lang.String format ^java.lang.Object arguments]
    (OneTimeLogger/warn logger format arguments)))

(defn *error
  "logger - `org.slf4j.Logger`
  format - `java.lang.String`
  arguments - `java.lang.Object`"
  ([^org.slf4j.Logger logger ^java.lang.String format ^java.lang.Object arguments]
    (OneTimeLogger/error logger format arguments)))

(defn *reset
  ""
  ([]
    (OneTimeLogger/reset )))

