(ns org.nd4j.parameterserver.model.SlaveStatus
  "The slave status of whether the
 slave node is started or not."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.model SlaveStatus]))

(defn ->slave-status
  "Constructor."
  (^SlaveStatus []
    (new SlaveStatus )))

(defn started
  "Whether the slavenode is started or not.

  returns: `boolean`"
  (^Boolean [^SlaveStatus this]
    (-> this (.started))))

