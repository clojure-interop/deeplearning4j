(ns org.tensorflow.framework.GraphTransferInfo$NodeInputOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework GraphTransferInfo$NodeInputOrBuilder]))

(defn get-node-id
  "int32 node_id = 1;

  returns: `int`"
  (^Integer [^GraphTransferInfo$NodeInputOrBuilder this]
    (-> this (.getNodeId))))

(defn get-output-port
  "int32 output_port = 2;

  returns: `int`"
  (^Integer [^GraphTransferInfo$NodeInputOrBuilder this]
    (-> this (.getOutputPort))))

