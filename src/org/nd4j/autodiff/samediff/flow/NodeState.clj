(ns org.nd4j.autodiff.samediff.flow.NodeState
  "This class describe Node state during execution time."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.autodiff.samediff.flow NodeState]))

(defn ->node-state
  "Constructor.

  node-name - `java.lang.String`"
  (^NodeState [^java.lang.String node-name]
    (new NodeState node-name)))

(defn increment-number-of-cycles
  ""
  ([^NodeState this]
    (-> this (.incrementNumberOfCycles))))

(defn get-number-of-cycles
  "returns: `long`"
  (^Long [^NodeState this]
    (-> this (.getNumberOfCycles))))

