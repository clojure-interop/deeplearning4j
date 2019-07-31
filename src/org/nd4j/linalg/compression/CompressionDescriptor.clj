(ns org.nd4j.linalg.compression.CompressionDescriptor
  "A compression descriptor containing the
 compression opType, compression algorithm,
 original length, compressed length,
 number of elements, and the original
 element size"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.compression CompressionDescriptor]))

(defn ->compression-descriptor
  "Constructor.

  Initialize a compression descriptor
  based on the given algorithm and data buffer

  buffer - the data buffer to base the sizes off of - `org.nd4j.linalg.api.buffer.DataBuffer`
  algorithm - the algorithm usedin the descriptor - `java.lang.String`"
  (^CompressionDescriptor [^org.nd4j.linalg.api.buffer.DataBuffer buffer ^java.lang.String algorithm]
    (new CompressionDescriptor buffer algorithm))
  (^CompressionDescriptor [^org.nd4j.linalg.api.buffer.DataBuffer buffer]
    (new CompressionDescriptor buffer))
  (^CompressionDescriptor []
    (new CompressionDescriptor )))

(def *-compression-byte-buffer-length
  "Static Constant.

  type: int"
  CompressionDescriptor/COMPRESSION_BYTE_BUFFER_LENGTH)

(defn *from-byte-buffer
  "Instantiate a compression descriptor from
  the given bytebuffer

  byte-buffer - the bytebuffer to instantiatethe descriptor from - `java.nio.ByteBuffer`

  returns: the instantiated descriptor based on the given
  bytebuffer - `org.nd4j.linalg.compression.CompressionDescriptor`"
  (^org.nd4j.linalg.compression.CompressionDescriptor [^java.nio.ByteBuffer byte-buffer]
    (CompressionDescriptor/fromByteBuffer byte-buffer)))

(defn to-byte-buffer
  "Return a direct allocated
  bytebuffer from the compression codec.
  The size of the bytebuffer is calculated to be:
  40: 8  32
  two ints representing their enum values
  for the compression algorithm and opType
  and 4 longs for the compressed and
  original sizes

  returns: the bytebuffer described above - `java.nio.ByteBuffer`"
  (^java.nio.ByteBuffer [^CompressionDescriptor this]
    (-> this (.toByteBuffer))))

(defn clone
  "returns: `org.nd4j.linalg.compression.CompressionDescriptor`"
  (^org.nd4j.linalg.compression.CompressionDescriptor [^CompressionDescriptor this]
    (-> this (.clone))))

