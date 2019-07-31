(ns org.nd4j.compression.impl.Float16
  "Compressor implementation based on half-precision floats, aka FP16"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.compression.impl Float16]))

(defn ->float-16
  "Constructor."
  (^Float16 []
    (new Float16 )))

(defn get-descriptor
  "Description copied from interface: NDArrayCompressor

  returns: `java.lang.String`"
  (^java.lang.String [^Float16 this]
    (-> this (.getDescriptor))))

(defn get-compression-type
  "This method returns compression opType provided by specific NDArrayCompressor implementation

  returns: `org.nd4j.linalg.compression.CompressionType`"
  (^org.nd4j.linalg.compression.CompressionType [^Float16 this]
    (-> this (.getCompressionType))))

(defn decompress
  "Description copied from interface: NDArrayCompressor

  buffer - the buffer to decompress - `org.nd4j.linalg.api.buffer.DataBuffer`

  returns: the decompressed data buffer - `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^Float16 this ^org.nd4j.linalg.api.buffer.DataBuffer buffer]
    (-> this (.decompress buffer))))

(defn compress
  "buffer - `org.nd4j.linalg.api.buffer.DataBuffer`

  returns: `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^Float16 this ^org.nd4j.linalg.api.buffer.DataBuffer buffer]
    (-> this (.compress buffer))))

