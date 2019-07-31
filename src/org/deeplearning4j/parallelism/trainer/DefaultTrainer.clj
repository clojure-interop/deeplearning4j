(ns org.deeplearning4j.parallelism.trainer.DefaultTrainer
  "Trains datasets using a standard in memory
 parameter averaging technique.
 Think of this worker as the simplest form of doing parameter averaging"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.parallelism.trainer DefaultTrainer]))

(defn ->default-trainer
  "Constructor."
  (^DefaultTrainer []
    (new DefaultTrainer )))

(defn feed-data-set
  "Description copied from interface: Trainer

  data-set - the data set to train on - `org.nd4j.linalg.dataset.api.DataSet`
  etl-time - `long`"
  ([^DefaultTrainer this ^org.nd4j.linalg.dataset.api.DataSet data-set ^Long etl-time]
    (-> this (.feedDataSet data-set etl-time))))

(defn feed-multi-data-set
  "Description copied from interface: Trainer

  data-set - the data set to train on - `org.nd4j.linalg.dataset.api.MultiDataSet`
  etl-time - `long`"
  ([^DefaultTrainer this ^org.nd4j.linalg.dataset.api.MultiDataSet data-set ^Long etl-time]
    (-> this (.feedMultiDataSet data-set etl-time))))

(defn run
  ""
  ([^DefaultTrainer this]
    (-> this (.run))))

(defn shutdown
  "Description copied from interface: Trainer"
  ([^DefaultTrainer this]
    (-> this (.shutdown))))

(defn wait-till-running
  "Description copied from interface: Trainer"
  ([^DefaultTrainer this]
    (-> this (.waitTillRunning))))

(defn running?
  "returns: `boolean`"
  (^Boolean [^DefaultTrainer this]
    (-> this (.isRunning))))

(defn update-model
  "Description copied from interface: Trainer

  model - the new model for this worker - `org.deeplearning4j.nn.api.Model`"
  ([^DefaultTrainer this ^org.deeplearning4j.nn.api.Model model]
    (-> this (.updateModel model))))

(defn get-model
  "Description copied from interface: Trainer

  returns: the current Model
  for the worker - `org.deeplearning4j.nn.api.Model`"
  (^org.deeplearning4j.nn.api.Model [^DefaultTrainer this]
    (-> this (.getModel))))

(defn averaging-required
  "Description copied from interface: Trainer

  returns: `boolean`"
  (^Boolean [^DefaultTrainer this]
    (-> this (.averagingRequired))))

