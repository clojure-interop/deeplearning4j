(ns org.deeplearning4j.graph.iterator.parallel.GraphWalkIteratorProvider
  "GraphWalkIteratorProvider: implementations of this interface provide a set of GraphWalkIterator objects.
 Intended use: parallelization. One GraphWalkIterator per thread."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.graph.iterator.parallel GraphWalkIteratorProvider]))

(defn get-graph-walk-iterators
  "Get a list of GraphWalkIterators. In general: may return less than the specified number of iterators,
  (for example, for small networks) but never more than it

  num-iterators - Number of iterators to return - `int`

  returns: `java.util.List<org.deeplearning4j.graph.iterator.GraphWalkIterator<V>>`"
  (^java.util.List [^GraphWalkIteratorProvider this ^Integer num-iterators]
    (-> this (.getGraphWalkIterators num-iterators))))

