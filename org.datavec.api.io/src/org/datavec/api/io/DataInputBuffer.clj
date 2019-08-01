(ns org.datavec.api.io.DataInputBuffer
  "A reusable DataInput implementation that reads from an in-memory
 buffer.
 This saves memory over creating a new DataInputStream and
 ByteArrayInputStream each time data is read.
 Typical usage is something like the following:

  DataInputBuffer buffer = new DataInputBuffer();
  while (... loop condition ...) {
    byte[] data = ... get data ...;
    int dataLength = ... get data length ...;
    buffer.reset(data, dataLength);
    ... read buffer using DataInput methods ...
  }"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.io DataInputBuffer]))

(defn ->data-input-buffer
  "Constructor.

  Constructs a new empty buffer."
  (^DataInputBuffer []
    (new DataInputBuffer )))

(defn reset
  "Resets the data that the buffer reads.

  input - `byte[]`
  start - `int`
  length - `int`"
  ([^DataInputBuffer this input ^Integer start ^Integer length]
    (-> this (.reset input start length)))
  ([^DataInputBuffer this input ^Integer length]
    (-> this (.reset input length))))

(defn get-data
  "returns: `byte[]`"
  ([^DataInputBuffer this]
    (-> this (.getData))))

(defn get-position
  "Returns the current position in the input.

  returns: `int`"
  (^Integer [^DataInputBuffer this]
    (-> this (.getPosition))))

(defn get-length
  "Returns the length of the input.

  returns: `int`"
  (^Integer [^DataInputBuffer this]
    (-> this (.getLength))))

