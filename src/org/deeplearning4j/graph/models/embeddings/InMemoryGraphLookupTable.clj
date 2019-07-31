(ns org.deeplearning4j.graph.models.embeddings.InMemoryGraphLookupTable
  "A standard in-memory implementation of a lookup table for vector representations of the vertices in a graph"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.graph.models.embeddings InMemoryGraphLookupTable]))

(defn ->in-memory-graph-lookup-table
  "Constructor.

  n-vertices - `int`
  vector-size - `int`
  tree - `org.deeplearning4j.graph.models.BinaryTree`
  learning-rate - `double`"
  (^InMemoryGraphLookupTable [^Integer n-vertices ^Integer vector-size ^org.deeplearning4j.graph.models.BinaryTree tree ^Double learning-rate]
    (new InMemoryGraphLookupTable n-vertices vector-size tree learning-rate)))

(defn reset-weights
  "Description copied from interface: GraphVectorLookupTable"
  ([^InMemoryGraphLookupTable this]
    (-> this (.resetWeights))))

(defn get-vector
  "Description copied from interface: GraphVectorLookupTable

  idx - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^InMemoryGraphLookupTable this ^Integer idx]
    (-> this (.getVector idx))))

(defn get-tree
  "returns: `org.deeplearning4j.graph.models.BinaryTree`"
  (^org.deeplearning4j.graph.models.BinaryTree [^InMemoryGraphLookupTable this]
    (-> this (.getTree))))

(defn iterate
  "Description copied from interface: GraphVectorLookupTable

  first - `int`
  second - `int`"
  ([^InMemoryGraphLookupTable this ^Integer first ^Integer second]
    (-> this (.iterate first second))))

(defn get-out-weights
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^InMemoryGraphLookupTable this]
    (-> this (.getOutWeights))))

(defn calculate-score
  "Calculate score. -log P(v_second | v_first)

  first - `int`
  second - `int`

  returns: `double`"
  (^Double [^InMemoryGraphLookupTable this ^Integer first ^Integer second]
    (-> this (.calculateScore first second))))

(defn set-learning-rate
  "Description copied from interface: GraphVectorLookupTable

  learning-rate - `double`"
  ([^InMemoryGraphLookupTable this ^Double learning-rate]
    (-> this (.setLearningRate learning-rate))))

(defn vectors-and-gradients
  "Returns vertex vector and vector gradients, plus inner node vectors and inner node gradients
  Specifically, out[0] are vectors, out[1] are gradients for the corresponding vectors
  out[0][0] is vector for first vertex; out[0][1] is gradient for this vertex vector
  out[0][i] (i>0) is the inner node vector along path to second vertex; out[1][i] is gradient for inner node vertex
  This design is used primarily to aid in testing (numerical gradient checks)

  first - first (input) vertex index - `int`
  second - second (output) vertex index - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray[][]`"
  ([^InMemoryGraphLookupTable this ^Integer first ^Integer second]
    (-> this (.vectorsAndGradients first second))))

(defn get-num-vertices
  "Description copied from interface: GraphVectorLookupTable

  returns: `int`"
  (^Integer [^InMemoryGraphLookupTable this]
    (-> this (.getNumVertices))))

(defn calculate-prob
  "Calculate the probability of the second vertex given the first vertex
  i.e., P(v_second | v_first)

  first - index of the first vertex - `int`
  second - index of the second vertex - `int`

  returns: probability, P(v_second | v_first) - `double`"
  (^Double [^InMemoryGraphLookupTable this ^Integer first ^Integer second]
    (-> this (.calculateProb first second))))

(defn vector-size
  "Description copied from interface: GraphVectorLookupTable

  returns: `int`"
  (^Integer [^InMemoryGraphLookupTable this]
    (-> this (.vectorSize))))

(defn get-vertex-vectors
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^InMemoryGraphLookupTable this]
    (-> this (.getVertexVectors))))

(defn get-inner-node-vector
  "inner-node - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^InMemoryGraphLookupTable this ^Integer inner-node]
    (-> this (.getInnerNodeVector inner-node))))

(defn set-vertex-vectors
  "vertex-vectors - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^InMemoryGraphLookupTable this ^org.nd4j.linalg.api.ndarray.INDArray vertex-vectors]
    (-> this (.setVertexVectors vertex-vectors))))

