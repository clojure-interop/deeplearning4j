(ns org.nd4j.linalg.compression.BasicNDArrayCompressor
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.compression BasicNDArrayCompressor]))

(defn *get-instance
  "Get the ndarray compressor
  singleton

  returns: `org.nd4j.linalg.compression.BasicNDArrayCompressor`"
  (^org.nd4j.linalg.compression.BasicNDArrayCompressor []
    (BasicNDArrayCompressor/getInstance )))

(defn compress
  "Compress the data buffer
  given a specified algorithm

  buffer - the buffer to compress - `org.nd4j.linalg.api.buffer.DataBuffer`
  algorithm - the algorithm to compressuse - `java.lang.String`

  returns: the compressed data buffer - `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^BasicNDArrayCompressor this ^org.nd4j.linalg.api.buffer.DataBuffer buffer ^java.lang.String algorithm]
    (-> this (.compress buffer algorithm)))
  (^org.nd4j.linalg.api.buffer.DataBuffer [^BasicNDArrayCompressor this ^org.nd4j.linalg.api.buffer.DataBuffer buffer]
    (-> this (.compress buffer))))

(defn get-default-compression
  "Get the default compression algorithm as a string.
  This is an all caps algorithm with a representation in the
  CompressionAlgorithm enum

  returns: `java.lang.String`"
  (^java.lang.String [^BasicNDArrayCompressor this]
    (-> this (.getDefaultCompression))))

(defn auto-decompress
  "Decompress several ndarrays

  arrays - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BasicNDArrayCompressor this ^org.nd4j.linalg.api.ndarray.INDArray arrays]
    (-> this (.autoDecompress arrays))))

(defn print-available-compressors
  "Prints available compressors to standard out"
  ([^BasicNDArrayCompressor this]
    (-> this (.printAvailableCompressors))))

(defn decompress
  "Decompress the given databuffer

  buffer - the databuffer to compress - `org.nd4j.linalg.api.buffer.DataBuffer`

  returns: the decompressed databuffer - `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^BasicNDArrayCompressor this ^org.nd4j.linalg.api.buffer.DataBuffer buffer]
    (-> this (.decompress buffer))))

(defn set-default-compression
  "Set the default compression algorithm

  algorithm - the algorithm to set - `java.lang.String`

  returns: `org.nd4j.linalg.compression.BasicNDArrayCompressor`"
  (^org.nd4j.linalg.compression.BasicNDArrayCompressor [^BasicNDArrayCompressor this ^java.lang.String algorithm]
    (-> this (.setDefaultCompression algorithm))))

(defn get-compressor
  "name - `java.lang.String`

  returns: `org.nd4j.linalg.compression.NDArrayCompressor`"
  (^org.nd4j.linalg.compression.NDArrayCompressor [^BasicNDArrayCompressor this ^java.lang.String name]
    (-> this (.getCompressor name))))

(defn decompressi
  "in place decompression of the given
  ndarray. If the ndarray isn't compressed
  this will do nothing

  array - the array to decompressedif it is comprssed - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BasicNDArrayCompressor this ^org.nd4j.linalg.api.ndarray.INDArray array]
    (-> this (.decompressi array))))

(defn get-available-compressors
  "Get the set of available codecs for
  compression

  returns: `java.util.Set<java.lang.String>`"
  (^java.util.Set [^BasicNDArrayCompressor this]
    (-> this (.getAvailableCompressors))))

(defn compressi
  "In place Compress the given ndarray
  with the given algorithm

  array - the array to compress - `org.nd4j.linalg.api.ndarray.INDArray`
  algorithm - `java.lang.String`"
  ([^BasicNDArrayCompressor this ^org.nd4j.linalg.api.ndarray.INDArray array ^java.lang.String algorithm]
    (-> this (.compressi array algorithm)))
  ([^BasicNDArrayCompressor this ^org.nd4j.linalg.api.ndarray.INDArray array]
    (-> this (.compressi array))))

