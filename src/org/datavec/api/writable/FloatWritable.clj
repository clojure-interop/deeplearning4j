(ns org.datavec.api.writable.FloatWritable
  "A WritableComparable for floats."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.writable FloatWritable]))

(defn ->float-writable
  "Constructor.

  value - `float`"
  (^FloatWritable [^Float value]
    (new FloatWritable value))
  (^FloatWritable []
    (new FloatWritable )))

(defn get-type
  "Description copied from interface: Writable

  returns: `org.datavec.api.writable.WritableType`"
  (^org.datavec.api.writable.WritableType [^FloatWritable this]
    (-> this (.getType))))

(defn write-type
  "Description copied from interface: Writable

  out - DataOutput to write to - `java.io.DataOutput`

  throws: java.io.IOException - For errors during writing"
  ([^FloatWritable this ^java.io.DataOutput out]
    (-> this (.writeType out))))

(defn read-fields
  "Description copied from interface: Writable

  in - DataInput to deseriablize this object from. - `java.io.DataInput`

  throws: java.io.IOException"
  ([^FloatWritable this ^java.io.DataInput in]
    (-> this (.readFields in))))

(defn to-double
  "Description copied from interface: Writable

  returns: `double`"
  (^Double [^FloatWritable this]
    (-> this (.toDouble))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^FloatWritable this]
    (-> this (.toString))))

(defn to-float
  "Description copied from interface: Writable

  returns: `float`"
  (^Float [^FloatWritable this]
    (-> this (.toFloat))))

(defn fuzzy-equals
  "o - `org.datavec.api.writable.Writable`
  tolerance - `double`

  returns: `boolean`"
  (^Boolean [^FloatWritable this ^org.datavec.api.writable.Writable o ^Double tolerance]
    (-> this (.fuzzyEquals o tolerance))))

(defn to-long
  "Description copied from interface: Writable

  returns: `long`"
  (^Long [^FloatWritable this]
    (-> this (.toLong))))

(defn to-int
  "Description copied from interface: Writable

  returns: `int`"
  (^Integer [^FloatWritable this]
    (-> this (.toInt))))

(defn hash-code
  "returns: `int`"
  (^Integer [^FloatWritable this]
    (-> this (.hashCode))))

(defn set
  "Set the value of this FloatWritable.

  value - `float`"
  ([^FloatWritable this ^Float value]
    (-> this (.set value))))

(defn compare-to
  "Compares two FloatWritables.

  o - `java.lang.Object`

  returns: `int`"
  (^Integer [^FloatWritable this ^java.lang.Object o]
    (-> this (.compareTo o))))

(defn write
  "Description copied from interface: Writable

  out - DataOuput to serialize this object into. - `java.io.DataOutput`

  throws: java.io.IOException"
  ([^FloatWritable this ^java.io.DataOutput out]
    (-> this (.write out))))

(defn get
  "Return the value of this FloatWritable.

  returns: `float`"
  (^Float [^FloatWritable this]
    (-> this (.get))))

(defn equals
  "Returns true iff o is a FloatWritable with the same value.

  o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^FloatWritable this ^java.lang.Object o]
    (-> this (.equals o))))

