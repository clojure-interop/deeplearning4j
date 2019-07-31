(ns org.datavec.image.data.ImageWritable
  "Wraps a Frame to allow serialization within this framework.
 Frame objects can be converted back and forth easily to and from classes
 used by Android, Java 2D, OpenCV, FFmpeg, and others."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.image.data ImageWritable]))

(defn ->image-writable
  "Constructor.

  frame - `org.bytedeco.javacv.Frame`"
  (^ImageWritable [^org.bytedeco.javacv.Frame frame]
    (new ImageWritable frame))
  (^ImageWritable []
    (new ImageWritable )))

(defn get-width
  "returns: `int`"
  (^Integer [^ImageWritable this]
    (-> this (.getWidth))))

(defn get-frame
  "returns: `org.bytedeco.javacv.Frame`"
  (^org.bytedeco.javacv.Frame [^ImageWritable this]
    (-> this (.getFrame))))

(defn get-type
  "Description copied from interface: Writable

  returns: `org.datavec.api.writable.WritableType`"
  (^org.datavec.api.writable.WritableType [^ImageWritable this]
    (-> this (.getType))))

(defn write-type
  "Description copied from interface: Writable

  out - DataOutput to write to - `java.io.DataOutput`

  throws: java.io.IOException - For errors during writing"
  ([^ImageWritable this ^java.io.DataOutput out]
    (-> this (.writeType out))))

(defn read-fields
  "Description copied from interface: Writable

  in - DataInput to deseriablize this object from. - `java.io.DataInput`

  throws: java.io.IOException"
  ([^ImageWritable this ^java.io.DataInput in]
    (-> this (.readFields in))))

(defn to-double
  "Description copied from interface: Writable

  returns: `double`"
  (^Double [^ImageWritable this]
    (-> this (.toDouble))))

(defn to-float
  "Description copied from interface: Writable

  returns: `float`"
  (^Float [^ImageWritable this]
    (-> this (.toFloat))))

(defn get-height
  "returns: `int`"
  (^Integer [^ImageWritable this]
    (-> this (.getHeight))))

(defn to-long
  "Description copied from interface: Writable

  returns: `long`"
  (^Long [^ImageWritable this]
    (-> this (.toLong))))

(defn to-int
  "Description copied from interface: Writable

  returns: `int`"
  (^Integer [^ImageWritable this]
    (-> this (.toInt))))

(defn write
  "Description copied from interface: Writable

  out - DataOuput to serialize this object into. - `java.io.DataOutput`

  throws: java.io.IOException"
  ([^ImageWritable this ^java.io.DataOutput out]
    (-> this (.write out))))

(defn set-frame
  "frame - `org.bytedeco.javacv.Frame`"
  ([^ImageWritable this ^org.bytedeco.javacv.Frame frame]
    (-> this (.setFrame frame))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ImageWritable this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn get-depth
  "returns: `int`"
  (^Integer [^ImageWritable this]
    (-> this (.getDepth))))

