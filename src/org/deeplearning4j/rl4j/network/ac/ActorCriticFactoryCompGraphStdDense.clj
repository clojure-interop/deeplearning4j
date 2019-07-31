(ns org.deeplearning4j.rl4j.network.ac.ActorCriticFactoryCompGraphStdDense
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.network.ac ActorCriticFactoryCompGraphStdDense]))

(defn ->actor-critic-factory-comp-graph-std-dense
  "Constructor."
  (^ActorCriticFactoryCompGraphStdDense []
    (new ActorCriticFactoryCompGraphStdDense )))

(defn build-actor-critic
  "num-inputs - `int[]`
  num-outputs - `int`

  returns: `org.deeplearning4j.rl4j.network.ac.ActorCriticCompGraph`"
  (^org.deeplearning4j.rl4j.network.ac.ActorCriticCompGraph [^ActorCriticFactoryCompGraphStdDense this num-inputs ^Integer num-outputs]
    (-> this (.buildActorCritic num-inputs num-outputs))))

