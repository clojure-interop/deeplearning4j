(ns org.deeplearning4j.ui.stats.sbe.InitFieldsPresentEncoder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats.sbe InitFieldsPresentEncoder]))

(defn ->init-fields-present-encoder
  "Constructor."
  (^InitFieldsPresentEncoder []
    (new InitFieldsPresentEncoder )))

(def *-encoded-length
  "Static Constant.

  type: int"
  InitFieldsPresentEncoder/ENCODED_LENGTH)

(defn wrap
  "buffer - `org.agrona.MutableDirectBuffer`
  offset - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.InitFieldsPresentEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.InitFieldsPresentEncoder [^InitFieldsPresentEncoder this ^org.agrona.MutableDirectBuffer buffer ^Integer offset]
    (-> this (.wrap buffer offset))))

(defn encoded-length
  "returns: `int`"
  (^Integer [^InitFieldsPresentEncoder this]
    (-> this (.encodedLength))))

(defn clear
  "returns: `org.deeplearning4j.ui.stats.sbe.InitFieldsPresentEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.InitFieldsPresentEncoder [^InitFieldsPresentEncoder this]
    (-> this (.clear))))

(defn software-info
  "value - `boolean`

  returns: `org.deeplearning4j.ui.stats.sbe.InitFieldsPresentEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.InitFieldsPresentEncoder [^InitFieldsPresentEncoder this ^Boolean value]
    (-> this (.softwareInfo value))))

(defn hardware-info
  "value - `boolean`

  returns: `org.deeplearning4j.ui.stats.sbe.InitFieldsPresentEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.InitFieldsPresentEncoder [^InitFieldsPresentEncoder this ^Boolean value]
    (-> this (.hardwareInfo value))))

(defn model-info
  "value - `boolean`

  returns: `org.deeplearning4j.ui.stats.sbe.InitFieldsPresentEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.InitFieldsPresentEncoder [^InitFieldsPresentEncoder this ^Boolean value]
    (-> this (.modelInfo value))))

