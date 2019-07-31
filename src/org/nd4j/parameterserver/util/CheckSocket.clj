(ns org.nd4j.parameterserver.util.CheckSocket
  "Credit: http://stackoverflow.com/questions/5226905/test-if-remote-port-is-in-use"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.util CheckSocket]))

(defn ->check-socket
  "Constructor."
  (^CheckSocket []
    (new CheckSocket )))

(defn *remote-port-taken
  "Check if a remote port is taken

  node - the host to check - `java.lang.String`
  port - the port to check - `int`
  timeout - the timeout for the connection - `int`

  returns: true if the port is taken false otherwise - `boolean`"
  (^Boolean [^java.lang.String node ^Integer port ^Integer timeout]
    (CheckSocket/remotePortTaken node port timeout)))

