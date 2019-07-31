(ns org.nd4j.parameterserver.distributed.messages.Frame
  "Simple wrapper for multiple request messages OF THE SAME TYPE being stacked into single message"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.messages Frame]))

(defn ->frame
  "Constructor.

  task-id - `long`"
  (^Frame [^Long task-id]
    (new Frame task-id)))

(defn blocking-message?
  "returns: `boolean`"
  (^Boolean [^Frame this]
    (-> this (.isBlockingMessage))))

(defn stack-messages
  "This method adds multiple messages to this frame
  PLEASE NOTE: This method is synchronized

  messages - `java.util.Collection`"
  ([^Frame this ^java.util.Collection messages]
    (-> this (.stackMessages messages))))

(defn get-messages
  "returns: `java.util.Collection<T>`"
  (^java.util.Collection [^Frame this]
    (-> this (.getMessages))))

(defn set-originator-id
  "id - `long`"
  ([^Frame this ^Long id]
    (-> this (.setOriginatorId id))))

(defn join-supported?
  "returns: `boolean`"
  (^Boolean [^Frame this]
    (-> this (.isJoinSupported))))

(defn as-unsafe-buffer
  "returns: `org.agrona.concurrent.UnsafeBuffer`"
  (^org.agrona.concurrent.UnsafeBuffer [^Frame this]
    (-> this (.asUnsafeBuffer))))

(defn process-message
  "Description copied from interface: VoidMessage"
  ([^Frame this]
    (-> this (.processMessage))))

(defn stack-message
  "This method adds single TrainingMessage to this Frame
  PLEASE NOTE: This method is synchronized

  message - `T`"
  ([^Frame this message]
    (-> this (.stackMessage message))))

(defn get-message-type
  "returns: `int`"
  (^Integer [^Frame this]
    (-> this (.getMessageType))))

(defn increment-retransmit-count
  ""
  ([^Frame this]
    (-> this (.incrementRetransmitCount))))

(defn iterator
  "returns: `java.util.Iterator<T>`"
  (^java.util.Iterator [^Frame this]
    (-> this (.iterator))))

(defn extract-context
  "message - `org.nd4j.parameterserver.distributed.messages.BaseVoidMessage`"
  ([^Frame this ^org.nd4j.parameterserver.distributed.messages.BaseVoidMessage message]
    (-> this (.extractContext message))))

(defn join-message
  "message - `org.nd4j.parameterserver.distributed.messages.VoidMessage`"
  ([^Frame this ^org.nd4j.parameterserver.distributed.messages.VoidMessage message]
    (-> this (.joinMessage message))))

(defn as-bytes
  "returns: `byte[]`"
  ([^Frame this]
    (-> this (.asBytes))))

(defn attach-context
  "Description copied from interface: VoidMessage

  void-configuration - `org.nd4j.parameterserver.distributed.conf.VoidConfiguration`
  trainer - `org.nd4j.parameterserver.distributed.training.TrainingDriver`
  clipboard - `org.nd4j.parameterserver.distributed.logic.completion.Clipboard`
  transport - `org.nd4j.parameterserver.distributed.transport.Transport`
  storage - `org.nd4j.parameterserver.distributed.logic.Storage`
  role - `org.nd4j.parameterserver.distributed.enums.NodeRole`
  shard-index - `short`"
  ([^Frame this ^org.nd4j.parameterserver.distributed.conf.VoidConfiguration void-configuration ^org.nd4j.parameterserver.distributed.training.TrainingDriver trainer ^org.nd4j.parameterserver.distributed.logic.completion.Clipboard clipboard ^org.nd4j.parameterserver.distributed.transport.Transport transport ^org.nd4j.parameterserver.distributed.logic.Storage storage ^org.nd4j.parameterserver.distributed.enums.NodeRole role ^Short shard-index]
    (-> this (.attachContext void-configuration trainer clipboard transport storage role shard-index))))

(defn size
  "returns: `int`"
  (^Integer [^Frame this]
    (-> this (.size))))

