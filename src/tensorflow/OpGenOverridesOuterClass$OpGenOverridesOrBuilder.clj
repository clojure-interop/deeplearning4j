(ns tensorflow.OpGenOverridesOuterClass$OpGenOverridesOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [tensorflow OpGenOverridesOuterClass$OpGenOverridesOrBuilder]))

(defn get-op-list
  "repeated .tensorflow.OpGenOverride op = 1;

  returns: `java.util.List<tensorflow.OpGenOverridesOuterClass$OpGenOverride>`"
  (^java.util.List [^OpGenOverridesOuterClass$OpGenOverridesOrBuilder this]
    (-> this (.getOpList))))

(defn get-op
  "repeated .tensorflow.OpGenOverride op = 1;

  index - `int`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride [^OpGenOverridesOuterClass$OpGenOverridesOrBuilder this ^Integer index]
    (-> this (.getOp index))))

(defn get-op-count
  "repeated .tensorflow.OpGenOverride op = 1;

  returns: `int`"
  (^Integer [^OpGenOverridesOuterClass$OpGenOverridesOrBuilder this]
    (-> this (.getOpCount))))

(defn get-op-or-builder-list
  "repeated .tensorflow.OpGenOverride op = 1;

  returns: `java.util.List<? extends tensorflow.OpGenOverridesOuterClass$OpGenOverrideOrBuilder>`"
  ([^OpGenOverridesOuterClass$OpGenOverridesOrBuilder this]
    (-> this (.getOpOrBuilderList))))

(defn get-op-or-builder
  "repeated .tensorflow.OpGenOverride op = 1;

  index - `int`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverrideOrBuilder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverrideOrBuilder [^OpGenOverridesOuterClass$OpGenOverridesOrBuilder this ^Integer index]
    (-> this (.getOpOrBuilder index))))

