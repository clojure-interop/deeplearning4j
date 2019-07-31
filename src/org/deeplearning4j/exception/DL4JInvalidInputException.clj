(ns org.deeplearning4j.exception.DL4JInvalidInputException
  "DL4J Exception thrown when invalid input is provided (wrong rank, wrong size, etc)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.exception DL4JInvalidInputException]))

(defn ->dl-4-j-invalid-input-exception
  "Constructor.

  message - `java.lang.String`
  cause - `java.lang.Throwable`"
  (^DL4JInvalidInputException [^java.lang.String message ^java.lang.Throwable cause]
    (new DL4JInvalidInputException message cause))
  (^DL4JInvalidInputException [^java.lang.String message]
    (new DL4JInvalidInputException message))
  (^DL4JInvalidInputException []
    (new DL4JInvalidInputException )))

