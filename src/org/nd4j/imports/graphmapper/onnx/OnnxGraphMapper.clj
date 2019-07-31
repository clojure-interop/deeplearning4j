(ns org.nd4j.imports.graphmapper.onnx.OnnxGraphMapper
  "A mapper for onnx graphs to
 SameDiff instances."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.imports.graphmapper.onnx OnnxGraphMapper]))

(defn ->onnx-graph-mapper
  "Constructor."
  (^OnnxGraphMapper []
    (new OnnxGraphMapper )))

(defn *get-instance
  "returns: `org.nd4j.imports.graphmapper.onnx.OnnxGraphMapper`"
  (^org.nd4j.imports.graphmapper.onnx.OnnxGraphMapper []
    (OnnxGraphMapper/getInstance )))

(defn get-node-with-name-from-graph
  "Description copied from interface: GraphMapper

  graph - the graph to get the node from - `onnx.OnnxProto3$GraphProto`
  name - the name of the node to get from the graph - `java.lang.String`

  returns: `onnx.OnnxProto3$NodeProto`"
  (^onnx.OnnxProto3$NodeProto [^OnnxGraphMapper this ^onnx.OnnxProto3$GraphProto graph ^java.lang.String name]
    (-> this (.getNodeWithNameFromGraph graph name))))

(defn has-shape?
  "node-proto - `onnx.OnnxProto3$NodeProto`

  returns: `boolean`"
  (^Boolean [^OnnxGraphMapper this ^onnx.OnnxProto3$NodeProto node-proto]
    (-> this (.hasShape node-proto))))

(defn place-holder?
  "Description copied from interface: GraphMapper

  node-type - `onnx.OnnxProto3$TypeProto$Tensor`

  returns: `boolean`"
  (^Boolean [^OnnxGraphMapper this ^onnx.OnnxProto3$TypeProto$Tensor node-type]
    (-> this (.isPlaceHolder node-type))))

(defn map-node-type
  "Description copied from interface: GraphMapper

  tf-node - the node to map - `onnx.OnnxProto3$NodeProto`
  import-state - the current import state - `org.nd4j.imports.graphmapper.ImportState`"
  ([^OnnxGraphMapper this ^onnx.OnnxProto3$NodeProto tf-node ^org.nd4j.imports.graphmapper.ImportState import-state]
    (-> this (.mapNodeType tf-node import-state))))

(defn variables-for-graph
  "Description copied from interface: GraphMapper

  graph-proto - the graph to get the variables for - `onnx.OnnxProto3$GraphProto`

  returns: a map of variable name to tensor - `java.util.Map<java.lang.String,onnx.OnnxProto3$TypeProto$Tensor>`"
  (^java.util.Map [^OnnxGraphMapper this ^onnx.OnnxProto3$GraphProto graph-proto]
    (-> this (.variablesForGraph graph-proto))))

(defn get-op-type
  "node-proto - `onnx.OnnxProto3$NodeProto`

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxGraphMapper this ^onnx.OnnxProto3$NodeProto node-proto]
    (-> this (.getOpType node-proto))))

(defn should-skip?
  "op-type - `onnx.OnnxProto3$NodeProto`

  returns: `boolean`"
  (^Boolean [^OnnxGraphMapper this ^onnx.OnnxProto3$NodeProto op-type]
    (-> this (.shouldSkip op-type))))

(defn ops-to-ignore
  "Description copied from interface: GraphMapper

  returns: `java.util.Set<java.lang.String>`"
  (^java.util.Set [^OnnxGraphMapper this]
    (-> this (.opsToIgnore))))

(defn place-holder-node?
  "Description copied from interface: GraphMapper

  node - the node to check - `onnx.OnnxProto3$TypeProto$Tensor`

  returns: true if the node is a place holder or not - `boolean`"
  (^Boolean [^OnnxGraphMapper this ^onnx.OnnxProto3$TypeProto$Tensor node]
    (-> this (.isPlaceHolderNode node))))

(defn map-tensor-proto
  "tensor - `onnx.OnnxProto3$TensorProto`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^OnnxGraphMapper this ^onnx.OnnxProto3$TensorProto tensor]
    (-> this (.mapTensorProto tensor))))

(defn variable-node?
  "node-proto - `onnx.OnnxProto3$NodeProto`

  returns: `boolean`"
  (^Boolean [^OnnxGraphMapper this ^onnx.OnnxProto3$NodeProto node-proto]
    (-> this (.isVariableNode node-proto))))

(defn get-attr-value-from-node
  "node-proto - `onnx.OnnxProto3$NodeProto`
  key - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxGraphMapper this ^onnx.OnnxProto3$NodeProto node-proto ^java.lang.String key]
    (-> this (.getAttrValueFromNode node-proto key))))

(defn parse-graph-from
  "Description copied from interface: GraphMapper

  input-stream - the input stream to load from - `byte[]`

  returns: `onnx.OnnxProto3$GraphProto`

  throws: java.io.IOException"
  (^onnx.OnnxProto3$GraphProto [^OnnxGraphMapper this input-stream]
    (-> this (.parseGraphFrom input-stream))))

(defn get-nd-array-from-tensor
  "tensor-name - `java.lang.String`
  tensor-proto - `onnx.OnnxProto3$TypeProto$Tensor`
  graph - `onnx.OnnxProto3$GraphProto`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^OnnxGraphMapper this ^java.lang.String tensor-name ^onnx.OnnxProto3$TypeProto$Tensor tensor-proto ^onnx.OnnxProto3$GraphProto graph]
    (-> this (.getNDArrayFromTensor tensor-name tensor-proto graph))))

(defn get-name
  "Description copied from interface: GraphMapper

  node-proto - the nodeto get the name for - `onnx.OnnxProto3$NodeProto`

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxGraphMapper this ^onnx.OnnxProto3$NodeProto node-proto]
    (-> this (.getName node-proto))))

(defn get-input-from-node
  "Description copied from interface: GraphMapper

  node - the node - `onnx.OnnxProto3$NodeProto`
  index - hte index - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxGraphMapper this ^onnx.OnnxProto3$NodeProto node ^Integer index]
    (-> this (.getInputFromNode node index))))

(defn translate-to-same-diff-name
  "name - `java.lang.String`
  node - `onnx.OnnxProto3$NodeProto`

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxGraphMapper this ^java.lang.String name ^onnx.OnnxProto3$NodeProto node]
    (-> this (.translateToSameDiffName name node))))

(defn get-shape-from-attr
  "Description copied from interface: GraphMapper

  attr - the attribute value - `onnx.OnnxProto3$AttributeProto`

  returns: the shape of the attribute if any or null - `long[]`"
  ([^OnnxGraphMapper this ^onnx.OnnxProto3$AttributeProto attr]
    (-> this (.getShapeFromAttr attr))))

(defn map-property
  "name - `java.lang.String`
  on - `org.nd4j.autodiff.functions.DifferentialFunction`
  node - `onnx.OnnxProto3$NodeProto`
  graph - `onnx.OnnxProto3$GraphProto`
  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  property-mappings-for-function - `java.util.Map`"
  ([^OnnxGraphMapper this ^java.lang.String name ^org.nd4j.autodiff.functions.DifferentialFunction on ^onnx.OnnxProto3$NodeProto node ^onnx.OnnxProto3$GraphProto graph ^org.nd4j.autodiff.samediff.SameDiff same-diff ^java.util.Map property-mappings-for-function]
    (-> this (.mapProperty name on node graph same-diff property-mappings-for-function))))

(defn get-target-mapping-for-op
  "Description copied from interface: GraphMapper

  function - the function - `org.nd4j.autodiff.functions.DifferentialFunction`
  node - the node to derive the target mapping from - `onnx.OnnxProto3$NodeProto`

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxGraphMapper this ^org.nd4j.autodiff.functions.DifferentialFunction function ^onnx.OnnxProto3$NodeProto node]
    (-> this (.getTargetMappingForOp function node))))

(defn get-array-from
  "node-proto - `onnx.OnnxProto3$NodeProto`
  graph - `onnx.OnnxProto3$GraphProto`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^OnnxGraphMapper this ^onnx.OnnxProto3$NodeProto node-proto ^onnx.OnnxProto3$GraphProto graph]
    (-> this (.getArrayFrom node-proto graph))))

(defn get-shape
  "node-proto - `onnx.OnnxProto3$NodeProto`

  returns: `long[]`"
  ([^OnnxGraphMapper this ^onnx.OnnxProto3$NodeProto node-proto]
    (-> this (.getShape node-proto))))

(defn get-attr-map
  "Description copied from interface: GraphMapper

  node-proto - the node - `onnx.OnnxProto3$NodeProto`

  returns: the attribute map for the attribute - `java.util.Map<java.lang.String,onnx.OnnxProto3$AttributeProto>`"
  (^java.util.Map [^OnnxGraphMapper this ^onnx.OnnxProto3$NodeProto node-proto]
    (-> this (.getAttrMap node-proto))))

(defn op-ignore-exception?
  "Description copied from interface: GraphMapper

  node - the node to check - `onnx.OnnxProto3$NodeProto`

  returns: true if this node is an exception false otherwise - `boolean`"
  (^Boolean [^OnnxGraphMapper this ^onnx.OnnxProto3$NodeProto node]
    (-> this (.isOpIgnoreException node))))

(defn get-shape-from-attribute
  "attribute-proto - `onnx.OnnxProto3$AttributeProto`

  returns: `long[]`"
  ([^OnnxGraphMapper this ^onnx.OnnxProto3$AttributeProto attribute-proto]
    (-> this (.getShapeFromAttribute attribute-proto))))

(defn data-type-for-tensor
  "tensor-proto - `onnx.OnnxProto3$TypeProto$Tensor`

  returns: `org.nd4j.linalg.api.buffer.DataBuffer$Type`"
  (^org.nd4j.linalg.api.buffer.DataBuffer$Type [^OnnxGraphMapper this ^onnx.OnnxProto3$TypeProto$Tensor tensor-proto]
    (-> this (.dataTypeForTensor tensor-proto))))

(defn nd-4j-type-from-onnx-type
  "Convert an onnx type to the proper nd4j type

  data-type - the data type to convert - `onnx.OnnxProto3$TensorProto$DataType`

  returns: the nd4j type for the onnx type - `org.nd4j.linalg.api.buffer.DataBuffer$Type`"
  (^org.nd4j.linalg.api.buffer.DataBuffer$Type [^OnnxGraphMapper this ^onnx.OnnxProto3$TensorProto$DataType data-type]
    (-> this (.nd4jTypeFromOnnxType data-type))))

(defn already-seen
  "node-proto - `onnx.OnnxProto3$NodeProto`

  returns: `boolean`"
  (^Boolean [^OnnxGraphMapper this ^onnx.OnnxProto3$NodeProto node-proto]
    (-> this (.alreadySeen node-proto))))

(defn get-shape-from-tensor
  "Description copied from interface: GraphMapper

  tensor-proto - `onnx.OnnxProto3$TypeProto$Tensor`

  returns: `long[]`"
  ([^OnnxGraphMapper this ^onnx.OnnxProto3$TypeProto$Tensor tensor-proto]
    (-> this (.getShapeFromTensor tensor-proto))))

(defn get-mapped-op
  "Description copied from interface: GraphMapper

  name - the tensorflow or onnx name - `java.lang.String`

  returns: `org.nd4j.autodiff.functions.DifferentialFunction`"
  (^org.nd4j.autodiff.functions.DifferentialFunction [^OnnxGraphMapper this ^java.lang.String name]
    (-> this (.getMappedOp name))))

(defn get-new-graph-builder
  "Description copied from interface: GraphMapper

  returns: `com.github.os72.protobuf351.Message.Builder`"
  (^com.github.os72.protobuf351.Message.Builder [^OnnxGraphMapper this]
    (-> this (.getNewGraphBuilder))))

(defn get-node-list
  "graph-proto - `onnx.OnnxProto3$GraphProto`

  returns: `java.util.List<onnx.OnnxProto3$NodeProto>`"
  (^java.util.List [^OnnxGraphMapper this ^onnx.OnnxProto3$GraphProto graph-proto]
    (-> this (.getNodeList graph-proto))))

(defn num-inputs-for
  "Description copied from interface: GraphMapper

  node-proto - the node to get the number of inputs for - `onnx.OnnxProto3$NodeProto`

  returns: `int`"
  (^Integer [^OnnxGraphMapper this ^onnx.OnnxProto3$NodeProto node-proto]
    (-> this (.numInputsFor node-proto))))

(defn init-function-from-properties
  "Init a function's attributes

  mapped-tf-name - the onnx name to pick (sometimes ops have multiple names - `java.lang.String`
  on - the function to map - `org.nd4j.autodiff.functions.DifferentialFunction`
  attributes-for-node - the attributes for the node - `java.util.Map`
  node - `onnx.OnnxProto3$NodeProto`
  graph - `onnx.OnnxProto3$GraphProto`"
  ([^OnnxGraphMapper this ^java.lang.String mapped-tf-name ^org.nd4j.autodiff.functions.DifferentialFunction on ^java.util.Map attributes-for-node ^onnx.OnnxProto3$NodeProto node ^onnx.OnnxProto3$GraphProto graph]
    (-> this (.initFunctionFromProperties mapped-tf-name on attributes-for-node node graph))))

(defn dump-binary-proto-as-text
  "Description copied from interface: GraphMapper

  input-file - `java.io.InputStream`
  output-file - `java.io.File`"
  ([^OnnxGraphMapper this ^java.io.InputStream input-file ^java.io.File output-file]
    (-> this (.dumpBinaryProtoAsText input-file output-file))))

