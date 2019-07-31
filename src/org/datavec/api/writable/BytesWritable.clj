(ns org.datavec.api.writable.BytesWritable
  "Writable type for
 a byte array.
 Note that this Writable
 should be considered *raw* and *unsafe*
 for typical use.
 This writable's primary use case is for low level flexibility
 and interop for accessing raw content when there are no alternatives.
 If you want *safe* indexing that you are familiar with, please
 consider using nd4j's DataBuffer object
 and the associated asNd4jBuffer(DataBuffer.Type, int)
 method below."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.writable BytesWritable]))

(defn ->bytes-writable
  "Constructor.

  Pass in the content for this writable

  content - the content for this writable - `byte[]`"
  (^BytesWritable [content]
    (new BytesWritable content)))

(defn get-type
  "Description copied from interface: Writable

  returns: `org.datavec.api.writable.WritableType`"
  (^org.datavec.api.writable.WritableType [^BytesWritable this]
    (-> this (.getType))))

(defn write-type
  "Description copied from interface: Writable

  out - DataOutput to write to - `java.io.DataOutput`

  throws: java.io.IOException - For errors during writing"
  ([^BytesWritable this ^java.io.DataOutput out]
    (-> this (.writeType out))))

(defn read-fields
  "Description copied from interface: Writable

  in - DataInput to deseriablize this object from. - `java.io.DataInput`

  throws: java.io.IOException"
  ([^BytesWritable this ^java.io.DataInput in]
    (-> this (.readFields in))))

(defn get-long
  "i - `long`

  returns: `long`"
  (^Long [^BytesWritable this ^Long i]
    (-> this (.getLong i))))

(defn get-int
  "i - `long`

  returns: `int`"
  (^Integer [^BytesWritable this ^Long i]
    (-> this (.getInt i))))

(defn length
  "returns: `long`"
  (^Long [^BytesWritable this]
    (-> this (.length))))

(defn as-nd-4j-buffer
  "Convert the underlying contents of this Writable
  to an nd4j DataBuffer. Note that this is a *copy*
  of the underlying buffer.
  Also note that ByteBuffer.allocateDirect(int)
  is used for allocation.
  This should be considered an expensive operation.
  This buffer should be cached when used. Once used, this can be
  used in standard Nd4j operations.
  Beyond that, the reason we have to use allocateDirect
  is due to nd4j data buffers being stored off heap (whether on cpu or gpu)

  type - the type of the data buffer - `org.nd4j.linalg.api.buffer.DataBuffer$Type`
  element-size - the size of each element in the buffer - `int`

  returns: the equivalent nd4j data buffer - `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^BytesWritable this ^org.nd4j.linalg.api.buffer.DataBuffer$Type type ^Integer element-size]
    (-> this (.asNd4jBuffer type element-size))))

(defn hash-code
  "returns: `int`"
  (^Integer [^BytesWritable this]
    (-> this (.hashCode))))

(defn get-float
  "i - `long`

  returns: `float`"
  (^Float [^BytesWritable this ^Long i]
    (-> this (.getFloat i))))

(defn write
  "Description copied from interface: Writable

  out - DataOuput to serialize this object into. - `java.io.DataOutput`

  throws: java.io.IOException"
  ([^BytesWritable this ^java.io.DataOutput out]
    (-> this (.write out))))

(defn get-double
  "i - `long`

  returns: `double`"
  (^Double [^BytesWritable this ^Long i]
    (-> this (.getDouble i))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^BytesWritable this ^java.lang.Object o]
    (-> this (.equals o))))

