(ns org.deeplearning4j.parallelism.trainer.CommunicativeTrainer
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.parallelism.trainer CommunicativeTrainer]))

(defn enqueue-gradient
  "gradient - `org.deeplearning4j.optimize.listeners.SharedGradient`"
  ([^CommunicativeTrainer this ^org.deeplearning4j.optimize.listeners.SharedGradient gradient]
    (-> this (.enqueueGradient gradient))))

