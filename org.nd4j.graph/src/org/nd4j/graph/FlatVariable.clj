(ns org.nd4j.graph.FlatVariable
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.graph FlatVariable]))

(defn ->flat-variable
  "Constructor."
  (^FlatVariable []
    (new FlatVariable )))

(defn *create-flat-variable
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  id-offset - `int`
  name-offset - `int`
  shape-offset - `int`
  ndarray-offset - `int`
  device - `int`

  returns: `int`"
  (^Integer [^com.google.flatbuffers.FlatBufferBuilder builder ^Integer id-offset ^Integer name-offset ^Integer shape-offset ^Integer ndarray-offset ^Integer device]
    (FlatVariable/createFlatVariable builder id-offset name-offset shape-offset ndarray-offset device)))

(defn *start-shape-vector
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  num-elems - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer num-elems]
    (FlatVariable/startShapeVector builder num-elems)))

(defn *add-name
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  name-offset - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer name-offset]
    (FlatVariable/addName builder name-offset)))

(defn *get-root-as-flat-variable
  "bb - `java.nio.ByteBuffer`
  obj - `org.nd4j.graph.FlatVariable`

  returns: `org.nd4j.graph.FlatVariable`"
  (^org.nd4j.graph.FlatVariable [^java.nio.ByteBuffer bb ^org.nd4j.graph.FlatVariable obj]
    (FlatVariable/getRootAsFlatVariable bb obj))
  (^org.nd4j.graph.FlatVariable [^java.nio.ByteBuffer bb]
    (FlatVariable/getRootAsFlatVariable bb)))

(defn *add-id
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  id-offset - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer id-offset]
    (FlatVariable/addId builder id-offset)))

(defn *add-ndarray
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  ndarray-offset - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer ndarray-offset]
    (FlatVariable/addNdarray builder ndarray-offset)))

(defn *create-shape-vector
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  data - `long[]`

  returns: `int`"
  (^Integer [^com.google.flatbuffers.FlatBufferBuilder builder data]
    (FlatVariable/createShapeVector builder data)))

(defn *finish-flat-variable-buffer
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  offset - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer offset]
    (FlatVariable/finishFlatVariableBuffer builder offset)))

(defn *end-flat-variable
  "builder - `com.google.flatbuffers.FlatBufferBuilder`

  returns: `int`"
  (^Integer [^com.google.flatbuffers.FlatBufferBuilder builder]
    (FlatVariable/endFlatVariable builder)))

(defn *start-flat-variable
  "builder - `com.google.flatbuffers.FlatBufferBuilder`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder]
    (FlatVariable/startFlatVariable builder)))

(defn *add-device
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  device - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer device]
    (FlatVariable/addDevice builder device)))

(defn *add-shape
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  shape-offset - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer shape-offset]
    (FlatVariable/addShape builder shape-offset)))

(defn device
  "returns: `int`"
  (^Integer [^FlatVariable this]
    (-> this (.device))))

(defn shape-as-byte-buffer
  "returns: `java.nio.ByteBuffer`"
  (^java.nio.ByteBuffer [^FlatVariable this]
    (-> this (.shapeAsByteBuffer))))

(defn shape
  "j - `int`

  returns: `long`"
  (^Long [^FlatVariable this ^Integer j]
    (-> this (.shape j))))

(defn init
  "i - `int`
  bb - `java.nio.ByteBuffer`"
  ([^FlatVariable this ^Integer i ^java.nio.ByteBuffer bb]
    (-> this (.__init i bb))))

(defn id
  "obj - `org.nd4j.graph.IntPair`

  returns: `org.nd4j.graph.IntPair`"
  (^org.nd4j.graph.IntPair [^FlatVariable this ^org.nd4j.graph.IntPair obj]
    (-> this (.id obj)))
  (^org.nd4j.graph.IntPair [^FlatVariable this]
    (-> this (.id))))

(defn assign
  "i - `int`
  bb - `java.nio.ByteBuffer`

  returns: `org.nd4j.graph.FlatVariable`"
  (^org.nd4j.graph.FlatVariable [^FlatVariable this ^Integer i ^java.nio.ByteBuffer bb]
    (-> this (.__assign i bb))))

(defn ndarray
  "obj - `org.nd4j.graph.FlatArray`

  returns: `org.nd4j.graph.FlatArray`"
  (^org.nd4j.graph.FlatArray [^FlatVariable this ^org.nd4j.graph.FlatArray obj]
    (-> this (.ndarray obj)))
  (^org.nd4j.graph.FlatArray [^FlatVariable this]
    (-> this (.ndarray))))

(defn name
  "returns: `java.lang.String`"
  (^java.lang.String [^FlatVariable this]
    (-> this (.name))))

(defn name-as-byte-buffer
  "returns: `java.nio.ByteBuffer`"
  (^java.nio.ByteBuffer [^FlatVariable this]
    (-> this (.nameAsByteBuffer))))

(defn shape-length
  "returns: `int`"
  (^Integer [^FlatVariable this]
    (-> this (.shapeLength))))

