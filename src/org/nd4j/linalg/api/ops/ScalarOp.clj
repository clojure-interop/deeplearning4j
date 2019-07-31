(ns org.nd4j.linalg.api.ops.ScalarOp
  "Applies a scalar
 along a bigger input array."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops ScalarOp]))

(defn scalar
  "The normal scalar

  returns: the scalar - `java.lang.Number`"
  (^java.lang.Number [^ScalarOp this]
    (-> this (.scalar))))

(defn set-scalar
  "scalar - `java.lang.Number`"
  ([^ScalarOp this ^java.lang.Number scalar]
    (-> this (.setScalar scalar))))

