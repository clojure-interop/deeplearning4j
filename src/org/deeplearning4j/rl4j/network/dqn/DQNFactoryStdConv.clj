(ns org.deeplearning4j.rl4j.network.dqn.DQNFactoryStdConv
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.network.dqn DQNFactoryStdConv]))

(defn ->dqn-factory-std-conv
  "Constructor."
  (^DQNFactoryStdConv []
    (new DQNFactoryStdConv )))

(defn build-dqn
  "shape-inputs - `int[]`
  num-outputs - `int`

  returns: `org.deeplearning4j.rl4j.network.dqn.DQN`"
  (^org.deeplearning4j.rl4j.network.dqn.DQN [^DQNFactoryStdConv this shape-inputs ^Integer num-outputs]
    (-> this (.buildDQN shape-inputs num-outputs))))

