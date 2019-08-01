(ns org.datavec.api.writable.IntWritable
  "A WritableComparable for ints."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.writable IntWritable]))

(defn ->int-writable
  "Constructor.

  value - `int`"
  (^IntWritable [^Integer value]
    (new IntWritable value))
  (^IntWritable []
    (new IntWritable )))

(defn get-type
  "Description copied from interface: Writable

  returns: `org.datavec.api.writable.WritableType`"
  (^org.datavec.api.writable.WritableType [^IntWritable this]
    (-> this (.getType))))

(defn write-type
  "Description copied from interface: Writable

  out - DataOutput to write to - `java.io.DataOutput`

  throws: java.io.IOException - For errors during writing"
  ([^IntWritable this ^java.io.DataOutput out]
    (-> this (.writeType out))))

(defn read-fields
  "Description copied from interface: Writable

  in - DataInput to deseriablize this object from. - `java.io.DataInput`

  throws: java.io.IOException"
  ([^IntWritable this ^java.io.DataInput in]
    (-> this (.readFields in))))

(defn to-double
  "Description copied from interface: Writable

  returns: `double`"
  (^Double [^IntWritable this]
    (-> this (.toDouble))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^IntWritable this]
    (-> this (.toString))))

(defn to-float
  "Description copied from interface: Writable

  returns: `float`"
  (^Float [^IntWritable this]
    (-> this (.toFloat))))

(defn fuzzy-equals
  "o - `org.datavec.api.writable.Writable`
  tolerance - `double`

  returns: `boolean`"
  (^Boolean [^IntWritable this ^org.datavec.api.writable.Writable o ^Double tolerance]
    (-> this (.fuzzyEquals o tolerance))))

(defn to-long
  "Description copied from interface: Writable

  returns: `long`"
  (^Long [^IntWritable this]
    (-> this (.toLong))))

(defn to-int
  "Description copied from interface: Writable

  returns: `int`"
  (^Integer [^IntWritable this]
    (-> this (.toInt))))

(defn hash-code
  "returns: `int`"
  (^Integer [^IntWritable this]
    (-> this (.hashCode))))

(defn set
  "Set the value of this IntWritable.

  value - `int`"
  ([^IntWritable this ^Integer value]
    (-> this (.set value))))

(defn compare-to
  "Compares two IntWritables.

  o - `java.lang.Object`

  returns: `int`"
  (^Integer [^IntWritable this ^java.lang.Object o]
    (-> this (.compareTo o))))

(defn write
  "Description copied from interface: Writable

  out - DataOuput to serialize this object into. - `java.io.DataOutput`

  throws: java.io.IOException"
  ([^IntWritable this ^java.io.DataOutput out]
    (-> this (.write out))))

(defn get
  "Return the value of this IntWritable.

  returns: `int`"
  (^Integer [^IntWritable this]
    (-> this (.get))))

(defn equals
  "Returns true iff o is a IntWritable with the same value.

  o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^IntWritable this ^java.lang.Object o]
    (-> this (.equals o))))

