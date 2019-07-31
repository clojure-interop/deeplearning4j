(ns org.nd4j.linalg.factory.Nd4jBackend$NoAvailableBackendException
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.factory Nd4jBackend$NoAvailableBackendException]))

(defn ->no-available-backend-exception
  "Constructor.

  Constructs a new exception with the specified cause and a detail
  message of (cause==null ? null : cause.toString()) (which
  typically contains the class and detail message of cause).
  This constructor is useful for exceptions that are little more than
  wrappers for other throwables (for example, PrivilegedActionException).

  cause - the cause (which is saved for later retrieval by theThrowable.getCause() method). (A null value ispermitted, and indicates that the cause is nonexistent orunknown.) - `java.lang.Throwable`"
  (^Nd4jBackend$NoAvailableBackendException [^java.lang.Throwable cause]
    (new Nd4jBackend$NoAvailableBackendException cause)))

