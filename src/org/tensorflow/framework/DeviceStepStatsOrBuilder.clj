(ns org.tensorflow.framework.DeviceStepStatsOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework DeviceStepStatsOrBuilder]))

(defn get-device
  "string device = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^DeviceStepStatsOrBuilder this]
    (-> this (.getDevice))))

(defn get-device-bytes
  "string device = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^DeviceStepStatsOrBuilder this]
    (-> this (.getDeviceBytes))))

(defn get-node-stats-list
  "repeated .tensorflow.NodeExecStats node_stats = 2;

  returns: `java.util.List<org.tensorflow.framework.NodeExecStats>`"
  (^java.util.List [^DeviceStepStatsOrBuilder this]
    (-> this (.getNodeStatsList))))

(defn get-node-stats
  "repeated .tensorflow.NodeExecStats node_stats = 2;

  index - `int`

  returns: `org.tensorflow.framework.NodeExecStats`"
  (^org.tensorflow.framework.NodeExecStats [^DeviceStepStatsOrBuilder this ^Integer index]
    (-> this (.getNodeStats index))))

(defn get-node-stats-count
  "repeated .tensorflow.NodeExecStats node_stats = 2;

  returns: `int`"
  (^Integer [^DeviceStepStatsOrBuilder this]
    (-> this (.getNodeStatsCount))))

(defn get-node-stats-or-builder-list
  "repeated .tensorflow.NodeExecStats node_stats = 2;

  returns: `java.util.List<? extends org.tensorflow.framework.NodeExecStatsOrBuilder>`"
  ([^DeviceStepStatsOrBuilder this]
    (-> this (.getNodeStatsOrBuilderList))))

(defn get-node-stats-or-builder
  "repeated .tensorflow.NodeExecStats node_stats = 2;

  index - `int`

  returns: `org.tensorflow.framework.NodeExecStatsOrBuilder`"
  (^org.tensorflow.framework.NodeExecStatsOrBuilder [^DeviceStepStatsOrBuilder this ^Integer index]
    (-> this (.getNodeStatsOrBuilder index))))

