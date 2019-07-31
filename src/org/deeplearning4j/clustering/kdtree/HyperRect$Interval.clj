(ns org.deeplearning4j.clustering.kdtree.HyperRect$Interval
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.clustering.kdtree HyperRect$Interval]))

(defn ->interval
  "Constructor.

  lower - `double`
  higher - `double`"
  (^HyperRect$Interval [^Double lower ^Double higher]
    (new HyperRect$Interval lower higher)))

(defn contains
  "point - `double`

  returns: `boolean`"
  (^Boolean [^HyperRect$Interval this ^Double point]
    (-> this (.contains point))))

(defn enlarge
  "p - `double`"
  ([^HyperRect$Interval this ^Double p]
    (-> this (.enlarge p))))

