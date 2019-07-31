(ns org.nd4j.parameterserver.node.ParameterServerNode
  "Integrated node for running
 the parameter server.
 This includes the status server,
 media driver, and parameter server subscriber"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.node ParameterServerNode]))

(defn ->parameter-server-node
  "Constructor.

  Pass in the media driver used for communication
  and a defualt status port of 9000

  media-driver - `io.aeron.driver.MediaDriver`"
  (^ParameterServerNode [^io.aeron.driver.MediaDriver media-driver]
    (new ParameterServerNode media-driver))
  (^ParameterServerNode [^io.aeron.driver.MediaDriver media-driver ^Integer status-port ^Integer num-workers]
    (new ParameterServerNode media-driver status-port num-workers))
  (^ParameterServerNode [^io.aeron.driver.MediaDriver media-driver ^Integer status-port]
    (new ParameterServerNode media-driver status-port)))

(defn *main
  "args - `java.lang.String[]`"
  ([args]
    (ParameterServerNode/main args)))

(defn run-main
  "Run this node with the given args
  These args are the same ones
  that a ParameterServerSubscriber takes

  args - the arguments for the ParameterServerSubscriber - `java.lang.String[]`"
  ([^ParameterServerNode this args]
    (-> this (.runMain args))))

(defn subscriber-launched
  "Returns true if all susbcribers in the
  subscriber pool have been launched

  returns: `boolean`"
  (^Boolean [^ParameterServerNode this]
    (-> this (.subscriberLaunched))))

(defn close
  "Stop the server

  throws: java.lang.Exception"
  ([^ParameterServerNode this]
    (-> this (.close))))

