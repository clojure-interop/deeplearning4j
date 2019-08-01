(ns org.datavec.api.exceptions.DataVecException
  "DataVec exception"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.exceptions DataVecException]))

(defn ->data-vec-exception
  "Constructor.

  message - `java.lang.String`
  cause - `java.lang.Throwable`"
  (^DataVecException [^java.lang.String message ^java.lang.Throwable cause]
    (new DataVecException message cause))
  (^DataVecException [^java.lang.String message]
    (new DataVecException message))
  (^DataVecException []
    (new DataVecException )))

