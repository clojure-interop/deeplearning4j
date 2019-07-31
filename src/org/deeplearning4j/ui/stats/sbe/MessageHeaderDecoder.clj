(ns org.deeplearning4j.ui.stats.sbe.MessageHeaderDecoder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats.sbe MessageHeaderDecoder]))

(defn ->message-header-decoder
  "Constructor."
  (^MessageHeaderDecoder []
    (new MessageHeaderDecoder )))

(def *-encoded-length
  "Static Constant.

  type: int"
  MessageHeaderDecoder/ENCODED_LENGTH)

(defn *block-length-max-value
  "returns: `int`"
  (^Integer []
    (MessageHeaderDecoder/blockLengthMaxValue )))

(defn *schema-id-null-value
  "returns: `int`"
  (^Integer []
    (MessageHeaderDecoder/schemaIdNullValue )))

(defn *schema-id-max-value
  "returns: `int`"
  (^Integer []
    (MessageHeaderDecoder/schemaIdMaxValue )))

(defn *template-id-min-value
  "returns: `int`"
  (^Integer []
    (MessageHeaderDecoder/templateIdMinValue )))

(defn *template-id-max-value
  "returns: `int`"
  (^Integer []
    (MessageHeaderDecoder/templateIdMaxValue )))

(defn *block-length-min-value
  "returns: `int`"
  (^Integer []
    (MessageHeaderDecoder/blockLengthMinValue )))

(defn *version-min-value
  "returns: `int`"
  (^Integer []
    (MessageHeaderDecoder/versionMinValue )))

(defn *version-null-value
  "returns: `int`"
  (^Integer []
    (MessageHeaderDecoder/versionNullValue )))

(defn *block-length-null-value
  "returns: `int`"
  (^Integer []
    (MessageHeaderDecoder/blockLengthNullValue )))

(defn *schema-id-min-value
  "returns: `int`"
  (^Integer []
    (MessageHeaderDecoder/schemaIdMinValue )))

(defn *version-max-value
  "returns: `int`"
  (^Integer []
    (MessageHeaderDecoder/versionMaxValue )))

(defn *template-id-null-value
  "returns: `int`"
  (^Integer []
    (MessageHeaderDecoder/templateIdNullValue )))

(defn wrap
  "buffer - `org.agrona.DirectBuffer`
  offset - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.MessageHeaderDecoder`"
  (^org.deeplearning4j.ui.stats.sbe.MessageHeaderDecoder [^MessageHeaderDecoder this ^org.agrona.DirectBuffer buffer ^Integer offset]
    (-> this (.wrap buffer offset))))

(defn encoded-length
  "returns: `int`"
  (^Integer [^MessageHeaderDecoder this]
    (-> this (.encodedLength))))

(defn block-length
  "returns: `int`"
  (^Integer [^MessageHeaderDecoder this]
    (-> this (.blockLength))))

(defn template-id
  "returns: `int`"
  (^Integer [^MessageHeaderDecoder this]
    (-> this (.templateId))))

(defn schema-id
  "returns: `int`"
  (^Integer [^MessageHeaderDecoder this]
    (-> this (.schemaId))))

(defn version
  "returns: `int`"
  (^Integer [^MessageHeaderDecoder this]
    (-> this (.version))))

