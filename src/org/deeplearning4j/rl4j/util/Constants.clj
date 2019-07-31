(ns org.deeplearning4j.rl4j.util.Constants
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.util Constants]))

(defn ->constants
  "Constructor."
  (^Constants []
    (new Constants )))

(def *-data-dir
  "Static Constant.

  type: java.lang.String"
  Constants/DATA_DIR)

(def *-statistic-filename
  "Static Constant.

  type: java.lang.String"
  Constants/STATISTIC_FILENAME)

(def *-info-filename
  "Static Constant.

  type: java.lang.String"
  Constants/INFO_FILENAME)

(def *-model-dir
  "Static Constant.

  type: java.lang.String"
  Constants/MODEL_DIR)

(def *-video-dir
  "Static Constant.

  type: java.lang.String"
  Constants/VIDEO_DIR)

(def *-model-save-freq
  "Static Constant.

  type: int"
  Constants/MODEL_SAVE_FREQ)

(def *-monitor-freq
  "Static Constant.

  type: int"
  Constants/MONITOR_FREQ)

(def *-neural-net-seed
  "Static Constant.

  type: int"
  Constants/NEURAL_NET_SEED)

(def *-neural-net-iteration-listener
  "Static Constant.

  type: int"
  Constants/NEURAL_NET_ITERATION_LISTENER)

