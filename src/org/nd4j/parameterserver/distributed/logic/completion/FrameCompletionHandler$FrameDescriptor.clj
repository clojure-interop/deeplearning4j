(ns org.nd4j.parameterserver.distributed.logic.completion.FrameCompletionHandler$FrameDescriptor
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.logic.completion FrameCompletionHandler$FrameDescriptor]))

(defn ->frame-descriptor
  "Constructor.

  frame-originator-id - `long`"
  (^FrameCompletionHandler$FrameDescriptor [^Long frame-originator-id]
    (new FrameCompletionHandler$FrameDescriptor frame-originator-id)))

(defn finished?
  "returns: `boolean`"
  (^Boolean [^FrameCompletionHandler$FrameDescriptor this]
    (-> this (.isFinished))))

(defn add-message
  "message-id - `java.lang.Long`"
  ([^FrameCompletionHandler$FrameDescriptor this ^java.lang.Long message-id]
    (-> this (.addMessage message-id))))

(defn finished-message
  "message-id - `java.lang.Long`"
  ([^FrameCompletionHandler$FrameDescriptor this ^java.lang.Long message-id]
    (-> this (.finishedMessage message-id))))

(defn get-incomplete-number
  "returns: `int`"
  (^Integer [^FrameCompletionHandler$FrameDescriptor this]
    (-> this (.getIncompleteNumber))))

