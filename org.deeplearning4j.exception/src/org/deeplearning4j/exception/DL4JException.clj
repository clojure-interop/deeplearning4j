(ns org.deeplearning4j.exception.DL4JException
  "Base exception for DL4J"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.exception DL4JException]))

(defn ->dl-4-j-exception
  "Constructor.

  message - `java.lang.String`
  cause - `java.lang.Throwable`"
  (^DL4JException [^java.lang.String message ^java.lang.Throwable cause]
    (new DL4JException message cause))
  (^DL4JException [^java.lang.String message]
    (new DL4JException message))
  (^DL4JException []
    (new DL4JException )))

