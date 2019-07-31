(ns org.deeplearning4j.ui.stats.sbe.InitFieldsPresentDecoder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats.sbe InitFieldsPresentDecoder]))

(defn ->init-fields-present-decoder
  "Constructor."
  (^InitFieldsPresentDecoder []
    (new InitFieldsPresentDecoder )))

(def *-encoded-length
  "Static Constant.

  type: int"
  InitFieldsPresentDecoder/ENCODED_LENGTH)

(defn wrap
  "buffer - `org.agrona.DirectBuffer`
  offset - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.InitFieldsPresentDecoder`"
  (^org.deeplearning4j.ui.stats.sbe.InitFieldsPresentDecoder [^InitFieldsPresentDecoder this ^org.agrona.DirectBuffer buffer ^Integer offset]
    (-> this (.wrap buffer offset))))

(defn encoded-length
  "returns: `int`"
  (^Integer [^InitFieldsPresentDecoder this]
    (-> this (.encodedLength))))

(defn software-info
  "returns: `boolean`"
  (^Boolean [^InitFieldsPresentDecoder this]
    (-> this (.softwareInfo))))

(defn hardware-info
  "returns: `boolean`"
  (^Boolean [^InitFieldsPresentDecoder this]
    (-> this (.hardwareInfo))))

(defn model-info
  "returns: `boolean`"
  (^Boolean [^InitFieldsPresentDecoder this]
    (-> this (.modelInfo))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InitFieldsPresentDecoder this]
    (-> this (.toString))))

(defn append-to
  "builder - `java.lang.StringBuilder`

  returns: `java.lang.StringBuilder`"
  (^java.lang.StringBuilder [^InitFieldsPresentDecoder this ^java.lang.StringBuilder builder]
    (-> this (.appendTo builder))))

