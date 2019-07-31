(ns org.deeplearning4j.graph.iterator.RandomWalkIterator
  "Given a graph, iterate through random walks on that graph of a specified length.
 Random walks are generated starting at every node in the graph exactly once, though the order
 of the starting nodes is randomized."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.graph.iterator RandomWalkIterator]))

(defn ->random-walk-iterator
  "Constructor.

  Constructor used to generate random walks starting at a subset of the vertices in the graph. Order of starting
  vertices is randomized within this subset

  graph - IGraph to conduct walks on - `org.deeplearning4j.graph.api.IGraph`
  walk-length - length of each walk. Walk of length 0 includes 1 vertex, walk of 1 includes 2 vertices etc - `int`
  rng-seed - seed for randomization - `long`
  mode - mode for handling random walks from vertices with either no edges, or no outgoing edges (for directed graphs) - `org.deeplearning4j.graph.api.NoEdgeHandling`
  first-vertex - first vertex index (inclusive) to start random walks from - `int`
  last-vertex - last vertex index (exclusive) to start random walks from - `int`"
  (^RandomWalkIterator [^org.deeplearning4j.graph.api.IGraph graph ^Integer walk-length ^Long rng-seed ^org.deeplearning4j.graph.api.NoEdgeHandling mode ^Integer first-vertex ^Integer last-vertex]
    (new RandomWalkIterator graph walk-length rng-seed mode first-vertex last-vertex))
  (^RandomWalkIterator [^org.deeplearning4j.graph.api.IGraph graph ^Integer walk-length ^Long rng-seed]
    (new RandomWalkIterator graph walk-length rng-seed))
  (^RandomWalkIterator [^org.deeplearning4j.graph.api.IGraph graph ^Integer walk-length ^Long rng-seed ^org.deeplearning4j.graph.api.NoEdgeHandling mode]
    (new RandomWalkIterator graph walk-length rng-seed mode))
  (^RandomWalkIterator [^org.deeplearning4j.graph.api.IGraph graph ^Integer walk-length]
    (new RandomWalkIterator graph walk-length)))

(defn next
  "Description copied from interface: GraphWalkIterator

  returns: `org.deeplearning4j.graph.api.IVertexSequence<V>`"
  (^org.deeplearning4j.graph.api.IVertexSequence [^RandomWalkIterator this]
    (-> this (.next))))

(defn has-next?
  "Description copied from interface: GraphWalkIterator

  returns: `boolean`"
  (^Boolean [^RandomWalkIterator this]
    (-> this (.hasNext))))

(defn reset
  "Description copied from interface: GraphWalkIterator"
  ([^RandomWalkIterator this]
    (-> this (.reset))))

(defn walk-length
  "Description copied from interface: GraphWalkIterator

  returns: `int`"
  (^Integer [^RandomWalkIterator this]
    (-> this (.walkLength))))

