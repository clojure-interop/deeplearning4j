(ns org.datavec.api.writable.NDArrayWritable
  "A Writable that basically wraps an INDArray."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.writable NDArrayWritable]))

(defn ->nd-array-writable
  "Constructor.

  array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^NDArrayWritable [^org.nd4j.linalg.api.ndarray.INDArray array]
    (new NDArrayWritable array))
  (^NDArrayWritable []
    (new NDArrayWritable )))

(def *-ndarray-ser-version-header-null
  "Static Constant.

  type: byte"
  NDArrayWritable/NDARRAY_SER_VERSION_HEADER_NULL)

(def *-ndarray-ser-version-header
  "Static Constant.

  type: byte"
  NDArrayWritable/NDARRAY_SER_VERSION_HEADER)

(defn get-type
  "Description copied from interface: Writable

  returns: `org.datavec.api.writable.WritableType`"
  (^org.datavec.api.writable.WritableType [^NDArrayWritable this]
    (-> this (.getType))))

(defn write-type
  "Description copied from interface: Writable

  out - DataOutput to write to - `java.io.DataOutput`

  throws: java.io.IOException - For errors during writing"
  ([^NDArrayWritable this ^java.io.DataOutput out]
    (-> this (.writeType out))))

(defn read-fields
  "Deserialize into a row vector of default type.

  in - DataInput to deseriablize this object from. - `java.io.DataInput`

  throws: java.io.IOException"
  ([^NDArrayWritable this ^java.io.DataInput in]
    (-> this (.readFields in))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^NDArrayWritable this]
    (-> this (.toString))))

(defn get-long
  "i - `long`

  returns: `long`"
  (^Long [^NDArrayWritable this ^Long i]
    (-> this (.getLong i))))

(defn get-int
  "i - `long`

  returns: `int`"
  (^Integer [^NDArrayWritable this ^Long i]
    (-> this (.getInt i))))

(defn length
  "returns: `long`"
  (^Long [^NDArrayWritable this]
    (-> this (.length))))

(defn hash-code
  "returns: `int`"
  (^Integer [^NDArrayWritable this]
    (-> this (.hashCode))))

(defn set
  "array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^NDArrayWritable this ^org.nd4j.linalg.api.ndarray.INDArray array]
    (-> this (.set array))))

(defn compare-to
  "o - `java.lang.Object`

  returns: `int`"
  (^Integer [^NDArrayWritable this ^java.lang.Object o]
    (-> this (.compareTo o))))

(defn get-float
  "i - `long`

  returns: `float`"
  (^Float [^NDArrayWritable this ^Long i]
    (-> this (.getFloat i))))

(defn write
  "Serialize array data linearly.

  out - DataOuput to serialize this object into. - `java.io.DataOutput`

  throws: java.io.IOException"
  ([^NDArrayWritable this ^java.io.DataOutput out]
    (-> this (.write out))))

(defn get-double
  "i - `long`

  returns: `double`"
  (^Double [^NDArrayWritable this ^Long i]
    (-> this (.getDouble i))))

(defn get
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayWritable this]
    (-> this (.get))))

(defn equals
  "Returns true iff o is a ArrayWritable with the same value.

  o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^NDArrayWritable this ^java.lang.Object o]
    (-> this (.equals o))))

