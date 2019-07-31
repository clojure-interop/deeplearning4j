(ns org.deeplearning4j.nn.conf.inputs.InvalidInputTypeException
  "InvalidInputTypeException: Thrown if the GraphVertex cannot handle the type of input provided."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.inputs InvalidInputTypeException]))

(defn ->invalid-input-type-exception
  "Constructor.

  message - `java.lang.String`
  cause - `java.lang.Throwable`"
  (^InvalidInputTypeException [^java.lang.String message ^java.lang.Throwable cause]
    (new InvalidInputTypeException message cause))
  (^InvalidInputTypeException [^java.lang.String message]
    (new InvalidInputTypeException message)))

