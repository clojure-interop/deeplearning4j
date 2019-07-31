(ns org.deeplearning4j.rl4j.learning.IHistoryProcessor
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.learning IHistoryProcessor]))

(defn get-conf
  "returns: `org.deeplearning4j.rl4j.learning.IHistoryProcessor$Configuration`"
  (^org.deeplearning4j.rl4j.learning.IHistoryProcessor$Configuration [^IHistoryProcessor this]
    (-> this (.getConf))))

(defn get-history
  "Returns compressed arrays, which must be rescaled based
  on the value returned by getScale().

  returns: `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^IHistoryProcessor this]
    (-> this (.getHistory))))

(defn record
  "image - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^IHistoryProcessor this ^org.nd4j.linalg.api.ndarray.INDArray image]
    (-> this (.record image))))

(defn add
  "image - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^IHistoryProcessor this ^org.nd4j.linalg.api.ndarray.INDArray image]
    (-> this (.add image))))

(defn start-monitor
  "filename - `java.lang.String`
  shape - `int[]`"
  ([^IHistoryProcessor this ^java.lang.String filename shape]
    (-> this (.startMonitor filename shape))))

(defn stop-monitor
  ""
  ([^IHistoryProcessor this]
    (-> this (.stopMonitor))))

(defn monitoring?
  "returns: `boolean`"
  (^Boolean [^IHistoryProcessor this]
    (-> this (.isMonitoring))))

(defn get-scale
  "Returns the scale of the arrays returned by getHistory(), typically 255.

  returns: `double`"
  (^Double [^IHistoryProcessor this]
    (-> this (.getScale))))

