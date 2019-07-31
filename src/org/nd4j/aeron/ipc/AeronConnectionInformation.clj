(ns org.nd4j.aeron.ipc.AeronConnectionInformation
  "Aeron connection information
 pojo.
 connectionHost represents the host for the media driver
 connection host represents the port
 stream represents the stream id to connect to"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.aeron.ipc AeronConnectionInformation]))

(defn ->aeron-connection-information
  "Constructor."
  (^AeronConnectionInformation []
    (new AeronConnectionInformation )))

(defn *of
  "Traditional static generator method

  connection-host - `java.lang.String`
  connection-port - `int`
  stream-id - `int`

  returns: `org.nd4j.aeron.ipc.AeronConnectionInformation`"
  (^org.nd4j.aeron.ipc.AeronConnectionInformation [^java.lang.String connection-host ^Integer connection-port ^Integer stream-id]
    (AeronConnectionInformation/of connection-host connection-port stream-id)))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^AeronConnectionInformation this]
    (-> this (.toString))))

