(ns org.datavec.api.writable.Text
  "This class stores text using standard UTF8 encoding. It provides methods
 to serialize, deserialize, and compare texts at byte level. The type of
 length is integer and is serialized using zero-compressed format. In
 addition, it provides methods for string traversal without converting the
 byte array to a string. Also includes utilities for
 serializing/deserialing a string, coding/decoding a string, checking if a
 byte array contains valid UTF8 code, calculating the length of an encoded
 string."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.writable Text]))

(defn ->text
  "Constructor.

  Construct from a string.

  string - `java.lang.String`"
  (^Text [^java.lang.String string]
    (new Text string))
  (^Text []
    (new Text )))

(defn *skip
  "Skips over one Text in the input.

  in - `java.io.DataInput`

  throws: java.io.IOException"
  ([^java.io.DataInput in]
    (Text/skip in)))

(defn *decode
  "Converts the provided byte array to a String using the
  UTF-8 encoding. If replace is true, then
  malformed input is replaced with the
  substitution character, which is U+FFFD. Otherwise the
  method throws a MalformedInputException.

  utf-8 - `byte[]`
  start - `int`
  length - `int`
  replace - `boolean`

  returns: `java.lang.String`

  throws: java.nio.charset.CharacterCodingException"
  (^java.lang.String [utf-8 ^Integer start ^Integer length ^Boolean replace]
    (Text/decode utf-8 start length replace))
  (^java.lang.String [utf-8]
    (Text/decode utf-8))
  (^java.lang.String [utf-8 ^Integer start ^Integer length]
    (Text/decode utf-8 start length)))

(defn *encode
  "Converts the provided String to bytes using the
  UTF-8 encoding. If replace is true, then
  malformed input is replaced with the
  substitution character, which is U+FFFD. Otherwise the
  method throws a MalformedInputException.

  string - `java.lang.String`
  replace - `boolean`

  returns: ByteBuffer: bytes stores at ByteBuffer.array()
  and length is ByteBuffer.limit() - `java.nio.ByteBuffer`

  throws: java.nio.charset.CharacterCodingException"
  (^java.nio.ByteBuffer [^java.lang.String string ^Boolean replace]
    (Text/encode string replace))
  (^java.nio.ByteBuffer [^java.lang.String string]
    (Text/encode string)))

(defn *read-string
  "Read a UTF8 encoded string from in

  in - `java.io.DataInput`

  returns: `java.lang.String`

  throws: java.io.IOException"
  (^java.lang.String [^java.io.DataInput in]
    (Text/readString in)))

(defn *write-string
  "Write a UTF8 encoded string to out

  out - `java.io.DataOutput`
  s - `java.lang.String`

  returns: `int`

  throws: java.io.IOException"
  (^Integer [^java.io.DataOutput out ^java.lang.String s]
    (Text/writeString out s)))

(defn *validate-utf-8
  "Check to see if a byte array is valid utf-8

  utf-8 - the array of bytes - `byte[]`
  start - the offset of the first byte in the array - `int`
  len - the length of the byte sequence - `int`

  throws: java.nio.charset.MalformedInputException - if the byte array contains invalid bytes"
  ([utf-8 ^Integer start ^Integer len]
    (Text/validateUTF8 utf-8 start len))
  ([utf-8]
    (Text/validateUTF8 utf-8)))

(defn *bytes-to-code-point
  "Returns the next code point at the current position in
  the buffer. The buffer's position will be incremented.
  Any mark set on this buffer will be changed by this method!

  bytes - `java.nio.ByteBuffer`

  returns: `int`"
  (^Integer [^java.nio.ByteBuffer bytes]
    (Text/bytesToCodePoint bytes)))

(defn *utf-8-length
  "For the given string, returns the number of UTF-8 bytes
  required to encode the string.

  string - text to encode - `java.lang.String`

  returns: number of UTF-8 bytes required to encode - `int`"
  (^Integer [^java.lang.String string]
    (Text/utf8Length string)))

(defn get-type
  "Description copied from interface: Writable

  returns: `org.datavec.api.writable.WritableType`"
  (^org.datavec.api.writable.WritableType [^Text this]
    (-> this (.getType))))

(defn write-type
  "Description copied from interface: Writable

  out - DataOutput to write to - `java.io.DataOutput`

  throws: java.io.IOException - For errors during writing"
  ([^Text this ^java.io.DataOutput out]
    (-> this (.writeType out))))

(defn find
  "Finds any occurence of what in the backing
  buffer, starting as position start. The starting
  position is measured in bytes and the return value is in
  terms of byte position in the buffer. The backing buffer is
  not converted to a string for this operation.

  what - `java.lang.String`
  start - `int`

  returns: byte position of the first occurence of the search
  string in the UTF-8 buffer or -1 if not found - `int`"
  (^Integer [^Text this ^java.lang.String what ^Integer start]
    (-> this (.find what start)))
  (^Integer [^Text this ^java.lang.String what]
    (-> this (.find what))))

(defn read-fields
  "deserialize

  in - DataInput to deseriablize this object from. - `java.io.DataInput`

  throws: java.io.IOException"
  ([^Text this ^java.io.DataInput in]
    (-> this (.readFields in))))

(defn to-double
  "Description copied from interface: Writable

  returns: `double`"
  (^Double [^Text this]
    (-> this (.toDouble))))

(defn to-string
  "Convert text back to string

  returns: `java.lang.String`"
  (^java.lang.String [^Text this]
    (-> this (.toString))))

(defn get-bytes
  "Returns the raw bytes; however, only data up to getLength() is
  valid.

  returns: `byte[]`"
  ([^Text this]
    (-> this (.getBytes))))

(defn char-at
  "Returns the Unicode Scalar Value (32-bit integer value)
  for the character at position. Note that this
  method avoids using the converter or doing String instatiation

  position - `int`

  returns: the Unicode scalar value at position or -1
  if the position is invalid or points to a
  trailing byte - `int`"
  (^Integer [^Text this ^Integer position]
    (-> this (.charAt position))))

(defn to-float
  "Description copied from interface: Writable

  returns: `float`"
  (^Float [^Text this]
    (-> this (.toFloat))))

(defn get-length
  "Returns the number of bytes in the byte array

  returns: `int`"
  (^Integer [^Text this]
    (-> this (.getLength))))

(defn to-long
  "Description copied from interface: Writable

  returns: `long`"
  (^Long [^Text this]
    (-> this (.toLong))))

(defn append
  "Append a range of bytes to the end of the given text

  utf-8 - the data to copy from - `byte[]`
  start - the first position to append from utf8 - `int`
  len - the number of bytes to append - `int`"
  ([^Text this utf-8 ^Integer start ^Integer len]
    (-> this (.append utf-8 start len))))

(defn to-int
  "Description copied from interface: Writable

  returns: `int`"
  (^Integer [^Text this]
    (-> this (.toInt))))

(defn hash-code
  "Description copied from class: BinaryComparable

  returns: `int`"
  (^Integer [^Text this]
    (-> this (.hashCode))))

(defn set
  "Set the Text to range of bytes

  utf-8 - the data to copy from - `byte[]`
  start - the first position of the new string - `int`
  len - the number of bytes of the new string - `int`"
  ([^Text this utf-8 ^Integer start ^Integer len]
    (-> this (.set utf-8 start len)))
  ([^Text this ^java.lang.String string]
    (-> this (.set string))))

(defn clear
  "Clear the string to empty."
  ([^Text this]
    (-> this (.clear))))

(defn write
  "serialize
  write this object to out
  length uses zero-compressed encoding

  out - DataOuput to serialize this object into. - `java.io.DataOutput`

  throws: java.io.IOException"
  ([^Text this ^java.io.DataOutput out]
    (-> this (.write out))))

(defn equals
  "Returns true iff o is a Text with the same contents.

  o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Text this ^java.lang.Object o]
    (-> this (.equals o))))

