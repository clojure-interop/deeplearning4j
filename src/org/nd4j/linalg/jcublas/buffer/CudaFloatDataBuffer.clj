(ns org.nd4j.linalg.jcublas.buffer.CudaFloatDataBuffer
  "Cuda float buffer"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.jcublas.buffer CudaFloatDataBuffer]))

(defn ->cuda-float-data-buffer
  "Constructor.

  Meant for creating another view of a buffer

  pointer - the underlying buffer to create a view from - `org.bytedeco.javacpp.Pointer`
  indexer - the indexer for the pointer - `org.bytedeco.javacpp.indexer.Indexer`
  length - the length of the view - `long`"
  (^CudaFloatDataBuffer [^org.bytedeco.javacpp.Pointer pointer ^org.bytedeco.javacpp.indexer.Indexer indexer ^Long length]
    (new CudaFloatDataBuffer pointer indexer length))
  (^CudaFloatDataBuffer [^Long length]
    (new CudaFloatDataBuffer length))
  (^CudaFloatDataBuffer [data ^Boolean copy ^Long offset ^org.nd4j.linalg.api.memory.MemoryWorkspace workspace]
    (new CudaFloatDataBuffer data copy offset workspace))
  (^CudaFloatDataBuffer [^Long length ^Boolean initialize]
    (new CudaFloatDataBuffer length initialize)))

(defn set-data
  "Description copied from interface: DataBuffer

  data - the data for this buffer - `int[]`"
  ([^CudaFloatDataBuffer this data]
    (-> this (.setData data))))

(defn assign
  "Description copied from interface: DataBuffer

  indices - the indices to assign - `long[]`
  data - the data to assign - `float[]`
  contiguous - whether the indices are contiguous or not - `boolean`
  inc - the number to increment by when assigning - `long`"
  ([^CudaFloatDataBuffer this indices data ^Boolean contiguous ^Long inc]
    (-> this (.assign indices data contiguous inc))))

(defn get-doubles-at
  "Description copied from interface: DataBuffer

  offset - the offset to start - `long`
  inc - the increment to use - `long`
  length - the length of the array - `int`

  returns: the doubles at the specified offset and length - `double[]`"
  ([^CudaFloatDataBuffer this ^Long offset ^Long inc ^Integer length]
    (-> this (.getDoublesAt offset inc length))))

(defn flush
  "Description copied from interface: DataBuffer"
  ([^CudaFloatDataBuffer this]
    (-> this (.flush))))

(defn as-int
  "Description copied from interface: DataBuffer

  returns: the buffer as a int - `int[]`"
  ([^CudaFloatDataBuffer this]
    (-> this (.asInt))))

(defn as-double
  "Description copied from interface: DataBuffer

  returns: the buffer as a float - `double[]`"
  ([^CudaFloatDataBuffer this]
    (-> this (.asDouble))))

(defn as-bytes
  "Description copied from interface: DataBuffer

  returns: the data represented as a raw byte array - `byte[]`"
  ([^CudaFloatDataBuffer this]
    (-> this (.asBytes))))

(defn data-type
  "Description copied from class: BaseDataBuffer

  returns: the data opType of the buffer - `org.nd4j.linalg.api.buffer.DataBuffer$Type`"
  (^org.nd4j.linalg.api.buffer.DataBuffer$Type [^CudaFloatDataBuffer this]
    (-> this (.dataType))))

(defn create
  "Description copied from class: BaseDataBuffer

  data - the buffer to create - `double[]`

  returns: the data buffer based on the given buffer - `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^CudaFloatDataBuffer this data]
    (-> this (.create data))))

(defn get-double
  "Description copied from interface: DataBuffer

  i - the element to getFloat - `long`

  returns: the element at this index - `double`"
  (^Double [^CudaFloatDataBuffer this ^Long i]
    (-> this (.getDouble i))))

