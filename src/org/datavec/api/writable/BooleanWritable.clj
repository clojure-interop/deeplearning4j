(ns org.datavec.api.writable.BooleanWritable
  "A WritableComparable for booleans."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.writable BooleanWritable]))

(defn ->boolean-writable
  "Constructor.

  value - `boolean`"
  (^BooleanWritable [^Boolean value]
    (new BooleanWritable value))
  (^BooleanWritable []
    (new BooleanWritable )))

(defn get-type
  "Description copied from interface: Writable

  returns: `org.datavec.api.writable.WritableType`"
  (^org.datavec.api.writable.WritableType [^BooleanWritable this]
    (-> this (.getType))))

(defn write-type
  "Description copied from interface: Writable

  out - DataOutput to write to - `java.io.DataOutput`

  throws: java.io.IOException - For errors during writing"
  ([^BooleanWritable this ^java.io.DataOutput out]
    (-> this (.writeType out))))

(defn read-fields
  "Description copied from interface: Writable

  in - DataInput to deseriablize this object from. - `java.io.DataInput`

  throws: java.io.IOException"
  ([^BooleanWritable this ^java.io.DataInput in]
    (-> this (.readFields in))))

(defn to-double
  "Description copied from interface: Writable

  returns: `double`"
  (^Double [^BooleanWritable this]
    (-> this (.toDouble))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BooleanWritable this]
    (-> this (.toString))))

(defn to-float
  "Description copied from interface: Writable

  returns: `float`"
  (^Float [^BooleanWritable this]
    (-> this (.toFloat))))

(defn to-long
  "Description copied from interface: Writable

  returns: `long`"
  (^Long [^BooleanWritable this]
    (-> this (.toLong))))

(defn to-int
  "Description copied from interface: Writable

  returns: `int`"
  (^Integer [^BooleanWritable this]
    (-> this (.toInt))))

(defn hash-code
  "returns: `int`"
  (^Integer [^BooleanWritable this]
    (-> this (.hashCode))))

(defn set
  "Set the value of the BooleanWritable

  value - `boolean`"
  ([^BooleanWritable this ^Boolean value]
    (-> this (.set value))))

(defn compare-to
  "o - `java.lang.Object`

  returns: `int`"
  (^Integer [^BooleanWritable this ^java.lang.Object o]
    (-> this (.compareTo o))))

(defn write
  "Description copied from interface: Writable

  out - DataOuput to serialize this object into. - `java.io.DataOutput`

  throws: java.io.IOException"
  ([^BooleanWritable this ^java.io.DataOutput out]
    (-> this (.write out))))

(defn get
  "Returns the value of the BooleanWritable

  returns: `boolean`"
  (^Boolean [^BooleanWritable this]
    (-> this (.get))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^BooleanWritable this ^java.lang.Object o]
    (-> this (.equals o))))

