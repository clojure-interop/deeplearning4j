(ns org.deeplearning4j.clustering.randomprojection.RPUtils
  "A port of:
 https://github.com/lyst/rpforest
 to nd4j"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.clustering.randomprojection RPUtils]))

(defn ->rp-utils
  "Constructor."
  (^RPUtils []
    (new RPUtils )))

(defn *get-candidates
  "Get the search candidates as indices given the input
  and similarity function

  x - the input data to search with - `org.nd4j.linalg.api.ndarray.INDArray`
  roots - the trees to search - `java.util.List`
  similarity-function - the function to use for similarity - `java.lang.String`

  returns: the list of indices as the search results - `java.util.List<java.lang.Integer>`"
  (^java.util.List [^org.nd4j.linalg.api.ndarray.INDArray x ^java.util.List roots ^java.lang.String similarity-function]
    (RPUtils/getCandidates x roots similarity-function)))

(defn *compute-distance-multi
  "Compute the distance between 2 vectors
  given a function name. Valid function names:
  euclidean: euclidean distance
  cosinedistance: cosine distance
  cosine similarity: cosine similarity
  manhattan: manhattan distance
  jaccard: jaccard distance
  hamming: hamming distance

  function - the function to use (default euclidean distance) - `java.lang.String`
  x - the first vector - `org.nd4j.linalg.api.ndarray.INDArray`
  y - the second vector - `org.nd4j.linalg.api.ndarray.INDArray`
  result - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the distance between the 2 vectors given the inputs - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^java.lang.String function ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray result]
    (RPUtils/computeDistanceMulti function x y result)))

(defn *scan-for-leaves
  "Scan for leaves accumulating
  the nodes in the passed in list

  nodes - the nodes so far - `java.util.List`
  scan - the tree to scan - `org.deeplearning4j.clustering.randomprojection.RPTree`"
  ([^java.util.List nodes ^org.deeplearning4j.clustering.randomprojection.RPTree scan]
    (RPUtils/scanForLeaves nodes scan)))

(defn *build-tree
  "Initialize the tree given the input parameters

  tree - the tree to initialize - `org.deeplearning4j.clustering.randomprojection.RPTree`
  from - the starting node - `org.deeplearning4j.clustering.randomprojection.RPNode`
  planes - the hyper planes to use (vector space for similarity) - `org.deeplearning4j.clustering.randomprojection.RPHyperPlanes`
  x - the input data - `org.nd4j.linalg.api.ndarray.INDArray`
  max-size - the max number of indices on a given leaf node - `int`
  depth - the current depth of the tree - `int`
  similarity-function - the similarity function to use - `java.lang.String`"
  ([^org.deeplearning4j.clustering.randomprojection.RPTree tree ^org.deeplearning4j.clustering.randomprojection.RPNode from ^org.deeplearning4j.clustering.randomprojection.RPHyperPlanes planes ^org.nd4j.linalg.api.ndarray.INDArray x ^Integer max-size ^Integer depth ^java.lang.String similarity-function]
    (RPUtils/buildTree tree from planes x max-size depth similarity-function)))

(defn *query
  "Query the tree starting from the given node
  using the given hyper plane and similarity function

  from - the node to start from - `org.deeplearning4j.clustering.randomprojection.RPNode`
  planes - the hyper plane to query - `org.deeplearning4j.clustering.randomprojection.RPHyperPlanes`
  x - the input data - `org.nd4j.linalg.api.ndarray.INDArray`
  similarity-function - the similarity function to use - `java.lang.String`

  returns: the leaf node representing the given query from a
  search in the tree - `org.deeplearning4j.clustering.randomprojection.RPNode`"
  (^org.deeplearning4j.clustering.randomprojection.RPNode [^org.deeplearning4j.clustering.randomprojection.RPNode from ^org.deeplearning4j.clustering.randomprojection.RPHyperPlanes planes ^org.nd4j.linalg.api.ndarray.INDArray x ^java.lang.String similarity-function]
    (RPUtils/query from planes x similarity-function)))

(defn *slim-node
  "Prune indices from the given node
  when it's a leaf

  node - the node to prune - `org.deeplearning4j.clustering.randomprojection.RPNode`"
  ([^org.deeplearning4j.clustering.randomprojection.RPNode node]
    (RPUtils/slimNode node)))

(defn *get-all-candidates
  "Get the search candidates as indices given the input
  and similarity function

  x - the input data to search with - `org.nd4j.linalg.api.ndarray.INDArray`
  trees - the trees to search - `java.util.List`
  similarity-function - the function to use for similarity - `java.lang.String`

  returns: the list of indices as the search results - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray x ^java.util.List trees ^java.lang.String similarity-function]
    (RPUtils/getAllCandidates x trees similarity-function)))

(defn *compute-distance
  "/**
  Compute the distance between 2 vectors
  given a function name. Valid function names:
  euclidean: euclidean distance
  cosinedistance: cosine distance
  cosine similarity: cosine similarity
  manhattan: manhattan distance
  jaccard: jaccard distance
  hamming: hamming distance

  function - the function to use (default euclidean distance) - `java.lang.String`
  x - the first vector - `org.nd4j.linalg.api.ndarray.INDArray`
  y - the second vector - `org.nd4j.linalg.api.ndarray.INDArray`
  result - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the distance between the 2 vectors given the inputs - `double`"
  (^Double [^java.lang.String function ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray result]
    (RPUtils/computeDistance function x y result))
  (^Double [^java.lang.String function ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (RPUtils/computeDistance function x y)))

(defn *query-all-with-distances
  "Query all trees using the given input and data

  to-query - the query vector - `org.nd4j.linalg.api.ndarray.INDArray`
  x - the input data to query - `org.nd4j.linalg.api.ndarray.INDArray`
  trees - the trees to query - `java.util.List`
  n - the number of results to search for - `int`
  similarity-function - the similarity function to use - `java.lang.String`

  returns: the indices (in order) in the ndarray - `java.util.List<org.nd4j.linalg.primitives.Pair<java.lang.Double,java.lang.Integer>>`"
  (^java.util.List [^org.nd4j.linalg.api.ndarray.INDArray to-query ^org.nd4j.linalg.api.ndarray.INDArray x ^java.util.List trees ^Integer n ^java.lang.String similarity-function]
    (RPUtils/queryAllWithDistances to-query x trees n similarity-function)))

(defn *sort-candidates
  "Get the sorted distances given the
  query vector, input data, given the list of possible search candidates

  x - the query vector - `org.nd4j.linalg.api.ndarray.INDArray`
  x - the input data to use - `org.nd4j.linalg.api.ndarray.INDArray`
  candidates - the possible search candidates - `java.util.List`
  similarity-function - the similarity function to use - `java.lang.String`

  returns: the sorted distances - `java.util.List<org.nd4j.linalg.primitives.Pair<java.lang.Double,java.lang.Integer>>`"
  (^java.util.List [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray x ^java.util.List candidates ^java.lang.String similarity-function]
    (RPUtils/sortCandidates x x candidates similarity-function)))

(defn *get-op
  "name - `java.lang.String`
  x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`
  result - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `<T extends org.nd4j.autodiff.functions.DifferentialFunction> org.nd4j.autodiff.functions.DifferentialFunction`"
  ([^java.lang.String name ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray result]
    (RPUtils/getOp name x y result)))

(defn *query-all
  "Query all trees using the given input and data

  to-query - the query vector - `org.nd4j.linalg.api.ndarray.INDArray`
  x - the input data to query - `org.nd4j.linalg.api.ndarray.INDArray`
  trees - the trees to query - `java.util.List`
  n - the number of results to search for - `int`
  similarity-function - the similarity function to use - `java.lang.String`

  returns: the indices (in order) in the ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray to-query ^org.nd4j.linalg.api.ndarray.INDArray x ^java.util.List trees ^Integer n ^java.lang.String similarity-function]
    (RPUtils/queryAll to-query x trees n similarity-function)))

