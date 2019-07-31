(ns org.deeplearning4j.ui.stats.sbe.UpdateDecoder$MemoryUseDecoder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats.sbe UpdateDecoder$MemoryUseDecoder]))

(defn ->memory-use-decoder
  "Constructor."
  (^UpdateDecoder$MemoryUseDecoder []
    (new UpdateDecoder$MemoryUseDecoder )))

(defn *sbe-block-length
  "returns: `int`"
  (^Integer []
    (UpdateDecoder$MemoryUseDecoder/sbeBlockLength )))

(defn *memory-bytes-id
  "returns: `int`"
  (^Integer []
    (UpdateDecoder$MemoryUseDecoder/memoryBytesId )))

(defn *memory-bytes-max-value
  "returns: `long`"
  (^Long []
    (UpdateDecoder$MemoryUseDecoder/memoryBytesMaxValue )))

(defn *memory-bytes-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (UpdateDecoder$MemoryUseDecoder/memoryBytesMetaAttribute meta-attribute)))

(defn *memory-type-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (UpdateDecoder$MemoryUseDecoder/memoryTypeMetaAttribute meta-attribute)))

(defn *memory-bytes-null-value
  "returns: `long`"
  (^Long []
    (UpdateDecoder$MemoryUseDecoder/memoryBytesNullValue )))

(defn *memory-bytes-min-value
  "returns: `long`"
  (^Long []
    (UpdateDecoder$MemoryUseDecoder/memoryBytesMinValue )))

(defn *memory-type-id
  "returns: `int`"
  (^Integer []
    (UpdateDecoder$MemoryUseDecoder/memoryTypeId )))

(defn *sbe-header-size
  "returns: `int`"
  (^Integer []
    (UpdateDecoder$MemoryUseDecoder/sbeHeaderSize )))

(defn next
  "returns: `org.deeplearning4j.ui.stats.sbe.UpdateDecoder$MemoryUseDecoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateDecoder$MemoryUseDecoder [^UpdateDecoder$MemoryUseDecoder this]
    (-> this (.next))))

(defn append-to
  "builder - `java.lang.StringBuilder`

  returns: `java.lang.StringBuilder`"
  (^java.lang.StringBuilder [^UpdateDecoder$MemoryUseDecoder this ^java.lang.StringBuilder builder]
    (-> this (.appendTo builder))))

(defn memory-bytes
  "returns: `long`"
  (^Long [^UpdateDecoder$MemoryUseDecoder this]
    (-> this (.memoryBytes))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^UpdateDecoder$MemoryUseDecoder this]
    (-> this (.toString))))

(defn count
  "returns: `int`"
  (^Integer [^UpdateDecoder$MemoryUseDecoder this]
    (-> this (.count))))

(defn iterator
  "returns: `java.util.Iterator<org.deeplearning4j.ui.stats.sbe.UpdateDecoder$MemoryUseDecoder>`"
  (^java.util.Iterator [^UpdateDecoder$MemoryUseDecoder this]
    (-> this (.iterator))))

(defn wrap
  "parent-message - `org.deeplearning4j.ui.stats.sbe.UpdateDecoder`
  buffer - `org.agrona.DirectBuffer`"
  ([^UpdateDecoder$MemoryUseDecoder this ^org.deeplearning4j.ui.stats.sbe.UpdateDecoder parent-message ^org.agrona.DirectBuffer buffer]
    (-> this (.wrap parent-message buffer))))

(defn remove
  ""
  ([^UpdateDecoder$MemoryUseDecoder this]
    (-> this (.remove))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^UpdateDecoder$MemoryUseDecoder this]
    (-> this (.hasNext))))

(defn acting-block-length
  "returns: `int`"
  (^Integer [^UpdateDecoder$MemoryUseDecoder this]
    (-> this (.actingBlockLength))))

(defn memory-type
  "returns: `org.deeplearning4j.ui.stats.sbe.MemoryType`"
  (^org.deeplearning4j.ui.stats.sbe.MemoryType [^UpdateDecoder$MemoryUseDecoder this]
    (-> this (.memoryType))))

