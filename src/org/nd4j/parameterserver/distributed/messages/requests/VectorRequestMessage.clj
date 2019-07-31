(ns org.nd4j.parameterserver.distributed.messages.requests.VectorRequestMessage
  "This message requests full weights vector for specified index
 Client -> Shard version"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.messages.requests VectorRequestMessage]))

(defn ->vector-request-message
  "Constructor.

  key - `java.lang.Integer`
  row-index - `int`"
  (^VectorRequestMessage [^java.lang.Integer key ^Integer row-index]
    (new VectorRequestMessage key row-index))
  (^VectorRequestMessage [^Integer row-index]
    (new VectorRequestMessage row-index)))

(defn process-message
  "This message is possible to get only as Shard"
  ([^VectorRequestMessage this]
    (-> this (.processMessage))))

(defn blocking-message?
  "returns: `boolean`"
  (^Boolean [^VectorRequestMessage this]
    (-> this (.isBlockingMessage))))

