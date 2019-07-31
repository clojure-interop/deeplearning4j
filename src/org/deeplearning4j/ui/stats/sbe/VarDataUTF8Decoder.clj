(ns org.deeplearning4j.ui.stats.sbe.VarDataUTF8Decoder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats.sbe VarDataUTF8Decoder]))

(defn ->var-data-utf-8-decoder
  "Constructor."
  (^VarDataUTF8Decoder []
    (new VarDataUTF8Decoder )))

(def *-encoded-length
  "Static Constant.

  type: int"
  VarDataUTF8Decoder/ENCODED_LENGTH)

(defn *length-null-value
  "returns: `long`"
  (^Long []
    (VarDataUTF8Decoder/lengthNullValue )))

(defn *length-min-value
  "returns: `long`"
  (^Long []
    (VarDataUTF8Decoder/lengthMinValue )))

(defn *length-max-value
  "returns: `long`"
  (^Long []
    (VarDataUTF8Decoder/lengthMaxValue )))

(defn *var-data-null-value
  "returns: `short`"
  (^Short []
    (VarDataUTF8Decoder/varDataNullValue )))

(defn *var-data-min-value
  "returns: `short`"
  (^Short []
    (VarDataUTF8Decoder/varDataMinValue )))

(defn *var-data-max-value
  "returns: `short`"
  (^Short []
    (VarDataUTF8Decoder/varDataMaxValue )))

(defn wrap
  "buffer - `org.agrona.DirectBuffer`
  offset - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.VarDataUTF8Decoder`"
  (^org.deeplearning4j.ui.stats.sbe.VarDataUTF8Decoder [^VarDataUTF8Decoder this ^org.agrona.DirectBuffer buffer ^Integer offset]
    (-> this (.wrap buffer offset))))

(defn encoded-length
  "returns: `int`"
  (^Integer [^VarDataUTF8Decoder this]
    (-> this (.encodedLength))))

(defn length
  "returns: `long`"
  (^Long [^VarDataUTF8Decoder this]
    (-> this (.length))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^VarDataUTF8Decoder this]
    (-> this (.toString))))

(defn append-to
  "builder - `java.lang.StringBuilder`

  returns: `java.lang.StringBuilder`"
  (^java.lang.StringBuilder [^VarDataUTF8Decoder this ^java.lang.StringBuilder builder]
    (-> this (.appendTo builder))))

