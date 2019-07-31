(ns org.deeplearning4j.rl4j.network.dqn.DQNFactory
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.network.dqn DQNFactory]))

(defn build-dqn
  "shape-inputs - `int[]`
  num-outputs - `int`

  returns: `org.deeplearning4j.rl4j.network.dqn.IDQN`"
  (^org.deeplearning4j.rl4j.network.dqn.IDQN [^DQNFactory this shape-inputs ^Integer num-outputs]
    (-> this (.buildDQN shape-inputs num-outputs))))

