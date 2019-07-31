(ns org.datavec.audio.WaveHeader
  "WAV File Specification
 https://ccrma.stanford.edu/courses/422/projects/WaveFormat/"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.audio WaveHeader]))

(defn ->wave-header
  "Constructor.

  input-stream - `java.io.InputStream`"
  (^WaveHeader [^java.io.InputStream input-stream]
    (new WaveHeader input-stream))
  (^WaveHeader []
    (new WaveHeader )))

(def *-riff-header
  "Static Constant.

  type: java.lang.String"
  WaveHeader/RIFF_HEADER)

(def *-wave-header
  "Static Constant.

  type: java.lang.String"
  WaveHeader/WAVE_HEADER)

(def *-fmt-header
  "Static Constant.

  type: java.lang.String"
  WaveHeader/FMT_HEADER)

(def *-data-header
  "Static Constant.

  type: java.lang.String"
  WaveHeader/DATA_HEADER)

(def *-header-byte-length
  "Static Constant.

  type: int"
  WaveHeader/HEADER_BYTE_LENGTH)

(defn set-bits-per-sample
  "bits-per-sample - `int`"
  ([^WaveHeader this ^Integer bits-per-sample]
    (-> this (.setBitsPerSample bits-per-sample))))

(defn get-sample-rate
  "returns: `int`"
  (^Integer [^WaveHeader this]
    (-> this (.getSampleRate))))

(defn get-sub-chunk-2-id
  "returns: `java.lang.String`"
  (^java.lang.String [^WaveHeader this]
    (-> this (.getSubChunk2Id))))

(defn get-audio-format
  "returns: `int`"
  (^Integer [^WaveHeader this]
    (-> this (.getAudioFormat))))

(defn set-sub-chunk-2-id
  "sub-chunk-2-id - `java.lang.String`"
  ([^WaveHeader this ^java.lang.String sub-chunk-2-id]
    (-> this (.setSubChunk2Id sub-chunk-2-id))))

(defn set-sample-rate
  "sample-rate - `int`"
  ([^WaveHeader this ^Integer sample-rate]
    (-> this (.setSampleRate sample-rate))))

(defn get-block-align
  "returns: `int`"
  (^Integer [^WaveHeader this]
    (-> this (.getBlockAlign))))

(defn set-format
  "format - `java.lang.String`"
  ([^WaveHeader this ^java.lang.String format]
    (-> this (.setFormat format))))

(defn get-bits-per-sample
  "returns: `int`"
  (^Integer [^WaveHeader this]
    (-> this (.getBitsPerSample))))

(defn set-sub-chunk-1-id
  "sub-chunk-1-id - `java.lang.String`"
  ([^WaveHeader this ^java.lang.String sub-chunk-1-id]
    (-> this (.setSubChunk1Id sub-chunk-1-id))))

(defn set-chunk-id
  "chunk-id - `java.lang.String`"
  ([^WaveHeader this ^java.lang.String chunk-id]
    (-> this (.setChunkId chunk-id))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^WaveHeader this]
    (-> this (.toString))))

(defn get-byte-rate
  "returns: `int`"
  (^Integer [^WaveHeader this]
    (-> this (.getByteRate))))

(defn set-chunk-size
  "chunk-size - `long`"
  ([^WaveHeader this ^Long chunk-size]
    (-> this (.setChunkSize chunk-size))))

(defn set-audio-format
  "audio-format - `int`"
  ([^WaveHeader this ^Integer audio-format]
    (-> this (.setAudioFormat audio-format))))

(defn set-block-align
  "block-align - `int`"
  ([^WaveHeader this ^Integer block-align]
    (-> this (.setBlockAlign block-align))))

(defn get-channels
  "returns: `int`"
  (^Integer [^WaveHeader this]
    (-> this (.getChannels))))

(defn get-chunk-id
  "returns: `java.lang.String`"
  (^java.lang.String [^WaveHeader this]
    (-> this (.getChunkId))))

(defn get-sub-chunk-1-id
  "returns: `java.lang.String`"
  (^java.lang.String [^WaveHeader this]
    (-> this (.getSubChunk1Id))))

(defn set-sub-chunk-1-size
  "sub-chunk-1-size - `long`"
  ([^WaveHeader this ^Long sub-chunk-1-size]
    (-> this (.setSubChunk1Size sub-chunk-1-size))))

(defn set-channels
  "channels - `int`"
  ([^WaveHeader this ^Integer channels]
    (-> this (.setChannels channels))))

(defn get-sub-chunk-2-size
  "returns: `long`"
  (^Long [^WaveHeader this]
    (-> this (.getSubChunk2Size))))

(defn valid?
  "returns: `boolean`"
  (^Boolean [^WaveHeader this]
    (-> this (.isValid))))

(defn get-format
  "returns: `java.lang.String`"
  (^java.lang.String [^WaveHeader this]
    (-> this (.getFormat))))

(defn set-byte-rate
  "byte-rate - `long`"
  ([^WaveHeader this ^Long byte-rate]
    (-> this (.setByteRate byte-rate))))

(defn get-sub-chunk-1-size
  "returns: `long`"
  (^Long [^WaveHeader this]
    (-> this (.getSubChunk1Size))))

(defn set-sub-chunk-2-size
  "sub-chunk-2-size - `long`"
  ([^WaveHeader this ^Long sub-chunk-2-size]
    (-> this (.setSubChunk2Size sub-chunk-2-size))))

(defn get-chunk-size
  "returns: `long`"
  (^Long [^WaveHeader this]
    (-> this (.getChunkSize))))

