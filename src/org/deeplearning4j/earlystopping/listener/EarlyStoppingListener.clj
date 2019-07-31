(ns org.deeplearning4j.earlystopping.listener.EarlyStoppingListener
  "EarlyStoppingListener is a listener interface for conducting early stopping training.
 It provides onStart, onEpoch, and onCompletion methods, which are called as appropriate"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.earlystopping.listener EarlyStoppingListener]))

(defn on-start
  "Method to be called when early stopping training is first started

  es-config - `org.deeplearning4j.earlystopping.EarlyStoppingConfiguration`
  net - `T`"
  ([^EarlyStoppingListener this ^org.deeplearning4j.earlystopping.EarlyStoppingConfiguration es-config net]
    (-> this (.onStart es-config net))))

(defn on-epoch
  "Method that is called at the end of each epoch completed during early stopping training

  epoch-num - The number of the epoch just completed (starting at 0) - `int`
  score - The score calculated - `double`
  es-config - Configuration - `org.deeplearning4j.earlystopping.EarlyStoppingConfiguration`
  net - Network (current) - `T`"
  ([^EarlyStoppingListener this ^Integer epoch-num ^Double score ^org.deeplearning4j.earlystopping.EarlyStoppingConfiguration es-config net]
    (-> this (.onEpoch epoch-num score es-config net))))

(defn on-completion
  "Method that is called at the end of early stopping training

  es-result - The early stopping result. Provides details of why early stopping training was terminated, etc - `org.deeplearning4j.earlystopping.EarlyStoppingResult`"
  ([^EarlyStoppingListener this ^org.deeplearning4j.earlystopping.EarlyStoppingResult es-result]
    (-> this (.onCompletion es-result))))

