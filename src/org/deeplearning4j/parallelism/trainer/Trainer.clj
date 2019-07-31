(ns org.deeplearning4j.parallelism.trainer.Trainer
  "A Trainer is an individual worker used in ParallelWrapper
 for handling training in multi core situations."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.parallelism.trainer Trainer]))

(defn feed-data-set
  "Train on a DataSet

  data-set - the data set to train on - `org.nd4j.linalg.dataset.api.DataSet`
  etl-time - `long`"
  ([^Trainer this ^org.nd4j.linalg.dataset.api.DataSet data-set ^Long etl-time]
    (-> this (.feedDataSet data-set etl-time))))

(defn feed-multi-data-set
  "Train on a MultiDataSet

  data-set - the data set to train on - `org.nd4j.linalg.dataset.api.MultiDataSet`
  etl-time - `long`"
  ([^Trainer this ^org.nd4j.linalg.dataset.api.MultiDataSet data-set ^Long etl-time]
    (-> this (.feedMultiDataSet data-set etl-time))))

(defn shutdown
  "Shutdown this worker"
  ([^Trainer this]
    (-> this (.shutdown))))

(defn start
  "Start this trainer"
  ([^Trainer this]
    (-> this (.start))))

(defn wait-till-running
  "Block the main thread
  till the trainer is up and running."
  ([^Trainer this]
    (-> this (.waitTillRunning))))

(defn get-uuid
  "returns: `java.lang.String`"
  (^java.lang.String [^Trainer this]
    (-> this (.getUuid))))

(defn running?
  "returns: `boolean`"
  (^Boolean [^Trainer this]
    (-> this (.isRunning))))

(defn update-model
  "Update the current Model
  for the worker

  model - the new model for this worker - `org.deeplearning4j.nn.api.Model`"
  ([^Trainer this ^org.deeplearning4j.nn.api.Model model]
    (-> this (.updateModel model))))

(defn get-model
  "THe current model for the trainer

  returns: the current Model
  for the worker - `org.deeplearning4j.nn.api.Model`"
  (^org.deeplearning4j.nn.api.Model [^Trainer this]
    (-> this (.getModel))))

(defn set-uncaught-exception-handler
  "Set the Thread.UncaughtExceptionHandler
  for this Trainer

  handler - the handler for uncaught errors - `java.lang.Thread.UncaughtExceptionHandler`"
  ([^Trainer this ^java.lang.Thread.UncaughtExceptionHandler handler]
    (-> this (.setUncaughtExceptionHandler handler))))

(defn averaging-required
  "This method returns TRUE if this Trainer implementation assumes periodic aver

  returns: `boolean`"
  (^Boolean [^Trainer this]
    (-> this (.averagingRequired))))

