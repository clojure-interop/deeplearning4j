(ns org.nd4j.parameterserver.model.SlaveConnectionInfo
  "Slave connection info,
 including the connection url,
 and the associated master."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.model SlaveConnectionInfo]))

(defn ->slave-connection-info
  "Constructor."
  (^SlaveConnectionInfo []
    (new SlaveConnectionInfo )))

