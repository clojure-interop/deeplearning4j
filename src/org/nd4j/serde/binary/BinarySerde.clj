(ns org.nd4j.serde.binary.BinarySerde
  "Created by agibsonccc on 7/1/17."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.serde.binary BinarySerde]))

(defn ->binary-serde
  "Constructor."
  (^BinarySerde []
    (new BinarySerde )))

(defn *byte-buffer-size-for
  "Returns the byte buffer size for the given
  ndarray. This is an auxillary method
  for determining the size of the buffer
  size to allocate for sending an ndarray via
  the aeron media driver.
  The math break down for uncompressed is:
  2 ints for rank of the array and an ordinal representing the data opType of the data buffer
  The rest is in order:
  shape information
  data buffer
  The math break down for compressed is:
  2 ints for rank and an ordinal representing the data opType for the data buffer
  The rest is in order:
  shape information
  codec information
  data buffer

  arr - the array to compute the size for - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the size of the byte buffer that was allocated - `int`"
  (^Integer [^org.nd4j.linalg.api.ndarray.INDArray arr]
    (BinarySerde/byteBufferSizeFor arr)))

(defn *read-from-disk
  "Read an ndarray from disk

  read-from - `java.io.File`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`

  throws: java.io.IOException"
  (^org.nd4j.linalg.api.ndarray.INDArray [^java.io.File read-from]
    (BinarySerde/readFromDisk read-from)))

(defn *write-array-to-disk
  "Write an ndarray to disk in
  binary format

  arr - the array to write - `org.nd4j.linalg.api.ndarray.INDArray`
  to-write - the file tow rite to - `java.io.File`

  throws: java.io.IOException"
  ([^org.nd4j.linalg.api.ndarray.INDArray arr ^java.io.File to-write]
    (BinarySerde/writeArrayToDisk arr to-write)))

(defn *to-array-and-byte-buffer
  "Create an ndarray and existing bytebuffer

  buffer - `java.nio.ByteBuffer`
  offset - `int`

  returns: `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,java.nio.ByteBuffer>`"
  (^org.nd4j.linalg.primitives.Pair [^java.nio.ByteBuffer buffer ^Integer offset]
    (BinarySerde/toArrayAndByteBuffer buffer offset)))

(defn *to-byte-buffer
  "Convert an ndarray to an unsafe buffer
  for use by aeron

  arr - the array to convert - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the unsafebuffer representation of this array - `java.nio.ByteBuffer`"
  (^java.nio.ByteBuffer [^org.nd4j.linalg.api.ndarray.INDArray arr]
    (BinarySerde/toByteBuffer arr)))

(defn *read-shape-from-disk
  "This method returns shape databuffer from saved earlier file

  read-from - `java.io.File`

  returns: `org.nd4j.linalg.api.buffer.DataBuffer`

  throws: java.io.IOException"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^java.io.File read-from]
    (BinarySerde/readShapeFromDisk read-from)))

(defn *do-byte-buffer-put-compressed
  "Setup the given byte buffer
  for serialization (note that this is for compressed INDArrays)
  4 bytes for rank
  4 bytes for data opType
  shape information
  codec information
  data opType

  arr - the array to setup - `org.nd4j.linalg.api.ndarray.INDArray`
  allocated - the byte buffer to setup - `java.nio.ByteBuffer`
  rewind - whether to rewind the byte buffer or not - `boolean`"
  ([^org.nd4j.linalg.api.ndarray.INDArray arr ^java.nio.ByteBuffer allocated ^Boolean rewind]
    (BinarySerde/doByteBufferPutCompressed arr allocated rewind)))

(defn *do-byte-buffer-put-un-compressed
  "Setup the given byte buffer
  for serialization (note that this is for uncompressed INDArrays)
  4 bytes int for rank
  4 bytes for data opType
  shape buffer
  data buffer

  arr - the array to setup - `org.nd4j.linalg.api.ndarray.INDArray`
  allocated - the byte buffer to setup - `java.nio.ByteBuffer`
  rewind - whether to rewind the byte buffer or nt - `boolean`"
  ([^org.nd4j.linalg.api.ndarray.INDArray arr ^java.nio.ByteBuffer allocated ^Boolean rewind]
    (BinarySerde/doByteBufferPutUnCompressed arr allocated rewind)))

(defn *write-array-to-output-stream
  "Write an array to an output stream.

  arr - the array to write - `org.nd4j.linalg.api.ndarray.INDArray`
  output-stream - the output stream to write to - `java.io.OutputStream`"
  ([^org.nd4j.linalg.api.ndarray.INDArray arr ^java.io.OutputStream output-stream]
    (BinarySerde/writeArrayToOutputStream arr output-stream)))

(defn *to-array
  "Create an ndarray
  from the unsafe buffer

  buffer - the buffer to create the array from - `java.nio.ByteBuffer`
  offset - `int`

  returns: the ndarray derived from this buffer - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^java.nio.ByteBuffer buffer ^Integer offset]
    (BinarySerde/toArray buffer offset))
  (^org.nd4j.linalg.api.ndarray.INDArray [^java.nio.ByteBuffer buffer]
    (BinarySerde/toArray buffer)))

