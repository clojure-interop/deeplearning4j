(ns org.nd4j.parameterserver.distributed.messages.requests.SkipGramRequestMessage
  "This is batch message, describing simple SkipGram round
 We assume this message is created on Client, and passed to selected Shard
 Shard which received this message becomes a driver, which handles processing"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.messages.requests SkipGramRequestMessage]))

(defn ->skip-gram-request-message
  "Constructor.

  w-1 - `int`
  w-2 - `int`
  points - `int[]`
  codes - `byte[]`
  neg-samples - `short`
  lr - `double`
  next-random - `long`"
  (^SkipGramRequestMessage [^Integer w-1 ^Integer w-2 points codes ^Short neg-samples ^Double lr ^Long next-random]
    (new SkipGramRequestMessage w-1 w-2 points codes neg-samples lr next-random)))

(defn process-message
  "This method does actual training for SkipGram algorithm"
  ([^SkipGramRequestMessage this]
    (-> this (.processMessage))))

(defn join-supported?
  "returns: `boolean`"
  (^Boolean [^SkipGramRequestMessage this]
    (-> this (.isJoinSupported))))

(defn join-message
  "message - `org.nd4j.parameterserver.distributed.messages.VoidMessage`"
  ([^SkipGramRequestMessage this ^org.nd4j.parameterserver.distributed.messages.VoidMessage message]
    (-> this (.joinMessage message))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^SkipGramRequestMessage this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^SkipGramRequestMessage this]
    (-> this (.hashCode))))

