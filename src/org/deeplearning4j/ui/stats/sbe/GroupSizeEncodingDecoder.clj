(ns org.deeplearning4j.ui.stats.sbe.GroupSizeEncodingDecoder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats.sbe GroupSizeEncodingDecoder]))

(defn ->group-size-encoding-decoder
  "Constructor."
  (^GroupSizeEncodingDecoder []
    (new GroupSizeEncodingDecoder )))

(def *-encoded-length
  "Static Constant.

  type: int"
  GroupSizeEncodingDecoder/ENCODED_LENGTH)

(defn *block-length-null-value
  "returns: `int`"
  (^Integer []
    (GroupSizeEncodingDecoder/blockLengthNullValue )))

(defn *block-length-min-value
  "returns: `int`"
  (^Integer []
    (GroupSizeEncodingDecoder/blockLengthMinValue )))

(defn *block-length-max-value
  "returns: `int`"
  (^Integer []
    (GroupSizeEncodingDecoder/blockLengthMaxValue )))

(defn *num-in-group-null-value
  "returns: `int`"
  (^Integer []
    (GroupSizeEncodingDecoder/numInGroupNullValue )))

(defn *num-in-group-min-value
  "returns: `int`"
  (^Integer []
    (GroupSizeEncodingDecoder/numInGroupMinValue )))

(defn *num-in-group-max-value
  "returns: `int`"
  (^Integer []
    (GroupSizeEncodingDecoder/numInGroupMaxValue )))

(defn wrap
  "buffer - `org.agrona.DirectBuffer`
  offset - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.GroupSizeEncodingDecoder`"
  (^org.deeplearning4j.ui.stats.sbe.GroupSizeEncodingDecoder [^GroupSizeEncodingDecoder this ^org.agrona.DirectBuffer buffer ^Integer offset]
    (-> this (.wrap buffer offset))))

(defn encoded-length
  "returns: `int`"
  (^Integer [^GroupSizeEncodingDecoder this]
    (-> this (.encodedLength))))

(defn block-length
  "returns: `int`"
  (^Integer [^GroupSizeEncodingDecoder this]
    (-> this (.blockLength))))

(defn num-in-group
  "returns: `int`"
  (^Integer [^GroupSizeEncodingDecoder this]
    (-> this (.numInGroup))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^GroupSizeEncodingDecoder this]
    (-> this (.toString))))

(defn append-to
  "builder - `java.lang.StringBuilder`

  returns: `java.lang.StringBuilder`"
  (^java.lang.StringBuilder [^GroupSizeEncodingDecoder this ^java.lang.StringBuilder builder]
    (-> this (.appendTo builder))))

