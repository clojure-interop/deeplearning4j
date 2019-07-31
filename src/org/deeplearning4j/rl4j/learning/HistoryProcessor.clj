(ns org.deeplearning4j.rl4j.learning.HistoryProcessor
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.learning HistoryProcessor]))

(defn ->history-processor
  "Constructor.

  conf - `org.deeplearning4j.rl4j.learning.IHistoryProcessor$Configuration`"
  (^HistoryProcessor [^org.deeplearning4j.rl4j.learning.IHistoryProcessor$Configuration conf]
    (new HistoryProcessor conf)))

(defn *-compressor
  "Static Field.

  type: org.nd4j.linalg.compression.BasicNDArrayCompressor"
  []
  HistoryProcessor/compressor)

(defn monitoring?
  "returns: `boolean`"
  (^Boolean [^HistoryProcessor this]
    (-> this (.isMonitoring))))

(defn record
  "raw - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^HistoryProcessor this ^org.nd4j.linalg.api.ndarray.INDArray raw]
    (-> this (.record raw))))

(defn get-history
  "Description copied from interface: IHistoryProcessor

  returns: `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^HistoryProcessor this]
    (-> this (.getHistory))))

(defn start-monitor
  "filename - `java.lang.String`
  shape - `int[]`"
  ([^HistoryProcessor this ^java.lang.String filename shape]
    (-> this (.startMonitor filename shape))))

(defn show
  "m - `org.bytedeco.javacpp.opencv_core.Mat`"
  ([^HistoryProcessor this ^org.bytedeco.javacpp.opencv_core.Mat m]
    (-> this (.show m))))

(defn get-scale
  "Description copied from interface: IHistoryProcessor

  returns: `double`"
  (^Double [^HistoryProcessor this]
    (-> this (.getScale))))

(defn wait-kp
  ""
  ([^HistoryProcessor this]
    (-> this (.waitKP))))

(defn add
  "obs - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^HistoryProcessor this ^org.nd4j.linalg.api.ndarray.INDArray obs]
    (-> this (.add obs))))

(defn stop-monitor
  ""
  ([^HistoryProcessor this]
    (-> this (.stopMonitor))))

