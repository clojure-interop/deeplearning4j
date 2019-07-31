(ns org.nd4j.parameterserver.distributed.messages.TrainingMessage
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.messages TrainingMessage]))

(defn get-counter
  "returns: `byte`"
  (^Byte [^TrainingMessage this]
    (-> this (.getCounter))))

(defn get-frame-id
  "returns: `long`"
  (^Long [^TrainingMessage this]
    (-> this (.getFrameId))))

(defn set-frame-id
  "frame-id - `long`"
  ([^TrainingMessage this ^Long frame-id]
    (-> this (.setFrameId frame-id))))

