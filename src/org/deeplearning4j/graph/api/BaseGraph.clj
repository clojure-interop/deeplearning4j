(ns org.deeplearning4j.graph.api.BaseGraph
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.graph.api BaseGraph]))

(defn ->base-graph
  "Constructor."
  (^BaseGraph []
    (new BaseGraph )))

(defn add-edge
  "Description copied from interface: IGraph

  from - `int`
  to - `int`
  value - `E`
  directed - `boolean`"
  ([^BaseGraph this ^Integer from ^Integer to value ^Boolean directed]
    (-> this (.addEdge from to value directed))))

