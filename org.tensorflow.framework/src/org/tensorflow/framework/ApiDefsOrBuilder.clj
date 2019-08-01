(ns org.tensorflow.framework.ApiDefsOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework ApiDefsOrBuilder]))

(defn get-op-list
  "repeated .tensorflow.ApiDef op = 1;

  returns: `java.util.List<org.tensorflow.framework.ApiDef>`"
  (^java.util.List [^ApiDefsOrBuilder this]
    (-> this (.getOpList))))

(defn get-op
  "repeated .tensorflow.ApiDef op = 1;

  index - `int`

  returns: `org.tensorflow.framework.ApiDef`"
  (^org.tensorflow.framework.ApiDef [^ApiDefsOrBuilder this ^Integer index]
    (-> this (.getOp index))))

(defn get-op-count
  "repeated .tensorflow.ApiDef op = 1;

  returns: `int`"
  (^Integer [^ApiDefsOrBuilder this]
    (-> this (.getOpCount))))

(defn get-op-or-builder-list
  "repeated .tensorflow.ApiDef op = 1;

  returns: `java.util.List<? extends org.tensorflow.framework.ApiDefOrBuilder>`"
  ([^ApiDefsOrBuilder this]
    (-> this (.getOpOrBuilderList))))

(defn get-op-or-builder
  "repeated .tensorflow.ApiDef op = 1;

  index - `int`

  returns: `org.tensorflow.framework.ApiDefOrBuilder`"
  (^org.tensorflow.framework.ApiDefOrBuilder [^ApiDefsOrBuilder this ^Integer index]
    (-> this (.getOpOrBuilder index))))

