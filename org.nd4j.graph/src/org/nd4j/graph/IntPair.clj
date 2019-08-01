(ns org.nd4j.graph.IntPair
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.graph IntPair]))

(defn ->int-pair
  "Constructor."
  (^IntPair []
    (new IntPair )))

(defn *get-root-as-int-pair
  "bb - `java.nio.ByteBuffer`
  obj - `org.nd4j.graph.IntPair`

  returns: `org.nd4j.graph.IntPair`"
  (^org.nd4j.graph.IntPair [^java.nio.ByteBuffer bb ^org.nd4j.graph.IntPair obj]
    (IntPair/getRootAsIntPair bb obj))
  (^org.nd4j.graph.IntPair [^java.nio.ByteBuffer bb]
    (IntPair/getRootAsIntPair bb)))

(defn *create-int-pair
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  first - `int`
  second - `int`

  returns: `int`"
  (^Integer [^com.google.flatbuffers.FlatBufferBuilder builder ^Integer first ^Integer second]
    (IntPair/createIntPair builder first second)))

(defn *start-int-pair
  "builder - `com.google.flatbuffers.FlatBufferBuilder`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder]
    (IntPair/startIntPair builder)))

(defn *add-first
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  first - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer first]
    (IntPair/addFirst builder first)))

(defn *add-second
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  second - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer second]
    (IntPair/addSecond builder second)))

(defn *end-int-pair
  "builder - `com.google.flatbuffers.FlatBufferBuilder`

  returns: `int`"
  (^Integer [^com.google.flatbuffers.FlatBufferBuilder builder]
    (IntPair/endIntPair builder)))

(defn init
  "i - `int`
  bb - `java.nio.ByteBuffer`"
  ([^IntPair this ^Integer i ^java.nio.ByteBuffer bb]
    (-> this (.__init i bb))))

(defn assign
  "i - `int`
  bb - `java.nio.ByteBuffer`

  returns: `org.nd4j.graph.IntPair`"
  (^org.nd4j.graph.IntPair [^IntPair this ^Integer i ^java.nio.ByteBuffer bb]
    (-> this (.__assign i bb))))

(defn first
  "returns: `int`"
  (^Integer [^IntPair this]
    (-> this (.first))))

(defn second
  "returns: `int`"
  (^Integer [^IntPair this]
    (-> this (.second))))

