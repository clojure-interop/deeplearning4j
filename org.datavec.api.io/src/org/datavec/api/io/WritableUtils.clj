(ns org.datavec.api.io.WritableUtils
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.io WritableUtils]))

(defn ->writable-utils
  "Constructor."
  (^WritableUtils []
    (new WritableUtils )))

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
    (WritableUtils/writeVLong stream i)))

(defn *write-string-array
  "out - `java.io.DataOutput`
  s - `java.lang.String[]`

  throws: java.io.IOException"
  ([^java.io.DataOutput out s]
    (WritableUtils/writeStringArray out s)))

(defn *negative-v-int?
  "Given the first byte of a vint/vlong, determine the sign

  value - the first byte - `byte`

  returns: is the value negative - `boolean`"
  (^Boolean [^Byte value]
    (WritableUtils/isNegativeVInt value)))

(defn *read-compressed-string-array
  "in - `java.io.DataInput`

  returns: `java.lang.String[]`

  throws: java.io.IOException"
  ([^java.io.DataInput in]
    (WritableUtils/readCompressedStringArray in)))

(defn *read-enum
  "Read an Enum value from DataInput, Enums are read and written
  using String values.

  in - DataInput to read from - `java.io.DataInput`
  enum-type - Class type of Enum - `java.lang.Class`

  returns: Enum represented by String read from DataInput - `<T extends java.lang.Enum<T>> T`

  throws: java.io.IOException"
  ([^java.io.DataInput in ^java.lang.Class enum-type]
    (WritableUtils/readEnum in enum-type)))

(defn *read-compressed-string
  "in - `java.io.DataInput`

  returns: `java.lang.String`

  throws: java.io.IOException"
  (^java.lang.String [^java.io.DataInput in]
    (WritableUtils/readCompressedString in)))

(defn *write-compressed-byte-array
  "out - `java.io.DataOutput`
  bytes - `byte[]`

  returns: `int`

  throws: java.io.IOException"
  (^Integer [^java.io.DataOutput out bytes]
    (WritableUtils/writeCompressedByteArray out bytes)))

(defn *read-string
  "in - `java.io.DataInput`

  returns: `java.lang.String`

  throws: java.io.IOException"
  (^java.lang.String [^java.io.DataInput in]
    (WritableUtils/readString in)))

(defn *get-v-int-size
  "Get the encoded length if an integer is stored in a variable-length format

  i - `long`

  returns: the encoded length - `int`"
  (^Integer [^Long i]
    (WritableUtils/getVIntSize i)))

(defn *write-v-int
  "Serializes an integer to a binary stream with zero-compressed encoding.
  For -120 <= i <= 127, only one byte is used with the actual value.
  For other values of i, the first byte value indicates whether the
  integer is positive or negative, and the number of bytes that follow.
  If the first byte value v is between -121 and -124, the following integer
  is positive, with number of bytes that follow are -(v+120).
  If the first byte value v is between -125 and -128, the following integer
  is negative, with number of bytes that follow are -(v+124). Bytes are
  stored in the high-non-zero-byte-first order.

  stream - Binary output stream - `java.io.DataOutput`
  i - Integer to be serialized - `int`

  throws: java.io.IOException"
  ([^java.io.DataOutput stream ^Integer i]
    (WritableUtils/writeVInt stream i)))

(defn *write-string
  "out - `java.io.DataOutput`
  s - `java.lang.String`

  throws: java.io.IOException"
  ([^java.io.DataOutput out ^java.lang.String s]
    (WritableUtils/writeString out s)))

(defn *write-compressed-string
  "out - `java.io.DataOutput`
  s - `java.lang.String`

  returns: `int`

  throws: java.io.IOException"
  (^Integer [^java.io.DataOutput out ^java.lang.String s]
    (WritableUtils/writeCompressedString out s)))

(defn *write-compressed-string-array
  "out - `java.io.DataOutput`
  s - `java.lang.String[]`

  throws: java.io.IOException"
  ([^java.io.DataOutput out s]
    (WritableUtils/writeCompressedStringArray out s)))

(defn *decode-v-int-size
  "Parse the first byte of a vint/vlong to determine the number of bytes

  value - the first byte of the vint/vlong - `byte`

  returns: the total number of bytes (1 to 9) - `int`"
  (^Integer [^Byte value]
    (WritableUtils/decodeVIntSize value)))

(defn *clone
  "Make a copy of a writable object using serialization to a buffer.

  orig - The object to copy - `T`
  conf - `org.datavec.api.conf.Configuration`

  returns: The copied object - `<T extends org.datavec.api.writable.Writable> T`"
  ([orig ^org.datavec.api.conf.Configuration conf]
    (WritableUtils/clone orig conf)))

(defn *read-v-int
  "Reads a zero-compressed encoded integer from input stream and returns it.

  stream - Binary input stream - `java.io.DataInput`

  returns: deserialized integer from stream. - `int`

  throws: java.io.IOException"
  (^Integer [^java.io.DataInput stream]
    (WritableUtils/readVInt stream)))

(defn *read-compressed-byte-array
  "in - `java.io.DataInput`

  returns: `byte[]`

  throws: java.io.IOException"
  ([^java.io.DataInput in]
    (WritableUtils/readCompressedByteArray in)))

(defn *read-string-array
  "in - `java.io.DataInput`

  returns: `java.lang.String[]`

  throws: java.io.IOException"
  ([^java.io.DataInput in]
    (WritableUtils/readStringArray in)))

(defn *to-byte-array
  "Convert writables to a byte array

  writables - `org.datavec.api.writable.Writable`

  returns: `byte[]`"
  ([^org.datavec.api.writable.Writable writables]
    (WritableUtils/toByteArray writables)))

(defn *skip-fully
  "Skip len number of bytes in input streamin

  in - input stream - `java.io.DataInput`
  len - number of bytes to skip - `int`

  throws: java.io.IOException - when skipped less number of bytes"
  ([^java.io.DataInput in ^Integer len]
    (WritableUtils/skipFully in len)))

(defn *display-byte-array
  "record - `byte[]`"
  ([record]
    (WritableUtils/displayByteArray record)))

(defn *write-enum
  "writes String value of enum to DataOutput.

  out - Dataoutput stream - `java.io.DataOutput`
  enum-val - enum value - `java.lang.Enum`

  throws: java.io.IOException"
  ([^java.io.DataOutput out ^java.lang.Enum enum-val]
    (WritableUtils/writeEnum out enum-val)))

(defn *read-v-long
  "Reads a zero-compressed encoded long from input stream and returns it.

  stream - Binary input stream - `java.io.DataInput`

  returns: deserialized long from stream. - `long`

  throws: java.io.IOException"
  (^Long [^java.io.DataInput stream]
    (WritableUtils/readVLong stream)))

(defn *skip-compressed-byte-array
  "in - `java.io.DataInput`

  throws: java.io.IOException"
  ([^java.io.DataInput in]
    (WritableUtils/skipCompressedByteArray in)))

