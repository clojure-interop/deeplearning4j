(ns org.nd4j.graph.IntTriple
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.graph IntTriple]))

(defn ->int-triple
  "Constructor."
  (^IntTriple []
    (new IntTriple )))

(defn *get-root-as-int-triple
  "bb - `java.nio.ByteBuffer`
  obj - `org.nd4j.graph.IntTriple`

  returns: `org.nd4j.graph.IntTriple`"
  (^org.nd4j.graph.IntTriple [^java.nio.ByteBuffer bb ^org.nd4j.graph.IntTriple obj]
    (IntTriple/getRootAsIntTriple bb obj))
  (^org.nd4j.graph.IntTriple [^java.nio.ByteBuffer bb]
    (IntTriple/getRootAsIntTriple bb)))

(defn *create-int-triple
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  first - `int`
  second - `int`
  third - `int`

  returns: `int`"
  (^Integer [^com.google.flatbuffers.FlatBufferBuilder builder ^Integer first ^Integer second ^Integer third]
    (IntTriple/createIntTriple builder first second third)))

(defn *start-int-triple
  "builder - `com.google.flatbuffers.FlatBufferBuilder`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder]
    (IntTriple/startIntTriple builder)))

(defn *add-first
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  first - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer first]
    (IntTriple/addFirst builder first)))

(defn *add-second
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  second - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer second]
    (IntTriple/addSecond builder second)))

(defn *add-third
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  third - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer third]
    (IntTriple/addThird builder third)))

(defn *end-int-triple
  "builder - `com.google.flatbuffers.FlatBufferBuilder`

  returns: `int`"
  (^Integer [^com.google.flatbuffers.FlatBufferBuilder builder]
    (IntTriple/endIntTriple builder)))

(defn init
  "i - `int`
  bb - `java.nio.ByteBuffer`"
  ([^IntTriple this ^Integer i ^java.nio.ByteBuffer bb]
    (-> this (.__init i bb))))

(defn assign
  "i - `int`
  bb - `java.nio.ByteBuffer`

  returns: `org.nd4j.graph.IntTriple`"
  (^org.nd4j.graph.IntTriple [^IntTriple this ^Integer i ^java.nio.ByteBuffer bb]
    (-> this (.__assign i bb))))

(defn first
  "returns: `int`"
  (^Integer [^IntTriple this]
    (-> this (.first))))

(defn second
  "returns: `int`"
  (^Integer [^IntTriple this]
    (-> this (.second))))

(defn third
  "returns: `int`"
  (^Integer [^IntTriple this]
    (-> this (.third))))

