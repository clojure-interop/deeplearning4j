(ns org.nd4j.parameterserver.distributed.conf.VoidConfiguration
  "Basic configuration pojo for VoidParameterServer"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.conf VoidConfiguration]))

(defn ->void-configuration
  "Constructor."
  (^VoidConfiguration []
    (new VoidConfiguration )))

(defn set-stream-id
  "stream-id - `int`"
  ([^VoidConfiguration this ^Integer stream-id]
    (-> this (.setStreamId stream-id))))

(defn set-network-mask
  "This option is very important: in shared network environment and yarn (like on EC2 etc),
  please set this to the network, which will be available on all boxes. I.e. 10.1.1.0/24 or 192.168.0.0/16

  netmask - netmask to be used for IP address selection - `java.lang.String`"
  ([^VoidConfiguration this ^java.lang.String netmask]
    (-> this (.setNetworkMask netmask))))

(defn get-network-mask
  "This method returns network mask

  returns: `java.lang.String`"
  (^java.lang.String [^VoidConfiguration this]
    (-> this (.getNetworkMask))))

(defn set-shard-addresses
  "addresses - `java.util.List`"
  ([^VoidConfiguration this ^java.util.List addresses]
    (-> this (.setShardAddresses addresses))))

(defn set-backup-addresses
  "addresses - `java.util.List`"
  ([^VoidConfiguration this ^java.util.List addresses]
    (-> this (.setBackupAddresses addresses))))

(defn set-execution-mode
  "execution-mode - `org.nd4j.parameterserver.distributed.enums.ExecutionMode`"
  ([^VoidConfiguration this ^org.nd4j.parameterserver.distributed.enums.ExecutionMode execution-mode]
    (-> this (.setExecutionMode execution-mode))))

