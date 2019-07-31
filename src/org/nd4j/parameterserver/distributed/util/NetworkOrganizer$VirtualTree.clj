(ns org.nd4j.parameterserver.distributed.util.NetworkOrganizer$VirtualTree
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.util NetworkOrganizer$VirtualTree]))

(defn ->virtual-tree
  "Constructor."
  (^NetworkOrganizer$VirtualTree []
    (new NetworkOrganizer$VirtualTree )))

(defn map
  "PLEASE NOTE: This method expects binary octets inside the string argument

  string - `java.lang.String`"
  ([^NetworkOrganizer$VirtualTree this ^java.lang.String string]
    (-> this (.map string))))

(defn get-unique-branches
  "returns: `int`"
  (^Integer [^NetworkOrganizer$VirtualTree this]
    (-> this (.getUniqueBranches))))

(defn get-total-branches
  "returns: `int`"
  (^Integer [^NetworkOrganizer$VirtualTree this]
    (-> this (.getTotalBranches))))

(defn get-hottest-network
  "returns: `java.lang.String`"
  (^java.lang.String [^NetworkOrganizer$VirtualTree this]
    (-> this (.getHottestNetwork))))

(defn get-hottest-network-a
  "returns: `java.lang.String`"
  (^java.lang.String [^NetworkOrganizer$VirtualTree this]
    (-> this (.getHottestNetworkA))))

(defn get-hottest-network-ab
  "This method returns FULL A octet  B octet UP TO FIRST SIGNIFICANT BIT

  returns: `java.lang.String`"
  (^java.lang.String [^NetworkOrganizer$VirtualTree this]
    (-> this (.getHottestNetworkAB))))

