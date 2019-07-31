(ns org.nd4j.linalg.api.blas.BlasException
  "General exception for Blas library errors"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.blas BlasException]))

(defn ->blas-exception
  "Constructor.

  Principal constructor - error message & error code

  message - the error message to put into the Exception - `java.lang.String`
  error-code - the library error number - `int`"
  (^BlasException [^java.lang.String message ^Integer error-code]
    (new BlasException message error-code))
  (^BlasException [^java.lang.String message]
    (new BlasException message)))

(def *-serial-version-uid
  "Static Constant.

  type: long"
  BlasException/serialVersionUID)

(def *-unknown-error
  "Static Constant.

  type: int"
  BlasException/UNKNOWN_ERROR)

(defn get-error-code
  "returns: `int`"
  (^Integer [^BlasException this]
    (-> this (.getErrorCode))))

