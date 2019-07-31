(ns org.nd4j.compression.impl.Gzip
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.compression.impl Gzip]))

(defn ->gzip
  "Constructor."
  (^Gzip []
    (new Gzip )))

(defn get-descriptor
  "This method returns compression descriptor. It should be unique for any compressor implementation

  returns: `java.lang.String`"
  (^java.lang.String [^Gzip this]
    (-> this (.getDescriptor))))

(defn get-compression-type
  "This method returns compression opType provided by specific NDArrayCompressor implementation

  returns: `org.nd4j.linalg.compression.CompressionType`"
  (^org.nd4j.linalg.compression.CompressionType [^Gzip this]
    (-> this (.getCompressionType))))

(defn decompress
  "Description copied from interface: NDArrayCompressor

  buffer - the buffer to decompress - `org.nd4j.linalg.api.buffer.DataBuffer`

  returns: the decompressed data buffer - `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^Gzip this ^org.nd4j.linalg.api.buffer.DataBuffer buffer]
    (-> this (.decompress buffer))))

(defn compress
  "buffer - `org.nd4j.linalg.api.buffer.DataBuffer`

  returns: `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^Gzip this ^org.nd4j.linalg.api.buffer.DataBuffer buffer]
    (-> this (.compress buffer))))

