(ns org.nd4j.linalg.exception.ND4UnresolvedOutputVariables
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.exception ND4UnresolvedOutputVariables]))

(defn ->nd-4-unresolved-output-variables
  "Constructor.

  message - `java.lang.String`
  cause - `java.lang.Throwable`"
  (^ND4UnresolvedOutputVariables [^java.lang.String message ^java.lang.Throwable cause]
    (new ND4UnresolvedOutputVariables message cause))
  (^ND4UnresolvedOutputVariables [^java.lang.String message]
    (new ND4UnresolvedOutputVariables message)))

