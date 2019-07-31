(ns org.nd4j.parameterserver.distributed.messages.VoidMessage
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.messages VoidMessage]))

(defn blocking-message?
  "returns: `boolean`"
  (^Boolean [^VoidMessage this]
    (-> this (.isBlockingMessage))))

(defn *from-bytes
  "array - `byte[]`

  returns: `<T extends org.nd4j.parameterserver.distributed.messages.VoidMessage> T`"
  ([array]
    (VoidMessage/fromBytes array)))

(defn set-target-id
  "id - `short`"
  ([^VoidMessage this ^Short id]
    (-> this (.setTargetId id))))

(defn set-originator-id
  "id - `long`"
  ([^VoidMessage this ^Long id]
    (-> this (.setOriginatorId id))))

(defn join-supported?
  "returns: `boolean`"
  (^Boolean [^VoidMessage this]
    (-> this (.isJoinSupported))))

(defn get-task-id
  "returns: `long`"
  (^Long [^VoidMessage this]
    (-> this (.getTaskId))))

(defn as-unsafe-buffer
  "returns: `org.agrona.concurrent.UnsafeBuffer`"
  (^org.agrona.concurrent.UnsafeBuffer [^VoidMessage this]
    (-> this (.asUnsafeBuffer))))

(defn process-message
  "This method will be started in context of executor, either Shard, Client or Backup node"
  ([^VoidMessage this]
    (-> this (.processMessage))))

(defn get-message-type
  "returns: `int`"
  (^Integer [^VoidMessage this]
    (-> this (.getMessageType))))

(defn increment-retransmit-count
  ""
  ([^VoidMessage this]
    (-> this (.incrementRetransmitCount))))

(defn extract-context
  "message - `org.nd4j.parameterserver.distributed.messages.BaseVoidMessage`"
  ([^VoidMessage this ^org.nd4j.parameterserver.distributed.messages.BaseVoidMessage message]
    (-> this (.extractContext message))))

(defn join-message
  "message - `org.nd4j.parameterserver.distributed.messages.VoidMessage`"
  ([^VoidMessage this ^org.nd4j.parameterserver.distributed.messages.VoidMessage message]
    (-> this (.joinMessage message))))

(defn as-bytes
  "returns: `byte[]`"
  ([^VoidMessage this]
    (-> this (.asBytes))))

(defn attach-context
  "This method initializes message for further processing

  void-configuration - `org.nd4j.parameterserver.distributed.conf.VoidConfiguration`
  trainer - `org.nd4j.parameterserver.distributed.training.TrainingDriver`
  clipboard - `org.nd4j.parameterserver.distributed.logic.completion.Clipboard`
  transport - `org.nd4j.parameterserver.distributed.transport.Transport`
  storage - `org.nd4j.parameterserver.distributed.logic.Storage`
  role - `org.nd4j.parameterserver.distributed.enums.NodeRole`
  shard-index - `short`"
  ([^VoidMessage this ^org.nd4j.parameterserver.distributed.conf.VoidConfiguration void-configuration ^org.nd4j.parameterserver.distributed.training.TrainingDriver trainer ^org.nd4j.parameterserver.distributed.logic.completion.Clipboard clipboard ^org.nd4j.parameterserver.distributed.transport.Transport transport ^org.nd4j.parameterserver.distributed.logic.Storage storage ^org.nd4j.parameterserver.distributed.enums.NodeRole role ^Short shard-index]
    (-> this (.attachContext void-configuration trainer clipboard transport storage role shard-index))))

(defn get-originator-id
  "returns: `long`"
  (^Long [^VoidMessage this]
    (-> this (.getOriginatorId))))

(defn get-retransmit-count
  "returns: `int`"
  (^Integer [^VoidMessage this]
    (-> this (.getRetransmitCount))))

(defn get-target-id
  "returns: `short`"
  (^Short [^VoidMessage this]
    (-> this (.getTargetId))))

