(ns org.nd4j.linalg.api.shape.options.ArrayOptionsHelper
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.shape.options ArrayOptionsHelper]))

(defn ->array-options-helper
  "Constructor."
  (^ArrayOptionsHelper []
    (new ArrayOptionsHelper )))

(defn *has-bit-set?
  "shape-info - `long[]`
  bit - `long`

  returns: `boolean`"
  (^Boolean [shape-info ^Long bit]
    (ArrayOptionsHelper/hasBitSet shape-info bit)))

(defn *set-option-bit
  "storage - `long[]`
  type - `org.nd4j.linalg.api.shape.options.ArrayType`"
  ([storage ^org.nd4j.linalg.api.shape.options.ArrayType type]
    (ArrayOptionsHelper/setOptionBit storage type)))

(defn *array-type
  "shape-info - `long[]`

  returns: `org.nd4j.linalg.api.shape.options.ArrayType`"
  (^org.nd4j.linalg.api.shape.options.ArrayType [shape-info]
    (ArrayOptionsHelper/arrayType shape-info)))

(defn *data-type
  "shape-info - `long[]`

  returns: `org.nd4j.linalg.api.buffer.DataBuffer$Type`"
  (^org.nd4j.linalg.api.buffer.DataBuffer$Type [shape-info]
    (ArrayOptionsHelper/dataType shape-info)))

