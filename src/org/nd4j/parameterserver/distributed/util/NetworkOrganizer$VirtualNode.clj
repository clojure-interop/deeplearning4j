(ns org.nd4j.parameterserver.distributed.util.NetworkOrganizer$VirtualNode
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.util NetworkOrganizer$VirtualNode]))

(defn ->virtual-node
  "Constructor.

  character - `java.lang.Character`
  parent-node - `org.nd4j.parameterserver.distributed.util.NetworkOrganizer$VirtualNode`"
  (^NetworkOrganizer$VirtualNode [^java.lang.Character character ^org.nd4j.parameterserver.distributed.util.NetworkOrganizer$VirtualNode parent-node]
    (new NetworkOrganizer$VirtualNode character parent-node)))

(defn map
  "chars - `java.lang.String[]`
  position - `int`"
  ([^NetworkOrganizer$VirtualNode this chars ^Integer position]
    (-> this (.map chars position))))

