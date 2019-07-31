(ns org.nd4j.parameterserver.distributed.transport.Transport
  "Transport interface describes Client -> Shard, Shard -> Shard, Shard -> Client communication"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.transport Transport]))

(defn number-of-known-shards
  "This method returns number of known Shards

  returns: `int`"
  (^Integer [^Transport this]
    (-> this (.numberOfKnownShards))))

(defn send-message-and-get-response
  "This method accepts message for delivery, and blocks until response delivered

  message - `org.nd4j.parameterserver.distributed.messages.VoidMessage`

  returns: `org.nd4j.parameterserver.distributed.messages.MeaningfulMessage`"
  (^org.nd4j.parameterserver.distributed.messages.MeaningfulMessage [^Transport this ^org.nd4j.parameterserver.distributed.messages.VoidMessage message]
    (-> this (.sendMessageAndGetResponse message))))

(defn put-message
  "This method puts message into processing queue

  message - `org.nd4j.parameterserver.distributed.messages.VoidMessage`"
  ([^Transport this ^org.nd4j.parameterserver.distributed.messages.VoidMessage message]
    (-> this (.putMessage message))))

(defn take-message
  "This method takes 1 message from \"incoming messages\" queue, blocking if queue is empty

  returns: `org.nd4j.parameterserver.distributed.messages.VoidMessage`"
  (^org.nd4j.parameterserver.distributed.messages.VoidMessage [^Transport this]
    (-> this (.takeMessage))))

(defn receive-message
  "This method accepts message from network

  message - `org.nd4j.parameterserver.distributed.messages.VoidMessage`"
  ([^Transport this ^org.nd4j.parameterserver.distributed.messages.VoidMessage message]
    (-> this (.receiveMessage message))))

(defn peek-message
  "This method peeks 1 message from \"incoming messages\" queue, returning null if queue is empty
  PLEASE NOTE: This method is suitable for debug purposes only

  returns: `org.nd4j.parameterserver.distributed.messages.VoidMessage`"
  (^org.nd4j.parameterserver.distributed.messages.VoidMessage [^Transport this]
    (-> this (.peekMessage))))

(defn send-message
  "This method accepts message for delivery, routing is applied according on message opType

  message - `org.nd4j.parameterserver.distributed.messages.VoidMessage`"
  ([^Transport this ^org.nd4j.parameterserver.distributed.messages.VoidMessage message]
    (-> this (.sendMessage message))))

(defn shutdown
  "This method stops transport system."
  ([^Transport this]
    (-> this (.shutdown))))

(defn launch
  "This method starts transport mechanisms.
  PLEASE NOTE: init() method should be called prior to launch() call

  threading - `org.nd4j.parameterserver.distributed.transport.Transport$ThreadingModel`"
  ([^Transport this ^org.nd4j.parameterserver.distributed.transport.Transport$ThreadingModel threading]
    (-> this (.launch threading))))

(defn get-own-originator-id
  "This method returns ID of this Transport instance

  returns: `long`"
  (^Long [^Transport this]
    (-> this (.getOwnOriginatorId))))

(defn get-target-index
  "returns: `short`"
  (^Short [^Transport this]
    (-> this (.getTargetIndex))))

(defn get-shard-index
  "returns: `short`"
  (^Short [^Transport this]
    (-> this (.getShardIndex))))

(defn add-client
  "ip - `java.lang.String`
  port - `int`"
  ([^Transport this ^java.lang.String ip ^Integer port]
    (-> this (.addClient ip port))))

(defn set-ip-and-port
  "ip - `java.lang.String`
  port - `int`"
  ([^Transport this ^java.lang.String ip ^Integer port]
    (-> this (.setIpAndPort ip port))))

(defn get-port
  "returns: `int`"
  (^Integer [^Transport this]
    (-> this (.getPort))))

(defn init
  "This method does initialization of Transport instance

  void-configuration - `org.nd4j.parameterserver.distributed.conf.VoidConfiguration`
  clipboard - `org.nd4j.parameterserver.distributed.logic.completion.Clipboard`
  role - `org.nd4j.parameterserver.distributed.enums.NodeRole`
  local-ip - `java.lang.String`
  local-port - `int`
  shard-index - `short`"
  ([^Transport this ^org.nd4j.parameterserver.distributed.conf.VoidConfiguration void-configuration ^org.nd4j.parameterserver.distributed.logic.completion.Clipboard clipboard ^org.nd4j.parameterserver.distributed.enums.NodeRole role ^java.lang.String local-ip ^Integer local-port ^Short shard-index]
    (-> this (.init void-configuration clipboard role local-ip local-port shard-index))))

(defn send-message-to-all-clients
  "message - `org.nd4j.parameterserver.distributed.messages.VoidMessage`
  exclusions - `java.lang.Long`"
  ([^Transport this ^org.nd4j.parameterserver.distributed.messages.VoidMessage message ^java.lang.Long exclusions]
    (-> this (.sendMessageToAllClients message exclusions))))

(defn get-ip
  "returns: `java.lang.String`"
  (^java.lang.String [^Transport this]
    (-> this (.getIp))))

(defn send-message-to-all-shards
  "message - `org.nd4j.parameterserver.distributed.messages.VoidMessage`"
  ([^Transport this ^org.nd4j.parameterserver.distributed.messages.VoidMessage message]
    (-> this (.sendMessageToAllShards message))))

(defn add-shard
  "ip - `java.lang.String`
  port - `int`"
  ([^Transport this ^java.lang.String ip ^Integer port]
    (-> this (.addShard ip port))))

(defn number-of-known-clients
  "This method returns number of known Clients

  returns: `int`"
  (^Integer [^Transport this]
    (-> this (.numberOfKnownClients))))

