(ns org.deeplearning4j.rl4j.network.ac.ActorCriticFactorySeparate
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.network.ac ActorCriticFactorySeparate]))

(defn build-actor-critic
  "shape-inputs - `int[]`
  num-outputs - `int`

  returns: `org.deeplearning4j.rl4j.network.ac.IActorCritic`"
  (^org.deeplearning4j.rl4j.network.ac.IActorCritic [^ActorCriticFactorySeparate this shape-inputs ^Integer num-outputs]
    (-> this (.buildActorCritic shape-inputs num-outputs))))

