(ns org.deeplearning4j.rl4j.network.ac.ActorCriticFactorySeparateStdDense
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.network.ac ActorCriticFactorySeparateStdDense]))

(defn ->actor-critic-factory-separate-std-dense
  "Constructor."
  (^ActorCriticFactorySeparateStdDense []
    (new ActorCriticFactorySeparateStdDense )))

(defn build-actor-critic
  "num-inputs - `int[]`
  num-outputs - `int`

  returns: `org.deeplearning4j.rl4j.network.ac.ActorCriticSeparate`"
  (^org.deeplearning4j.rl4j.network.ac.ActorCriticSeparate [^ActorCriticFactorySeparateStdDense this num-inputs ^Integer num-outputs]
    (-> this (.buildActorCritic num-inputs num-outputs))))

