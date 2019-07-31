(ns org.deeplearning4j.optimize.solvers.accumulation.Registerable
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.optimize.solvers.accumulation Registerable]))

(defn register-consumers
  "This method notifies producer about number of consumers for the current consumption cycle

  num-consumers - `int`"
  ([^Registerable this ^Integer num-consumers]
    (-> this (.registerConsumers num-consumers))))

(defn fallback-to-single-consumer-mode
  "This method enables/disables bypass mode

  really-fallback - `boolean`"
  ([^Registerable this ^Boolean really-fallback]
    (-> this (.fallbackToSingleConsumerMode really-fallback))))

