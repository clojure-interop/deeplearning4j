(ns org.datavec.api.writable.DoubleWritable
  "Writable for Double values."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.writable DoubleWritable]))

(defn ->double-writable
  "Constructor.

  value - `double`"
  (^DoubleWritable [^Double value]
    (new DoubleWritable value))
  (^DoubleWritable []
    (new DoubleWritable )))

(defn get-type
  "Description copied from interface: Writable

  returns: `org.datavec.api.writable.WritableType`"
  (^org.datavec.api.writable.WritableType [^DoubleWritable this]
    (-> this (.getType))))

(defn write-type
  "Description copied from interface: Writable

  out - DataOutput to write to - `java.io.DataOutput`

  throws: java.io.IOException - For errors during writing"
  ([^DoubleWritable this ^java.io.DataOutput out]
    (-> this (.writeType out))))

(defn read-fields
  "Description copied from interface: Writable

  in - DataInput to deseriablize this object from. - `java.io.DataInput`

  throws: java.io.IOException"
  ([^DoubleWritable this ^java.io.DataInput in]
    (-> this (.readFields in))))

(defn to-double
  "Description copied from interface: Writable

  returns: `double`"
  (^Double [^DoubleWritable this]
    (-> this (.toDouble))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^DoubleWritable this]
    (-> this (.toString))))

(defn to-float
  "Description copied from interface: Writable

  returns: `float`"
  (^Float [^DoubleWritable this]
    (-> this (.toFloat))))

(defn fuzzy-equals
  "o - `org.datavec.api.writable.Writable`
  tolerance - `double`

  returns: `boolean`"
  (^Boolean [^DoubleWritable this ^org.datavec.api.writable.Writable o ^Double tolerance]
    (-> this (.fuzzyEquals o tolerance))))

(defn to-long
  "Description copied from interface: Writable

  returns: `long`"
  (^Long [^DoubleWritable this]
    (-> this (.toLong))))

(defn to-int
  "Description copied from interface: Writable

  returns: `int`"
  (^Integer [^DoubleWritable this]
    (-> this (.toInt))))

(defn hash-code
  "returns: `int`"
  (^Integer [^DoubleWritable this]
    (-> this (.hashCode))))

(defn set
  "value - `double`"
  ([^DoubleWritable this ^Double value]
    (-> this (.set value))))

(defn compare-to
  "o - `java.lang.Object`

  returns: `int`"
  (^Integer [^DoubleWritable this ^java.lang.Object o]
    (-> this (.compareTo o))))

(defn write
  "Description copied from interface: Writable

  out - DataOuput to serialize this object into. - `java.io.DataOutput`

  throws: java.io.IOException"
  ([^DoubleWritable this ^java.io.DataOutput out]
    (-> this (.write out))))

(defn get
  "returns: `double`"
  (^Double [^DoubleWritable this]
    (-> this (.get))))

(defn equals
  "Returns true iff o is a DoubleWritable with the same value.

  o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^DoubleWritable this ^java.lang.Object o]
    (-> this (.equals o))))

