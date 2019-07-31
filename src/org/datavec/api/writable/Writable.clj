(ns org.datavec.api.writable.Writable
  "A serializable object which implements a simple, efficient, serialization
 protocol, based on DataInput and DataOutput.
 Any key or value type in the Hadoop Map-Reduce
 framework implements this interface.
 Implementations typically implement a static read(DataInput)
 method which constructs a new instance, calls readFields(DataInput)
 and returns the instance.
 Example:


      public class MyWritable implements Writable {
        // Some data
        private int counter;
        private long timestamp;

        public void write(DataOutput out) throws IOException {
          out.writeInt(counter);
          out.writeLong(timestamp);
        }

        public void readFields(DataInput in) throws IOException {
          counter = in.readInt();
          timestamp = in.readLong();
        }

        public static MyWritable read(DataInput in) throws IOException {
          MyWritable w = new MyWritable();
          w.readFields(in);
          return w;
        }
      }"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.writable Writable]))

(defn write
  "Serialize the fields of this object to out.

  out - DataOuput to serialize this object into. - `java.io.DataOutput`

  throws: java.io.IOException"
  ([^Writable this ^java.io.DataOutput out]
    (-> this (.write out))))

(defn read-fields
  "Deserialize the fields of this object from in.
  For efficiency, implementations should attempt to re-use storage in the
  existing object where possible.

  in - DataInput to deseriablize this object from. - `java.io.DataInput`

  throws: java.io.IOException"
  ([^Writable this ^java.io.DataInput in]
    (-> this (.readFields in))))

(defn write-type
  "Write the type (a single short value) to the DataOutput. See WritableFactory for details.

  out - DataOutput to write to - `java.io.DataOutput`

  throws: java.io.IOException - For errors during writing"
  ([^Writable this ^java.io.DataOutput out]
    (-> this (.writeType out))))

(defn to-double
  "Convert Writable to double. Whether this is supported depends on the specific writable.

  returns: `double`"
  (^Double [^Writable this]
    (-> this (.toDouble))))

(defn to-float
  "Convert Writable to float. Whether this is supported depends on the specific writable.

  returns: `float`"
  (^Float [^Writable this]
    (-> this (.toFloat))))

(defn to-int
  "Convert Writable to int. Whether this is supported depends on the specific writable.

  returns: `int`"
  (^Integer [^Writable this]
    (-> this (.toInt))))

(defn to-long
  "Convert Writable to long. Whether this is supported depends on the specific writable.

  returns: `long`"
  (^Long [^Writable this]
    (-> this (.toLong))))

(defn get-type
  "Get the type of the writable.

  returns: `org.datavec.api.writable.WritableType`"
  (^org.datavec.api.writable.WritableType [^Writable this]
    (-> this (.getType))))

