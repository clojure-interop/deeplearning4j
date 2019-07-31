(ns org.nd4j.parameterserver.distributed.messages.intercom.DistributedSolidMessage
  "Array passed here will be shared & available on all shards."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.messages.intercom DistributedSolidMessage]))

(defn ->distributed-solid-message
  "Constructor.

  key - `java.lang.Integer`
  array - `org.nd4j.linalg.api.ndarray.INDArray`
  overwrite - `boolean`"
  (^DistributedSolidMessage [^java.lang.Integer key ^org.nd4j.linalg.api.ndarray.INDArray array ^Boolean overwrite]
    (new DistributedSolidMessage key array overwrite)))

(defn process-message
  "This method will be started in context of executor, either Shard, Client or Backup node"
  ([^DistributedSolidMessage this]
    (-> this (.processMessage))))

