(ns org.nd4j.graph.FlatGraph
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.graph FlatGraph]))

(defn ->flat-graph
  "Constructor."
  (^FlatGraph []
    (new FlatGraph )))

(defn *start-nodes-vector
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  num-elems - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer num-elems]
    (FlatGraph/startNodesVector builder num-elems)))

(defn *finish-flat-graph-buffer
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  offset - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer offset]
    (FlatGraph/finishFlatGraphBuffer builder offset)))

(defn *get-root-as-flat-graph
  "bb - `java.nio.ByteBuffer`
  obj - `org.nd4j.graph.FlatGraph`

  returns: `org.nd4j.graph.FlatGraph`"
  (^org.nd4j.graph.FlatGraph [^java.nio.ByteBuffer bb ^org.nd4j.graph.FlatGraph obj]
    (FlatGraph/getRootAsFlatGraph bb obj))
  (^org.nd4j.graph.FlatGraph [^java.nio.ByteBuffer bb]
    (FlatGraph/getRootAsFlatGraph bb)))

(defn *create-outputs-vector
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  data - `int[]`

  returns: `int`"
  (^Integer [^com.google.flatbuffers.FlatBufferBuilder builder data]
    (FlatGraph/createOutputsVector builder data)))

(defn *add-configuration
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  configuration-offset - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer configuration-offset]
    (FlatGraph/addConfiguration builder configuration-offset)))

(defn *end-flat-graph
  "builder - `com.google.flatbuffers.FlatBufferBuilder`

  returns: `int`"
  (^Integer [^com.google.flatbuffers.FlatBufferBuilder builder]
    (FlatGraph/endFlatGraph builder)))

(defn *add-nodes
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  nodes-offset - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer nodes-offset]
    (FlatGraph/addNodes builder nodes-offset)))

(defn *start-outputs-vector
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  num-elems - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer num-elems]
    (FlatGraph/startOutputsVector builder num-elems)))

(defn *add-id
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  id - `long`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Long id]
    (FlatGraph/addId builder id)))

(defn *create-flat-graph
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  id - `long`
  variables-offset - `int`
  nodes-offset - `int`
  outputs-offset - `int`
  configuration-offset - `int`

  returns: `int`"
  (^Integer [^com.google.flatbuffers.FlatBufferBuilder builder ^Long id ^Integer variables-offset ^Integer nodes-offset ^Integer outputs-offset ^Integer configuration-offset]
    (FlatGraph/createFlatGraph builder id variables-offset nodes-offset outputs-offset configuration-offset)))

(defn *create-variables-vector
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  data - `int[]`

  returns: `int`"
  (^Integer [^com.google.flatbuffers.FlatBufferBuilder builder data]
    (FlatGraph/createVariablesVector builder data)))

(defn *start-flat-graph
  "builder - `com.google.flatbuffers.FlatBufferBuilder`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder]
    (FlatGraph/startFlatGraph builder)))

(defn *create-nodes-vector
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  data - `int[]`

  returns: `int`"
  (^Integer [^com.google.flatbuffers.FlatBufferBuilder builder data]
    (FlatGraph/createNodesVector builder data)))

(defn *add-outputs
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  outputs-offset - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer outputs-offset]
    (FlatGraph/addOutputs builder outputs-offset)))

(defn *start-variables-vector
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  num-elems - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer num-elems]
    (FlatGraph/startVariablesVector builder num-elems)))

(defn *add-variables
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  variables-offset - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer variables-offset]
    (FlatGraph/addVariables builder variables-offset)))

(defn outputs-length
  "returns: `int`"
  (^Integer [^FlatGraph this]
    (-> this (.outputsLength))))

(defn variables-length
  "returns: `int`"
  (^Integer [^FlatGraph this]
    (-> this (.variablesLength))))

(defn init
  "i - `int`
  bb - `java.nio.ByteBuffer`"
  ([^FlatGraph this ^Integer i ^java.nio.ByteBuffer bb]
    (-> this (.__init i bb))))

(defn id
  "returns: `long`"
  (^Long [^FlatGraph this]
    (-> this (.id))))

(defn configuration
  "obj - `org.nd4j.graph.FlatConfiguration`

  returns: `org.nd4j.graph.FlatConfiguration`"
  (^org.nd4j.graph.FlatConfiguration [^FlatGraph this ^org.nd4j.graph.FlatConfiguration obj]
    (-> this (.configuration obj)))
  (^org.nd4j.graph.FlatConfiguration [^FlatGraph this]
    (-> this (.configuration))))

(defn assign
  "i - `int`
  bb - `java.nio.ByteBuffer`

  returns: `org.nd4j.graph.FlatGraph`"
  (^org.nd4j.graph.FlatGraph [^FlatGraph this ^Integer i ^java.nio.ByteBuffer bb]
    (-> this (.__assign i bb))))

(defn outputs
  "obj - `org.nd4j.graph.IntPair`
  j - `int`

  returns: `org.nd4j.graph.IntPair`"
  (^org.nd4j.graph.IntPair [^FlatGraph this ^org.nd4j.graph.IntPair obj ^Integer j]
    (-> this (.outputs obj j)))
  (^org.nd4j.graph.IntPair [^FlatGraph this ^Integer j]
    (-> this (.outputs j))))

(defn variables
  "obj - `org.nd4j.graph.FlatVariable`
  j - `int`

  returns: `org.nd4j.graph.FlatVariable`"
  (^org.nd4j.graph.FlatVariable [^FlatGraph this ^org.nd4j.graph.FlatVariable obj ^Integer j]
    (-> this (.variables obj j)))
  (^org.nd4j.graph.FlatVariable [^FlatGraph this ^Integer j]
    (-> this (.variables j))))

(defn nodes
  "obj - `org.nd4j.graph.FlatNode`
  j - `int`

  returns: `org.nd4j.graph.FlatNode`"
  (^org.nd4j.graph.FlatNode [^FlatGraph this ^org.nd4j.graph.FlatNode obj ^Integer j]
    (-> this (.nodes obj j)))
  (^org.nd4j.graph.FlatNode [^FlatGraph this ^Integer j]
    (-> this (.nodes j))))

(defn nodes-length
  "returns: `int`"
  (^Integer [^FlatGraph this]
    (-> this (.nodesLength))))

