(ns org.nd4j.parameterserver.distributed.util.NetworkOrganizer
  "Utility class that provides"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.util NetworkOrganizer]))

(defn ->network-organizer
  "Constructor.

  This constructor builds format from own

  network-mask - `java.lang.String`"
  (^NetworkOrganizer [^java.lang.String network-mask]
    (new NetworkOrganizer network-mask))
  (^NetworkOrganizer [^java.util.Collection info-set ^java.lang.String mask]
    (new NetworkOrganizer info-set mask)))

(defn get-matching-address
  "This method returns local IP address that matches given network mask.
  To be used with single-argument constructor only.

  returns: `java.lang.String`"
  (^java.lang.String [^NetworkOrganizer this]
    (-> this (.getMatchingAddress))))

(defn get-subset
  "This method returns specified number of IP addresses from original list of addresses, that are NOT listen in primary collection

  num-shards - `int`
  primary - Collection of IP addresses that shouldn't be in result - `java.util.Collection`

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^NetworkOrganizer this ^Integer num-shards ^java.util.Collection primary]
    (-> this (.getSubset num-shards primary)))
  (^java.util.List [^NetworkOrganizer this ^Integer num-shards]
    (-> this (.getSubset num-shards))))

