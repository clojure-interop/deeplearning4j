(ns org.datavec.api.io.DataOutputBuffer
  "A reusable DataOutput implementation that writes to an in-memory
 buffer.
 This saves memory over creating a new DataOutputStream and
 ByteArrayOutputStream each time data is written.
 Typical usage is something like the following:

  DataOutputBuffer buffer = new DataOutputBuffer();
  while (... loop condition ...) {
    buffer.reset();
    ... write buffer using DataOutput methods ...
    byte[] data = buffer.getData();
    int dataLength = buffer.getLength();
    ... write data to its ultimate destination ...
  }"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.io DataOutputBuffer]))

(defn ->data-output-buffer
  "Constructor.

  Constructs a new empty buffer."
  (^DataOutputBuffer []
    (new DataOutputBuffer ))
  (^DataOutputBuffer [^Integer size]
    (new DataOutputBuffer size)))

(defn get-data
  "Returns the current contents of the buffer.
  Data is only valid to getLength().

  returns: `byte[]`"
  ([^DataOutputBuffer this]
    (-> this (.getData))))

(defn get-length
  "Returns the length of the valid data currently in the buffer.

  returns: `int`"
  (^Integer [^DataOutputBuffer this]
    (-> this (.getLength))))

(defn reset
  "Resets the buffer to empty.

  returns: `org.datavec.api.io.DataOutputBuffer`"
  (^org.datavec.api.io.DataOutputBuffer [^DataOutputBuffer this]
    (-> this (.reset))))

(defn write
  "Writes bytes from a DataInput directly into the buffer.

  in - `java.io.DataInput`
  length - `int`

  throws: java.io.IOException"
  ([^DataOutputBuffer this ^java.io.DataInput in ^Integer length]
    (-> this (.write in length))))

(defn write-to
  "Write to a file stream

  out - `java.io.OutputStream`

  throws: java.io.IOException"
  ([^DataOutputBuffer this ^java.io.OutputStream out]
    (-> this (.writeTo out))))

