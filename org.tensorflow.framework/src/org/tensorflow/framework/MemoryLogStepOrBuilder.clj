(ns org.tensorflow.framework.MemoryLogStepOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework MemoryLogStepOrBuilder]))

(defn get-step-id
  "Process-unique step id.
  int64 step_id = 1;

  returns: `long`"
  (^Long [^MemoryLogStepOrBuilder this]
    (-> this (.getStepId))))

(defn get-handle
  "Handle describing the feeds and fetches of the step.
  string handle = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^MemoryLogStepOrBuilder this]
    (-> this (.getHandle))))

(defn get-handle-bytes
  "Handle describing the feeds and fetches of the step.
  string handle = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^MemoryLogStepOrBuilder this]
    (-> this (.getHandleBytes))))

