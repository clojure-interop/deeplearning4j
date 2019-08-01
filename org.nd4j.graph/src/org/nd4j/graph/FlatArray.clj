(ns org.nd4j.graph.FlatArray
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.graph FlatArray]))

(defn ->flat-array
  "Constructor."
  (^FlatArray []
    (new FlatArray )))

(defn *create-flat-array
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  shape-offset - `int`
  buffer-offset - `int`
  dtype - `byte`
  byte-order - `byte`

  returns: `int`"
  (^Integer [^com.google.flatbuffers.FlatBufferBuilder builder ^Integer shape-offset ^Integer buffer-offset ^Byte dtype ^Byte byte-order]
    (FlatArray/createFlatArray builder shape-offset buffer-offset dtype byte-order)))

(defn *start-buffer-vector
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  num-elems - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer num-elems]
    (FlatArray/startBufferVector builder num-elems)))

(defn *create-buffer-vector
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  data - `byte[]`

  returns: `int`"
  (^Integer [^com.google.flatbuffers.FlatBufferBuilder builder data]
    (FlatArray/createBufferVector builder data)))

(defn *start-shape-vector
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  num-elems - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer num-elems]
    (FlatArray/startShapeVector builder num-elems)))

(defn *get-root-as-flat-array
  "bb - `java.nio.ByteBuffer`
  obj - `org.nd4j.graph.FlatArray`

  returns: `org.nd4j.graph.FlatArray`"
  (^org.nd4j.graph.FlatArray [^java.nio.ByteBuffer bb ^org.nd4j.graph.FlatArray obj]
    (FlatArray/getRootAsFlatArray bb obj))
  (^org.nd4j.graph.FlatArray [^java.nio.ByteBuffer bb]
    (FlatArray/getRootAsFlatArray bb)))

(defn *add-byte-order
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  byte-order - `byte`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Byte byte-order]
    (FlatArray/addByteOrder builder byte-order)))

(defn *create-shape-vector
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  data - `long[]`

  returns: `int`"
  (^Integer [^com.google.flatbuffers.FlatBufferBuilder builder data]
    (FlatArray/createShapeVector builder data)))

(defn *start-flat-array
  "builder - `com.google.flatbuffers.FlatBufferBuilder`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder]
    (FlatArray/startFlatArray builder)))

(defn *end-flat-array
  "builder - `com.google.flatbuffers.FlatBufferBuilder`

  returns: `int`"
  (^Integer [^com.google.flatbuffers.FlatBufferBuilder builder]
    (FlatArray/endFlatArray builder)))

(defn *add-buffer
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  buffer-offset - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer buffer-offset]
    (FlatArray/addBuffer builder buffer-offset)))

(defn *add-shape
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  shape-offset - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer shape-offset]
    (FlatArray/addShape builder shape-offset)))

(defn *add-dtype
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  dtype - `byte`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Byte dtype]
    (FlatArray/addDtype builder dtype)))

(defn *finish-flat-array-buffer
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  offset - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer offset]
    (FlatArray/finishFlatArrayBuffer builder offset)))

(defn shape-as-byte-buffer
  "returns: `java.nio.ByteBuffer`"
  (^java.nio.ByteBuffer [^FlatArray this]
    (-> this (.shapeAsByteBuffer))))

(defn shape
  "j - `int`

  returns: `long`"
  (^Long [^FlatArray this ^Integer j]
    (-> this (.shape j))))

(defn byte-order
  "returns: `byte`"
  (^Byte [^FlatArray this]
    (-> this (.byteOrder))))

(defn init
  "i - `int`
  bb - `java.nio.ByteBuffer`"
  ([^FlatArray this ^Integer i ^java.nio.ByteBuffer bb]
    (-> this (.__init i bb))))

(defn buffer-as-byte-buffer
  "returns: `java.nio.ByteBuffer`"
  (^java.nio.ByteBuffer [^FlatArray this]
    (-> this (.bufferAsByteBuffer))))

(defn assign
  "i - `int`
  bb - `java.nio.ByteBuffer`

  returns: `org.nd4j.graph.FlatArray`"
  (^org.nd4j.graph.FlatArray [^FlatArray this ^Integer i ^java.nio.ByteBuffer bb]
    (-> this (.__assign i bb))))

(defn buffer
  "j - `int`

  returns: `byte`"
  (^Byte [^FlatArray this ^Integer j]
    (-> this (.buffer j))))

(defn buffer-length
  "returns: `int`"
  (^Integer [^FlatArray this]
    (-> this (.bufferLength))))

(defn shape-length
  "returns: `int`"
  (^Integer [^FlatArray this]
    (-> this (.shapeLength))))

(defn dtype
  "returns: `byte`"
  (^Byte [^FlatArray this]
    (-> this (.dtype))))

