(ns org.nd4j.graph.LongTriple
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.graph LongTriple]))

(defn ->long-triple
  "Constructor."
  (^LongTriple []
    (new LongTriple )))

(defn *get-root-as-long-triple
  "bb - `java.nio.ByteBuffer`
  obj - `org.nd4j.graph.LongTriple`

  returns: `org.nd4j.graph.LongTriple`"
  (^org.nd4j.graph.LongTriple [^java.nio.ByteBuffer bb ^org.nd4j.graph.LongTriple obj]
    (LongTriple/getRootAsLongTriple bb obj))
  (^org.nd4j.graph.LongTriple [^java.nio.ByteBuffer bb]
    (LongTriple/getRootAsLongTriple bb)))

(defn *create-long-triple
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  first - `long`
  second - `long`
  third - `long`

  returns: `int`"
  (^Integer [^com.google.flatbuffers.FlatBufferBuilder builder ^Long first ^Long second ^Long third]
    (LongTriple/createLongTriple builder first second third)))

(defn *start-long-triple
  "builder - `com.google.flatbuffers.FlatBufferBuilder`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder]
    (LongTriple/startLongTriple builder)))

(defn *add-first
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  first - `long`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Long first]
    (LongTriple/addFirst builder first)))

(defn *add-second
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  second - `long`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Long second]
    (LongTriple/addSecond builder second)))

(defn *add-third
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  third - `long`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Long third]
    (LongTriple/addThird builder third)))

(defn *end-long-triple
  "builder - `com.google.flatbuffers.FlatBufferBuilder`

  returns: `int`"
  (^Integer [^com.google.flatbuffers.FlatBufferBuilder builder]
    (LongTriple/endLongTriple builder)))

(defn init
  "i - `int`
  bb - `java.nio.ByteBuffer`"
  ([^LongTriple this ^Integer i ^java.nio.ByteBuffer bb]
    (-> this (.__init i bb))))

(defn assign
  "i - `int`
  bb - `java.nio.ByteBuffer`

  returns: `org.nd4j.graph.LongTriple`"
  (^org.nd4j.graph.LongTriple [^LongTriple this ^Integer i ^java.nio.ByteBuffer bb]
    (-> this (.__assign i bb))))

(defn first
  "returns: `long`"
  (^Long [^LongTriple this]
    (-> this (.first))))

(defn second
  "returns: `long`"
  (^Long [^LongTriple this]
    (-> this (.second))))

(defn third
  "returns: `long`"
  (^Long [^LongTriple this]
    (-> this (.third))))

