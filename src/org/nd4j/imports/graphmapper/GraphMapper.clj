(ns org.nd4j.imports.graphmapper.GraphMapper
  "Map graph proto types to
 SameDiff instances"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.imports.graphmapper GraphMapper]))

(defn get-node-with-name-from-graph
  "Get the node from the graph

  graph - the graph to get the node from - `GRAPH_TYPE`
  name - the name of the node to get from the graph - `java.lang.String`

  returns: `NODE_TYPE`"
  ([^GraphMapper this graph ^java.lang.String name]
    (-> this (.getNodeWithNameFromGraph graph name))))

(defn has-shape?
  "node-type - `NODE_TYPE`

  returns: `boolean`"
  (^Boolean [^GraphMapper this node-type]
    (-> this (.hasShape node-type))))

(defn place-holder?
  "Returns true if the given node is a place holder type
  (think a yet to be determined shape)_

  node-type - `TENSOR_TYPE`

  returns: `boolean`"
  (^Boolean [^GraphMapper this node-type]
    (-> this (.isPlaceHolder node-type))))

(defn map-node-type
  "Map a node in to the import state covering
  the SameDiff instance

  tf-node - the node to map - `NODE_TYPE`
  import-state - the current import state - `org.nd4j.imports.graphmapper.ImportState`"
  ([^GraphMapper this tf-node ^org.nd4j.imports.graphmapper.ImportState import-state]
    (-> this (.mapNodeType tf-node import-state))))

(defn variables-for-graph
  "Get the variables for the given graph

  graph-type - the graph to get the variables for - `GRAPH_TYPE`

  returns: a map of variable name to tensor - `java.util.Map<java.lang.String,TENSOR_TYPE>`"
  (^java.util.Map [^GraphMapper this graph-type]
    (-> this (.variablesForGraph graph-type))))

(defn get-op-type
  "node-type - `NODE_TYPE`

  returns: `java.lang.String`"
  (^java.lang.String [^GraphMapper this node-type]
    (-> this (.getOpType node-type))))

(defn should-skip?
  "op-type - `NODE_TYPE`

  returns: `boolean`"
  (^Boolean [^GraphMapper this op-type]
    (-> this (.shouldSkip op-type))))

(defn valid-tensor-data-type
  "Whether the data type for the tensor is valid
  for creating an INDArray

  tensor-type - the tensor proto to test - `TENSOR_TYPE`

  returns: `boolean`"
  (^Boolean [^GraphMapper this tensor-type]
    (-> this (.validTensorDataType tensor-type))))

(defn ops-to-ignore
  "Ops to ignore for mapping

  returns: `java.util.Set<java.lang.String>`"
  (^java.util.Set [^GraphMapper this]
    (-> this (.opsToIgnore))))

(defn place-holder-node?
  "Returns true if the given node is a place holder

  node - the node to check - `TENSOR_TYPE`

  returns: true if the node is a place holder or not - `boolean`"
  (^Boolean [^GraphMapper this node]
    (-> this (.isPlaceHolderNode node))))

(defn op-type-for-node
  "Returns an op type for the given input node

  node-type - the node to use - `NODE_TYPE`

  returns: the optype for the given node - `org.nd4j.linalg.api.ops.Op$Type`"
  (^org.nd4j.linalg.api.ops.Op$Type [^GraphMapper this node-type]
    (-> this (.opTypeForNode node-type))))

(defn variable-node?
  "node-type - `NODE_TYPE`

  returns: `boolean`"
  (^Boolean [^GraphMapper this node-type]
    (-> this (.isVariableNode node-type))))

(defn get-attr-value-from-node
  "node-type - `NODE_TYPE`
  key - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^GraphMapper this node-type ^java.lang.String key]
    (-> this (.getAttrValueFromNode node-type key))))

(defn parse-graph-from
  "Parse a graph from an input stream

  input-stream - the input stream to load from - `byte[]`

  returns: `GRAPH_TYPE`

  throws: java.io.IOException"
  ([^GraphMapper this input-stream]
    (-> this (.parseGraphFrom input-stream))))

(defn get-nd-array-from-tensor
  "tensor-name - `java.lang.String`
  tensor-type - `TENSOR_TYPE`
  graph - `GRAPH_TYPE`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^GraphMapper this ^java.lang.String tensor-name tensor-type graph]
    (-> this (.getNDArrayFromTensor tensor-name tensor-type graph))))

(defn get-name
  "Get the name of the node

  node-type - the nodeto get the name for - `NODE_TYPE`

  returns: `java.lang.String`"
  (^java.lang.String [^GraphMapper this node-type]
    (-> this (.getName node-type))))

(defn get-input-from-node
  "Get the input node for the given node

  node - the node - `NODE_TYPE`
  index - hte index - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^GraphMapper this node ^Integer index]
    (-> this (.getInputFromNode node index))))

(defn translate-to-same-diff-name
  "name - `java.lang.String`
  node - `NODE_TYPE`

  returns: `java.lang.String`"
  (^java.lang.String [^GraphMapper this ^java.lang.String name node]
    (-> this (.translateToSameDiffName name node))))

(defn get-shape-from-attr
  "Get the shape of the attribute value

  attr - the attribute value - `ATTR_TYPE`

  returns: the shape of the attribute if any or null - `long[]`"
  ([^GraphMapper this attr]
    (-> this (.getShapeFromAttr attr))))

(defn map-property
  "name - `java.lang.String`
  on - `org.nd4j.autodiff.functions.DifferentialFunction`
  node - `NODE_TYPE`
  graph - `GRAPH_TYPE`
  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  property-mappings-for-function - `java.util.Map`"
  ([^GraphMapper this ^java.lang.String name ^org.nd4j.autodiff.functions.DifferentialFunction on node graph ^org.nd4j.autodiff.samediff.SameDiff same-diff ^java.util.Map property-mappings-for-function]
    (-> this (.mapProperty name on node graph same-diff property-mappings-for-function))))

(defn get-target-mapping-for-op
  "Get the target mapping key (usually based on the node name)
  for the given function

  function - the function - `org.nd4j.autodiff.functions.DifferentialFunction`
  node - the node to derive the target mapping from - `NODE_TYPE`

  returns: `java.lang.String`"
  (^java.lang.String [^GraphMapper this ^org.nd4j.autodiff.functions.DifferentialFunction function node]
    (-> this (.getTargetMappingForOp function node))))

(defn nodes-by-name
  "Get the nodes sorted by n ame
  from a given graph

  graph - the graph to get the nodes for - `GRAPH_TYPE`

  returns: the map of the nodes by name
  for a given graph - `java.util.Map<java.lang.String,NODE_TYPE>`"
  (^java.util.Map [^GraphMapper this graph]
    (-> this (.nodesByName graph))))

(defn get-array-from
  "node-type - `NODE_TYPE`
  graph - `GRAPH_TYPE`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^GraphMapper this node-type graph]
    (-> this (.getArrayFrom node-type graph))))

(defn get-shape
  "node-type - `NODE_TYPE`

  returns: `long[]`"
  ([^GraphMapper this node-type]
    (-> this (.getShape node-type))))

(defn get-attr-map
  "Get the attribute
  map for given node

  node-type - the node - `NODE_TYPE`

  returns: the attribute map for the attribute - `java.util.Map<java.lang.String,ATTR_TYPE>`"
  (^java.util.Map [^GraphMapper this node-type]
    (-> this (.getAttrMap node-type))))

(defn name-index-for-graph
  "graph - `GRAPH_TYPE`

  returns: `java.util.Map<java.lang.String,NODE_TYPE>`"
  (^java.util.Map [^GraphMapper this graph]
    (-> this (.nameIndexForGraph graph))))

(defn map-properties
  "on - `org.nd4j.autodiff.functions.DifferentialFunction`
  node - `NODE_TYPE`
  graph - `GRAPH_TYPE`
  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  property-mappings - `java.util.Map`"
  ([^GraphMapper this ^org.nd4j.autodiff.functions.DifferentialFunction on node graph ^org.nd4j.autodiff.samediff.SameDiff same-diff ^java.util.Map property-mappings]
    (-> this (.mapProperties on node graph same-diff property-mappings))))

(defn op-ignore-exception?
  "Returns true if this node is a special case
  (maybe because of name or other scenarios)
  that should override opsToIgnore()
  in certain circumstances

  node - the node to check - `NODE_TYPE`

  returns: true if this node is an exception false otherwise - `boolean`"
  (^Boolean [^GraphMapper this node]
    (-> this (.isOpIgnoreException node))))

(defn get-shape-from-attribute
  "attr-type - `ATTR_TYPE`

  returns: `long[]`"
  ([^GraphMapper this attr-type]
    (-> this (.getShapeFromAttribute attr-type))))

(defn data-type-for-tensor
  "tensor-type - `TENSOR_TYPE`

  returns: `org.nd4j.linalg.api.buffer.DataBuffer$Type`"
  (^org.nd4j.linalg.api.buffer.DataBuffer$Type [^GraphMapper this tensor-type]
    (-> this (.dataTypeForTensor tensor-type))))

(defn already-seen
  "node-type - `NODE_TYPE`

  returns: `boolean`"
  (^Boolean [^GraphMapper this node-type]
    (-> this (.alreadySeen node-type))))

(defn get-shape-from-tensor
  "Get the shape for the given tensor type

  tensor-type - `TENSOR_TYPE`

  returns: `long[]`"
  ([^GraphMapper this tensor-type]
    (-> this (.getShapeFromTensor tensor-type))))

(defn get-mapped-op
  "Get the mapped op name
  for a given op
  relative to the type of node being mapped.
  The input name should be based on a tensorflow
  type or onnx type, not the nd4j name

  name - the tensorflow or onnx name - `java.lang.String`

  returns: the function based on the values in
  DifferentialFunctionClassHolder - `org.nd4j.autodiff.functions.DifferentialFunction`"
  (^org.nd4j.autodiff.functions.DifferentialFunction [^GraphMapper this ^java.lang.String name]
    (-> this (.getMappedOp name))))

(defn import-graph
  "Import a graph as same diff
  from the given file

  graph-file - `java.io.InputStream`

  returns: `org.nd4j.autodiff.samediff.SameDiff`"
  (^org.nd4j.autodiff.samediff.SameDiff [^GraphMapper this ^java.io.InputStream graph-file]
    (-> this (.importGraph graph-file))))

(defn get-new-graph-builder
  "Returns a graph builder for initial definition and parsing.

  returns: `com.github.os72.protobuf351.Message.Builder`"
  (^com.github.os72.protobuf351.Message.Builder [^GraphMapper this]
    (-> this (.getNewGraphBuilder))))

(defn get-node-list
  "graph-type - `GRAPH_TYPE`

  returns: `java.util.List<NODE_TYPE>`"
  (^java.util.List [^GraphMapper this graph-type]
    (-> this (.getNodeList graph-type))))

(defn num-inputs-for
  "Get the number of inputs for a node.

  node-type - the node to get the number of inputs for - `NODE_TYPE`

  returns: `int`"
  (^Integer [^GraphMapper this node-type]
    (-> this (.numInputsFor node-type))))

(defn dump-binary-proto-as-text
  "Dump a binary proto file representation as a
  plain string in to the target text file

  input-file - `java.io.File`
  output-file - `java.io.File`"
  ([^GraphMapper this ^java.io.File input-file ^java.io.File output-file]
    (-> this (.dumpBinaryProtoAsText input-file output-file))))

