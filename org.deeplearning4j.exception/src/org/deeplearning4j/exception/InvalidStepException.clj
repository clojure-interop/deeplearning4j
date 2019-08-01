(ns org.deeplearning4j.exception.InvalidStepException
  "Created by agibsonccc on 8/20/14."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.exception InvalidStepException]))

(defn ->invalid-step-exception
  "Constructor.

  Constructs a new exception with the specified detail message and
  cause. Note that the detail message associated with
  cause is not automatically incorporated in
  this exception's detail message.

  message - the detail message (which is saved for later retrievalby the Throwable.getMessage() method). - `java.lang.String`
  cause - the cause (which is saved for later retrieval by theThrowable.getCause() method). (A null value ispermitted, and indicates that the cause is nonexistent orunknown.) - `java.lang.Throwable`"
  (^InvalidStepException [^java.lang.String message ^java.lang.Throwable cause]
    (new InvalidStepException message cause))
  (^InvalidStepException [^java.lang.String message]
    (new InvalidStepException message)))

