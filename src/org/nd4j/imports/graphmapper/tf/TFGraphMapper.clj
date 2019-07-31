(ns org.nd4j.imports.graphmapper.tf.TFGraphMapper
  "Map tensorflow graph protos
 to the intermediate representation
 for samediff."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.imports.graphmapper.tf TFGraphMapper]))

(def *-value-attr-key
  "Static Constant.

  type: java.lang.String"
  TFGraphMapper/VALUE_ATTR_KEY)

(def *-shape-key
  "Static Constant.

  type: java.lang.String"
  TFGraphMapper/SHAPE_KEY)

(defn *get-instance
  "Singleton. Get the needed instance.

  returns: `org.nd4j.imports.graphmapper.tf.TFGraphMapper`"
  (^org.nd4j.imports.graphmapper.tf.TFGraphMapper []
    (TFGraphMapper/getInstance )))

(defn get-node-with-name-from-graph
  "Description copied from interface: GraphMapper

  graph - the graph to get the node from - `org.tensorflow.framework.GraphDef`
  name - the name of the node to get from the graph - `java.lang.String`

  returns: `org.tensorflow.framework.NodeDef`"
  (^org.tensorflow.framework.NodeDef [^TFGraphMapper this ^org.tensorflow.framework.GraphDef graph ^java.lang.String name]
    (-> this (.getNodeWithNameFromGraph graph name))))

(defn has-shape?
  "node-def - `org.tensorflow.framework.NodeDef`

  returns: `boolean`"
  (^Boolean [^TFGraphMapper this ^org.tensorflow.framework.NodeDef node-def]
    (-> this (.hasShape node-def))))

(defn place-holder?
  "Description copied from interface: GraphMapper

  node-def - `org.tensorflow.framework.NodeDef`

  returns: `boolean`"
  (^Boolean [^TFGraphMapper this ^org.tensorflow.framework.NodeDef node-def]
    (-> this (.isPlaceHolder node-def))))

(defn map-node-type
  "Description copied from interface: GraphMapper

  tf-node - the node to map - `org.tensorflow.framework.NodeDef`
  import-state - the current import state - `org.nd4j.imports.graphmapper.ImportState`"
  ([^TFGraphMapper this ^org.tensorflow.framework.NodeDef tf-node ^org.nd4j.imports.graphmapper.ImportState import-state]
    (-> this (.mapNodeType tf-node import-state))))

(defn variables-for-graph
  "Description copied from interface: GraphMapper

  graph-def - the graph to get the variables for - `org.tensorflow.framework.GraphDef`

  returns: a map of variable name to tensor - `java.util.Map<java.lang.String,org.tensorflow.framework.NodeDef>`"
  (^java.util.Map [^TFGraphMapper this ^org.tensorflow.framework.GraphDef graph-def]
    (-> this (.variablesForGraph graph-def))))

(defn get-op-type
  "node-def - `org.tensorflow.framework.NodeDef`

  returns: `java.lang.String`"
  (^java.lang.String [^TFGraphMapper this ^org.tensorflow.framework.NodeDef node-def]
    (-> this (.getOpType node-def))))

(defn should-skip?
  "op-type - `org.tensorflow.framework.NodeDef`

  returns: `boolean`"
  (^Boolean [^TFGraphMapper this ^org.tensorflow.framework.NodeDef op-type]
    (-> this (.shouldSkip op-type))))

(defn ops-to-ignore
  "Description copied from interface: GraphMapper

  returns: `java.util.Set<java.lang.String>`"
  (^java.util.Set [^TFGraphMapper this]
    (-> this (.opsToIgnore))))

(defn place-holder-node?
  "Returns true if the given node is a place holder

  node - the node to check - `org.tensorflow.framework.NodeDef`

  returns: true if the node is a place holder or not - `boolean`"
  (^Boolean [^TFGraphMapper this ^org.tensorflow.framework.NodeDef node]
    (-> this (.isPlaceHolderNode node))))

(defn map-tensor-proto
  "tf-tensor - `org.tensorflow.framework.TensorProto`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^TFGraphMapper this ^org.tensorflow.framework.TensorProto tf-tensor]
    (-> this (.mapTensorProto tf-tensor))))

(defn variable-node?
  "node-def - `org.tensorflow.framework.NodeDef`

  returns: `boolean`"
  (^Boolean [^TFGraphMapper this ^org.tensorflow.framework.NodeDef node-def]
    (-> this (.isVariableNode node-def))))

(defn get-attr-value-from-node
  "node-def - `org.tensorflow.framework.NodeDef`
  key - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^TFGraphMapper this ^org.tensorflow.framework.NodeDef node-def ^java.lang.String key]
    (-> this (.getAttrValueFromNode node-def key))))

(defn nodes-for-if
  "Returns the node for an if statement

  from - the starting node (a merge node that represents a conditional) - `org.tensorflow.framework.NodeDef`
  graph - the graph to search - `org.tensorflow.framework.GraphDef`

  returns: an import state representing the nodes for each scope - `org.nd4j.linalg.api.ops.impl.controlflow.IfImportState`"
  (^org.nd4j.linalg.api.ops.impl.controlflow.IfImportState [^TFGraphMapper this ^org.tensorflow.framework.NodeDef from ^org.tensorflow.framework.GraphDef graph]
    (-> this (.nodesForIf from graph))))

(defn parse-graph-from
  "Description copied from interface: GraphMapper

  input-stream - the input stream to load from - `byte[]`

  returns: `org.tensorflow.framework.GraphDef`

  throws: java.io.IOException"
  (^org.tensorflow.framework.GraphDef [^TFGraphMapper this input-stream]
    (-> this (.parseGraphFrom input-stream))))

(defn get-nd-array-from-tensor
  "tensor-name - `java.lang.String`
  node - `org.tensorflow.framework.NodeDef`
  graph - `org.tensorflow.framework.GraphDef`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^TFGraphMapper this ^java.lang.String tensor-name ^org.tensorflow.framework.NodeDef node ^org.tensorflow.framework.GraphDef graph]
    (-> this (.getNDArrayFromTensor tensor-name node graph))))

(defn get-name
  "Description copied from interface: GraphMapper

  node-def - the nodeto get the name for - `org.tensorflow.framework.NodeDef`

  returns: `java.lang.String`"
  (^java.lang.String [^TFGraphMapper this ^org.tensorflow.framework.NodeDef node-def]
    (-> this (.getName node-def))))

(defn get-input-from-node
  "Description copied from interface: GraphMapper

  node - the node - `org.tensorflow.framework.NodeDef`
  index - hte index - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^TFGraphMapper this ^org.tensorflow.framework.NodeDef node ^Integer index]
    (-> this (.getInputFromNode node index))))

(defn translate-to-same-diff-name
  "name - `java.lang.String`
  node - `org.tensorflow.framework.NodeDef`

  returns: `java.lang.String`"
  (^java.lang.String [^TFGraphMapper this ^java.lang.String name ^org.tensorflow.framework.NodeDef node]
    (-> this (.translateToSameDiffName name node))))

(defn get-node-name
  "Map a tensorflow node name
  to the samediff equivalent
  for import

  name - the name to change - `java.lang.String`

  returns: the input tensorflow name - `java.lang.String`"
  (^java.lang.String [^TFGraphMapper this ^java.lang.String name]
    (-> this (.getNodeName name))))

(defn get-shape-from-attr
  "Description copied from interface: GraphMapper

  attr - the attribute value - `org.tensorflow.framework.AttrValue`

  returns: the shape of the attribute if any or null - `long[]`"
  ([^TFGraphMapper this ^org.tensorflow.framework.AttrValue attr]
    (-> this (.getShapeFromAttr attr))))

(defn map-property
  "name - `java.lang.String`
  on - `org.nd4j.autodiff.functions.DifferentialFunction`
  node - `org.tensorflow.framework.NodeDef`
  graph - `org.tensorflow.framework.GraphDef`
  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  property-mappings-for-function - `java.util.Map`"
  ([^TFGraphMapper this ^java.lang.String name ^org.nd4j.autodiff.functions.DifferentialFunction on ^org.tensorflow.framework.NodeDef node ^org.tensorflow.framework.GraphDef graph ^org.nd4j.autodiff.samediff.SameDiff same-diff ^java.util.Map property-mappings-for-function]
    (-> this (.mapProperty name on node graph same-diff property-mappings-for-function))))

(defn get-target-mapping-for-op
  "Description copied from interface: GraphMapper

  function - the function - `org.nd4j.autodiff.functions.DifferentialFunction`
  node - the node to derive the target mapping from - `org.tensorflow.framework.NodeDef`

  returns: `java.lang.String`"
  (^java.lang.String [^TFGraphMapper this ^org.nd4j.autodiff.functions.DifferentialFunction function ^org.tensorflow.framework.NodeDef node]
    (-> this (.getTargetMappingForOp function node))))

(defn get-array-from
  "node-def - `org.tensorflow.framework.NodeDef`
  graph - `org.tensorflow.framework.GraphDef`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^TFGraphMapper this ^org.tensorflow.framework.NodeDef node-def ^org.tensorflow.framework.GraphDef graph]
    (-> this (.getArrayFrom node-def graph))))

(defn get-shape
  "node-def - `org.tensorflow.framework.NodeDef`

  returns: `long[]`"
  ([^TFGraphMapper this ^org.tensorflow.framework.NodeDef node-def]
    (-> this (.getShape node-def))))

(defn get-attr-map
  "Description copied from interface: GraphMapper

  node-def - the node - `org.tensorflow.framework.NodeDef`

  returns: the attribute map for the attribute - `java.util.Map<java.lang.String,org.tensorflow.framework.AttrValue>`"
  (^java.util.Map [^TFGraphMapper this ^org.tensorflow.framework.NodeDef node-def]
    (-> this (.getAttrMap node-def))))

(defn op-ignore-exception?
  "Description copied from interface: GraphMapper

  node - the node to check - `org.tensorflow.framework.NodeDef`

  returns: true if this node is an exception false otherwise - `boolean`"
  (^Boolean [^TFGraphMapper this ^org.tensorflow.framework.NodeDef node]
    (-> this (.isOpIgnoreException node))))

(defn get-shape-from-attribute
  "attr-value - `org.tensorflow.framework.AttrValue`

  returns: `long[]`"
  ([^TFGraphMapper this ^org.tensorflow.framework.AttrValue attr-value]
    (-> this (.getShapeFromAttribute attr-value))))

(defn data-type-for-tensor
  "tensor-proto - `org.tensorflow.framework.NodeDef`

  returns: `org.nd4j.linalg.api.buffer.DataBuffer$Type`"
  (^org.nd4j.linalg.api.buffer.DataBuffer$Type [^TFGraphMapper this ^org.tensorflow.framework.NodeDef tensor-proto]
    (-> this (.dataTypeForTensor tensor-proto))))

(defn already-seen
  "node-def - `org.tensorflow.framework.NodeDef`

  returns: `boolean`"
  (^Boolean [^TFGraphMapper this ^org.tensorflow.framework.NodeDef node-def]
    (-> this (.alreadySeen node-def))))

(defn get-shape-from-tensor
  "Description copied from interface: GraphMapper

  tensor-proto - `org.tensorflow.framework.NodeDef`

  returns: `long[]`"
  ([^TFGraphMapper this ^org.tensorflow.framework.NodeDef tensor-proto]
    (-> this (.getShapeFromTensor tensor-proto))))

(defn get-mapped-op
  "Description copied from interface: GraphMapper

  name - the tensorflow or onnx name - `java.lang.String`

  returns: `org.nd4j.autodiff.functions.DifferentialFunction`"
  (^org.nd4j.autodiff.functions.DifferentialFunction [^TFGraphMapper this ^java.lang.String name]
    (-> this (.getMappedOp name))))

(defn get-new-graph-builder
  "Description copied from interface: GraphMapper

  returns: `com.github.os72.protobuf351.Message.Builder`"
  (^com.github.os72.protobuf351.Message.Builder [^TFGraphMapper this]
    (-> this (.getNewGraphBuilder))))

(defn get-node-list
  "graph-def - `org.tensorflow.framework.GraphDef`

  returns: `java.util.List<org.tensorflow.framework.NodeDef>`"
  (^java.util.List [^TFGraphMapper this ^org.tensorflow.framework.GraphDef graph-def]
    (-> this (.getNodeList graph-def))))

(defn num-inputs-for
  "Description copied from interface: GraphMapper

  node-def - the node to get the number of inputs for - `org.tensorflow.framework.NodeDef`

  returns: `int`"
  (^Integer [^TFGraphMapper this ^org.tensorflow.framework.NodeDef node-def]
    (-> this (.numInputsFor node-def))))

(defn init-function-from-properties
  "Init a function's attributes

  mapped-tf-name - the tensorflow name to pick (sometimes ops have multiple names - `java.lang.String`
  on - the function to map - `org.nd4j.autodiff.functions.DifferentialFunction`
  attributes-for-node - the attributes for the node - `java.util.Map`
  node - `org.tensorflow.framework.NodeDef`
  graph - `org.tensorflow.framework.GraphDef`"
  ([^TFGraphMapper this ^java.lang.String mapped-tf-name ^org.nd4j.autodiff.functions.DifferentialFunction on ^java.util.Map attributes-for-node ^org.tensorflow.framework.NodeDef node ^org.tensorflow.framework.GraphDef graph]
    (-> this (.initFunctionFromProperties mapped-tf-name on attributes-for-node node graph)))
  ([^TFGraphMapper this ^org.nd4j.autodiff.functions.DifferentialFunction on ^java.util.Map attributes-for-node ^org.tensorflow.framework.NodeDef node ^org.tensorflow.framework.GraphDef graph]
    (-> this (.initFunctionFromProperties on attributes-for-node node graph))))

(defn dump-binary-proto-as-text
  "Description copied from interface: GraphMapper

  input-file - `java.io.InputStream`
  output-file - `java.io.File`"
  ([^TFGraphMapper this ^java.io.InputStream input-file ^java.io.File output-file]
    (-> this (.dumpBinaryProtoAsText input-file output-file))))

