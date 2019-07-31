(ns org.deeplearning4j.nn.graph.util.GraphIndices
  "Simple helper class for ComputationGraph topological sort and vertex index/name  name/index mapping"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.graph.util GraphIndices]))

(defn ->graph-indices
  "Constructor."
  (^GraphIndices []
    (new GraphIndices )))

