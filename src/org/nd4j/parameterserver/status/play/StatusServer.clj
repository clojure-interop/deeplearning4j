(ns org.nd4j.parameterserver.status.play.StatusServer
  "Play server for communicating
 the status of
 the subscriber daemon.
 This is a rest server for communicating
 information such as whether the server is started or ont
 as well as additional connection information.
 This is mainly meant for internal use."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.status.play StatusServer]))

(defn ->status-server
  "Constructor."
  (^StatusServer []
    (new StatusServer )))

(defn *start-server
  "Start a server based on the given subscriber.
  Note that for the port to start the server on, you should
  set the statusServerPortField on the subscriber
  either manually or via command line. The
  server defaults to port 9000.
  The end points are:
  /opType: returns the opType information (master/slave)
  /started: if it's a master node, it returns master:started/stopped and responder:started/stopped
  /connectioninfo: See the SlaveConnectionInfo and MasterConnectionInfo classes for fields.
  /ids: the list of ids for all of the subscribers

  status-storage - the subscriber to basethe status server on - `org.nd4j.parameterserver.status.play.StatusStorage`
  status-server-port - `int`

  returns: the started server - `play.server.Server`"
  (^play.server.Server [^org.nd4j.parameterserver.status.play.StatusStorage status-storage ^Integer status-server-port]
    (StatusServer/startServer status-storage status-server-port)))

