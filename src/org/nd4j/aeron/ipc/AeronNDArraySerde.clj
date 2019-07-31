(ns org.nd4j.aeron.ipc.AeronNDArraySerde
  "NDArray Serialization and
 de serialization class for
 aeron.
 This is a low level class
 specifically meant for speed."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.aeron.ipc AeronNDArraySerde]))

(defn ->aeron-nd-array-serde
  "Constructor."
  (^AeronNDArraySerde []
    (new AeronNDArraySerde )))

(defn *get-direct-byte-buffer
  "Get the direct byte buffer from the given direct buffer

  direct-buffer - `org.agrona.DirectBuffer`

  returns: `java.nio.ByteBuffer`"
  (^java.nio.ByteBuffer [^org.agrona.DirectBuffer direct-buffer]
    (AeronNDArraySerde/getDirectByteBuffer direct-buffer)))

(defn *to-buffer
  "Convert an ndarray to an unsafe buffer
  for use by aeron

  arr - the array to convert - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the unsafebuffer representation of this array - `org.agrona.concurrent.UnsafeBuffer`"
  (^org.agrona.concurrent.UnsafeBuffer [^org.nd4j.linalg.api.ndarray.INDArray arr]
    (AeronNDArraySerde/toBuffer arr)))

(defn *to-array-and-byte-buffer
  "Create an ndarray
  from the unsafe buffer.
  Note that if you are interacting with a buffer that specifies
  an NDArrayMessage.MessageType
  then you must pass in an offset  4.
  Adding 4 to the offset will cause the inter

  buffer - the buffer to create the array from - `org.agrona.DirectBuffer`
  offset - `int`

  returns: the ndarray derived from this buffer - `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,java.nio.ByteBuffer>`"
  (^org.nd4j.linalg.primitives.Pair [^org.agrona.DirectBuffer buffer ^Integer offset]
    (AeronNDArraySerde/toArrayAndByteBuffer buffer offset)))

(defn *to-array
  "Create an ndarray
  from the unsafe buffer

  buffer - the buffer to create the array from - `org.agrona.DirectBuffer`
  offset - `int`

  returns: the ndarray derived from this buffer - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.agrona.DirectBuffer buffer ^Integer offset]
    (AeronNDArraySerde/toArray buffer offset))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.agrona.DirectBuffer buffer]
    (AeronNDArraySerde/toArray buffer)))

