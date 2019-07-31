(ns org.tensorflow.framework.CostGraphDef$Node$InputInfoOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework CostGraphDef$Node$InputInfoOrBuilder]))

(defn get-preceding-node
  "int32 preceding_node = 1;

  returns: `int`"
  (^Integer [^CostGraphDef$Node$InputInfoOrBuilder this]
    (-> this (.getPrecedingNode))))

(defn get-preceding-port
  "int32 preceding_port = 2;

  returns: `int`"
  (^Integer [^CostGraphDef$Node$InputInfoOrBuilder this]
    (-> this (.getPrecedingPort))))

