(ns org.nd4j.parameterserver.distributed.transport.LocalTransport
  "Deprecated."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.transport LocalTransport]))

(defn ->local-transport
  "Constructor.

  Deprecated."
  (^LocalTransport []
    (new LocalTransport )))

(defn number-of-known-shards
  "Deprecated.

  returns: `int`"
  (^Integer [^LocalTransport this]
    (-> this (.numberOfKnownShards))))

(defn send-message-and-get-response
  "Deprecated.

  message - `org.nd4j.parameterserver.distributed.messages.VoidMessage`

  returns: `org.nd4j.parameterserver.distributed.messages.MeaningfulMessage`"
  (^org.nd4j.parameterserver.distributed.messages.MeaningfulMessage [^LocalTransport this ^org.nd4j.parameterserver.distributed.messages.VoidMessage message]
    (-> this (.sendMessageAndGetResponse message))))

(defn put-message
  "Deprecated.

  message - `org.nd4j.parameterserver.distributed.messages.VoidMessage`"
  ([^LocalTransport this ^org.nd4j.parameterserver.distributed.messages.VoidMessage message]
    (-> this (.putMessage message))))

(defn take-message
  "Deprecated.

  returns: `org.nd4j.parameterserver.distributed.messages.VoidMessage`"
  (^org.nd4j.parameterserver.distributed.messages.VoidMessage [^LocalTransport this]
    (-> this (.takeMessage))))

(defn receive-message
  "Deprecated.

  message - `org.nd4j.parameterserver.distributed.messages.VoidMessage`"
  ([^LocalTransport this ^org.nd4j.parameterserver.distributed.messages.VoidMessage message]
    (-> this (.receiveMessage message))))

(defn peek-message
  "Deprecated.

  returns: `org.nd4j.parameterserver.distributed.messages.VoidMessage`"
  (^org.nd4j.parameterserver.distributed.messages.VoidMessage [^LocalTransport this]
    (-> this (.peekMessage))))

(defn send-message
  "Deprecated.

  message - `org.nd4j.parameterserver.distributed.messages.VoidMessage`"
  ([^LocalTransport this ^org.nd4j.parameterserver.distributed.messages.VoidMessage message]
    (-> this (.sendMessage message))))

(defn shutdown
  "Deprecated."
  ([^LocalTransport this]
    (-> this (.shutdown))))

(defn launch
  "Deprecated.

  threading - `org.nd4j.parameterserver.distributed.transport.Transport$ThreadingModel`"
  ([^LocalTransport this ^org.nd4j.parameterserver.distributed.transport.Transport$ThreadingModel threading]
    (-> this (.launch threading))))

(defn get-own-originator-id
  "Deprecated.

  returns: `long`"
  (^Long [^LocalTransport this]
    (-> this (.getOwnOriginatorId))))

(defn get-target-index
  "Deprecated.

  returns: `short`"
  (^Short [^LocalTransport this]
    (-> this (.getTargetIndex))))

(defn get-shard-index
  "Deprecated.

  returns: `short`"
  (^Short [^LocalTransport this]
    (-> this (.getShardIndex))))

(defn add-client
  "Deprecated.

  ip - `java.lang.String`
  port - `int`"
  ([^LocalTransport this ^java.lang.String ip ^Integer port]
    (-> this (.addClient ip port))))

(defn set-ip-and-port
  "Deprecated.

  ip - `java.lang.String`
  port - `int`"
  ([^LocalTransport this ^java.lang.String ip ^Integer port]
    (-> this (.setIpAndPort ip port))))

(defn get-port
  "Deprecated.

  returns: `int`"
  (^Integer [^LocalTransport this]
    (-> this (.getPort))))

(defn init
  "Deprecated.

  void-configuration - `org.nd4j.parameterserver.distributed.conf.VoidConfiguration`
  clipboard - `org.nd4j.parameterserver.distributed.logic.completion.Clipboard`
  role - `org.nd4j.parameterserver.distributed.enums.NodeRole`
  local-ip - `java.lang.String`
  local-port - `int`
  shard-index - `short`"
  ([^LocalTransport this ^org.nd4j.parameterserver.distributed.conf.VoidConfiguration void-configuration ^org.nd4j.parameterserver.distributed.logic.completion.Clipboard clipboard ^org.nd4j.parameterserver.distributed.enums.NodeRole role ^java.lang.String local-ip ^Integer local-port ^Short shard-index]
    (-> this (.init void-configuration clipboard role local-ip local-port shard-index))))

(defn send-message-to-all-clients
  "Deprecated.

  message - `org.nd4j.parameterserver.distributed.messages.VoidMessage`
  exclusions - `java.lang.Long`"
  ([^LocalTransport this ^org.nd4j.parameterserver.distributed.messages.VoidMessage message ^java.lang.Long exclusions]
    (-> this (.sendMessageToAllClients message exclusions))))

(defn get-ip
  "Deprecated.

  returns: `java.lang.String`"
  (^java.lang.String [^LocalTransport this]
    (-> this (.getIp))))

(defn send-message-to-all-shards
  "Deprecated.

  message - `org.nd4j.parameterserver.distributed.messages.VoidMessage`"
  ([^LocalTransport this ^org.nd4j.parameterserver.distributed.messages.VoidMessage message]
    (-> this (.sendMessageToAllShards message))))

(defn add-shard
  "Deprecated.

  ip - `java.lang.String`
  port - `int`"
  ([^LocalTransport this ^java.lang.String ip ^Integer port]
    (-> this (.addShard ip port))))

(defn number-of-known-clients
  "Deprecated.

  returns: `int`"
  (^Integer [^LocalTransport this]
    (-> this (.numberOfKnownClients))))

