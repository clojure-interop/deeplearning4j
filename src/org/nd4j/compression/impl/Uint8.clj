(ns org.nd4j.compression.impl.Uint8
  "Compressor implementation based on uint8 as storage for integral values.
 So, all data will be stored in 0..255 space, so this compressor might be useful for images only"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.compression.impl Uint8]))

(defn ->uint-8
  "Constructor."
  (^Uint8 []
    (new Uint8 )))

(defn get-descriptor
  "This method returns compression descriptor. It should be unique for any compressor implementation

  returns: `java.lang.String`"
  (^java.lang.String [^Uint8 this]
    (-> this (.getDescriptor))))

(defn get-compression-type
  "This method returns compression opType provided by specific NDArrayCompressor implementation

  returns: `org.nd4j.linalg.compression.CompressionType`"
  (^org.nd4j.linalg.compression.CompressionType [^Uint8 this]
    (-> this (.getCompressionType))))

(defn decompress
  "Description copied from interface: NDArrayCompressor

  buffer - the buffer to decompress - `org.nd4j.linalg.api.buffer.DataBuffer`

  returns: the decompressed data buffer - `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^Uint8 this ^org.nd4j.linalg.api.buffer.DataBuffer buffer]
    (-> this (.decompress buffer))))

(defn compress
  "buffer - `org.nd4j.linalg.api.buffer.DataBuffer`

  returns: `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^Uint8 this ^org.nd4j.linalg.api.buffer.DataBuffer buffer]
    (-> this (.compress buffer))))

