(ns org.deeplearning4j.graph.iterator.parallel.WeightedRandomWalkGraphIteratorProvider
  "Weighted random walk graph iterator provider: given a weighted graph (of type IGraph<?,? extends Number>),
 split up the generation of weighted random walks for parallel learning. Specifically: with N threads and V vertices:
 - First iterator generates weighted random walks starting at vertices 0 to V/N
 - Second iterator generates weighted random walks starting at vertices V/N+1 to 2*V/N
 - and so on"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.graph.iterator.parallel WeightedRandomWalkGraphIteratorProvider]))

(defn ->weighted-random-walk-graph-iterator-provider
  "Constructor.

  graph - `org.deeplearning4j.graph.api.IGraph`
  walk-length - `int`
  seed - `long`
  mode - `org.deeplearning4j.graph.api.NoEdgeHandling`"
  (^WeightedRandomWalkGraphIteratorProvider [^org.deeplearning4j.graph.api.IGraph graph ^Integer walk-length ^Long seed ^org.deeplearning4j.graph.api.NoEdgeHandling mode]
    (new WeightedRandomWalkGraphIteratorProvider graph walk-length seed mode))
  (^WeightedRandomWalkGraphIteratorProvider [^org.deeplearning4j.graph.api.IGraph graph ^Integer walk-length]
    (new WeightedRandomWalkGraphIteratorProvider graph walk-length)))

(defn get-graph-walk-iterators
  "Description copied from interface: GraphWalkIteratorProvider

  num-iterators - Number of iterators to return - `int`

  returns: `java.util.List<org.deeplearning4j.graph.iterator.GraphWalkIterator<V>>`"
  (^java.util.List [^WeightedRandomWalkGraphIteratorProvider this ^Integer num-iterators]
    (-> this (.getGraphWalkIterators num-iterators))))

