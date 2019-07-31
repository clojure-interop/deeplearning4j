(ns org.deeplearning4j.parallelism.parameterserver.ParameterServerTrainer
  "Using an ParameterServerClient
 we maintain updates for training a neural net.
 Training happens relative to the mode of the remote ParameterServerNode"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.parallelism.parameterserver ParameterServerTrainer]))

(defn ->parameter-server-trainer
  "Constructor."
  (^ParameterServerTrainer []
    (new ParameterServerTrainer )))

(defn feed-multi-data-set
  "Description copied from interface: Trainer

  data-set - the data set to train on - `org.nd4j.linalg.dataset.api.MultiDataSet`
  time - `long`"
  ([^ParameterServerTrainer this ^org.nd4j.linalg.dataset.api.MultiDataSet data-set ^Long time]
    (-> this (.feedMultiDataSet data-set time))))

(defn feed-data-set
  "Description copied from interface: Trainer

  data-set - the data set to train on - `org.nd4j.linalg.dataset.api.DataSet`
  time - `long`"
  ([^ParameterServerTrainer this ^org.nd4j.linalg.dataset.api.DataSet data-set ^Long time]
    (-> this (.feedDataSet data-set time))))

(defn get-model
  "Description copied from interface: Trainer

  returns: the current Model
  for the worker - `org.deeplearning4j.nn.api.Model`"
  (^org.deeplearning4j.nn.api.Model [^ParameterServerTrainer this]
    (-> this (.getModel))))

(defn update-model
  "Description copied from interface: Trainer

  model - the new model for this worker - `org.deeplearning4j.nn.api.Model`"
  ([^ParameterServerTrainer this ^org.deeplearning4j.nn.api.Model model]
    (-> this (.updateModel model))))

