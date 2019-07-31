(ns org.nd4j.tensorflow.conversion.graphrunner.GraphRunner
  "Runs a tensorflow session based on zero copy
 INDArray"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.tensorflow.conversion.graphrunner GraphRunner]))

(defn ->graph-runner
  "Constructor.

  Pass in a graph instance and
  the length of the protobuf
  that it was instantiated with.
  For files this is typically
  File.length(),
  for byte arrays, this is
  byte array.length
  and for ByteBuffer
  this would be something like the
  Buffer.capacity()

  input-names - `java.util.List`
  graph - a pointer to the tensorflow.TF_Graph to use when executing - `org.bytedeco.javacpp.tensorflow.TF_Graph`
  graph-def - GraphDef protobufdefinition containingthe graph configurationfor automatically inferringthings likegraph inputs and outputs - `org.tensorflow.framework.GraphDef`
  config-proto - the session configuration proto to use with this runner - `org.bytedeco.javacpp.tensorflow.ConfigProto`"
  (^GraphRunner [^java.util.List input-names ^org.bytedeco.javacpp.tensorflow.TF_Graph graph ^org.tensorflow.framework.GraphDef graph-def ^org.bytedeco.javacpp.tensorflow.ConfigProto config-proto]
    (new GraphRunner input-names graph graph-def config-proto))
  (^GraphRunner [^java.util.List input-names ^org.bytedeco.javacpp.tensorflow.TF_Graph graph ^org.tensorflow.framework.GraphDef graph-def]
    (new GraphRunner input-names graph graph-def))
  (^GraphRunner [graph-to-use ^java.util.List input-names]
    (new GraphRunner graph-to-use input-names)))

(defn *get-aligned-with-nd-4j
  "returns: `org.tensorflow.framework.ConfigProto`"
  (^org.tensorflow.framework.ConfigProto []
    (GraphRunner/getAlignedWithNd4j )))

(defn *from-json
  "Convert a json string written out
  by JsonFormat
  to a tensorflow.ConfigProto

  json - the json to read - `java.lang.String`

  returns: the config proto to use - `org.tensorflow.framework.ConfigProto`"
  (^org.tensorflow.framework.ConfigProto [^java.lang.String json]
    (GraphRunner/fromJson json)))

(defn run
  "Returns a map of the output names
  to the ndarrays matching each output.
  Note that IllegalArgumentException
  will be thrown if there are any invalid states such as:
  the graph being null
  the inputs resolved from the graph do not match
  the inputs passed in

  inputs - the inputs to use for eachINDArray - `java.util.Map`

  returns: a map of the output names to the
  ndarrays matching each output specified in the graph - `java.util.Map<java.lang.String,org.nd4j.linalg.api.ndarray.INDArray>`

  throws: java.io.IOException"
  (^java.util.Map [^GraphRunner this ^java.util.Map inputs]
    (-> this (.run inputs))))

(defn session-options-to-json
  "Write out the session options used
  by this GraphRunner
  a s a json string using the
  JsonFormat

  returns: `java.lang.String`"
  (^java.lang.String [^GraphRunner this]
    (-> this (.sessionOptionsToJson))))

(defn close
  ""
  ([^GraphRunner this]
    (-> this (.close))))

