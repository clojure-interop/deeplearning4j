(ns org.datavec.api.writable.LongWritable
  "A WritableComparable for longs."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.writable LongWritable]))

(defn ->long-writable
  "Constructor.

  value - `long`"
  (^LongWritable [^Long value]
    (new LongWritable value))
  (^LongWritable []
    (new LongWritable )))

(defn get-type
  "Description copied from interface: Writable

  returns: `org.datavec.api.writable.WritableType`"
  (^org.datavec.api.writable.WritableType [^LongWritable this]
    (-> this (.getType))))

(defn write-type
  "Description copied from interface: Writable

  out - DataOutput to write to - `java.io.DataOutput`

  throws: java.io.IOException - For errors during writing"
  ([^LongWritable this ^java.io.DataOutput out]
    (-> this (.writeType out))))

(defn read-fields
  "Description copied from interface: Writable

  in - DataInput to deseriablize this object from. - `java.io.DataInput`

  throws: java.io.IOException"
  ([^LongWritable this ^java.io.DataInput in]
    (-> this (.readFields in))))

(defn to-double
  "Description copied from interface: Writable

  returns: `double`"
  (^Double [^LongWritable this]
    (-> this (.toDouble))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^LongWritable this]
    (-> this (.toString))))

(defn to-float
  "Description copied from interface: Writable

  returns: `float`"
  (^Float [^LongWritable this]
    (-> this (.toFloat))))

(defn fuzzy-equals
  "o - `org.datavec.api.writable.Writable`
  tolerance - `double`

  returns: `boolean`"
  (^Boolean [^LongWritable this ^org.datavec.api.writable.Writable o ^Double tolerance]
    (-> this (.fuzzyEquals o tolerance))))

(defn to-long
  "Description copied from interface: Writable

  returns: `long`"
  (^Long [^LongWritable this]
    (-> this (.toLong))))

(defn to-int
  "Description copied from interface: Writable

  returns: `int`"
  (^Integer [^LongWritable this]
    (-> this (.toInt))))

(defn hash-code
  "returns: `int`"
  (^Integer [^LongWritable this]
    (-> this (.hashCode))))

(defn set
  "Set the value of this LongWritable.

  value - `long`"
  ([^LongWritable this ^Long value]
    (-> this (.set value))))

(defn compare-to
  "Compares two LongWritables.

  o - `java.lang.Object`

  returns: `int`"
  (^Integer [^LongWritable this ^java.lang.Object o]
    (-> this (.compareTo o))))

(defn write
  "Description copied from interface: Writable

  out - DataOuput to serialize this object into. - `java.io.DataOutput`

  throws: java.io.IOException"
  ([^LongWritable this ^java.io.DataOutput out]
    (-> this (.write out))))

(defn get
  "Return the value of this LongWritable.

  returns: `long`"
  (^Long [^LongWritable this]
    (-> this (.get))))

(defn equals
  "Returns true iff o is a LongWritable with the same value.

  o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^LongWritable this ^java.lang.Object o]
    (-> this (.equals o))))

