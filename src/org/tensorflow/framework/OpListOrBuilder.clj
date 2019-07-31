(ns org.tensorflow.framework.OpListOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework OpListOrBuilder]))

(defn get-op-list
  "repeated .tensorflow.OpDef op = 1;

  returns: `java.util.List<org.tensorflow.framework.OpDef>`"
  (^java.util.List [^OpListOrBuilder this]
    (-> this (.getOpList))))

(defn get-op
  "repeated .tensorflow.OpDef op = 1;

  index - `int`

  returns: `org.tensorflow.framework.OpDef`"
  (^org.tensorflow.framework.OpDef [^OpListOrBuilder this ^Integer index]
    (-> this (.getOp index))))

(defn get-op-count
  "repeated .tensorflow.OpDef op = 1;

  returns: `int`"
  (^Integer [^OpListOrBuilder this]
    (-> this (.getOpCount))))

(defn get-op-or-builder-list
  "repeated .tensorflow.OpDef op = 1;

  returns: `java.util.List<? extends org.tensorflow.framework.OpDefOrBuilder>`"
  ([^OpListOrBuilder this]
    (-> this (.getOpOrBuilderList))))

(defn get-op-or-builder
  "repeated .tensorflow.OpDef op = 1;

  index - `int`

  returns: `org.tensorflow.framework.OpDefOrBuilder`"
  (^org.tensorflow.framework.OpDefOrBuilder [^OpListOrBuilder this ^Integer index]
    (-> this (.getOpOrBuilder index))))

