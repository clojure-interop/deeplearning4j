(ns org.deeplearning4j.spark.parameterserver.networking.messages.SilentUpdatesMessage
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.parameterserver.networking.messages SilentUpdatesMessage]))

(defn ->silent-updates-message
  "Constructor.

  encoded-updates - `org.nd4j.linalg.api.ndarray.INDArray`
  update-id - `long`"
  (^SilentUpdatesMessage [^org.nd4j.linalg.api.ndarray.INDArray encoded-updates ^Long update-id]
    (new SilentUpdatesMessage encoded-updates update-id)))

(defn attach-context
  "Description copied from interface: VoidMessage

  void-configuration - `org.nd4j.parameterserver.distributed.conf.VoidConfiguration`
  trainer - `org.nd4j.parameterserver.distributed.training.TrainingDriver`
  clipboard - `org.nd4j.parameterserver.distributed.logic.completion.Clipboard`
  transport - `org.nd4j.parameterserver.distributed.transport.Transport`
  storage - `org.nd4j.parameterserver.distributed.logic.Storage`
  role - `org.nd4j.parameterserver.distributed.enums.NodeRole`
  shard-index - `short`"
  ([^SilentUpdatesMessage this ^org.nd4j.parameterserver.distributed.conf.VoidConfiguration void-configuration ^org.nd4j.parameterserver.distributed.training.TrainingDriver trainer ^org.nd4j.parameterserver.distributed.logic.completion.Clipboard clipboard ^org.nd4j.parameterserver.distributed.transport.Transport transport ^org.nd4j.parameterserver.distributed.logic.Storage storage ^org.nd4j.parameterserver.distributed.enums.NodeRole role ^Short shard-index]
    (-> this (.attachContext void-configuration trainer clipboard transport storage role shard-index))))

(defn process-message
  "Description copied from interface: VoidMessage"
  ([^SilentUpdatesMessage this]
    (-> this (.processMessage))))

(defn get-counter
  "returns: `byte`"
  (^Byte [^SilentUpdatesMessage this]
    (-> this (.getCounter))))

(defn get-frame-id
  "returns: `long`"
  (^Long [^SilentUpdatesMessage this]
    (-> this (.getFrameId))))

(defn set-frame-id
  "frame-id - `long`"
  ([^SilentUpdatesMessage this ^Long frame-id]
    (-> this (.setFrameId frame-id))))

(defn join-supported?
  "returns: `boolean`"
  (^Boolean [^SilentUpdatesMessage this]
    (-> this (.isJoinSupported))))

