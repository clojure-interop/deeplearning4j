(ns org.nd4j.imports.graphmapper.BaseGraphMapper
  "Base implementation for importing a graph"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.imports.graphmapper BaseGraphMapper]))

(defn ->base-graph-mapper
  "Constructor."
  (^BaseGraphMapper []
    (new BaseGraphMapper )))

(defn op-type-for-node
  "Description copied from interface: GraphMapper

  node-def - the node to use - `NODE_TYPE`

  returns: the optype for the given node - `org.nd4j.linalg.api.ops.Op$Type`"
  (^org.nd4j.linalg.api.ops.Op$Type [^BaseGraphMapper this node-def]
    (-> this (.opTypeForNode node-def))))

(defn map-properties
  "on - `org.nd4j.autodiff.functions.DifferentialFunction`
  node - `NODE_TYPE`
  graph - `GRAPH_TYPE`
  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  property-mappings - `java.util.Map`"
  ([^BaseGraphMapper this ^org.nd4j.autodiff.functions.DifferentialFunction on node graph ^org.nd4j.autodiff.samediff.SameDiff same-diff ^java.util.Map property-mappings]
    (-> this (.mapProperties on node graph same-diff property-mappings))))

(defn import-graph
  "Description copied from interface: GraphMapper

  input-stream - `java.io.InputStream`

  returns: `org.nd4j.autodiff.samediff.SameDiff`"
  (^org.nd4j.autodiff.samediff.SameDiff [^BaseGraphMapper this ^java.io.InputStream input-stream]
    (-> this (.importGraph input-stream))))

(defn name-index-for-graph
  "graph - `GRAPH_TYPE`

  returns: `java.util.Map<java.lang.String,NODE_TYPE>`"
  (^java.util.Map [^BaseGraphMapper this graph]
    (-> this (.nameIndexForGraph graph))))

(defn nodes-by-name
  "Description copied from interface: GraphMapper

  graph - the graph to get the nodes for - `GRAPH_TYPE`

  returns: the map of the nodes by name
  for a given graph - `java.util.Map<java.lang.String,NODE_TYPE>`"
  (^java.util.Map [^BaseGraphMapper this graph]
    (-> this (.nodesByName graph))))

(defn valid-tensor-data-type
  "Description copied from interface: GraphMapper

  tensor-type - the tensor proto to test - `TENSOR_TYPE`

  returns: `boolean`"
  (^Boolean [^BaseGraphMapper this tensor-type]
    (-> this (.validTensorDataType tensor-type))))

