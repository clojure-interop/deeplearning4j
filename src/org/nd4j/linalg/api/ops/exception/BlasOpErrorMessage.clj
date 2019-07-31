(ns org.nd4j.linalg.api.ops.exception.BlasOpErrorMessage
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.exception BlasOpErrorMessage]))

(defn ->blas-op-error-message
  "Constructor.

  op - `org.nd4j.linalg.api.ops.Op`"
  (^BlasOpErrorMessage [^org.nd4j.linalg.api.ops.Op op]
    (new BlasOpErrorMessage op)))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BlasOpErrorMessage this]
    (-> this (.toString))))

