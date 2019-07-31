(ns org.deeplearning4j.ui.stats.sbe.VarDataUTF8Encoder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats.sbe VarDataUTF8Encoder]))

(defn ->var-data-utf-8-encoder
  "Constructor."
  (^VarDataUTF8Encoder []
    (new VarDataUTF8Encoder )))

(def *-encoded-length
  "Static Constant.

  type: int"
  VarDataUTF8Encoder/ENCODED_LENGTH)

(defn *length-null-value
  "returns: `long`"
  (^Long []
    (VarDataUTF8Encoder/lengthNullValue )))

(defn *length-min-value
  "returns: `long`"
  (^Long []
    (VarDataUTF8Encoder/lengthMinValue )))

(defn *length-max-value
  "returns: `long`"
  (^Long []
    (VarDataUTF8Encoder/lengthMaxValue )))

(defn *var-data-null-value
  "returns: `short`"
  (^Short []
    (VarDataUTF8Encoder/varDataNullValue )))

(defn *var-data-min-value
  "returns: `short`"
  (^Short []
    (VarDataUTF8Encoder/varDataMinValue )))

(defn *var-data-max-value
  "returns: `short`"
  (^Short []
    (VarDataUTF8Encoder/varDataMaxValue )))

(defn wrap
  "buffer - `org.agrona.MutableDirectBuffer`
  offset - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.VarDataUTF8Encoder`"
  (^org.deeplearning4j.ui.stats.sbe.VarDataUTF8Encoder [^VarDataUTF8Encoder this ^org.agrona.MutableDirectBuffer buffer ^Integer offset]
    (-> this (.wrap buffer offset))))

(defn encoded-length
  "returns: `int`"
  (^Integer [^VarDataUTF8Encoder this]
    (-> this (.encodedLength))))

(defn length
  "value - `long`

  returns: `org.deeplearning4j.ui.stats.sbe.VarDataUTF8Encoder`"
  (^org.deeplearning4j.ui.stats.sbe.VarDataUTF8Encoder [^VarDataUTF8Encoder this ^Long value]
    (-> this (.length value))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^VarDataUTF8Encoder this]
    (-> this (.toString))))

(defn append-to
  "builder - `java.lang.StringBuilder`

  returns: `java.lang.StringBuilder`"
  (^java.lang.StringBuilder [^VarDataUTF8Encoder this ^java.lang.StringBuilder builder]
    (-> this (.appendTo builder))))

