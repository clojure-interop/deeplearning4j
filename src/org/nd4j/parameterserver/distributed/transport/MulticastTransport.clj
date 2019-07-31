(ns org.nd4j.parameterserver.distributed.transport.MulticastTransport
  "Transport implementation based on Aeron UDP multicast
 PLEASE NOTE: This transport will NOT work on AWS or Azure out of box, due to Amazon/Microsoft restrictions within their networks."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.transport MulticastTransport]))

(defn ->multicast-transport
  "Constructor."
  (^MulticastTransport []
    (new MulticastTransport )))

(defn init
  "Description copied from class: BaseTransport

  void-configuration - `org.nd4j.parameterserver.distributed.conf.VoidConfiguration`
  clipboard - `org.nd4j.parameterserver.distributed.logic.completion.Clipboard`
  role - `org.nd4j.parameterserver.distributed.enums.NodeRole`
  local-ip - `java.lang.String`
  local-port - `int`
  shard-index - `short`"
  ([^MulticastTransport this ^org.nd4j.parameterserver.distributed.conf.VoidConfiguration void-configuration ^org.nd4j.parameterserver.distributed.logic.completion.Clipboard clipboard ^org.nd4j.parameterserver.distributed.enums.NodeRole role ^java.lang.String local-ip ^Integer local-port ^Short shard-index]
    (-> this (.init void-configuration clipboard role local-ip local-port shard-index))))

