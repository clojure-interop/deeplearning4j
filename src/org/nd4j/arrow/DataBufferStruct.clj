(ns org.nd4j.arrow.DataBufferStruct
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.arrow DataBufferStruct]))

(defn ->data-buffer-struct
  "Constructor.

  byte-buffer - `java.nio.ByteBuffer`
  offset - `int`"
  (^DataBufferStruct [^java.nio.ByteBuffer byte-buffer ^Integer offset]
    (new DataBufferStruct byte-buffer offset))
  (^DataBufferStruct [^org.nd4j.linalg.api.buffer.DataBuffer data-buffer]
    (new DataBufferStruct data-buffer)))

(defn *create-from-byte-buffer
  "Create a DataBuffer from a
  byte buffer. This is meant to be used with flatbuffers

  bb - the flat buffers buffer - `java.nio.ByteBuffer`
  bb-pos - the position to start from - `int`
  type - the type of buffer to create - `org.nd4j.linalg.api.buffer.DataBuffer$Type`
  length - the length of the buffer to create - `int`

  returns: the created databuffer - `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^java.nio.ByteBuffer bb ^Integer bb-pos ^org.nd4j.linalg.api.buffer.DataBuffer$Type type ^Integer length]
    (DataBufferStruct/createFromByteBuffer bb bb-pos type length)))

(defn *create-data-buffer-struct
  "Create a data buffer struct within
  the passed in FlatBufferBuilder

  buffer-builder - the existing flatbufferto use to serialize the DataBuffer - `com.google.flatbuffers.FlatBufferBuilder`
  create - the databuffer to serialize - `org.nd4j.linalg.api.buffer.DataBuffer`

  returns: an int representing the offset of the buffer - `int`"
  (^Integer [^com.google.flatbuffers.FlatBufferBuilder buffer-builder ^org.nd4j.linalg.api.buffer.DataBuffer create]
    (DataBufferStruct/createDataBufferStruct buffer-builder create)))

(defn init
  "i - `int`
  bb - `java.nio.ByteBuffer`"
  ([^DataBufferStruct this ^Integer i ^java.nio.ByteBuffer bb]
    (-> this (.__init i bb))))

(defn assign
  "i - `int`
  bb - `java.nio.ByteBuffer`

  returns: `org.nd4j.arrow.DataBufferStruct`"
  (^org.nd4j.arrow.DataBufferStruct [^DataBufferStruct this ^Integer i ^java.nio.ByteBuffer bb]
    (-> this (.__assign i bb))))

