(ns org.deeplearning4j.exception.DL4JInvalidConfigException
  "Exception signifying that the specified configuration is invalid"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.exception DL4JInvalidConfigException]))

(defn ->dl-4-j-invalid-config-exception
  "Constructor.

  message - `java.lang.String`
  cause - `java.lang.Throwable`"
  (^DL4JInvalidConfigException [^java.lang.String message ^java.lang.Throwable cause]
    (new DL4JInvalidConfigException message cause))
  (^DL4JInvalidConfigException [^java.lang.String message]
    (new DL4JInvalidConfigException message))
  (^DL4JInvalidConfigException []
    (new DL4JInvalidConfigException )))

