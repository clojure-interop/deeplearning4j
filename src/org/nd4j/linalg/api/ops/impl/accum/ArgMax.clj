(ns org.nd4j.linalg.api.ops.impl.accum.ArgMax
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.accum ArgMax]))

(defn ->arg-max
  "Constructor."
  (^ArgMax []
    (new ArgMax )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^ArgMax this]
    (-> this (.opName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^ArgMax this]
    (-> this (.tensorflowName))))

