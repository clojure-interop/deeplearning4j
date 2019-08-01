(ns org.nd4j.graph.FlatNode
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.graph FlatNode]))

(defn ->flat-node
  "Constructor."
  (^FlatNode []
    (new FlatNode )))

(defn *start-dimensions-vector
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  num-elems - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer num-elems]
    (FlatNode/startDimensionsVector builder num-elems)))

(defn *create-flat-node
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  id - `int`
  name-offset - `int`
  op-type - `byte`
  op-num - `long`
  properties-offset - `int`
  input-offset - `int`
  input-paired-offset - `int`
  data-type - `byte`
  output-offset - `int`
  extra-params-offset - `int`
  extra-integer-offset - `int`
  dimensions-offset - `int`
  device - `int`
  scalar - `float`
  scope-id - `int`
  scope-name-offset - `int`

  returns: `int`"
  (^Integer [^com.google.flatbuffers.FlatBufferBuilder builder ^Integer id ^Integer name-offset ^Byte op-type ^Long op-num ^Integer properties-offset ^Integer input-offset ^Integer input-paired-offset ^Byte data-type ^Integer output-offset ^Integer extra-params-offset ^Integer extra-integer-offset ^Integer dimensions-offset ^Integer device ^Float scalar ^Integer scope-id ^Integer scope-name-offset]
    (FlatNode/createFlatNode builder id name-offset op-type op-num properties-offset input-offset input-paired-offset data-type output-offset extra-params-offset extra-integer-offset dimensions-offset device scalar scope-id scope-name-offset)))

(defn *start-output-vector
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  num-elems - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer num-elems]
    (FlatNode/startOutputVector builder num-elems)))

(defn *add-extra-params
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  extra-params-offset - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer extra-params-offset]
    (FlatNode/addExtraParams builder extra-params-offset)))

(defn *end-flat-node
  "builder - `com.google.flatbuffers.FlatBufferBuilder`

  returns: `int`"
  (^Integer [^com.google.flatbuffers.FlatBufferBuilder builder]
    (FlatNode/endFlatNode builder)))

(defn *add-input-paired
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  input-paired-offset - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer input-paired-offset]
    (FlatNode/addInputPaired builder input-paired-offset)))

(defn *finish-flat-node-buffer
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  offset - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer offset]
    (FlatNode/finishFlatNodeBuffer builder offset)))

(defn *add-name
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  name-offset - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer name-offset]
    (FlatNode/addName builder name-offset)))

(defn *start-extra-params-vector
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  num-elems - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer num-elems]
    (FlatNode/startExtraParamsVector builder num-elems)))

(defn *add-data-type
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  data-type - `byte`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Byte data-type]
    (FlatNode/addDataType builder data-type)))

(defn *add-scope-name
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  scope-name-offset - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer scope-name-offset]
    (FlatNode/addScopeName builder scope-name-offset)))

(defn *start-properties-vector
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  num-elems - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer num-elems]
    (FlatNode/startPropertiesVector builder num-elems)))

(defn *add-id
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  id - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer id]
    (FlatNode/addId builder id)))

(defn *add-properties
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  properties-offset - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer properties-offset]
    (FlatNode/addProperties builder properties-offset)))

(defn *start-input-vector
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  num-elems - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer num-elems]
    (FlatNode/startInputVector builder num-elems)))

(defn *start-input-paired-vector
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  num-elems - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer num-elems]
    (FlatNode/startInputPairedVector builder num-elems)))

(defn *add-scope-id
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  scope-id - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer scope-id]
    (FlatNode/addScopeId builder scope-id)))

(defn *create-properties-vector
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  data - `int[]`

  returns: `int`"
  (^Integer [^com.google.flatbuffers.FlatBufferBuilder builder data]
    (FlatNode/createPropertiesVector builder data)))

(defn *create-output-vector
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  data - `int[]`

  returns: `int`"
  (^Integer [^com.google.flatbuffers.FlatBufferBuilder builder data]
    (FlatNode/createOutputVector builder data)))

(defn *create-input-vector
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  data - `int[]`

  returns: `int`"
  (^Integer [^com.google.flatbuffers.FlatBufferBuilder builder data]
    (FlatNode/createInputVector builder data)))

(defn *create-extra-integer-vector
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  data - `long[]`

  returns: `int`"
  (^Integer [^com.google.flatbuffers.FlatBufferBuilder builder data]
    (FlatNode/createExtraIntegerVector builder data)))

(defn *get-root-as-flat-node
  "bb - `java.nio.ByteBuffer`
  obj - `org.nd4j.graph.FlatNode`

  returns: `org.nd4j.graph.FlatNode`"
  (^org.nd4j.graph.FlatNode [^java.nio.ByteBuffer bb ^org.nd4j.graph.FlatNode obj]
    (FlatNode/getRootAsFlatNode bb obj))
  (^org.nd4j.graph.FlatNode [^java.nio.ByteBuffer bb]
    (FlatNode/getRootAsFlatNode bb)))

(defn *add-device
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  device - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer device]
    (FlatNode/addDevice builder device)))

(defn *add-output
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  output-offset - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer output-offset]
    (FlatNode/addOutput builder output-offset)))

(defn *start-flat-node
  "builder - `com.google.flatbuffers.FlatBufferBuilder`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder]
    (FlatNode/startFlatNode builder)))

(defn *add-scalar
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  scalar - `float`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Float scalar]
    (FlatNode/addScalar builder scalar)))

(defn *create-dimensions-vector
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  data - `int[]`

  returns: `int`"
  (^Integer [^com.google.flatbuffers.FlatBufferBuilder builder data]
    (FlatNode/createDimensionsVector builder data)))

(defn *create-input-paired-vector
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  data - `int[]`

  returns: `int`"
  (^Integer [^com.google.flatbuffers.FlatBufferBuilder builder data]
    (FlatNode/createInputPairedVector builder data)))

(defn *add-input
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  input-offset - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer input-offset]
    (FlatNode/addInput builder input-offset)))

(defn *create-extra-params-vector
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  data - `double[]`

  returns: `int`"
  (^Integer [^com.google.flatbuffers.FlatBufferBuilder builder data]
    (FlatNode/createExtraParamsVector builder data)))

(defn *add-op-type
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  op-type - `byte`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Byte op-type]
    (FlatNode/addOpType builder op-type)))

(defn *add-extra-integer
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  extra-integer-offset - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer extra-integer-offset]
    (FlatNode/addExtraInteger builder extra-integer-offset)))

(defn *add-op-num
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  op-num - `long`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Long op-num]
    (FlatNode/addOpNum builder op-num)))

(defn *add-dimensions
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  dimensions-offset - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer dimensions-offset]
    (FlatNode/addDimensions builder dimensions-offset)))

(defn *start-extra-integer-vector
  "builder - `com.google.flatbuffers.FlatBufferBuilder`
  num-elems - `int`"
  ([^com.google.flatbuffers.FlatBufferBuilder builder ^Integer num-elems]
    (FlatNode/startExtraIntegerVector builder num-elems)))

(defn dimensions-as-byte-buffer
  "returns: `java.nio.ByteBuffer`"
  (^java.nio.ByteBuffer [^FlatNode this]
    (-> this (.dimensionsAsByteBuffer))))

(defn properties
  "obj - `org.nd4j.graph.FlatProperties`
  j - `int`

  returns: `org.nd4j.graph.FlatProperties`"
  (^org.nd4j.graph.FlatProperties [^FlatNode this ^org.nd4j.graph.FlatProperties obj ^Integer j]
    (-> this (.properties obj j)))
  (^org.nd4j.graph.FlatProperties [^FlatNode this ^Integer j]
    (-> this (.properties j))))

(defn extra-params-length
  "returns: `int`"
  (^Integer [^FlatNode this]
    (-> this (.extraParamsLength))))

(defn device
  "returns: `int`"
  (^Integer [^FlatNode this]
    (-> this (.device))))

(defn extra-integer-as-byte-buffer
  "returns: `java.nio.ByteBuffer`"
  (^java.nio.ByteBuffer [^FlatNode this]
    (-> this (.extraIntegerAsByteBuffer))))

(defn output
  "j - `int`

  returns: `int`"
  (^Integer [^FlatNode this ^Integer j]
    (-> this (.output j))))

(defn op-type
  "returns: `byte`"
  (^Byte [^FlatNode this]
    (-> this (.opType))))

(defn scalar
  "returns: `float`"
  (^Float [^FlatNode this]
    (-> this (.scalar))))

(defn input-as-byte-buffer
  "returns: `java.nio.ByteBuffer`"
  (^java.nio.ByteBuffer [^FlatNode this]
    (-> this (.inputAsByteBuffer))))

(defn input-paired
  "obj - `org.nd4j.graph.IntPair`
  j - `int`

  returns: `org.nd4j.graph.IntPair`"
  (^org.nd4j.graph.IntPair [^FlatNode this ^org.nd4j.graph.IntPair obj ^Integer j]
    (-> this (.inputPaired obj j)))
  (^org.nd4j.graph.IntPair [^FlatNode this ^Integer j]
    (-> this (.inputPaired j))))

(defn init
  "i - `int`
  bb - `java.nio.ByteBuffer`"
  ([^FlatNode this ^Integer i ^java.nio.ByteBuffer bb]
    (-> this (.__init i bb))))

(defn input-paired-length
  "returns: `int`"
  (^Integer [^FlatNode this]
    (-> this (.inputPairedLength))))

(defn id
  "returns: `int`"
  (^Integer [^FlatNode this]
    (-> this (.id))))

(defn scope-id
  "returns: `int`"
  (^Integer [^FlatNode this]
    (-> this (.scopeId))))

(defn assign
  "i - `int`
  bb - `java.nio.ByteBuffer`

  returns: `org.nd4j.graph.FlatNode`"
  (^org.nd4j.graph.FlatNode [^FlatNode this ^Integer i ^java.nio.ByteBuffer bb]
    (-> this (.__assign i bb))))

(defn extra-params
  "j - `int`

  returns: `double`"
  (^Double [^FlatNode this ^Integer j]
    (-> this (.extraParams j))))

(defn op-num
  "returns: `long`"
  (^Long [^FlatNode this]
    (-> this (.opNum))))

(defn name
  "returns: `java.lang.String`"
  (^java.lang.String [^FlatNode this]
    (-> this (.name))))

(defn output-as-byte-buffer
  "returns: `java.nio.ByteBuffer`"
  (^java.nio.ByteBuffer [^FlatNode this]
    (-> this (.outputAsByteBuffer))))

(defn dimensions
  "j - `int`

  returns: `int`"
  (^Integer [^FlatNode this ^Integer j]
    (-> this (.dimensions j))))

(defn properties-length
  "returns: `int`"
  (^Integer [^FlatNode this]
    (-> this (.propertiesLength))))

(defn extra-integer
  "j - `int`

  returns: `long`"
  (^Long [^FlatNode this ^Integer j]
    (-> this (.extraInteger j))))

(defn scope-name-as-byte-buffer
  "returns: `java.nio.ByteBuffer`"
  (^java.nio.ByteBuffer [^FlatNode this]
    (-> this (.scopeNameAsByteBuffer))))

(defn scope-name
  "returns: `java.lang.String`"
  (^java.lang.String [^FlatNode this]
    (-> this (.scopeName))))

(defn name-as-byte-buffer
  "returns: `java.nio.ByteBuffer`"
  (^java.nio.ByteBuffer [^FlatNode this]
    (-> this (.nameAsByteBuffer))))

(defn input
  "j - `int`

  returns: `int`"
  (^Integer [^FlatNode this ^Integer j]
    (-> this (.input j))))

(defn data-type
  "returns: `byte`"
  (^Byte [^FlatNode this]
    (-> this (.dataType))))

(defn input-length
  "returns: `int`"
  (^Integer [^FlatNode this]
    (-> this (.inputLength))))

(defn output-length
  "returns: `int`"
  (^Integer [^FlatNode this]
    (-> this (.outputLength))))

(defn extra-integer-length
  "returns: `int`"
  (^Integer [^FlatNode this]
    (-> this (.extraIntegerLength))))

(defn dimensions-length
  "returns: `int`"
  (^Integer [^FlatNode this]
    (-> this (.dimensionsLength))))

(defn extra-params-as-byte-buffer
  "returns: `java.nio.ByteBuffer`"
  (^java.nio.ByteBuffer [^FlatNode this]
    (-> this (.extraParamsAsByteBuffer))))

