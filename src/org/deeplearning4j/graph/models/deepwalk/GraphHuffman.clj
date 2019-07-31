(ns org.deeplearning4j.graph.models.deepwalk.GraphHuffman
  "An implementation of a Huffman tree specifically for graphs.
 Vertices in graph are indexed by an integer, 0 to nVertices-1"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.graph.models.deepwalk GraphHuffman]))

(defn ->graph-huffman
  "Constructor.

  n-vertices - nVertices number of vertices in the graph that this Huffman tree is being built for - `int`
  max-code-length - MAX_CODE_LENGTH for Huffman tree - `int`"
  (^GraphHuffman [^Integer n-vertices ^Integer max-code-length]
    (new GraphHuffman n-vertices max-code-length))
  (^GraphHuffman [^Integer n-vertices]
    (new GraphHuffman n-vertices)))

(defn build-tree
  "Build the Huffman tree given an array of vertex degrees

  vertex-degree - vertexDegree[i] = degree of ith vertex - `int[]`"
  ([^GraphHuffman this vertex-degree]
    (-> this (.buildTree vertex-degree))))

(defn get-code
  "vertex-num - `int`

  returns: `long`"
  (^Long [^GraphHuffman this ^Integer vertex-num]
    (-> this (.getCode vertex-num))))

(defn get-code-length
  "vertex-num - `int`

  returns: `int`"
  (^Integer [^GraphHuffman this ^Integer vertex-num]
    (-> this (.getCodeLength vertex-num))))

(defn get-code-string
  "vertex-num - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^GraphHuffman this ^Integer vertex-num]
    (-> this (.getCodeString vertex-num))))

(defn get-path-inner-nodes
  "vertex-num - `int`

  returns: `int[]`"
  ([^GraphHuffman this ^Integer vertex-num]
    (-> this (.getPathInnerNodes vertex-num))))

