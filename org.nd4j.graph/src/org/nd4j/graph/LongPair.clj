(ns org.nd4j.graph.LongPair
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.graph LongPair]))

(defn ->long-pair
  "Constructor."
  (^LongPair []
    (new LongPair )))

(defn *get-root-as-long-pair
  "bb - `java.nio.ByteBuffer`
  obj - `org.nd4j.graph.LongPair`

  returns: `org.nd4j.graph.LongPair`"
  (^org.nd4j.graph.LongPair [^java.nio.ByteBuffer bb ^org.nd4j.graph.LongPair obj]
    (LongPair/getRootAsLongPair bb obj))
  (^org.nd4j.graph.LongPair [^java.nio.ByteBuffer bb]
    (LongPair/getRootAsLongPair bb)))

(defn *create-long-pair
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  first - `long`
  second - `long`

  returns: `int`"
  (^Integer [^com.google.flatbuffers.FlatBufferBuilder builder ^Long first ^Long second]
    (LongPair/createLongPair builder first second)))

(defn *start-long-pair
  "builder - `com.google.flatbuffers.FlatBufferBuilder`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder]
    (LongPair/startLongPair builder)))

(defn *add-first
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  first - `long`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Long first]
    (LongPair/addFirst builder first)))

(defn *add-second
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  second - `long`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Long second]
    (LongPair/addSecond builder second)))

(defn *end-long-pair
  "builder - `com.google.flatbuffers.FlatBufferBuilder`

  returns: `int`"
  (^Integer [^com.google.flatbuffers.FlatBufferBuilder builder]
    (LongPair/endLongPair builder)))

(defn init
  "i - `int`
  bb - `java.nio.ByteBuffer`"
  ([^LongPair this ^Integer i ^java.nio.ByteBuffer bb]
    (-> this (.__init i bb))))

(defn assign
  "i - `int`
  bb - `java.nio.ByteBuffer`

  returns: `org.nd4j.graph.LongPair`"
  (^org.nd4j.graph.LongPair [^LongPair this ^Integer i ^java.nio.ByteBuffer bb]
    (-> this (.__assign i bb))))

(defn first
  "returns: `long`"
  (^Long [^LongPair this]
    (-> this (.first))))

(defn second
  "returns: `long`"
  (^Long [^LongPair this]
    (-> this (.second))))

