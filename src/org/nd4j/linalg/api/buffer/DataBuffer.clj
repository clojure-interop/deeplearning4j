(ns org.nd4j.linalg.api.buffer.DataBuffer
  "A data buffer is an interface
 for handling storage and retrieval of data"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.buffer DataBuffer]))

(defn set-data
  "Set the data for this buffer

  data - the data for this buffer - `int[]`"
  ([^DataBuffer this data]
    (-> this (.setData data))))

(defn get-element-size
  "The number of bytes for each individual element

  returns: the number of bytes for each individual element - `int`"
  (^Integer [^DataBuffer this]
    (-> this (.getElementSize))))

(defn constant?
  "This method returns whether this DataBuffer is constant, or not.
  Constant buffer means that it modified only during creation time, and then it stays the same for all lifecycle. I.e. used in shape info databuffers.

  returns: `boolean`"
  (^Boolean [^DataBuffer this]
    (-> this (.isConstant))))

(defn assign
  "Assign the given elements to the given indices

  indices - the indices to assign - `long[]`
  data - the data to assign - `float[]`
  contiguous - whether the indices are contiguous or not - `boolean`
  inc - the number to increment by when assigning - `long`"
  ([^DataBuffer this indices data ^Boolean contiguous ^Long inc]
    (-> this (.assign indices data contiguous inc)))
  ([^DataBuffer this indices data ^Boolean contiguous]
    (-> this (.assign indices data contiguous)))
  ([^DataBuffer this ^java.lang.Number value ^Long offset]
    (-> this (.assign value offset)))
  ([^DataBuffer this ^java.lang.Number value]
    (-> this (.assign value))))

(defn copy-at-stride
  "Copies from
  the given buffer
  at the specified stride
  for up to n elements

  buf - the data buffer to copy from - `org.nd4j.linalg.api.buffer.DataBuffer`
  n - the number of elements to copy - `long`
  stride - the stride to copy at - `long`
  y-stride - `long`
  offset - `long`
  y-offset - `long`"
  ([^DataBuffer this ^org.nd4j.linalg.api.buffer.DataBuffer buf ^Long n ^Long stride ^Long y-stride ^Long offset ^Long y-offset]
    (-> this (.copyAtStride buf n stride y-stride offset y-offset))))

(defn indexer
  "Returns the indexer for the buffer

  returns: `org.bytedeco.javacpp.indexer.Indexer`"
  (^org.bytedeco.javacpp.indexer.Indexer [^DataBuffer this]
    (-> this (.indexer))))

(defn as-nio-float
  "Returns a view of this as an
  nio byte buffer

  returns: a view of this as an nio float buffer - `java.nio.FloatBuffer`"
  (^java.nio.FloatBuffer [^DataBuffer this]
    (-> this (.asNioFloat))))

(defn remove-referencing
  "Remove the referenced id if it exists

  id - the id to remove - `java.lang.String`"
  ([^DataBuffer this ^java.lang.String id]
    (-> this (.removeReferencing id))))

(defn offset
  "Returns the offset of the buffer

  returns: the offset of the buffer - `long`"
  (^Long [^DataBuffer this]
    (-> this (.offset))))

(defn references
  "The referencers pointing to this buffer

  returns: the references pointing to this buffer - `java.util.Collection<java.lang.String>`"
  (^java.util.Collection [^DataBuffer this]
    (-> this (.references))))

(defn persist?
  "Whether the buffer should be persistent.
  This is mainly for the
  aggressive garbage collection strategy.

  returns: whether the buffer should be persistent or not (default false) - `boolean`"
  (^Boolean [^DataBuffer this]
    (-> this (.isPersist))))

(defn get-longs-at
  "Get the long at a particular offset

  offset - the offset to start - `long`
  inc - the increment to use - `long`
  length - the length of the array - `int`

  returns: the doubles at the specified offset and length - `long[]`"
  ([^DataBuffer this ^Long offset ^Long inc ^Integer length]
    (-> this (.getLongsAt offset inc length)))
  ([^DataBuffer this ^Long offset ^Integer length]
    (-> this (.getLongsAt offset length))))

(defn get-floats-at
  "Get the doubles at a particular offset

  offset - the offset to start - `long`
  inc - the increment to use - `long`
  length - the length of the array - `int`

  returns: the doubles at the specified offset and length - `float[]`"
  ([^DataBuffer this ^Long offset ^Long inc ^Integer length]
    (-> this (.getFloatsAt offset inc length)))
  ([^DataBuffer this ^Long offset ^Integer length]
    (-> this (.getFloatsAt offset length))))

(defn attached?
  "This method returns True, if this DataBuffer is attached to some workspace. False otherwise

  returns: `boolean`"
  (^Boolean [^DataBuffer this]
    (-> this (.isAttached))))

(defn get-doubles-at
  "Get the doubles at a particular offset

  offset - the offset to start - `long`
  inc - the increment to use - `long`
  length - the length of the array - `int`

  returns: the doubles at the specified offset and length - `double[]`"
  ([^DataBuffer this ^Long offset ^Long inc ^Integer length]
    (-> this (.getDoublesAt offset inc length)))
  ([^DataBuffer this ^Long offset ^Integer length]
    (-> this (.getDoublesAt offset length))))

(defn put
  "Assign an element in the buffer to the specified index

  i - the index - `long`
  element - the element to assign - `float`"
  ([^DataBuffer this ^Long i ^Float element]
    (-> this (.put i element))))

(defn get-tracking-point
  "Returns tracking point for Allocator
  PLEASE NOTE: Suitable & meaningful only for specific backends

  returns: `java.lang.Long`"
  (^java.lang.Long [^DataBuffer this]
    (-> this (.getTrackingPoint))))

(defn get-number
  "Get element i in the buffer as a double

  i - the element to getFloat - `long`

  returns: the element at this index - `java.lang.Number`"
  (^java.lang.Number [^DataBuffer this ^Long i]
    (-> this (.getNumber i))))

(defn get-parent-workspace
  "This method returns Workspace this DataBuffer is attached to

  returns: `org.nd4j.linalg.api.memory.MemoryWorkspace`"
  (^org.nd4j.linalg.api.memory.MemoryWorkspace [^DataBuffer this]
    (-> this (.getParentWorkspace))))

(defn dirty
  "Whether the buffer is dirty:
  aka has been updated

  returns: true if the buffer has been
  updated, false otherwise - `boolean`"
  (^Boolean [^DataBuffer this]
    (-> this (.dirty))))

(defn flush
  "Flush the data buffer"
  ([^DataBuffer this]
    (-> this (.flush))))

(defn read
  "Write this buffer to the input stream.

  is - the inpus tream to write to - `java.io.InputStream`"
  ([^DataBuffer this ^java.io.InputStream is]
    (-> this (.read is))))

(defn as-int
  "Return the buffer as an int array
  Relative to the datatype, this will either be a copy
  or a reference. The reference is preferred for
  faster access of data and no copying

  returns: the buffer as a int - `int[]`"
  ([^DataBuffer this]
    (-> this (.asInt))))

(defn as-nio
  "Returns a view of this as an
  nio byte buffer

  returns: a view of this as an nio byte buffer - `java.nio.ByteBuffer`"
  (^java.nio.ByteBuffer [^DataBuffer this]
    (-> this (.asNio))))

(defn pointer
  "Returns an underlying pointer if one exists

  returns: `org.bytedeco.javacpp.Pointer`"
  (^org.bytedeco.javacpp.Pointer [^DataBuffer this]
    (-> this (.pointer))))

(defn add-referencing
  "Add a referencing element to this buffer

  id - the id to reference - `java.lang.String`"
  ([^DataBuffer this ^java.lang.String id]
    (-> this (.addReferencing id))))

(defn get-long
  "Get element i in the buffer as long value

  i - `long`

  returns: `long`"
  (^Long [^DataBuffer this ^Long i]
    (-> this (.getLong i))))

(defn underlying-data-buffer
  "Underlying buffer:
  This is meant for a data buffer
  to be a view of another data buffer

  returns: `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^DataBuffer this]
    (-> this (.underlyingDataBuffer))))

(defn destroy
  "release all resources for this buffer"
  ([^DataBuffer this]
    (-> this (.destroy))))

(defn address
  "Returns the address of the pointer

  returns: the address of the pointer - `long`"
  (^Long [^DataBuffer this]
    (-> this (.address))))

(defn in-scope?
  "This method checks, if given attached INDArray is still in scope of its parent Workspace
  PLEASE NOTE: if this INDArray isn't attached to any Workspace, this method will return true

  returns: `boolean`"
  (^Boolean [^DataBuffer this]
    (-> this (.isInScope))))

(defn get-int
  "Get the int at the specified index

  ix - the int at the specified index - `long`

  returns: the int at the specified index - `int`"
  (^Integer [^DataBuffer this ^Long ix]
    (-> this (.getInt ix))))

(defn get-ints-at
  "Get the ints at a particular offset

  offset - the offset to start - `long`
  inc - the increment to use - `long`
  length - the length of the array - `int`

  returns: the doubles at the specified offset and length - `int[]`"
  ([^DataBuffer this ^Long offset ^Long inc ^Integer length]
    (-> this (.getIntsAt offset inc length)))
  ([^DataBuffer this ^Long offset ^Integer length]
    (-> this (.getIntsAt offset length))))

(defn set-tracking-point
  "Sets tracking point used by Allocator
  PLEASE NOTE: Suitable & meaningful only for specific backends

  tracking-point - `java.lang.Long`"
  ([^DataBuffer this ^java.lang.Long tracking-point]
    (-> this (.setTrackingPoint tracking-point))))

(defn as-double
  "Return the buffer as a double array
  Relative to the datatype, this will either be a copy
  or a reference. The reference is preferred for
  faster access of data and no copying

  returns: the buffer as a float - `double[]`"
  ([^DataBuffer this]
    (-> this (.asDouble))))

(defn as-nio-double
  "Returns a view of this as an
  nio byte buffer

  returns: a view of this as an nio double buffer - `java.nio.DoubleBuffer`"
  (^java.nio.DoubleBuffer [^DataBuffer this]
    (-> this (.asNioDouble))))

(defn length
  "Returns the length of the buffer

  returns: the length of the buffer - `long`"
  (^Long [^DataBuffer this]
    (-> this (.length))))

(defn as-bytes
  "Raw byte array storage

  returns: the data represented as a raw byte array - `byte[]`"
  ([^DataBuffer this]
    (-> this (.asBytes))))

(defn allocation-mode
  "Allocation mode for buffers

  returns: the allocation mode for the buffer - `org.nd4j.linalg.api.buffer.DataBuffer$AllocationMode`"
  (^org.nd4j.linalg.api.buffer.DataBuffer$AllocationMode [^DataBuffer this]
    (-> this (.allocationMode))))

(defn address-pointer
  "Returns the address of the pointer wrapped in a Pointer

  returns: the address of the pointer wrapped in a Pointer - `org.bytedeco.javacpp.Pointer`"
  (^org.bytedeco.javacpp.Pointer [^DataBuffer this]
    (-> this (.addressPointer))))

(defn un-persist
  "Un persist the buffer"
  ([^DataBuffer this]
    (-> this (.unPersist))))

(defn data-type
  "The data opType of the buffer

  returns: the data opType of the buffer - `org.nd4j.linalg.api.buffer.DataBuffer$Type`"
  (^org.nd4j.linalg.api.buffer.DataBuffer$Type [^DataBuffer this]
    (-> this (.dataType))))

(defn as-nio-long
  "returns: `java.nio.LongBuffer`"
  (^java.nio.LongBuffer [^DataBuffer this]
    (-> this (.asNioLong))))

(defn as-nio-int
  "Returns a view of this as an
  nio byte buffer

  returns: a view of this as an nio int buffer - `java.nio.IntBuffer`"
  (^java.nio.IntBuffer [^DataBuffer this]
    (-> this (.asNioInt))))

(defn underlying-length
  "Returns the length of the buffer

  returns: the length of the buffer - `long`"
  (^Long [^DataBuffer this]
    (-> this (.underlyingLength))))

(defn original-offset
  "Returns the offset of the buffer relative to originalDataBuffer

  returns: `long`"
  (^Long [^DataBuffer this]
    (-> this (.originalOffset))))

(defn get-generation-id
  "returns: `long`"
  (^Long [^DataBuffer this]
    (-> this (.getGenerationId))))

(defn as-float
  "Return the buffer as a float array
  Relative to the datatype, this will either be a copy
  or a reference. The reference is preferred for
  faster access of data and no copying

  returns: the buffer as a float - `float[]`"
  ([^DataBuffer this]
    (-> this (.asFloat))))

(defn persist
  "Mark this buffer as persistent"
  ([^DataBuffer this]
    (-> this (.persist))))

(defn as-long
  "Return the buffer as an long array
  Relative to the datatype, this will either be a copy
  or a reference. The reference is preferred for
  faster access of data and no copying

  returns: the buffer as a long - `long[]`"
  ([^DataBuffer this]
    (-> this (.asLong))))

(defn dup
  "Return a copy of this buffer

  returns: a copy of this buffer - `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^DataBuffer this]
    (-> this (.dup))))

(defn get-float
  "Get element i in the buffer as a double

  i - the element to getFloat - `long`

  returns: the element at this index - `float`"
  (^Float [^DataBuffer this ^Long i]
    (-> this (.getFloat i))))

(defn write
  "Write this buffer to the output stream

  dos - the output stream to write - `java.io.OutputStream`"
  ([^DataBuffer this ^java.io.OutputStream dos]
    (-> this (.write dos))))

(defn get-double
  "Get element i in the buffer as a double

  i - the element to getFloat - `long`

  returns: the element at this index - `double`"
  (^Double [^DataBuffer this ^Long i]
    (-> this (.getDouble i))))

(defn capacity
  "returns: the capacity of the databuffer - `long`"
  (^Long [^DataBuffer this]
    (-> this (.capacity))))

(defn reallocate
  "Reallocate the native memory of the buffer

  length - the new length of the buffer - `long`

  returns: this databuffer - `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^DataBuffer this ^Long length]
    (-> this (.reallocate length))))

(defn array
  "Returns the backing array
  of this buffer (if there is one)

  returns: the backing array of this buffer - `java.lang.Object`"
  (^java.lang.Object [^DataBuffer this]
    (-> this (.array))))

(defn set-constant
  "This method allows you to mark databuffer as constant.
  PLEASE NOTE: DO NOT USE THIS METHOD, UNLESS YOU'RE 100% SURE WHAT YOU DO

  really-constant - `boolean`"
  ([^DataBuffer this ^Boolean really-constant]
    (-> this (.setConstant really-constant))))

(defn original-data-buffer
  "Original DataBuffer.
  In case if we have a view derived from another view, derived from some other view, original DataBuffer will point to the originating DataBuffer, where all views come from.

  returns: `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^DataBuffer this]
    (-> this (.originalDataBuffer))))

(defn same-underlying-data
  "Returns true if the underlying data source
  is the same for both buffers (referential equals)

  buffer - whether the buffer is the same underlying data or not - `org.nd4j.linalg.api.buffer.DataBuffer`

  returns: true if both data buffers have the same
  underlying data SOURCE - `boolean`"
  (^Boolean [^DataBuffer this ^org.nd4j.linalg.api.buffer.DataBuffer buffer]
    (-> this (.sameUnderlyingData buffer))))

