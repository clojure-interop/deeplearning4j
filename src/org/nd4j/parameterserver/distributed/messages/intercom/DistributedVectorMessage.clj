(ns org.nd4j.parameterserver.distributed.messages.intercom.DistributedVectorMessage
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.messages.intercom DistributedVectorMessage]))

(defn ->distributed-vector-message
  "Constructor.

  key - `java.lang.Integer`
  row-index - `int`"
  (^DistributedVectorMessage [^java.lang.Integer key ^Integer row-index]
    (new DistributedVectorMessage key row-index))
  (^DistributedVectorMessage []
    (new DistributedVectorMessage )))

(defn process-message
  "This method will be started in context of executor, either Shard, Client or Backup node"
  ([^DistributedVectorMessage this]
    (-> this (.processMessage))))

