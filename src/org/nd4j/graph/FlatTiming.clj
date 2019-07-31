(ns org.nd4j.graph.FlatTiming
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.graph FlatTiming]))

(defn ->flat-timing
  "Constructor."
  (^FlatTiming []
    (new FlatTiming )))

(defn *get-root-as-flat-timing
  "bb - `java.nio.ByteBuffer`
  obj - `org.nd4j.graph.FlatTiming`

  returns: `org.nd4j.graph.FlatTiming`"
  (^org.nd4j.graph.FlatTiming [^java.nio.ByteBuffer bb ^org.nd4j.graph.FlatTiming obj]
    (FlatTiming/getRootAsFlatTiming bb obj))
  (^org.nd4j.graph.FlatTiming [^java.nio.ByteBuffer bb]
    (FlatTiming/getRootAsFlatTiming bb)))

(defn *create-flat-timing
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  id - `int`
  name-offset - `int`
  timing-offset - `int`

  returns: `int`"
  (^Integer [^com.google.flatbuffers.FlatBufferBuilder builder ^Integer id ^Integer name-offset ^Integer timing-offset]
    (FlatTiming/createFlatTiming builder id name-offset timing-offset)))

(defn *start-flat-timing
  "builder - `com.google.flatbuffers.FlatBufferBuilder`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder]
    (FlatTiming/startFlatTiming builder)))

(defn *add-id
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  id - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer id]
    (FlatTiming/addId builder id)))

(defn *add-name
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  name-offset - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer name-offset]
    (FlatTiming/addName builder name-offset)))

(defn *add-timing
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  timing-offset - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer timing-offset]
    (FlatTiming/addTiming builder timing-offset)))

(defn *end-flat-timing
  "builder - `com.google.flatbuffers.FlatBufferBuilder`

  returns: `int`"
  (^Integer [^com.google.flatbuffers.FlatBufferBuilder builder]
    (FlatTiming/endFlatTiming builder)))

(defn init
  "i - `int`
  bb - `java.nio.ByteBuffer`"
  ([^FlatTiming this ^Integer i ^java.nio.ByteBuffer bb]
    (-> this (.__init i bb))))

(defn assign
  "i - `int`
  bb - `java.nio.ByteBuffer`

  returns: `org.nd4j.graph.FlatTiming`"
  (^org.nd4j.graph.FlatTiming [^FlatTiming this ^Integer i ^java.nio.ByteBuffer bb]
    (-> this (.__assign i bb))))

(defn id
  "returns: `int`"
  (^Integer [^FlatTiming this]
    (-> this (.id))))

(defn name
  "returns: `java.lang.String`"
  (^java.lang.String [^FlatTiming this]
    (-> this (.name))))

(defn name-as-byte-buffer
  "returns: `java.nio.ByteBuffer`"
  (^java.nio.ByteBuffer [^FlatTiming this]
    (-> this (.nameAsByteBuffer))))

(defn timing
  "obj - `org.nd4j.graph.LongPair`

  returns: `org.nd4j.graph.LongPair`"
  (^org.nd4j.graph.LongPair [^FlatTiming this ^org.nd4j.graph.LongPair obj]
    (-> this (.timing obj)))
  (^org.nd4j.graph.LongPair [^FlatTiming this]
    (-> this (.timing))))

