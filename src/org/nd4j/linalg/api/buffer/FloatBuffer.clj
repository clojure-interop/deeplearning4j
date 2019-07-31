(ns org.nd4j.linalg.api.buffer.FloatBuffer
  "Data buffer for floats"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.buffer FloatBuffer]))

(defn ->float-buffer
  "Constructor.

  Meant for creating another view of a buffer

  pointer - the underlying buffer to create a view from - `org.bytedeco.javacpp.Pointer`
  indexer - the indexer for the pointer - `org.bytedeco.javacpp.indexer.Indexer`
  length - the length of the view - `long`"
  (^FloatBuffer [^org.bytedeco.javacpp.Pointer pointer ^org.bytedeco.javacpp.indexer.Indexer indexer ^Long length]
    (new FloatBuffer pointer indexer length))
  (^FloatBuffer [^Long length]
    (new FloatBuffer length))
  (^FloatBuffer [data ^Boolean copy ^Long offset ^org.nd4j.linalg.api.memory.MemoryWorkspace workspace]
    (new FloatBuffer data copy offset workspace))
  (^FloatBuffer [^Long length ^Boolean initialize]
    (new FloatBuffer length initialize)))

(defn create
  "Description copied from class: BaseDataBuffer

  data - the buffer to create - `double[]`

  returns: the data buffer based on the given buffer - `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^FloatBuffer this data]
    (-> this (.create data))))

