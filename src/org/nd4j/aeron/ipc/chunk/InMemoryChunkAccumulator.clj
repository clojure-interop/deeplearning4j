(ns org.nd4j.aeron.ipc.chunk.InMemoryChunkAccumulator
  "Accumulate chunks and reassemble them."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.aeron.ipc.chunk InMemoryChunkAccumulator]))

(defn ->in-memory-chunk-accumulator
  "Constructor."
  (^InMemoryChunkAccumulator []
    (new InMemoryChunkAccumulator )))

(defn num-chunks-so-far
  "Returns the number of chunks
  accumulated for a given id so far

  id - the id to get thenumber of chunks for - `java.lang.String`

  returns: the number of chunks accumulated
  for a given id so far - `int`"
  (^Integer [^InMemoryChunkAccumulator this ^java.lang.String id]
    (-> this (.numChunksSoFar id))))

(defn all-present
  "Returns true if all chunks are present

  id - the id to check for - `java.lang.String`

  returns: true if all the chunks are present,false otherwise - `boolean`"
  (^Boolean [^InMemoryChunkAccumulator this ^java.lang.String id]
    (-> this (.allPresent id))))

(defn reassemble
  "Reassemble an ndarray message
  from a set of chunks
  Note that once reassemble is called,
  the associated chunk lists will automatically
  be removed from storage.

  id - the id to reassemble - `java.lang.String`

  returns: the reassembled message - `org.nd4j.aeron.ipc.NDArrayMessage`"
  (^org.nd4j.aeron.ipc.NDArrayMessage [^InMemoryChunkAccumulator this ^java.lang.String id]
    (-> this (.reassemble id))))

(defn accumulate-chunk
  "Accumulate chunks in a map
  until all chunks have been accumulated.
  You can check all chunks are present with
  ChunkAccumulator.allPresent(String)
  where the parameter is the id
  After all chunks have been accumulated
  you can call ChunkAccumulator.reassemble(String)
  where the id is the id of the chunk.

  chunk - the chunk - `org.nd4j.aeron.ipc.chunk.NDArrayMessageChunk`"
  ([^InMemoryChunkAccumulator this ^org.nd4j.aeron.ipc.chunk.NDArrayMessageChunk chunk]
    (-> this (.accumulateChunk chunk))))

