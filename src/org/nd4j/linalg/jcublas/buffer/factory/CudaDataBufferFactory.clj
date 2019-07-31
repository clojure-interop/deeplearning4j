(ns org.nd4j.linalg.jcublas.buffer.factory.CudaDataBufferFactory
  "Creates cuda buffers"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.jcublas.buffer.factory CudaDataBufferFactory]))

(defn ->cuda-data-buffer-factory
  "Constructor."
  (^CudaDataBufferFactory []
    (new CudaDataBufferFactory )))

(defn set-allocation-mode
  "Description copied from interface: DataBufferFactory

  allocation-mode - `org.nd4j.linalg.api.buffer.DataBuffer$AllocationMode`"
  ([^CudaDataBufferFactory this ^org.nd4j.linalg.api.buffer.DataBuffer$AllocationMode allocation-mode]
    (-> this (.setAllocationMode allocation-mode))))

(defn float-buffer-class
  "returns: `java.lang.Class<? extends org.nd4j.linalg.api.buffer.DataBuffer>`"
  ([^CudaDataBufferFactory this]
    (-> this (.floatBufferClass))))

(defn create-same
  "This method will create new DataBuffer of the same dataType & same length

  buffer - `org.nd4j.linalg.api.buffer.DataBuffer`
  init - `boolean`
  workspace - `org.nd4j.linalg.api.memory.MemoryWorkspace`

  returns: `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^CudaDataBufferFactory this ^org.nd4j.linalg.api.buffer.DataBuffer buffer ^Boolean init ^org.nd4j.linalg.api.memory.MemoryWorkspace workspace]
    (-> this (.createSame buffer init workspace)))
  (^org.nd4j.linalg.api.buffer.DataBuffer [^CudaDataBufferFactory this ^org.nd4j.linalg.api.buffer.DataBuffer buffer ^Boolean init]
    (-> this (.createSame buffer init))))

(defn create-double
  "Description copied from interface: DataBufferFactory

  offset - `long`
  buffer - `java.nio.ByteBuffer`
  length - `int`

  returns: `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^CudaDataBufferFactory this ^Long offset ^java.nio.ByteBuffer buffer ^Integer length]
    (-> this (.createDouble offset buffer length)))
  (^org.nd4j.linalg.api.buffer.DataBuffer [^CudaDataBufferFactory this ^Long offset ^Integer length]
    (-> this (.createDouble offset length)))
  (^org.nd4j.linalg.api.buffer.DataBuffer [^CudaDataBufferFactory this ^Long length]
    (-> this (.createDouble length))))

(defn int-buffer-class
  "returns: `java.lang.Class<? extends org.nd4j.linalg.api.buffer.DataBuffer>`"
  ([^CudaDataBufferFactory this]
    (-> this (.intBufferClass))))

(defn create-long
  "Description copied from interface: DataBufferFactory

  data - the data to create the buffer from - `int[]`
  copy - `boolean`

  returns: the new buffer - `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^CudaDataBufferFactory this data ^Boolean copy]
    (-> this (.createLong data copy)))
  (^org.nd4j.linalg.api.buffer.DataBuffer [^CudaDataBufferFactory this ^Long length ^Boolean initialize ^org.nd4j.linalg.api.memory.MemoryWorkspace workspace]
    (-> this (.createLong length initialize workspace)))
  (^org.nd4j.linalg.api.buffer.DataBuffer [^CudaDataBufferFactory this data]
    (-> this (.createLong data))))

(defn create-float
  "Description copied from interface: DataBufferFactory

  offset - `long`
  buffer - `java.nio.ByteBuffer`
  length - `int`

  returns: `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^CudaDataBufferFactory this ^Long offset ^java.nio.ByteBuffer buffer ^Integer length]
    (-> this (.createFloat offset buffer length)))
  (^org.nd4j.linalg.api.buffer.DataBuffer [^CudaDataBufferFactory this ^Long offset ^Integer length]
    (-> this (.createFloat offset length)))
  (^org.nd4j.linalg.api.buffer.DataBuffer [^CudaDataBufferFactory this ^Long length]
    (-> this (.createFloat length))))

(defn create-int
  "Description copied from interface: DataBufferFactory

  offset - `long`
  buffer - `java.nio.ByteBuffer`
  length - `int`

  returns: `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^CudaDataBufferFactory this ^Long offset ^java.nio.ByteBuffer buffer ^Integer length]
    (-> this (.createInt offset buffer length)))
  (^org.nd4j.linalg.api.buffer.DataBuffer [^CudaDataBufferFactory this ^Long offset ^Integer length]
    (-> this (.createInt offset length)))
  (^org.nd4j.linalg.api.buffer.DataBuffer [^CudaDataBufferFactory this ^Long length]
    (-> this (.createInt length))))

(defn allocation-mode
  "Description copied from interface: DataBufferFactory

  returns: `org.nd4j.linalg.api.buffer.DataBuffer$AllocationMode`"
  (^org.nd4j.linalg.api.buffer.DataBuffer$AllocationMode [^CudaDataBufferFactory this]
    (-> this (.allocationMode))))

(defn create
  "Create a data buffer based on the
  given pointer, data buffer opType,
  and length of the buffer

  pointer - the pointer to use - `org.bytedeco.javacpp.Pointer`
  type - the opType of buffer - `org.nd4j.linalg.api.buffer.DataBuffer$Type`
  length - the length of the buffer - `long`
  indexer - `org.bytedeco.javacpp.indexer.Indexer`

  returns: the data buffer
  backed by this pointer with the given
  opType and length. - `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^CudaDataBufferFactory this ^org.bytedeco.javacpp.Pointer pointer ^org.nd4j.linalg.api.buffer.DataBuffer$Type type ^Long length ^org.bytedeco.javacpp.indexer.Indexer indexer]
    (-> this (.create pointer type length indexer)))
  (^org.nd4j.linalg.api.buffer.DataBuffer [^CudaDataBufferFactory this ^org.nd4j.linalg.api.buffer.DataBuffer underlying-buffer ^Long offset ^Long length]
    (-> this (.create underlying-buffer offset length)))
  (^org.nd4j.linalg.api.buffer.DataBuffer [^CudaDataBufferFactory this ^org.bytedeco.javacpp.DoublePointer double-pointer ^Long length]
    (-> this (.create double-pointer length))))

(defn double-buffer-class
  "returns: `java.lang.Class<? extends org.nd4j.linalg.api.buffer.DataBuffer>`"
  ([^CudaDataBufferFactory this]
    (-> this (.doubleBufferClass))))

(defn half-buffer-class
  "returns: `java.lang.Class<? extends org.nd4j.linalg.api.buffer.DataBuffer>`"
  ([^CudaDataBufferFactory this]
    (-> this (.halfBufferClass))))

(defn create-half
  "Creates a half-precision data buffer

  offset - `long`
  data - the data to create the buffer from - `double[]`
  copy - `boolean`

  returns: the new buffer - `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^CudaDataBufferFactory this ^Long offset data ^Boolean copy]
    (-> this (.createHalf offset data copy)))
  (^org.nd4j.linalg.api.buffer.DataBuffer [^CudaDataBufferFactory this ^Long length ^Boolean initialize]
    (-> this (.createHalf length initialize)))
  (^org.nd4j.linalg.api.buffer.DataBuffer [^CudaDataBufferFactory this ^Long length]
    (-> this (.createHalf length))))

(defn long-buffer-class
  "returns: `java.lang.Class<? extends org.nd4j.linalg.api.buffer.DataBuffer>`"
  ([^CudaDataBufferFactory this]
    (-> this (.longBufferClass))))

