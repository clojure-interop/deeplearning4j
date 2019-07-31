(ns org.nd4j.parameterserver.distributed.transport.BaseTransport
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.transport BaseTransport]))

(defn ->base-transport
  "Constructor."
  (^BaseTransport []
    (new BaseTransport )))

(defn number-of-known-shards
  "Description copied from interface: Transport

  returns: `int`"
  (^Integer [^BaseTransport this]
    (-> this (.numberOfKnownShards))))

(defn send-message-and-get-response
  "Description copied from interface: Transport

  message - `org.nd4j.parameterserver.distributed.messages.VoidMessage`

  returns: `org.nd4j.parameterserver.distributed.messages.MeaningfulMessage`"
  (^org.nd4j.parameterserver.distributed.messages.MeaningfulMessage [^BaseTransport this ^org.nd4j.parameterserver.distributed.messages.VoidMessage message]
    (-> this (.sendMessageAndGetResponse message))))

(defn put-message
  "This method puts message into processing queue

  message - `org.nd4j.parameterserver.distributed.messages.VoidMessage`"
  ([^BaseTransport this ^org.nd4j.parameterserver.distributed.messages.VoidMessage message]
    (-> this (.putMessage message))))

(defn take-message
  "This method takes 1 message from \"incoming messages\" queue, blocking if queue is empty

  returns: `org.nd4j.parameterserver.distributed.messages.VoidMessage`"
  (^org.nd4j.parameterserver.distributed.messages.VoidMessage [^BaseTransport this]
    (-> this (.takeMessage))))

(defn receive-message
  "This method saves incoming message to the Queue, for later dispatch from higher-level code, like actual TrainingFunction or VoidParameterServer itself

  message - `org.nd4j.parameterserver.distributed.messages.VoidMessage`"
  ([^BaseTransport this ^org.nd4j.parameterserver.distributed.messages.VoidMessage message]
    (-> this (.receiveMessage message))))

(defn peek-message
  "This method peeks 1 message from \"incoming messages\" queue, returning null if queue is empty
  PLEASE NOTE: This method is suitable for debug purposes only

  returns: `org.nd4j.parameterserver.distributed.messages.VoidMessage`"
  (^org.nd4j.parameterserver.distributed.messages.VoidMessage [^BaseTransport this]
    (-> this (.peekMessage))))

(defn send-message
  "Description copied from interface: Transport

  message - `org.nd4j.parameterserver.distributed.messages.VoidMessage`"
  ([^BaseTransport this ^org.nd4j.parameterserver.distributed.messages.VoidMessage message]
    (-> this (.sendMessage message))))

(defn shutdown
  "This method stops transport system."
  ([^BaseTransport this]
    (-> this (.shutdown))))

(defn launch
  "This method starts transport mechanisms.
  PLEASE NOTE: init() method should be called prior to launch() call

  threading - `org.nd4j.parameterserver.distributed.transport.Transport$ThreadingModel`"
  ([^BaseTransport this ^org.nd4j.parameterserver.distributed.transport.Transport$ThreadingModel threading]
    (-> this (.launch threading))))

(defn get-own-originator-id
  "Description copied from interface: Transport

  returns: `long`"
  (^Long [^BaseTransport this]
    (-> this (.getOwnOriginatorId))))

(defn add-client
  "ip - `java.lang.String`
  port - `int`"
  ([^BaseTransport this ^java.lang.String ip ^Integer port]
    (-> this (.addClient ip port))))

(defn set-ip-and-port
  "ip - `java.lang.String`
  port - `int`"
  ([^BaseTransport this ^java.lang.String ip ^Integer port]
    (-> this (.setIpAndPort ip port))))

(defn get-port
  "returns: `int`"
  (^Integer [^BaseTransport this]
    (-> this (.getPort))))

(defn init
  "This method does initialization of Transport instance

  void-configuration - `org.nd4j.parameterserver.distributed.conf.VoidConfiguration`
  clipboard - `org.nd4j.parameterserver.distributed.logic.completion.Clipboard`
  role - `org.nd4j.parameterserver.distributed.enums.NodeRole`
  local-ip - `java.lang.String`
  local-port - `int`
  shard-index - `short`"
  ([^BaseTransport this ^org.nd4j.parameterserver.distributed.conf.VoidConfiguration void-configuration ^org.nd4j.parameterserver.distributed.logic.completion.Clipboard clipboard ^org.nd4j.parameterserver.distributed.enums.NodeRole role ^java.lang.String local-ip ^Integer local-port ^Short shard-index]
    (-> this (.init void-configuration clipboard role local-ip local-port shard-index))))

(defn send-message-to-all-clients
  "message - `org.nd4j.parameterserver.distributed.messages.VoidMessage`
  exclusions - `java.lang.Long`"
  ([^BaseTransport this ^org.nd4j.parameterserver.distributed.messages.VoidMessage message ^java.lang.Long exclusions]
    (-> this (.sendMessageToAllClients message exclusions))))

(defn get-ip
  "returns: `java.lang.String`"
  (^java.lang.String [^BaseTransport this]
    (-> this (.getIp))))

(defn send-message-to-all-shards
  "message - `org.nd4j.parameterserver.distributed.messages.VoidMessage`"
  ([^BaseTransport this ^org.nd4j.parameterserver.distributed.messages.VoidMessage message]
    (-> this (.sendMessageToAllShards message))))

(defn add-shard
  "ip - `java.lang.String`
  port - `int`"
  ([^BaseTransport this ^java.lang.String ip ^Integer port]
    (-> this (.addShard ip port))))

(defn number-of-known-clients
  "Description copied from interface: Transport

  returns: `int`"
  (^Integer [^BaseTransport this]
    (-> this (.numberOfKnownClients))))

