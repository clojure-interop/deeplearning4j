(ns org.nd4j.linalg.api.buffer.DoubleBuffer
  "Double buffer implementation of data buffer"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.buffer DoubleBuffer]))

(defn ->double-buffer
  "Constructor.

  Meant for creating another view of a buffer

  pointer - the underlying buffer to create a view from - `org.bytedeco.javacpp.Pointer`
  indexer - the indexer for the pointer - `org.bytedeco.javacpp.indexer.Indexer`
  length - the length of the view - `long`"
  (^DoubleBuffer [^org.bytedeco.javacpp.Pointer pointer ^org.bytedeco.javacpp.indexer.Indexer indexer ^Long length]
    (new DoubleBuffer pointer indexer length))
  (^DoubleBuffer [data ^Boolean copy ^Long offset ^org.nd4j.linalg.api.memory.MemoryWorkspace workspace]
    (new DoubleBuffer data copy offset workspace))
  (^DoubleBuffer [^Long length ^Boolean initialize]
    (new DoubleBuffer length initialize))
  (^DoubleBuffer [^Long length]
    (new DoubleBuffer length)))

(defn get-float
  "Description copied from interface: DataBuffer

  i - the element to getFloat - `long`

  returns: the element at this index - `float`"
  (^Float [^DoubleBuffer this ^Long i]
    (-> this (.getFloat i))))

(defn get-number
  "Description copied from interface: DataBuffer

  i - the element to getFloat - `long`

  returns: the element at this index - `java.lang.Number`"
  (^java.lang.Number [^DoubleBuffer this ^Long i]
    (-> this (.getNumber i))))

(defn create
  "Description copied from class: BaseDataBuffer

  data - the buffer to create - `double[]`

  returns: the data buffer based on the given buffer - `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^DoubleBuffer this data]
    (-> this (.create data))))

(defn flush
  "Description copied from interface: DataBuffer"
  ([^DoubleBuffer this]
    (-> this (.flush))))

