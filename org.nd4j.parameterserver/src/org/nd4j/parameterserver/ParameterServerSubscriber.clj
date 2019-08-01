(ns org.nd4j.parameterserver.ParameterServerSubscriber
  "Subscriber main class for
 the parameter
 averaging server"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver ParameterServerSubscriber]))

(defn ->parameter-server-subscriber
  "Constructor.

  Allow passing in a
  media driver that already exists

  media-driver - `io.aeron.driver.MediaDriver`"
  (^ParameterServerSubscriber [^io.aeron.driver.MediaDriver media-driver]
    (new ParameterServerSubscriber media-driver)))

(def *-custom-update-type
  "Static Constant.

  Specify a custom class as a jvm arg.
  Note that this class must be a fully qualified classname

  type: java.lang.String"
  ParameterServerSubscriber/CUSTOM_UPDATE_TYPE)

(defn *main
  "args - `java.lang.String[]`"
  ([args]
    (ParameterServerSubscriber/main args)))

(defn as-state
  "Return the current SubscriberState
  of this subscriber

  returns: the current state of this subscriber - `org.nd4j.parameterserver.model.SubscriberState`"
  (^org.nd4j.parameterserver.model.SubscriberState [^ParameterServerSubscriber this]
    (-> this (.asState))))

(defn slave-connection-info
  "When this is a slave node
  it returns the connection url for this node
  and the associated master connection urls in the form of:
  host:port:streamId

  returns: the slave connection info - `org.nd4j.parameterserver.model.SlaveConnectionInfo`"
  (^org.nd4j.parameterserver.model.SlaveConnectionInfo [^ParameterServerSubscriber this]
    (-> this (.slaveConnectionInfo))))

(defn master-connection-info
  "When this is a master node,
  it returns the connection url for this node,
  it's slaves (if any exist) and the responder
  connection url in the form of:
  host:port:streamId

  returns: the master connection info - `org.nd4j.parameterserver.model.MasterConnectionInfo`"
  (^org.nd4j.parameterserver.model.MasterConnectionInfo [^ParameterServerSubscriber this]
    (-> this (.masterConnectionInfo))))

(defn run
  "args - `java.lang.String[]`"
  ([^ParameterServerSubscriber this args]
    (-> this (.run args))))

(defn close
  ""
  ([^ParameterServerSubscriber this]
    (-> this (.close))))

(defn get-context
  "returns: `io.aeron.Aeron.Context`"
  (^io.aeron.Aeron.Context [^ParameterServerSubscriber this]
    (-> this (.getContext))))

(defn get-master-array
  "Get the master ndarray from the
  internal NDArrayHolder

  returns: the master ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^ParameterServerSubscriber this]
    (-> this (.getMasterArray))))

(defn subscriber-launched
  "Returns true if the subscriber is launched

  returns: `boolean`"
  (^Boolean [^ParameterServerSubscriber this]
    (-> this (.subscriberLaunched))))

