(ns org.nd4j.linalg.api.buffer.allocation.MemoryStrategy
  "An allocation strategy handles allocating
 and freeing memory for the gpu
 (usually relative to the compute capabilities of the gpu)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.buffer.allocation MemoryStrategy]))

(defn set-data
  "Set the data for the buffer

  buffer - the buffer to set - `org.nd4j.linalg.api.buffer.DataBuffer`
  offset - the offset to start at - `int`
  stride - the stride to sue - `int`
  length - the length to go till - `int`"
  ([^MemoryStrategy this ^org.nd4j.linalg.api.buffer.DataBuffer buffer ^Integer offset ^Integer stride ^Integer length]
    (-> this (.setData buffer offset stride length)))
  ([^MemoryStrategy this ^org.nd4j.linalg.api.buffer.DataBuffer buffer ^Integer offset]
    (-> this (.setData buffer offset))))

(defn copy-to-host
  "Copy data to native or gpu

  copy - the buffer to copy - `org.nd4j.linalg.api.buffer.DataBuffer`
  offset - `int`

  returns: a pointer representing
  the copied data - `java.lang.Object`"
  (^java.lang.Object [^MemoryStrategy this ^org.nd4j.linalg.api.buffer.DataBuffer copy ^Integer offset]
    (-> this (.copyToHost copy offset))))

(defn alloc
  "Allocate memory for the given buffer

  buffer - the buffer to allocate for - `org.nd4j.linalg.api.buffer.DataBuffer`
  stride - the stride - `int`
  offset - the offset used for the bufferon allocation - `int`
  length - length - `int`

  returns: `java.lang.Object`"
  (^java.lang.Object [^MemoryStrategy this ^org.nd4j.linalg.api.buffer.DataBuffer buffer ^Integer stride ^Integer offset ^Integer length]
    (-> this (.alloc buffer stride offset length))))

(defn free
  "Free the buffer wrt the
  allocation strategy

  buffer - the buffer to free - `org.nd4j.linalg.api.buffer.DataBuffer`
  offset - the offset to free - `int`
  length - the length to free - `int`"
  ([^MemoryStrategy this ^org.nd4j.linalg.api.buffer.DataBuffer buffer ^Integer offset ^Integer length]
    (-> this (.free buffer offset length))))

