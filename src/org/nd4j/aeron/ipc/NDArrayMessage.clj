(ns org.nd4j.aeron.ipc.NDArrayMessage
  "A message sent over the wire for ndarrays
 includ ing the timestamp sent (in nanoseconds),
 index (for tensor along dimension view based updates)
 and dimensions.
 Fields:
 arr: Using AeronNDArraySerde.toArray(DirectBuffer, int) we extract the array from a buffer
 sent: the timestamp in milliseconds of when the message was sent (UTC timezone) - use getCurrentTimeUtc()
 when sending a message
 index: the index of the tensor along dimension for update (use -1 if there is no index, eg: when you are going to use the whole array)
 dimensions: the dimensions to do for a tensoralongdimension update, if you intend on updating the whole array send: new int[]{ -1} which
 will indicate to use the whole array for an update."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.aeron.ipc NDArrayMessage]))

(defn ->nd-array-message
  "Constructor."
  (^NDArrayMessage []
    (new NDArrayMessage )))

(defn *to-buffer
  "Convert a message to a direct buffer.
  See fromBuffer(DirectBuffer, int)
  for a description of the format for the buffer

  message - the message to convert - `org.nd4j.aeron.ipc.NDArrayMessage`

  returns: a direct byte buffer representing this message. - `org.agrona.DirectBuffer`"
  (^org.agrona.DirectBuffer [^org.nd4j.aeron.ipc.NDArrayMessage message]
    (NDArrayMessage/toBuffer message)))

(defn *chunks
  "Returns an array of
  message chunks meant to be sent
  in parallel.
  Each message chunk has the layout:
  messageType
  number of chunks
  chunkSize
  length of uuid
  uuid
  buffer index
  actual raw data

  message - the message to turn into chunks - `org.nd4j.aeron.ipc.NDArrayMessage`
  chunk-size - the chunk size - `int`

  returns: an array of buffers - `org.nd4j.aeron.ipc.chunk.NDArrayMessageChunk[]`"
  ([^org.nd4j.aeron.ipc.NDArrayMessage message ^Integer chunk-size]
    (NDArrayMessage/chunks message chunk-size)))

(defn *of
  "Factory method for creating an array
  to send now (uses now in utc for the timestamp).
  Note that this method will throw an
  IllegalArgumentException if an invalid message is passed in.
  An invalid message is as follows:
  An index of -1 and dimensions that are of greater length than 1 with an element that isn't -1

  arr - the array to send - `org.nd4j.linalg.api.ndarray.INDArray`
  dimensions - the dimensions to use - `int[]`
  index - the index to use - `long`

  returns: the created - `org.nd4j.aeron.ipc.NDArrayMessage`"
  (^org.nd4j.aeron.ipc.NDArrayMessage [^org.nd4j.linalg.api.ndarray.INDArray arr dimensions ^Long index]
    (NDArrayMessage/of arr dimensions index)))

(defn *from-chunks
  "Create an ndarray message from an array of buffers.
  This array of buffers would be assembled by an
  FragmentHandler
  capable of merging these messages together.
  Typically what happens is an AeronNDArraySubscriber
  will track chunks being sent.
  Anytime a subscriber received an NDArrayMessage.MessageType.CHUNKED
  as a opType it will store the buffer temporarily.

  chunks - `org.nd4j.aeron.ipc.chunk.NDArrayMessageChunk[]`

  returns: `org.nd4j.aeron.ipc.NDArrayMessage`"
  (^org.nd4j.aeron.ipc.NDArrayMessage [chunks]
    (NDArrayMessage/fromChunks chunks)))

(defn *whole-array-update
  "Prepare a whole array update
  which includes the default dimensions
  for indicating updating
  the whole array (a 1 length int array with -1 as its only element)
  -1 representing the dimension

  arr - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.aeron.ipc.NDArrayMessage`"
  (^org.nd4j.aeron.ipc.NDArrayMessage [^org.nd4j.linalg.api.ndarray.INDArray arr]
    (NDArrayMessage/wholeArrayUpdate arr)))

(defn *valid-message
  "Returns if a message is valid or not based on a few simple conditions:
  no null values
  both index and the dimensions array must be -1 and of length 1 with an element of -1 in it
  otherwise it is a valid message.

  message - the message to validate - `org.nd4j.aeron.ipc.NDArrayMessage`

  returns: 1 of: NULL_VALUE,INCONSISTENT_DIMENSIONS,VALID see NDArrayMessage.MessageValidity - `org.nd4j.aeron.ipc.NDArrayMessage$MessageValidity`"
  (^org.nd4j.aeron.ipc.NDArrayMessage$MessageValidity [^org.nd4j.aeron.ipc.NDArrayMessage message]
    (NDArrayMessage/validMessage message)))

(defn *byte-buffer-size-for-message
  "Returns the size needed in bytes
  for a bytebuffer for a given ndarray message.
  The formula is:
  BinarySerde.byteBufferSizeFor(INDArray)
  + size of dimension length (4)
  + time stamp size (8)
  + index size (8)
  + 4 * message.getDimensions.length

  message - the message to get the length for - `org.nd4j.aeron.ipc.NDArrayMessage`

  returns: the size of the byte buffer for a message - `int`"
  (^Integer [^org.nd4j.aeron.ipc.NDArrayMessage message]
    (NDArrayMessage/byteBufferSizeForMessage message)))

(defn *get-current-time-utc
  "Get the current time in utc in milliseconds

  returns: the current time in utc in
  milliseconds - `long`"
  (^Long []
    (NDArrayMessage/getCurrentTimeUtc )))

(defn *num-chunks-for-message
  "Determine the number of chunks

  message - `org.nd4j.aeron.ipc.NDArrayMessage`
  chunk-size - `int`

  returns: `int`"
  (^Integer [^org.nd4j.aeron.ipc.NDArrayMessage message ^Integer chunk-size]
    (NDArrayMessage/numChunksForMessage message chunk-size)))

(defn *chunked-messages
  "Create an array of messages to send
  based on a specified chunk size

  array-message - `org.nd4j.aeron.ipc.NDArrayMessage`
  chunk-size - `int`

  returns: `org.nd4j.aeron.ipc.NDArrayMessage[]`"
  ([^org.nd4j.aeron.ipc.NDArrayMessage array-message ^Integer chunk-size]
    (NDArrayMessage/chunkedMessages array-message chunk-size)))

(defn *from-buffer
  "Convert a direct buffer to an ndarray
  message.
  The format of the byte buffer is:
  ndarray
  time
  index
  dimension length
  dimensions
  We use AeronNDArraySerde.toArrayAndByteBuffer(DirectBuffer, int)
  to read in the ndarray and just use normal ByteBuffer.getInt() and
  ByteBuffer.getLong() to get the things like dimensions and index
  and time stamp.

  buffer - the buffer to convert - `org.agrona.DirectBuffer`
  offset - the offset to start at with the buffer - note that thismethod call assumes that the message opType is specified at the beginning of the buffer.This means whatever offset you pass in will be increased by 4 (the size of an int) - `int`

  returns: the ndarray message based on this direct buffer. - `org.nd4j.aeron.ipc.NDArrayMessage`"
  (^org.nd4j.aeron.ipc.NDArrayMessage [^org.agrona.DirectBuffer buffer ^Integer offset]
    (NDArrayMessage/fromBuffer buffer offset)))

