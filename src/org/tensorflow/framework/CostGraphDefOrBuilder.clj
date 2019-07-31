(ns org.tensorflow.framework.CostGraphDefOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework CostGraphDefOrBuilder]))

(defn get-node-list
  "repeated .tensorflow.CostGraphDef.Node node = 1;

  returns: `java.util.List<org.tensorflow.framework.CostGraphDef$Node>`"
  (^java.util.List [^CostGraphDefOrBuilder this]
    (-> this (.getNodeList))))

(defn get-node
  "repeated .tensorflow.CostGraphDef.Node node = 1;

  index - `int`

  returns: `org.tensorflow.framework.CostGraphDef$Node`"
  (^org.tensorflow.framework.CostGraphDef$Node [^CostGraphDefOrBuilder this ^Integer index]
    (-> this (.getNode index))))

(defn get-node-count
  "repeated .tensorflow.CostGraphDef.Node node = 1;

  returns: `int`"
  (^Integer [^CostGraphDefOrBuilder this]
    (-> this (.getNodeCount))))

(defn get-node-or-builder-list
  "repeated .tensorflow.CostGraphDef.Node node = 1;

  returns: `java.util.List<? extends org.tensorflow.framework.CostGraphDef$NodeOrBuilder>`"
  ([^CostGraphDefOrBuilder this]
    (-> this (.getNodeOrBuilderList))))

(defn get-node-or-builder
  "repeated .tensorflow.CostGraphDef.Node node = 1;

  index - `int`

  returns: `org.tensorflow.framework.CostGraphDef$NodeOrBuilder`"
  (^org.tensorflow.framework.CostGraphDef$NodeOrBuilder [^CostGraphDefOrBuilder this ^Integer index]
    (-> this (.getNodeOrBuilder index))))

