(ns org.deeplearning4j.graph.iterator.WeightedRandomWalkIterator
  "Given a graph, iterate through random walks on that graph of a specified length.
 Unlike RandomWalkIterator, the WeightedRandomWalkIterator uses the values associated with each edge
 to determine probabilities. Weights on each edge need not be normalized.
 Because the edge values are used to determine the probabilities of selecting an edge, the WeightedRandomWalkIterator
 can only be used on graphs with an edge type that extends the Number class (i.e., Integer, Double, etc)
 Random walks are generated starting at every node in the graph exactly once, though the order of the starting nodes
 is randomized."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.graph.iterator WeightedRandomWalkIterator]))

(defn ->weighted-random-walk-iterator
  "Constructor.

  Constructor used to generate random walks starting at a subset of the vertices in the graph. Order of starting
  vertices is randomized within this subset

  graph - IGraph to conduct walks on - `org.deeplearning4j.graph.api.IGraph`
  walk-length - length of each walk. Walk of length 0 includes 1 vertex, walk of 1 includes 2 vertices etc - `int`
  rng-seed - seed for randomization - `long`
  mode - mode for handling random walks from vertices with either no edges, or no outgoing edges (for directed graphs) - `org.deeplearning4j.graph.api.NoEdgeHandling`
  first-vertex - first vertex index (inclusive) to start random walks from - `int`
  last-vertex - last vertex index (exclusive) to start random walks from - `int`"
  (^WeightedRandomWalkIterator [^org.deeplearning4j.graph.api.IGraph graph ^Integer walk-length ^Long rng-seed ^org.deeplearning4j.graph.api.NoEdgeHandling mode ^Integer first-vertex ^Integer last-vertex]
    (new WeightedRandomWalkIterator graph walk-length rng-seed mode first-vertex last-vertex))
  (^WeightedRandomWalkIterator [^org.deeplearning4j.graph.api.IGraph graph ^Integer walk-length ^Long rng-seed]
    (new WeightedRandomWalkIterator graph walk-length rng-seed))
  (^WeightedRandomWalkIterator [^org.deeplearning4j.graph.api.IGraph graph ^Integer walk-length ^Long rng-seed ^org.deeplearning4j.graph.api.NoEdgeHandling mode]
    (new WeightedRandomWalkIterator graph walk-length rng-seed mode))
  (^WeightedRandomWalkIterator [^org.deeplearning4j.graph.api.IGraph graph ^Integer walk-length]
    (new WeightedRandomWalkIterator graph walk-length)))

(defn next
  "Description copied from interface: GraphWalkIterator

  returns: `org.deeplearning4j.graph.api.IVertexSequence<V>`"
  (^org.deeplearning4j.graph.api.IVertexSequence [^WeightedRandomWalkIterator this]
    (-> this (.next))))

(defn has-next?
  "Description copied from interface: GraphWalkIterator

  returns: `boolean`"
  (^Boolean [^WeightedRandomWalkIterator this]
    (-> this (.hasNext))))

(defn reset
  "Description copied from interface: GraphWalkIterator"
  ([^WeightedRandomWalkIterator this]
    (-> this (.reset))))

(defn walk-length
  "Description copied from interface: GraphWalkIterator

  returns: `int`"
  (^Integer [^WeightedRandomWalkIterator this]
    (-> this (.walkLength))))

