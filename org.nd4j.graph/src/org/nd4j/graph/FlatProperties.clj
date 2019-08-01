(ns org.nd4j.graph.FlatProperties
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.graph FlatProperties]))

(defn ->flat-properties
  "Constructor."
  (^FlatProperties []
    (new FlatProperties )))

(defn *start-a-vector
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  num-elems - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer num-elems]
    (FlatProperties/startAVector builder num-elems)))

(defn *create-l-vector
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  data - `long[]`

  returns: `int`"
  (^Integer [^com.google.flatbuffers.FlatBufferBuilder builder data]
    (FlatProperties/createLVector builder data)))

(defn *create-d-vector
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  data - `double[]`

  returns: `int`"
  (^Integer [^com.google.flatbuffers.FlatBufferBuilder builder data]
    (FlatProperties/createDVector builder data)))

(defn *create-flat-properties
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  name-offset - `int`
  i-offset - `int`
  l-offset - `int`
  d-offset - `int`
  a-offset - `int`

  returns: `int`"
  (^Integer [^com.google.flatbuffers.FlatBufferBuilder builder ^Integer name-offset ^Integer i-offset ^Integer l-offset ^Integer d-offset ^Integer a-offset]
    (FlatProperties/createFlatProperties builder name-offset i-offset l-offset d-offset a-offset)))

(defn *start-flat-properties
  "builder - `com.google.flatbuffers.FlatBufferBuilder`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder]
    (FlatProperties/startFlatProperties builder)))

(defn *add-i
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  i-offset - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer i-offset]
    (FlatProperties/addI builder i-offset)))

(defn *add-a
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  a-offset - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer a-offset]
    (FlatProperties/addA builder a-offset)))

(defn *get-root-as-flat-properties
  "bb - `java.nio.ByteBuffer`
  obj - `org.nd4j.graph.FlatProperties`

  returns: `org.nd4j.graph.FlatProperties`"
  (^org.nd4j.graph.FlatProperties [^java.nio.ByteBuffer bb ^org.nd4j.graph.FlatProperties obj]
    (FlatProperties/getRootAsFlatProperties bb obj))
  (^org.nd4j.graph.FlatProperties [^java.nio.ByteBuffer bb]
    (FlatProperties/getRootAsFlatProperties bb)))

(defn *create-i-vector
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  data - `int[]`

  returns: `int`"
  (^Integer [^com.google.flatbuffers.FlatBufferBuilder builder data]
    (FlatProperties/createIVector builder data)))

(defn *create-a-vector
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  data - `int[]`

  returns: `int`"
  (^Integer [^com.google.flatbuffers.FlatBufferBuilder builder data]
    (FlatProperties/createAVector builder data)))

(defn *add-name
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  name-offset - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer name-offset]
    (FlatProperties/addName builder name-offset)))

(defn *finish-flat-properties-buffer
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  offset - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer offset]
    (FlatProperties/finishFlatPropertiesBuffer builder offset)))

(defn *add-l
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  l-offset - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer l-offset]
    (FlatProperties/addL builder l-offset)))

(defn *add-d
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  d-offset - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer d-offset]
    (FlatProperties/addD builder d-offset)))

(defn *start-i-vector
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  num-elems - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer num-elems]
    (FlatProperties/startIVector builder num-elems)))

(defn *start-l-vector
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  num-elems - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer num-elems]
    (FlatProperties/startLVector builder num-elems)))

(defn *start-d-vector
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  num-elems - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer num-elems]
    (FlatProperties/startDVector builder num-elems)))

(defn *end-flat-properties
  "builder - `com.google.flatbuffers.FlatBufferBuilder`

  returns: `int`"
  (^Integer [^com.google.flatbuffers.FlatBufferBuilder builder]
    (FlatProperties/endFlatProperties builder)))

(defn d
  "j - `int`

  returns: `double`"
  (^Double [^FlatProperties this ^Integer j]
    (-> this (.d j))))

(defn a-length
  "returns: `int`"
  (^Integer [^FlatProperties this]
    (-> this (.aLength))))

(defn d-length
  "returns: `int`"
  (^Integer [^FlatProperties this]
    (-> this (.dLength))))

(defn init
  "i - `int`
  bb - `java.nio.ByteBuffer`"
  ([^FlatProperties this ^Integer i ^java.nio.ByteBuffer bb]
    (-> this (.__init i bb))))

(defn l-length
  "returns: `int`"
  (^Integer [^FlatProperties this]
    (-> this (.lLength))))

(defn assign
  "i - `int`
  bb - `java.nio.ByteBuffer`

  returns: `org.nd4j.graph.FlatProperties`"
  (^org.nd4j.graph.FlatProperties [^FlatProperties this ^Integer i ^java.nio.ByteBuffer bb]
    (-> this (.__assign i bb))))

(defn name
  "returns: `java.lang.String`"
  (^java.lang.String [^FlatProperties this]
    (-> this (.name))))

(defn a
  "obj - `org.nd4j.graph.FlatArray`
  j - `int`

  returns: `org.nd4j.graph.FlatArray`"
  (^org.nd4j.graph.FlatArray [^FlatProperties this ^org.nd4j.graph.FlatArray obj ^Integer j]
    (-> this (.a obj j)))
  (^org.nd4j.graph.FlatArray [^FlatProperties this ^Integer j]
    (-> this (.a j))))

(defn name-as-byte-buffer
  "returns: `java.nio.ByteBuffer`"
  (^java.nio.ByteBuffer [^FlatProperties this]
    (-> this (.nameAsByteBuffer))))

(defn d-as-byte-buffer
  "returns: `java.nio.ByteBuffer`"
  (^java.nio.ByteBuffer [^FlatProperties this]
    (-> this (.dAsByteBuffer))))

(defn i
  "j - `int`

  returns: `int`"
  (^Integer [^FlatProperties this ^Integer j]
    (-> this (.i j))))

(defn l-as-byte-buffer
  "returns: `java.nio.ByteBuffer`"
  (^java.nio.ByteBuffer [^FlatProperties this]
    (-> this (.lAsByteBuffer))))

(defn l
  "j - `int`

  returns: `long`"
  (^Long [^FlatProperties this ^Integer j]
    (-> this (.l j))))

(defn i-length
  "returns: `int`"
  (^Integer [^FlatProperties this]
    (-> this (.iLength))))

(defn i-as-byte-buffer
  "returns: `java.nio.ByteBuffer`"
  (^java.nio.ByteBuffer [^FlatProperties this]
    (-> this (.iAsByteBuffer))))

