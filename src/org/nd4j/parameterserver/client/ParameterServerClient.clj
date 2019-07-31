(ns org.nd4j.parameterserver.client.ParameterServerClient
  "Parameter server
 client for
 publishing and
 retrieving ndarrays
 pushNDArray will send the given ndarray to the send url.
 This is used for updating the master's current state.
 getArray() is used for retrieving the master ndarray's current
 state from the parameter server."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.client ParameterServerClient]))

(defn ->parameter-server-client
  "Constructor."
  (^ParameterServerClient []
    (new ParameterServerClient )))

(defn block-till-ready
  "Block the clint till ready
  for next phase."
  ([^ParameterServerClient this]
    (-> this (.blockTillReady))))

(defn push-nd-array
  "Push an ndarray to the specified
  ndarray send url in the form of:
  host;port:stream
  where stream is the stream for connecting
  to a listening aeron server

  arr - the array to send - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^ParameterServerClient this ^org.nd4j.linalg.api.ndarray.INDArray arr]
    (-> this (.pushNDArray arr))))

(defn push-nd-array-message
  "Push an ndarray message to the specified
  ndarray send url in the form of:
  host;port:stream
  where stream is the stream for connecting
  to a listening aeron server

  message - the array to send - `org.nd4j.aeron.ipc.NDArrayMessage`"
  ([^ParameterServerClient this ^org.nd4j.aeron.ipc.NDArrayMessage message]
    (-> this (.pushNDArrayMessage message))))

(defn ready-for-next?
  "Returns true if the client is
  ready for a next array or not

  returns: true if the client is
  ready for the next array or not,false otherwise - `boolean`"
  (^Boolean [^ParameterServerClient this]
    (-> this (.isReadyForNext))))

(defn master-started
  "Sends a post request to the
  status server to determine if the master node is started.

  returns: `boolean`"
  (^Boolean [^ParameterServerClient this]
    (-> this (.masterStarted))))

(defn on-nd-array-partial
  "Used for partial updates using tensor along
  dimension

  arr - the array to count as an update - `org.nd4j.linalg.api.ndarray.INDArray`
  idx - the index for the tensor along dimension - `long`
  dimensions - the dimensions to act on for the tensor along dimension - `int`"
  ([^ParameterServerClient this ^org.nd4j.linalg.api.ndarray.INDArray arr ^Long idx ^Integer dimensions]
    (-> this (.onNDArrayPartial arr idx dimensions))))

(defn connection-url
  "Get the connection url for the subscriber
  in the format:
  host:port:stream

  returns: the connection url for the subscriber
  for this client - `java.lang.String`"
  (^java.lang.String [^ParameterServerClient this]
    (-> this (.connectionUrl))))

(defn get-array
  "Get an ndarray from the
  designated ndarray retrieve url.
  This will \"pull\" the current ndarray
  from the master

  returns: the current ndarray from the master. - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^ParameterServerClient this]
    (-> this (.getArray))))

(defn arrays-sent-to-responder
  "Tracks number of
  arrays send to responder.

  returns: `int`"
  (^Integer [^ParameterServerClient this]
    (-> this (.arraysSentToResponder))))

(defn on-nd-array
  "Setup an ndarray

  arr - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^ParameterServerClient this ^org.nd4j.linalg.api.ndarray.INDArray arr]
    (-> this (.onNDArray arr))))

(defn on-nd-array-message
  "A listener for ndarray message

  message - the message for the callback - `org.nd4j.aeron.ipc.NDArrayMessage`"
  ([^ParameterServerClient this ^org.nd4j.aeron.ipc.NDArrayMessage message]
    (-> this (.onNDArrayMessage message))))

