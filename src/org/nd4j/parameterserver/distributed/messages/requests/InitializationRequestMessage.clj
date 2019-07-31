(ns org.nd4j.parameterserver.distributed.messages.requests.InitializationRequestMessage
  "This method propagates storage/weights initialization over distributed Shards"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.messages.requests InitializationRequestMessage]))

(defn ->initialization-request-message
  "Constructor.

  vector-length - `int`
  num-words - `int`
  seed - `long`
  use-hs - `boolean`
  use-neg - `boolean`
  columns-per-shard - `int`"
  (^InitializationRequestMessage [^Integer vector-length ^Integer num-words ^Long seed ^Boolean use-hs ^Boolean use-neg ^Integer columns-per-shard]
    (new InitializationRequestMessage vector-length num-words seed use-hs use-neg columns-per-shard)))

(defn process-message
  "Description copied from interface: VoidMessage"
  ([^InitializationRequestMessage this]
    (-> this (.processMessage))))

(defn blocking-message?
  "returns: `boolean`"
  (^Boolean [^InitializationRequestMessage this]
    (-> this (.isBlockingMessage))))

