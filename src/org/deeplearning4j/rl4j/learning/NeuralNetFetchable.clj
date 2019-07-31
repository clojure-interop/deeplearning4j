(ns org.deeplearning4j.rl4j.learning.NeuralNetFetchable
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.learning NeuralNetFetchable]))

(defn get-neural-net
  "returns: `NN`"
  ([^NeuralNetFetchable this]
    (-> this (.getNeuralNet))))

