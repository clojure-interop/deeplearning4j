(ns org.deeplearning4j.ui.stats.sbe.GroupSizeEncodingEncoder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats.sbe GroupSizeEncodingEncoder]))

(defn ->group-size-encoding-encoder
  "Constructor."
  (^GroupSizeEncodingEncoder []
    (new GroupSizeEncodingEncoder )))

(def *-encoded-length
  "Static Constant.

  type: int"
  GroupSizeEncodingEncoder/ENCODED_LENGTH)

(defn *block-length-null-value
  "returns: `int`"
  (^Integer []
    (GroupSizeEncodingEncoder/blockLengthNullValue )))

(defn *block-length-min-value
  "returns: `int`"
  (^Integer []
    (GroupSizeEncodingEncoder/blockLengthMinValue )))

(defn *block-length-max-value
  "returns: `int`"
  (^Integer []
    (GroupSizeEncodingEncoder/blockLengthMaxValue )))

(defn *num-in-group-null-value
  "returns: `int`"
  (^Integer []
    (GroupSizeEncodingEncoder/numInGroupNullValue )))

(defn *num-in-group-min-value
  "returns: `int`"
  (^Integer []
    (GroupSizeEncodingEncoder/numInGroupMinValue )))

(defn *num-in-group-max-value
  "returns: `int`"
  (^Integer []
    (GroupSizeEncodingEncoder/numInGroupMaxValue )))

(defn wrap
  "buffer - `org.agrona.MutableDirectBuffer`
  offset - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.GroupSizeEncodingEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.GroupSizeEncodingEncoder [^GroupSizeEncodingEncoder this ^org.agrona.MutableDirectBuffer buffer ^Integer offset]
    (-> this (.wrap buffer offset))))

(defn encoded-length
  "returns: `int`"
  (^Integer [^GroupSizeEncodingEncoder this]
    (-> this (.encodedLength))))

(defn block-length
  "value - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.GroupSizeEncodingEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.GroupSizeEncodingEncoder [^GroupSizeEncodingEncoder this ^Integer value]
    (-> this (.blockLength value))))

(defn num-in-group
  "value - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.GroupSizeEncodingEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.GroupSizeEncodingEncoder [^GroupSizeEncodingEncoder this ^Integer value]
    (-> this (.numInGroup value))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^GroupSizeEncodingEncoder this]
    (-> this (.toString))))

(defn append-to
  "builder - `java.lang.StringBuilder`

  returns: `java.lang.StringBuilder`"
  (^java.lang.StringBuilder [^GroupSizeEncodingEncoder this ^java.lang.StringBuilder builder]
    (-> this (.appendTo builder))))

