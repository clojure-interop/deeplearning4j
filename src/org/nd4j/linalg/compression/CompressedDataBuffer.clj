(ns org.nd4j.linalg.compression.CompressedDataBuffer
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.compression CompressedDataBuffer]))

(defn ->compressed-data-buffer
  "Constructor.

  pointer - `org.bytedeco.javacpp.Pointer`
  descriptor - `org.nd4j.linalg.compression.CompressionDescriptor`"
  (^CompressedDataBuffer [^org.bytedeco.javacpp.Pointer pointer ^org.nd4j.linalg.compression.CompressionDescriptor descriptor]
    (new CompressedDataBuffer pointer descriptor)))

(defn *read-unknown
  "Drop-in replacement wrapper for BaseDataBuffer.read() method, aware of CompressedDataBuffer

  s - `java.io.DataInputStream`
  length - `long`

  returns: `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^java.io.DataInputStream s ^Long length]
    (CompressedDataBuffer/readUnknown s length)))

(defn write
  "out - `java.io.DataOutputStream`

  throws: java.io.IOException"
  ([^CompressedDataBuffer this ^java.io.DataOutputStream out]
    (-> this (.write out))))

(defn dup
  "Description copied from interface: DataBuffer

  returns: a copy of this buffer - `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^CompressedDataBuffer this]
    (-> this (.dup))))

(defn length
  "Description copied from interface: DataBuffer

  returns: the length of the buffer - `long`"
  (^Long [^CompressedDataBuffer this]
    (-> this (.length))))

(defn create
  "Create the data buffer
  with respect to the given byte buffer

  data - the buffer to create - `double[]`

  returns: the data buffer based on the given buffer - `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^CompressedDataBuffer this data]
    (-> this (.create data))))

