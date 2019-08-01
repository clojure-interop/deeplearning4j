(ns org.datavec.api.writable.ByteWritable
  "A WritableComparable for a single byte."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.writable ByteWritable]))

(defn ->byte-writable
  "Constructor.

  value - `byte`"
  (^ByteWritable [^Byte value]
    (new ByteWritable value))
  (^ByteWritable []
    (new ByteWritable )))

(defn get-type
  "Description copied from interface: Writable

  returns: `org.datavec.api.writable.WritableType`"
  (^org.datavec.api.writable.WritableType [^ByteWritable this]
    (-> this (.getType))))

(defn write-type
  "Description copied from interface: Writable

  out - DataOutput to write to - `java.io.DataOutput`

  throws: java.io.IOException - For errors during writing"
  ([^ByteWritable this ^java.io.DataOutput out]
    (-> this (.writeType out))))

(defn read-fields
  "Description copied from interface: Writable

  in - DataInput to deseriablize this object from. - `java.io.DataInput`

  throws: java.io.IOException"
  ([^ByteWritable this ^java.io.DataInput in]
    (-> this (.readFields in))))

(defn to-double
  "Description copied from interface: Writable

  returns: `double`"
  (^Double [^ByteWritable this]
    (-> this (.toDouble))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ByteWritable this]
    (-> this (.toString))))

(defn to-float
  "Description copied from interface: Writable

  returns: `float`"
  (^Float [^ByteWritable this]
    (-> this (.toFloat))))

(defn fuzzy-equals
  "o - `org.datavec.api.writable.Writable`
  tolerance - `double`

  returns: `boolean`"
  (^Boolean [^ByteWritable this ^org.datavec.api.writable.Writable o ^Double tolerance]
    (-> this (.fuzzyEquals o tolerance))))

(defn to-long
  "Description copied from interface: Writable

  returns: `long`"
  (^Long [^ByteWritable this]
    (-> this (.toLong))))

(defn to-int
  "Description copied from interface: Writable

  returns: `int`"
  (^Integer [^ByteWritable this]
    (-> this (.toInt))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ByteWritable this]
    (-> this (.hashCode))))

(defn set
  "Set the value of this ByteWritable.

  value - `byte`"
  ([^ByteWritable this ^Byte value]
    (-> this (.set value))))

(defn compare-to
  "Compares two ByteWritables.

  o - `java.lang.Object`

  returns: `int`"
  (^Integer [^ByteWritable this ^java.lang.Object o]
    (-> this (.compareTo o))))

(defn write
  "Description copied from interface: Writable

  out - DataOuput to serialize this object into. - `java.io.DataOutput`

  throws: java.io.IOException"
  ([^ByteWritable this ^java.io.DataOutput out]
    (-> this (.write out))))

(defn get
  "Return the value of this ByteWritable.

  returns: `byte`"
  (^Byte [^ByteWritable this]
    (-> this (.get))))

(defn equals
  "Returns true iff o is a ByteWritable with the same value.

  o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ByteWritable this ^java.lang.Object o]
    (-> this (.equals o))))

