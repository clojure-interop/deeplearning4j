(ns org.nd4j.linalg.jcublas.buffer.CudaIntDataBuffer
  "Cuda int buffer"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.jcublas.buffer CudaIntDataBuffer]))

(defn ->cuda-int-data-buffer
  "Constructor.

  Meant for creating another view of a buffer

  pointer - the underlying buffer to create a view from - `org.bytedeco.javacpp.Pointer`
  indexer - the indexer for the pointer - `org.bytedeco.javacpp.indexer.Indexer`
  length - the length of the view - `long`"
  (^CudaIntDataBuffer [^org.bytedeco.javacpp.Pointer pointer ^org.bytedeco.javacpp.indexer.Indexer indexer ^Long length]
    (new CudaIntDataBuffer pointer indexer length))
  (^CudaIntDataBuffer [^Long length]
    (new CudaIntDataBuffer length))
  (^CudaIntDataBuffer [^Long length ^org.nd4j.linalg.api.memory.MemoryWorkspace workspace]
    (new CudaIntDataBuffer length workspace)))

(defn assign
  "Description copied from interface: DataBuffer

  indices - the indices to assign - `long[]`
  data - the data to assign - `float[]`
  contiguous - whether the indices are contiguous or not - `boolean`
  inc - the number to increment by when assigning - `long`"
  ([^CudaIntDataBuffer this indices data ^Boolean contiguous ^Long inc]
    (-> this (.assign indices data contiguous inc))))

(defn create
  "Description copied from class: BaseDataBuffer

  data - the buffer to create - `double[]`

  returns: the data buffer based on the given buffer - `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^CudaIntDataBuffer this data]
    (-> this (.create data))))

