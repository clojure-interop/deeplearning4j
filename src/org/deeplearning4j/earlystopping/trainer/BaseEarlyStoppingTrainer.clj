(ns org.deeplearning4j.earlystopping.trainer.BaseEarlyStoppingTrainer
  "Base/abstract class for conducting early stopping training locally (single machine).
 Can be used to train a MultiLayerNetwork or a ComputationGraph via early stopping"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.earlystopping.trainer BaseEarlyStoppingTrainer]))

(defn fit
  "Description copied from interface: IEarlyStoppingTrainer

  returns: `org.deeplearning4j.earlystopping.EarlyStoppingResult<T>`"
  (^org.deeplearning4j.earlystopping.EarlyStoppingResult [^BaseEarlyStoppingTrainer this]
    (-> this (.fit))))

(defn set-listener
  "Description copied from interface: IEarlyStoppingTrainer

  listener - `org.deeplearning4j.earlystopping.listener.EarlyStoppingListener`"
  ([^BaseEarlyStoppingTrainer this ^org.deeplearning4j.earlystopping.listener.EarlyStoppingListener listener]
    (-> this (.setListener listener))))

