(ns org.deeplearning4j.earlystopping.trainer.IEarlyStoppingTrainer
  "Interface for early stopping trainers"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.earlystopping.trainer IEarlyStoppingTrainer]))

(defn fit
  "Conduct early stopping training

  returns: `org.deeplearning4j.earlystopping.EarlyStoppingResult<T>`"
  (^org.deeplearning4j.earlystopping.EarlyStoppingResult [^IEarlyStoppingTrainer this]
    (-> this (.fit))))

(defn set-listener
  "Set the early stopping listener

  listener - `org.deeplearning4j.earlystopping.listener.EarlyStoppingListener`"
  ([^IEarlyStoppingTrainer this ^org.deeplearning4j.earlystopping.listener.EarlyStoppingListener listener]
    (-> this (.setListener listener))))

