(ns org.nd4j.linalg.jcublas.buffer.CudaLongDataBuffer
  "Cuda double buffer"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.jcublas.buffer CudaLongDataBuffer]))

(defn ->cuda-long-data-buffer
  "Constructor.

  Meant for creating another view of a buffer

  pointer - the underlying buffer to create a view from - `org.bytedeco.javacpp.Pointer`
  indexer - the indexer for the pointer - `org.bytedeco.javacpp.indexer.Indexer`
  length - the length of the view - `long`"
  (^CudaLongDataBuffer [^org.bytedeco.javacpp.Pointer pointer ^org.bytedeco.javacpp.indexer.Indexer indexer ^Long length]
    (new CudaLongDataBuffer pointer indexer length))
  (^CudaLongDataBuffer [^Long length]
    (new CudaLongDataBuffer length))
  (^CudaLongDataBuffer [data ^Boolean copy ^Long offset ^org.nd4j.linalg.api.memory.MemoryWorkspace workspace]
    (new CudaLongDataBuffer data copy offset workspace))
  (^CudaLongDataBuffer [^Long length ^Boolean initialize]
    (new CudaLongDataBuffer length initialize)))

(defn assign
  "Description copied from interface: DataBuffer

  indices - the indices to assign - `long[]`
  data - the data to assign - `float[]`
  contiguous - whether the indices are contiguous or not - `boolean`
  inc - the number to increment by when assigning - `long`"
  ([^CudaLongDataBuffer this indices data ^Boolean contiguous ^Long inc]
    (-> this (.assign indices data contiguous inc))))

(defn set-data
  "Description copied from interface: DataBuffer

  data - the data for this buffer - `int[]`"
  ([^CudaLongDataBuffer this data]
    (-> this (.setData data))))

(defn create
  "Description copied from class: BaseDataBuffer

  data - the buffer to create - `double[]`

  returns: the data buffer based on the given buffer - `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^CudaLongDataBuffer this data]
    (-> this (.create data))))

