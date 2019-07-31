(ns org.nd4j.jita.balance.Balancer
  "Deprecated."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jita.balance Balancer]))

(defn init
  "Deprecated.

  configuration - `org.nd4j.jita.conf.Configuration`"
  ([^Balancer this ^org.nd4j.jita.conf.Configuration configuration]
    (-> this (.init configuration))))

(defn make-promote-decision
  "Deprecated.

  device-id - `java.lang.Integer`
  point - `org.nd4j.jita.allocator.impl.AllocationPoint`
  shape - `org.nd4j.jita.allocator.impl.AllocationShape`

  returns: `org.nd4j.jita.allocator.enums.AllocationStatus`"
  (^org.nd4j.jita.allocator.enums.AllocationStatus [^Balancer this ^java.lang.Integer device-id ^org.nd4j.jita.allocator.impl.AllocationPoint point ^org.nd4j.jita.allocator.impl.AllocationShape shape]
    (-> this (.makePromoteDecision device-id point shape))))

(defn make-demote-decision
  "Deprecated.

  device-id - `java.lang.Integer`
  point - `org.nd4j.jita.allocator.impl.AllocationPoint`
  shape - `org.nd4j.jita.allocator.impl.AllocationShape`

  returns: `org.nd4j.jita.allocator.enums.AllocationStatus`"
  (^org.nd4j.jita.allocator.enums.AllocationStatus [^Balancer this ^java.lang.Integer device-id ^org.nd4j.jita.allocator.impl.AllocationPoint point ^org.nd4j.jita.allocator.impl.AllocationShape shape]
    (-> this (.makeDemoteDecision device-id point shape))))

