(ns org.deeplearning4j.rl4j.network.dqn.DQNFactoryStdDense
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.network.dqn DQNFactoryStdDense]))

(defn ->dqn-factory-std-dense
  "Constructor."
  (^DQNFactoryStdDense []
    (new DQNFactoryStdDense )))

(defn build-dqn
  "num-inputs - `int[]`
  num-outputs - `int`

  returns: `org.deeplearning4j.rl4j.network.dqn.DQN`"
  (^org.deeplearning4j.rl4j.network.dqn.DQN [^DQNFactoryStdDense this num-inputs ^Integer num-outputs]
    (-> this (.buildDQN num-inputs num-outputs))))

