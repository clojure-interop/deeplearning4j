(ns org.nd4j.parameterserver.distributed.logic.completion.FrameCompletionHandler
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.logic.completion FrameCompletionHandler]))

(defn ->frame-completion-handler
  "Constructor."
  (^FrameCompletionHandler []
    (new FrameCompletionHandler )))

(defn tracking-frame?
  "originator-id - `long`
  frame-id - `long`

  returns: `boolean`"
  (^Boolean [^FrameCompletionHandler this ^Long originator-id ^Long frame-id]
    (-> this (.isTrackingFrame originator-id frame-id)))
  (^Boolean [^FrameCompletionHandler this ^org.nd4j.parameterserver.distributed.logic.completion.RequestDescriptor descriptor]
    (-> this (.isTrackingFrame descriptor))))

(defn add-hook
  "originator-id - `java.lang.Long`
  frame-id - `java.lang.Long`
  message-id - `java.lang.Long`"
  ([^FrameCompletionHandler this ^java.lang.Long originator-id ^java.lang.Long frame-id ^java.lang.Long message-id]
    (-> this (.addHook originator-id frame-id message-id))))

(defn notify-frame
  "originator-id - `java.lang.Long`
  frame-id - `java.lang.Long`
  message-id - `java.lang.Long`"
  ([^FrameCompletionHandler this ^java.lang.Long originator-id ^java.lang.Long frame-id ^java.lang.Long message-id]
    (-> this (.notifyFrame originator-id frame-id message-id)))
  ([^FrameCompletionHandler this ^org.nd4j.parameterserver.distributed.logic.completion.RequestDescriptor descriptor ^java.lang.Long message-id]
    (-> this (.notifyFrame descriptor message-id))))

(defn completed?
  "originator-id - `long`
  frame-id - `long`

  returns: `boolean`"
  (^Boolean [^FrameCompletionHandler this ^Long originator-id ^Long frame-id]
    (-> this (.isCompleted originator-id frame-id)))
  (^Boolean [^FrameCompletionHandler this ^org.nd4j.parameterserver.distributed.logic.completion.RequestDescriptor descriptor]
    (-> this (.isCompleted descriptor))))

(defn get-completed-frame-info
  "originator-id - `long`
  frame-id - `long`

  returns: `org.nd4j.parameterserver.distributed.logic.completion.FrameCompletionHandler$FrameDescriptor`"
  (^org.nd4j.parameterserver.distributed.logic.completion.FrameCompletionHandler$FrameDescriptor [^FrameCompletionHandler this ^Long originator-id ^Long frame-id]
    (-> this (.getCompletedFrameInfo originator-id frame-id)))
  (^org.nd4j.parameterserver.distributed.logic.completion.FrameCompletionHandler$FrameDescriptor [^FrameCompletionHandler this ^org.nd4j.parameterserver.distributed.logic.completion.RequestDescriptor descriptor]
    (-> this (.getCompletedFrameInfo descriptor))))

