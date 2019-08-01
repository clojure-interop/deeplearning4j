(ns org.deeplearning4j.optimize.Solver
  "Generic purpose solver"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.optimize Solver]))

(defn ->solver
  "Constructor."
  (^Solver []
    (new Solver )))

(defn optimize
  "workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`"
  ([^Solver this ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.optimize workspace-mgr))))

(defn init-optimizer
  ""
  ([^Solver this]
    (-> this (.initOptimizer))))

(defn get-optimizer
  "returns: `org.deeplearning4j.optimize.api.ConvexOptimizer`"
  (^org.deeplearning4j.optimize.api.ConvexOptimizer [^Solver this]
    (-> this (.getOptimizer))))

(defn set-listeners
  "listeners - `java.util.Collection`"
  ([^Solver this ^java.util.Collection listeners]
    (-> this (.setListeners listeners))))

