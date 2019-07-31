(ns org.deeplearning4j.clustering.iteration.IterationInfo
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.clustering.iteration IterationInfo]))

(defn ->iteration-info
  "Constructor.

  index - `int`
  cluster-set-info - `org.deeplearning4j.clustering.info.ClusterSetInfo`"
  (^IterationInfo [^Integer index ^org.deeplearning4j.clustering.info.ClusterSetInfo cluster-set-info]
    (new IterationInfo index cluster-set-info))
  (^IterationInfo [^Integer index]
    (new IterationInfo index)))

