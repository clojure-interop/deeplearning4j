(ns org.nd4j.linalg.jcublas.buffer.BaseCudaDataBuffer
  "Base class for a data buffer
 CUDA implementation for DataBuffer always uses JavaCPP
 as allocationMode, and device access is masked by
 appropriate allocator mover implementation.
 Memory allocation/deallocation is strictly handled by allocator,
 since JavaCPP alloc/dealloc has nothing to do with CUDA.
 But besides that, host pointers obtained from CUDA are 100%
 compatible with CPU"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.jcublas.buffer BaseCudaDataBuffer]))

(defn ->base-cuda-data-buffer
  "Constructor.

  Meant for creating another view of a buffer

  pointer - the underlying buffer to create a view from - `org.bytedeco.javacpp.Pointer`
  indexer - the indexer for the pointer - `org.bytedeco.javacpp.indexer.Indexer`
  length - the length of the view - `long`"
  (^BaseCudaDataBuffer [^org.bytedeco.javacpp.Pointer pointer ^org.bytedeco.javacpp.indexer.Indexer indexer ^Long length]
    (new BaseCudaDataBuffer pointer indexer length))
  (^BaseCudaDataBuffer [^Long length ^Integer element-size]
    (new BaseCudaDataBuffer length element-size))
  (^BaseCudaDataBuffer [data ^Boolean copy ^Long offset ^org.nd4j.linalg.api.memory.MemoryWorkspace workspace]
    (new BaseCudaDataBuffer data copy offset workspace))
  (^BaseCudaDataBuffer [^Long length]
    (new BaseCudaDataBuffer length))
  (^BaseCudaDataBuffer []
    (new BaseCudaDataBuffer )))

(defn set-data
  "Description copied from interface: DataBuffer

  data - the data for this buffer - `int[]`"
  ([^BaseCudaDataBuffer this data]
    (-> this (.setData data))))

(defn get-element-size
  "Description copied from interface: DataBuffer

  returns: the number of bytes for each individual element - `int`"
  (^Integer [^BaseCudaDataBuffer this]
    (-> this (.getElementSize))))

(defn assign
  "Description copied from interface: DataBuffer

  data - the data to assign - `org.nd4j.linalg.api.buffer.DataBuffer`"
  ([^BaseCudaDataBuffer this ^org.nd4j.linalg.api.buffer.DataBuffer data]
    (-> this (.assign data))))

(defn get-host-buffer
  "Description copied from interface: JCudaBuffer

  returns: `java.nio.ByteBuffer`"
  (^java.nio.ByteBuffer [^BaseCudaDataBuffer this]
    (-> this (.getHostBuffer))))

(defn copy-at-stride
  "Description copied from interface: DataBuffer

  buf - the data buffer to copy from - `org.nd4j.linalg.api.buffer.DataBuffer`
  n - the number of elements to copy - `long`
  stride - the stride to copy at - `long`
  y-stride - `long`
  offset - `long`
  y-offset - `long`"
  ([^BaseCudaDataBuffer this ^org.nd4j.linalg.api.buffer.DataBuffer buf ^Long n ^Long stride ^Long y-stride ^Long offset ^Long y-offset]
    (-> this (.copyAtStride buf n stride y-stride offset y-offset))))

(defn as-nio-float
  "Description copied from interface: DataBuffer

  returns: a view of this as an nio float buffer - `java.nio.FloatBuffer`"
  (^java.nio.FloatBuffer [^BaseCudaDataBuffer this]
    (-> this (.asNioFloat))))

(defn remove-referencing
  "Description copied from interface: DataBuffer

  id - the id to remove - `java.lang.String`"
  ([^BaseCudaDataBuffer this ^java.lang.String id]
    (-> this (.removeReferencing id))))

(defn references
  "Description copied from interface: DataBuffer

  returns: the references pointing to this buffer - `java.util.Collection<java.lang.String>`"
  (^java.util.Collection [^BaseCudaDataBuffer this]
    (-> this (.references))))

(defn put
  "Description copied from interface: DataBuffer

  i - the index - `long`
  element - the element to assign - `float`"
  ([^BaseCudaDataBuffer this ^Long i ^Float element]
    (-> this (.put i element))))

(defn get-number
  "Description copied from interface: DataBuffer

  i - the element to getFloat - `long`

  returns: the element at this index - `java.lang.Number`"
  (^java.lang.Number [^BaseCudaDataBuffer this ^Long i]
    (-> this (.getNumber i))))

(defn flush
  "Description copied from interface: DataBuffer"
  ([^BaseCudaDataBuffer this]
    (-> this (.flush))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BaseCudaDataBuffer this]
    (-> this (.toString))))

(defn read
  "s - `java.io.DataInputStream`"
  ([^BaseCudaDataBuffer this ^java.io.DataInputStream s]
    (-> this (.read s))))

(defn as-int
  "Description copied from interface: DataBuffer

  returns: the buffer as a int - `int[]`"
  ([^BaseCudaDataBuffer this]
    (-> this (.asInt))))

(defn as-nio
  "Description copied from interface: DataBuffer

  returns: a view of this as an nio byte buffer - `java.nio.ByteBuffer`"
  (^java.nio.ByteBuffer [^BaseCudaDataBuffer this]
    (-> this (.asNio))))

(defn get-host-pointer
  "Description copied from interface: JCudaBuffer

  offset - the offset (NOT MULTIPLIED BY ELEMENT SIZE) to index in to the pointer at - `long`

  returns: the pointer at the given byte offset - `org.bytedeco.javacpp.Pointer`"
  (^org.bytedeco.javacpp.Pointer [^BaseCudaDataBuffer this ^Long offset]
    (-> this (.getHostPointer offset)))
  (^org.bytedeco.javacpp.Pointer [^BaseCudaDataBuffer this]
    (-> this (.getHostPointer)))
  (^org.bytedeco.javacpp.Pointer [^BaseCudaDataBuffer this ^org.nd4j.linalg.api.ndarray.INDArray arr ^Integer stride ^Long offset ^Integer length]
    (-> this (.getHostPointer arr stride offset length))))

(defn add-referencing
  "Description copied from interface: DataBuffer

  id - the id to reference - `java.lang.String`"
  ([^BaseCudaDataBuffer this ^java.lang.String id]
    (-> this (.addReferencing id))))

(defn destroy
  "Description copied from interface: DataBuffer"
  ([^BaseCudaDataBuffer this]
    (-> this (.destroy))))

(defn address
  "This method always returns host pointer

  returns: `long`"
  (^Long [^BaseCudaDataBuffer this]
    (-> this (.address))))

(defn get-int
  "Description copied from interface: DataBuffer

  ix - the int at the specified index - `long`

  returns: the int at the specified index - `int`"
  (^Integer [^BaseCudaDataBuffer this ^Long ix]
    (-> this (.getInt ix))))

(defn as-double
  "Description copied from interface: DataBuffer

  returns: the buffer as a float - `double[]`"
  ([^BaseCudaDataBuffer this]
    (-> this (.asDouble))))

(defn as-nio-double
  "Description copied from interface: DataBuffer

  returns: a view of this as an nio double buffer - `java.nio.DoubleBuffer`"
  (^java.nio.DoubleBuffer [^BaseCudaDataBuffer this]
    (-> this (.asNioDouble))))

(defn as-bytes
  "Description copied from interface: DataBuffer

  returns: the data represented as a raw byte array - `byte[]`"
  ([^BaseCudaDataBuffer this]
    (-> this (.asBytes))))

(defn allocation-mode
  "Description copied from interface: DataBuffer

  returns: the allocation mode for the buffer - `org.nd4j.linalg.api.buffer.DataBuffer$AllocationMode`"
  (^org.nd4j.linalg.api.buffer.DataBuffer$AllocationMode [^BaseCudaDataBuffer this]
    (-> this (.allocationMode))))

(defn address-pointer
  "Description copied from interface: DataBuffer

  returns: the address of the pointer wrapped in a Pointer - `org.bytedeco.javacpp.Pointer`"
  (^org.bytedeco.javacpp.Pointer [^BaseCudaDataBuffer this]
    (-> this (.addressPointer))))

(defn as-nio-int
  "Description copied from interface: DataBuffer

  returns: a view of this as an nio int buffer - `java.nio.IntBuffer`"
  (^java.nio.IntBuffer [^BaseCudaDataBuffer this]
    (-> this (.asNioInt))))

(defn set
  "PLEASE NOTE: length, srcOffset, dstOffset are considered numbers of elements, not byte offsets

  data - `int[]`
  length - `long`
  src-offset - `long`
  dst-offset - `long`"
  ([^BaseCudaDataBuffer this data ^Long length ^Long src-offset ^Long dst-offset]
    (-> this (.set data length src-offset dst-offset)))
  ([^BaseCudaDataBuffer this ^org.bytedeco.javacpp.Pointer pointer]
    (-> this (.set pointer))))

(defn as-float
  "Description copied from interface: DataBuffer

  returns: the buffer as a float - `float[]`"
  ([^BaseCudaDataBuffer this]
    (-> this (.asFloat))))

(defn dup
  "Description copied from interface: DataBuffer

  returns: a copy of this buffer - `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^BaseCudaDataBuffer this]
    (-> this (.dup))))

(defn get-float
  "Description copied from interface: DataBuffer

  i - the element to getFloat - `long`

  returns: the element at this index - `float`"
  (^Float [^BaseCudaDataBuffer this ^Long i]
    (-> this (.getFloat i))))

(defn write
  "Description copied from interface: DataBuffer

  dos - the output stream to write - `java.io.OutputStream`"
  ([^BaseCudaDataBuffer this ^java.io.OutputStream dos]
    (-> this (.write dos))))

(defn get-double
  "Description copied from interface: DataBuffer

  i - the element to getFloat - `long`

  returns: the element at this index - `double`"
  (^Double [^BaseCudaDataBuffer this ^Long i]
    (-> this (.getDouble i))))

(defn capacity
  "returns: the capacity of the buffer - `long`"
  (^Long [^BaseCudaDataBuffer this]
    (-> this (.capacity))))

(defn reallocate
  "Description copied from class: BaseDataBuffer

  length - the new length of the buffer - `long`

  returns: this databuffer - `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^BaseCudaDataBuffer this ^Long length]
    (-> this (.reallocate length))))

(defn equals
  "PLEASE NOTE: this method implies STRICT equality only.
  I.e: this == object

  o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^BaseCudaDataBuffer this ^java.lang.Object o]
    (-> this (.equals o))))

(defn same-underlying-data
  "Description copied from interface: DataBuffer

  buffer - whether the buffer is the same underlying data or not - `org.nd4j.linalg.api.buffer.DataBuffer`

  returns: true if both data buffers have the same
  underlying data SOURCE - `boolean`"
  (^Boolean [^BaseCudaDataBuffer this ^org.nd4j.linalg.api.buffer.DataBuffer buffer]
    (-> this (.sameUnderlyingData buffer))))

