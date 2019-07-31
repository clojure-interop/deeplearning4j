(ns org.nd4j.parameterserver.distributed.messages.intercom.DistributedInitializationMessage
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.messages.intercom DistributedInitializationMessage]))

(defn ->distributed-initialization-message
  "Constructor.

  vector-length - `int`
  num-words - `int`
  seed - `long`
  use-hs - `boolean`
  use-neg - `boolean`
  columns-per-shard - `int`"
  (^DistributedInitializationMessage [^Integer vector-length ^Integer num-words ^Long seed ^Boolean use-hs ^Boolean use-neg ^Integer columns-per-shard]
    (new DistributedInitializationMessage vector-length num-words seed use-hs use-neg columns-per-shard)))

(defn process-message
  "This method initializes shard storage with given data"
  ([^DistributedInitializationMessage this]
    (-> this (.processMessage))))

