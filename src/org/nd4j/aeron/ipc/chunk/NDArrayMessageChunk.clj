(ns org.nd4j.aeron.ipc.chunk.NDArrayMessageChunk
  "An NDArrayMessageChunk
 represents a chunked NDArrayMessage
 that needs to be reassembled.
 This chunking is for large messages
 that need to be segmented to be sent over the wire.
 An AeronNDArraySubscriber
 would use this information to assemble a contiguous buffer
 to be used for assembling a large NDArrayMessage
 Of note is that this chunk will also contain the needed data
 for assembling in addition to the desired metadata such as the chunk size.
 A chunk has an idea which is used to track the chunk
 across fragmentations, an index fr determining ordering
 for re assembling, and metadata about the chunk such as
 the chunk size and number of chunks"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.aeron.ipc.chunk NDArrayMessageChunk]))

(defn ->nd-array-message-chunk
  "Constructor."
  (^NDArrayMessageChunk []
    (new NDArrayMessageChunk )))

(defn *size-for-message
  "Returns the overall size for an NDArrayMessageChunk.
  The size of a message chunk is:
  idLengthSize(4)  messageTypeSize(4)  indexSize(4)  chunkSizeSize(4)  numChunksSize(4)  chunk.getData().limit()  chunk.getId().getBytes().length
  Many of these are flat out integers and are mainly variables for accounting purposes and ease of readbility

  chunk - the size of a message chunk - `org.nd4j.aeron.ipc.chunk.NDArrayMessageChunk`

  returns: the size of an ByteBuffer for the given NDArrayMessageChunk - `int`"
  (^Integer [^org.nd4j.aeron.ipc.chunk.NDArrayMessageChunk chunk]
    (NDArrayMessageChunk/sizeForMessage chunk)))

(defn *to-buffer
  "Convert an ndarray message chunk to a buffer.

  chunk - the chunk to convert - `org.nd4j.aeron.ipc.chunk.NDArrayMessageChunk`

  returns: an ByteBuffer based on the
  passed in message chunk. - `java.nio.ByteBuffer`"
  (^java.nio.ByteBuffer [^org.nd4j.aeron.ipc.chunk.NDArrayMessageChunk chunk]
    (NDArrayMessageChunk/toBuffer chunk)))

(defn *from-buffer
  "Returns a chunk given the passed in ByteBuffer
  NOTE THAT THIS WILL MODIFY THE PASSED IN BYTEBUFFER's POSITION.

  byte-buffer - the byte buffer to extract the chunk from - `java.nio.ByteBuffer`
  type - `org.nd4j.aeron.ipc.NDArrayMessage$MessageType`

  returns: the ndarray message chunk based on the passed in ByteBuffer - `org.nd4j.aeron.ipc.chunk.NDArrayMessageChunk`"
  (^org.nd4j.aeron.ipc.chunk.NDArrayMessageChunk [^java.nio.ByteBuffer byte-buffer ^org.nd4j.aeron.ipc.NDArrayMessage$MessageType type]
    (NDArrayMessageChunk/fromBuffer byte-buffer type)))

