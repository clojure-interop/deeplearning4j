(ns org.nd4j.graph.FlatResult
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.graph FlatResult]))

(defn ->flat-result
  "Constructor."
  (^FlatResult []
    (new FlatResult )))

(defn *add-footprint-forward
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  footprint-forward - `long`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Long footprint-forward]
    (FlatResult/addFootprintForward builder footprint-forward)))

(defn *add-footprint-backward
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  footprint-backward - `long`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Long footprint-backward]
    (FlatResult/addFootprintBackward builder footprint-backward)))

(defn *end-flat-result
  "builder - `com.google.flatbuffers.FlatBufferBuilder`

  returns: `int`"
  (^Integer [^com.google.flatbuffers.FlatBufferBuilder builder]
    (FlatResult/endFlatResult builder)))

(defn *get-root-as-flat-result
  "bb - `java.nio.ByteBuffer`
  obj - `org.nd4j.graph.FlatResult`

  returns: `org.nd4j.graph.FlatResult`"
  (^org.nd4j.graph.FlatResult [^java.nio.ByteBuffer bb ^org.nd4j.graph.FlatResult obj]
    (FlatResult/getRootAsFlatResult bb obj))
  (^org.nd4j.graph.FlatResult [^java.nio.ByteBuffer bb]
    (FlatResult/getRootAsFlatResult bb)))

(defn *add-timing
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  timing-offset - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer timing-offset]
    (FlatResult/addTiming builder timing-offset)))

(defn *add-id
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  id - `long`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Long id]
    (FlatResult/addId builder id)))

(defn *start-timing-vector
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  num-elems - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer num-elems]
    (FlatResult/startTimingVector builder num-elems)))

(defn *start-flat-result
  "builder - `com.google.flatbuffers.FlatBufferBuilder`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder]
    (FlatResult/startFlatResult builder)))

(defn *create-flat-result
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  id - `long`
  variables-offset - `int`
  timing-offset - `int`
  footprint-forward - `long`
  footprint-backward - `long`

  returns: `int`"
  (^Integer [^com.google.flatbuffers.FlatBufferBuilder builder ^Long id ^Integer variables-offset ^Integer timing-offset ^Long footprint-forward ^Long footprint-backward]
    (FlatResult/createFlatResult builder id variables-offset timing-offset footprint-forward footprint-backward)))

(defn *create-variables-vector
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  data - `int[]`

  returns: `int`"
  (^Integer [^com.google.flatbuffers.FlatBufferBuilder builder data]
    (FlatResult/createVariablesVector builder data)))

(defn *finish-flat-result-buffer
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  offset - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer offset]
    (FlatResult/finishFlatResultBuffer builder offset)))

(defn *create-timing-vector
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  data - `int[]`

  returns: `int`"
  (^Integer [^com.google.flatbuffers.FlatBufferBuilder builder data]
    (FlatResult/createTimingVector builder data)))

(defn *start-variables-vector
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  num-elems - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer num-elems]
    (FlatResult/startVariablesVector builder num-elems)))

(defn *add-variables
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  variables-offset - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer variables-offset]
    (FlatResult/addVariables builder variables-offset)))

(defn variables-length
  "returns: `int`"
  (^Integer [^FlatResult this]
    (-> this (.variablesLength))))

(defn footprint-backward
  "returns: `long`"
  (^Long [^FlatResult this]
    (-> this (.footprintBackward))))

(defn init
  "i - `int`
  bb - `java.nio.ByteBuffer`"
  ([^FlatResult this ^Integer i ^java.nio.ByteBuffer bb]
    (-> this (.__init i bb))))

(defn timing-length
  "returns: `int`"
  (^Integer [^FlatResult this]
    (-> this (.timingLength))))

(defn id
  "returns: `long`"
  (^Long [^FlatResult this]
    (-> this (.id))))

(defn assign
  "i - `int`
  bb - `java.nio.ByteBuffer`

  returns: `org.nd4j.graph.FlatResult`"
  (^org.nd4j.graph.FlatResult [^FlatResult this ^Integer i ^java.nio.ByteBuffer bb]
    (-> this (.__assign i bb))))

(defn variables
  "obj - `org.nd4j.graph.FlatVariable`
  j - `int`

  returns: `org.nd4j.graph.FlatVariable`"
  (^org.nd4j.graph.FlatVariable [^FlatResult this ^org.nd4j.graph.FlatVariable obj ^Integer j]
    (-> this (.variables obj j)))
  (^org.nd4j.graph.FlatVariable [^FlatResult this ^Integer j]
    (-> this (.variables j))))

(defn footprint-forward
  "returns: `long`"
  (^Long [^FlatResult this]
    (-> this (.footprintForward))))

(defn timing
  "obj - `org.nd4j.graph.FlatTiming`
  j - `int`

  returns: `org.nd4j.graph.FlatTiming`"
  (^org.nd4j.graph.FlatTiming [^FlatResult this ^org.nd4j.graph.FlatTiming obj ^Integer j]
    (-> this (.timing obj j)))
  (^org.nd4j.graph.FlatTiming [^FlatResult this ^Integer j]
    (-> this (.timing j))))

