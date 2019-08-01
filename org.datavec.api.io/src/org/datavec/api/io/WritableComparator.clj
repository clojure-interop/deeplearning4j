(ns org.datavec.api.io.WritableComparator
  "A Comparator for WritableComparables.
 This base implemenation uses the natural ordering. To define alternate
 orderings, override compare(WritableComparable,WritableComparable).
 One may optimize compare-intensive operations by overriding
 compare(byte[],int,int,byte[],int,int). Static utility methods are
 provided to assist in optimized implementations of this method."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.io WritableComparator]))

(defn *hash-bytes
  "Compute hash for binary data.

  bytes - `byte[]`
  offset - `int`
  length - `int`

  returns: `int`"
  (^Integer [bytes ^Integer offset ^Integer length]
    (WritableComparator/hashBytes bytes offset length))
  (^Integer [bytes ^Integer length]
    (WritableComparator/hashBytes bytes length)))

(defn *read-float
  "Parse a float from a byte array.

  bytes - `byte[]`
  start - `int`

  returns: `float`"
  (^Float [bytes ^Integer start]
    (WritableComparator/readFloat bytes start)))

(defn *compare-bytes
  "Lexicographic order of binary data.

  b-1 - `byte[]`
  s-1 - `int`
  l-1 - `int`
  b-2 - `byte[]`
  s-2 - `int`
  l-2 - `int`

  returns: `int`"
  (^Integer [b-1 ^Integer s-1 ^Integer l-1 b-2 ^Integer s-2 ^Integer l-2]
    (WritableComparator/compareBytes b-1 s-1 l-1 b-2 s-2 l-2)))

(defn *read-int
  "Parse an integer from a byte array.

  bytes - `byte[]`
  start - `int`

  returns: `int`"
  (^Integer [bytes ^Integer start]
    (WritableComparator/readInt bytes start)))

(defn *read-long
  "Parse a long from a byte array.

  bytes - `byte[]`
  start - `int`

  returns: `long`"
  (^Long [bytes ^Integer start]
    (WritableComparator/readLong bytes start)))

(defn *define
  "Register an optimized comparator for a WritableComparable
  implementation.

  c - `java.lang.Class`
  comparator - `org.datavec.api.io.WritableComparator`"
  ([^java.lang.Class c ^org.datavec.api.io.WritableComparator comparator]
    (WritableComparator/define c comparator)))

(defn *read-v-int
  "Reads a zero-compressed encoded integer from a byte array and returns it.

  bytes - byte array with the encoded integer - `byte[]`
  start - start index - `int`

  returns: deserialized integer - `int`

  throws: java.io.IOException"
  (^Integer [bytes ^Integer start]
    (WritableComparator/readVInt bytes start)))

(defn *read-double
  "Parse a double from a byte array.

  bytes - `byte[]`
  start - `int`

  returns: `double`"
  (^Double [bytes ^Integer start]
    (WritableComparator/readDouble bytes start)))

(defn *get
  "Get a comparator for a WritableComparable implementation.

  c - `java.lang.Class`

  returns: `org.datavec.api.io.WritableComparator`"
  (^org.datavec.api.io.WritableComparator [^java.lang.Class c]
    (WritableComparator/get c)))

(defn *read-v-long
  "Reads a zero-compressed encoded long from a byte array and returns it.

  bytes - byte array with decode long - `byte[]`
  start - starting index - `int`

  returns: deserialized long - `long`

  throws: java.io.IOException"
  (^Long [bytes ^Integer start]
    (WritableComparator/readVLong bytes start)))

(defn *read-unsigned-short
  "Parse an unsigned short from a byte array.

  bytes - `byte[]`
  start - `int`

  returns: `int`"
  (^Integer [bytes ^Integer start]
    (WritableComparator/readUnsignedShort bytes start)))

(defn get-key-class
  "Returns the WritableComparable implementation class.

  returns: `java.lang.Class<? extends org.datavec.api.io.WritableComparable>`"
  ([^WritableComparator this]
    (-> this (.getKeyClass))))

(defn new-key
  "Construct a new WritableComparable instance.

  returns: `org.datavec.api.io.WritableComparable`"
  (^org.datavec.api.io.WritableComparable [^WritableComparator this]
    (-> this (.newKey))))

(defn compare
  "Optimization hook. Override this to make SequenceFile.Sorter's scream.
  The default implementation reads the data into two WritableComparables (using Writable.readFields(DataInput), then calls compare(WritableComparable,WritableComparable).

  b-1 - `byte[]`
  s-1 - `int`
  l-1 - `int`
  b-2 - `byte[]`
  s-2 - `int`
  l-2 - `int`

  returns: `int`"
  (^Integer [^WritableComparator this b-1 ^Integer s-1 ^Integer l-1 b-2 ^Integer s-2 ^Integer l-2]
    (-> this (.compare b-1 s-1 l-1 b-2 s-2 l-2)))
  (^Integer [^WritableComparator this ^org.datavec.api.io.WritableComparable a ^org.datavec.api.io.WritableComparable b]
    (-> this (.compare a b))))

