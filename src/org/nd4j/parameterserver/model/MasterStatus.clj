(ns org.nd4j.parameterserver.model.MasterStatus
  "Status of a master node, covered
 both by the master node itself and its responder."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.model MasterStatus]))

(defn ->master-status
  "Constructor."
  (^MasterStatus []
    (new MasterStatus )))

(defn started
  "Returns true if bth
  the master and responder are started.

  returns: `boolean`"
  (^Boolean [^MasterStatus this]
    (-> this (.started))))

