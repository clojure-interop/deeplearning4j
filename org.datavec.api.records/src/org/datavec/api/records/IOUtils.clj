(ns org.datavec.api.records.IOUtils
  "Various utility functions for Hadooop record I/O runtime."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.records IOUtils]))

(def *-hexchars
  "Static Constant.

  type: char[]"
  IOUtils/hexchars)

(defn *read-float
  "Parse a float from a byte array.

  bytes - `byte[]`
  start - `int`

  returns: `float`"
  (^Float [bytes ^Integer start]
    (IOUtils/readFloat bytes start)))

(defn *read-double
  "Parse a double from a byte array.

  bytes - `byte[]`
  start - `int`

  returns: `double`"
  (^Double [bytes ^Integer start]
    (IOUtils/readDouble bytes start)))

(defn *read-v-long
  "Reads a zero-compressed encoded long from a byte array and returns it.

  bytes - byte array with decode long - `byte[]`
  start - starting index - `int`

  returns: deserialized long - `long`

  throws: java.io.IOException"
  (^Long [bytes ^Integer start]
    (IOUtils/readVLong bytes start))
  (^Long [^java.io.DataInput in]
    (IOUtils/readVLong in)))

(defn *read-v-int
  "Reads a zero-compressed encoded integer from a byte array and returns it.

  bytes - byte array with the encoded integer - `byte[]`
  start - start index - `int`

  returns: deserialized integer - `int`

  throws: java.io.IOException"
  (^Integer [bytes ^Integer start]
    (IOUtils/readVInt bytes start))
  (^Integer [^java.io.DataInput in]
    (IOUtils/readVInt in)))

(defn *get-v-int-size
  "Get the encoded length if an integer is stored in a variable-length format

  i - `long`

  returns: the encoded length - `int`"
  (^Integer [^Long i]
    (IOUtils/getVIntSize i)))

(defn *write-v-long
  "Serializes a long to a binary stream with zero-compressed encoding.
  For -112 <= i <= 127, only one byte is used with the actual value.
  For other values of i, the first byte value indicates whether the
  long is positive or negative, and the number of bytes that follow.
  If the first byte value v is between -113 and -120, the following long
  is positive, with number of bytes that follow are -(v+112).
  If the first byte value v is between -121 and -128, the following long
  is negative, with number of bytes that follow are -(v+120). Bytes are
  stored in the high-non-zero-byte-first order.

  stream - Binary output stream - `java.io.DataOutput`
  i - Long to be serialized - `long`

  throws: java.io.IOException"
  ([^java.io.DataOutput stream ^Long i]
    (IOUtils/writeVLong stream i)))

(defn *write-v-int
  "Serializes an int to a binary stream with zero-compressed encoding.

  stream - Binary output stream - `java.io.DataOutput`
  i - int to be serialized - `int`

  throws: java.io.IOException"
  ([^java.io.DataOutput stream ^Integer i]
    (IOUtils/writeVInt stream i)))

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
    (IOUtils/compareBytes b-1 s-1 l-1 b-2 s-2 l-2)))

