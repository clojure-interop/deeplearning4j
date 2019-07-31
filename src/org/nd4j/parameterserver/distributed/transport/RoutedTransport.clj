(ns org.nd4j.parameterserver.distributed.transport.RoutedTransport
  "Transport implementation based on UDP unicast, for restricted environments, where multicast isn't available. I.e. AWS or Azure"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.transport RoutedTransport]))

(defn ->routed-transport
  "Constructor."
  (^RoutedTransport []
    (new RoutedTransport )))

(defn init
  "Description copied from class: BaseTransport

  void-configuration - `org.nd4j.parameterserver.distributed.conf.VoidConfiguration`
  clipboard - `org.nd4j.parameterserver.distributed.logic.completion.Clipboard`
  role - `org.nd4j.parameterserver.distributed.enums.NodeRole`
  local-ip - `java.lang.String`
  local-port - `int`
  shard-index - `short`"
  ([^RoutedTransport this ^org.nd4j.parameterserver.distributed.conf.VoidConfiguration void-configuration ^org.nd4j.parameterserver.distributed.logic.completion.Clipboard clipboard ^org.nd4j.parameterserver.distributed.enums.NodeRole role ^java.lang.String local-ip ^Integer local-port ^Short shard-index]
    (-> this (.init void-configuration clipboard role local-ip local-port shard-index))))

(defn send-message-to-all-clients
  "message - `org.nd4j.parameterserver.distributed.messages.VoidMessage`
  exclusions - `java.lang.Long`"
  ([^RoutedTransport this ^org.nd4j.parameterserver.distributed.messages.VoidMessage message ^java.lang.Long exclusions]
    (-> this (.sendMessageToAllClients message exclusions))))

(defn number-of-known-clients
  "Description copied from interface: Transport

  returns: `int`"
  (^Integer [^RoutedTransport this]
    (-> this (.numberOfKnownClients))))

(defn number-of-known-shards
  "Description copied from interface: Transport

  returns: `int`"
  (^Integer [^RoutedTransport this]
    (-> this (.numberOfKnownShards))))

(defn shutdown
  "Description copied from class: BaseTransport"
  ([^RoutedTransport this]
    (-> this (.shutdown))))

(defn launch
  "Description copied from class: BaseTransport

  threading - `org.nd4j.parameterserver.distributed.transport.Transport$ThreadingModel`"
  ([^RoutedTransport this ^org.nd4j.parameterserver.distributed.transport.Transport$ThreadingModel threading]
    (-> this (.launch threading))))

(defn add-shard
  "ip - `java.lang.String`
  port - `int`"
  ([^RoutedTransport this ^java.lang.String ip ^Integer port]
    (-> this (.addShard ip port))))

(defn add-client
  "ip - `java.lang.String`
  port - `int`"
  ([^RoutedTransport this ^java.lang.String ip ^Integer port]
    (-> this (.addClient ip port))))

