(ns org.nd4j.parameterserver.distributed.util.NetworkInformation
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.util NetworkInformation]))

(defn ->network-information
  "Constructor."
  (^NetworkInformation []
    (new NetworkInformation )))

(defn add-ip-address
  "ip - `java.lang.String`"
  ([^NetworkInformation this ^java.lang.String ip]
    (-> this (.addIpAddress ip))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^NetworkInformation this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^NetworkInformation this]
    (-> this (.hashCode))))

