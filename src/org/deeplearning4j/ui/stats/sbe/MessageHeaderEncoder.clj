(ns org.deeplearning4j.ui.stats.sbe.MessageHeaderEncoder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats.sbe MessageHeaderEncoder]))

(defn ->message-header-encoder
  "Constructor."
  (^MessageHeaderEncoder []
    (new MessageHeaderEncoder )))

(def *-encoded-length
  "Static Constant.

  type: int"
  MessageHeaderEncoder/ENCODED_LENGTH)

(defn *block-length-max-value
  "returns: `int`"
  (^Integer []
    (MessageHeaderEncoder/blockLengthMaxValue )))

(defn *schema-id-null-value
  "returns: `int`"
  (^Integer []
    (MessageHeaderEncoder/schemaIdNullValue )))

(defn *schema-id-max-value
  "returns: `int`"
  (^Integer []
    (MessageHeaderEncoder/schemaIdMaxValue )))

(defn *template-id-min-value
  "returns: `int`"
  (^Integer []
    (MessageHeaderEncoder/templateIdMinValue )))

(defn *template-id-max-value
  "returns: `int`"
  (^Integer []
    (MessageHeaderEncoder/templateIdMaxValue )))

(defn *block-length-min-value
  "returns: `int`"
  (^Integer []
    (MessageHeaderEncoder/blockLengthMinValue )))

(defn *version-min-value
  "returns: `int`"
  (^Integer []
    (MessageHeaderEncoder/versionMinValue )))

(defn *version-null-value
  "returns: `int`"
  (^Integer []
    (MessageHeaderEncoder/versionNullValue )))

(defn *block-length-null-value
  "returns: `int`"
  (^Integer []
    (MessageHeaderEncoder/blockLengthNullValue )))

(defn *schema-id-min-value
  "returns: `int`"
  (^Integer []
    (MessageHeaderEncoder/schemaIdMinValue )))

(defn *version-max-value
  "returns: `int`"
  (^Integer []
    (MessageHeaderEncoder/versionMaxValue )))

(defn *template-id-null-value
  "returns: `int`"
  (^Integer []
    (MessageHeaderEncoder/templateIdNullValue )))

(defn wrap
  "buffer - `org.agrona.MutableDirectBuffer`
  offset - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.MessageHeaderEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.MessageHeaderEncoder [^MessageHeaderEncoder this ^org.agrona.MutableDirectBuffer buffer ^Integer offset]
    (-> this (.wrap buffer offset))))

(defn encoded-length
  "returns: `int`"
  (^Integer [^MessageHeaderEncoder this]
    (-> this (.encodedLength))))

(defn block-length
  "value - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.MessageHeaderEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.MessageHeaderEncoder [^MessageHeaderEncoder this ^Integer value]
    (-> this (.blockLength value))))

(defn template-id
  "value - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.MessageHeaderEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.MessageHeaderEncoder [^MessageHeaderEncoder this ^Integer value]
    (-> this (.templateId value))))

(defn schema-id
  "value - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.MessageHeaderEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.MessageHeaderEncoder [^MessageHeaderEncoder this ^Integer value]
    (-> this (.schemaId value))))

(defn version
  "value - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.MessageHeaderEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.MessageHeaderEncoder [^MessageHeaderEncoder this ^Integer value]
    (-> this (.version value))))

