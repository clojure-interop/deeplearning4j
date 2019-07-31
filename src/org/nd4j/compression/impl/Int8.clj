(ns org.nd4j.compression.impl.Int8
  "Compressor implementation based on int8/aka char/aka byte as storage for integral values.
 So, all data will be stored in -128..127 space"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.compression.impl Int8]))

(defn ->int-8
  "Constructor."
  (^Int8 []
    (new Int8 )))

(defn get-descriptor
  "This method returns compression descriptor. It should be unique for any compressor implementation

  returns: `java.lang.String`"
  (^java.lang.String [^Int8 this]
    (-> this (.getDescriptor))))

(defn get-compression-type
  "This method returns compression opType provided by specific NDArrayCompressor implementation

  returns: `org.nd4j.linalg.compression.CompressionType`"
  (^org.nd4j.linalg.compression.CompressionType [^Int8 this]
    (-> this (.getCompressionType))))

(defn decompress
  "Description copied from interface: NDArrayCompressor

  buffer - the buffer to decompress - `org.nd4j.linalg.api.buffer.DataBuffer`

  returns: the decompressed data buffer - `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^Int8 this ^org.nd4j.linalg.api.buffer.DataBuffer buffer]
    (-> this (.decompress buffer))))

(defn compress
  "buffer - `org.nd4j.linalg.api.buffer.DataBuffer`

  returns: `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^Int8 this ^org.nd4j.linalg.api.buffer.DataBuffer buffer]
    (-> this (.compress buffer))))

