(ns org.deeplearning4j.util.ModelGuesserException
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.util ModelGuesserException]))

(defn ->model-guesser-exception
  "Constructor.

  message - `java.lang.String`
  cause - `java.lang.Throwable`"
  (^ModelGuesserException [^java.lang.String message ^java.lang.Throwable cause]
    (new ModelGuesserException message cause))
  (^ModelGuesserException [^java.lang.String message]
    (new ModelGuesserException message)))

