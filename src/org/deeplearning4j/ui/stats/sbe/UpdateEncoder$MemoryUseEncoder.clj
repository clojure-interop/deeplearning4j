(ns org.deeplearning4j.ui.stats.sbe.UpdateEncoder$MemoryUseEncoder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats.sbe UpdateEncoder$MemoryUseEncoder]))

(defn ->memory-use-encoder
  "Constructor."
  (^UpdateEncoder$MemoryUseEncoder []
    (new UpdateEncoder$MemoryUseEncoder )))

(defn *sbe-header-size
  "returns: `int`"
  (^Integer []
    (UpdateEncoder$MemoryUseEncoder/sbeHeaderSize )))

(defn *sbe-block-length
  "returns: `int`"
  (^Integer []
    (UpdateEncoder$MemoryUseEncoder/sbeBlockLength )))

(defn *memory-bytes-null-value
  "returns: `long`"
  (^Long []
    (UpdateEncoder$MemoryUseEncoder/memoryBytesNullValue )))

(defn *memory-bytes-min-value
  "returns: `long`"
  (^Long []
    (UpdateEncoder$MemoryUseEncoder/memoryBytesMinValue )))

(defn *memory-bytes-max-value
  "returns: `long`"
  (^Long []
    (UpdateEncoder$MemoryUseEncoder/memoryBytesMaxValue )))

(defn wrap
  "parent-message - `org.deeplearning4j.ui.stats.sbe.UpdateEncoder`
  buffer - `org.agrona.MutableDirectBuffer`
  count - `int`"
  ([^UpdateEncoder$MemoryUseEncoder this ^org.deeplearning4j.ui.stats.sbe.UpdateEncoder parent-message ^org.agrona.MutableDirectBuffer buffer ^Integer count]
    (-> this (.wrap parent-message buffer count))))

(defn next
  "returns: `org.deeplearning4j.ui.stats.sbe.UpdateEncoder$MemoryUseEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateEncoder$MemoryUseEncoder [^UpdateEncoder$MemoryUseEncoder this]
    (-> this (.next))))

(defn memory-type
  "value - `org.deeplearning4j.ui.stats.sbe.MemoryType`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateEncoder$MemoryUseEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateEncoder$MemoryUseEncoder [^UpdateEncoder$MemoryUseEncoder this ^org.deeplearning4j.ui.stats.sbe.MemoryType value]
    (-> this (.memoryType value))))

(defn memory-bytes
  "value - `long`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateEncoder$MemoryUseEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateEncoder$MemoryUseEncoder [^UpdateEncoder$MemoryUseEncoder this ^Long value]
    (-> this (.memoryBytes value))))

