(ns org.nd4j.linalg.api.buffer.BaseDataBuffer
  "Base class for a data buffer
 handling basic byte operations
 among other things."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.buffer BaseDataBuffer]))

(defn ->base-data-buffer
  "Constructor.

  Meant for creating another view of a buffer

  pointer - the underlying buffer to create a view from - `org.bytedeco.javacpp.Pointer`
  indexer - the indexer for the pointer - `org.bytedeco.javacpp.indexer.Indexer`
  length - the length of the view - `long`"
  (^BaseDataBuffer [^org.bytedeco.javacpp.Pointer pointer ^org.bytedeco.javacpp.indexer.Indexer indexer ^Long length]
    (new BaseDataBuffer pointer indexer length))
  (^BaseDataBuffer [^java.nio.ByteBuffer buffer ^Long length]
    (new BaseDataBuffer buffer length))
  (^BaseDataBuffer [data ^Boolean copy ^Long offset ^org.nd4j.linalg.api.memory.MemoryWorkspace workspace]
    (new BaseDataBuffer data copy offset workspace))
  (^BaseDataBuffer [data]
    (new BaseDataBuffer data))
  (^BaseDataBuffer []
    (new BaseDataBuffer )))

(defn *-to-string-max-elements
  "Static Field.

  Deprecated. Use ND4JSystemProperties.DATABUFFER_TO_STRING_MAX_ELEMENTS

  type: java.lang.String"
  []
  BaseDataBuffer/TO_STRING_MAX_ELEMENTS)

(defn *from-float
  "v - `float`

  returns: `short`"
  (^Short [^Float v]
    (BaseDataBuffer/fromFloat v)))

(defn set-data
  "Description copied from interface: DataBuffer

  data - the data for this buffer - `int[]`"
  ([^BaseDataBuffer this data]
    (-> this (.setData data))))

(defn get-element-size
  "Description copied from interface: DataBuffer

  returns: the number of bytes for each individual element - `int`"
  (^Integer [^BaseDataBuffer this]
    (-> this (.getElementSize))))

(defn constant?
  "This method returns whether this DataBuffer is constant, or not.
  Constant buffer means that it modified only during creation time, and then it stays the same for all lifecycle. I.e. used in shape info databuffers.

  returns: `boolean`"
  (^Boolean [^BaseDataBuffer this]
    (-> this (.isConstant))))

(defn assign
  "Description copied from interface: DataBuffer

  indices - the indices to assign - `long[]`
  data - the data to assign - `float[]`
  contiguous - whether the indices are contiguous or not - `boolean`
  inc - the number to increment by when assigning - `long`"
  ([^BaseDataBuffer this indices data ^Boolean contiguous ^Long inc]
    (-> this (.assign indices data contiguous inc)))
  ([^BaseDataBuffer this indices data ^Boolean contiguous]
    (-> this (.assign indices data contiguous)))
  ([^BaseDataBuffer this ^java.lang.Number value ^Long offset]
    (-> this (.assign value offset)))
  ([^BaseDataBuffer this ^org.nd4j.linalg.api.buffer.DataBuffer data]
    (-> this (.assign data))))

(defn copy-at-stride
  "Description copied from interface: DataBuffer

  buf - the data buffer to copy from - `org.nd4j.linalg.api.buffer.DataBuffer`
  n - the number of elements to copy - `long`
  stride - the stride to copy at - `long`
  y-stride - `long`
  offset - `long`
  y-offset - `long`"
  ([^BaseDataBuffer this ^org.nd4j.linalg.api.buffer.DataBuffer buf ^Long n ^Long stride ^Long y-stride ^Long offset ^Long y-offset]
    (-> this (.copyAtStride buf n stride y-stride offset y-offset))))

(defn indexer
  "Returns the indexer for the buffer

  returns: `org.bytedeco.javacpp.indexer.Indexer`"
  (^org.bytedeco.javacpp.indexer.Indexer [^BaseDataBuffer this]
    (-> this (.indexer))))

(defn as-nio-float
  "Description copied from interface: DataBuffer

  returns: a view of this as an nio float buffer - `java.nio.FloatBuffer`"
  (^java.nio.FloatBuffer [^BaseDataBuffer this]
    (-> this (.asNioFloat))))

(defn remove-referencing
  "Deprecated.

  id - the id to remove - `java.lang.String`"
  ([^BaseDataBuffer this ^java.lang.String id]
    (-> this (.removeReferencing id))))

(defn offset
  "Description copied from interface: DataBuffer

  returns: the offset of the buffer - `long`"
  (^Long [^BaseDataBuffer this]
    (-> this (.offset))))

(defn references
  "Deprecated.

  returns: the references pointing to this buffer - `java.util.Collection<java.lang.String>`"
  (^java.util.Collection [^BaseDataBuffer this]
    (-> this (.references))))

(defn persist?
  "Deprecated.

  returns: whether the buffer should be persistent or not (default false) - `boolean`"
  (^Boolean [^BaseDataBuffer this]
    (-> this (.isPersist))))

(defn get-longs-at
  "Description copied from interface: DataBuffer

  offset - the offset to start - `long`
  inc - the increment to use - `long`
  length - the length of the array - `int`

  returns: the doubles at the specified offset and length - `long[]`"
  ([^BaseDataBuffer this ^Long offset ^Long inc ^Integer length]
    (-> this (.getLongsAt offset inc length)))
  ([^BaseDataBuffer this ^Long offset ^Integer length]
    (-> this (.getLongsAt offset length))))

(defn get-floats-at
  "Description copied from interface: DataBuffer

  offset - the offset to start - `long`
  inc - the increment to use - `long`
  length - the length of the array - `int`

  returns: the doubles at the specified offset and length - `float[]`"
  ([^BaseDataBuffer this ^Long offset ^Long inc ^Integer length]
    (-> this (.getFloatsAt offset inc length)))
  ([^BaseDataBuffer this ^Long offset ^Integer length]
    (-> this (.getFloatsAt offset length))))

(defn attached?
  "This method returns True, if this DataBuffer is attached to some workspace. False otherwise

  returns: `boolean`"
  (^Boolean [^BaseDataBuffer this]
    (-> this (.isAttached))))

(defn get-doubles-at
  "Description copied from interface: DataBuffer

  offset - the offset to start - `long`
  inc - the increment to use - `long`
  length - the length of the array - `int`

  returns: the doubles at the specified offset and length - `double[]`"
  ([^BaseDataBuffer this ^Long offset ^Long inc ^Integer length]
    (-> this (.getDoublesAt offset inc length)))
  ([^BaseDataBuffer this ^Long offset ^Integer length]
    (-> this (.getDoublesAt offset length))))

(defn put
  "Description copied from interface: DataBuffer

  i - the index - `long`
  element - the element to assign - `float`"
  ([^BaseDataBuffer this ^Long i ^Float element]
    (-> this (.put i element))))

(defn get-tracking-point
  "Returns tracking point for Allocator
  PLEASE NOTE: Suitable & meaningful only for specific backends

  returns: `java.lang.Long`"
  (^java.lang.Long [^BaseDataBuffer this]
    (-> this (.getTrackingPoint))))

(defn put-by-global-type
  "i - `long`
  element - `java.lang.Number`
  global-type - `org.nd4j.linalg.api.buffer.DataBuffer$Type`"
  ([^BaseDataBuffer this ^Long i ^java.lang.Number element ^org.nd4j.linalg.api.buffer.DataBuffer$Type global-type]
    (-> this (.putByGlobalType i element global-type))))

(defn get-number
  "Description copied from interface: DataBuffer

  i - the element to getFloat - `long`

  returns: the element at this index - `java.lang.Number`"
  (^java.lang.Number [^BaseDataBuffer this ^Long i]
    (-> this (.getNumber i))))

(defn get-parent-workspace
  "Description copied from interface: DataBuffer

  returns: `org.nd4j.linalg.api.memory.MemoryWorkspace`"
  (^org.nd4j.linalg.api.memory.MemoryWorkspace [^BaseDataBuffer this]
    (-> this (.getParentWorkspace))))

(defn dirty
  "Deprecated.

  returns: true if the buffer has been
  updated, false otherwise - `boolean`"
  (^Boolean [^BaseDataBuffer this]
    (-> this (.dirty))))

(defn flush
  "Description copied from interface: DataBuffer"
  ([^BaseDataBuffer this]
    (-> this (.flush))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BaseDataBuffer this]
    (-> this (.toString))))

(defn read
  "Description copied from interface: DataBuffer

  is - the inpus tream to write to - `java.io.InputStream`"
  ([^BaseDataBuffer this ^java.io.InputStream is]
    (-> this (.read is))))

(defn as-int
  "Description copied from interface: DataBuffer

  returns: the buffer as a int - `int[]`"
  ([^BaseDataBuffer this]
    (-> this (.asInt))))

(defn as-nio
  "Description copied from interface: DataBuffer

  returns: a view of this as an nio byte buffer - `java.nio.ByteBuffer`"
  (^java.nio.ByteBuffer [^BaseDataBuffer this]
    (-> this (.asNio))))

(defn pointer
  "Description copied from interface: DataBuffer

  returns: `org.bytedeco.javacpp.Pointer`"
  (^org.bytedeco.javacpp.Pointer [^BaseDataBuffer this]
    (-> this (.pointer))))

(defn add-referencing
  "Deprecated.

  id - the id to reference - `java.lang.String`"
  ([^BaseDataBuffer this ^java.lang.String id]
    (-> this (.addReferencing id))))

(defn get-long
  "Description copied from interface: DataBuffer

  i - `long`

  returns: `long`"
  (^Long [^BaseDataBuffer this ^Long i]
    (-> this (.getLong i))))

(defn underlying-data-buffer
  "Description copied from interface: DataBuffer

  returns: `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^BaseDataBuffer this]
    (-> this (.underlyingDataBuffer))))

(defn destroy
  "Description copied from interface: DataBuffer"
  ([^BaseDataBuffer this]
    (-> this (.destroy))))

(defn address
  "Description copied from interface: DataBuffer

  returns: the address of the pointer - `long`"
  (^Long [^BaseDataBuffer this]
    (-> this (.address))))

(defn in-scope?
  "This method checks, if given attached INDArray is still in scope of its parent Workspace

  PLEASE NOTE: if this INDArray isn't attached to any Workspace, this method will return true

  returns: `boolean`"
  (^Boolean [^BaseDataBuffer this]
    (-> this (.isInScope))))

(defn get-int
  "Description copied from interface: DataBuffer

  i - the int at the specified index - `long`

  returns: the int at the specified index - `int`"
  (^Integer [^BaseDataBuffer this ^Long i]
    (-> this (.getInt i))))

(defn get-ints-at
  "Description copied from interface: DataBuffer

  offset - the offset to start - `long`
  inc - the increment to use - `long`
  length - the length of the array - `int`

  returns: the doubles at the specified offset and length - `int[]`"
  ([^BaseDataBuffer this ^Long offset ^Long inc ^Integer length]
    (-> this (.getIntsAt offset inc length)))
  ([^BaseDataBuffer this ^Long offset ^Integer length]
    (-> this (.getIntsAt offset length))))

(defn set-tracking-point
  "Sets tracking point used by Allocator
  PLEASE NOTE: Suitable & meaningful only for specific backends

  tracking-point - `java.lang.Long`"
  ([^BaseDataBuffer this ^java.lang.Long tracking-point]
    (-> this (.setTrackingPoint tracking-point))))

(defn as-double
  "Description copied from interface: DataBuffer

  returns: the buffer as a float - `double[]`"
  ([^BaseDataBuffer this]
    (-> this (.asDouble))))

(defn to-float
  "hbits - `int`

  returns: `float`"
  (^Float [^BaseDataBuffer this ^Integer hbits]
    (-> this (.toFloat hbits))))

(defn as-nio-double
  "Description copied from interface: DataBuffer

  returns: a view of this as an nio double buffer - `java.nio.DoubleBuffer`"
  (^java.nio.DoubleBuffer [^BaseDataBuffer this]
    (-> this (.asNioDouble))))

(defn length
  "Description copied from interface: DataBuffer

  returns: the length of the buffer - `long`"
  (^Long [^BaseDataBuffer this]
    (-> this (.length))))

(defn as-bytes
  "Description copied from interface: DataBuffer

  returns: the data represented as a raw byte array - `byte[]`"
  ([^BaseDataBuffer this]
    (-> this (.asBytes))))

(defn allocation-mode
  "Description copied from interface: DataBuffer

  returns: the allocation mode for the buffer - `org.nd4j.linalg.api.buffer.DataBuffer$AllocationMode`"
  (^org.nd4j.linalg.api.buffer.DataBuffer$AllocationMode [^BaseDataBuffer this]
    (-> this (.allocationMode))))

(defn address-pointer
  "Description copied from interface: DataBuffer

  returns: the address of the pointer wrapped in a Pointer - `org.bytedeco.javacpp.Pointer`"
  (^org.bytedeco.javacpp.Pointer [^BaseDataBuffer this]
    (-> this (.addressPointer))))

(defn un-persist
  "Deprecated."
  ([^BaseDataBuffer this]
    (-> this (.unPersist))))

(defn data-type
  "The data opType of the buffer

  returns: the data opType of the buffer - `org.nd4j.linalg.api.buffer.DataBuffer$Type`"
  (^org.nd4j.linalg.api.buffer.DataBuffer$Type [^BaseDataBuffer this]
    (-> this (.dataType))))

(defn pointer-indexer-by-global-type
  "current-type - `org.nd4j.linalg.api.buffer.DataBuffer$Type`"
  ([^BaseDataBuffer this ^org.nd4j.linalg.api.buffer.DataBuffer$Type current-type]
    (-> this (.pointerIndexerByGlobalType current-type))))

(defn as-nio-long
  "returns: `java.nio.LongBuffer`"
  (^java.nio.LongBuffer [^BaseDataBuffer this]
    (-> this (.asNioLong))))

(defn create
  "Create the data buffer
  with respect to the given byte buffer

  data - the buffer to create - `double[]`

  returns: the data buffer based on the given buffer - `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^BaseDataBuffer this data]
    (-> this (.create data))))

(defn hash-code
  "returns: `int`"
  (^Integer [^BaseDataBuffer this]
    (-> this (.hashCode))))

(defn as-nio-int
  "Description copied from interface: DataBuffer

  returns: a view of this as an nio int buffer - `java.nio.IntBuffer`"
  (^java.nio.IntBuffer [^BaseDataBuffer this]
    (-> this (.asNioInt))))

(defn underlying-length
  "Description copied from interface: DataBuffer

  returns: the length of the buffer - `long`"
  (^Long [^BaseDataBuffer this]
    (-> this (.underlyingLength))))

(defn original-offset
  "Returns the offset of the buffer relative to originalDataBuffer

  returns: `long`"
  (^Long [^BaseDataBuffer this]
    (-> this (.originalOffset))))

(defn get-generation-id
  "returns: `long`"
  (^Long [^BaseDataBuffer this]
    (-> this (.getGenerationId))))

(defn as-float
  "Description copied from interface: DataBuffer

  returns: the buffer as a float - `float[]`"
  ([^BaseDataBuffer this]
    (-> this (.asFloat))))

(defn persist
  "Deprecated."
  ([^BaseDataBuffer this]
    (-> this (.persist))))

(defn as-long
  "Description copied from interface: DataBuffer

  returns: the buffer as a long - `long[]`"
  ([^BaseDataBuffer this]
    (-> this (.asLong))))

(defn dup
  "Description copied from interface: DataBuffer

  returns: a copy of this buffer - `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^BaseDataBuffer this]
    (-> this (.dup))))

(defn get-float
  "Description copied from interface: DataBuffer

  i - the element to getFloat - `long`

  returns: the element at this index - `float`"
  (^Float [^BaseDataBuffer this ^Long i]
    (-> this (.getFloat i))))

(defn write
  "Description copied from interface: DataBuffer

  dos - the output stream to write - `java.io.OutputStream`"
  ([^BaseDataBuffer this ^java.io.OutputStream dos]
    (-> this (.write dos))))

(defn get-double
  "Description copied from interface: DataBuffer

  i - the element to getFloat - `long`

  returns: the element at this index - `double`"
  (^Double [^BaseDataBuffer this ^Long i]
    (-> this (.getDouble i))))

(defn capacity
  "returns: the capacity of the buffer - `long`"
  (^Long [^BaseDataBuffer this]
    (-> this (.capacity))))

(defn reallocate
  "Reallocate the native memory of the buffer

  length - the new length of the buffer - `long`

  returns: this databuffer - `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^BaseDataBuffer this ^Long length]
    (-> this (.reallocate length))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^BaseDataBuffer this ^java.lang.Object o]
    (-> this (.equals o))))

(defn array
  "Description copied from interface: DataBuffer

  returns: the backing array of this buffer - `java.lang.Object`"
  (^java.lang.Object [^BaseDataBuffer this]
    (-> this (.array))))

(defn set-constant
  "This method allows you to mark databuffer as constant.
  PLEASE NOTE: DO NOT USE THIS METHOD, UNLESS YOU'RE 100% SURE WHAT YOU DO

  really-constant - `boolean`"
  ([^BaseDataBuffer this ^Boolean really-constant]
    (-> this (.setConstant really-constant))))

(defn original-data-buffer
  "Original DataBuffer.
  In case if we have a view derived from another view, derived from some other view, original DataBuffer will point to the originating DataBuffer, where all views come from.

  returns: `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^BaseDataBuffer this]
    (-> this (.originalDataBuffer))))

(defn same-underlying-data
  "Description copied from interface: DataBuffer

  buffer - whether the buffer is the same underlying data or not - `org.nd4j.linalg.api.buffer.DataBuffer`

  returns: true if both data buffers have the same
  underlying data SOURCE - `boolean`"
  (^Boolean [^BaseDataBuffer this ^org.nd4j.linalg.api.buffer.DataBuffer buffer]
    (-> this (.sameUnderlyingData buffer))))

