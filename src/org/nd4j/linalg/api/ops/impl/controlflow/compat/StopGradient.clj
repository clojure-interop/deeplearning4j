(ns org.nd4j.linalg.api.ops.impl.controlflow.compat.StopGradient
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.controlflow.compat StopGradient]))

(defn ->stop-gradient
  "Constructor."
  (^StopGradient []
    (new StopGradient )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^StopGradient this]
    (-> this (.opName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^StopGradient this]
    (-> this (.tensorflowName))))

