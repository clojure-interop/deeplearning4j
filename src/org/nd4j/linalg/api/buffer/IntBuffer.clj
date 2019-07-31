(ns org.nd4j.linalg.api.buffer.IntBuffer
  "Int buffer"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.buffer IntBuffer]))

(defn ->int-buffer
  "Constructor.

  Meant for creating another view of a buffer

  pointer - the underlying buffer to create a view from - `org.bytedeco.javacpp.Pointer`
  indexer - the indexer for the pointer - `org.bytedeco.javacpp.indexer.Indexer`
  length - the length of the view - `long`"
  (^IntBuffer [^org.bytedeco.javacpp.Pointer pointer ^org.bytedeco.javacpp.indexer.Indexer indexer ^Long length]
    (new IntBuffer pointer indexer length))
  (^IntBuffer [^Long length ^Boolean initialize]
    (new IntBuffer length initialize))
  (^IntBuffer [^Long length]
    (new IntBuffer length)))

(defn create
  "Description copied from class: BaseDataBuffer

  data - the buffer to create - `double[]`

  returns: the data buffer based on the given buffer - `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^IntBuffer this data]
    (-> this (.create data))))

