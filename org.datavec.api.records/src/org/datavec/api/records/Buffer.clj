(ns org.datavec.api.records.Buffer
  "A byte sequence that is used as a Java native type for buffer.
 It is resizable and distinguishes between the count of the sequence and
 the current capacity."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.records Buffer]))

(defn ->buffer
  "Constructor.

  Create a Buffer using the byte range as the initial value.

  bytes - Copy of this array becomes the backing storage for the object. - `byte[]`
  offset - offset into byte array - `int`
  length - length of data - `int`"
  (^Buffer [bytes ^Integer offset ^Integer length]
    (new Buffer bytes offset length))
  (^Buffer [bytes]
    (new Buffer bytes))
  (^Buffer []
    (new Buffer )))

(defn get-count
  "Get the current count of the buffer.

  returns: `int`"
  (^Integer [^Buffer this]
    (-> this (.getCount))))

(defn copy
  "Copy the specified byte array to the Buffer. Replaces the current buffer.

  bytes - byte array to be assigned - `byte[]`
  offset - offset into byte array - `int`
  length - length of data - `int`"
  ([^Buffer this bytes ^Integer offset ^Integer length]
    (-> this (.copy bytes offset length))))

(defn to-string
  "Convert the byte buffer to a string an specific character encoding

  charset-name - Valid Java Character Set Name - `java.lang.String`

  returns: `java.lang.String`

  throws: java.io.UnsupportedEncodingException"
  (^java.lang.String [^Buffer this ^java.lang.String charset-name]
    (-> this (.toString charset-name)))
  (^java.lang.String [^Buffer this]
    (-> this (.toString))))

(defn reset
  "Reset the buffer to 0 size"
  ([^Buffer this]
    (-> this (.reset))))

(defn get-capacity
  "Get the capacity, which is the maximum count that could handled without
  resizing the backing storage.

  returns: The number of bytes - `int`"
  (^Integer [^Buffer this]
    (-> this (.getCapacity))))

(defn set-capacity
  "Change the capacity of the backing storage.
  The data is preserved if newCapacity >= getCount().

  new-capacity - The new capacity in bytes. - `int`"
  ([^Buffer this ^Integer new-capacity]
    (-> this (.setCapacity new-capacity))))

(defn truncate
  "Change the capacity of the backing store to be the same as the current
  count of buffer."
  ([^Buffer this]
    (-> this (.truncate))))

(defn append
  "Append specified bytes to the buffer.

  bytes - byte array to be appended - `byte[]`
  offset - offset into byte array - `int`
  length - length of data - `int`"
  ([^Buffer this bytes ^Integer offset ^Integer length]
    (-> this (.append bytes offset length)))
  ([^Buffer this bytes]
    (-> this (.append bytes))))

(defn clone
  "returns: `java.lang.Object`

  throws: java.lang.CloneNotSupportedException"
  (^java.lang.Object [^Buffer this]
    (-> this (.clone))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Buffer this]
    (-> this (.hashCode))))

(defn set
  "Use the specified bytes array as underlying sequence.

  bytes - byte sequence - `byte[]`"
  ([^Buffer this bytes]
    (-> this (.set bytes))))

(defn compare-to
  "Define the sort order of the Buffer.

  other - The other buffer - `java.lang.Object`

  returns: Positive if this is bigger than other, 0 if they are equal, and
  negative if this is smaller than other. - `int`"
  (^Integer [^Buffer this ^java.lang.Object other]
    (-> this (.compareTo other))))

(defn get
  "Get the data from the Buffer.

  returns: The data is only valid between 0 and getCount() - 1. - `byte[]`"
  ([^Buffer this]
    (-> this (.get))))

(defn equals
  "other - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Buffer this ^java.lang.Object other]
    (-> this (.equals other))))

