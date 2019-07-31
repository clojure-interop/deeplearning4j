(ns org.nd4j.parameterserver.distributed.messages.BaseVoidMessage
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.messages BaseVoidMessage]))

(defn blocking-message?
  "returns: `boolean`"
  (^Boolean [^BaseVoidMessage this]
    (-> this (.isBlockingMessage))))

(defn join-supported?
  "returns: `boolean`"
  (^Boolean [^BaseVoidMessage this]
    (-> this (.isJoinSupported))))

(defn as-unsafe-buffer
  "returns: `org.agrona.concurrent.UnsafeBuffer`"
  (^org.agrona.concurrent.UnsafeBuffer [^BaseVoidMessage this]
    (-> this (.asUnsafeBuffer))))

(defn get-message-type
  "returns: `int`"
  (^Integer [^BaseVoidMessage this]
    (-> this (.getMessageType))))

(defn increment-retransmit-count
  ""
  ([^BaseVoidMessage this]
    (-> this (.incrementRetransmitCount))))

(defn extract-context
  "message - `org.nd4j.parameterserver.distributed.messages.BaseVoidMessage`"
  ([^BaseVoidMessage this ^org.nd4j.parameterserver.distributed.messages.BaseVoidMessage message]
    (-> this (.extractContext message))))

(defn join-message
  "message - `org.nd4j.parameterserver.distributed.messages.VoidMessage`"
  ([^BaseVoidMessage this ^org.nd4j.parameterserver.distributed.messages.VoidMessage message]
    (-> this (.joinMessage message))))

(defn as-bytes
  "returns: `byte[]`"
  ([^BaseVoidMessage this]
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
  ([^BaseVoidMessage this ^org.nd4j.parameterserver.distributed.conf.VoidConfiguration void-configuration ^org.nd4j.parameterserver.distributed.training.TrainingDriver trainer ^org.nd4j.parameterserver.distributed.logic.completion.Clipboard clipboard ^org.nd4j.parameterserver.distributed.transport.Transport transport ^org.nd4j.parameterserver.distributed.logic.Storage storage ^org.nd4j.parameterserver.distributed.enums.NodeRole role ^Short shard-index]
    (-> this (.attachContext void-configuration trainer clipboard transport storage role shard-index))))

