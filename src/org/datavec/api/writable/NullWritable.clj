(ns org.datavec.api.writable.NullWritable
  "NullWritable. Typically only used in very limited circumstances, to signify that a value is missing.
 Attempts to convert the NullWritable to some other value (using toInt(), toDouble() etc) will result in an
 UnsupportedOperationException being thrown"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.writable NullWritable]))

(defn ->null-writable
  "Constructor."
  (^NullWritable []
    (new NullWritable )))

(def *-instance
  "Static Constant.

  type: org.datavec.api.writable.NullWritable"
  NullWritable/INSTANCE)

(defn get-type
  "Description copied from interface: Writable

  returns: `org.datavec.api.writable.WritableType`"
  (^org.datavec.api.writable.WritableType [^NullWritable this]
    (-> this (.getType))))

(defn write-type
  "Description copied from interface: Writable

  out - DataOutput to write to - `java.io.DataOutput`

  throws: java.io.IOException - For errors during writing"
  ([^NullWritable this ^java.io.DataOutput out]
    (-> this (.writeType out))))

(defn read-fields
  "Description copied from interface: Writable

  in - DataInput to deseriablize this object from. - `java.io.DataInput`

  throws: java.io.IOException"
  ([^NullWritable this ^java.io.DataInput in]
    (-> this (.readFields in))))

(defn to-double
  "Description copied from interface: Writable

  returns: `double`"
  (^Double [^NullWritable this]
    (-> this (.toDouble))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^NullWritable this]
    (-> this (.toString))))

(defn to-float
  "Description copied from interface: Writable

  returns: `float`"
  (^Float [^NullWritable this]
    (-> this (.toFloat))))

(defn to-long
  "Description copied from interface: Writable

  returns: `long`"
  (^Long [^NullWritable this]
    (-> this (.toLong))))

(defn to-int
  "Description copied from interface: Writable

  returns: `int`"
  (^Integer [^NullWritable this]
    (-> this (.toInt))))

(defn compare-to
  "o - `java.lang.Object`

  returns: `int`"
  (^Integer [^NullWritable this ^java.lang.Object o]
    (-> this (.compareTo o))))

(defn write
  "Description copied from interface: Writable

  out - DataOuput to serialize this object into. - `java.io.DataOutput`

  throws: java.io.IOException"
  ([^NullWritable this ^java.io.DataOutput out]
    (-> this (.write out))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^NullWritable this ^java.lang.Object o]
    (-> this (.equals o))))

