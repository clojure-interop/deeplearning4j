(ns org.deeplearning4j.rl4j.network.ac.ActorCriticFactoryCompGraphStdConv
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.network.ac ActorCriticFactoryCompGraphStdConv]))

(defn ->actor-critic-factory-comp-graph-std-conv
  "Constructor."
  (^ActorCriticFactoryCompGraphStdConv []
    (new ActorCriticFactoryCompGraphStdConv )))

(defn build-actor-critic
  "shape-inputs - `int[]`
  num-outputs - `int`

  returns: `org.deeplearning4j.rl4j.network.ac.ActorCriticCompGraph`"
  (^org.deeplearning4j.rl4j.network.ac.ActorCriticCompGraph [^ActorCriticFactoryCompGraphStdConv this shape-inputs ^Integer num-outputs]
    (-> this (.buildActorCritic shape-inputs num-outputs))))

