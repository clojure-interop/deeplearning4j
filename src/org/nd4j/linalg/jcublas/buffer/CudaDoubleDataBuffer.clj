(ns org.nd4j.linalg.jcublas.buffer.CudaDoubleDataBuffer
  "Cuda double buffer"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.jcublas.buffer CudaDoubleDataBuffer]))

(defn ->cuda-double-data-buffer
  "Constructor.

  Meant for creating another view of a buffer

  pointer - the underlying buffer to create a view from - `org.bytedeco.javacpp.Pointer`
  indexer - the indexer for the pointer - `org.bytedeco.javacpp.indexer.Indexer`
  length - the length of the view - `long`"
  (^CudaDoubleDataBuffer [^org.bytedeco.javacpp.Pointer pointer ^org.bytedeco.javacpp.indexer.Indexer indexer ^Long length]
    (new CudaDoubleDataBuffer pointer indexer length))
  (^CudaDoubleDataBuffer [^Long length]
    (new CudaDoubleDataBuffer length))
  (^CudaDoubleDataBuffer [data ^Boolean copy ^Long offset ^org.nd4j.linalg.api.memory.MemoryWorkspace workspace]
    (new CudaDoubleDataBuffer data copy offset workspace))
  (^CudaDoubleDataBuffer [^Long length ^Boolean initialize]
    (new CudaDoubleDataBuffer length initialize)))

(defn assign
  "Description copied from interface: DataBuffer

  indices - the indices to assign - `long[]`
  data - the data to assign - `float[]`
  contiguous - whether the indices are contiguous or not - `boolean`
  inc - the number to increment by when assigning - `long`"
  ([^CudaDoubleDataBuffer this indices data ^Boolean contiguous ^Long inc]
    (-> this (.assign indices data contiguous inc))))

(defn set-data
  "Description copied from interface: DataBuffer

  data - the data for this buffer - `int[]`"
  ([^CudaDoubleDataBuffer this data]
    (-> this (.setData data))))

(defn create
  "Description copied from class: BaseDataBuffer

  data - the buffer to create - `double[]`

  returns: the data buffer based on the given buffer - `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^CudaDoubleDataBuffer this data]
    (-> this (.create data))))

