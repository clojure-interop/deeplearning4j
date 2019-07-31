(ns org.nd4j.aeron.ipc.chunk.ChunkAccumulator
  "Accumulate NDArrayMessageChunk and reassemble them in to
 NDArrayMessage."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.aeron.ipc.chunk ChunkAccumulator]))

(defn num-chunks-so-far
  "Returns the number of chunks
  accumulated for a given id so far

  id - the id to get thenumber of chunks for - `java.lang.String`

  returns: the number of chunks accumulated
  for a given id so far - `int`"
  (^Integer [^ChunkAccumulator this ^java.lang.String id]
    (-> this (.numChunksSoFar id))))

(defn all-present
  "Returns true if all chunks are present

  id - the id to check for - `java.lang.String`

  returns: true if all the chunks are present,false otherwise - `boolean`"
  (^Boolean [^ChunkAccumulator this ^java.lang.String id]
    (-> this (.allPresent id))))

(defn reassemble
  "Reassemble an ndarray message
  from a set of chunks
  Note that once reassemble is called,
  the associated chunk lists will automatically
  be removed from storage.

  id - the id to reassemble - `java.lang.String`

  returns: the reassembled message - `org.nd4j.aeron.ipc.NDArrayMessage`"
  (^org.nd4j.aeron.ipc.NDArrayMessage [^ChunkAccumulator this ^java.lang.String id]
    (-> this (.reassemble id))))

(defn accumulate-chunk
  "Accumulate chunks

  chunk - the chunk to accumulate - `org.nd4j.aeron.ipc.chunk.NDArrayMessageChunk`"
  ([^ChunkAccumulator this ^org.nd4j.aeron.ipc.chunk.NDArrayMessageChunk chunk]
    (-> this (.accumulateChunk chunk))))

